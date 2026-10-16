package okhttp3.internal;

import androidx.autofill.HintConstants;
import androidx.collection.SieveCacheKt;
import com.waze.shared_infra.coordinators.c;
import e.a.h.ad;
import h.a.i;
import h.g.b.x;
import h.n.l;
import h.n.o;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import k.am;
import k.h;
import k.j;
import k.k;
import k.y;
import okhttp3.ab;
import okhttp3.ai;
import okhttp3.aq;
import okhttp3.as;
import okhttp3.at;
import okhttp3.z;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f55955a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f55956b = as.f(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final at f55957c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f55958d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f55959e;

    /* renamed from: f, reason: collision with root package name */
    private static final k.z f55960f;

    /* renamed from: g, reason: collision with root package name */
    private static final l f55961g;

    static {
        byte[] bArr = new byte[0];
        f55955a = bArr;
        x.f(bArr, "<this>");
        h hVar = new h();
        hVar.ap(bArr);
        f55957c = as.a(hVar);
        as.c(bArr, null, 7);
        y yVar = k.z.f50879a;
        k kVar = k.f50843a;
        f55960f = yVar.a(okhttp3.internal.publicsuffix.a.c("efbbbf"), okhttp3.internal.publicsuffix.a.c("feff"), okhttp3.internal.publicsuffix.a.c("fffe"), okhttp3.internal.publicsuffix.a.c("0000ffff"), okhttp3.internal.publicsuffix.a.c("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        x.c(timeZone);
        f55958d = timeZone;
        f55961g = new l("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = ai.class.getName();
        x.e(name, "getName(...)");
        f55959e = o.y(o.x(name, "okhttp3."), "Client");
    }

    public static final String[] A(String[] strArr, String[] strArr2, Comparator comparator) {
        x.f(strArr, "<this>");
        x.f(strArr2, "other");
        x.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int B(byte b2) {
        return b2 & 255;
    }

    public static final int C(long j2, TimeUnit timeUnit) {
        x.f("timeout", HintConstants.AUTOFILL_HINT_NAME);
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalStateException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0) {
            j3 = millis;
        } else if (j2 > 0) {
            throw new IllegalArgumentException("timeout too small.");
        }
        return (int) j3;
    }

    public static final void D(long j2, long j3) {
        if (j3 < 0 || j2 < 0 || j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static /* synthetic */ int E(String str, char c2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return a(str, c2, 0, i2);
    }

    public static final boolean F(am amVar, TimeUnit timeUnit) {
        x.f(amVar, "<this>");
        x.f(timeUnit, "timeUnit");
        try {
            return z(amVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final int G(h hVar) {
        x.f(hVar, "<this>");
        int i2 = 0;
        while (!hVar.R() && hVar.b(0L) == 61) {
            hVar.c();
            i2++;
        }
        return i2;
    }

    public static final int a(String str, char c2, int i2, int i3) {
        x.f(str, "<this>");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int b(String str, String str2, int i2, int i3) {
        x.f(str, "<this>");
        x.f(str2, "delimiters");
        while (i2 < i3) {
            if (o.O(str2, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int c(String str) {
        x.f(str, "<this>");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (x.a(cCharAt, 31) <= 0 || x.a(cCharAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int d(String str, int i2, int i3) {
        x.f(str, "<this>");
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int e(String str, int i2, int i3) {
        x.f(str, "<this>");
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                char cCharAt = str.charAt(i4);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int g(j jVar) {
        x.f(jVar, "<this>");
        return B(jVar.c()) | (B(jVar.c()) << 16) | (B(jVar.c()) << 8);
    }

    public static final int h(String str, int i2) throws NumberFormatException {
        if (str != null) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 > SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (j2 < 0) {
                    return 0;
                }
                return (int) j2;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final long i(aq aqVar) {
        x.f(aqVar, "<this>");
        String strB = aqVar.g().b("Content-Length");
        if (strB != null) {
            x.f(strB, "<this>");
            try {
                return Long.parseLong(strB);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final String j(String str, Object... objArr) {
        x.f(str, "format");
        x.f(objArr, "args");
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        x.e(str2, "format(...)");
        return str2;
    }

    public static final String k(ab abVar, boolean z) {
        String strF;
        x.f(abVar, "<this>");
        if (o.F(abVar.f(), ":", false)) {
            strF = "[" + abVar.f() + "]";
        } else {
            strF = abVar.f();
        }
        if (!z && abVar.a() == kotlinx.b.a.b.B(abVar.h())) {
            return strF;
        }
        return strF + ":" + abVar.a();
    }

    public static final String l(String str, int i2, int i3) {
        x.f(str, "<this>");
        int iD = d(str, i2, i3);
        String strSubstring = str.substring(iD, e(str, iD, i3));
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final Throwable m(Exception exc, List list) {
        x.f(exc, "<this>");
        x.f(list, "suppressed");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad.c(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final Charset n(j jVar, Charset charset) {
        x.f(jVar, "<this>");
        x.f(charset, "default");
        int iG = jVar.g(f55960f);
        if (iG == -1) {
            return charset;
        }
        if (iG == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            x.e(charset2, "UTF_8");
            return charset2;
        }
        if (iG == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            x.e(charset3, "UTF_16BE");
            return charset3;
        }
        if (iG == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            x.e(charset4, "UTF_16LE");
            return charset4;
        }
        if (iG == 3) {
            return h.n.a.f48220a.a();
        }
        if (iG == 4) {
            return h.n.a.f48220a.b();
        }
        throw new AssertionError();
    }

    @SafeVarargs
    public static final List o(Object... objArr) {
        x.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(i.i(Arrays.copyOf(objArr2, objArr2.length)));
        x.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List p(List list) {
        x.f(list, "<this>");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(i.aq(list));
        x.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final ThreadFactory q(final String str, final boolean z) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new ThreadFactory() { // from class: okhttp3.internal.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                byte[] bArr = b.f55955a;
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final z r(List list) {
        x.f(list, "<this>");
        c cVar = new c((byte[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            okhttp3.internal.f.c cVar2 = (okhttp3.internal.f.c) it.next();
            cVar.i(cVar2.f56157g.i(), cVar2.f56158h.i());
        }
        return cVar.h();
    }

    public static final void s(Closeable closeable) throws IOException {
        x.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void t(Socket socket) throws IOException {
        x.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!x.n(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean u(String str) {
        x.f(str, "<this>");
        return f55961g.g(str);
    }

    public static final boolean v(ab abVar, ab abVar2) {
        x.f(abVar, "<this>");
        x.f(abVar2, "other");
        return x.n(abVar.f(), abVar2.f()) && abVar.a() == abVar2.a() && x.n(abVar.h(), abVar2.h());
    }

    public static final boolean w(String[] strArr, String[] strArr2, Comparator comparator) {
        x.f(strArr, "<this>");
        x.f(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean x(Socket socket, j jVar) throws SocketException {
        x.f(socket, "<this>");
        x.f(jVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !jVar.R();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean y(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return o.m(str, "Authorization", true) || o.m(str, "Cookie", true) || o.m(str, "Proxy-Authorization", true) || o.m(str, "Set-Cookie", true);
    }

    public static final boolean z(am amVar, int i2, TimeUnit timeUnit) {
        boolean z;
        x.f(amVar, "<this>");
        x.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jQ = amVar.h().v() ? amVar.h().q() - jNanoTime : Long.MAX_VALUE;
        amVar.h().s(Math.min(jQ, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            h hVar = new h();
            while (amVar.a(hVar, 8192L) != -1) {
                hVar.N();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            if (jQ == Long.MAX_VALUE) {
                amVar.h().w();
            } else {
                amVar.h().s(jNanoTime + jQ);
            }
            throw th;
        }
        if (jQ == Long.MAX_VALUE) {
            amVar.h().w();
        } else {
            amVar.h().s(jNanoTime + jQ);
        }
        return z;
    }
}
