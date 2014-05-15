package net.shadowmage.ancientwarfare.automation.container;

import net.minecraft.entity.player.EntityPlayer;
import net.shadowmage.ancientwarfare.automation.tile.TileWorksiteBase;
import net.shadowmage.ancientwarfare.core.container.ContainerBase;

public class ContainerWorksiteBase extends ContainerBase
{

public final TileWorksiteBase worksite;

public ContainerWorksiteBase(EntityPlayer player, int x, int y, int z)
  {
  super(player, x, y, z);
  worksite = (TileWorksiteBase)player.worldObj.getTileEntity(x, y, z);
  }


}
