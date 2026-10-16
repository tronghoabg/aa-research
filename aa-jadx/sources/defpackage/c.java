package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static volatile boolean a = false;
    private static boolean b = false;

    public static boolean a() {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        if (!a) {
            b();
        }
        return b;
    }

    private static final void b() {
        if (android.os.Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            android.os.flagging.AconfigPackage aconfigPackageLoad = android.os.flagging.AconfigPackage.load("android.os");
            aconfigPackageLoad.getBooleanFlagValue("update_engine_api", false);
            aconfigPackageLoad.getBooleanFlagValue("remove_app_profiler_pss_collection", false);
            aconfigPackageLoad.getBooleanFlagValue("bluetooth_bugreport_mode", false);
            aconfigPackageLoad.getBooleanFlagValue("ordered_broadcast_multiple_permissions", false);
            aconfigPackageLoad.getBooleanFlagValue("allow_consentless_bugreport_delegated_consent", false);
            aconfigPackageLoad.getBooleanFlagValue("bugreport_multi_display_screenshot_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("security_state_service", false);
            aconfigPackageLoad.getBooleanFlagValue("supplemental_security_patches", false);
            aconfigPackageLoad.getBooleanFlagValue("initiate_bugreport_as_non_admin", false);
            aconfigPackageLoad.getBooleanFlagValue("adpf_gpu_report_actual_work_duration", false);
            aconfigPackageLoad.getBooleanFlagValue("adpf_prefer_power_efficiency", false);
            aconfigPackageLoad.getBooleanFlagValue("allow_thermal_headroom_thresholds", false);
            aconfigPackageLoad.getBooleanFlagValue("allow_thermal_thresholds_callback", false);
            aconfigPackageLoad.getBooleanFlagValue("strongbox_properties_api", false);
            aconfigPackageLoad.getBooleanFlagValue("api_for_backported_fixes", false);
            aconfigPackageLoad.getBooleanFlagValue("async_trace_for_track", false);
            aconfigPackageLoad.getBooleanFlagValue("battery_part_status_api", false);
            aconfigPackageLoad.getBooleanFlagValue("storage_lifetime_api", false);
            b = aconfigPackageLoad.getBooleanFlagValue("allow_private_profile", false);
            aconfigPackageLoad.getBooleanFlagValue("get_private_space_settings", false);
            aconfigPackageLoad.getBooleanFlagValue("binder_frozen_state_change_callback", false);
            aconfigPackageLoad.getBooleanFlagValue("count_class_instances_api", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_frozen_object_exception", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_has_binders", false);
            aconfigPackageLoad.getBooleanFlagValue("expose_set_process_thread_group", false);
            aconfigPackageLoad.getBooleanFlagValue("ipc_data_cache_module_adservices", false);
            aconfigPackageLoad.getBooleanFlagValue("ipc_data_cache_testmode_apis", false);
            aconfigPackageLoad.getBooleanFlagValue("native_app_zygote", false);
            aconfigPackageLoad.getBooleanFlagValue("native_framework_prototype", false);
            aconfigPackageLoad.getBooleanFlagValue("telemetry_apis_framework_initialization", false);
            aconfigPackageLoad.getBooleanFlagValue("battery_charging_info_api", false);
            aconfigPackageLoad.getBooleanFlagValue("battery_manufacturer_diagnostics_api", false);
            aconfigPackageLoad.getBooleanFlagValue("state_of_health_public", false);
            aconfigPackageLoad.getBooleanFlagValue("material_colors_10_2024", false);
            aconfigPackageLoad.getBooleanFlagValue("material_colors_2026_03", false);
            aconfigPackageLoad.getBooleanFlagValue("material_motion_tokens", false);
            aconfigPackageLoad.getBooleanFlagValue("material_shape_tokens", false);
            aconfigPackageLoad.getBooleanFlagValue("mainline_vcn_platform_api", false);
        } catch (java.lang.Exception e) {
            android.util.Log.e("ExportedFlags", e.toString());
        } catch (java.lang.LinkageError e2) {
            android.util.Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
