package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agsc {
    public static final java.lang.String[] requireNotEmpty(kotlin.Metadata metadata) {
        metadata.getClass();
        java.lang.String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new defpackage.agnq("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null, 2, null);
    }
}
