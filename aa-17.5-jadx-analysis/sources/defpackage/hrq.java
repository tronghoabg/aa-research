package defpackage;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.util.Log;

/* loaded from: classes2.dex */
public final class hrq {
    public static volatile boolean a = false;
    public static boolean b = false;
    private static boolean c = false;

    public static boolean a() {
        if (!a) {
            b();
        }
        return c;
    }

    public static final void b() {
        if (Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            AconfigPackage aconfigPackageLoad = AconfigPackage.load("com.android.window.flags");
            aconfigPackageLoad.getBooleanFlagValue("can_control_touch_mode_api", false);
            aconfigPackageLoad.getBooleanFlagValue("app_compat_properties_api", false);
            aconfigPackageLoad.getBooleanFlagValue("density_390_api", false);
            aconfigPackageLoad.getBooleanFlagValue("vdm_force_app_universal_resizable_api", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_desktop_windowing_app_to_web_education", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_fullscreen_in_new_task_preference", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_require_movable_task_api", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_window_repositioning_api", false);
            aconfigPackageLoad.getBooleanFlagValue("exclude_caption_insets_opt_out_api", false);
            aconfigPackageLoad.getBooleanFlagValue("runtime_density_resolution_for_window_layout", false);
            b = aconfigPackageLoad.getBooleanFlagValue("bal_additional_start_modes", false);
            aconfigPackageLoad.getBooleanFlagValue("bal_send_intent_with_options", false);
            aconfigPackageLoad.getBooleanFlagValue("bal_strict_mode_ro", false);
            aconfigPackageLoad.getBooleanFlagValue("multi_crop", false);
            aconfigPackageLoad.getBooleanFlagValue("predictive_back_priority_system_navigation_observer", false);
            aconfigPackageLoad.getBooleanFlagValue("predictive_back_swipe_edge_none_api", false);
            aconfigPackageLoad.getBooleanFlagValue("predictive_back_timestamp_api", false);
            aconfigPackageLoad.getBooleanFlagValue("support_custom_dim_color", false);
            aconfigPackageLoad.getBooleanFlagValue("always_update_wallpaper_permission", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_interactive_picture_in_picture", false);
            aconfigPackageLoad.getBooleanFlagValue("extended_jank_api", false);
            aconfigPackageLoad.getBooleanFlagValue("jank_api", false);
            aconfigPackageLoad.getBooleanFlagValue("mirror_surface_api", false);
            aconfigPackageLoad.getBooleanFlagValue("screen_recording_callbacks", false);
            c = aconfigPackageLoad.getBooleanFlagValue("scvh_private_display_support", false);
            aconfigPackageLoad.getBooleanFlagValue("scvh_set_focusable_api", false);
            aconfigPackageLoad.getBooleanFlagValue("sdk_desired_present_time", false);
            aconfigPackageLoad.getBooleanFlagValue("trusted_presentation_strict_occlusion", false);
            aconfigPackageLoad.getBooleanFlagValue("deprecate_make_task_launch_behind", false);
            aconfigPackageLoad.getBooleanFlagValue("deprecate_window_opt_out_edge_to_edge_enforcement", false);
            aconfigPackageLoad.getBooleanFlagValue("enforce_edge_to_edge", false);
            aconfigPackageLoad.getBooleanFlagValue("insets_animation_lifecycle_listener", false);
            aconfigPackageLoad.getBooleanFlagValue("predictive_back_system_override_callback", false);
            aconfigPackageLoad.getBooleanFlagValue("activity_start_interceptor_speedbumps", false);
            aconfigPackageLoad.getBooleanFlagValue("cover_display_opt_in", false);
            aconfigPackageLoad.getBooleanFlagValue("engagement_control_api", false);
            aconfigPackageLoad.getBooleanFlagValue("get_running_tasks_for_display", false);
            aconfigPackageLoad.getBooleanFlagValue("manage_displays_role_permission", false);
            aconfigPackageLoad.getBooleanFlagValue("touch_pass_through_opt_in", false);
            aconfigPackageLoad.getBooleanFlagValue("untrusted_embedding_any_app_permission", false);
            aconfigPackageLoad.getBooleanFlagValue("virtual_gamepad_developer_opt_out", false);
            aconfigPackageLoad.getBooleanFlagValue("wellbeing_confirm_with_speedbump_intent", false);
        } catch (Exception e) {
            Log.e("ExportedFlags", e.toString());
        } catch (LinkageError e2) {
            Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
