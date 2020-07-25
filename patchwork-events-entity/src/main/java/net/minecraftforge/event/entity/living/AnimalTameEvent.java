/*
 * Minecraft Forge, Patchwork Project
 * Copyright (c) 2016-2020, 2019-2020
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.event.entity.living;

import net.minecraftforge.common.MinecraftForge;

import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;

/**
 * This event is fired when an {@link AnimalEntity} is tamed.
 *
 * <p>It is fired via ForgeEventFactory#onAnimalTame(AnimalEntity, PlayerEntity).
 * Forge fires this event for applicable vanilla animals, mods need to fire it themselves.
 * This event is cancellable. If canceled, taming the animal will fail.
 * This event is fired on the {@link MinecraftForge#EVENT_BUS}.
 */

public class AnimalTameEvent extends LivingEvent {
	private final AnimalEntity animal;
	private final PlayerEntity tamer;

	public AnimalTameEvent(AnimalEntity animal, PlayerEntity tamer) {
		super(animal);
		this.animal = animal;
		this.tamer = tamer;
	}

	public AnimalEntity getAnimal() {
		return animal;
	}

	public PlayerEntity getTamer() {
		return tamer;
	}
}
