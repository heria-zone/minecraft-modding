package net.msymbios.example.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class JumpyBlock extends Block {

    // -- Constructor --
    public JumpyBlock(Settings settings) {
        super(settings);
    } // Constructor JumpyBlock

    // -- Methods --
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        // server: check for main hand & offhand
        // client: check for main hand && offhand

        if(!world.isClient && hand == Hand.MAIN_HAND)
            player.sendMessage(Text.literal("Right Clicked This!"));

        return super.onUse(state, world, pos, player, hand, hit);
    } // onUse ()

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity){
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200));
        }

        super.onSteppedOn(world, pos, state, entity);
    } // onSteppedOn ()

} // Class JumpyBlock