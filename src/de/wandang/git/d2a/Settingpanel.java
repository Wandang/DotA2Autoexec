package de.wandang.git.d2a;

import javax.swing.JTabbedPane;

/*

 TODO

 Noch hab ich nicht alle commands auf default werte gecheckt.

 Hier hab ich mal die ersten 3 Bereiche mit nen paar standartsettings rausgesucht.
 da ich im moment net zuhaue am desktop bin kann ich meine autoexec nicht lesen um zu schauen was ich noch nutze.

 //Important so you only need "-console" as a startparameter once. After that DotA won't 
 //start with an open console but the console is still reachable via shortcut.
 con_enable 1

 //Utility
 dota_force_right_click_attack "1"
 dota_disable_range_finder "0"
 dota_camera_accelerate "49"
 dota_minimap_misclick_time "0"


 //Visual
 dota_minimap_hero_size "800"
 dota_minimap_tower_defend_distance "250"
 dota_unit_fly_bonus_height "150" // with 0 flying units will fly on the ground like normal units do
 dota_killcam_show "1" // Enables information windows upon death (default 0)



 //Netsettings 
 fps_max 150
 cl_cmdrate 30
 cl_interp 0.01
 cl_interp_ratio 2
 cl_lagcompensation 1
 cl_pred_optimize 2
 cl_smooth 0
 cl_smoothtime 0.01
 cl_updaterate 20
 rate 80000


 //Hier kommt noch extra quatsch für später. Da kann man evtl auch noch aussortieren. Was mir zum Beispiel direkt dazu einfallen würde ist eine art expertenmodus. Normale Leute müssen nicht einstellen wie viel transparenz die hp Balken haben.

 dota_health_per_vertical_marker "250" // Health segmenting in the lifebar (default 250)
 dota_health_marker_major_alpha "255" // Opacity major healthbar divider (default 255, 0=invisible 255=opaque)
 dota_health_marker_minor_alpha "128" // Opacity minor healthbar divider (default 128, 0=invisible 255=opaque)
 dota_hud_healthbar_number "1" // Health number above the lifebar on (default 1)
 dota_screen_shake "1" // Screen shake on certain spell effects (default 1)
 dota_force_right_click_attack "0" // Rightclick deny disabled (default 0)
 dota_disable_range_finder "0" // Visual spell range indicator activated (default 1)
 dota_minimap_hero_size "800" // Slightly bigger hero icons on minimap (default 600)
 dota_minimap_misclick_time "0.4" // Threshold delay to accept minimap clicks (default 0.2)
 dota_camera_accelerate "10" // Decelerating map scroll (50 = insta stop, 1 = smooth slowdown, vanilla DotA would be 50)
 dota_player_multipler_orders "1" // Control all units with CTRL click (default 0)
 dota_player_units_auto_attack "0" // Hero autoattack disabled (default 1)
 dota_camera_speed "3682" // Scrolling speed (vanilla DotA-like is 6500, default 3000)
 dota_camera_disable_zoom "1" // Disables mousewheel zoom (default 1)
 dota_unit_fly_bonus_height "10" // Flying height of air units (Default 150)
 dota_reset_camera_on_spawn "1" // Center screen on hero after respawn (Default 1)
 dota_always_show_player_names "1" // Always show player names
 dota_ability_quick_cast "1" // Doubletapping to selfcast
 dota_unit_multiple_selection "1" // ???
 //Fade time on visual effects on doing or receiving damage reduced to half duration
 dota_health_hurt_decay_time_max "0.4" // (Default 0.8)
 dota_health_hurt_decay_time_min "0.15" // (Default 0.3)
 dota_health_hurt_delay "0.05" // (Default 0.1)
 dota_pain_decay "0.4" // (Default 0.8)
 dota_pain_factor "1.5" // (Default 3)
 dota_pain_fade_rate "1.5" // (Default 3)
 dota_pain_multiplier "0.4" // (Default 0.8)
 volume "0.05" // Volume adjusted for teamspeak
 snd_musicvolume "0" // Ingame music volume (Min "0" Max "1.0")
 fps_max "60" // Max FPS for client to render (Default 120)
 mat_vsync "1" // VSYNC on/off (0 Disables, 1 Enables)
 mat_triplebuffered "1" // Enable with vsync if fps is less than 60 (0 Disables, 1 Enables)
 engine_no_focus_sleep "0" // Run Dota 2 at full fps when tabbed out (Default 1)

 // Fitting Netgraph in the topbar for 1680x1050, 1920x1200 and 1920x1080. Play around with net_graphinsetbottom and net_graphinsetright to adjust it for other resolutions
 net_graphinsetbottom "436" // Position from bottom edge. Put "55" for 1280x800 (Default 0)
 net_graphinsetright "-68" // Position from right edge. Put "-100" for 1280x800 (Default 0)
 net_graphproportionalfont "0" // Makes net_graph text smaller (Default 1)
 net_graph "1" // Enables the Net_Graph (Default 0)

 ///////////////
 /// NETCODE /// You should adjust cl_interp to your average ping to reach a stable and white-letter "lerp" value in the net_graph which is similar to your ping or about 10-20ms higher. An orange/red/yellowish colored or blinking lerp value means it is not correctly set up.
 ///////////////
 cl_interp "0.033" // Set this to your average ping divided by 1000. Ping 80 would be cl_interp 0.08 (Default 0.055, Min 0.033)
 cl_interp_ratio "2" // Multiplies final result of cl_interp (Default 2)
 cl_smoothtime "0.01" // When errors occur smooth display over X time, 0 Disables (Default 0.1)
 rate "80000" // Total amount of bandwidth Dota 2 may use (Default 80000)
 cl_updaterate "40" // Amount of updates recieved from server per second (Default 40)
 cl_cmdrate "40" // Amount of updates sent to server per second (Default 40)


 //////////////
 /// SCRIPT /// Do not edit these unless you know what you are doing. Respective bindings are in the config_keybindings.cfg
 //////////////
 // Courier picks up whole stash and brings it to you with speedup before returning to base
 alias "quick_courier" "dota_select_courier; dota_ability_execute 3; dota_ability_execute 4; +dota_camera_follow; say_team Courier is coming to me! Please wait."
 // Net_Graph Toggle Script
 alias "showgraph" "showgraph_off"
 alias "showgraph_on" "net_graph 1; alias showgraph showgraph_off"
 alias "showgraph_off" "net_graph 0; alias showgraph showgraph_on"
 // Shows scoreboard and APM in the console
 alias "+showboard" "+showscores;dota_apm"
 alias "-showboard" "-showscores;"
 // Shows 1025 rangeunits, the proximity range to be revealed while smoked, 1300 = lvl4 pudge hook range, 700 = tower range, 1150 = dagger range
 alias "+range" "dota_range_display 1025"
 alias "-range" "dota_range_display 0"
 // Use the alias "smartcast" after any item command to make it trigger instantly. For example: bind "mouse5" "dota_item_execute 0;smartcast;"
 alias "smartcast" "+sixense_left_click;-sixense_left_click;"
 /////////////////////////
 exec config_keybindings.cfg // Remove this line if you don't want to use the separate keybindings, but remember that you need custom keybindings to use the scripts (such as courier script, smartcast, etc.)
 echo "KSL Config Loaded."
 say_team "[config loaded]"
 /////////////////////////

 */

/**
 * 
 * @author Sinthowinto
 * 
 */
public class Settingpanel extends JTabbedPane {

	/**
	 * default UID
	 */
	private static final long serialVersionUID = 1L;

	// change to right stuff
	final static String Panel1 = "Tab1";
	final static String Panel2 = "Tab2";
	final static String Panel3 = "Tab3";

	public Settingpanel() {
		// pics
	//	Icon test = new ImageIcon("~/Pictures/test.jpg");


		// Create the "tabs".
		this.addTab(Panel1, new Tab1());
		this.addTab(Panel2, new Tab2());
		this.addTab(Panel3, new Tab3());

	}

}
