package defpackage;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.util.Log;

/* loaded from: classes2.dex */
public final class d {
    public static volatile boolean a = false;
    public static boolean b = false;

    public static final void a() {
        if (Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            AconfigPackage aconfigPackageLoad = AconfigPackage.load("android.permission.flags");
            b = aconfigPackageLoad.getBooleanFlagValue("access_local_network_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("full_loopback_protections_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("use_loopback_interface_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("granular_health_permissions_phase_two_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("replace_body_sensor_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("skin_temp_oxygen_saturation_health_services_pregrant_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("content_restriction_role_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("device_controller_role_api_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("health_connect_backup_restore_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("health_connect_provide_device_data_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("registered_app_store", false);
            aconfigPackageLoad.getBooleanFlagValue("allowlist_v2_changes_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("app_interaction_access_control_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("assist_settings_privacy_improvements_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("check_op_overload_api_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("device_aware_permission_apis_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("device_id_in_op_proxy_info_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("enhanced_confirmation_in_call_apis_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("enhanced_confirmation_mode_apis_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("fine_power_monitor_permission", false);
            aconfigPackageLoad.getBooleanFlagValue("get_emergency_role_holder_api_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("location_button_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("op_enable_mobile_data_by_user", false);
            aconfigPackageLoad.getBooleanFlagValue("permission_tree_apis_deprecated", false);
            aconfigPackageLoad.getBooleanFlagValue("ppd_manifest_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("ppd_purpose_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("read_media_documents_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("restrict_assist_structure_screen_content_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("retail_demo_role_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("search_engine_role_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("set_next_attribution_source", false);
            aconfigPackageLoad.getBooleanFlagValue("should_register_attribution_source", false);
            aconfigPackageLoad.getBooleanFlagValue("should_show_permission_rationale_in_context_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("sync_on_op_noted_api", false);
            aconfigPackageLoad.getBooleanFlagValue("system_server_role_controller_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("system_vendor_intelligence_role_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("text_classifier_choice_api_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("voice_activation_permission_apis", false);
            aconfigPackageLoad.getBooleanFlagValue("manage_contacts_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("open_safety_center_apis", false);
            aconfigPackageLoad.getBooleanFlagValue("safety_center_show_issues_api", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_system_supervision_role_behavior", false);
            aconfigPackageLoad.getBooleanFlagValue("supervision_role_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("interact_cellbroadcast_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("ranging_permission_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("factory_reset_prep_permission_apis", false);
            aconfigPackageLoad.getBooleanFlagValue("wallet_role_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("wallet_role_icon_property_enabled", false);
            aconfigPackageLoad.getBooleanFlagValue("active_watch_face_role_enabled", false);
        } catch (Exception e) {
            Log.e("ExportedFlags", e.toString());
        } catch (LinkageError e2) {
            Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
