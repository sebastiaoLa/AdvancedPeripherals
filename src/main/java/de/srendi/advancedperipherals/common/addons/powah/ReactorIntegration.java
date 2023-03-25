package de.srendi.advancedperipherals.common.addons.powah;

import dan200.computercraft.api.lua.LuaFunction;
import de.srendi.advancedperipherals.lib.peripherals.BlockEntityIntegrationPeripheral;
import net.minecraft.world.level.block.entity.BlockEntity;
import owmii.powah.block.reactor.ReactorPartTile;

public class ReactorIntegration extends BlockEntityIntegrationPeripheral<ReactorPartTile> {
    protected ReactorIntegration(BlockEntity entity) {
        super(entity);
    }

    @Override
    public String getType() {
        return "uraniniteReactor";
    }

    @LuaFunction(mainThread = true)
    public final String getName() {
        return "Uraninite Reactor";
    }

    @LuaFunction(mainThread = true)
    public final boolean isRunning() {
        return blockEntity.core().get().isRunning();
    }

    @LuaFunction(mainThread = true)
    public final double getFuel() {
        return blockEntity.core().get().fuel.perCent();
    }

    @LuaFunction(mainThread = true)
    public final double getCarbon() {
        return blockEntity.core().get().carbon.perCent();
    }

    @LuaFunction(mainThread = true)
    public final double getRedstone() {
        return blockEntity.core().get().redstone.perCent();
    }

    @LuaFunction(mainThread = true)
    public final double getEnergy() {
        return blockEntity.core().get().getEnergy().getEnergyStored();
    }

    @LuaFunction(mainThread = true)
    public final double getMaxEnergy() {
        return blockEntity.core().get().getEnergy().getMaxEnergyStored();
    }

    @LuaFunction(mainThread = true)
    public final double getTemperature() {
        return blockEntity.core().get().temp.perCent();
    }
}
