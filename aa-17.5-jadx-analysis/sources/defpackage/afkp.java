package defpackage;

/* loaded from: classes3.dex */
public final class afkp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final agox toMetadataModality(agcq agcqVar) {
        agcp agcpVar = agcq.Companion;
        int iOrdinal = agcqVar.ordinal();
        if (iOrdinal == 0) {
            return agox.FINAL;
        }
        if (iOrdinal == 1) {
            return agox.SEALED;
        }
        if (iOrdinal == 2) {
            return agox.OPEN;
        }
        if (iOrdinal == 3) {
            return agox.ABSTRACT;
        }
        throw new aezs();
    }
}
