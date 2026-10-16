package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class nku implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bym d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ nku(long j, long j2, dlg dlgVar, bwq bwqVar, boolean z, int i) {
        this.f = i;
        this.b = j;
        this.c = j2;
        this.e = dlgVar;
        this.d = bwqVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [bwq, bym] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.f != 0) {
            cxd cxdVar = (cxd) obj;
            cxdVar.getClass();
            cxdVar.q();
            long j = this.b;
            long j2 = this.c;
            ?? r1 = this.d;
            if (true != ((Boolean) r1.a()).booleanValue()) {
                j = j2;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L));
            cxdVar.s(j, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cxdVar.o() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L))) & 4294967295L), this.e.eA((this.a || ((Boolean) r1.a()).booleanValue()) ? 3.0f : 1.0f), 0);
            return afak.a;
        }
        cmd cmdVar = (cmd) obj;
        long j3 = this.b;
        Object obj2 = this.e;
        yph yphVar = nkx.a;
        cmdVar.getClass();
        cmg cmgVar = new cmg(cmdVar.eA(5.0f), BitmapDescriptorFactory.HUE_RED, 1, 0, 26);
        boolean z = this.a;
        nli nliVar = nli.b;
        nli nliVar2 = nli.c;
        float f = true != z ? 320.0f : 210.0f;
        float f2 = ((f / 2.0f) * (obj2 != nliVar ? -1 : 1)) - 90.0f;
        if (obj2 == nliVar2) {
            czz.aF(cmdVar, j3, f2, f, 0L, 0L, cmgVar, 880);
        } else {
            float fFloatValue = ((Number) this.d.a()).floatValue();
            if (fFloatValue != BitmapDescriptorFactory.HUE_RED && fFloatValue != 1.0f) {
                f -= 14.0f;
            }
            nli nliVar3 = (nli) obj2;
            float fA = nkx.a(f * fFloatValue, nliVar3);
            float fA2 = nkx.a(f * (1.0f - fFloatValue), nliVar3);
            float fA3 = f2 + fA + nkx.a(14.0f, nliVar3);
            if (fFloatValue < 1.0f) {
                czz.aF(cmdVar, j3, fA3, fA2, 0L, 0L, cmgVar, 880);
            }
            czz.aF(cmdVar, this.c, f2, fA, 0L, 0L, cmgVar, 880);
        }
        return afak.a;
    }

    public /* synthetic */ nku(boolean z, nli nliVar, long j, long j2, bym bymVar, int i) {
        this.f = i;
        this.a = z;
        this.e = nliVar;
        this.b = j;
        this.c = j2;
        this.d = bymVar;
    }
}
