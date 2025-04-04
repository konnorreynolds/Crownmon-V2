/*
 * Copyright (C) 2023 Cobblemon Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.cobblemon.mod.common.pokemon.evolution.requirements

import com.cobblemon.mod.common.api.moves.MoveTemplate
import com.cobblemon.mod.common.api.moves.Moves
import com.cobblemon.mod.common.api.pokemon.evolution.requirement.EvolutionRequirement
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity
import com.cobblemon.mod.common.pokemon.Pokemon
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.phys.AABB
import net.minecraft.world.phys.Vec3

/**
 * An [EvolutionRequirement] for [Pokemon.shiny] or not.
 *
 * Whenever an entity can't be resolved [EvolutionRequirement.check] will never succeed.
 *
 * @property isShiny should be shiny [Boolean].
 * @author RetroBuzz
 * @since April 4th, 2025
 */
class ShinyRequirement : EvolutionRequirement {
    val isShiny: Boolean = true
    val minLevel = 1
    val maxLevel = Int.MAX_VALUE
    override fun check(pokemon: Pokemon) = pokemon.shiny == isShiny && pokemon.level in minLevel..maxLevel

    companion object {
        const val ADAPTER_VARIANT = "shiny"
    }
}