package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final class ckh extends ckt {
    private final List a;
    private final long c;
    private final long d;
    private final List b = null;
    private final int e = 0;

    public ckh(List list, long j, long j2) {
        this.a = list;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.ckt
    public final Shader b(long j) {
        long j2 = this.c;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.d;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        List list = this.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat3);
        re.j(list);
        long j4 = (jFloatToRawIntBits << 32) | jFloatToRawIntBits2;
        long jFloatToRawIntBits4 = (jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L);
        if (Build.VERSION.SDK_INT >= 29) {
            return ckc.a.a(j4, jFloatToRawIntBits4, re.h(list), null, 0);
        }
        return new LinearGradient(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)), re.i(list), (float[]) null, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckh)) {
            return false;
        }
        ckh ckhVar = (ckh) obj;
        if (!affa.f(this.a, ckhVar.a)) {
            return false;
        }
        List list = ckhVar.b;
        if (this.c != ckhVar.c || this.d != ckhVar.d) {
            return false;
        }
        int i = ckhVar.e;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        long j = this.c;
        long j2 = this.d;
        return (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + cja.d(j) + ", ";
        } else {
            str = "";
        }
        long j2 = this.d;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + cja.d(j2) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
