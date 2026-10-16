package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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
            android.os.flagging.AconfigPackage aconfigPackageM = b$.ExternalSyntheticApiModelOutline0.m("android.os");
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "update_engine_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "remove_app_profiler_pss_collection", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "bluetooth_bugreport_mode", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "ordered_broadcast_multiple_permissions", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "allow_consentless_bugreport_delegated_consent", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "bugreport_multi_display_screenshot_enabled", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "security_state_service", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "supplemental_security_patches", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "initiate_bugreport_as_non_admin", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "adpf_gpu_report_actual_work_duration", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "adpf_prefer_power_efficiency", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "allow_thermal_headroom_thresholds", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "allow_thermal_thresholds_callback", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "strongbox_properties_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "api_for_backported_fixes", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "async_trace_for_track", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "battery_part_status_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "storage_lifetime_api", false);
            b = b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "allow_private_profile", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "get_private_space_settings", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "binder_frozen_state_change_callback", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "count_class_instances_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "enable_frozen_object_exception", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "enable_has_binders", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "expose_set_process_thread_group", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "ipc_data_cache_module_adservices", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "ipc_data_cache_testmode_apis", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "native_app_zygote", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "native_framework_prototype", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "telemetry_apis_framework_initialization", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "battery_charging_info_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "battery_manufacturer_diagnostics_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "state_of_health_public", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "material_colors_10_2024", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "material_colors_2026_03", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "material_motion_tokens", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "material_shape_tokens", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "mainline_vcn_platform_api", false);
        } catch (java.lang.Exception e) {
            android.util.Log.e("ExportedFlags", e.toString());
        } catch (java.lang.LinkageError e2) {
            android.util.Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
