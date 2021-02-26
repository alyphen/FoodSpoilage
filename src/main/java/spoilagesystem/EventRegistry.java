package spoilagesystem;

import org.bukkit.plugin.PluginManager;
import spoilagesystem.EventHandlers.*;

public class EventRegistry {

    private static EventRegistry instance;

    private EventRegistry() {

    }

    public static EventRegistry getInstance() {
        if (instance == null) {
            instance = new EventRegistry();
        }
        return instance;
    }

    public void registerEvents() {

        FoodSpoilage mainInstance = FoodSpoilage.getInstance();
        PluginManager manager = mainInstance.getServer().getPluginManager();

        try {
            manager.registerEvents(new CraftItemEventHandler(), mainInstance);
        } catch(Exception e) {
            System.out.println("CraftItemEventHandler was not able to be registered.");
        }

        try {
            manager.registerEvents(new InventoryDragEventHandler(), mainInstance);
        } catch(Exception e) {
            System.out.println("InventoryDragEventHandler was not able to be registered.");
        }

        try {
            manager.registerEvents(new PlayerInteractEventHandler(), mainInstance);
        } catch(Exception e) {
            System.out.println("PlayerInteractEventHandler was not able to be registered.");
        }

        try {
            manager.registerEvents(new ItemSpawnEventHandler(), mainInstance);
        } catch(Exception e) {
            System.out.println("ItemSpawnEventHandler was not able to be registered.");
        }

        try {
            manager.registerEvents(new FurnaceSmeltEventHandler(), mainInstance);
        } catch(Exception e) {
            System.out.println("FurnaceSmeltEventHandler was not able to be registered.");
        }

        try {
            manager.registerEvents(new BlockCookEventHandler(), mainInstance);
        } catch(Exception e) {
            System.out.println("BlockCookEventHandler was not able to be registered.");
        }





    }

}
