package net.msymbios.example.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TorchBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TanzaniteLampBlock extends Block {

    // -- Variables --
    public static final BooleanProperty LIT = Properties.LIT;

    // -- Constructor --
    public TanzaniteLampBlock(Settings settings) {
        super(settings);
    } // Constructor TanzaniteLampBlock

    // -- Methods --
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient() && hand == Hand.MAIN_HAND)
            world.setBlockState(pos, state.cycle(LIT));

        return super.onUse(state, world, pos, player, hand, hit);
    } // onUse ()

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
    } // appendProperties ()

} // Class TanzaniteLampBlock