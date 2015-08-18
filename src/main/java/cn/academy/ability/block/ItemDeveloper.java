/**
 * Copyright (c) Lambda Innovation, 2013-2015
 * 本作品版权由Lambda Innovation所有。
 * http://www.li-dev.cn/
 *
 * This project is open-source, and it is distributed under
 * the terms of GNU General Public License. You can modify
 * and distribute freely as long as you follow the license.
 * 本项目是一个开源项目，且遵循GNU通用公共授权协议。
 * 在遵照该协议的情况下，您可以自由传播和修改。
 * http://www.gnu.org/licenses/gpl.html
 */
package cn.academy.ability.block;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cn.academy.ability.client.skilltree.GuiSkillTreeDev;
import cn.academy.ability.developer.DeveloperPortable;
import cn.academy.ability.developer.DeveloperType;
import cn.academy.core.item.ACItem;
import cn.academy.energy.IFConstants;
import cn.academy.energy.api.item.ImagEnergyItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author WeAthFolD
 */
public class ItemDeveloper extends ACItem implements ImagEnergyItem {
	
	public final DeveloperType type = DeveloperType.PORTABLE;

	public ItemDeveloper() {
		super("developer_portable");
		setMaxDamage(13);
		setMaxStackSize(1);
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(player.worldObj.isRemote) {
			displayGui(player);
		}
		
        return stack;
    }
	
	@SideOnly(Side.CLIENT)
	private void displayGui(EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiSkillTreeDev(player, new DeveloperPortable(player)));
	}

	@Override
	public double getMaxEnergy() {
		return type.getEnergy();
	}

	@Override
	public double getBandwidth() {
		return IFConstants.LATENCY_MK1;
	}

}