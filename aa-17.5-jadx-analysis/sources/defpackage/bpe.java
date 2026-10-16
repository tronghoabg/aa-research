package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bpe {
    public static final bvf a = new bvo(bxp.c, new blv(5));
    public static final bvf b = new bvh(new bes(17));
    private static final bpg c = new bpg(true, Float.NaN, cjn.n(), null, true, true);
    private static final bpg d = new bpg(false, Float.NaN, cjn.n(), null, true, true);

    public static /* synthetic */ akm a(boolean z, float f, long j, ckv ckvVar, boolean z2, int i) {
        if ((i & 4) != 0) {
            float[] fArr = clj.a;
            j = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        }
        long j2 = j;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        int i2 = (z ? 1 : 0) | (i & 1);
        ckv ckvVar2 = (i & 8) != 0 ? null : ckvVar;
        boolean z3 = (i & 16) != 0;
        boolean z4 = (!((i & 32) == 0)) | z2;
        if (Float.compare(f2, Float.NaN) == 0) {
            float[] fArr2 = clj.a;
            if (j2 == cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u) && ckvVar2 == null && z3 && z4) {
                return i2 != 0 ? c : d;
            }
        }
        return new bpg(1 == i2, f2, j2, ckvVar2, z3, z4);
    }
}
