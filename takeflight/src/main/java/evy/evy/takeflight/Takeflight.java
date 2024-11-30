package evy.evy.takeflight;

import evy.evy.takeflight.commands.GiveItemCommand;
import org.bukkit.plugin.java.JavaPlugin;


public final class Takeflight extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("the stick has risen");
        getCommand("flightstick").setExecutor(new GiveItemCommand());

    }

    @Override
    public void onDisable() {
        assert getlogger() != null;
        getlogger().info();
    }

    private Process getlogger() {
        return null;
    }
}
