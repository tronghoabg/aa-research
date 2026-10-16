package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmm extends defpackage.oml {
    private static defpackage.oml c;
    private static defpackage.oml d;
    private final defpackage.rsi b;

    private rmm(defpackage.rsi rsiVar) {
        super(null);
        this.b = rsiVar;
    }

    public static defpackage.oml N(defpackage.rsi rsiVar) {
        int iOrdinal = rsiVar.ordinal();
        if (iOrdinal == 3) {
            if (c == null) {
                c = new defpackage.rmm(defpackage.rsi.AUDIO_SINK_GUIDANCE);
            }
            return c;
        }
        if (iOrdinal != 5) {
            throw new java.lang.IllegalArgumentException("Invalid service type: ".concat(java.lang.String.valueOf(rsiVar.name())));
        }
        if (d == null) {
            d = new defpackage.rmm(defpackage.rsi.AUDIO_SINK_MEDIA);
        }
        return d;
    }

    @Override // defpackage.oml
    public final defpackage.yhx J(defpackage.rmo rmoVar) {
        defpackage.rsi rsiVar = this.b;
        defpackage.yhx yhxVarJ = super.J(rmoVar);
        int iOrdinal = rsiVar.ordinal();
        if (iOrdinal != 3) {
            return (iOrdinal == 5 && rmoVar.b) ? K(yhxVarJ) : yhxVarJ;
        }
        return rmoVar.c ? K(yhxVarJ) : yhxVarJ;
    }
}
