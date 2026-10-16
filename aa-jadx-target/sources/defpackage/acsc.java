package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acsc implements defpackage.acsb {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 19);

    @Override // defpackage.acsb
    public final double a() {
        return ((java.lang.Double) a.a(13, "FrameRateRestrictions__thermal_headroom_cooling_hysteresis_factor", 0.85d).fF()).doubleValue();
    }

    @Override // defpackage.acsb
    public final long b() {
        return ((java.lang.Long) a.b(1, "FrameRateRestrictions__cap_fps_when_non_interactive_limit", 30L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long c() {
        return ((java.lang.Long) a.b(3, "FrameRateRestrictions__fps_limit_for_power_low_display_idle", 30L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long d() {
        return ((java.lang.Long) a.b(4, "FrameRateRestrictions__fps_limit_for_power_low_display_interactive", 0L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long e() {
        return ((java.lang.Long) a.b(5, "FrameRateRestrictions__fps_limit_for_power_normal_display_idle", 0L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long f() {
        return ((java.lang.Long) a.b(6, "FrameRateRestrictions__fps_limit_for_restriction_level_high", 15L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long g() {
        return ((java.lang.Long) a.b(7, "FrameRateRestrictions__fps_limit_for_restriction_level_low", 0L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long h() {
        return ((java.lang.Long) a.b(8, "FrameRateRestrictions__fps_limit_for_restriction_level_medium", 30L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long i() {
        return ((java.lang.Long) a.b(10, "FrameRateRestrictions__min_number_of_displays_to_trigger_restrictions", 2L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long j() {
        return ((java.lang.Long) a.b(11, "FrameRateRestrictions__min_number_of_impactful_activities_to_trigger_restrictions", -1L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long k() {
        return ((java.lang.Long) a.b(12, "FrameRateRestrictions__min_thermal_status_for_frame_rate_restrictions", 3L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long l() {
        return ((java.lang.Long) a.b(14, "FrameRateRestrictions__thermal_headroom_forecast_seconds", 60L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final long m() {
        return ((java.lang.Long) a.b(15, "FrameRateRestrictions__thermal_headroom_polling_interval_seconds", 15L).fF()).longValue();
    }

    @Override // defpackage.acsb
    public final defpackage.absc n() {
        return (defpackage.absc) a.e(0, "FrameRateRestrictions__cap_fps_when_non_interactive_cars", new defpackage.acnn(15), "Cg4KBGZvcmQSBkZPNDE5MAoOCgRmb3JkEgZGTzQxOTEKBwoFY3VwcmEKBgoEc2VhdAoHCgVza29kYQoPCg12b2xrc3dhZ2VuIGFnCgwKCnZvbGtzd2FnZW4KBAoCdncKCAoGxaBrb2RhCggKBmdvb2dsZQ").fF();
    }

    @Override // defpackage.acsb
    public final defpackage.absx o() {
        return (defpackage.absx) a.e(9, "FrameRateRestrictions__impactful_component_names", new defpackage.acnu(13), "ClRjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tYXBzL2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5jYXIuR21tQ2FyUHJvamVjdGlvblNlcnZpY2UKdGNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLm1hcHMvY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmNhci5wcm9qZWN0ZWQuYXV4aWxpYXJ5bWFwLkdtbUNhckF1eGlsaWFyeVByb2plY3Rpb25TZXJ2aWNlCmtjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tYXBzL2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5jYXIuV2lkZXNjcmVlbldpZGdldExpbWl0ZWRHbW1DYXJQcm9qZWN0aW9uU2VydmljZQpcY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmZpc2hmb29kL2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5jYXIuR21tQ2FyUHJvamVjdGlvblNlcnZpY2UKfGNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5maXNoZm9vZC9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0uY2FyLnByb2plY3RlZC5hdXhpbGlhcnltYXAuR21tQ2FyQXV4aWxpYXJ5UHJvamVjdGlvblNlcnZpY2UKc2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5maXNoZm9vZC9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0uY2FyLldpZGVzY3JlZW5XaWRnZXRMaW1pdGVkR21tQ2FyUHJvamVjdGlvblNlcnZpY2UKU2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0uY2FyLkdtbUNhclByb2plY3Rpb25TZXJ2aWNlCnNjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0vY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmNhci5wcm9qZWN0ZWQuYXV4aWxpYXJ5bWFwLkdtbUNhckF1eGlsaWFyeVByb2plY3Rpb25TZXJ2aWNlCmpjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0vY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmNhci5XaWRlc2NyZWVuV2lkZ2V0TGltaXRlZEdtbUNhclByb2plY3Rpb25TZXJ2aWNl").fF();
    }

    @Override // defpackage.acsb
    public final boolean p() {
        return ((java.lang.Boolean) a.d(2, "FrameRateRestrictions__disable_interactivity_tracking", false).fF()).booleanValue();
    }

    @Override // defpackage.acsb
    public final boolean q() {
        return ((java.lang.Boolean) a.d(16, "FrameRateRestrictions__thermal_headroom_throttling_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acsb
    public final boolean r() {
        return ((java.lang.Boolean) a.d(17, "FrameRateRestrictions__use_power_save_mode_for_battery_level", false).fF()).booleanValue();
    }

    @Override // defpackage.acsb
    public final boolean s() {
        return ((java.lang.Boolean) a.d(18, "FrameRateRestrictions__use_projection_power_manager_handler_thread_kill_switch", true).fF()).booleanValue();
    }
}
