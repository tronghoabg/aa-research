package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aflp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agpx toMetadataModality(defpackage.agdq agdqVar) {
        defpackage.agdp agdpVar = defpackage.agdq.Companion;
        int iOrdinal = agdqVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.agpx.FINAL;
        }
        if (iOrdinal == 1) {
            return defpackage.agpx.SEALED;
        }
        if (iOrdinal == 2) {
            return defpackage.agpx.OPEN;
        }
        if (iOrdinal == 3) {
            return defpackage.agpx.ABSTRACT;
        }
        throw new defpackage.afas();
    }
}
