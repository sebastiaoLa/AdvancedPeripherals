/*
 *     Copyright 2024 Intelligence Modding @ https://intelligence-modding.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.srendi.advancedperipherals.common.addons.computercraft.turtles;

import dan200.computercraft.api.turtle.ITurtleAccess;
import dan200.computercraft.api.turtle.TurtleSide;
import de.srendi.advancedperipherals.AdvancedPeripherals;
import de.srendi.advancedperipherals.common.addons.computercraft.peripheral.PlayerDetectorPeripheral;
import de.srendi.advancedperipherals.lib.turtle.PeripheralTurtleUpgrade;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TurtlePlayerDetectorUpgrade extends PeripheralTurtleUpgrade<PlayerDetectorPeripheral> {

    public TurtlePlayerDetectorUpgrade(ResourceLocation id, ItemStack stack) {
        super(id, stack);
    }

    @Override
    public ModelResourceLocation getLeftModel() {
        return new ModelResourceLocation(AdvancedPeripherals.getRL("turtle_player_upgrade_left"), "inventory");
    }

    @Override
    public ModelResourceLocation getRightModel() {
        return new ModelResourceLocation(AdvancedPeripherals.getRL("turtle_player_upgrade_right"), "inventory");
    }

    @Override
    protected PlayerDetectorPeripheral buildPeripheral(@NotNull ITurtleAccess turtle, @NotNull TurtleSide side) {
        return new PlayerDetectorPeripheral(turtle, side);
    }
}
