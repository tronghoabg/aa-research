package defpackage;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.util.Log;

/* loaded from: classes2.dex */
public final class hrp {
    private static volatile boolean a = false;
    private static boolean b = false;

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 37) {
            return true;
        }
        if (!a) {
            b();
        }
        return b;
    }

    private static final void b() {
        if (Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            AconfigPackage aconfigPackageLoad = AconfigPackage.load("com.android.wifi.flags");
            aconfigPackageLoad.getBooleanFlagValue("allow_override_max_ndp_session", false);
            aconfigPackageLoad.getBooleanFlagValue("android_v_wifi_api", false);
            aconfigPackageLoad.getBooleanFlagValue("ap_isolate", false);
            aconfigPackageLoad.getBooleanFlagValue("autojoin_restriction_security_types_api", false);
            aconfigPackageLoad.getBooleanFlagValue("aware_auto_pairing", false);
            aconfigPackageLoad.getBooleanFlagValue("aware_ingress_egress_distance", false);
            aconfigPackageLoad.getBooleanFlagValue("aware_pairing", false);
            aconfigPackageLoad.getBooleanFlagValue("aware_periodic_ranging_intervals", false);
            aconfigPackageLoad.getBooleanFlagValue("band_optimization_control", false);
            aconfigPackageLoad.getBooleanFlagValue("bssid_blocklist_for_suggestion", false);
            aconfigPackageLoad.getBooleanFlagValue("deprecate_action_link_configuration_changed", false);
            aconfigPackageLoad.getBooleanFlagValue("disallow_suggested_network_as_package", false);
            aconfigPackageLoad.getBooleanFlagValue("external_approver_support_for_wfdr2_password_based_bootstrapping", false);
            aconfigPackageLoad.getBooleanFlagValue("feed_internal_score_to_external_scorer", false);
            aconfigPackageLoad.getBooleanFlagValue("feed_more_data_to_external_scorer", false);
            aconfigPackageLoad.getBooleanFlagValue("get_bssid_blocklist_api", false);
            aconfigPackageLoad.getBooleanFlagValue("get_channel_width_api", false);
            aconfigPackageLoad.getBooleanFlagValue("get_config_empty_reason", false);
            aconfigPackageLoad.getBooleanFlagValue("get_supported_interface_names", false);
            aconfigPackageLoad.getBooleanFlagValue("improve_ranging_api", false);
            aconfigPackageLoad.getBooleanFlagValue("last_caller_26q2", false);
            aconfigPackageLoad.getBooleanFlagValue("local_only_connection_optimization", false);
            b = aconfigPackageLoad.getBooleanFlagValue("local_only_disconnect_reason", false);
            aconfigPackageLoad.getBooleanFlagValue("managed_wifi_for_mum", false);
            aconfigPackageLoad.getBooleanFlagValue("mlo_link_speed_api", false);
            aconfigPackageLoad.getBooleanFlagValue("mlo_sap", false);
            aconfigPackageLoad.getBooleanFlagValue("multi_peer_aware_datapath", false);
            aconfigPackageLoad.getBooleanFlagValue("multi_user_wifi_enhancement", false);
            aconfigPackageLoad.getBooleanFlagValue("p2p_gc_network_agent", false);
            aconfigPackageLoad.getBooleanFlagValue("proximity_ranging", false);
            aconfigPackageLoad.getBooleanFlagValue("public_bands_for_lohs", false);
            aconfigPackageLoad.getBooleanFlagValue("public_ssid_bssid_passphrase_for_do_carrier_tethering", false);
            aconfigPackageLoad.getBooleanFlagValue("refresh_mac_randomization_api", false);
            aconfigPackageLoad.getBooleanFlagValue("restrict_autojoin_callback_api", false);
            aconfigPackageLoad.getBooleanFlagValue("rtt_busy_try_later_api", false);
            aconfigPackageLoad.getBooleanFlagValue("scan_mac_randomization_setting", false);
            aconfigPackageLoad.getBooleanFlagValue("secure_ranging", false);
            aconfigPackageLoad.getBooleanFlagValue("send_service_specific_info_in_bootstrapping_request", false);
            aconfigPackageLoad.getBooleanFlagValue("set_pairing_discovery_channel_frequency", false);
            aconfigPackageLoad.getBooleanFlagValue("softap_disconnect_reason", false);
            aconfigPackageLoad.getBooleanFlagValue("softap_traffic_monitor", false);
            aconfigPackageLoad.getBooleanFlagValue("un_deprecated_wificonfiguration", false);
            aconfigPackageLoad.getBooleanFlagValue("wifi_direct_r2", false);
            aconfigPackageLoad.getBooleanFlagValue("wifi_p2p_connection_info", false);
            aconfigPackageLoad.getBooleanFlagValue("wifi_pno_scan_schedule_api", false);
            aconfigPackageLoad.getBooleanFlagValue("wifi_state_changed_listener", false);
            aconfigPackageLoad.getBooleanFlagValue("wificond_replacement_apis", false);
        } catch (Exception e) {
            Log.e("ExportedFlags", e.toString());
        } catch (LinkageError e2) {
            Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
