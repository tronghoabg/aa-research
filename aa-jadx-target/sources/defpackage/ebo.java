package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ebo {
    public static int a(android.view.View view) {
        return ep$.ExternalSyntheticApiModelOutline1.m(view);
    }

    public static void b(android.view.View view, int i) {
        a$.ExternalSyntheticApiModelOutline1.m(view, 8);
    }

    public static boolean c(android.view.View view) {
        return ep$.ExternalSyntheticApiModelOutline1.m(view);
    }

    public static void d(android.view.Window window, boolean z) {
        int i;
        boolean z2;
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            bgp$.ExternalSyntheticApiModelOutline0.m(window, z);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
            return;
        }
        android.view.View decorView2 = window.getDecorView();
        int systemUiVisibility2 = decorView2.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility2 & (-257);
            z2 = true;
        } else {
            i = systemUiVisibility2 | 256;
            z2 = false;
        }
        decorView2.setSystemUiVisibility(i);
        bgp$.ExternalSyntheticApiModelOutline0.m(window, z2);
    }

    public static defpackage.eqp e(defpackage.eqp eqpVar) {
        defpackage.eqr eqrVar;
        eqpVar.getClass();
        defpackage.afgq afgqVar = new defpackage.afgq();
        afgqVar.a = true;
        if (eqpVar.o()) {
            afgqVar.a = false;
            eqrVar = new defpackage.eqr(eqpVar.e());
        } else {
            eqrVar = new defpackage.eqr();
        }
        eqrVar.r(eqpVar, new defpackage.kku(new defpackage.err(eqrVar, afgqVar, 2, (byte[]) null), 1));
        return eqrVar;
    }

    public static defpackage.eqp f(defpackage.eqp eqpVar, defpackage.affc affcVar) {
        eqpVar.getClass();
        affcVar.getClass();
        defpackage.eqr eqrVar = eqpVar.o() ? new defpackage.eqr(affcVar.invoke(eqpVar.e())) : new defpackage.eqr();
        eqrVar.r(eqpVar, new defpackage.kku(new defpackage.err(eqrVar, affcVar, 0, (byte[]) null), 1));
        return eqrVar;
    }

    public static defpackage.eqp g(defpackage.eqp eqpVar, defpackage.affc affcVar) {
        defpackage.eqp eqpVar2;
        eqpVar.getClass();
        affcVar.getClass();
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.eqr eqrVar = (eqpVar.o() && (eqpVar2 = (defpackage.eqp) affcVar.invoke(eqpVar.e())) != null && eqpVar2.o()) ? new defpackage.eqr(eqpVar2.e()) : new defpackage.eqr();
        defpackage.eqr eqrVar2 = eqrVar;
        eqrVar2.r(eqpVar, new defpackage.kku(new defpackage.acn((java.lang.Object) affcVar, (java.lang.Object) afgvVar, (java.lang.Object) eqrVar2, 15, (byte[]) null), 1));
        return eqrVar2;
    }

    public static defpackage.erj h(defpackage.fbm fbmVar) {
        defpackage.fbj fbjVarB = fbmVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (fbjVarB == null) {
            return null;
        }
        if (fbjVarB instanceof defpackage.erj) {
            return (defpackage.erj) fbjVarB;
        }
        throw new java.lang.IllegalStateException("The registered SavedStateProvider under SAVED_STATE_KEY is not of type SavedStateHandleController");
    }

    public static void i(defpackage.fbm fbmVar, defpackage.esa esaVar) {
        defpackage.afgv afgvVar = new defpackage.afgv();
        afgvVar.a = h(fbmVar);
        if (afgvVar.a == null) {
            afgvVar.a = new defpackage.erj(fbmVar, esaVar);
            fbmVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", (defpackage.fbj) afgvVar.a);
            if (fbmVar.getLifecycle().a().a(defpackage.epx.c)) {
                ((defpackage.erj) afgvVar.a).c();
            } else {
                fbmVar.getLifecycle().c(new defpackage.oa(afgvVar, 5, null));
            }
        }
    }

    public static boolean j(java.lang.String str) {
        return str != null && str.length() > 0;
    }

    public static java.lang.String k(java.lang.Class cls) {
        cls.getClass();
        java.util.Map map = defpackage.evw.a;
        java.lang.String strA = (java.lang.String) map.get(cls);
        if (strA == null) {
            defpackage.evu evuVar = (defpackage.evu) cls.getAnnotation(defpackage.evu.class);
            strA = evuVar != null ? evuVar.a() : null;
            if (!j(strA)) {
                throw new java.lang.IllegalArgumentException("No @Navigator.Name annotation found for ".concat(java.lang.String.valueOf(cls.getSimpleName())));
            }
            map.put(cls, strA);
        }
        strA.getClass();
        return strA;
    }

    public static defpackage.eva l(android.view.View view) {
        defpackage.eva evaVar = (defpackage.eva) afsg.h(afsg.r(afsg.f(view, new dne(17)), new dne(18)));
        if (evaVar != null) {
            return evaVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(view, "View ", " does not have a NavController set"));
    }

    public static defpackage.evs m(java.lang.String str, java.lang.String str2) {
        java.lang.String strSubstring;
        defpackage.evs evsVar = defpackage.evs.a;
        evo evqVar = null;
        if (!defpackage.afga.f("integer", str)) {
            evsVar = defpackage.evs.c;
            if (!defpackage.afga.f("integer[]", str)) {
                evsVar = defpackage.evs.d;
                if (!defpackage.afga.f("List<Int>", str)) {
                    evsVar = defpackage.evs.e;
                    if (!defpackage.afga.f("long", str)) {
                        evsVar = defpackage.evs.f;
                        if (!defpackage.afga.f("long[]", str)) {
                            evsVar = defpackage.evs.g;
                            if (!defpackage.afga.f("List<Long>", str)) {
                                evsVar = defpackage.evs.k;
                                if (!defpackage.afga.f("boolean", str)) {
                                    evsVar = defpackage.evs.l;
                                    if (!defpackage.afga.f("boolean[]", str)) {
                                        evsVar = defpackage.evs.m;
                                        if (!defpackage.afga.f("List<Boolean>", str)) {
                                            evsVar = defpackage.evs.n;
                                            if (!defpackage.afga.f("string", str)) {
                                                evsVar = defpackage.evs.o;
                                                if (!defpackage.afga.f("string[]", str)) {
                                                    evsVar = defpackage.evs.p;
                                                    if (!defpackage.afga.f("List<String>", str)) {
                                                        evsVar = defpackage.evs.h;
                                                        if (!defpackage.afga.f("float", str)) {
                                                            evsVar = defpackage.evs.i;
                                                            if (!defpackage.afga.f("float[]", str)) {
                                                                evsVar = defpackage.evs.j;
                                                                if (!defpackage.afga.f("List<Float>", str)) {
                                                                    evsVar = null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (evsVar != null) {
            return evsVar;
        }
        defpackage.evs evsVar2 = defpackage.evs.b;
        if (defpackage.afga.f("reference", str)) {
            return evsVar2;
        }
        if (str.length() == 0) {
            return defpackage.evs.n;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                strSubstring = str;
            } else {
                strSubstring = str2 + str;
            }
            boolean zEndsWith = str.endsWith("[]");
            if (zEndsWith) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                strSubstring.getClass();
            }
            java.lang.Class<?> cls = java.lang.Class.forName(strSubstring);
            cls.getClass();
            if (android.os.Parcelable.class.isAssignableFrom(cls)) {
                evqVar = zEndsWith ? new evo(cls) : new evp(cls);
            } else if (java.lang.Enum.class.isAssignableFrom(cls) && !zEndsWith) {
                evqVar = new evn(cls);
            } else if (java.io.Serializable.class.isAssignableFrom(cls)) {
                evqVar = zEndsWith ? new evq(cls) : new evr(cls);
            }
            if (evqVar != null) {
                return evqVar;
            }
            throw new java.lang.IllegalArgumentException(((java.lang.Object) strSubstring) + " is not Serializable or Parcelable.");
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static defpackage.kxc n() {
        return (defpackage.kxc) defpackage.mkp.a.i(defpackage.kxc.class);
    }

    public static int o() {
        if (r()) {
            return 2132150271;
        }
        if (defpackage.lee.a.a().b()) {
            return 2132150268;
        }
        defpackage.lem.a.a();
        return 2132150269;
    }

    public static defpackage.pl p(android.content.Context context) {
        context.getClass();
        return new defpackage.pl(context, o());
    }

    public static void q(android.content.res.Resources.Theme theme) {
        theme.getClass();
        theme.applyStyle(o(), true);
    }

    public static boolean r() {
        defpackage.acwd acwdVar = defpackage.acwd.a;
        if (!acwdVar.fF().e()) {
            return false;
        }
        defpackage.abpj abpjVar = acwdVar.fF().a().b;
        java.lang.String str = android.os.Build.MANUFACTURER;
        str.getClass();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        return abpjVar.contains(lowerCase);
    }

    public static void s(android.content.Context context) {
        if (!context.getPackageName().equals("com.google.android.projection.gearhead.pctsverifier")) {
            defpackage.wba.c(context);
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.wba.a;
        synchronized (defpackage.wbc.a) {
            if (!defpackage.wbc.e) {
                boolean z = defpackage.wbc.c;
            } else if (!defpackage.wbc.b) {
                throw new java.lang.IllegalStateException("Cannot set enableTestMode after a flag was already read. See cause for stack trace where first read occurred.", defpackage.wbc.e ? defpackage.wbc.f : defpackage.wbc.d);
            }
            defpackage.wbc.b = true;
        }
    }

    public static void t(java.io.PrintWriter printWriter) {
        v(printWriter, "string", "BUILD_TYPE", "release");
        v(printWriter, "bool", "CLEARCUT_ENABLED", "true");
        v(printWriter, "bool", "DEBUG", "false");
        v(printWriter, "bool", "ENGINEER_SETTINGS", "false");
        v(printWriter, "bool", "FORCE_VERBOSE_LOGGING", "false");
        v(printWriter, "bool", "INTERNAL_BUILD", "false");
        v(printWriter, "bool", "THEME_VALIDATION_ENABLED", "false");
        v(printWriter, "bool", "XRAY_MODE_ENABLED", "false");
        v(printWriter, "boolean", "WirelessSettings__reload_after_connect_a_car", java.lang.String.valueOf(adba.c()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionList", "WirelessProjectionInGearhead__wifi_projection_protocol_head_unit_denylist", juu.i(defpackage.adax.P()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__start_from_notification_enabled", java.lang.String.valueOf(defpackage.adax.bd()));
        v(printWriter, "String", "WirelessProjectionInGearhead__dongle_device_name_matches", defpackage.adax.Y());
        v(printWriter, "long", "WirelessProjectionInGearhead__restart_wpp_for_invalid_wifi_credentials_delay_ms", java.lang.Long.valueOf(defpackage.adax.p()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__restart_wpp_delay_for_rfcomm_socket_connection_failed", java.lang.Long.valueOf(defpackage.adax.o()).toString());
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__restart_wpp_delay_for_issues_after_connection", juu.g(defpackage.adax.G()));
        v(printWriter, "com.google.protos.androidauto.flags.ProtocolVersion", "WirelessProjectionInGearhead__new_byebye_min_version", juu.p(defpackage.adax.R()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__crash_on_bad_state_from_handoff_component", java.lang.String.valueOf(defpackage.adax.aj()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__handle_invalid_message_type_and_value_in_transport", java.lang.String.valueOf(defpackage.adax.aA()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__log_specific_events_for_invalid_message_reasons_kill_switch", java.lang.String.valueOf(defpackage.adax.aI()));
        v(printWriter, "long", "WirelessProjectionInGearhead__wifi_info_response_timeout_millis", java.lang.Long.valueOf(defpackage.adax.u()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__restart_wpp_on_wifi_start_response_timeout", java.lang.String.valueOf(defpackage.adax.aW()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__wifi_start_response_timeout", juu.g(defpackage.adax.M()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__use_wpa3_when_available", java.lang.String.valueOf(defpackage.adax.bi()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__rfcomm_connect_interrupt_delay", juu.g(defpackage.adax.I()));
        v(printWriter, "long", "WirelessProjectionInGearhead__wsss_scheduled_thread_pool_size", java.lang.Long.valueOf(defpackage.adax.y()).toString());
        v(printWriter, "String", "WirelessProjectionInGearhead__wifi_lock_selected_option_in_network_request_manager", defpackage.adax.Z());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__connectivity_logging_acl_connected_with_hu_wireless_capability_check_enabled", java.lang.String.valueOf(defpackage.adax.ai()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "WirelessProjectionInGearhead__suspicious_hu_bt_name_regexps", juu.u(defpackage.adax.U()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "WirelessProjectionInGearhead__third_party_dongle_name_regexps", juu.u(defpackage.adax.V()));
        v(printWriter, "long", "WirelessProjectionInGearhead__alert_dialog_vibration_ms", java.lang.Long.valueOf(defpackage.adax.b()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__cdm_callback_timeout_ms", java.lang.Long.valueOf(defpackage.adax.e()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__hfp_connect_event_timeout_ms", java.lang.Long.valueOf(defpackage.adax.h()).toString());
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__acl_connect_event_timeout", juu.g(defpackage.adax.z()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__bluetooth_tracker_start_timeout", juu.g(defpackage.adax.B()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__enable_wireless_legacy_strict_network_lost_callbacks", java.lang.String.valueOf(defpackage.adax.aw()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__wireless_skip_hfp_v2", java.lang.String.valueOf(defpackage.adax.bj()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionList", "WirelessProjectionInGearhead__use_rfcomm_transport_for_spark_head_unit_allowlist", juu.i(defpackage.adax.O()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__use_rfcomm_transport_for_spark", java.lang.String.valueOf(defpackage.adax.bh()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionListWithFilterMode", "WirelessProjectionInGearhead__reset_user_intention_when_vehicle_id_changes_head_unit_list", juu.j(defpackage.adax.Q()));
        v(printWriter, "long", "WirelessProjectionInGearhead__wpp_pings_health_check_limit", java.lang.Long.valueOf(defpackage.adax.x()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__log_connectivity_event_for_ping_health_kill_switch", java.lang.String.valueOf(defpackage.adax.aG()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__log_wifi_channel_width_kill_switch", java.lang.String.valueOf(defpackage.adax.aJ()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__hu_wifi_start_request_wait_timeout", juu.g(defpackage.adax.D()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__send_wifi_start_request_from_md_after_version_check_complete", java.lang.String.valueOf(defpackage.adax.aZ()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__require_hfp_for_spark", java.lang.String.valueOf(defpackage.adax.aT()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__disable_broadcast_receiver_for_private_profile_usb_user", java.lang.String.valueOf(defpackage.adax.al()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__ignore_broadcast_intents_for_non_system_user", java.lang.String.valueOf(defpackage.adax.aC()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__disable_broadcast_receiver_for_non_system_user", java.lang.String.valueOf(defpackage.adax.ak()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__disable_broadcast_receiver_for_private_profile_user", java.lang.String.valueOf(defpackage.adax.am()));
        v(printWriter, "long", "WirelessProjectionInGearhead__telemetry_service_destroy_start_request_throttle", java.lang.Long.valueOf(defpackage.adax.q()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__telemetry_start_request_throttle", java.lang.Long.valueOf(defpackage.adax.r()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__restart_wpp_on_ping_timeout", java.lang.String.valueOf(defpackage.adax.aV()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__permit_pending_wifi_network_request_to_complete_before_shutdown", java.lang.String.valueOf(defpackage.adax.aN()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__log_wireless_capable_connectivity_event_for_hfp_state_change", java.lang.String.valueOf(defpackage.adax.aK()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__log_connectivity_events_for_bt_illegal_bond_state_and_acl_connection", java.lang.String.valueOf(defpackage.adax.aH()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__wpp_first_message_timeout_for_dongle", juu.g(defpackage.adax.N()));
        v(printWriter, "long", "WirelessProjectionInGearhead__wpp_first_message_timeouts_for_dongle_limit", java.lang.Long.valueOf(defpackage.adax.w()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__wpp_first_message_timeout_ms", java.lang.Long.valueOf(defpackage.adax.v()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__throw_exception_on_illegal_state_of_wpp_first_message_timeout_kill_switch", java.lang.String.valueOf(defpackage.adax.bg()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__fallback_to_rfcomm_on_t_minus", java.lang.String.valueOf(defpackage.adax.ax()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "WirelessProjectionInGearhead__wpp_over_tcp_for_pdk_4_1_allow_list", juu.u(defpackage.adax.W()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__associate_bt_devices_and_trigger_wireless_from_cdm", java.lang.String.valueOf(defpackage.adax.ae()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__bluetooth_state_tracker_dongle_hfp_timeout", juu.g(defpackage.adax.A()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__restart_wpp_for_network_failure_delay", juu.g(defpackage.adax.H()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__remove_unquote_ssid_kill_switch", java.lang.String.valueOf(defpackage.adax.aS()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__local_only_connection_failure_wait", juu.g(defpackage.adax.E()));
        v(printWriter, "long", "WirelessProjectionInGearhead__cancellation_token_expire_in_seconds", java.lang.Long.valueOf(defpackage.adax.c()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__max_cancellation_token_storage_size", java.lang.Long.valueOf(defpackage.adax.l()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__add_reason_to_md_start_request", java.lang.String.valueOf(defpackage.adax.ab()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__skip_frx_check_in_wsem", java.lang.String.valueOf(defpackage.adax.bb()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__ignore_link_properties_updates_with_null_dhcp_server_address", java.lang.String.valueOf(defpackage.adax.aD()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__print_wifi_info", java.lang.String.valueOf(defpackage.adax.aO()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__start_request_from_md_retry_delay", juu.g(defpackage.adax.J()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__start_request_from_md_retry_limit_after_not_yet_started", juu.g(defpackage.adax.L()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__start_request_from_md_retry_limit_after_already_started", juu.g(defpackage.adax.K()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__add_is_hidden_ssid_to_network_request", java.lang.String.valueOf(defpackage.adax.aa()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__specify_wifi_frequency_if_available", java.lang.String.valueOf(defpackage.adax.bc()));
        v(printWriter, "long", "WirelessProjectionInGearhead__frequency_list_max_size", java.lang.Long.valueOf(defpackage.adax.g()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__wifi_frequency_saturation_coefficient", java.lang.Long.valueOf(defpackage.adax.t()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "WirelessProjectionInGearhead__invalid_bt_device_types", juu.u(defpackage.adax.T()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__disable_manual_network_scan", java.lang.String.valueOf(defpackage.adax.ao()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__disable_dual_sta_when_hotspot", java.lang.String.valueOf(defpackage.adax.an()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__enable_dual_sta", java.lang.String.valueOf(defpackage.adax.at()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__fix_anr_in_managing_profile_proxy_v2", java.lang.String.valueOf(defpackage.adax.az()));
        v(printWriter, "long", "WirelessProjectionInGearhead__profile_proxy_thread_timeout_ms", java.lang.Long.valueOf(defpackage.adax.n()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__retain_proxies_till_stop", java.lang.String.valueOf(defpackage.adax.aX()));
        v(printWriter, "long", "WirelessProjectionInGearhead__tracker_polling_timeout", java.lang.Long.valueOf(defpackage.adax.s()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__ignore_missing_permission_crash", java.lang.String.valueOf(defpackage.adax.aE()));
        v(printWriter, "long", "WirelessProjectionInGearhead__car_absence_timeout_ms", java.lang.Long.valueOf(defpackage.adax.d()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__require_profile_for_spark_when_tracking_car_absence", java.lang.String.valueOf(defpackage.adax.aU()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__allow_acl_for_rfcomm_when_tracking_car_absence", java.lang.String.valueOf(defpackage.adax.ad()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__allow_acl_for_associated_device_when_tracking_car_absence", java.lang.String.valueOf(defpackage.adax.ac()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__filter_profile_connection_by_acl", java.lang.String.valueOf(defpackage.adax.ay()));
        v(printWriter, "long", "WirelessProjectionInGearhead__frequency_cache_timeout_ms", java.lang.Long.valueOf(defpackage.adax.f()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__enable_timeout_for_acl_connected_bluetooth_device", java.lang.String.valueOf(defpackage.adax.au()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__simplify_start_projection_from_wbr_to_wsss", java.lang.String.valueOf(defpackage.adax.ba()));
        v(printWriter, "long", "WirelessProjectionInGearhead__max_network_connection_attempts", java.lang.Long.valueOf(defpackage.adax.m()).toString());
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__first_network_connection_attempt_duration", juu.g(defpackage.adax.C()));
        v(printWriter, "com.google.protobuf.Duration", "WirelessProjectionInGearhead__max_network_connection_duration", juu.g(defpackage.adax.F()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__omit_bssid_in_network_request", java.lang.String.valueOf(defpackage.adax.aM()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__no_bssid_validation", java.lang.String.valueOf(defpackage.adax.aL()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__bt_manager_wake_lock", java.lang.String.valueOf(defpackage.adax.ag()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__install_wifi_scan_receiver_kill_switch", java.lang.String.valueOf(defpackage.adax.aF()));
        v(printWriter, "long", "WirelessProjectionInGearhead__legacy_network_request_timeout_ms", java.lang.Long.valueOf(defpackage.adax.k()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__legacy_network_request_retries", java.lang.Long.valueOf(defpackage.adax.i()).toString());
        v(printWriter, "long", "WirelessProjectionInGearhead__legacy_network_request_retry_delay_ms", java.lang.Long.valueOf(defpackage.adax.j()).toString());
        v(printWriter, "boolean", "WirelessProjectionInGearhead__ignore_acl_from_ble", java.lang.String.valueOf(defpackage.adax.aB()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__disconnect_wifi_network_on_user_bye_bye", java.lang.String.valueOf(defpackage.adax.ap()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__do_not_retry_wifi_after_local_only_user_reject", java.lang.String.valueOf(defpackage.adax.as()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__raise_gearhead_connection_status_notification_channel_importance_to_high", java.lang.String.valueOf(defpackage.adax.aP()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__do_not_retry_wifi_after_local_only_disconnection", java.lang.String.valueOf(defpackage.adax.ar()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__do_not_automatically_renable_wifi_adapter", java.lang.String.valueOf(defpackage.adax.aq()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__read_bluetooth_disconnected_reason_from_intent", java.lang.String.valueOf(defpackage.adax.aR()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__read_bluetooth_disconnected_reason_from_callback", java.lang.String.valueOf(defpackage.adax.aQ()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__check_local_network_permission_in_wifi_bluetooth_receiver_kill_switch", java.lang.String.valueOf(defpackage.adax.ah()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__binder_skip_usb_monitoring_for_wifi", java.lang.String.valueOf(defpackage.adax.af()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__send_setup_event_before_network_disconnect_on_bye_bye_kill_switch", java.lang.String.valueOf(defpackage.adax.aY()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__enable_wireless_bt_mac_fix", java.lang.String.valueOf(defpackage.adax.av()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__teardown_wireless_setup_on_unbond_enabled", java.lang.String.valueOf(defpackage.adax.be()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "WirelessProjectionInGearhead__connect_head_unit_model_markers", juu.u(defpackage.adax.S()));
        v(printWriter, "boolean", "WirelessProjectionInGearhead__teardown_wireless_setup_on_unbond_for_connect_kill_switch", java.lang.String.valueOf(defpackage.adax.bf()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "WirelessMonitorMode__package_allow_list_proto", juu.m(adau.b()));
        v(printWriter, "long", "WirelessLatencyMonitor__probe_interval_ms", java.lang.Long.valueOf(adar.b()).toString());
        v(printWriter, "long", "WirelessLatencyMonitor__report_interval_ms", java.lang.Long.valueOf(adar.c()).toString());
        v(printWriter, "long", "WirelessLatencyMonitor__warning_threshold_ms", java.lang.Long.valueOf(adar.d()).toString());
        v(printWriter, "boolean", "WirelessHttpProxy__enabled", java.lang.String.valueOf(adao.d()));
        v(printWriter, "String", "WirelessHttpProxy__host_whitelist", adao.c());
        v(printWriter, "boolean", "WirelessBabysitter__updated_lifecycle_notifications_are_enabled", java.lang.String.valueOf(adal.c()));
        v(printWriter, "boolean", "Weather__preinstalled_frx_toggle_enabled", java.lang.String.valueOf(defpackage.adai.h()));
        v(printWriter, "long", "Weather__api_call_polling_interval_ms", java.lang.Long.valueOf(defpackage.adai.b()).toString());
        v(printWriter, "long", "Weather__api_call_retry_interval_ms", java.lang.Long.valueOf(defpackage.adai.c()).toString());
        v(printWriter, "long", "Weather__spatula_header_timeout_ms", java.lang.Long.valueOf(defpackage.adai.e()).toString());
        v(printWriter, "long", "Weather__auto_dismiss_threshold_ms", java.lang.Long.valueOf(defpackage.adai.d()).toString());
        v(printWriter, "long", "Weather__touch_update_threshold_millis", java.lang.Long.valueOf(defpackage.adai.f()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Watevra__host_max_api_level", juu.u(defpackage.adae.g()));
        v(printWriter, "long", "Watevra__host_car_app_library_latest_api_level", java.lang.Long.valueOf(defpackage.adae.b()).toString());
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Watevra__external_component_filter", juu.m(defpackage.adae.c()));
        v(printWriter, "boolean", "Watevra__speedbump_enabled", java.lang.String.valueOf(defpackage.adae.t()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Watevra__max_list_size", juu.u(defpackage.adae.j()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Watevra__max_grid_list_size", juu.u(defpackage.adae.i()));
        v(printWriter, "boolean", "Watevra__speedbump_map_interactivity_enabled", java.lang.String.valueOf(defpackage.adae.u()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlagList", "Watevra__car_hardware_headunit_filter_list", juu.n(defpackage.adae.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Watevra__max_pane_list_size", juu.u(defpackage.adae.k()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Watevra__max_route_preview_list_size", juu.u(defpackage.adae.l()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Watevra__max_template_stack_size", juu.u(defpackage.adae.m()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Watevra__projection_state_api_packages_allowed", juu.m(defpackage.adae.e()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Watevra__host_min_api_level", juu.u(defpackage.adae.h()));
        v(printWriter, "boolean", "Watevra__relayout_rowlist_when_selected_enabled", java.lang.String.valueOf(defpackage.adae.s()));
        v(printWriter, "boolean", "Watevra__transcription_enabled", java.lang.String.valueOf(defpackage.adae.v()));
        v(printWriter, "boolean", "Watevra__use_3p_turn_icon_in_cluster_but_not_hud_enabled", java.lang.String.valueOf(defpackage.adae.w()));
        v(printWriter, "boolean", "Watevra__foreground_search_fab_enabled", java.lang.String.valueOf(defpackage.adae.p()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Watevra__foreground_search_fab_component_denylist", juu.m(defpackage.adae.d()));
        v(printWriter, "boolean", "Watevra__disable_alphajump", java.lang.String.valueOf(defpackage.adae.o()));
        v(printWriter, "boolean", "Watevra__hide_minimized_state_template_view_when_on_stop_called", java.lang.String.valueOf(defpackage.adae.q()));
        v(printWriter, "boolean", "Watevra__primary_actions_on_coolwalk", java.lang.String.valueOf(defpackage.adae.r()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "WatermarkDisplay__serial_numbers_with_watermark_during_development", juu.t(defpackage.adab.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "WatermarkDisplay__serial_numbers_with_permanent_watermark", juu.t(defpackage.adab.b()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Voip__cp2_versioned_allow_list", juu.u(aczy.c()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Voip__calling_enabled_mesquite_apps_package_list", juu.m(aczy.b()));
        v(printWriter, "boolean", "VoiceInternalFeedback__enabled", java.lang.String.valueOf(aczv.c()));
        v(printWriter, "boolean", "VideoTimingControllerFeature__enable_video_timing_controller", java.lang.String.valueOf(defpackage.aczs.g()));
        v(printWriter, "boolean", "VideoTimingControllerFeature__enable_video_timing_controller_parked_exp", java.lang.String.valueOf(defpackage.aczs.h()));
        v(printWriter, "long", "VideoTimingControllerFeature__video_timing_controller_min_delay_ms", java.lang.Long.valueOf(defpackage.aczs.d()).toString());
        v(printWriter, "long", "VideoTimingControllerFeature__video_timing_controller_min_delay_parked_exp_ms", java.lang.Long.valueOf(defpackage.aczs.e()).toString());
        v(printWriter, "long", "VideoTimingControllerFeature__video_timing_controller_max_delay_ms", java.lang.Long.valueOf(defpackage.aczs.b()).toString());
        v(printWriter, "long", "VideoTimingControllerFeature__video_timing_controller_max_delay_parked_exp_ms", java.lang.Long.valueOf(defpackage.aczs.c()).toString());
        v(printWriter, "long", "VideoEncoderParams__key_frame_interval_wireless", java.lang.Long.valueOf(defpackage.aczp.m()).toString());
        v(printWriter, "long", "VideoEncoderParams__key_frame_interval_ackless", java.lang.Long.valueOf(defpackage.aczp.l()).toString());
        v(printWriter, "long", "VideoEncoderParams__max_qp_wireless", java.lang.Long.valueOf(defpackage.aczp.n()).toString());
        v(printWriter, "long", "VideoEncoderParams__min_qp_wireless", java.lang.Long.valueOf(defpackage.aczp.o()).toString());
        v(printWriter, "boolean", "VideoEncoderParams__enable_max_h264_encoder_compatibility_fast_track", java.lang.String.valueOf(defpackage.aczp.u()));
        v(printWriter, "boolean", "VideoEncoderParams__enable_max_h264_encoder_compatibility", java.lang.String.valueOf(defpackage.aczp.t()));
        v(printWriter, "double", "VideoEncoderParams__sixty_fps_bitrate_multiplier", java.lang.Double.valueOf(defpackage.aczp.e()).toString());
        v(printWriter, "double", "VideoEncoderParams__sixty_fps_bitrate_multiplier_h265", java.lang.Double.valueOf(defpackage.aczp.f()).toString());
        v(printWriter, "double", "VideoEncoderParams__bitrate_adjustment_exponent", java.lang.Double.valueOf(defpackage.aczp.d()).toString());
        v(printWriter, "double", "VideoEncoderParams__adaptive_bitrate_gradient_h264", java.lang.Double.valueOf(defpackage.aczp.b()).toString());
        v(printWriter, "long", "VideoEncoderParams__adaptive_bitrate_baseline_h264", java.lang.Long.valueOf(defpackage.aczp.h()).toString());
        v(printWriter, "long", "VideoEncoderParams__adaptive_bitrate_minimal_h264", java.lang.Long.valueOf(defpackage.aczp.j()).toString());
        v(printWriter, "double", "VideoEncoderParams__adaptive_bitrate_gradient_h265", java.lang.Double.valueOf(defpackage.aczp.c()).toString());
        v(printWriter, "long", "VideoEncoderParams__adaptive_bitrate_baseline_h265", java.lang.Long.valueOf(defpackage.aczp.i()).toString());
        v(printWriter, "long", "VideoEncoderParams__adaptive_bitrate_minimal_h265", java.lang.Long.valueOf(defpackage.aczp.k()).toString());
        v(printWriter, "double", "VideoEncoderParams__throw_encoder_errors_percent", java.lang.Double.valueOf(defpackage.aczp.g()).toString());
        v(printWriter, "boolean", "VideoEncoderParams__force_software_codec", java.lang.String.valueOf(defpackage.aczp.y()));
        v(printWriter, "boolean", "VideoEncoderParams__enable_roi_encoding", java.lang.String.valueOf(defpackage.aczp.v()));
        v(printWriter, "long", "VideoEncoderParams__roi_qp_offset", java.lang.Long.valueOf(defpackage.aczp.p()).toString());
        v(printWriter, "long", "VideoEncoderParams__roi_qp_offset_margin", java.lang.Long.valueOf(defpackage.aczp.q()).toString());
        v(printWriter, "boolean", "VideoEncoderParams__disable_h265_encoder_checker", java.lang.String.valueOf(defpackage.aczp.s()));
        v(printWriter, "boolean", "VideoEncoderParams__extend_avc_support", java.lang.String.valueOf(defpackage.aczp.x()));
        v(printWriter, "boolean", "VideoEncoderParams__enforce_supported_codec_dimensions", java.lang.String.valueOf(defpackage.aczp.w()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "VideoDiagnosticsFeature__video_latency_histogram_intervals_ms", juu.t(defpackage.aczm.d()));
        v(printWriter, "boolean", "VideoDiagnosticsFeature__video_stats_period_focused_time_only", java.lang.String.valueOf(defpackage.aczm.f()));
        v(printWriter, "long", "VideoDiagnosticsFeature__video_stats_logging_period_ms", java.lang.Long.valueOf(defpackage.aczm.c()).toString());
        v(printWriter, "long", "VideoDiagnosticsFeature__max_media_stats_reports_to_dump", java.lang.Long.valueOf(defpackage.aczm.b()).toString());
        v(printWriter, "boolean", "VersionTenFeature__version_ten_launch_param", java.lang.String.valueOf(aczj.c()));
        v(printWriter, "boolean", "VanagonDeprecation__migrate_navigation_status_bar_notification_away_from_stream_item", java.lang.String.valueOf(defpackage.aczg.c()));
        v(printWriter, "boolean", "UxPrototype__enabled", java.lang.String.valueOf(defpackage.aczd.d()));
        v(printWriter, "String", "UxPrototype__url", defpackage.aczd.c());
        v(printWriter, "boolean", "UserEducation__send_gearhead_event_enabled", java.lang.String.valueOf(defpackage.acza.L()));
        v(printWriter, "boolean", "UserEducation__roca_classic_upgrade_tooltip_first_run_is_dry_run", java.lang.String.valueOf(defpackage.acza.K()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_first_run_enabled", java.lang.String.valueOf(defpackage.acza.u()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_first_run_is_dry_run", java.lang.String.valueOf(defpackage.acza.v()));
        v(printWriter, "long", "UserEducation__assistant_tooltip_first_run_copy", java.lang.Long.valueOf(defpackage.acza.b()).toString());
        v(printWriter, "long", "UserEducation__assistant_tooltip_first_run_image", java.lang.Long.valueOf(defpackage.acza.c()).toString());
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_dialer_first_open_enabled", java.lang.String.valueOf(defpackage.acza.s()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_dialer_first_open_is_dry_run", java.lang.String.valueOf(defpackage.acza.t()));
        v(printWriter, "String", "UserEducation__assistant_tooltip_media_open_iteration_string", defpackage.acza.r());
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_launcher_open_iteration_enabled", java.lang.String.valueOf(defpackage.acza.w()));
        v(printWriter, "String", "UserEducation__assistant_tooltip_launcher_open_iteration_string", defpackage.acza.q());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "UserEducation__assistant_tooltip_openapp_media_packages", juu.u(defpackage.acza.o()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_start_of_navigation_is_dry_run", java.lang.String.valueOf(defpackage.acza.D()));
        v(printWriter, "long", "UserEducation__assistant_tooltip_start_of_navigation_threshold_seconds", java.lang.Long.valueOf(defpackage.acza.k()).toString());
        v(printWriter, "long", "UserEducation__assistant_tooltip_start_of_navigation_text_copy", java.lang.Long.valueOf(defpackage.acza.j()).toString());
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_phone_call_ended_enabled", java.lang.String.valueOf(defpackage.acza.B()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_phone_call_ended_is_dry_run", java.lang.String.valueOf(defpackage.acza.C()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_nth_run_enabled", java.lang.String.valueOf(defpackage.acza.z()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_nth_run_is_dry_run", java.lang.String.valueOf(defpackage.acza.A()));
        v(printWriter, "long", "UserEducation__assistant_tooltip_nth_run_copy", java.lang.Long.valueOf(defpackage.acza.g()).toString());
        v(printWriter, "long", "UserEducation__assistant_tooltip_nth_run_image", java.lang.Long.valueOf(defpackage.acza.i()).toString());
        v(printWriter, "long", "UserEducation__assistant_tooltip_nth_run_count", java.lang.Long.valueOf(defpackage.acza.h()).toString());
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_nth_run_button_enabled", java.lang.String.valueOf(defpackage.acza.x()));
        v(printWriter, "boolean", "UserEducation__assistant_tooltip_nth_run_button_is_dry_run", java.lang.String.valueOf(defpackage.acza.y()));
        v(printWriter, "long", "UserEducation__assistant_tooltip_nth_run_button_copy", java.lang.Long.valueOf(defpackage.acza.d()).toString());
        v(printWriter, "long", "UserEducation__assistant_tooltip_nth_run_button_image", java.lang.Long.valueOf(defpackage.acza.f()).toString());
        v(printWriter, "long", "UserEducation__assistant_tooltip_nth_run_button_count", java.lang.Long.valueOf(defpackage.acza.e()).toString());
        v(printWriter, "boolean", "UserEducation__notification_tooltip_first_run_enabled", java.lang.String.valueOf(defpackage.acza.G()));
        v(printWriter, "boolean", "UserEducation__notification_tooltip_first_run_is_dry_run", java.lang.String.valueOf(defpackage.acza.H()));
        v(printWriter, "boolean", "UserEducation__notification_tooltip_new_notification_nth_run_enabled", java.lang.String.valueOf(defpackage.acza.I()));
        v(printWriter, "boolean", "UserEducation__notification_tooltip_new_notification_nth_run_is_dry_run", java.lang.String.valueOf(defpackage.acza.J()));
        v(printWriter, "long", "UserEducation__notification_tooltip_new_notification_nth_run_count", java.lang.Long.valueOf(defpackage.acza.m()).toString());
        v(printWriter, "boolean", "UserEducation__launcher_tooltip_nth_run_enabled", java.lang.String.valueOf(defpackage.acza.E()));
        v(printWriter, "long", "UserEducation__launcher_tooltip_nth_run_count", java.lang.Long.valueOf(defpackage.acza.l()).toString());
        v(printWriter, "boolean", "UserEducation__launcher_tooltip_nth_run_is_is_dry_run", java.lang.String.valueOf(defpackage.acza.F()));
        v(printWriter, "long", "UserEducation__start_of_drive_opportunity_delay", java.lang.Long.valueOf(defpackage.acza.n()).toString());
        v(printWriter, "boolean", "UsbBabysitter__switch_usb_function_on_bluetooth_connect", java.lang.String.valueOf(defpackage.acyx.n()));
        v(printWriter, "boolean", "UsbBabysitter__switch_usb_function_on_usb_disconnect", java.lang.String.valueOf(defpackage.acyx.o()));
        v(printWriter, "long", "UsbBabysitter__default_usb_function", java.lang.Long.valueOf(defpackage.acyx.b()).toString());
        v(printWriter, "boolean", "UsbBabysitter__start_from_wireless_service", java.lang.String.valueOf(defpackage.acyx.m()));
        v(printWriter, "com.google.android.gms.car.mendel.connectivity.MendelConfigurableConnectivityEventDetector.MendelConfigurableEventDetector", "UsbBabysitter__mendel_configurable_event_detector_config", juu.f(defpackage.acyx.i()));
        v(printWriter, "boolean", "UsbBabysitter__use_combined_usb_datasource", java.lang.String.valueOf(defpackage.acyx.r()));
        v(printWriter, "long", "UsbBabysitter__usb_mode_switch_initial_accessory_timeout_ms", java.lang.Long.valueOf(defpackage.acyx.e()).toString());
        v(printWriter, "long", "UsbBabysitter__usb_mode_switch_saved_mode_accessory_timeout_ms", java.lang.Long.valueOf(defpackage.acyx.f()).toString());
        v(printWriter, "long", "UsbBabysitter__usb_mode_switch_disable_token", java.lang.Long.valueOf(defpackage.acyx.d()).toString());
        v(printWriter, "boolean", "UsbBabysitter__usb_mode_switch_set_saved_mode_when_not_connected", java.lang.String.valueOf(defpackage.acyx.q()));
        v(printWriter, "boolean", "UsbBabysitter__usb_mode_switch_q3_updates", java.lang.String.valueOf(defpackage.acyx.p()));
        v(printWriter, "long", "UsbBabysitter__usb_recovery_v2_accessory_timeout_ms", java.lang.Long.valueOf(defpackage.acyx.g()).toString());
        v(printWriter, "long", "UsbBabysitter__stop_monitoring_delay_ms", java.lang.Long.valueOf(defpackage.acyx.c()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "UsbBabysitter__usb_recovery_functions", juu.t(defpackage.acyx.j()));
        v(printWriter, "com.google.android.gms.car.mendel.connectivity.MendelConfigurableConnectivityEventDetector.CarInfoList", "UsbBabysitter__a2dp_fix_car_list", juu.e(defpackage.acyx.h()));
        v(printWriter, "boolean", "UsbBabysitter__enable_a2dp_at_projection_end", java.lang.String.valueOf(defpackage.acyx.l()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "UnsupportedNotification__telemetry_packages", juu.m(defpackage.acyu.b()));
        v(printWriter, "boolean", "UnknownSources__allow_full_screen_apps", java.lang.String.valueOf(defpackage.acyr.c()));
        v(printWriter, "boolean", "UnifiedSmsMessagingInfo__enabled", java.lang.String.valueOf(acyo.c()));
        v(printWriter, "boolean", "Troubleshooter__feedback_reporting_enabled", java.lang.String.valueOf(acyl.g()));
        v(printWriter, "boolean", "Troubleshooter__interactive_troubleshooter_enabled", java.lang.String.valueOf(acyl.h()));
        v(printWriter, "String", "Troubleshooter__flaky_usb_detector_resolution_url", acyl.c());
        v(printWriter, "boolean", "Troubleshooter__no_hfp_detector_enabled", java.lang.String.valueOf(acyl.i()));
        v(printWriter, "String", "Troubleshooter__usb_resolution_url", acyl.d());
        v(printWriter, "boolean", "Troubleshooter__dismiss_interactive_troubleshooter_notification_kill_switch", java.lang.String.valueOf(acyl.f()));
        v(printWriter, "boolean", "Troubleshooter__alert_interactive_troubleshooter_notification_kill_switch", java.lang.String.valueOf(acyl.e()));
        v(printWriter, "boolean", "TouchpadUiNavigation__force_enabled", java.lang.String.valueOf(defpackage.acyi.i()));
        v(printWriter, "boolean", "TouchpadUiNavigation__tuning_enabled", java.lang.String.valueOf(defpackage.acyi.j()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "TouchpadUiNavigation__sensitivity_override_car_list", juu.u(defpackage.acyi.g()));
        v(printWriter, "long", "TouchpadUiNavigation__base_fraction", java.lang.Long.valueOf(defpackage.acyi.b()).toString());
        v(printWriter, "long", "TouchpadUiNavigation__focus_navigation_history_max_age_ms", java.lang.Long.valueOf(defpackage.acyi.c()).toString());
        v(printWriter, "long", "TouchpadUiNavigation__focus_navigation_history_max_size", java.lang.Long.valueOf(defpackage.acyi.d()).toString());
        v(printWriter, "long", "TouchpadUiNavigation__min_size_mm", java.lang.Long.valueOf(defpackage.acyi.e()).toString());
        v(printWriter, "long", "TouchpadUiNavigation__multimove_penalty_mm", java.lang.Long.valueOf(defpackage.acyi.f()).toString());
        v(printWriter, "double", "Telemetry__high_volume_events_sampling_rate", java.lang.Double.valueOf(defpackage.acyf.b()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "Telemetry__high_volume_ui_events_list", juu.s(defpackage.acyf.d()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "Telemetry__high_volume_non_ui_events_list", juu.s(defpackage.acyf.c()));
        v(printWriter, "boolean", "SystemUi__assistant_scrim_debug_background_color_enabled", java.lang.String.valueOf(defpackage.acyc.W()));
        v(printWriter, "boolean", "SystemUi__csat_postdrive_new_ui_enabled", java.lang.String.valueOf(defpackage.acyc.ae()));
        v(printWriter, "boolean", "SystemUi__predictive_back_key_injection_kill_switch", java.lang.String.valueOf(defpackage.acyc.az()));
        v(printWriter, "boolean", "SystemUi__quick_settings_enabled", java.lang.String.valueOf(defpackage.acyc.aE()));
        v(printWriter, "boolean", "SystemUi__status_bar_theme_overlay_kill_switch", java.lang.String.valueOf(defpackage.acyc.aM()));
        v(printWriter, "boolean", "SystemUi__use_default_device_for_permissions_kill_switch", java.lang.String.valueOf(defpackage.acyc.aX()));
        v(printWriter, "boolean", "SystemUi__suppress_startup_hun_for_template_and_sdk_apps_kill_switch", java.lang.String.valueOf(defpackage.acyc.aR()));
        v(printWriter, "boolean", "SystemUi__stop_keep_alive_service_before_callback_kill_switch", java.lang.String.valueOf(defpackage.acyc.aO()));
        v(printWriter, "boolean", "SystemUi__local_focus_mode_kill_switch", java.lang.String.valueOf(defpackage.acyc.au()));
        v(printWriter, "boolean", "SystemUi__vertical_rail_widget_enabled_all", java.lang.String.valueOf(defpackage.acyc.bd()));
        v(printWriter, "boolean", "SystemUi__vertical_rail_widget_enabled", java.lang.String.valueOf(defpackage.acyc.bc()));
        v(printWriter, "boolean", "SystemUi__dnd_suppress_notifications_enabled", java.lang.String.valueOf(defpackage.acyc.ah()));
        v(printWriter, "boolean", "SystemUi__wallpaper_backdrop_enabled", java.lang.String.valueOf(defpackage.acyc.be()));
        v(printWriter, "boolean", "SystemUi__display_bell_when_status_elements_hidden", java.lang.String.valueOf(defpackage.acyc.ag()));
        v(printWriter, "long", "SystemUi__notification_badge_with_count_millis_duration", java.lang.Long.valueOf(defpackage.acyc.q()).toString());
        v(printWriter, "long", "SystemUi__notification_center_scrim_debounce_duration_millis", java.lang.Long.valueOf(defpackage.acyc.r()).toString());
        v(printWriter, "long", "SystemUi__thermal_wireless_charging_threshold", java.lang.Long.valueOf(defpackage.acyc.A()).toString());
        v(printWriter, "long", "SystemUi__thermal_flashlight_threshold", java.lang.Long.valueOf(defpackage.acyc.y()).toString());
        v(printWriter, "long", "SystemUi__thermal_camera_threshold", java.lang.Long.valueOf(defpackage.acyc.w()).toString());
        v(printWriter, "long", "SystemUi__thermal_display_threshold", java.lang.Long.valueOf(defpackage.acyc.x()).toString());
        v(printWriter, "long", "SystemUi__thermal_hotspot_threshold", java.lang.Long.valueOf(defpackage.acyc.z()).toString());
        v(printWriter, "long", "SystemUi__thermal_battery_temperature_severe_threshold", java.lang.Long.valueOf(defpackage.acyc.v()).toString());
        v(printWriter, "long", "SystemUi__compat_mode_min_android_version", java.lang.Long.valueOf(defpackage.acyc.d()).toString());
        v(printWriter, "long", "SystemUi__compat_mode_min_trigger_thermal_status", java.lang.Long.valueOf(defpackage.acyc.e()).toString());
        v(printWriter, "boolean", "SystemUi__compat_mode_kill_switch", java.lang.String.valueOf(defpackage.acyc.ab()));
        v(printWriter, "boolean", "SystemUi__use_in_process_shared_prefs", java.lang.String.valueOf(defpackage.acyc.aZ()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__in_process_shared_prefs_keys_to_migrate", juu.u(defpackage.acyc.L()));
        v(printWriter, "long", "SystemUi__hun_default_heads_up_timeout_ms", java.lang.Long.valueOf(defpackage.acyc.h()).toString());
        v(printWriter, "long", "SystemUi__hun_delay_poll_time_ms", java.lang.Long.valueOf(defpackage.acyc.i()).toString());
        v(printWriter, "long", "SystemUi__twin_smarts_mode", java.lang.Long.valueOf(defpackage.acyc.B()).toString());
        v(printWriter, "boolean", "SystemUi__inertial_scrolling_enabled", java.lang.String.valueOf(defpackage.acyc.ar()));
        v(printWriter, "long", "SystemUi__media_hun_in_rail_widget_timeout_ms", java.lang.Long.valueOf(defpackage.acyc.l()).toString());
        v(printWriter, "long", "SystemUi__media_hun_timeout_ms", java.lang.Long.valueOf(defpackage.acyc.m()).toString());
        v(printWriter, "boolean", "SystemUi__store_default_nav_app_on_app_start_kill_switch", java.lang.String.valueOf(defpackage.acyc.aP()));
        v(printWriter, "boolean", "SystemUi__navigation_cluster_allow_duplicate_updates", java.lang.String.valueOf(defpackage.acyc.aw()));
        v(printWriter, "long", "SystemUi__navigation_cluster_turn_event_cache_ttl", java.lang.Long.valueOf(defpackage.acyc.p()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__oem_exit_display_name_label_make_model_year_denylist", juu.u(defpackage.acyc.M()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__oem_exit_icon_exclude_list", juu.u(defpackage.acyc.O()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionList", "SystemUi__oem_exit_remove_list", juu.i(defpackage.acyc.H()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__oem_exit_label_denylist", juu.u(defpackage.acyc.P()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__oem_exit_label_make_model_year_denylist", juu.u(defpackage.acyc.Q()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__oem_exit_pretty_print_label_denylist", juu.u(defpackage.acyc.R()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__oem_exit_force_pretty_print_label", juu.u(defpackage.acyc.N()));
        v(printWriter, "boolean", "SystemUi__check_height_in_semi_wide_kill_switch", java.lang.String.valueOf(defpackage.acyc.X()));
        v(printWriter, "long", "SystemUi__widescreen_breakpoint_dp", java.lang.Long.valueOf(defpackage.acyc.G()).toString());
        v(printWriter, "long", "SystemUi__portrait_breakpoint_dp", java.lang.Long.valueOf(defpackage.acyc.s()).toString());
        v(printWriter, "long", "SystemUi__semi_widescreen_breakpoint_dp", java.lang.Long.valueOf(defpackage.acyc.t()).toString());
        v(printWriter, "boolean", "SystemUi__hero_large_canonical_layout_enabled_kill_switch", java.lang.String.valueOf(defpackage.acyc.ap()));
        v(printWriter, "long", "SystemUi__short_portrait_breakpoint_dp", java.lang.Long.valueOf(defpackage.acyc.u()).toString());
        v(printWriter, "long", "SystemUi__narrow_portrait_width_threshold_dp", java.lang.Long.valueOf(defpackage.acyc.o()).toString());
        v(printWriter, "boolean", "SystemUi__narrow_portrait_enabled_kill_switch", java.lang.String.valueOf(defpackage.acyc.av()));
        v(printWriter, "double", "SystemUi__widescreen_aspect_ratio_breakpoint", java.lang.Double.valueOf(defpackage.acyc.b()).toString());
        v(printWriter, "double", "SystemUi__widescreen_aspect_ratio_breakpoint_for_portrait", java.lang.Double.valueOf(defpackage.acyc.c()).toString());
        v(printWriter, "boolean", "SystemUi__wide_portrait_as_widescreen_enabled_kill_switch", java.lang.String.valueOf(defpackage.acyc.bf()));
        v(printWriter, "boolean", "SystemUi__cielo_scrim_with_stable_area_cutout_enabled", java.lang.String.valueOf(defpackage.acyc.Y()));
        v(printWriter, "boolean", "SystemUi__cielo_scrim_with_stable_area_cutout_variable_scrim_enabled", java.lang.String.valueOf(defpackage.acyc.Z()));
        v(printWriter, "long", "SystemUi__irregular_display_scrim_inset_diff_threshold_dp", java.lang.Long.valueOf(defpackage.acyc.k()).toString());
        v(printWriter, "long", "SystemUi__horizontal_rail_canonical_breakpoint_dp", java.lang.Long.valueOf(defpackage.acyc.g()).toString());
        v(printWriter, "long", "SystemUi__wallpaper_backdrop_threshold", java.lang.Long.valueOf(defpackage.acyc.E()).toString());
        v(printWriter, "boolean", "SystemUi__remove_rail_pre_draw_listeners", java.lang.String.valueOf(defpackage.acyc.aG()));
        v(printWriter, "boolean", "SystemUi__preload_voice_plate_enabled_kill_switch", java.lang.String.valueOf(defpackage.acyc.aA()));
        v(printWriter, "boolean", "SystemUi__suppress_bluetooth_illegal_argument_exception", java.lang.String.valueOf(defpackage.acyc.aQ()));
        v(printWriter, "boolean", "SystemUi__enable_gemini_in_aap_kill_switch", java.lang.String.valueOf(defpackage.acyc.ak()));
        v(printWriter, "boolean", "SystemUi__persist_projection_configuration_context", java.lang.String.valueOf(defpackage.acyc.ay()));
        v(printWriter, "long", "SystemUi__media_next_restarts_assistant_delay_ms", java.lang.Long.valueOf(defpackage.acyc.n()).toString());
        v(printWriter, "boolean", "SystemUi__ignore_assistant_close_if_recently_opened_kill_switch", java.lang.String.valueOf(defpackage.acyc.aq()));
        v(printWriter, "long", "SystemUi__ignore_assistant_close_if_recently_opened_timeout_millis", java.lang.Long.valueOf(defpackage.acyc.j()).toString());
        v(printWriter, "boolean", "SystemUi__unify_lifecycle_death_recipients", java.lang.String.valueOf(defpackage.acyc.aS()));
        v(printWriter, "boolean", "SystemUi__use_internal_context", java.lang.String.valueOf(defpackage.acyc.ba()));
        v(printWriter, "long", "SystemUi__use_cal_voice_plate_for_gemini_min_gsa_version", java.lang.Long.valueOf(defpackage.acyc.D()).toString());
        v(printWriter, "boolean", "SystemUi__use_cal_voice_plate_for_gemini", java.lang.String.valueOf(defpackage.acyc.aU()));
        v(printWriter, "long", "SystemUi__use_cal_voice_plate_for_assistant_min_gsa_version", java.lang.Long.valueOf(defpackage.acyc.C()).toString());
        v(printWriter, "boolean", "SystemUi__use_cal_voice_plate_for_assistant", java.lang.String.valueOf(defpackage.acyc.aT()));
        v(printWriter, "boolean", "SystemUi__force_reload_template_on_palette_change_kill_switch", java.lang.String.valueOf(defpackage.acyc.ao()));
        v(printWriter, "boolean", "SystemUi__use_recycle_protected_image_kill_switch", java.lang.String.valueOf(defpackage.acyc.bb()));
        v(printWriter, "boolean", "SystemUi__satellite_network_status", java.lang.String.valueOf(defpackage.acyc.aK()));
        v(printWriter, "boolean", "SystemUi__process_font_weight_adjustment_configuration_change_kill_switch", java.lang.String.valueOf(defpackage.acyc.aB()));
        v(printWriter, "boolean", "SystemUi__use_compose_rail", java.lang.String.valueOf(defpackage.acyc.aW()));
        v(printWriter, "boolean", "SystemUi__allow_hun_after_recycle_kill_switch", java.lang.String.valueOf(defpackage.acyc.U()));
        v(printWriter, "boolean", "SystemUi__enable_initial_focus_kill_switch", java.lang.String.valueOf(defpackage.acyc.al()));
        v(printWriter, "boolean", "SystemUi__process_hardware_key_on_action_up", java.lang.String.valueOf(defpackage.acyc.aC()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionList", "SystemUi__phone_wallpaper_in_launcher_denylist", juu.i(defpackage.acyc.I()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionList", "SystemUi__wallpaper_backdrop_head_unit_denylist", juu.i(defpackage.acyc.J()));
        v(printWriter, "boolean", "SystemUi__use_denylist_to_prevent_wallpaper_backdrop_from_showing_kill_switch", java.lang.String.valueOf(defpackage.acyc.aY()));
        v(printWriter, "boolean", "SystemUi__remove_notification_center_override_for_status_bar_kill_switch", java.lang.String.valueOf(defpackage.acyc.aF()));
        v(printWriter, "boolean", "SystemUi__use_car_icon_for_notification_kill_switch", java.lang.String.valueOf(defpackage.acyc.aV()));
        v(printWriter, "boolean", "SystemUi__open_phone_settings_from_notification_kill_switch", java.lang.String.valueOf(defpackage.acyc.ax()));
        v(printWriter, "boolean", "SystemUi__initialize_car_info_cache_faster_kill_switch", java.lang.String.valueOf(defpackage.acyc.as()));
        v(printWriter, "boolean", "SystemUi__compose_notification_card_large_image_uri_enabled", java.lang.String.valueOf(defpackage.acyc.ad()));
        v(printWriter, "boolean", "SystemUi__stack_hun_buttons_if_actions_contain_text_enabled", java.lang.String.valueOf(defpackage.acyc.aL()));
        v(printWriter, "boolean", "SystemUi__edge_to_edge_maps_enabled", java.lang.String.valueOf(defpackage.acyc.aj()));
        v(printWriter, "boolean", "SystemUi__fallback_to_draw_with_canvas_kill_switch", java.lang.String.valueOf(defpackage.acyc.an()));
        v(printWriter, "boolean", "SystemUi__sanitize_gh_icon_intrinsic_size_kill_switch", java.lang.String.valueOf(defpackage.acyc.aJ()));
        v(printWriter, "boolean", "SystemUi__alarm_clock_hun_support", java.lang.String.valueOf(defpackage.acyc.T()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemUi__allowlisted_clock_packages", juu.u(defpackage.acyc.K()));
        v(printWriter, "boolean", "SystemUi__ensure_voice_session_end_notified_to_listeners_kill_switch", java.lang.String.valueOf(defpackage.acyc.am()));
        v(printWriter, "boolean", "SystemUi__dump_dhu_config_kill_switch", java.lang.String.valueOf(defpackage.acyc.ai()));
        v(printWriter, "boolean", "SystemUi__developer_settings_warning_dialog_changes_kill_switch", java.lang.String.valueOf(defpackage.acyc.af()));
        v(printWriter, "boolean", "SystemUi__project_accordion_enable", java.lang.String.valueOf(defpackage.acyc.aD()));
        v(printWriter, "boolean", "SystemUi__rhd_flip_enable", java.lang.String.valueOf(defpackage.acyc.aH()));
        v(printWriter, "boolean", "SystemUi__stop_immersives_on_content_change", java.lang.String.valueOf(defpackage.acyc.aN()));
        v(printWriter, "boolean", "SystemUi__allow_missing_core_apps", java.lang.String.valueOf(defpackage.acyc.V()));
        v(printWriter, "boolean", "SystemUi__rounded_corner_mask_remove_connected_check_kill_switch", java.lang.String.valueOf(defpackage.acyc.aI()));
        v(printWriter, "long", "SystemUi__full_maps_and_dashboard_width_threshold_dp", java.lang.Long.valueOf(defpackage.acyc.f()).toString());
        v(printWriter, "boolean", "SystemUi__clear_aaf_cache_at_projection_start_kill_switch", java.lang.String.valueOf(defpackage.acyc.aa()));
        v(printWriter, "long", "SystemUi__wide_dashboard_min_map_height_dp", java.lang.Long.valueOf(defpackage.acyc.F()).toString());
        v(printWriter, "boolean", "SystemUi__compose_hun_focus_handling_kill_switch", java.lang.String.valueOf(defpackage.acyc.ac()));
        v(printWriter, "boolean", "SystemUi__jimothy_mode_enabled", java.lang.String.valueOf(defpackage.acyc.at()));
        v(printWriter, "long", "SystemHealthFeature__odpm_api_refresh_interval_ms", java.lang.Long.valueOf(acxz.b()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemHealthFeature__wifi_power_rails", juu.u(acxz.i()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemHealthFeature__gpu_power_rails", juu.u(acxz.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemHealthFeature__modem_power_rails", juu.u(acxz.g()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemHealthFeature__cpu_big_power_rails", juu.u(acxz.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemHealthFeature__cpu_mid_power_rails", juu.u(acxz.e()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemHealthFeature__cpu_little_power_rails", juu.u(acxz.d()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SystemHealthFeature__soc_power_rails", juu.u(acxz.h()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "SystemAppsInRail__denied_aps_list", juu.m(acxw.b()));
        v(printWriter, "long", "SynchronizedMediaFeature__audio_buffer_limit_ms", java.lang.Long.valueOf(defpackage.acxt.b()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__audio_buffer_limit_parked_exp_ms", java.lang.Long.valueOf(defpackage.acxt.d()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__audio_buffer_limit_ms_tts", java.lang.Long.valueOf(defpackage.acxt.c()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__audio_buffer_limit_parked_exp_ms_tts", java.lang.Long.valueOf(defpackage.acxt.e()).toString());
        v(printWriter, "boolean", "SynchronizedMediaFeature__enable_sync", java.lang.String.valueOf(defpackage.acxt.w()));
        v(printWriter, "boolean", "SynchronizedMediaFeature__enable_sync_parked_exp", java.lang.String.valueOf(defpackage.acxt.x()));
        v(printWriter, "long", "SynchronizedMediaFeature__max_lag_tolerance_ms", java.lang.Long.valueOf(defpackage.acxt.j()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__max_lag_tolerance_parked_exp_ms", java.lang.Long.valueOf(defpackage.acxt.k()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__sync_interval_ms", java.lang.Long.valueOf(defpackage.acxt.q()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__sync_interval_parked_exp_ms", java.lang.Long.valueOf(defpackage.acxt.r()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__max_audio_delay_allowed_ms", java.lang.Long.valueOf(defpackage.acxt.h()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__max_audio_delay_allowed_parked_exp_ms", java.lang.Long.valueOf(defpackage.acxt.i()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__max_video_delay_allowed_ms", java.lang.Long.valueOf(defpackage.acxt.m()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__max_video_delay_allowed_parked_exp_ms", java.lang.Long.valueOf(defpackage.acxt.n()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__average_lag_weight", java.lang.Long.valueOf(defpackage.acxt.f()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__average_lag_weight_parked_exp", java.lang.Long.valueOf(defpackage.acxt.g()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__sync_offset_override_ms", java.lang.Long.valueOf(defpackage.acxt.s()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__sync_offset_override_parked_exp_ms", java.lang.Long.valueOf(defpackage.acxt.t()).toString());
        v(printWriter, "boolean", "SynchronizedMediaFeature__enable_media_stats", java.lang.String.valueOf(defpackage.acxt.v()));
        v(printWriter, "long", "SynchronizedMediaFeature__media_stats_report_interval_ms", java.lang.Long.valueOf(defpackage.acxt.o()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__media_stats_report_interval_ms_tts", java.lang.Long.valueOf(defpackage.acxt.p()).toString());
        v(printWriter, "long", "SynchronizedMediaFeature__max_media_stats_reports_to_dump", java.lang.Long.valueOf(defpackage.acxt.l()).toString());
        v(printWriter, "boolean", "StratoFeature__enabled", java.lang.String.valueOf(acxq.c()));
        v(printWriter, "boolean", "StratoFeature__window_animation_enabled", java.lang.String.valueOf(acxq.d()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "SoftMinversion__spec", juu.u(defpackage.acxn.b()));
        v(printWriter, "boolean", "Settings__user_education_enabled", java.lang.String.valueOf(defpackage.acxk.h()));
        v(printWriter, "boolean", "Settings__user_education_is_dry_run", java.lang.String.valueOf(defpackage.acxk.i()));
        v(printWriter, "long", "Settings__user_education_nth_run_count", java.lang.Long.valueOf(defpackage.acxk.b()).toString());
        v(printWriter, "boolean", "Settings__reconnect_on_connection_failure_kill_switch", java.lang.String.valueOf(defpackage.acxk.g()));
        v(printWriter, "boolean", "Settings__launcher_order_backup_enabled", java.lang.String.valueOf(defpackage.acxk.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Settings__backup_keys_allowlist", juu.u(defpackage.acxk.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Settings__car_service_backup_keys_allowlist", juu.u(defpackage.acxk.d()));
        v(printWriter, "boolean", "RhdFeature__rhd_default", java.lang.String.valueOf(defpackage.acxh.c()));
        v(printWriter, "boolean", "ReportPhoneCapabilities__enabled", java.lang.String.valueOf(defpackage.acxe.c()));
        v(printWriter, "long", "ReleaseChannel__gearhead_channel", java.lang.Long.valueOf(defpackage.acxb.b()).toString());
        v(printWriter, "long", "RefreshCellInfo__threshold_ms", java.lang.Long.valueOf(defpackage.acwy.b()).toString());
        v(printWriter, "boolean", "ProjectionWindowManager__focusable_area_inside_insets_kill_switch", java.lang.String.valueOf(defpackage.acwv.q()));
        v(printWriter, "boolean", "ProjectionWindowManager__log_surfaceflinger_telemetry", java.lang.String.valueOf(defpackage.acwv.s()));
        v(printWriter, "long", "ProjectionWindowManager__composition_semaphore_timeout", java.lang.Long.valueOf(defpackage.acwv.f()).toString());
        v(printWriter, "long", "ProjectionWindowManager__frame_update_timestamps_queue_size", java.lang.Long.valueOf(defpackage.acwv.g()).toString());
        v(printWriter, "boolean", "ProjectionWindowManager__show_display_information", java.lang.String.valueOf(defpackage.acwv.v()));
        v(printWriter, "boolean", "ProjectionWindowManager__use_system_windows_updated_kill_switch", java.lang.String.valueOf(defpackage.acwv.x()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "ProjectionWindowManager__disable_dynamic_frame_rate_list", juu.u(defpackage.acwv.k()));
        v(printWriter, "double", "ProjectionWindowManager__composition_to_transport_direct_telemetry_percent", java.lang.Double.valueOf(defpackage.acwv.b()).toString());
        v(printWriter, "long", "ProjectionWindowManager__max_pending_frames_to_send", java.lang.Long.valueOf(defpackage.acwv.h()).toString());
        v(printWriter, "double", "ProjectionWindowManager__non_square_scale_limit", java.lang.Double.valueOf(defpackage.acwv.d()).toString());
        v(printWriter, "double", "ProjectionWindowManager__non_square_scale_min_limit", java.lang.Double.valueOf(defpackage.acwv.e()).toString());
        v(printWriter, "boolean", "ProjectionWindowManager__deprecate_pixel_aspect_ratio_scaling_kill_switch", java.lang.String.valueOf(defpackage.acwv.o()));
        v(printWriter, "boolean", "ProjectionWindowManager__send_non_drawable_insets_enabled", java.lang.String.valueOf(defpackage.acwv.u()));
        v(printWriter, "boolean", "ProjectionWindowManager__only_init_windows_once", java.lang.String.valueOf(defpackage.acwv.t()));
        v(printWriter, "boolean", "ProjectionWindowManager__log_on_frame_available_rate", java.lang.String.valueOf(defpackage.acwv.r()));
        v(printWriter, "long", "ProjectionWindowManager__vsync_time_normalization_rebase_frames", java.lang.Long.valueOf(defpackage.acwv.j()).toString());
        v(printWriter, "double", "ProjectionWindowManager__expected_frame_time_deviation", java.lang.Double.valueOf(defpackage.acwv.c()).toString());
        v(printWriter, "boolean", "ProjectionWindowManager__vsync_rebase_clock_offset_estimation_enabled", java.lang.String.valueOf(defpackage.acwv.y()));
        v(printWriter, "boolean", "ProjectionWindowManager__content_window_startup_animation_kill_switch", java.lang.String.valueOf(defpackage.acwv.m()));
        v(printWriter, "boolean", "ProjectionWindowManager__use_capture_secure_video_output_kill_switch", java.lang.String.valueOf(defpackage.acwv.w()));
        v(printWriter, "boolean", "ProjectionWindowManager__detect_secure_video_kill_switch", java.lang.String.valueOf(defpackage.acwv.p()));
        v(printWriter, "long", "ProjectionWindowManager__max_sdk_version_for_low_tier_devices", java.lang.Long.valueOf(defpackage.acwv.i()).toString());
        v(printWriter, "boolean", "ProjectionWindowManager__copy_dump_sparse_array_kill_switch", java.lang.String.valueOf(defpackage.acwv.n()));
        v(printWriter, "long", "ProjectionPriorityMonitor__polltime_ms", java.lang.Long.valueOf(defpackage.acws.b()).toString());
        v(printWriter, "long", "ProjectedPresentation__configuration_check_tolerance_dp", java.lang.Long.valueOf(defpackage.acwp.c()).toString());
        v(printWriter, "long", "ProjectedPresentation__config_check_delay", java.lang.Long.valueOf(defpackage.acwp.b()).toString());
        v(printWriter, "boolean", "ProjectedPresentation__crash_projected_presentation_if_unable_to_get_correct_configuration", java.lang.String.valueOf(defpackage.acwp.f()));
        v(printWriter, "long", "ProjectedPresentation__max_config_checks", java.lang.Long.valueOf(defpackage.acwp.d()).toString());
        v(printWriter, "boolean", "ProjectedAppsFeature__enabled", java.lang.String.valueOf(defpackage.acwm.c()));
        v(printWriter, "boolean", "Preflight__clear_tos_dev_setting_enabled", java.lang.String.valueOf(defpackage.acwj.o()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Preflight__car_specific_min_version", juu.u(defpackage.acwj.i()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Preflight__car_specific_min_sdk_version", juu.u(defpackage.acwj.h()));
        v(printWriter, "boolean", "Preflight__frx_rewind_enabled", java.lang.String.valueOf(defpackage.acwj.r()));
        v(printWriter, "long", "Preflight__frx_rewind_interval_hours", java.lang.Long.valueOf(defpackage.acwj.d()).toString());
        v(printWriter, "long", "Preflight__invalidate_phone_welcome_screen_time_ms", java.lang.Long.valueOf(defpackage.acwj.e()).toString());
        v(printWriter, "boolean", "Preflight__phase_1_75_block_on_unlock_patch_enabled", java.lang.String.valueOf(defpackage.acwj.w()));
        v(printWriter, "boolean", "Preflight__use_reset_handler", java.lang.String.valueOf(defpackage.acwj.B()));
        v(printWriter, "boolean", "Preflight__disable_stub_first_activity_in_private_profile_kill_switch", java.lang.String.valueOf(defpackage.acwj.p()));
        v(printWriter, "boolean", "Preflight__ignore_wireless_intent_for_work_profile_kill_switch", java.lang.String.valueOf(defpackage.acwj.t()));
        v(printWriter, "boolean", "Preflight__ignore_wireless_intent_for_private_profile_kill_switch", java.lang.String.valueOf(defpackage.acwj.s()));
        v(printWriter, "boolean", "Preflight__simplified_pre_setup_enabled", java.lang.String.valueOf(defpackage.acwj.A()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Preflight__car_manufacturer_phone_dialogs_deny_list", juu.u(defpackage.acwj.g()));
        v(printWriter, "boolean", "Preflight__apply_nav_bar_padding_to_preflight_dialog_kill_switch", java.lang.String.valueOf(defpackage.acwj.n()));
        v(printWriter, "String", "Preflight__wireless_frx_activity", defpackage.acwj.m());
        v(printWriter, "long", "Preflight__dont_show_again_count", java.lang.Long.valueOf(defpackage.acwj.b()).toString());
        v(printWriter, "long", "Preflight__dont_show_again_projection_start_count", java.lang.Long.valueOf(defpackage.acwj.c()).toString());
        v(printWriter, "boolean", "Preflight__phase_1_75_skip_agsa", java.lang.String.valueOf(defpackage.acwj.x()));
        v(printWriter, "boolean", "Preflight__phase_1_75_skip_gmm", java.lang.String.valueOf(defpackage.acwj.y()));
        v(printWriter, "boolean", "Preflight__is_phone_denylisted", java.lang.String.valueOf(defpackage.acwj.v()));
        v(printWriter, "boolean", "Preflight__is_device_country_blocked", java.lang.String.valueOf(defpackage.acwj.u()));
        v(printWriter, "googledata.experiments.mobile.gmscore.car.proto.ConditionalValueEncodedParam", "Preflight__is_device_country_allowlisted_conditional_value_encoded_param", juu.v(defpackage.acwj.l()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionListWithFilterMode", "Preflight__car_info_allowed_in_unsupported_aap_countries_list", juu.j(defpackage.acwj.f()));
        v(printWriter, "boolean", "Preflight__restore_phone_frx", java.lang.String.valueOf(defpackage.acwj.z()));
        v(printWriter, "boolean", "Preflight__enable_gps_country_check", java.lang.String.valueOf(defpackage.acwj.q()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Preflight__gearhead_blocked_countries_list", juu.u(defpackage.acwj.j()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "PlugbotEventFilter__common_filter_list", juu.s(acwg.b()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "PlugbotEventFilter__usb_filter_list", juu.s(acwg.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "PlugbotEventFilter__wireless_filter_list", juu.s(acwg.d()));
        v(printWriter, "boolean", "PhoneThemeFeature__enable_dynamic_font_family", java.lang.String.valueOf(defpackage.acwd.g()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "PhoneThemeFeature__manufacturer_prefers_device_font_family", juu.u(defpackage.acwd.b()));
        v(printWriter, "boolean", "PhoneThemeFeature__enable_dynamic_app_icon_shape_by_manufacturer_kill_switch", java.lang.String.valueOf(defpackage.acwd.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "PhoneThemeFeature__manufacturer_uses_dynamic_icon_shape", juu.u(defpackage.acwd.c()));
        v(printWriter, "boolean", "PhoneThemeFeature__cache_alternative_system_app_icon_components", java.lang.String.valueOf(defpackage.acwd.e()));
        v(printWriter, "boolean", "PhoneFeature__use_standard_template_for_contacts", java.lang.String.valueOf(acwa.c()));
        v(printWriter, "boolean", "PhenotypeProcessStableFlags__first_read_latency", java.lang.String.valueOf(defpackage.acvx.c()));
        v(printWriter, "long", "Performance__lifetime_delayed_start_delay_ms", java.lang.Long.valueOf(defpackage.acvt.c()).toString());
        v(printWriter, "boolean", "Performance__navigation_client_manager_delayed_start_enabled", java.lang.String.valueOf(defpackage.acvt.m()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Performance__emit_broadcast_receiver_telemetry_list", juu.u(defpackage.acvt.e()));
        v(printWriter, "String", "Performance__primes_transmitter", defpackage.acvt.g());
        v(printWriter, "boolean", "Performance__ignore_first_run_for_version_code_enabled", java.lang.String.valueOf(defpackage.acvt.i()));
        v(printWriter, "boolean", "Performance__ignore_preflight_lockscreen_activity", java.lang.String.valueOf(defpackage.acvt.j()));
        v(printWriter, "long", "Performance__lifetime_delayed_start_no_video_focus_timeout_ms", java.lang.Long.valueOf(defpackage.acvt.d()).toString());
        v(printWriter, "boolean", "Performance__log_to_telemetry", java.lang.String.valueOf(defpackage.acvt.k()));
        v(printWriter, "boolean", "Performance__pre_warm_activities_enabled", java.lang.String.valueOf(defpackage.acvt.n()));
        v(printWriter, "long", "Performance__delay_prewarm_ms", java.lang.Long.valueOf(defpackage.acvt.b()).toString());
        v(printWriter, "boolean", "Performance__reduce_car_activity_logging_enabled", java.lang.String.valueOf(defpackage.acvt.o()));
        v(printWriter, "boolean", "Performance__minor_car_activity_manager_startup_improvements_enabled", java.lang.String.valueOf(defpackage.acvt.l()));
        v(printWriter, "boolean", "Performance__cache_lifetime_state", java.lang.String.valueOf(defpackage.acvt.h()));
        v(printWriter, "boolean", "Performance__remove_preflight_interval", java.lang.String.valueOf(defpackage.acvt.p()));
        v(printWriter, "long", "OsDeprecation__message_min_sdk", java.lang.Long.valueOf(defpackage.acvq.b()).toString());
        v(printWriter, "boolean", "OsDeprecation__enable_phone_notification", java.lang.String.valueOf(defpackage.acvq.f()));
        v(printWriter, "boolean", "OsDeprecation__car_notification_update", java.lang.String.valueOf(defpackage.acvq.d()));
        v(printWriter, "boolean", "OsDeprecation__enable_incompatible_device_alert_dialog", java.lang.String.valueOf(defpackage.acvq.e()));
        v(printWriter, "boolean", "OsDeprecation__perform_device_compatibility_check_on_startup", java.lang.String.valueOf(defpackage.acvq.g()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "NotificationDebugging__package_list", juu.m(defpackage.acvl.b()));
        v(printWriter, "boolean", "Notification__enable_local_notification_clients", java.lang.String.valueOf(defpackage.acvk.c()));
        v(printWriter, "long", "NeoplanFeature__enabled", java.lang.Long.valueOf(defpackage.acvh.b()).toString());
        v(printWriter, "boolean", "Nativity__ghost_activities_enabled", java.lang.String.valueOf(defpackage.acve.d()));
        v(printWriter, "boolean", "Nativity__sixth_sense_enabled", java.lang.String.valueOf(defpackage.acve.f()));
        v(printWriter, "boolean", "Nativity__car_process_activity_enabled", java.lang.String.valueOf(defpackage.acve.c()));
        v(printWriter, "boolean", "Nativity__use_default_device_context", java.lang.String.valueOf(defpackage.acve.g()));
        v(printWriter, "boolean", "Nativity__ghost_activity_telemetry_on_failure_kill_switch", java.lang.String.valueOf(defpackage.acve.e()));
        v(printWriter, "boolean", "MultiDisplay__gal_munger_enabled", java.lang.String.valueOf(defpackage.acvb.l()));
        v(printWriter, "boolean", "MultiDisplay__cluster_launcher_enabled", java.lang.String.valueOf(defpackage.acvb.j()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "MultiDisplay__auxiliary_display_supported_components", juu.m(defpackage.acvb.d()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "MultiDisplay__cluster_display_supported_components", juu.m(defpackage.acvb.e()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "MultiDisplay__secondary_region_supported_components", juu.m(defpackage.acvb.g()));
        v(printWriter, "boolean", "MultiDisplay__cluster_rotary_window_navigation", java.lang.String.valueOf(defpackage.acvb.k()));
        v(printWriter, "long", "MultiDisplay__aux_display_default_configuration", java.lang.Long.valueOf(defpackage.acvb.b()).toString());
        v(printWriter, "long", "MultiDisplay__cluster_display_default_configuration", java.lang.Long.valueOf(defpackage.acvb.c()).toString());
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "MultiDisplay__cluster_supporting_nav_apps", juu.m(defpackage.acvb.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "MultiDisplay__reject_clusters_for_unsupported_nav_apps", juu.u(defpackage.acvb.h()));
        v(printWriter, "boolean", "MissingProxyMessagingIntentExtras__enabled", java.lang.String.valueOf(acuy.c()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "MessagingStyle__package_list", juu.m(acuv.b()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "MessagingNotificationFilter__package_list", juu.m(defpackage.acus.b()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "MessagingAvatarCircularCrop__package_list", juu.m(acum.b()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Messaging__app_block_list", juu.m(defpackage.acul.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Messaging__send_message_intent_list", juu.u(defpackage.acul.h()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Messaging__empty_audio_uri_package_list", juu.u(defpackage.acul.g()));
        v(printWriter, "boolean", "Messaging__display_hun_only_for_notification_importance_above_low", java.lang.String.valueOf(defpackage.acul.s()));
        v(printWriter, "boolean", "Messaging__display_hun_only_for_notification_importance_above_default", java.lang.String.valueOf(defpackage.acul.r()));
        v(printWriter, "boolean", "Messaging__autoplay_messages_kill_switch", java.lang.String.valueOf(defpackage.acul.o()));
        v(printWriter, "boolean", "Messaging__app_identification_intent_service_enabled", java.lang.String.valueOf(defpackage.acul.k()));
        v(printWriter, "boolean", "Messaging__carextender_enabled", java.lang.String.valueOf(defpackage.acul.q()));
        v(printWriter, "boolean", "Messaging__assistant_notification_data_sharing_leave_behind_enabled", java.lang.String.valueOf(defpackage.acul.n()));
        v(printWriter, "boolean", "Messaging__assistant_notification_data_sharing_frx_enabled", java.lang.String.valueOf(defpackage.acul.m()));
        v(printWriter, "boolean", "Messaging__assistant_compose_message_client_input_kill_switch", java.lang.String.valueOf(defpackage.acul.l()));
        v(printWriter, "boolean", "Messaging__remove_fake_sbn_enabled", java.lang.String.valueOf(defpackage.acul.w()));
        v(printWriter, "long", "Messaging__remove_fake_sbn_assistant_min_version", java.lang.Long.valueOf(defpackage.acul.e()).toString());
        v(printWriter, "String", "Messaging__llm_info_page_uri", defpackage.acul.j());
        v(printWriter, "boolean", "Messaging__use_app_accent_color_as_fab_background", java.lang.String.valueOf(defpackage.acul.D()));
        v(printWriter, "boolean", "Messaging__cal_mute_button_enabled", java.lang.String.valueOf(defpackage.acul.p()));
        v(printWriter, "double", "Messaging__minimum_smart_action_confidence_score", java.lang.Double.valueOf(defpackage.acul.b()).toString());
        v(printWriter, "long", "Messaging__maximum_smart_action_display_text_length", java.lang.Long.valueOf(defpackage.acul.d()).toString());
        v(printWriter, "boolean", "Messaging__smart_action_navigate_enabled_for_all_nav_apps", java.lang.String.valueOf(defpackage.acul.B()));
        v(printWriter, "long", "Messaging__max_last_msg_received_age_to_display_smart_actions_hr", java.lang.Long.valueOf(defpackage.acul.c()).toString());
        v(printWriter, "boolean", "Messaging__set_readout_button_label_to_play", java.lang.String.valueOf(defpackage.acul.A()));
        v(printWriter, "boolean", "Messaging__image_description_readout_enabled", java.lang.String.valueOf(defpackage.acul.t()));
        v(printWriter, "boolean", "Messaging__remove_im_stream_item_path", java.lang.String.valueOf(defpackage.acul.x()));
        v(printWriter, "boolean", "Messaging__remove_sms_stream_item_path", java.lang.String.valueOf(defpackage.acul.y()));
        v(printWriter, "boolean", "Messaging__launcher_priority_messaging_suppression_kill_switch", java.lang.String.valueOf(defpackage.acul.u()));
        v(printWriter, "boolean", "Messaging__unexport_notification_action_receivers_kill_switch", java.lang.String.valueOf(defpackage.acul.C()));
        v(printWriter, "boolean", "Messaging__platform_smart_replies_kill_switch", java.lang.String.valueOf(defpackage.acul.v()));
        v(printWriter, "boolean", "Messaging__reply_text_classification_kill_switch", java.lang.String.valueOf(defpackage.acul.z()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Mesquite__compose_versioned_app_packages", juu.u(defpackage.acui.c()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Mesquite__compose_sms_app_packages", juu.m(defpackage.acui.b()));
        v(printWriter, "boolean", "MemoryMonitor__enabled", java.lang.String.valueOf(acuf.c()));
        v(printWriter, "boolean", "MediaStatsFeature__enable_media_stats_event_logging", java.lang.String.valueOf(defpackage.acuc.c()));
        v(printWriter, "boolean", "Media__projected_speedbump_enabled", java.lang.String.valueOf(defpackage.actz.G()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Media__tint_resource_uris", juu.m(defpackage.actz.m()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Media__layer_cake_shared_browser_connection_component_list", juu.m(defpackage.actz.j()));
        v(printWriter, "boolean", "Media__non_intrusive_media_session_validation_enabled_kill_switch", java.lang.String.valueOf(defpackage.actz.F()));
        v(printWriter, "boolean", "Media__delay_media_service_disconnect_enabled_kill_switch", java.lang.String.valueOf(defpackage.actz.x()));
        v(printWriter, "long", "Media__autoplay_paused_after_buffering_retry_delay_ms", java.lang.Long.valueOf(defpackage.actz.b()).toString());
        v(printWriter, "boolean", "Media__autoplay_prohibit_ineligibility_when_playback_blocked_enabled", java.lang.String.valueOf(defpackage.actz.s()));
        v(printWriter, "boolean", "Media__show_album_art_for_suggestion", java.lang.String.valueOf(defpackage.actz.K()));
        v(printWriter, "boolean", "Media__non_fatal_playback_error_handling_enabled", java.lang.String.valueOf(defpackage.actz.E()));
        v(printWriter, "long", "Media__non_fatal_playback_error_handling_toast_rate_limit_window_ms", java.lang.Long.valueOf(defpackage.actz.h()).toString());
        v(printWriter, "long", "Media__non_fatal_playback_error_handling_toast_rate_limit_max_posts_in_window", java.lang.Long.valueOf(defpackage.actz.g()).toString());
        v(printWriter, "String", "Media__favorites_override", defpackage.actz.q());
        v(printWriter, "boolean", "Media__layer_cake_root_children_cache_enabled", java.lang.String.valueOf(defpackage.actz.B()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Media__toast_guardrail_component_list", juu.m(defpackage.actz.n()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Media__check_for_browser_service_component_list", juu.m(defpackage.actz.i()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Media__show_settings_button_in_browse_view_component_denylist", juu.m(defpackage.actz.l()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Media__use_template_for_error_resolution_component_denylist", juu.m(defpackage.actz.o()));
        v(printWriter, "boolean", "Media__cal_ui_enabled", java.lang.String.valueOf(defpackage.actz.v()));
        v(printWriter, "boolean", "Media__support_playback_only_media", java.lang.String.valueOf(defpackage.actz.M()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Media__playback_only_media_package_list", juu.m(defpackage.actz.k()));
        v(printWriter, "boolean", "Media__check_cal_store_for_token", java.lang.String.valueOf(defpackage.actz.w()));
        v(printWriter, "boolean", "Media__non_default_media_usage_telemetry_kill_switch", java.lang.String.valueOf(defpackage.actz.D()));
        v(printWriter, "boolean", "Media__update_user_disabled_handling_kill_switch", java.lang.String.valueOf(defpackage.actz.P()));
        v(printWriter, "boolean", "Media__bitmap_color_cache_optimization", java.lang.String.valueOf(defpackage.actz.u()));
        v(printWriter, "boolean", "Media__update_playback_background", java.lang.String.valueOf(defpackage.actz.O()));
        v(printWriter, "boolean", "Media__render_pager_indicator_tint_early_kill_switch", java.lang.String.valueOf(defpackage.actz.I()));
        v(printWriter, "boolean", "Media__allow_no_primary_action_kill_switch", java.lang.String.valueOf(defpackage.actz.r()));
        v(printWriter, "boolean", "Media__support_multiple_dashboard_media_cards", java.lang.String.valueOf(defpackage.actz.L()));
        v(printWriter, "boolean", "Media__display_disable_autoplay_notification_enabled", java.lang.String.valueOf(defpackage.actz.y()));
        v(printWriter, "long", "Media__disable_autoplay_hun_required_pause_count", java.lang.Long.valueOf(defpackage.actz.e()).toString());
        v(printWriter, "long", "Media__disable_autoplay_hun_pause_history_length", java.lang.Long.valueOf(defpackage.actz.c()).toString());
        v(printWriter, "long", "Media__disable_autoplay_hun_pause_threshold_seconds", java.lang.Long.valueOf(defpackage.actz.d()).toString());
        v(printWriter, "boolean", "Media__use_view_model_for_playback_template_kill_switch", java.lang.String.valueOf(defpackage.actz.R()));
        v(printWriter, "boolean", "Media__use_media_package_resources_for_icons_kill_switch", java.lang.String.valueOf(defpackage.actz.Q()));
        v(printWriter, "boolean", "Media__ignore_media_keys_on_startup_enabled", java.lang.String.valueOf(defpackage.actz.A()));
        v(printWriter, "long", "Media__ignore_media_keys_on_startup_timeout_ms", java.lang.Long.valueOf(defpackage.actz.f()).toString());
        v(printWriter, "boolean", "Media__avoid_caching_empty_external_media_apps_kill_switch", java.lang.String.valueOf(defpackage.actz.t()));
        v(printWriter, "boolean", "Media__safe_media_controller_creation_kill_switch", java.lang.String.valueOf(defpackage.actz.J()));
        v(printWriter, "boolean", "Media__query_media_app_directly_for_suggestions_enabled", java.lang.String.valueOf(defpackage.actz.H()));
        v(printWriter, "boolean", "Media__media_suggestion_card_nan_fix_enabled_kill_switch", java.lang.String.valueOf(defpackage.actz.C()));
        v(printWriter, "boolean", "Media__force_skip_10s_media_actions_enabled", java.lang.String.valueOf(defpackage.actz.z()));
        v(printWriter, "boolean", "Media__unexport_media_suggestion_receiver_enabled_kill_switch", java.lang.String.valueOf(defpackage.actz.N()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "McFly__supported_pin_regexes", juu.u(defpackage.actw.e()));
        v(printWriter, "long", "McFly__work_profile_integration_prompt_count", java.lang.Long.valueOf(defpackage.actw.c()).toString());
        v(printWriter, "long", "McFly__max_all_day_events", java.lang.Long.valueOf(defpackage.actw.b()).toString());
        v(printWriter, "long", "McFly__work_profile_integration_prompt_delay", java.lang.Long.valueOf(defpackage.actw.d()).toString());
        v(printWriter, "boolean", "Lifetime__destroy_lifecycle_owning_component_enabled", java.lang.String.valueOf(defpackage.actt.c()));
        v(printWriter, "boolean", "LifecycleRecovery__watchdog_process", java.lang.String.valueOf(defpackage.actq.j()));
        v(printWriter, "boolean", "LifecycleRecovery__show_toast_on_usb_reset", java.lang.String.valueOf(defpackage.actq.i()));
        v(printWriter, "long", "LifecycleRecovery__max_disconnects_before_crash_loop", java.lang.Long.valueOf(defpackage.actq.c()).toString());
        v(printWriter, "long", "LifecycleRecovery__good_connection_seconds", java.lang.Long.valueOf(defpackage.actq.b()).toString());
        v(printWriter, "boolean", "LifecycleRecovery__projection_crash_loop_mitigation_enabled", java.lang.String.valueOf(defpackage.actq.g()));
        v(printWriter, "boolean", "LifecycleRecovery__projection_crash_loop_use_user_selection_bye_bye", java.lang.String.valueOf(defpackage.actq.h()));
        v(printWriter, "boolean", "LifecycleRecovery__handle_car_service_gone_in_lifetime", java.lang.String.valueOf(defpackage.actq.e()));
        v(printWriter, "boolean", "LifecycleRecovery__log_car_service_gone_telemetry_kill_switch", java.lang.String.valueOf(defpackage.actq.f()));
        v(printWriter, "long", "LegacyFrx__frx_gearhead_min_version", java.lang.Long.valueOf(defpackage.actn.b()).toString());
        v(printWriter, "googledata.experiments.mobile.gmscore.car.proto.ConditionalValueEncodedParam", "LegacyFrx__frx_maps_conditional_value_encoded_param", juu.v(defpackage.actn.d()));
        v(printWriter, "String", "LegacyFrx__frx_gsa_package", defpackage.actn.e());
        v(printWriter, "String", "LegacyFrx__frx_tts_package", defpackage.actn.f());
        v(printWriter, "boolean", "LegacyFrx__handle_unavailable_frx_state", java.lang.String.valueOf(defpackage.actn.g()));
        v(printWriter, "boolean", "LauncherShortcuts__enabled", java.lang.String.valueOf(actk.e()));
        v(printWriter, "boolean", "LauncherShortcuts__assistant_shortcut_enabled", java.lang.String.valueOf(actk.d()));
        v(printWriter, "long", "LauncherShortcuts__max_shortcuts", java.lang.Long.valueOf(actk.b()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "LauncherApps__hotseat_media_packages", juu.u(acth.b()));
        v(printWriter, "long", "InputEventLogging__buffer_capacity", java.lang.Long.valueOf(defpackage.acte.b()).toString());
        v(printWriter, "boolean", "HeroFeature__enabled", java.lang.String.valueOf(defpackage.actb.j()));
        v(printWriter, "boolean", "HeroFeature__force_hero_layout", java.lang.String.valueOf(defpackage.actb.l()));
        v(printWriter, "boolean", "HeroFeature__force_hero_vertical", java.lang.String.valueOf(defpackage.actb.m()));
        v(printWriter, "boolean", "HeroFeature__force_cutouts", java.lang.String.valueOf(defpackage.actb.k()));
        v(printWriter, "boolean", "HeroFeature__demo_app_enabled", java.lang.String.valueOf(defpackage.actb.g()));
        v(printWriter, "boolean", "HeroFeature__herosim_enabled", java.lang.String.valueOf(defpackage.actb.n()));
        v(printWriter, "boolean", "HeroFeature__herosim_mtc_temp_enabled", java.lang.String.valueOf(defpackage.actb.p()));
        v(printWriter, "boolean", "HeroFeature__herosim_hmg_temp_enabled", java.lang.String.valueOf(defpackage.actb.o()));
        v(printWriter, "boolean", "HeroFeature__assistant_hero_enabled", java.lang.String.valueOf(defpackage.actb.c()));
        v(printWriter, "boolean", "HeroFeature__disable_assistant_button_in_reverse", java.lang.String.valueOf(defpackage.actb.h()));
        v(printWriter, "boolean", "HeroFeature__car_controls_enabled", java.lang.String.valueOf(defpackage.actb.e()));
        v(printWriter, "boolean", "HeroFeature__cutouts_enabled", java.lang.String.valueOf(defpackage.actb.f()));
        v(printWriter, "boolean", "HeroFeature__punch_through_enabled", java.lang.String.valueOf(defpackage.actb.q()));
        v(printWriter, "boolean", "HeroFeature__theming_enabled", java.lang.String.valueOf(defpackage.actb.t()));
        v(printWriter, "boolean", "HeroFeature__use_new_media_ui", java.lang.String.valueOf(defpackage.actb.u()));
        v(printWriter, "boolean", "HeroFeature__assistant_transcription_aligned_by_rail_kill_switch", java.lang.String.valueOf(defpackage.actb.d()));
        v(printWriter, "boolean", "HeroFeature__support_theming_in_frx_kill_switch", java.lang.String.valueOf(defpackage.actb.s()));
        v(printWriter, "boolean", "HeroFeature__enable_critical_ui_draw_check_kill_switch", java.lang.String.valueOf(defpackage.actb.i()));
        v(printWriter, "boolean", "HeroFeature__radio_program_info_rate_limiting_kill_switch", java.lang.String.valueOf(defpackage.actb.r()));
        v(printWriter, "boolean", "HelloMendel__hello_launch_param", java.lang.String.valueOf(acsy.e()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "HelloMendel__hello_world_filter", juu.m(acsy.c()));
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionListWithFilterMode", "HelloMendel__hello_car_info_list", juu.j(acsy.b()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "HeadUnitFeature__known_updates", juu.u(defpackage.acsv.e()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "HeadUnitFeature__hkmc_min_updates", juu.u(defpackage.acsv.d()));
        v(printWriter, "long", "HeadUnitFeature__update_notification_frequency", java.lang.Long.valueOf(defpackage.acsv.c()).toString());
        v(printWriter, "long", "HeadUnitFeature__max_notifications_for_head_unit", java.lang.Long.valueOf(defpackage.acsv.b()).toString());
        v(printWriter, "boolean", "HeadUnitFeature__show_update_notifications_enabled", java.lang.String.valueOf(defpackage.acsv.g()));
        v(printWriter, "boolean", "HatsLapseDetector__enabled", java.lang.String.valueOf(acss.e()));
        v(printWriter, "long", "HatsLapseDetector__min_trigger_seconds", java.lang.Long.valueOf(acss.c()).toString());
        v(printWriter, "long", "HatsLapseDetector__max_trigger_seconds", java.lang.Long.valueOf(acss.b()).toString());
        v(printWriter, "com.google.protos.androidauto.hats.HatsTrigger", "Hats__triggers", juu.r(acsp.c()));
        v(printWriter, "boolean", "Hats__enable_proof_mode", java.lang.String.valueOf(acsp.e()));
        v(printWriter, "boolean", "Hats__gearhead_assistant_share_eta_survey_enabled", java.lang.String.valueOf(acsp.g()));
        v(printWriter, "boolean", "Hats__enable_survey_rate_limiting", java.lang.String.valueOf(acsp.f()));
        v(printWriter, "double", "Hats__survey_rate_limiting_threshold", java.lang.Double.valueOf(acsp.b()).toString());
        v(printWriter, "boolean", "Hats__gearhead_package_key_fix_kill_switch", java.lang.String.valueOf(acsp.h()));
        v(printWriter, "long", "GearheadLogging__usb_monitor_runnable_short_time_interval", java.lang.Long.valueOf(defpackage.acsm.b()).toString());
        v(printWriter, "boolean", "GearheadCarService__notify_lite_on_preflight_complete_q_minus", java.lang.String.valueOf(defpackage.acsj.h()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "GearheadCarService__handoff_handlers", juu.u(defpackage.acsj.b()));
        v(printWriter, "boolean", "GearheadCarService__car_display_binder_assert_first_party", java.lang.String.valueOf(defpackage.acsj.d()));
        v(printWriter, "boolean", "GearheadCarService__car_navigation_status_assert_first_party", java.lang.String.valueOf(defpackage.acsj.e()));
        v(printWriter, "boolean", "GearheadCarService__startup_proxy_signature_check_enabled", java.lang.String.valueOf(defpackage.acsj.i()));
        v(printWriter, "boolean", "GearheadCarService__unexport_connection_status_receiver_kill_switch", java.lang.String.valueOf(defpackage.acsj.j()));
        v(printWriter, "boolean", "GearheadCarService__lazy_retrieve_android_id_kill_switch", java.lang.String.valueOf(defpackage.acsj.f()));
        v(printWriter, "boolean", "GearheadCarService__log_out_of_order_session_event_kill_switch", java.lang.String.valueOf(defpackage.acsj.g()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "GearSnacks__content", juu.u(acsg.b()));
        v(printWriter, "long", "FrameworkGalFeature__stall_threshold_ms_wifi", java.lang.Long.valueOf(defpackage.acsd.o()).toString());
        v(printWriter, "long", "FrameworkGalFeature__stall_threshold_ms_usb", java.lang.Long.valueOf(defpackage.acsd.n()).toString());
        v(printWriter, "long", "FrameworkGalFeature__target_buffer_after_stall_ms_wifi", java.lang.Long.valueOf(defpackage.acsd.r()).toString());
        v(printWriter, "long", "FrameworkGalFeature__target_buffer_after_stall_ms_usb", java.lang.Long.valueOf(defpackage.acsd.q()).toString());
        v(printWriter, "long", "FrameworkGalFeature__max_audio_buffer_ms", java.lang.Long.valueOf(defpackage.acsd.k()).toString());
        v(printWriter, "long", "FrameworkGalFeature__target_buffer_after_max_buffer_reached_ms", java.lang.Long.valueOf(defpackage.acsd.p()).toString());
        v(printWriter, "long", "FrameworkGalFeature__default_max_hu_audio_buffer_ms", java.lang.Long.valueOf(defpackage.acsd.d()).toString());
        v(printWriter, "long", "FrameworkGalFeature__max_hu_audio_buffer_ms", java.lang.Long.valueOf(defpackage.acsd.l()).toString());
        v(printWriter, "long", "FrameworkGalFeature__default_max_hu_audio_buffer_ms_navigation", java.lang.Long.valueOf(defpackage.acsd.e()).toString());
        v(printWriter, "long", "FrameworkGalFeature__max_hu_audio_buffer_ms_navigation", java.lang.Long.valueOf(defpackage.acsd.m()).toString());
        v(printWriter, "long", "FrameworkGalFeature__default_target_hu_buffer_after_max_hu_buffer_reached_ms", java.lang.Long.valueOf(defpackage.acsd.f()).toString());
        v(printWriter, "long", "FrameworkGalFeature__target_hu_buffer_after_max_hu_buffer_reached_ms", java.lang.Long.valueOf(defpackage.acsd.s()).toString());
        v(printWriter, "long", "FrameworkGalFeature__default_target_hu_buffer_after_max_hu_buffer_reached_ms_navigation", java.lang.Long.valueOf(defpackage.acsd.g()).toString());
        v(printWriter, "long", "FrameworkGalFeature__target_hu_buffer_after_max_hu_buffer_reached_ms_navigation", java.lang.Long.valueOf(defpackage.acsd.t()).toString());
        v(printWriter, "long", "FrameworkGalFeature__audio_deprioritization_threshold_ms_wifi", java.lang.Long.valueOf(defpackage.acsd.c()).toString());
        v(printWriter, "long", "FrameworkGalFeature__audio_deprioritization_threshold_ms_usb", java.lang.Long.valueOf(defpackage.acsd.b()).toString());
        v(printWriter, "boolean", "FrameworkGalFeature__use_sequence_numbers", java.lang.String.valueOf(defpackage.acsd.F()));
        v(printWriter, "boolean", "FrameworkGalFeature__close_on_reader_finish", java.lang.String.valueOf(defpackage.acsd.w()));
        v(printWriter, "long", "FrameworkGalFeature__fragment_size", java.lang.Long.valueOf(defpackage.acsd.h()).toString());
        v(printWriter, "long", "FrameworkGalFeature__framer_send_buffer_size", java.lang.Long.valueOf(defpackage.acsd.i()).toString());
        v(printWriter, "boolean", "FrameworkGalFeature__is_gal_snoop_available", java.lang.String.valueOf(defpackage.acsd.z()));
        v(printWriter, "boolean", "FrameworkGalFeature__is_gal_snoop_enabled_in_starship", java.lang.String.valueOf(defpackage.acsd.A()));
        v(printWriter, "boolean", "FrameworkGalFeature__use_ping_configuration", java.lang.String.valueOf(defpackage.acsd.E()));
        v(printWriter, "com.google.protos.androidauto.flags.PingConfiguration", "FrameworkGalFeature__gal_ping_configuration", juu.o(defpackage.acsd.u()));
        v(printWriter, "boolean", "FrameworkGalFeature__detect_hu_gal_ping_timeout", java.lang.String.valueOf(defpackage.acsd.x()));
        v(printWriter, "long", "FrameworkGalFeature__hu_gal_ping_timeout_delta_ms", java.lang.Long.valueOf(defpackage.acsd.j()).toString());
        v(printWriter, "boolean", "FrameworkGalFeature__post_reader_close_on_control_channel_handler", java.lang.String.valueOf(defpackage.acsd.C()));
        v(printWriter, "boolean", "FrameworkGalFeature__invoke_callback_when_bye_bye_requested_by_md", java.lang.String.valueOf(defpackage.acsd.y()));
        v(printWriter, "boolean", "FrameworkGalFeature__tls_auth_bypass_fix", java.lang.String.valueOf(defpackage.acsd.D()));
        v(printWriter, "boolean", "FrameworkGalFeature__log_unexpected_unencrypted_message_type", java.lang.String.valueOf(defpackage.acsd.B()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "FrameRateRestrictions__impactful_component_names", juu.u(defpackage.acsa.p()));
        v(printWriter, "long", "FrameRateRestrictions__min_number_of_displays_to_trigger_restrictions", java.lang.Long.valueOf(defpackage.acsa.j()).toString());
        v(printWriter, "long", "FrameRateRestrictions__min_number_of_impactful_activities_to_trigger_restrictions", java.lang.Long.valueOf(defpackage.acsa.k()).toString());
        v(printWriter, "long", "FrameRateRestrictions__fps_limit_for_restriction_level_low", java.lang.Long.valueOf(defpackage.acsa.h()).toString());
        v(printWriter, "long", "FrameRateRestrictions__fps_limit_for_restriction_level_medium", java.lang.Long.valueOf(defpackage.acsa.i()).toString());
        v(printWriter, "long", "FrameRateRestrictions__fps_limit_for_restriction_level_high", java.lang.Long.valueOf(defpackage.acsa.g()).toString());
        v(printWriter, "long", "FrameRateRestrictions__fps_limit_for_power_normal_display_idle", java.lang.Long.valueOf(defpackage.acsa.f()).toString());
        v(printWriter, "long", "FrameRateRestrictions__fps_limit_for_power_low_display_idle", java.lang.Long.valueOf(defpackage.acsa.d()).toString());
        v(printWriter, "long", "FrameRateRestrictions__fps_limit_for_power_low_display_interactive", java.lang.Long.valueOf(defpackage.acsa.e()).toString());
        v(printWriter, "long", "FrameRateRestrictions__min_thermal_status_for_frame_rate_restrictions", java.lang.Long.valueOf(defpackage.acsa.l()).toString());
        v(printWriter, "long", "FrameRateRestrictions__thermal_headroom_forecast_seconds", java.lang.Long.valueOf(defpackage.acsa.m()).toString());
        v(printWriter, "long", "FrameRateRestrictions__thermal_headroom_polling_interval_seconds", java.lang.Long.valueOf(defpackage.acsa.n()).toString());
        v(printWriter, "double", "FrameRateRestrictions__thermal_headroom_cooling_hysteresis_factor", java.lang.Double.valueOf(defpackage.acsa.b()).toString());
        v(printWriter, "boolean", "FrameRateRestrictions__thermal_headroom_throttling_enabled", java.lang.String.valueOf(defpackage.acsa.s()));
        v(printWriter, "long", "FrameRateRestrictions__cap_fps_when_non_interactive_limit", java.lang.Long.valueOf(defpackage.acsa.c()).toString());
        v(printWriter, "com.google.protos.androidauto.flags.CarInfoExpressionList", "FrameRateRestrictions__cap_fps_when_non_interactive_cars", juu.i(defpackage.acsa.o()));
        v(printWriter, "boolean", "FrameRateRestrictions__disable_interactivity_tracking", java.lang.String.valueOf(defpackage.acsa.r()));
        v(printWriter, "boolean", "FrameRateRestrictions__use_power_save_mode_for_battery_level", java.lang.String.valueOf(defpackage.acsa.t()));
        v(printWriter, "boolean", "FrameRateRestrictions__use_projection_power_manager_handler_thread_kill_switch", java.lang.String.valueOf(defpackage.acsa.u()));
        v(printWriter, "String", "FishfoodLeaderboard__alias", defpackage.acrx.c());
        v(printWriter, "boolean", "FirstDrive__first_drive_notification_enabled", java.lang.String.valueOf(defpackage.acru.d()));
        v(printWriter, "String", "FirstDrive__notification_url", defpackage.acru.c());
        v(printWriter, "boolean", "Feedback__send_feedback_launcher_item_enabled", java.lang.String.valueOf(defpackage.acrr.f()));
        v(printWriter, "boolean", "Feedback__user_education_enabled", java.lang.String.valueOf(defpackage.acrr.g()));
        v(printWriter, "long", "Feedback__max_attachments_size", java.lang.Long.valueOf(defpackage.acrr.b()).toString());
        v(printWriter, "long", "Feedback__notification_cooldown_secs", java.lang.Long.valueOf(defpackage.acrr.c()).toString());
        v(printWriter, "boolean", "Feedback__user_education_is_dry_run", java.lang.String.valueOf(defpackage.acrr.h()));
        v(printWriter, "long", "Feedback__user_education_nth_run_count", java.lang.Long.valueOf(defpackage.acrr.d()).toString());
        v(printWriter, "boolean", "ExampleFeature__example_launch_param", java.lang.String.valueOf(acro.d()));
        v(printWriter, "boolean", "ExampleFeature__example_kill_switch", java.lang.String.valueOf(acro.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "EvOverride__ev_fuel_type_make_model_year_allowlist", juu.u(defpackage.acrl.b()));
        v(printWriter, "boolean", "DpadAsTouchpadFeature__enable_dpad_as_touchpad", java.lang.String.valueOf(defpackage.acri.c()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Dialer__voip_package_list", juu.m(defpackage.acrf.g()));
        v(printWriter, "double", "Dialer__quick_feedback_display_rate", java.lang.Double.valueOf(defpackage.acrf.b()).toString());
        v(printWriter, "long", "Dialer__call_audio_spot_check_delay_millis", java.lang.Long.valueOf(defpackage.acrf.c()).toString());
        v(printWriter, "boolean", "Dialer__call_availability_error_screen_enabled", java.lang.String.valueOf(defpackage.acrf.l()));
        v(printWriter, "boolean", "Dialer__enable_third_action_on_call_huns", java.lang.String.valueOf(defpackage.acrf.p()));
        v(printWriter, "boolean", "Dialer__multi_sim_is_dry_run", java.lang.String.valueOf(defpackage.acrf.r()));
        v(printWriter, "boolean", "Dialer__multi_sim_tooltip_enabled", java.lang.String.valueOf(defpackage.acrf.s()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Dialer__supported_dialers_for_duplex", juu.u(defpackage.acrf.j()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Dialer__dialer_to_calling_component_package_map", juu.u(defpackage.acrf.h()));
        v(printWriter, "long", "Dialer__delayed_startup_timeout_for_duplex_ics_ms", java.lang.Long.valueOf(defpackage.acrf.d()).toString());
        v(printWriter, "long", "Dialer__delayed_stop_timeout_for_duplex_ics_ms", java.lang.Long.valueOf(defpackage.acrf.e()).toString());
        v(printWriter, "boolean", "Dialer__enable_cp2_contact_lookup_with_account_query_type", java.lang.String.valueOf(defpackage.acrf.o()));
        v(printWriter, "boolean", "Dialer__disable_cp2_account_type_voip_filter_kill_switch", java.lang.String.valueOf(defpackage.acrf.n()));
        v(printWriter, "boolean", "Dialer__when_api_37_disable_cp2_account_type_query_kill_switch", java.lang.String.valueOf(defpackage.acrf.v()));
        v(printWriter, "boolean", "Dialer__notification_powered_calls_enabled", java.lang.String.valueOf(defpackage.acrf.t()));
        v(printWriter, "boolean", "Dialer__external_dialer_enabled", java.lang.String.valueOf(defpackage.acrf.q()));
        v(printWriter, "long", "Dialer__notification_image_cancel_delay_ms", java.lang.Long.valueOf(defpackage.acrf.f()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Dialer__external_dialer_allow_list", juu.u(defpackage.acrf.i()));
        v(printWriter, "boolean", "Dialer__calls_manager_ics_enabled", java.lang.String.valueOf(defpackage.acrf.m()));
        v(printWriter, "boolean", "Dialer__unified_iccaras_enabled", java.lang.String.valueOf(defpackage.acrf.u()));
        v(printWriter, "boolean", "Device__has_googler_account", java.lang.String.valueOf(defpackage.acrc.c()));
        v(printWriter, "boolean", "DeepLink__enabled", java.lang.String.valueOf(acqz.c()));
        v(printWriter, "boolean", "DebugLogging__enabled", java.lang.String.valueOf(defpackage.acqw.d()));
        v(printWriter, "boolean", "DebugLogging__enable_memory_optimization", java.lang.String.valueOf(defpackage.acqw.c()));
        v(printWriter, "boolean", "DayNightMode__initialize_night_mode", java.lang.String.valueOf(defpackage.acqt.c()));
        v(printWriter, "boolean", "DataStoreFeature__enable_jds_migration", java.lang.String.valueOf(defpackage.acqq.c()));
        v(printWriter, "boolean", "Csat__navigation_csat_enabled", java.lang.String.valueOf(defpackage.acqn.j()));
        v(printWriter, "boolean", "Csat__media_csat_enabled", java.lang.String.valueOf(defpackage.acqn.h()));
        v(printWriter, "boolean", "Csat__messaging_csat_enabled", java.lang.String.valueOf(defpackage.acqn.i()));
        v(printWriter, "boolean", "Csat__phone_call_csat_enabled", java.lang.String.valueOf(defpackage.acqn.k()));
        v(printWriter, "boolean", "Csat__assistant_csat_enabled", java.lang.String.valueOf(defpackage.acqn.g()));
        v(printWriter, "com.google.protos.androidauto.flags.CsatConfig", "Csat__survey_config", juu.k(defpackage.acqn.d()));
        v(printWriter, "long", "Csat__global_response_cooldown_secs", java.lang.Long.valueOf(defpackage.acqn.c()).toString());
        v(printWriter, "long", "Csat__global_impression_cooldown_secs", java.lang.Long.valueOf(defpackage.acqn.b()).toString());
        v(printWriter, "String", "Csat__proof_mode_survey", defpackage.acqn.f());
        v(printWriter, "String", "Crash__process", acqk.c());
        v(printWriter, "boolean", "Crash__broadcast_enabled", java.lang.String.valueOf(acqk.d()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "CradleFeature__app_package_list", juu.m(defpackage.acqh.e()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CradleFeature__allowed_activities_list", juu.u(defpackage.acqh.g()));
        v(printWriter, "boolean", "CradleFeature__show_dpi_picker", java.lang.String.valueOf(defpackage.acqh.p()));
        v(printWriter, "boolean", "CradleFeature__immersive_mode_enabled", java.lang.String.valueOf(defpackage.acqh.o()));
        v(printWriter, "boolean", "CradleFeature__all_app_launcher_enabled", java.lang.String.valueOf(defpackage.acqh.k()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "CradleFeature__app_launcher_package_list", juu.m(defpackage.acqh.d()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CradleFeature__explicit_audio_focus_native_games", juu.u(defpackage.acqh.h()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "CradleFeature__compatible_car_list", juu.m(defpackage.acqh.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CradleFeature__extended_toolbar_enabled_cars", juu.u(defpackage.acqh.i()));
        v(printWriter, "boolean", "CradleFeature__day_night_enabled", java.lang.String.valueOf(defpackage.acqh.n()));
        v(printWriter, "boolean", "CradleFeature__app_controlled_immersive_mode_enabled", java.lang.String.valueOf(defpackage.acqh.m()));
        v(printWriter, "long", "CradleFeature__transient_system_bars_duration_ms", java.lang.Long.valueOf(defpackage.acqh.c()).toString());
        v(printWriter, "long", "CradleFeature__max_parked_native_apps_forced_notifications", java.lang.Long.valueOf(defpackage.acqh.b()).toString());
        v(printWriter, "boolean", "CradleFeature__allow_video_apps", java.lang.String.valueOf(defpackage.acqh.l()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "Coolwalk__supported_navigation_apps", juu.u(defpackage.acqe.m()));
        v(printWriter, "boolean", "Coolwalk__assistant_suggestions_enabled", java.lang.String.valueOf(defpackage.acqe.p()));
        v(printWriter, "boolean", "Coolwalk__navigation_signal_to_assistant_enabled", java.lang.String.valueOf(defpackage.acqe.x()));
        v(printWriter, "boolean", "Coolwalk__media_rec_request_signal_to_assistant_enabled", java.lang.String.valueOf(defpackage.acqe.w()));
        v(printWriter, "boolean", "Coolwalk__lazy_assistant_media_rec_service_registration_enabled", java.lang.String.valueOf(defpackage.acqe.u()));
        v(printWriter, "boolean", "Coolwalk__choose_assistant_suggestion_over_app_suggestion", java.lang.String.valueOf(defpackage.acqe.q()));
        v(printWriter, "boolean", "Coolwalk__dashboard_unavailable_user_education_is_dry_run", java.lang.String.valueOf(defpackage.acqe.t()));
        v(printWriter, "boolean", "Coolwalk__rail_widget_user_education_is_dry_run", java.lang.String.valueOf(defpackage.acqe.A()));
        v(printWriter, "long", "Coolwalk__dashboard_notifications_refresh_interval_seconds", java.lang.Long.valueOf(defpackage.acqe.b()).toString());
        v(printWriter, "long", "Coolwalk__dashboard_top_card_debounce_milliseconds", java.lang.Long.valueOf(defpackage.acqe.c()).toString());
        v(printWriter, "long", "Coolwalk__live_card_dashboard_visibility_debounce_milliseconds", java.lang.Long.valueOf(defpackage.acqe.f()).toString());
        v(printWriter, "long", "Coolwalk__dashboard_top_card_rate_limit_milliseconds", java.lang.Long.valueOf(defpackage.acqe.d()).toString());
        v(printWriter, "long", "Coolwalk__mediacard_session_timeout_in_millis", java.lang.Long.valueOf(defpackage.acqe.h()).toString());
        v(printWriter, "long", "Coolwalk__media_rec_card_timeout_in_millis", java.lang.Long.valueOf(defpackage.acqe.g()).toString());
        v(printWriter, "long", "Coolwalk__messaging_notification_priority_threshold_seconds", java.lang.Long.valueOf(defpackage.acqe.i()).toString());
        v(printWriter, "long", "Coolwalk__messaging_notification_timeout_seconds", java.lang.Long.valueOf(defpackage.acqe.j()).toString());
        v(printWriter, "long", "Coolwalk__feedback_notification_timeout_seconds", java.lang.Long.valueOf(defpackage.acqe.e()).toString());
        v(printWriter, "boolean", "Coolwalk__use_light_dark_theme", java.lang.String.valueOf(defpackage.acqe.B()));
        v(printWriter, "boolean", "Coolwalk__use_light_dark_theme_focus_input", java.lang.String.valueOf(defpackage.acqe.C()));
        v(printWriter, "String", "Coolwalk__palette_base_color", defpackage.acqe.o());
        v(printWriter, "boolean", "Coolwalk__compose_catalog_enabled", java.lang.String.valueOf(defpackage.acqe.r()));
        v(printWriter, "boolean", "Coolwalk__dashboard_show_3p_notifications_with_actions_enabled", java.lang.String.valueOf(defpackage.acqe.s()));
        v(printWriter, "com.google.protos.androidauto.flags.DisplaySpecificCarInfoExpressionList", "Coolwalk__rounded_corner_mask_display_specific_denylist", juu.l(defpackage.acqe.l()));
        v(printWriter, "boolean", "Coolwalk__use_phone_primary_color", java.lang.String.valueOf(defpackage.acqe.D()));
        v(printWriter, "boolean", "Coolwalk__only_process_car_configuration_change", java.lang.String.valueOf(defpackage.acqe.z()));
        v(printWriter, "long", "Coolwalk__nav_app_border_width", java.lang.Long.valueOf(defpackage.acqe.k()).toString());
        v(printWriter, "boolean", "Coolwalk__neutralized_theme_kill_switch", java.lang.String.valueOf(defpackage.acqe.y()));
        v(printWriter, "boolean", "Coolwalk__light_dark_row_icon_fix_kill_switch", java.lang.String.valueOf(defpackage.acqe.v()));
        v(printWriter, "String", "ControlSupportedNavApps__allowlisted_nav_packages", defpackage.acqb.c());
        v(printWriter, "String", "ControlSupportedNavApps__denylisted_nav_packages", defpackage.acqb.d());
        v(printWriter, "boolean", "ContentBrowse__enable_speed_bump_projected", java.lang.String.valueOf(defpackage.acpy.d()));
        v(printWriter, "long", "ContentBrowse__drawer_default_allowed_taps_touchpad", java.lang.Long.valueOf(defpackage.acpy.b()).toString());
        v(printWriter, "boolean", "ContentBrowse__keyboard_force_disabled", java.lang.String.valueOf(defpackage.acpy.e()));
        v(printWriter, "boolean", "ContentBrowse__sixtap_force_enabled", java.lang.String.valueOf(defpackage.acpy.g()));
        v(printWriter, "boolean", "ContentBrowse__speedbump_force_enabled", java.lang.String.valueOf(defpackage.acpy.h()));
        v(printWriter, "boolean", "ContentBrowse__permits_chart", java.lang.String.valueOf(defpackage.acpy.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "ConnectivityLogging__events_requiring_status", juu.s(defpackage.acpv.k()));
        v(printWriter, "long", "ConnectivityLogging__session_timeout_ms", java.lang.Long.valueOf(defpackage.acpv.i()).toString());
        v(printWriter, "long", "ConnectivityLogging__heartbeat_interval_ms", java.lang.Long.valueOf(defpackage.acpv.d()).toString());
        v(printWriter, "boolean", "ConnectivityLogging__always_log_bluetooth_disconnect", java.lang.String.valueOf(defpackage.acpv.s()));
        v(printWriter, "long", "ConnectivityLogging__bluetooth_timeout_millis", java.lang.Long.valueOf(defpackage.acpv.b()).toString());
        v(printWriter, "long", "ConnectivityLogging__process_usb_level", java.lang.Long.valueOf(defpackage.acpv.f()).toString());
        v(printWriter, "long", "ConnectivityLogging__session_obsolete_expiration_timeout_ms", java.lang.Long.valueOf(defpackage.acpv.g()).toString());
        v(printWriter, "long", "ConnectivityLogging__session_obsolete_expiration_via_last_event_timeout_ms", java.lang.Long.valueOf(defpackage.acpv.h()).toString());
        v(printWriter, "long", "ConnectivityLogging__connectivity_refresh_timeout_ms", java.lang.Long.valueOf(defpackage.acpv.c()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "ConnectivityLogging__overlogged_connectivity_events", juu.s(defpackage.acpv.n()));
        v(printWriter, "long", "ConnectivityLogging__overlogged_connectivity_events_throttle_limit", java.lang.Long.valueOf(defpackage.acpv.e()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "ConnectivityLogging__blocklisted_connectivity_events", juu.s(defpackage.acpv.j()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "ConnectivityLogging__non_extending_events", juu.s(defpackage.acpv.m()));
        v(printWriter, "boolean", "ConnectivityLogging__disable_usb_trigger_configured_event", java.lang.String.valueOf(defpackage.acpv.v()));
        v(printWriter, "boolean", "ConnectivityLogging__disable_usb_trigger_configured_accessory_event", java.lang.String.valueOf(defpackage.acpv.u()));
        v(printWriter, "boolean", "ConnectivityLogging__crash_if_background_exception_in_connectivity_logger", java.lang.String.valueOf(defpackage.acpv.t()));
        v(printWriter, "boolean", "ConnectivityLogging__allow_repeated_startup_events", java.lang.String.valueOf(defpackage.acpv.r()));
        v(printWriter, "String", "ConnectivityLogging__bluetooth_main_module_regex_name", defpackage.acpv.p());
        v(printWriter, "String", "ConnectivityLogging__wifi_main_module_regex_name", defpackage.acpv.q());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "ConnectivityLogging__main_module_events", juu.s(defpackage.acpv.l()));
        v(printWriter, "boolean", "ConnectivityLogging__track_key_count_for_usb_connection_kill_switch", java.lang.String.valueOf(defpackage.acpv.x()));
        v(printWriter, "boolean", "ConnectivityLogging__log_gal_disconnect_telemetry_part_two_kill_switch", java.lang.String.valueOf(defpackage.acpv.w()));
        v(printWriter, "long", "ClientAnrs__setup_timeout_ms", java.lang.Long.valueOf(defpackage.acps.k()).toString());
        v(printWriter, "long", "ClientAnrs__lifetime_timeout_ms", java.lang.Long.valueOf(defpackage.acps.g()).toString());
        v(printWriter, "long", "ClientAnrs__start_timeout_ms", java.lang.Long.valueOf(defpackage.acps.l()).toString());
        v(printWriter, "long", "ClientAnrs__display_cam_timeout_ms", java.lang.Long.valueOf(defpackage.acps.c()).toString());
        v(printWriter, "boolean", "ClientAnrs__add_thread_stack_traces", java.lang.String.valueOf(defpackage.acps.p()));
        v(printWriter, "long", "ClientAnrs__default_timeout_ms", java.lang.Long.valueOf(defpackage.acps.b()).toString());
        v(printWriter, "long", "ClientAnrs__finish_timeout_ms", java.lang.Long.valueOf(defpackage.acps.d()).toString());
        v(printWriter, "long", "ClientAnrs__input_event_timeout_ms", java.lang.Long.valueOf(defpackage.acps.e()).toString());
        v(printWriter, "long", "ClientAnrs__input_focus_change_timeout_ms", java.lang.Long.valueOf(defpackage.acps.f()).toString());
        v(printWriter, "long", "ClientAnrs__on_new_intent_timeout_ms", java.lang.Long.valueOf(defpackage.acps.h()).toString());
        v(printWriter, "long", "ClientAnrs__pause_timeout_ms", java.lang.Long.valueOf(defpackage.acps.i()).toString());
        v(printWriter, "long", "ClientAnrs__stop_timeout_ms", java.lang.Long.valueOf(defpackage.acps.m()).toString());
        v(printWriter, "long", "ClientAnrs__resume_timeout_ms", java.lang.Long.valueOf(defpackage.acps.j()).toString());
        v(printWriter, "long", "ClientAnrs__video_config_change_timeout_ms", java.lang.Long.valueOf(defpackage.acps.n()).toString());
        v(printWriter, "boolean", "ClientAnrs__log_client_anrs", java.lang.String.valueOf(defpackage.acps.q()));
        v(printWriter, "String", "CieloFeature__cielo_status", defpackage.acpp.f());
        v(printWriter, "boolean", "CieloFeature__cielo_focus_enabled", java.lang.String.valueOf(defpackage.acpp.h()));
        v(printWriter, "boolean", "CieloFeature__earth_enabled", java.lang.String.valueOf(defpackage.acpp.k()));
        v(printWriter, "boolean", "CieloFeature__earth_focus_enabled", java.lang.String.valueOf(defpackage.acpp.l()));
        v(printWriter, "String", "CieloFeature__earth_status", defpackage.acpp.g());
        v(printWriter, "boolean", "CieloFeature__earth_dashboard_widget_combo_enabled", java.lang.String.valueOf(defpackage.acpp.j()));
        v(printWriter, "boolean", "CieloFeature__earth_car_window_enabled", java.lang.String.valueOf(defpackage.acpp.i()));
        v(printWriter, "long", "CieloFeature__earth_tilt", java.lang.Long.valueOf(defpackage.acpp.b()).toString());
        v(printWriter, "com.google.protos.androidauto.flags.WidgetsConfig", "CieloFeature__default_widgets_config", juu.q(defpackage.acpp.c()));
        v(printWriter, "com.google.protos.androidauto.flags.WidgetsConfig", "CieloFeature__featured_widgets_config", juu.q(defpackage.acpp.d()));
        v(printWriter, "boolean", "CieloFeature__earth_mini_dashboard_card_enabled", java.lang.String.valueOf(defpackage.acpp.m()));
        v(printWriter, "double", "CarSensorParameters__max_parked_speed_gps_sensor", java.lang.Double.valueOf(defpackage.acpm.b()).toString());
        v(printWriter, "double", "CarSensorParameters__max_parked_speed_wheel_sensor", java.lang.Double.valueOf(defpackage.acpm.c()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarSensorParameters__sensor_types_to_rate_throttle_at_delivery_phase", juu.u(defpackage.acpm.d()));
        v(printWriter, "boolean", "CarSensorParameters__refine_car_sensor_rate_kill_switch", java.lang.String.valueOf(defpackage.acpm.g()));
        v(printWriter, "boolean", "CarSensorParameters__enable_rate_throttler_jitter_allowance_kill_switch", java.lang.String.valueOf(defpackage.acpm.f()));
        v(printWriter, "boolean", "CarProjectionValidator__include_enabled_only_components", java.lang.String.valueOf(defpackage.acpj.d()));
        v(printWriter, "boolean", "CarProjectionValidator__filter_disabled_packages_in_ispackageallowed_method", java.lang.String.valueOf(defpackage.acpj.c()));
        v(printWriter, "boolean", "CarProjectionValidator__log_reason_apps_not_allowed_all_apps", java.lang.String.valueOf(defpackage.acpj.e()));
        v(printWriter, "boolean", "CarProjectionValidator__measure_latency_enabled", java.lang.String.valueOf(defpackage.acpj.f()));
        v(printWriter, "boolean", "CarProjectionValidator__media_codec_checks_enabled_kill_switch", java.lang.String.valueOf(defpackage.acpj.g()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarInfoSanitizerFeature__possible_pii_in_car_model_list", juu.u(defpackage.acpg.b()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__cluster_force_disable_package_list", juu.u(defpackage.acpd.h()));
        v(printWriter, "boolean", "CarAppLibrary__task_limit_restrictions_allows_overflow", java.lang.String.valueOf(defpackage.acpd.X()));
        v(printWriter, "boolean", "CarAppLibrary__app_driven_refresh_enabled", java.lang.String.valueOf(defpackage.acpd.v()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__app_driven_refresh_enabled_categories", juu.u(defpackage.acpd.g()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__max_list_size_with_speedbump", juu.u(defpackage.acpd.m()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__max_long_list_size_with_speedbump", juu.u(defpackage.acpd.n()));
        v(printWriter, "boolean", "CarAppLibrary__hacky_disappearing_focus_in_compose_interop_fix_enabled_kill_switch", java.lang.String.valueOf(defpackage.acpd.F()));
        v(printWriter, "boolean", "CarAppLibrary__rethrow_internal_app_exceptions_enabled", java.lang.String.valueOf(defpackage.acpd.O()));
        v(printWriter, "boolean", "CarAppLibrary__miniplayer_overlay_enabled", java.lang.String.valueOf(defpackage.acpd.H()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__media_npv_app_based_style_packages", juu.u(defpackage.acpd.o()));
        v(printWriter, "boolean", "CarAppLibrary__use_internal_attribution_icon_for_media_kill_switch", java.lang.String.valueOf(defpackage.acpd.ab()));
        v(printWriter, "long", "CarAppLibrary__app_driven_refresh_delay_in_milliseconds", java.lang.Long.valueOf(defpackage.acpd.b()).toString());
        v(printWriter, "long", "CarAppLibrary__sectioned_content_grid_callback_sample_rate_ms", java.lang.Long.valueOf(defpackage.acpd.c()).toString());
        v(printWriter, "boolean", "CarAppLibrary__enable_grid_template_item_size_small", java.lang.String.valueOf(defpackage.acpd.C()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__allowed_packages_to_convert_navigation_alerts_to_projection_notification", juu.u(defpackage.acpd.f()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__packages_allowed_for_additional_header_check_for_map_templates", juu.u(defpackage.acpd.p()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__packages_allowed_for_updated_navigation_intent_format", juu.u(defpackage.acpd.q()));
        v(printWriter, "boolean", "CarAppLibrary__conversation_item_enable_custom_actions_ui", java.lang.String.valueOf(defpackage.acpd.A()));
        v(printWriter, "long", "CarAppLibrary__template_update_throttle_in_milliseconds", java.lang.Long.valueOf(defpackage.acpd.e()).toString());
        v(printWriter, "boolean", "CarAppLibrary__multi_transaction_list_loading_enabled", java.lang.String.valueOf(defpackage.acpd.K()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__enable_action_custom_timeout_params_for_eap_package_list", juu.u(defpackage.acpd.j()));
        v(printWriter, "boolean", "CarAppLibrary__skip_car_text_view_pre_draw_logic_for_empty_variants", java.lang.String.valueOf(defpackage.acpd.T()));
        v(printWriter, "boolean", "CarAppLibrary__attach_alert_notification_flow_to_lifecycle", java.lang.String.valueOf(defpackage.acpd.x()));
        v(printWriter, "boolean", "CarAppLibrary__skip_car_text_view_pre_draw", java.lang.String.valueOf(defpackage.acpd.S()));
        v(printWriter, "boolean", "CarAppLibrary__return_cached_negotiated_api", java.lang.String.valueOf(defpackage.acpd.P()));
        v(printWriter, "boolean", "CarAppLibrary__use_no_op_latency_logger", java.lang.String.valueOf(defpackage.acpd.ac()));
        v(printWriter, "boolean", "CarAppLibrary__skip_loading_spinner_for_menu_template_first_chunk_kill_switch", java.lang.String.valueOf(defpackage.acpd.U()));
        v(printWriter, "boolean", "CarAppLibrary__scale_aap_compoable_view_as_per_current_screen_size_kill_switch", java.lang.String.valueOf(defpackage.acpd.Q()));
        v(printWriter, "boolean", "CarAppLibrary__emitter_persistent_ui_state_enabled_kill_switch", java.lang.String.valueOf(defpackage.acpd.B()));
        v(printWriter, "boolean", "CarAppLibrary__sectioned_item_template_enhanced_layout_enabled", java.lang.String.valueOf(defpackage.acpd.R()));
        v(printWriter, "boolean", "CarAppLibrary__all_templates_in_compose_enabled", java.lang.String.valueOf(defpackage.acpd.t()));
        v(printWriter, "boolean", "CarAppLibrary__timer_persistence_kill_switch", java.lang.String.valueOf(defpackage.acpd.Y()));
        v(printWriter, "boolean", "CarAppLibrary__tab_template_hide_content_container_when_loading_kill_switch", java.lang.String.valueOf(defpackage.acpd.W()));
        v(printWriter, "boolean", "CarAppLibrary__material_dialpad_call_button_focus_fix_kill_switch", java.lang.String.valueOf(defpackage.acpd.G()));
        v(printWriter, "boolean", "CarAppLibrary__speedbump_compose_enabled_kill_switch", java.lang.String.valueOf(defpackage.acpd.V()));
        v(printWriter, "boolean", "CarAppLibrary__move_focus_if_shown_kill_switch", java.lang.String.valueOf(defpackage.acpd.J()));
        v(printWriter, "boolean", "CarAppLibrary__use_correct_speedbump_manager_kill_switch", java.lang.String.valueOf(defpackage.acpd.aa()));
        v(printWriter, "boolean", "CarAppLibrary__use_ui_model_for_initial_focus_kill_switch", java.lang.String.valueOf(defpackage.acpd.ad()));
        v(printWriter, "boolean", "CarAppLibrary__change_next_turn_background_for_pure_black_kill_switch", java.lang.String.valueOf(defpackage.acpd.z()));
        v(printWriter, "boolean", "CarAppLibrary__prevent_input_propagation_for_map_templates_kill_switch", java.lang.String.valueOf(defpackage.acpd.M()));
        v(printWriter, "long", "CarAppLibrary__tab_layout_orientation", java.lang.Long.valueOf(defpackage.acpd.d()).toString());
        v(printWriter, "boolean", "CarAppLibrary__pane_widget_warn_under_min_screen_size_kill_switch", java.lang.String.valueOf(defpackage.acpd.L()));
        v(printWriter, "boolean", "CarAppLibrary__moderation_exempt_kill_switch", java.lang.String.valueOf(defpackage.acpd.I()));
        v(printWriter, "boolean", "CarAppLibrary__unexport_template_broadcast_receiver_kill_switch", java.lang.String.valueOf(defpackage.acpd.Z()));
        v(printWriter, "boolean", "CarAppLibrary__adaptive_sizing_enabled", java.lang.String.valueOf(defpackage.acpd.s()));
        v(printWriter, "boolean", "CarAppLibrary__allow_tall_narrow_for_nav_apps", java.lang.String.valueOf(defpackage.acpd.u()));
        v(printWriter, "boolean", "CarAppLibrary__cache_surface_callbacks_enabled", java.lang.String.valueOf(defpackage.acpd.y()));
        v(printWriter, "boolean", "CarAppLibrary__enable_row_expansion_animation_kill_switch", java.lang.String.valueOf(defpackage.acpd.E()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__disable_passive_tint_for_alerts_packages", juu.u(defpackage.acpd.i()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__force_passive_tint_for_icons_packages", juu.u(defpackage.acpd.l()));
        v(printWriter, "boolean", "CarAppLibrary__recreate_map_view_context_on_config_change_kill_switch", java.lang.String.valueOf(defpackage.acpd.N()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarAppLibrary__force_enable_app_theme_packages", juu.u(defpackage.acpd.k()));
        v(printWriter, "boolean", "CarAppLibrary__async_nav_state_change_kill_switch", java.lang.String.valueOf(defpackage.acpd.w()));
        v(printWriter, "boolean", "CarAppLibrary__enable_progress_buttons_on_dashboard_mode", java.lang.String.valueOf(defpackage.acpd.D()));
        v(printWriter, "boolean", "CarActivityManager__fail_resume_for_no_drawing_spec_kill_switch", java.lang.String.valueOf(defpackage.acpa.i()));
        v(printWriter, "boolean", "CarActivityManager__fail_resume_for_wrong_state_kill_switch", java.lang.String.valueOf(defpackage.acpa.j()));
        v(printWriter, "boolean", "CarActivityManager__check_start_info_for_fallback_kill_switch", java.lang.String.valueOf(defpackage.acpa.h()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "CarActivityManager__interaction_log_command_codes", juu.s(defpackage.acpa.b()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarActivityManager__interaction_log_packages", juu.u(defpackage.acpa.e()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "CarActivityManager__latency_log_command_codes", juu.s(defpackage.acpa.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "CarActivityManager__gmm_start_sub_phase_timers_hu_make_allow_list", juu.u(defpackage.acpa.d()));
        v(printWriter, "boolean", "CarActivityManager__cancel_pending_lifecycle_events_for_finish", java.lang.String.valueOf(defpackage.acpa.g()));
        v(printWriter, "boolean", "CarActivityManager__forward_keycode_tel_to_gearhead", java.lang.String.valueOf(defpackage.acpa.k()));
        v(printWriter, "boolean", "CarActivityManager__use_pending_video_config_kill_switch", java.lang.String.valueOf(defpackage.acpa.l()));
        v(printWriter, "boolean", "Bugreport__delayed_api_enabled", java.lang.String.valueOf(defpackage.acox.g()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "Bugreport__better_bug_hotlist_ids", juu.t(defpackage.acox.d()));
        v(printWriter, "long", "Bugreport__min_minutes_between_requests", java.lang.Long.valueOf(defpackage.acox.b()).toString());
        v(printWriter, "boolean", "Bugreport__user_education_is_dry_run", java.lang.String.valueOf(defpackage.acox.i()));
        v(printWriter, "long", "Bugreport__user_education_nth_run_count", java.lang.Long.valueOf(defpackage.acox.c()).toString());
        v(printWriter, "boolean", "Bugreport__allow_trigger_from_hu", java.lang.String.valueOf(defpackage.acox.f()));
        v(printWriter, "boolean", "Bugreport__keep_bugreport_on_retrieval", java.lang.String.valueOf(defpackage.acox.h()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "BufferPoolsFeature__max_pool_capacities", juu.s(defpackage.acou.c()));
        v(printWriter, "long", "BufferPoolsFeature__crash_on_buffer_leak_threshold_video", java.lang.Long.valueOf(defpackage.acou.b()).toString());
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "Boardwalk__news_browser_available", juu.m(defpackage.acor.c()));
        v(printWriter, "long", "Boardwalk__start_content_window_animation_timeout_ms", java.lang.Long.valueOf(defpackage.acor.b()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "BluetoothPairing__fsm_telemetry_interesting_fsm_state_types", juu.s(defpackage.acoo.b()));
        v(printWriter, "boolean", "BluetoothPairing__car_bluetooth_service_disable", java.lang.String.valueOf(defpackage.acoo.d()));
        v(printWriter, "boolean", "BluetoothPairing__prevent_rebonding_during_wireless_projection", java.lang.String.valueOf(defpackage.acoo.j()));
        v(printWriter, "boolean", "BluetoothPairing__prevent_rebonding_during_wired_projection", java.lang.String.valueOf(defpackage.acoo.i()));
        v(printWriter, "boolean", "BluetoothPairing__disable_a2dp", java.lang.String.valueOf(defpackage.acoo.f()));
        v(printWriter, "boolean", "BluetoothPairing__no_force_enable_a2dp_kill_switch", java.lang.String.valueOf(defpackage.acoo.h()));
        v(printWriter, "boolean", "BluetoothPairing__check_bluetooth_profile_util_is_initialized_kill_switch", java.lang.String.valueOf(defpackage.acoo.e()));
        v(printWriter, "boolean", "BluetoothPairing__log_connectivity_event_on_bluetooth_fsm_state_change_kill_switch", java.lang.String.valueOf(defpackage.acoo.g()));
        v(printWriter, "boolean", "BatterySaver__warning_enabled", java.lang.String.valueOf(defpackage.acol.c()));
        v(printWriter, "long", "AudioSaver__storage_limit_bytes", java.lang.Long.valueOf(acoi.b()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AudioPolicy__single_channel_capture_hu_list", juu.u(defpackage.acof.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "AudioPolicy__additional_media_stream_audio_usages_list", juu.s(defpackage.acof.b()));
        v(printWriter, "long", "AudioFocus__loss_asr_stop_delay_ms", java.lang.Long.valueOf(acoc.b()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AudioFocus__media_channel_access_during_gain_transient_allow_list", juu.u(acoc.d()));
        v(printWriter, "boolean", "AudioFocus__hold_channels_for_asr", java.lang.String.valueOf(acoc.g()));
        v(printWriter, "com.google.protos.androidauto.flags.FilterFlag", "AudioFocus__assistant_audio_focus_packages_allow_list", juu.m(acoc.c()));
        v(printWriter, "String", "AudioFocus__should_stop_media_without_interrupting_guidance_deny_list", acoc.f());
        v(printWriter, "boolean", "AudioFlowControl__throttling_disabled", java.lang.String.valueOf(defpackage.acnz.h()));
        v(printWriter, "boolean", "AudioFlowControl__force_flow_control_for_small_max_unacked", java.lang.String.valueOf(defpackage.acnz.g()));
        v(printWriter, "boolean", "AudioFlowControl__use_audio_frame_processor_interface_kill_switch", java.lang.String.valueOf(defpackage.acnz.i()));
        v(printWriter, "boolean", "AudioFlowControl__use_synchronous_audio_processor", java.lang.String.valueOf(defpackage.acnz.j()));
        v(printWriter, "long", "AudioFlowControl__transmission_queue_max_capacity", java.lang.Long.valueOf(defpackage.acnz.d()).toString());
        v(printWriter, "boolean", "AudioFlowControl__enable_bottom_half_sender_lib_queue_dropping", java.lang.String.valueOf(defpackage.acnz.f()));
        v(printWriter, "long", "AudioFlowControl__bottom_half_sender_lib_max_queue_ms", java.lang.Long.valueOf(defpackage.acnz.b()).toString());
        v(printWriter, "long", "AudioFlowControl__bottom_half_sender_lib_resume_queue_ms", java.lang.Long.valueOf(defpackage.acnz.c()).toString());
        v(printWriter, "long", "AudioDiagnosticsFeature__log_audio_latency_stats_telemetry_threshold_usb", java.lang.Long.valueOf(defpackage.acnw.c()).toString());
        v(printWriter, "long", "AudioDiagnosticsFeature__log_audio_latency_stats_telemetry_threshold_wifi", java.lang.Long.valueOf(defpackage.acnw.d()).toString());
        v(printWriter, "long", "AudioDiagnosticsFeature__audio_stats_logging_period_milliseconds", java.lang.Long.valueOf(defpackage.acnw.b()).toString());
        v(printWriter, "long", "AudioDiagnosticsFeature__report_audio_latency_stats_interval_ms", java.lang.Long.valueOf(defpackage.acnw.g()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "AudioDiagnosticsFeature__audio_latency_histogram_intervals_ms", juu.t(defpackage.acnw.h()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "AudioDiagnosticsFeature__audio_video_lag_histogram_intervals_ms", juu.t(defpackage.acnw.i()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int64ListParam", "AudioDiagnosticsFeature__audio_video_perceived_lag_histogram_intervals_ms", juu.t(defpackage.acnw.j()));
        v(printWriter, "long", "AudioDiagnosticsFeature__max_events_per_diagnostics_message", java.lang.Long.valueOf(defpackage.acnw.e()).toString());
        v(printWriter, "long", "AudioDiagnosticsFeature__publishing_period_millis", java.lang.Long.valueOf(defpackage.acnw.f()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AudioCodecPreferencesFeature__wifi_pcm_codec_exclusion_list", juu.u(acns.b()));
        v(printWriter, "boolean", "AudioBugs__enable_save_audio_developer_setting", java.lang.String.valueOf(defpackage.acnp.c()));
        v(printWriter, "long", "AudioBufferingFeature__default_minimum_audio_buffers_for_wifi", java.lang.Long.valueOf(defpackage.acnl.b()).toString());
        v(printWriter, "long", "AudioBufferingFeature__minimum_audio_buffers_for_wifi", java.lang.Long.valueOf(defpackage.acnl.g()).toString());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AudioBufferingFeature__minimum_audio_buffers_for_wifi_exclusion_list", juu.u(defpackage.acnl.m()));
        v(printWriter, "boolean", "AudioBufferingFeature__use_min_audio_buffer_calculator_kill_switch", java.lang.String.valueOf(defpackage.acnl.q()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AudioBufferingFeature__media_minimum_audio_buffers_for_wifi_exception_list", juu.u(defpackage.acnl.l()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AudioBufferingFeature__tts_minimum_audio_buffers_for_wifi_exception_list", juu.u(defpackage.acnl.n()));
        v(printWriter, "long", "AudioBufferingFeature__default_minimum_audio_buffers_for_wifi_navigation", java.lang.Long.valueOf(defpackage.acnl.c()).toString());
        v(printWriter, "long", "AudioBufferingFeature__minimum_audio_buffers_for_wifi_navigation", java.lang.Long.valueOf(defpackage.acnl.h()).toString());
        v(printWriter, "long", "AudioBufferingFeature__minimum_audio_buffers_for_usb", java.lang.Long.valueOf(defpackage.acnl.e()).toString());
        v(printWriter, "long", "AudioBufferingFeature__minimum_audio_buffers_for_usb_navigation", java.lang.Long.valueOf(defpackage.acnl.f()).toString());
        v(printWriter, "long", "AudioBufferingFeature__system_sound_capture_queue_frames_navigation_16khz", java.lang.Long.valueOf(defpackage.acnl.i()).toString());
        v(printWriter, "long", "AudioBufferingFeature__system_sound_capture_queue_frames_navigation_48khz", java.lang.Long.valueOf(defpackage.acnl.j()).toString());
        v(printWriter, "boolean", "AudioBufferingFeature__ackless_mode_minimum_audio_buffers_kill_switch", java.lang.String.valueOf(defpackage.acnl.p()));
        v(printWriter, "long", "AudioBufferingFeature__media_ackless_mode_minimum_audio_buffers_count", java.lang.Long.valueOf(defpackage.acnl.d()).toString());
        v(printWriter, "long", "AudioBufferingFeature__tts_ackless_mode_minimum_audio_buffers_count", java.lang.Long.valueOf(defpackage.acnl.k()).toString());
        v(printWriter, "boolean", "AssistantTesting__projected_enabled", java.lang.String.valueOf(acni.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.Int32ListParam", "Assistant__supported_api_versions", juu.s(defpackage.acnf.p()));
        v(printWriter, "long", "Assistant__dodgeboost_initial_handshake_min_gsa_version", java.lang.Long.valueOf(defpackage.acnf.i()).toString());
        v(printWriter, "boolean", "Assistant__dodgeboost_initial_handshake_enabled", java.lang.String.valueOf(defpackage.acnf.u()));
        v(printWriter, "long", "Assistant__api_version_override", java.lang.Long.valueOf(defpackage.acnf.h()).toString());
        v(printWriter, "boolean", "Assistant__enable_waive_priority_bind", java.lang.String.valueOf(defpackage.acnf.w()));
        v(printWriter, "boolean", "Assistant__has_latest_robin_model", java.lang.String.valueOf(defpackage.acnf.A()));
        v(printWriter, "boolean", "Assistant__upgrade_model_notification_enabled", java.lang.String.valueOf(defpackage.acnf.F()));
        v(printWriter, "boolean", "Assistant__upgrade_model_notification_alpha_enabled", java.lang.String.valueOf(defpackage.acnf.E()));
        v(printWriter, "boolean", "Assistant__gemini_barge_in_enabled_kill_switch", java.lang.String.valueOf(defpackage.acnf.x()));
        v(printWriter, "double", "Assistant__grpc_retry_initial_backoff_seconds", java.lang.Double.valueOf(defpackage.acnf.d()).toString());
        v(printWriter, "double", "Assistant__grpc_retry_max_backoff_seconds", java.lang.Double.valueOf(defpackage.acnf.e()).toString());
        v(printWriter, "double", "Assistant__grpc_retry_backoff_multiplier", java.lang.Double.valueOf(defpackage.acnf.c()).toString());
        v(printWriter, "long", "Assistant__grpc_retry_max_attempts", java.lang.Long.valueOf(defpackage.acnf.l()).toString());
        v(printWriter, "long", "Assistant__robin_model_notification_max_count", java.lang.Long.valueOf(defpackage.acnf.n()).toString());
        v(printWriter, "double", "Assistant__robin_model_notification_triggering_rate", java.lang.Double.valueOf(defpackage.acnf.g()).toString());
        v(printWriter, "double", "Assistant__quick_feedback_triggering_rate", java.lang.Double.valueOf(defpackage.acnf.f()).toString());
        v(printWriter, "boolean", "Assistant__quick_feedback_throttling_enabled", java.lang.String.valueOf(defpackage.acnf.C()));
        v(printWriter, "double", "Assistant__assistant_message_summarization_quick_feedback_triggering_rate", java.lang.Double.valueOf(defpackage.acnf.b()).toString());
        v(printWriter, "boolean", "Assistant__assistant_message_summarization_quick_feedback_throttling_enabled", java.lang.String.valueOf(defpackage.acnf.r()));
        v(printWriter, "long", "Assistant__transcription_character_limit", java.lang.Long.valueOf(defpackage.acnf.o()).toString());
        v(printWriter, "boolean", "Assistant__check_all_assistant_regions_enabled", java.lang.String.valueOf(defpackage.acnf.s()));
        v(printWriter, "boolean", "Assistant__voice_session_manager_handles_asr_enabled", java.lang.String.valueOf(defpackage.acnf.H()));
        v(printWriter, "long", "Assistant__education_delay_milliseconds", java.lang.Long.valueOf(defpackage.acnf.j()).toString());
        v(printWriter, "long", "Assistant__gemini_live_dashboard_focus_delay", java.lang.Long.valueOf(defpackage.acnf.k()).toString());
        v(printWriter, "boolean", "Assistant__gsa_dismisses_on_nav_active_start_enabled", java.lang.String.valueOf(defpackage.acnf.z()));
        v(printWriter, "boolean", "Assistant__interrupt_live_on_short_search_key_press_kill_switch", java.lang.String.valueOf(defpackage.acnf.B()));
        v(printWriter, "boolean", "Assistant__enable_feedback_after_thumbs_down", java.lang.String.valueOf(defpackage.acnf.v()));
        v(printWriter, "long", "Assistant__icon_experiment_variant", java.lang.Long.valueOf(defpackage.acnf.m()).toString());
        v(printWriter, "boolean", "Assistant__debug_query_sender_enabled", java.lang.String.valueOf(defpackage.acnf.t()));
        v(printWriter, "boolean", "Assistant__scrim_click_closes_when_pending_open_kill_switch", java.lang.String.valueOf(defpackage.acnf.D()));
        v(printWriter, "boolean", "Assistant__virtual_device_id_in_client_state_snapshot_kill_switch", java.lang.String.valueOf(defpackage.acnf.G()));
        v(printWriter, "boolean", "Assistant__gemini_luminous_ui_updates", java.lang.String.valueOf(defpackage.acnf.y()));
        v(printWriter, "String", "AppValidation__allowed_package_list", defpackage.acnc.e());
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AppValidation__blocked_packages_by_installer", juu.u(defpackage.acnc.c()));
        v(printWriter, "com.google.protos.experiments.proto.TypedFeatures.StringListParam", "AppValidation__allowed_3p_installers", juu.u(defpackage.acnc.b()));
        v(printWriter, "boolean", "AppValidation__should_bypass_validation", java.lang.String.valueOf(defpackage.acnc.g()));
        v(printWriter, "boolean", "AppValidation__dhu_bypass_validation", java.lang.String.valueOf(defpackage.acnc.f()));
        v(printWriter, "boolean", "AppValidation__swallow_play_api_exception", java.lang.String.valueOf(defpackage.acnc.h()));
        v(printWriter, "boolean", "AppValidation__swallow_play_api_exception_return_value", java.lang.String.valueOf(defpackage.acnc.i()));
        v(printWriter, "boolean", "AppQualityTester__developer_setting_enabled", java.lang.String.valueOf(acmz.c()));
        v(printWriter, "boolean", "ApolloFeature__apollo", java.lang.String.valueOf(defpackage.acmw.c()));
        v(printWriter, "boolean", "ApolloFeature__expressive_enabled", java.lang.String.valueOf(defpackage.acmw.f()));
        v(printWriter, "boolean", "ApolloFeature__ignore_unplayed_buffering_sessions_kill_switch", java.lang.String.valueOf(defpackage.acmw.i()));
        v(printWriter, "boolean", "ApolloFeature__no_auto_swipe_to_suggestions_kill_switch", java.lang.String.valueOf(defpackage.acmw.k()));
        v(printWriter, "boolean", "ApolloFeature__decrease_pager_snap_threshold_kill_switch", java.lang.String.valueOf(defpackage.acmw.e()));
        v(printWriter, "boolean", "ApolloFeature__bitmap_live_data_use_copy_kill_switch", java.lang.String.valueOf(defpackage.acmw.d()));
        v(printWriter, "boolean", "ApolloFeature__recycled_bitmap_check_kill_switch", java.lang.String.valueOf(defpackage.acmw.l()));
        v(printWriter, "boolean", "ApolloFeature__ignore_invalid_active_sessions_kill_switch", java.lang.String.valueOf(defpackage.acmw.h()));
        v(printWriter, "boolean", "ApolloFeature__limit_one_playback_only_app_per_package_kill_switch", java.lang.String.valueOf(defpackage.acmw.j()));
        v(printWriter, "boolean", "ApolloFeature__filter_media_sessions_outside_of_fragment_kill_switch", java.lang.String.valueOf(defpackage.acmw.g()));
        v(printWriter, "boolean", "ApolloFeature__safe_shapeable_image_view_kill_switch", java.lang.String.valueOf(defpackage.acmw.m()));
        v(printWriter, "String", "AndroidAuto__apps_url", acmt.c());
        v(printWriter, "String", "AndroidAuto__companion_video_url", acmt.d());
        v(printWriter, "String", "AndroidAuto__compatible_cars_url", acmt.e());
        v(printWriter, "boolean", "AdasRouteInfoFeature__adas_route_info_enabled", java.lang.String.valueOf(acmq.c()));
        v(printWriter, "boolean", "AdasRouteInfoFeature__car_intent_enabled", java.lang.String.valueOf(acmq.d()));
        v(printWriter, "long", "AceFeature__mode", java.lang.Long.valueOf(acmn.c()).toString());
        v(printWriter, "boolean", "AceFeature__fake_insight_generation", java.lang.String.valueOf(acmn.f()));
        v(printWriter, "long", "AceFeature__maximum_ace_wait_time", java.lang.Long.valueOf(acmn.b()).toString());
        v(printWriter, "boolean", "AceFeature__actionable_insight_enabled", java.lang.String.valueOf(acmn.e()));
        v(printWriter, "boolean", "AapmEducationFeature__aapm_settings_info_enabled", java.lang.String.valueOf(defpackage.acmk.e()));
        v(printWriter, "boolean", "AapmEducationFeature__aapm_hun_enabled", java.lang.String.valueOf(defpackage.acmk.c()));
        v(printWriter, "boolean", "AapmEducationFeature__aapm_on_start_telemetry_kill_switch", java.lang.String.valueOf(defpackage.acmk.d()));
    }

    public static synchronized void u(android.content.Context context) {
        defpackage.wbn.b = false;
        defpackage.wbn.f(context);
    }

    private static void v(java.io.PrintWriter printWriter, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (printWriter != null) {
            printWriter.format("%s %s = %s\n", str, str2, str3);
        } else {
            android.util.Log.d("GH.BuildConfig", java.lang.String.format("%s %s = %s", str, str2, str3));
        }
    }
}
