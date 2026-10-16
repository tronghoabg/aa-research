package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static volatile boolean a = false;
    public static boolean b = false;

    public static final void a() {
        if (android.os.Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            android.os.flagging.AconfigPackage aconfigPackageLoad = android.os.flagging.AconfigPackage.load("android.app.admin.flags");
            aconfigPackageLoad.getBooleanFlagValue("allow_querying_profile_type", false);
            aconfigPackageLoad.getBooleanFlagValue("assist_content_user_restriction_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("backup_service_security_log_event_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("common_criteria_mode_coexistence", false);
            aconfigPackageLoad.getBooleanFlagValue("cross_profile_widget_provider_bulk_apis", false);
            aconfigPackageLoad.getBooleanFlagValue("dedicated_device_control_api_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("device_policy_size_tracking_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("device_theft_api_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("dpm_security_level_wpa_only", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_nullable_admin_component", false);
            aconfigPackageLoad.getBooleanFlagValue("enforcing_admin_extra_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("enforcing_admin_get_component_name_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("esim_management_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("headless_device_owner_single_user_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("introduce_generic_provisioning_error", false);
            aconfigPackageLoad.getBooleanFlagValue("is_mte_policy_enforced", false);
            aconfigPackageLoad.getBooleanFlagValue("keychain_suppress_certificate_selections", false);
            aconfigPackageLoad.getBooleanFlagValue("lockscreen_info_coexistence", false);
            aconfigPackageLoad.getBooleanFlagValue("managed_esim_outgoing_transfer_policy", false);
            aconfigPackageLoad.getBooleanFlagValue("multi_user_management_device_provisioning", false);
            aconfigPackageLoad.getBooleanFlagValue("multi_user_management_reporting", false);
            aconfigPackageLoad.getBooleanFlagValue("multi_user_management_user_provisioning", false);
            aconfigPackageLoad.getBooleanFlagValue("network_log_streaming_enabled", false);
            b = aconfigPackageLoad.getBooleanFlagValue("onboarding_bugreport_v2_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("package_failure_security_logging_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("physical_sim_policy", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_engine_migration_v2_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_app_install", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_app_uninstall", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_assist_content", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_auto_time", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_auto_time_zone", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_bluetooth_sharing", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_cellular_data_usage", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_content_protection", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_developer_options", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_disallow_factory_reset", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_disallow_usb_file_transfer", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_easter_eggs", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_ethernet_state", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_first_use_hints", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_keyguard_status", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_lockscreen_message", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_login_screen", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_memory_tagging_extension", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_network_logging_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_network_reset", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_physical_media_access", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_safe_boot", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_screen_capture_api", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_security_logging_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_short_support_message", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_subscriptions", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_task_continuity_handoff", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_tethering_settings", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_untrusted_apps", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_usb_data_signaling", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_user_configured_vpn", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_verify_apps", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_wifi_local_only_hotspot", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_wifi_network_selection", false);
            aconfigPackageLoad.getBooleanFlagValue("policy_streamlining_wifi_tethering_minimum_security_level", false);
            aconfigPackageLoad.getBooleanFlagValue("remove_managed_profile_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("secondary_lockscreen_api_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("secure_adb_role_bypassing", false);
            aconfigPackageLoad.getBooleanFlagValue("security_log_v2_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("set_auto_time_enabled_coexistence", false);
            aconfigPackageLoad.getBooleanFlagValue("set_auto_time_zone_enabled_coexistence", false);
            aconfigPackageLoad.getBooleanFlagValue("set_mte_policy_coexistence", false);
            aconfigPackageLoad.getBooleanFlagValue("single_user_device_management_modes_config_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("split_create_managed_profile_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("user_login_attempt_security_logging_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("user_logout_security_logging_enabled", false);
        } catch (java.lang.Exception e) {
            android.util.Log.e("ExportedFlags", e.toString());
        } catch (java.lang.LinkageError e2) {
            android.util.Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
