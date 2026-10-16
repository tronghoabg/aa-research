package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* loaded from: classes.dex */
public final class aczx implements aczw {
    private static final wcv a = new wcv(aclg.b, 112);

    @Override // defpackage.aczw
    public final abnf A() {
        return (abnf) a.e(9, "WirelessProjectionInGearhead__bluetooth_tracker_start_timeout", new acze(4), "CAo").gu();
    }

    @Override // defpackage.aczw
    public final abnf B() {
        return (abnf) a.e(34, "WirelessProjectionInGearhead__first_network_connection_attempt_duration", new acze(4), "CAc").gu();
    }

    @Override // defpackage.aczw
    public final abnf C() {
        return (abnf) a.e(40, "WirelessProjectionInGearhead__hu_wifi_start_request_wait_timeout", new acze(4), "CAU").gu();
    }

    @Override // defpackage.aczw
    public final abnf D() {
        return (abnf) a.e(50, "WirelessProjectionInGearhead__local_only_connection_failure_wait", new acze(4), "CAI").gu();
    }

    @Override // defpackage.aczw
    public final abnf E() {
        return (abnf) a.e(58, "WirelessProjectionInGearhead__max_network_connection_duration", new acze(4), "CCQ").gu();
    }

    @Override // defpackage.aczw
    public final abnf F() {
        return (abnf) a.e(72, "WirelessProjectionInGearhead__restart_wpp_delay_for_issues_after_connection", new acze(4), "").gu();
    }

    @Override // defpackage.aczw
    public final abnf G() {
        return (abnf) a.e(75, "WirelessProjectionInGearhead__restart_wpp_for_network_failure_delay", new acze(4), "CAU").gu();
    }

    @Override // defpackage.aczw
    public final abnf H() {
        return (abnf) a.e(79, "WirelessProjectionInGearhead__rfcomm_connect_interrupt_delay", new acze(4), "CBk").gu();
    }

    @Override // defpackage.aczw
    public final abnf I() {
        return (abnf) a.e(86, "WirelessProjectionInGearhead__start_request_from_md_retry_delay", new acze(4), "CAI").gu();
    }

    @Override // defpackage.aczw
    public final abnf J() {
        return (abnf) a.e(87, "WirelessProjectionInGearhead__start_request_from_md_retry_limit_after_already_started", new acze(4), "CDI").gu();
    }

    @Override // defpackage.aczw
    public final abnf K() {
        return (abnf) a.e(88, "WirelessProjectionInGearhead__start_request_from_md_retry_limit_after_not_yet_started", new acze(4), "CDI").gu();
    }

    @Override // defpackage.aczw
    public final abnf L() {
        return (abnf) a.e(104, "WirelessProjectionInGearhead__wifi_start_response_timeout", new acze(4), "CAM").gu();
    }

    @Override // defpackage.aczw
    public final abnf M() {
        return (abnf) a.e(106, "WirelessProjectionInGearhead__wpp_first_message_timeout_for_dongle", new acze(4), "CAMQgM7kzQI").gu();
    }

    @Override // defpackage.aczw
    public final abqz N() {
        return (abqz) a.e(98, "WirelessProjectionInGearhead__use_rfcomm_transport_for_spark_head_unit_allowlist", new acze(7), "CiciA0JNVyogYm13X2lkYzIzIGZvciBhcm02NCBbTTk1LTI0MDMyMl0").gu();
    }

    @Override // defpackage.aczw
    public final abqz O() {
        return (abqz) a.e(103, "WirelessProjectionInGearhead__wifi_projection_protocol_head_unit_denylist", new acze(7), "ChIiCURFTlNPIFRFTioFSGlfMDEKJBoEMjAyMCIHUGlvbmVlcioTOWluY2ggRGlzcGxheSBBdWRpbwokGgQyMDIxIgdQaW9uZWVyKhM5aW5jaCBEaXNwbGF5IEF1ZGlvCjIiJUh1aXpob3UgRGVzYXkgU1YgQXV0b21vdGl2ZSBDby4sIEx0ZC4qCVRSODYyMi80MAoyIiVIdWl6aG91IERlc2F5IFNWIEF1dG9tb3RpdmUgQ28uLCBMdGQuKglOVjYwMDIvNTgKNCIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioLNzAzMDAwNzM4QUEKMiIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioJTlY2MDMyLzU4CjIiJUh1aXpob3UgRGVzYXkgU1YgQXV0b21vdGl2ZSBDby4sIEx0ZC4qCVRSNjAyMi81OAo0IiVIdWl6aG91IERlc2F5IFNWIEF1dG9tb3RpdmUgQ28uLCBMdGQuKgs3MDMwMDA2MjdBQQoTIgZBTFBJTkUqCWlMWC1GOTA1RAoyIiVIdWl6aG91IERlc2F5IFNWIEF1dG9tb3RpdmUgQ28uLCBMdGQuKglUUjYwMTIvNTgKNCIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioLNzAzMDAwNzM3QUEKMiIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioJVFI2MDIzLzU4ChIiBkFMUElORSoIaUxYLTcwNUQKMiIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioJTlY2MDE0LzU4CjQiJUh1aXpob3UgRGVzYXkgU1YgQXV0b21vdGl2ZSBDby4sIEx0ZC4qCzcwMzAwMDc1N0FBCjQiJUh1aXpob3UgRGVzYXkgU1YgQXV0b21vdGl2ZSBDby4sIEx0ZC4qCzcwMzAwMDYyOEFBChMiBkFMUElORSoJaUxYLUYxMTVECjIiJUh1aXpob3UgRGVzYXkgU1YgQXV0b21vdGl2ZSBDby4sIEx0ZC4qCVRSNjAzMi81OAoyIiVIdWl6aG91IERlc2F5IFNWIEF1dG9tb3RpdmUgQ28uLCBMdGQuKglUUjYwOTIvNTgKNCIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioLNzAzMDAwNzYzQUEKNCIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioLNzAzMDAwNzY1QUEKNCIlSHVpemhvdSBEZXNheSBTViBBdXRvbW90aXZlIENvLiwgTHRkLioLNzAzMDAwNTg0QUE").gu();
    }

    @Override // defpackage.aczw
    public final abra P() {
        return (abra) a.e(71, "WirelessProjectionInGearhead__reset_user_intention_when_vehicle_id_changes_head_unit_list", new acze(8), "CgsiBmhhcm1hbioBbQoMIgZoYXJtYW4qAm0yCgsiBmhhcm1hbioBaAoMIgZoYXJtYW4qAmgyCgsiBmhhcm1hbioBcAoMIgZoYXJtYW4qAnAyCgwiBmhhcm1hbioCcHAQBg").gu();
    }

    @Override // defpackage.aczw
    public final abrl Q() {
        return (abrl) a.e(59, "WirelessProjectionInGearhead__new_byebye_min_version", new acze(6), "CAQQBQ").gu();
    }

    @Override // defpackage.aczw
    public final abru R() {
        return (abru) a.e(15, "WirelessProjectionInGearhead__connect_head_unit_model_markers", new acze(5), "Cgljb25uZWN0LXMKCWNvbm5lY3RfcwoJY29ubmVjdC13Cgljb25uZWN0X3cKCWNvbm5lY3QtbAoJY29ubmVjdF9s").gu();
    }

    @Override // defpackage.aczw
    public final abru S() {
        return (abru) a.e(46, "WirelessProjectionInGearhead__invalid_bt_device_types", new acze(5), "ChJVbnRldGhlcmVkIEhlYWRzZXQKB0hlYWRzZXQ").gu();
    }

    @Override // defpackage.aczw
    public final abru T() {
        return (abru) a.e(89, "WirelessProjectionInGearhead__suspicious_hu_bt_name_regexps", new acze(5), "CgwoP2kpLipidWRzLioKDyg/aSkuKmFpcnBvZHMuKgoNKD9pKS4qd2F0Y2guKgoOKD9pKS4qMTAwMFhNLio").gu();
    }

    @Override // defpackage.aczw
    public final abru U() {
        return (abru) a.e(94, "WirelessProjectionInGearhead__third_party_dongle_name_regexps", new acze(5), "Cg1BQVdpcmVsZXNzLS4q").gu();
    }

    @Override // defpackage.aczw
    public final abru V() {
        return (abru) a.e(109, "WirelessProjectionInGearhead__wpp_over_tcp_for_pdk_4_1_allow_list", new acze(5), "Cg4oP2kpLipnb29nbGUuKgoLKD9pKS4qZ21jLioKDSg/aSkuKmJ1aWNrLioKECg/aSkuKmNhZGlsbGFjLioKESg/aSkuKmNoZXZyb2xldC4qCg0oP2kpLipjaGV2eS4qCgsoP2kpLipibXcuKg").gu();
    }

    @Override // defpackage.aczw
    public final String W() {
        return (String) a.c(27, "WirelessProjectionInGearhead__dongle_device_name_matches", "Intercooler,AndroidAuto-").gu();
    }

    @Override // defpackage.aczw
    public final String X() {
        return (String) a.c(102, "WirelessProjectionInGearhead__wifi_lock_selected_option_in_network_request_manager", "high_performance").gu();
    }

    @Override // defpackage.aczw
    public final boolean Y() {
        return ((Boolean) a.d(1, "WirelessProjectionInGearhead__add_is_hidden_ssid_to_network_request", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean Z() {
        return ((Boolean) a.d(2, "WirelessProjectionInGearhead__add_reason_to_md_start_request", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final long a() {
        return ((Long) a.b(3, "WirelessProjectionInGearhead__alert_dialog_vibration_ms", 2000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final boolean aA() {
        return ((Boolean) a.d(42, "WirelessProjectionInGearhead__ignore_broadcast_intents_for_non_system_user", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aB() {
        return ((Boolean) a.d(43, "WirelessProjectionInGearhead__ignore_link_properties_updates_with_null_dhcp_server_address", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aC() {
        return ((Boolean) a.d(44, "WirelessProjectionInGearhead__ignore_missing_permission_crash", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aD() {
        return ((Boolean) a.d(45, "WirelessProjectionInGearhead__install_wifi_scan_receiver_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aE() {
        return ((Boolean) a.d(51, "WirelessProjectionInGearhead__log_connectivity_event_for_ping_health_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aF() {
        return ((Boolean) a.d(52, "WirelessProjectionInGearhead__log_connectivity_events_for_bt_illegal_bond_state_and_acl_connection", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aG() {
        return ((Boolean) a.d(53, "WirelessProjectionInGearhead__log_specific_events_for_invalid_message_reasons_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aH() {
        return ((Boolean) a.d(54, "WirelessProjectionInGearhead__log_wifi_channel_width_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aI() {
        return ((Boolean) a.d(55, "WirelessProjectionInGearhead__log_wireless_capable_connectivity_event_for_hfp_state_change", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aJ() {
        return ((Boolean) a.d(60, "WirelessProjectionInGearhead__no_bssid_validation", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aK() {
        return ((Boolean) a.d(61, "WirelessProjectionInGearhead__omit_bssid_in_network_request", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aL() {
        return ((Boolean) a.d(62, "WirelessProjectionInGearhead__permit_pending_wifi_network_request_to_complete_before_shutdown", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aM() {
        return ((Boolean) a.d(63, "WirelessProjectionInGearhead__print_wifi_info", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aN() {
        return ((Boolean) a.d(65, "WirelessProjectionInGearhead__raise_gearhead_connection_status_notification_channel_importance_to_high", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aO() {
        return ((Boolean) a.d(66, "WirelessProjectionInGearhead__read_bluetooth_disconnected_reason_from_callback", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aP() {
        return ((Boolean) a.d(67, "WirelessProjectionInGearhead__read_bluetooth_disconnected_reason_from_intent", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aQ() {
        return ((Boolean) a.d(68, "WirelessProjectionInGearhead__remove_unquote_ssid_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aR() {
        return ((Boolean) a.d(69, "WirelessProjectionInGearhead__require_hfp_for_spark", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aS() {
        return ((Boolean) a.d(70, "WirelessProjectionInGearhead__require_profile_for_spark_when_tracking_car_absence", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aT() {
        return ((Boolean) a.d(76, "WirelessProjectionInGearhead__restart_wpp_on_ping_timeout", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aU() {
        return ((Boolean) a.d(77, "WirelessProjectionInGearhead__restart_wpp_on_wifi_start_response_timeout", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aV() {
        return ((Boolean) a.d(78, "WirelessProjectionInGearhead__retain_proxies_till_stop", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aW() {
        return ((Boolean) a.d(80, "WirelessProjectionInGearhead__send_setup_event_before_network_disconnect_on_bye_bye_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aX() {
        return ((Boolean) a.d(81, "WirelessProjectionInGearhead__send_wifi_start_request_from_md_after_version_check_complete", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aY() {
        return ((Boolean) a.d(82, "WirelessProjectionInGearhead__simplify_start_projection_from_wbr_to_wsss", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aZ() {
        return ((Boolean) a.d(83, "WirelessProjectionInGearhead__skip_frx_check_in_wsem", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aa() {
        return ((Boolean) a.d(4, "WirelessProjectionInGearhead__allow_acl_for_associated_device_when_tracking_car_absence", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ab() {
        return ((Boolean) a.d(5, "WirelessProjectionInGearhead__allow_acl_for_rfcomm_when_tracking_car_absence", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ac() {
        return ((Boolean) a.d(6, "WirelessProjectionInGearhead__associate_bt_devices_and_trigger_wireless_from_cdm", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ad() {
        return ((Boolean) a.d(7, "WirelessProjectionInGearhead__binder_skip_usb_monitoring_for_wifi", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ae() {
        return ((Boolean) a.d(10, "WirelessProjectionInGearhead__bt_manager_wake_lock", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean af() {
        return ((Boolean) a.d(14, "WirelessProjectionInGearhead__check_local_network_permission_in_wifi_bluetooth_receiver_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ag() {
        return ((Boolean) a.d(16, "WirelessProjectionInGearhead__connectivity_logging_acl_connected_with_hu_wireless_capability_check_enabled", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ah() {
        return ((Boolean) a.d(17, "WirelessProjectionInGearhead__crash_on_bad_state_from_handoff_component", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ai() {
        return ((Boolean) a.d(18, "WirelessProjectionInGearhead__disable_broadcast_receiver_for_non_system_user", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aj() {
        return ((Boolean) a.d(19, "WirelessProjectionInGearhead__disable_broadcast_receiver_for_private_profile_usb_user", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ak() {
        return ((Boolean) a.d(20, "WirelessProjectionInGearhead__disable_broadcast_receiver_for_private_profile_user", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean al() {
        return ((Boolean) a.d(21, "WirelessProjectionInGearhead__disable_dual_sta_when_hotspot", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean am() {
        return ((Boolean) a.d(22, "WirelessProjectionInGearhead__disable_manual_network_scan", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean an() {
        return ((Boolean) a.d(23, "WirelessProjectionInGearhead__disconnect_wifi_network_on_user_bye_bye", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ao() {
        return ((Boolean) a.d(24, "WirelessProjectionInGearhead__do_not_automatically_renable_wifi_adapter", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ap() {
        return ((Boolean) a.d(25, "WirelessProjectionInGearhead__do_not_retry_wifi_after_local_only_disconnection", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aq() {
        return ((Boolean) a.d(26, "WirelessProjectionInGearhead__do_not_retry_wifi_after_local_only_user_reject", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ar() {
        return ((Boolean) a.d(28, "WirelessProjectionInGearhead__enable_dual_sta", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean as() {
        return ((Boolean) a.d(29, "WirelessProjectionInGearhead__enable_timeout_for_acl_connected_bluetooth_device", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean at() {
        return ((Boolean) a.d(30, "WirelessProjectionInGearhead__enable_wireless_bt_mac_fix", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean au() {
        return ((Boolean) a.d(31, "WirelessProjectionInGearhead__enable_wireless_legacy_strict_network_lost_callbacks", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean av() {
        return ((Boolean) a.d(32, "WirelessProjectionInGearhead__fallback_to_rfcomm_on_t_minus", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean aw() {
        return ((Boolean) a.d(33, "WirelessProjectionInGearhead__filter_profile_connection_by_acl", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ax() {
        return ((Boolean) a.d(35, "WirelessProjectionInGearhead__fix_anr_in_managing_profile_proxy_v2", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean ay() {
        return ((Boolean) a.d(38, "WirelessProjectionInGearhead__handle_invalid_message_type_and_value_in_transport", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean az() {
        return ((Boolean) a.d(41, "WirelessProjectionInGearhead__ignore_acl_from_ble", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final long b() {
        return ((Long) a.b(11, "WirelessProjectionInGearhead__cancellation_token_expire_in_seconds", 600L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final boolean ba() {
        return ((Boolean) a.d(84, "WirelessProjectionInGearhead__specify_wifi_frequency_if_available", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean bb() {
        return ((Boolean) a.d(85, "WirelessProjectionInGearhead__start_from_notification_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean bc() {
        return ((Boolean) a.d(90, "WirelessProjectionInGearhead__teardown_wireless_setup_on_unbond_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean bd() {
        return ((Boolean) a.d(91, "WirelessProjectionInGearhead__teardown_wireless_setup_on_unbond_for_connect_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean be() {
        return ((Boolean) a.d(95, "WirelessProjectionInGearhead__throw_exception_on_illegal_state_of_wpp_first_message_timeout_kill_switch", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean bf() {
        return ((Boolean) a.d(97, "WirelessProjectionInGearhead__use_rfcomm_transport_for_spark", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean bg() {
        return ((Boolean) a.d(99, "WirelessProjectionInGearhead__use_wpa3_when_available", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final boolean bh() {
        return ((Boolean) a.d(105, "WirelessProjectionInGearhead__wireless_skip_hfp_v2", false).gu()).booleanValue();
    }

    @Override // defpackage.aczw
    public final long c() {
        return ((Long) a.b(12, "WirelessProjectionInGearhead__car_absence_timeout_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long d() {
        return ((Long) a.b(13, "WirelessProjectionInGearhead__cdm_callback_timeout_ms", 10000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long e() {
        return ((Long) a.b(36, "WirelessProjectionInGearhead__frequency_cache_timeout_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long f() {
        return ((Long) a.b(37, "WirelessProjectionInGearhead__frequency_list_max_size", 25L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long g() {
        return ((Long) a.b(39, "WirelessProjectionInGearhead__hfp_connect_event_timeout_ms", 5000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long h() {
        return ((Long) a.b(47, "WirelessProjectionInGearhead__legacy_network_request_retries", 2L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long i() {
        return ((Long) a.b(48, "WirelessProjectionInGearhead__legacy_network_request_retry_delay_ms", 1000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long j() {
        return ((Long) a.b(49, "WirelessProjectionInGearhead__legacy_network_request_timeout_ms", 10000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long k() {
        return ((Long) a.b(56, "WirelessProjectionInGearhead__max_cancellation_token_storage_size", 1000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long l() {
        return ((Long) a.b(57, "WirelessProjectionInGearhead__max_network_connection_attempts", 3L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long m() {
        return ((Long) a.b(64, "WirelessProjectionInGearhead__profile_proxy_thread_timeout_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long n() {
        return ((Long) a.b(73, "WirelessProjectionInGearhead__restart_wpp_delay_for_rfcomm_socket_connection_failed", 5000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long o() {
        return ((Long) a.b(74, "WirelessProjectionInGearhead__restart_wpp_for_invalid_wifi_credentials_delay_ms", 5000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long p() {
        return ((Long) a.b(92, "WirelessProjectionInGearhead__telemetry_service_destroy_start_request_throttle", 30000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long q() {
        return ((Long) a.b(93, "WirelessProjectionInGearhead__telemetry_start_request_throttle", 15000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long r() {
        return ((Long) a.b(96, "WirelessProjectionInGearhead__tracker_polling_timeout", 25000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long s() {
        return ((Long) a.b(100, "WirelessProjectionInGearhead__wifi_frequency_saturation_coefficient", 5L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long t() {
        return ((Long) a.b(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "WirelessProjectionInGearhead__wifi_info_response_timeout_millis", 3000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long u() {
        return ((Long) a.b(107, "WirelessProjectionInGearhead__wpp_first_message_timeout_ms", 12000L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long v() {
        return ((Long) a.b(108, "WirelessProjectionInGearhead__wpp_first_message_timeouts_for_dongle_limit", 1L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long w() {
        return ((Long) a.b(110, "WirelessProjectionInGearhead__wpp_pings_health_check_limit", 3L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final long x() {
        return ((Long) a.b(111, "WirelessProjectionInGearhead__wsss_scheduled_thread_pool_size", 4L).gu()).longValue();
    }

    @Override // defpackage.aczw
    public final abnf y() {
        return (abnf) a.e(0, "WirelessProjectionInGearhead__acl_connect_event_timeout", new acze(4), "CAo").gu();
    }

    @Override // defpackage.aczw
    public final abnf z() {
        return (abnf) a.e(8, "WirelessProjectionInGearhead__bluetooth_state_tracker_dongle_hfp_timeout", new acze(4), "CBk").gu();
    }
}
