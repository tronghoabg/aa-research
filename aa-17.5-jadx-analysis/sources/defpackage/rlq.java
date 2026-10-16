package defpackage;

/* loaded from: classes.dex */
public final class rlq extends olm {
    private static olm c;
    private static olm d;
    private final rro b;

    private rlq(rro rroVar) {
        super(null);
        this.b = rroVar;
    }

    public static olm l(rro rroVar) {
        int iOrdinal = rroVar.ordinal();
        if (iOrdinal == 3) {
            if (c == null) {
                c = new rlq(rro.AUDIO_SINK_GUIDANCE);
            }
            return c;
        }
        if (iOrdinal != 5) {
            throw new IllegalArgumentException("Invalid service type: ".concat(String.valueOf(rroVar.name())));
        }
        if (d == null) {
            d = new rlq(rro.AUDIO_SINK_MEDIA);
        }
        return d;
    }

    @Override // defpackage.olm
    public final ygr i(rls rlsVar) {
        rro rroVar = this.b;
        ygr ygrVarI = super.i(rlsVar);
        int iOrdinal = rroVar.ordinal();
        return iOrdinal != 3 ? (iOrdinal == 5 && rlsVar.b) ? j(ygrVarI) : ygrVarI : rlsVar.c ? j(ygrVarI) : ygrVarI;
    }
}
