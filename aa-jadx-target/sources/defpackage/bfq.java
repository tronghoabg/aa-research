package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bfq {
    public static final defpackage.djv a = new defpackage.bfp(defpackage.dju.a, 0, 0);

    public static final void a(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            defpackage.asq.d("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + "]");
        }
    }

    public static final void b(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            defpackage.asq.d("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + "]");
        }
    }

    public static final defpackage.dkg c(defpackage.dfb dfbVar) {
        defpackage.dkg dkgVar = new defpackage.dkg(dfbVar, defpackage.dju.a);
        defpackage.dfb dfbVar2 = dkgVar.a;
        int iA = dfbVar.a();
        int iA2 = dfbVar2.a();
        int iMin = java.lang.Math.min(iA, 100);
        for (int i = 0; i < iMin; i++) {
            a(dkgVar.b.a(i), iA2, i);
        }
        defpackage.djv djvVar = dkgVar.b;
        a(djvVar.a(iA), iA2, iA);
        int iMin2 = java.lang.Math.min(iA2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            b(djvVar.b(i2), iA, i2);
        }
        b(djvVar.b(iA2), iA, iA2);
        return new defpackage.dkg(dfbVar2, new defpackage.bfp(djvVar, dfbVar.a(), dfbVar2.a()));
    }
}
