package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class nyq implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ nyq(boolean z, boolean z2, int i) {
        this.c = i;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        long j;
        float f;
        char c;
        float f2;
        int i;
        long j2;
        if (this.c == 0) {
            return nyx.c(this.a, this.b, (dec) obj);
        }
        cxd cxdVar = (cxd) obj;
        yph yphVar = nxm.a;
        cxdVar.getClass();
        cxdVar.q();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L));
        float f3 = 0.05f * fIntBitsToFloat;
        float f4 = fIntBitsToFloat * 0.95f;
        if (this.a) {
            j = 4294967295L;
            f = 0.0f;
            c = 1;
            i = 2;
            f2 = 0.55f;
            j2 = -72057594037927936L;
            czz.aK(cxdVar, cjn.o(woy.bi(new cjv(cjv.h(-72057594037927936L, 0.55f)), new cjv(-72057594037927936L)), BitmapDescriptorFactory.HUE_RED, f3), 0L, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cxdVar.o() >> 32))) << 32), null, 6, 58);
        } else {
            j = 4294967295L;
            f = 0.0f;
            c = 1;
            f2 = 0.55f;
            i = 2;
            j2 = -72057594037927936L;
        }
        if (this.b) {
            cjv[] cjvVarArr = new cjv[i];
            cjvVarArr[0] = new cjv(j2);
            cjvVarArr[c] = new cjv(cjv.h(j2, f2));
            czz.aK(cxdVar, cjn.o(woy.bi(cjvVarArr), f4, fIntBitsToFloat), (Float.floatToRawIntBits(f4) & j) | (Float.floatToRawIntBits(f) << 32), 0L, null, 6, 60);
        }
        return afak.a;
    }
}
