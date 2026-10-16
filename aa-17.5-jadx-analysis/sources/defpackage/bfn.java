package defpackage;

/* loaded from: classes.dex */
public final class bfn {
    public static final djn a = new bfm(djm.a, 0, 0);

    public static final void a(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            asl.d("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + "]");
        }
    }

    public static final void b(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            asl.d("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + "]");
        }
    }

    public static final djy c(deu deuVar) {
        djy djyVar = new djy(deuVar, djm.a);
        deu deuVar2 = djyVar.a;
        int iA = deuVar.a();
        int iA2 = deuVar2.a();
        int iMin = Math.min(iA, 100);
        for (int i = 0; i < iMin; i++) {
            a(djyVar.b.a(i), iA2, i);
        }
        djn djnVar = djyVar.b;
        a(djnVar.a(iA), iA2, iA);
        int iMin2 = Math.min(iA2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            b(djnVar.b(i2), iA, i2);
        }
        b(djnVar.b(iA2), iA, iA2);
        return new djy(deuVar2, new bfm(djnVar, deuVar.a(), deuVar2.a()));
    }
}
