package net.rebix.engine.commands;

import net.rebix.engine.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {


        /*
        ScrollableInventory scrollable_inventory = new ScrollableInventory().create((Player) sender,"test",6*9);
        HashMap<Integer,ItemStack> contents = new HashMap<>();
        int index;
        for(index = 1; index < 63; ++index){
            contents.put(index, new ItemBuilder(Material.STONE).setAmount(index).build());
        }
        scrollable_inventory.setContents(contents);
        scrollable_inventory.reloadInventory();

         */

        FileConfiguration cfg = Main.plugin.getConfig();
        cfg.set("Language", "English");
        Main.plugin.saveDefaultConfig();
        Main.plugin.saveConfig();
        return false;
    }
}