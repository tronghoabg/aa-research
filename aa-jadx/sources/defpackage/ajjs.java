package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajjs {
    public static final java.util.TimeZone a;
    public static final java.lang.String b;

    static {
        java.util.TimeZone timeZone = j$.util.DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        java.lang.String name = defpackage.ajiz.class.getName();
        name.getClass();
        b = defpackage.afzh.n(defpackage.afzh.m(name, "okhttp3."), "Client");
    }

    public static final long a(defpackage.ajjf ajjfVar) {
        java.lang.String strB = ajjfVar.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        int i = defpackage.ajjq.a;
        try {
            return java.lang.Long.parseLong(strB);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public static final java.lang.String b(java.lang.String str, java.lang.Object... objArr) {
        int length = objArr.length;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        return str2;
    }

    public static final java.lang.String c(defpackage.ajiw ajiwVar, boolean z) {
        java.lang.String strBp = ajiwVar.b;
        if (defpackage.afzh.u(strBp, ":", false)) {
            strBp = defpackage.a.bp(strBp, "[", "]");
        }
        if (!z && ajiwVar.c == defpackage.aike.a(ajiwVar.a)) {
            return strBp;
        }
        return strBp + ":" + ajiwVar.c;
    }

    public static final java.util.List d(java.util.List list) {
        if (list.isEmpty()) {
            return defpackage.afce.a;
        }
        if (list.size() == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        java.lang.Object[] array = list.toArray();
        array.getClass();
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(defpackage.afga.bx(array));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final java.util.List e(java.lang.Object[] objArr) {
        int length;
        if (objArr == null || (length = objArr.length) == 0) {
            return defpackage.afce.a;
        }
        if (length == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(defpackage.afga.bx((java.lang.Object[]) objArr.clone()));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final defpackage.ajiu f(java.util.List list) {
        defpackage.erh erhVar = new defpackage.erh((byte[]) null, (short[]) null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.ajlq ajlqVar = (defpackage.ajlq) it.next();
            defpackage.ailc.i(erhVar, ajlqVar.g.i(), ajlqVar.h.i());
        }
        return defpackage.ailc.h(erhVar);
    }

    public static final void g(java.net.Socket socket) {
        try {
            socket.close();
        } catch (java.lang.AssertionError e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            if (!defpackage.afga.f(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final boolean h(defpackage.ajiw ajiwVar, defpackage.ajiw ajiwVar2) {
        return defpackage.afga.f(ajiwVar.b, ajiwVar2.b) && ajiwVar.c == ajiwVar2.c && defpackage.afga.f(ajiwVar.a, ajiwVar2.a);
    }

    public static final boolean i(java.net.Socket socket, defpackage.ajoa ajoaVar) {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !ajoaVar.B();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (java.net.SocketTimeoutException unused) {
            return true;
        } catch (java.io.IOException unused2) {
            return false;
        }
    }

    public static final boolean j(defpackage.ajpc ajpcVar, int i, java.util.concurrent.TimeUnit timeUnit) throws java.io.IOException {
        boolean z;
        timeUnit.getClass();
        long jNanoTime = java.lang.System.nanoTime();
        long jH = ajpcVar.hh().g() ? ajpcVar.hh().h() - jNanoTime : Long.MAX_VALUE;
        ajpcVar.hh().j(java.lang.Math.min(jH, timeUnit.toNanos(i)) + jNanoTime);
        try {
            defpackage.ajny ajnyVar = new defpackage.ajny();
            while (ajpcVar.hg(ajnyVar, 8192L) != -1) {
                ajnyVar.y();
            }
            z = true;
        } catch (java.io.InterruptedIOException unused) {
            z = false;
        } catch (java.lang.Throwable th) {
            defpackage.ajpe ajpeVarHh = ajpcVar.hh();
            if (jH == Long.MAX_VALUE) {
                ajpeVarHh.l();
            } else {
                ajpeVarHh.j(jNanoTime + jH);
            }
            throw th;
        }
        if (jH == Long.MAX_VALUE) {
            ajpcVar.hh().l();
        } else {
            ajpcVar.hh().j(jNanoTime + jH);
        }
        return z;
    }

    public static final boolean k(defpackage.ajpc ajpcVar, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return j(ajpcVar, 100, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
