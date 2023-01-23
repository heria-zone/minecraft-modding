package net.msymbios.example.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EightBallItem extends Item {

    // -- Constructor --
    public EightBallItem(Settings settings) {
        super(settings);
    } // Constructor EightBallItem

    // -- Methods --
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient && hand == Hand.MAIN_HAND) {
            outputRandomNumber(user); // output a random number
            user.getItemCooldownManager().set(this, 20); // add a cool down
        }
        return super.use(world, user, hand);
    } // use ()

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Right Click!").formatted(Formatting.AQUA));
            tooltip.add(Text.literal("Get Random Number!").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("Press Shift for more Info!").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    } // appendTooltip ()

    private void outputRandomNumber(PlayerEntity player) {
        player.sendMessage(Text.literal("Your Number is " + getRandomNumber()));
    } // outputRandomNumber ()

    private int getRandomNumber() {
        return Random.createLocal().nextInt(10);
    } // getRandomNumber ()

} // Class EightBallItem