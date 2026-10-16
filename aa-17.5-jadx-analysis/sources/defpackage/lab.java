package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lab implements iri {
    private final /* synthetic */ int a;

    public /* synthetic */ lab(int i) {
        this.a = i;
    }

    @Override // defpackage.iri
    public final yzz a(ouh ouhVar) {
        if (this.a != 0) {
            yph yphVar = irb.a;
            return roc.N(ouhVar);
        }
        yph yphVar2 = laf.a;
        int iOrdinal = ouhVar.ordinal();
        if (iOrdinal == 0) {
            return yzz.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return yzz.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_GUIDANCE;
        }
        if (iOrdinal == 2) {
            return yzz.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_SYSTEM_AUDIO;
        }
        if (iOrdinal == 3) {
            return yzz.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_MEDIA;
        }
        if (iOrdinal == 4) {
            return yzz.VOICE_SESSION_AUDIO_STREAM_DIAGNOSTICS_TELEPHONY;
        }
        throw new RuntimeException(null, null);
    }
}
