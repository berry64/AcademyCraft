/**
* Copyright (c) Lambda Innovation, 2013-2016
* This file is part of the AcademyCraft mod.
* https://github.com/LambdaInnovation/AcademyCraft
* Licensed under GPLv3, see project root for more information.
*/
package cn.academy.ability.api.event;

import cn.academy.ability.api.Skill;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Fired when a skill's exp is formally added using AbilityData#addSkillExp.
 * @author WeAthFolD
 */
public class SkillExpAddedEvent extends AbilityEvent {
    
    public final Skill skill;
    
    /**
     * The amount INTENTED to be added. is directly the argument passed in.
     */
    public final float amount;

    public SkillExpAddedEvent(EntityPlayer _player, Skill _skill, float _amount) {
        super(_player);
        skill = _skill;
        amount = _amount;
    }

}
