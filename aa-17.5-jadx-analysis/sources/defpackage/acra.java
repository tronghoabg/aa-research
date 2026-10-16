package defpackage;

/* loaded from: classes.dex */
public final class acra implements acqz {
    private static final wcv a = new wcv(aclg.b, 19);

    @Override // defpackage.acqz
    public final double a() {
        return ((Double) a.a(13, "FrameRateRestrictions__thermal_headroom_cooling_hysteresis_factor", 0.85d).gu()).doubleValue();
    }

    @Override // defpackage.acqz
    public final long b() {
        return ((Long) a.b(1, "FrameRateRestrictions__cap_fps_when_non_interactive_limit", 30L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long c() {
        return ((Long) a.b(3, "FrameRateRestrictions__fps_limit_for_power_low_display_idle", 30L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long d() {
        return ((Long) a.b(4, "FrameRateRestrictions__fps_limit_for_power_low_display_interactive", 0L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long e() {
        return ((Long) a.b(5, "FrameRateRestrictions__fps_limit_for_power_normal_display_idle", 0L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long f() {
        return ((Long) a.b(6, "FrameRateRestrictions__fps_limit_for_restriction_level_high", 15L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long g() {
        return ((Long) a.b(7, "FrameRateRestrictions__fps_limit_for_restriction_level_low", 0L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long h() {
        return ((Long) a.b(8, "FrameRateRestrictions__fps_limit_for_restriction_level_medium", 30L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long i() {
        return ((Long) a.b(10, "FrameRateRestrictions__min_number_of_displays_to_trigger_restrictions", 2L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long j() {
        return ((Long) a.b(11, "FrameRateRestrictions__min_number_of_impactful_activities_to_trigger_restrictions", -1L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long k() {
        return ((Long) a.b(12, "FrameRateRestrictions__min_thermal_status_for_frame_rate_restrictions", 3L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long l() {
        return ((Long) a.b(14, "FrameRateRestrictions__thermal_headroom_forecast_seconds", 60L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final long m() {
        return ((Long) a.b(15, "FrameRateRestrictions__thermal_headroom_polling_interval_seconds", 15L).gu()).longValue();
    }

    @Override // defpackage.acqz
    public final abqz n() {
        return (abqz) a.e(0, "FrameRateRestrictions__cap_fps_when_non_interactive_cars", new acml(15), "Cg4KBGZvcmQSBkZPNDE5MAoOCgRmb3JkEgZGTzQxOTEKBwoFY3VwcmEKBgoEc2VhdAoHCgVza29kYQoPCg12b2xrc3dhZ2VuIGFnCgwKCnZvbGtzd2FnZW4KBAoCdncKCAoGxaBrb2RhCggKBmdvb2dsZQ").gu();
    }

    @Override // defpackage.acqz
    public final abru o() {
        return (abru) a.e(9, "FrameRateRestrictions__impactful_component_names", new acms(13), "ClRjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tYXBzL2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5jYXIuR21tQ2FyUHJvamVjdGlvblNlcnZpY2UKdGNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLm1hcHMvY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmNhci5wcm9qZWN0ZWQuYXV4aWxpYXJ5bWFwLkdtbUNhckF1eGlsaWFyeVByb2plY3Rpb25TZXJ2aWNlCmtjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tYXBzL2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5jYXIuV2lkZXNjcmVlbldpZGdldExpbWl0ZWRHbW1DYXJQcm9qZWN0aW9uU2VydmljZQpcY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmZpc2hmb29kL2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5jYXIuR21tQ2FyUHJvamVjdGlvblNlcnZpY2UKfGNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5maXNoZm9vZC9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0uY2FyLnByb2plY3RlZC5hdXhpbGlhcnltYXAuR21tQ2FyQXV4aWxpYXJ5UHJvamVjdGlvblNlcnZpY2UKc2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5maXNoZm9vZC9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0uY2FyLldpZGVzY3JlZW5XaWRnZXRMaW1pdGVkR21tQ2FyUHJvamVjdGlvblNlcnZpY2UKU2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0uY2FyLkdtbUNhclByb2plY3Rpb25TZXJ2aWNlCnNjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0vY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmNhci5wcm9qZWN0ZWQuYXV4aWxpYXJ5bWFwLkdtbUNhckF1eGlsaWFyeVByb2plY3Rpb25TZXJ2aWNlCmpjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0vY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmNhci5XaWRlc2NyZWVuV2lkZ2V0TGltaXRlZEdtbUNhclByb2plY3Rpb25TZXJ2aWNl").gu();
    }

    @Override // defpackage.acqz
    public final boolean p() {
        return ((Boolean) a.d(2, "FrameRateRestrictions__disable_interactivity_tracking", false).gu()).booleanValue();
    }

    @Override // defpackage.acqz
    public final boolean q() {
        return ((Boolean) a.d(16, "FrameRateRestrictions__thermal_headroom_throttling_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqz
    public final boolean r() {
        return ((Boolean) a.d(17, "FrameRateRestrictions__use_power_save_mode_for_battery_level", false).gu()).booleanValue();
    }

    @Override // defpackage.acqz
    public final boolean s() {
        return ((Boolean) a.d(18, "FrameRateRestrictions__use_projection_power_manager_handler_thread_kill_switch", true).gu()).booleanValue();
    }
}
