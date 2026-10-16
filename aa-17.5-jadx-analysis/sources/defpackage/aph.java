package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aph implements apt {
    public final afdr a;

    public aph(afdr afdrVar) {
        this.a = afdrVar;
    }

    @Override // defpackage.apt
    public final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean zBooleanValue = ((Boolean) this.a.invoke()).booleanValue();
        float f = true != zBooleanValue ? fIntBitsToFloat : 0.0f;
        if (true != zBooleanValue) {
            fIntBitsToFloat = 0.0f;
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // defpackage.apt
    public final long b(long j) {
        boolean zBooleanValue = ((Boolean) this.a.invoke()).booleanValue();
        int i = (int) (4294967295L & j);
        float fAbs = Math.abs(Float.intBitsToFloat(i));
        int i2 = (int) (j >> 32);
        float fAbs2 = Math.abs(Float.intBitsToFloat(i2));
        float fIntBitsToFloat = BitmapDescriptorFactory.HUE_RED;
        if (fAbs >= fAbs2) {
            if (zBooleanValue) {
                fIntBitsToFloat = Float.intBitsToFloat(i);
            }
        } else if (!zBooleanValue) {
            fIntBitsToFloat = Float.intBitsToFloat(i2);
        }
        return Float.floatToRawIntBits(fIntBitsToFloat);
    }
}
