package defpackage;

/* loaded from: classes.dex */
public final class acys implements acyr {
    private static final wcv a = new wcv(aclg.b, 6);

    @Override // defpackage.acyr
    public final long a() {
        return ((Long) a.b(2, "VideoTimingControllerFeature__video_timing_controller_max_delay_ms", 17L).gu()).longValue();
    }

    @Override // defpackage.acyr
    public final long b() {
        return ((Long) a.b(3, "VideoTimingControllerFeature__video_timing_controller_max_delay_parked_exp_ms", 70L).gu()).longValue();
    }

    @Override // defpackage.acyr
    public final long c() {
        return ((Long) a.b(4, "VideoTimingControllerFeature__video_timing_controller_min_delay_ms", 9L).gu()).longValue();
    }

    @Override // defpackage.acyr
    public final long d() {
        return ((Long) a.b(5, "VideoTimingControllerFeature__video_timing_controller_min_delay_parked_exp_ms", 40L).gu()).longValue();
    }

    @Override // defpackage.acyr
    public final boolean e() {
        return ((Boolean) a.d(0, "VideoTimingControllerFeature__enable_video_timing_controller", true).gu()).booleanValue();
    }

    @Override // defpackage.acyr
    public final boolean f() {
        return ((Boolean) a.d(1, "VideoTimingControllerFeature__enable_video_timing_controller_parked_exp", true).gu()).booleanValue();
    }
}
