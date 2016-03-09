package cn.academy.ability.api.event;

import cn.academy.ability.api.Skill;
import cpw.mods.fml.common.eventhandler.Cancelable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

/**
 * If this event is canceled, a reflection to this attack event happens.
 */
@Cancelable
public class ReflectEvent extends AbilityEvent {

    public final Skill skill;
    public final Entity target;

    public ReflectEvent(EntityPlayer player,
                        Skill        _skill,
                        Entity       _target) {
        super(player);

        skill = _skill;
        target = _target;
    }

}
