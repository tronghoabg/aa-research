package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bpk {
    public static final defpackage.bvm a = new defpackage.bvv(defpackage.bxv.c, new defpackage.bli(9));
    public static final defpackage.bvm b = new defpackage.bvo(new defpackage.bev(17));
    private static final defpackage.bpl c = new defpackage.bpl(true, Float.NaN, defpackage.cjv.c(), null, true, true);
    private static final defpackage.bpl d = new defpackage.bpl(false, Float.NaN, defpackage.cjv.c(), null, true, true);

    public static /* synthetic */ defpackage.akr a(boolean z, float f, long j, defpackage.cld cldVar, boolean z2, int i) {
        if ((i & 4) != 0) {
            float[] fArr = defpackage.clr.a;
            j = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        }
        long j2 = j;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        int i2 = (z ? 1 : 0) | (i & 1);
        defpackage.cld cldVar2 = (i & 8) != 0 ? null : cldVar;
        boolean z3 = (i & 16) != 0;
        boolean z4 = (!((i & 32) == 0)) | z2;
        if (java.lang.Float.compare(f2, Float.NaN) == 0) {
            float[] fArr2 = defpackage.clr.a;
            if (j2 == defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u) && cldVar2 == null && z3 && z4) {
                return i2 != 0 ? c : d;
            }
        }
        return new defpackage.bpl(1 == i2, f2, j2, cldVar2, z3, z4);
    }
}
