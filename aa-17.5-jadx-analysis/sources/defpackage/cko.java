package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import androidx.car.app.model.Alert;
import java.util.List;

/* loaded from: classes.dex */
public final class cko extends ckt {
    private final List a;
    private final long c;
    private final float d;
    private final List b = null;
    private final int e = 0;

    public cko(List list, long j, float f) {
        this.a = list;
        this.c = j;
        this.d = f;
    }

    @Override // defpackage.ckt
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jA = byx.A(j);
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA >> 32));
            fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i2);
            fIntBitsToFloat2 = fIntBitsToFloat3;
        }
        List list = this.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L;
        float fB = this.d;
        if (fB == Float.POSITIVE_INFINITY) {
            fB = cjd.b(j) / 2.0f;
        }
        float f = fB;
        long j3 = jFloatToRawIntBits | jFloatToRawIntBits2;
        re.j(list);
        if (Build.VERSION.SDK_INT >= 29) {
            return ckc.a.b(j3, f, re.h(list), null, 0);
        }
        return new RadialGradient(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)), f, re.i(list), (float[]) null, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cko)) {
            return false;
        }
        cko ckoVar = (cko) obj;
        if (!affa.f(this.a, ckoVar.a)) {
            return false;
        }
        List list = ckoVar.b;
        if (this.c != ckoVar.c || this.d != ckoVar.d) {
            return false;
        }
        int i = ckoVar.e;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        long j = this.c;
        return (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.d)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + cja.d(j) + ", ";
        } else {
            str = "";
        }
        float f = this.d;
        if ((Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
