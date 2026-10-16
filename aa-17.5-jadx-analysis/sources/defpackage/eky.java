package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
final class eky {
    private static volatile int a = 100;

    public static ekz d(Object obj) {
        return ((eji) obj).unknownFields;
    }

    public static void e(Object obj, ekz ekzVar) {
        ((eji) obj).unknownFields = ekzVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ekz ekzVarD = d(obj);
        if (ekzVarD != ekz.a) {
            return ekzVarD;
        }
        ekz ekzVar = new ekz();
        e(obj, ekzVar);
        return ekzVar;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, int i, long j) {
        ((ekz) obj).e(i << 3, Long.valueOf(j));
    }

    public final void c(Object obj) {
        d(obj).d();
    }

    final boolean f(Object obj, wld wldVar, int i) throws IOException {
        int i2 = wldVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            b(obj, i3, wldVar.n());
            return true;
        }
        if (i4 == 1) {
            ekz ekzVar = (ekz) obj;
            ekzVar.e((i3 << 3) | 1, Long.valueOf(wldVar.m()));
            return true;
        }
        if (i4 == 2) {
            ((ekz) obj).e((i3 << 3) | 2, wldVar.r());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new ejp("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new ejo();
            }
            ((ekz) obj).e(5 | (i3 << 3), Integer.valueOf(wldVar.h()));
            return true;
        }
        int i5 = i3 << 3;
        ekz ekzVar2 = new ekz();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new ejp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (wldVar.f() != Integer.MAX_VALUE && f(ekzVar2, wldVar, i6)) {
        }
        if ((i5 | 4) != wldVar.b) {
            throw new ejp("Protocol message end-group tag did not match expected tag.");
        }
        ekzVar2.d();
        ((ekz) obj).e(i5 | 3, ekzVar2);
        return true;
    }
}
