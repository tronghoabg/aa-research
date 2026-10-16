package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class bnp implements afec {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ bnp(float f, long j, int i) {
        this.c = i;
        this.a = f;
        this.b = j;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            float f = this.a;
            cmd cmdVar = (cmd) obj;
            float fEA = cmdVar.eA(f);
            float fEA2 = cmdVar.eA(f) / 2.0f;
            long jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fEA2);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() >> 32));
            float fEA3 = cmdVar.eA(f) / 2.0f;
            cmdVar.s(this.b, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fEA3) & 4294967295L), fEA, 0);
            return afak.a;
        }
        if (i != 1) {
            cmd cmdVar2 = (cmd) obj;
            cmdVar2.getClass();
            float fEA4 = cmdVar2.eA(this.a);
            czz.I(cmdVar2, this.b, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, 126);
            czz.aH(cmdVar2, cjn.i(0), fEA4 / 2.0f, cmdVar2.n(), null, 56);
            return afak.a;
        }
        float f2 = this.a;
        cmd cmdVar3 = (cmd) obj;
        float fEA5 = cmdVar3.eA(f2);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(cmdVar3.eA(f2) / 2.0f);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
        float fEA6 = cmdVar3.eA(f2) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cmdVar3.o() & 4294967295L));
        cmdVar3.s(this.b, (jFloatToRawIntBits3 << 32) | (4294967295L & jFloatToRawIntBits4), (Float.floatToRawIntBits(fEA6) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), fEA5, 0);
        return afak.a;
    }
}
