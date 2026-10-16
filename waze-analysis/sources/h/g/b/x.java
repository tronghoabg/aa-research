package h.g.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class x {
    private x() {
    }

    public static int a(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 != i3 ? 1 : 0;
    }

    public static int b(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 != j3 ? 1 : 0;
    }

    public static void c(Object obj) {
        if (obj == null) {
            g();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            h(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        t(nullPointerException);
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = x.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            t(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void g() {
        NullPointerException nullPointerException = new NullPointerException();
        t(nullPointerException);
        throw nullPointerException;
    }

    public static void h(String str) {
        NullPointerException nullPointerException = new NullPointerException(str);
        t(nullPointerException);
        throw nullPointerException;
    }

    public static void i() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void j(String str) {
        h.aa aaVar = new h.aa("lateinit property " + str + " has not been initialized");
        t(aaVar);
        throw aaVar;
    }

    public static boolean k(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean l(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean m(Float f2, Float f3) {
        return f2.floatValue() == f3.floatValue();
    }

    public static boolean n(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("getChildAt(index) must not be null");
        t(illegalStateException);
        throw illegalStateException;
    }

    static void p(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (true == str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final void q(Object obj, ArrayList arrayList) {
        Object[] objArr;
        int length;
        if (obj != null && (length = (objArr = (Object[]) obj).length) > 0) {
            arrayList.ensureCapacity(arrayList.size() + length);
            Collections.addAll(arrayList, objArr);
        }
    }

    public static /* synthetic */ kotlinx.coroutines.b.k r(kotlinx.coroutines.b.a.y yVar, h.c.j jVar, kotlinx.coroutines.a.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            jVar = h.c.k.f48060a;
        }
        int i3 = (i2 & 2) != 0 ? -3 : 0;
        if ((i2 & 4) != 0) {
            aVar = kotlinx.coroutines.a.a.f51271a;
        }
        return yVar.cc(jVar, i3, aVar);
    }

    public static final void s(kotlinx.coroutines.b.a.a aVar, Object obj) {
        if (aVar.f51381a != obj) {
            throw aVar;
        }
    }

    private static void t(Throwable th) {
        p(th, x.class.getName());
    }
}
