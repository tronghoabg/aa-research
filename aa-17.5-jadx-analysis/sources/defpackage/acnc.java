package defpackage;

/* loaded from: classes3.dex */
public final class acnc implements acnb {
    private static final wcv a = new wcv(aclg.b, 5);

    @Override // defpackage.acnb
    public final long a() {
        return ((Long) a.b(2, "AudioFocus__loss_asr_stop_delay_ms", 50L).gu()).longValue();
    }

    @Override // defpackage.acnb
    public final abrh b() {
        return (abrh) a.e(0, "AudioFocus__assistant_audio_focus_packages_allow_list", new acms(3), "CAUSJ2NvbS5nb29nbGUuYW5kcm9pZC5nb29nbGVxdWlja3NlYXJjaGJveA").gu();
    }

    @Override // defpackage.acnb
    public final abru c() {
        return (abru) a.e(3, "AudioFocus__media_channel_access_during_gain_transient_allow_list", new acms(2), "CgYsLCwsWko").gu();
    }

    @Override // defpackage.acnb
    public final String d() {
        return (String) a.c(4, "AudioFocus__should_stop_media_without_interrupting_guidance_deny_list", "SYNC").gu();
    }

    @Override // defpackage.acnb
    public final boolean e() {
        return ((Boolean) a.d(1, "AudioFocus__hold_channels_for_asr", true).gu()).booleanValue();
    }
}
