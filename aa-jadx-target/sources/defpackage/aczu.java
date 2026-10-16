package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aczu implements defpackage.aczt {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 6);

    @Override // defpackage.aczt
    public final long a() {
        return ((java.lang.Long) a.b(2, "VideoTimingControllerFeature__video_timing_controller_max_delay_ms", 17L).fF()).longValue();
    }

    @Override // defpackage.aczt
    public final long b() {
        return ((java.lang.Long) a.b(3, "VideoTimingControllerFeature__video_timing_controller_max_delay_parked_exp_ms", 70L).fF()).longValue();
    }

    @Override // defpackage.aczt
    public final long c() {
        return ((java.lang.Long) a.b(4, "VideoTimingControllerFeature__video_timing_controller_min_delay_ms", 9L).fF()).longValue();
    }

    @Override // defpackage.aczt
    public final long d() {
        return ((java.lang.Long) a.b(5, "VideoTimingControllerFeature__video_timing_controller_min_delay_parked_exp_ms", 40L).fF()).longValue();
    }

    @Override // defpackage.aczt
    public final boolean e() {
        return ((java.lang.Boolean) a.d(0, "VideoTimingControllerFeature__enable_video_timing_controller", true).fF()).booleanValue();
    }

    @Override // defpackage.aczt
    public final boolean f() {
        return ((java.lang.Boolean) a.d(1, "VideoTimingControllerFeature__enable_video_timing_controller_parked_exp", true).fF()).booleanValue();
    }
}
