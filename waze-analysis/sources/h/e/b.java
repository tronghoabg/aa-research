package h.e;

import h.a.i;
import h.g.b.x;
import h.j.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlinx.a.d;
import kotlinx.a.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b {
    public static int d(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                return i3 - k(i3, i2, i4);
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                return i3 + k(i2, i3, -i4);
            }
        }
        return i3;
    }

    public static kotlinx.a.a e(boolean z) {
        e eVar = e.f50894a;
        x.f(eVar, "trace");
        return new kotlinx.a.a(z, eVar);
    }

    public static kotlinx.a.b f(int i2) {
        e eVar = e.f50894a;
        x.f(eVar, "trace");
        return new kotlinx.a.b(i2, eVar);
    }

    public static kotlinx.a.c g(long j2) {
        e eVar = e.f50894a;
        x.f(eVar, "trace");
        return new kotlinx.a.c(j2, eVar);
    }

    public static d h(Object obj) {
        e eVar = e.f50894a;
        x.f(eVar, "trace");
        return new d(obj, eVar);
    }

    public static void i(long j2, byte[] bArr, int i2, int i3, int i4) {
        x.f(bArr, "dst");
        x.f(bArr, "dst");
        int i5 = 8 - i4;
        int i6 = 7 - i3;
        if (i5 > i6) {
            return;
        }
        while (true) {
            int i7 = h.n.d.a()[(int) ((j2 >> (i6 << 3)) & 255)];
            bArr[i2] = (byte) (i7 >> 8);
            bArr[i2 + 1] = (byte) i7;
            if (i6 == i5) {
                return;
            }
            i2 += 2;
            i6--;
        }
    }

    public static void j(String str, String str2, int i2) {
        x.f(str, "inputString");
        x.f(str2, "errorDescription");
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i2 + ", but was '" + str.charAt(i2) + "'");
    }

    private static int k(int i2, int i3, int i4) {
        return l(l(i2, i4) - l(i3, i4), i4);
    }

    private static int l(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    public List a(Throwable th) {
        Object objInvoke;
        List listI;
        x.f(th, "exception");
        Method method = a.f48067b;
        return (method == null || (objInvoke = method.invoke(th, null)) == null || (listI = h.a.c.i((Throwable[]) objInvoke)) == null) ? i.h() : listI;
    }

    public f b() {
        return new h.j.c();
    }

    public void c(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(th, "cause");
        x.f(th2, "exception");
        Method method = a.f48066a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
