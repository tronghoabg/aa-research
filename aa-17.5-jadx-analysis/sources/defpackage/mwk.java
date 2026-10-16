package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class mwk implements afec {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ bym c;
    public final /* synthetic */ bym d;
    private final /* synthetic */ int e;

    public /* synthetic */ mwk(long j, float f, bym bymVar, bym bymVar2, int i) {
        this.e = i;
        this.a = j;
        this.b = f;
        this.c = bymVar;
        this.d = bymVar2;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.e != 0) {
            cxd cxdVar = (cxd) obj;
            cxdVar.getClass();
            cxdVar.q();
            bym bymVar = this.c;
            long jFloatToRawIntBits = Float.floatToRawIntBits(cxdVar.eA(((dlj) bymVar.a()).a));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            float f = (((dlj) this.d.a()).a - ((dlj) bymVar.a()).a) + BitmapDescriptorFactory.HUE_RED;
            float f2 = this.b;
            long jEH = cxdVar.eH(roc.aA(f, f2));
            float fEA = cxdVar.eA(f2);
            czz.H(cxdVar, this.a, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), jEH, (Float.floatToRawIntBits(fEA) << 32) | (Float.floatToRawIntBits(fEA) & 4294967295L), BitmapDescriptorFactory.HUE_RED, 240);
            return afak.a;
        }
        cxd cxdVar2 = (cxd) obj;
        cxdVar2.getClass();
        cxdVar2.q();
        bym bymVar2 = this.c;
        float fEA2 = cxdVar2.eA(((dlj) bymVar2.a()).a);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fEA2);
        float f3 = ((dlj) this.d.a()).a - ((dlj) bymVar2.a()).a;
        float f4 = this.b;
        long j = (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L);
        czz.H(cxdVar2, this.a, j, cxdVar2.eH(roc.aA(f4, f3 + BitmapDescriptorFactory.HUE_RED)), (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(cxdVar2.eA(f4)) << 32), BitmapDescriptorFactory.HUE_RED, 240);
        return afak.a;
    }
}
