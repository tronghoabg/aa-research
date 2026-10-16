package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acno implements defpackage.acnm {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 15);

    @Override // defpackage.acnm
    public final long a() {
        return ((java.lang.Long) a.b(1, "AudioBufferingFeature__default_minimum_audio_buffers_for_wifi", 8L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long b() {
        return ((java.lang.Long) a.b(2, "AudioBufferingFeature__default_minimum_audio_buffers_for_wifi_navigation", 4L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long c() {
        return ((java.lang.Long) a.b(3, "AudioBufferingFeature__media_ackless_mode_minimum_audio_buffers_count", 0L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long d() {
        return ((java.lang.Long) a.b(5, "AudioBufferingFeature__minimum_audio_buffers_for_usb", 0L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long e() {
        return ((java.lang.Long) a.b(6, "AudioBufferingFeature__minimum_audio_buffers_for_usb_navigation", 0L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long f() {
        return ((java.lang.Long) a.b(7, "AudioBufferingFeature__minimum_audio_buffers_for_wifi", 4L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long g() {
        return ((java.lang.Long) a.b(9, "AudioBufferingFeature__minimum_audio_buffers_for_wifi_navigation", 4L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long h() {
        return ((java.lang.Long) a.b(10, "AudioBufferingFeature__system_sound_capture_queue_frames_navigation_16khz", 8L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long i() {
        return ((java.lang.Long) a.b(11, "AudioBufferingFeature__system_sound_capture_queue_frames_navigation_48khz", 12L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final long j() {
        return ((java.lang.Long) a.b(12, "AudioBufferingFeature__tts_ackless_mode_minimum_audio_buffers_count", 4L).fF()).longValue();
    }

    @Override // defpackage.acnm
    public final defpackage.absx k() {
        return (defpackage.absx) a.e(4, "AudioBufferingFeature__media_minimum_audio_buffers_for_wifi_exception_list", new defpackage.acnn(0), "CihSQU0sLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbj04Ci1VY29ubmVjdCwsLCxNaXRzdWJpc2hpIEVsZWN0cmljIENvcnBvcmF0aW9uPTgKGlVjb25uZWN0LCwxLjMsLFBhbmFzb25pYz04").fF();
    }

    @Override // defpackage.acnm
    public final defpackage.absx l() {
        return (defpackage.absx) a.e(8, "AudioBufferingFeature__minimum_audio_buffers_for_wifi_exclusion_list", new defpackage.acnn(0), "CiZSQU0sLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbgorVWNvbm5lY3QsLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbgoYVWNvbm5lY3QsLDEuMywsUGFuYXNvbmlj").fF();
    }

    @Override // defpackage.acnm
    public final defpackage.absx m() {
        return (defpackage.absx) a.e(13, "AudioBufferingFeature__tts_minimum_audio_buffers_for_wifi_exception_list", new defpackage.acnn(0), "CihSQU0sLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbj00Ci1VY29ubmVjdCwsLCxNaXRzdWJpc2hpIEVsZWN0cmljIENvcnBvcmF0aW9uPTQKGlVjb25uZWN0LCwxLjMsLFBhbmFzb25pYz00ChMsLCwsSE1HLGNvbm5lY3Rfcz04").fF();
    }

    @Override // defpackage.acnm
    public final boolean n() {
        return ((java.lang.Boolean) a.d(0, "AudioBufferingFeature__ackless_mode_minimum_audio_buffers_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acnm
    public final boolean o() {
        return ((java.lang.Boolean) a.d(14, "AudioBufferingFeature__use_min_audio_buffer_calculator_kill_switch", true).fF()).booleanValue();
    }
}
