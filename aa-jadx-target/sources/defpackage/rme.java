package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rme extends defpackage.rmj {
    private static defpackage.rmh a;
    private static defpackage.rmh b;

    public static defpackage.rmh a(defpackage.rsi rsiVar) {
        int iOrdinal = rsiVar.ordinal();
        if (iOrdinal == 3) {
            if (b == null) {
                b = new defpackage.rme(defpackage.rsi.AUDIO_SINK_GUIDANCE);
            }
            return b;
        }
        if (iOrdinal != 5) {
            throw new java.lang.IllegalArgumentException("Invalid service type: ".concat(java.lang.String.valueOf(rsiVar.name())));
        }
        if (a == null) {
            a = new defpackage.rme(defpackage.rsi.AUDIO_SINK_MEDIA);
        }
        return a;
    }
}
