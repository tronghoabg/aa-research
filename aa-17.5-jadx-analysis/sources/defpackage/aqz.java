package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aqz {
    public api a;
    public long b;

    public aqz(api apiVar, long j) {
        this.a = apiVar;
        this.b = j;
    }

    public final float a(long j) {
        return Float.intBitsToFloat(this.a == api.b ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    public final long b(long j, float f) {
        long jAi = a.ai(this.b, j);
        this.b = jAi;
        float fA = this.a == null ? cja.a(jAi) : Math.abs(a(jAi));
        if (fA <= BitmapDescriptorFactory.HUE_RED || fA < f) {
            return 9205357640488583168L;
        }
        api apiVar = this.a;
        long j2 = this.b;
        if (apiVar == null) {
            return aclh.y(this.b, cja.c(cja.b(j2, cja.a(j2)), f));
        }
        float fA2 = a(j2) - (Math.signum(a(this.b)) * f);
        long j3 = this.b;
        api apiVar2 = this.a;
        api apiVar3 = api.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (apiVar2 == apiVar3 ? j3 & 4294967295L : j3 >> 32));
        if (this.a == apiVar3) {
            return (Float.floatToRawIntBits(fA2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(fA2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
