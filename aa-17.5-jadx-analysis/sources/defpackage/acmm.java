package defpackage;

/* loaded from: classes.dex */
public final class acmm implements acmk {
    private static final wcv a = new wcv(aclg.b, 15);

    @Override // defpackage.acmk
    public final long a() {
        return ((Long) a.b(1, "AudioBufferingFeature__default_minimum_audio_buffers_for_wifi", 8L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long b() {
        return ((Long) a.b(2, "AudioBufferingFeature__default_minimum_audio_buffers_for_wifi_navigation", 4L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long c() {
        return ((Long) a.b(3, "AudioBufferingFeature__media_ackless_mode_minimum_audio_buffers_count", 0L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long d() {
        return ((Long) a.b(5, "AudioBufferingFeature__minimum_audio_buffers_for_usb", 0L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long e() {
        return ((Long) a.b(6, "AudioBufferingFeature__minimum_audio_buffers_for_usb_navigation", 0L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long f() {
        return ((Long) a.b(7, "AudioBufferingFeature__minimum_audio_buffers_for_wifi", 4L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long g() {
        return ((Long) a.b(9, "AudioBufferingFeature__minimum_audio_buffers_for_wifi_navigation", 4L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long h() {
        return ((Long) a.b(10, "AudioBufferingFeature__system_sound_capture_queue_frames_navigation_16khz", 8L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long i() {
        return ((Long) a.b(11, "AudioBufferingFeature__system_sound_capture_queue_frames_navigation_48khz", 12L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final long j() {
        return ((Long) a.b(12, "AudioBufferingFeature__tts_ackless_mode_minimum_audio_buffers_count", 4L).gu()).longValue();
    }

    @Override // defpackage.acmk
    public final abru k() {
        return (abru) a.e(4, "AudioBufferingFeature__media_minimum_audio_buffers_for_wifi_exception_list", new acml(0), "CihSQU0sLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbj04Ci1VY29ubmVjdCwsLCxNaXRzdWJpc2hpIEVsZWN0cmljIENvcnBvcmF0aW9uPTgKGlVjb25uZWN0LCwxLjMsLFBhbmFzb25pYz04").gu();
    }

    @Override // defpackage.acmk
    public final abru l() {
        return (abru) a.e(8, "AudioBufferingFeature__minimum_audio_buffers_for_wifi_exclusion_list", new acml(0), "CiZSQU0sLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbgorVWNvbm5lY3QsLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbgoYVWNvbm5lY3QsLDEuMywsUGFuYXNvbmlj").gu();
    }

    @Override // defpackage.acmk
    public final abru m() {
        return (abru) a.e(13, "AudioBufferingFeature__tts_minimum_audio_buffers_for_wifi_exception_list", new acml(0), "CihSQU0sLCwsTWl0c3ViaXNoaSBFbGVjdHJpYyBDb3Jwb3JhdGlvbj00Ci1VY29ubmVjdCwsLCxNaXRzdWJpc2hpIEVsZWN0cmljIENvcnBvcmF0aW9uPTQKGlVjb25uZWN0LCwxLjMsLFBhbmFzb25pYz00ChMsLCwsSE1HLGNvbm5lY3Rfcz04").gu();
    }

    @Override // defpackage.acmk
    public final boolean n() {
        return ((Boolean) a.d(0, "AudioBufferingFeature__ackless_mode_minimum_audio_buffers_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acmk
    public final boolean o() {
        return ((Boolean) a.d(14, "AudioBufferingFeature__use_min_audio_buffer_calculator_kill_switch", true).gu()).booleanValue();
    }
}
