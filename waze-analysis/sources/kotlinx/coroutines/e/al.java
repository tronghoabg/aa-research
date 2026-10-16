package kotlinx.coroutines.e;

import java.util.Objects;
import kotlinx.coroutines.cj;

/* loaded from: classes2.dex */
public final class al {
    public static final int a() {
        return am.a();
    }

    public static final boolean b(String str, boolean z) {
        return an.b(str, z);
    }

    public static final String c() {
        String strB = am.b("kotlinx.coroutines.scheduler.default.name");
        return strB == null ? "DefaultDispatcher" : strB;
    }

    public static /* synthetic */ int d(String str, int i2, int i3, int i4, int i5) {
        int i6 = i3 | (((i5 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) an.a(str, i2, i6, i4);
    }

    public static final String f() {
        int i2 = am.f51870a;
        try {
            return System.getProperty("kotlinx.coroutines.debug");
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final int g(String str, int i2, int i3) {
        return (int) an.a(str, i2, 1L, i3);
    }

    public static final void h(h.c.e eVar, h.c.e eVar2) throws Throwable {
        try {
            k.b(h.c.a.h.d(eVar), h.ab.f48028a);
        } catch (Throwable th) {
            n(eVar2, th);
        }
    }

    public static final void i(h.g.a.p pVar, Object obj, h.c.e eVar) throws Throwable {
        try {
            k.b(h.c.a.h.d(h.c.a.h.c(pVar, obj, eVar)), h.ab.f48028a);
        } catch (Throwable th) {
            n(eVar, th);
        }
    }

    public static final av j(h.g.a.l lVar, Object obj, av avVar) {
        try {
            lVar.invoke(obj);
            return avVar;
        } catch (Throwable th) {
            if (avVar == null || avVar.getCause() == th) {
                Objects.toString(obj);
                return new av("Exception in undelivered element handler for ".concat(String.valueOf(obj)), th);
            }
            e.a.h.ad.c(avVar, th);
            return avVar;
        }
    }

    public static final void k(h.g.a.l lVar, Object obj, h.c.j jVar) {
        av avVarJ = j(lVar, obj, null);
        if (avVarJ != null) {
            h.f.s.h(jVar, avVarJ);
        }
    }

    public static final boolean m(cj cjVar) {
        return cjVar.c() instanceof ad;
    }

    private static final void n(h.c.e eVar, Throwable th) throws Throwable {
        if (th instanceof kotlinx.coroutines.ar) {
            th = ((kotlinx.coroutines.ar) th).getCause();
        }
        eVar.resumeWith(e.b.c.a(th));
        throw th;
    }
}
