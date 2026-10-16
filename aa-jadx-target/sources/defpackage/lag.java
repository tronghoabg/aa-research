package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lag implements defpackage.irq {
    private final /* synthetic */ int a;

    public /* synthetic */ lag(int i) {
        this.a = i;
    }

    @Override // defpackage.irq
    public final defpackage.zbe a(defpackage.ove oveVar) {
        if (this.a != 0) {
            defpackage.yqm yqmVar = defpackage.irk.a;
            return defpackage.tna.X(oveVar);
        }
        defpackage.yqm yqmVar2 = defpackage.lak.a;
        int iOrdinal = oveVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.zbe.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.zbe.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_GUIDANCE;
        }
        if (iOrdinal == 2) {
            return defpackage.zbe.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_SYSTEM_AUDIO;
        }
        if (iOrdinal == 3) {
            return defpackage.zbe.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_MEDIA;
        }
        if (iOrdinal == 4) {
            return defpackage.zbe.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_TELEPHONY;
        }
        throw new java.lang.RuntimeException(null, null);
    }
}
