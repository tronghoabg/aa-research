package defpackage;

/* loaded from: classes.dex */
public final class rli extends rln {
    private static rll a;
    private static rll b;

    public static rll a(rro rroVar) {
        int iOrdinal = rroVar.ordinal();
        if (iOrdinal == 3) {
            if (b == null) {
                b = new rli(rro.AUDIO_SINK_GUIDANCE);
            }
            return b;
        }
        if (iOrdinal != 5) {
            throw new IllegalArgumentException("Invalid service type: ".concat(String.valueOf(rroVar.name())));
        }
        if (a == null) {
            a = new rli(rro.AUDIO_SINK_MEDIA);
        }
        return a;
    }
}
