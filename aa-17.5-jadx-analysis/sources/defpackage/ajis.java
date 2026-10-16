package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ajis {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        String name = ajia.class.getName();
        name.getClass();
        b = afyh.n(afyh.m(name, "okhttp3."), "Client");
    }

    public static final long a(ajif ajifVar) {
        String strB = ajifVar.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        int i = ajiq.a;
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String b(String str, Object... objArr) {
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        return str2;
    }

    public static final String c(ajhx ajhxVar, boolean z) {
        String strBq = ajhxVar.b;
        if (afyh.u(strBq, ":", false)) {
            strBq = a.bq(strBq, "[", "]");
        }
        if (!z && ajhxVar.c == ahde.b(ajhxVar.a)) {
            return strBq;
        }
        return strBq + ":" + ajhxVar.c;
    }

    public static final List d(List list) {
        if (list.isEmpty()) {
            return afbe.a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(woy.cD(array));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List e(Object[] objArr) {
        int length;
        if (objArr == null || (length = objArr.length) == 0) {
            return afbe.a;
        }
        if (length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(woy.cD((Object[]) objArr.clone()));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final ajhv f(List list) {
        erb erbVar = new erb((byte[]) null, (short[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajkq ajkqVar = (ajkq) it.next();
            ahdw.l(erbVar, ajkqVar.g.i(), ajkqVar.h.i());
        }
        return ahdw.k(erbVar);
    }

    public static final void g(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!affa.f(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean h(ajhx ajhxVar, ajhx ajhxVar2) {
        return affa.f(ajhxVar.b, ajhxVar2.b) && ajhxVar.c == ajhxVar2.c && affa.f(ajhxVar.a, ajhxVar2.a);
    }

    public static final boolean i(Socket socket, ajna ajnaVar) throws SocketException {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !ajnaVar.B();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean j(ajoc ajocVar, int i, TimeUnit timeUnit) throws IOException {
        boolean z;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jH = ajocVar.hV().g() ? ajocVar.hV().h() - jNanoTime : Long.MAX_VALUE;
        ajocVar.hV().j(Math.min(jH, timeUnit.toNanos(i)) + jNanoTime);
        try {
            ajmy ajmyVar = new ajmy();
            while (ajocVar.hU(ajmyVar, 8192L) != -1) {
                ajmyVar.y();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            ajoe ajoeVarHV = ajocVar.hV();
            if (jH == Long.MAX_VALUE) {
                ajoeVarHV.l();
            } else {
                ajoeVarHV.j(jNanoTime + jH);
            }
            throw th;
        }
        if (jH == Long.MAX_VALUE) {
            ajocVar.hV().l();
        } else {
            ajocVar.hV().j(jNanoTime + jH);
        }
        return z;
    }

    public static final boolean k(ajoc ajocVar, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return j(ajocVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }
}
