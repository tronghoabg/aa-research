package okhttp3.internal;

import Bf.a;
import Bf.i;
import Bf.k;
import Uf.h;
import ab.b;
import cg.AbstractC1613b;
import cg.C1610B;
import cg.C1618g;
import cg.C1621j;
import cg.H;
import cg.InterfaceC1620i;
import cg.x;
import com.google.android.gms.common.api.f;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import ff.o;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http2.Header;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.TikaCoreProperties;
import r7.AbstractC3935e;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f42438a;

    /* renamed from: b, reason: collision with root package name */
    public static final Headers f42439b;

    /* renamed from: c, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f42440c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f42441d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f42442e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f42443f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f42444g;

    static {
        byte[] bArr = new byte[0];
        f42438a = bArr;
        Headers.f42269b.getClass();
        f42439b = Headers.Companion.c(new String[0]);
        ResponseBody.INSTANCE.getClass();
        f42440c = ResponseBody.Companion.c(bArr, null);
        RequestBody.Companion.d(RequestBody.INSTANCE, bArr, null, 0, 7);
        C1621j c1621j = C1621j.f19903d;
        f42441d = AbstractC1613b.h(b.b("efbbbf"), b.b("feff"), b.b("fffe"), b.b("0000ffff"), b.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        AbstractC3340k.b(timeZone);
        f42442e = timeZone;
        f42443f = new i("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f42444g = k.F0(k.E0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final void A(IOException iOException, List list) {
        AbstractC3340k.e(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fe.b.d(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        AbstractC3340k.e(httpUrl, "<this>");
        AbstractC3340k.e(other, "other");
        return AbstractC3340k.a(httpUrl.f42276d, other.f42276d) && httpUrl.f42277e == other.f42277e && AbstractC3340k.a(httpUrl.f42273a, other.f42273a);
    }

    public static final int b(long j8, TimeUnit timeUnit) {
        if (j8 < 0) {
            throw new IllegalStateException(AbstractC3340k.k(" < 0", "timeout").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j8);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(AbstractC3340k.k(" too large.", "timeout").toString());
        }
        if (millis != 0 || j8 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(AbstractC3340k.k(" too small.", "timeout").toString());
    }

    public static final void c(Closeable closeable) throws IOException {
        AbstractC3340k.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        AbstractC3340k.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e10) {
            if (!AbstractC3340k.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c10, int i5, int i10) {
        AbstractC3340k.e(str, "<this>");
        while (i5 < i10) {
            int i11 = i5 + 1;
            if (str.charAt(i5) == c10) {
                return i5;
            }
            i5 = i11;
        }
        return i10;
    }

    public static final int f(String str, String str2, int i5, int i10) {
        AbstractC3340k.e(str, "<this>");
        while (i5 < i10) {
            int i11 = i5 + 1;
            if (k.o0(str2, str.charAt(i5))) {
                return i5;
            }
            i5 = i11;
        }
        return i10;
    }

    public static final boolean g(H h10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC3340k.e(timeUnit, "timeUnit");
        try {
            return u(h10, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String format, Object... objArr) {
        AbstractC3340k.e(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC3340k.e(strArr, "<this>");
        AbstractC3340k.e(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i5 = 0;
            while (i5 < length) {
                String str = strArr[i5];
                i5++;
                h hVarI = AbstractC3340k.i(strArr2);
                while (hVarI.hasNext()) {
                    if (comparator.compare(str, (String) hVarI.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(Response response) {
        String strA = response.f42400f.a(HttpHeaders.CONTENT_LENGTH);
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... elements) {
        AbstractC3340k.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(AbstractC3935e.D(Arrays.copyOf(objArr, objArr.length)));
        AbstractC3340k.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            int i10 = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (AbstractC3340k.g(cCharAt, 31) <= 0 || AbstractC3340k.g(cCharAt, 127) >= 0) {
                return i5;
            }
            i5 = i10;
        }
        return -1;
    }

    public static final int m(String str, int i5, int i10) {
        AbstractC3340k.e(str, "<this>");
        while (i5 < i10) {
            int i11 = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i5;
            }
            i5 = i11;
        }
        return i10;
    }

    public static final int n(String str, int i5, int i10) {
        AbstractC3340k.e(str, "<this>");
        int i11 = i10 - 1;
        if (i5 <= i11) {
            while (true) {
                int i12 = i11 - 1;
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i5) {
                    break;
                }
                i11 = i12;
            }
        }
        return i5;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator comparator) {
        AbstractC3340k.e(other, "other");
        AbstractC3340k.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i5 = 0;
        while (i5 < length) {
            String str = strArr[i5];
            i5++;
            int length2 = other.length;
            int i10 = 0;
            while (true) {
                if (i10 < length2) {
                    String str2 = other[i10];
                    i10++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean p(String name) {
        AbstractC3340k.e(name, "name");
        return name.equalsIgnoreCase(ApiHeadersProvider.AUTHORIZATION) || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset r(InterfaceC1620i interfaceC1620i, Charset charset) {
        AbstractC3340k.e(interfaceC1620i, "<this>");
        AbstractC3340k.e(charset, "default");
        int iR = interfaceC1620i.r(f42441d);
        if (iR == -1) {
            return charset;
        }
        if (iR == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC3340k.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iR == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC3340k.d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iR == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC3340k.d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iR == 3) {
            Charset charset2 = a.f1670a;
            Charset charset3 = a.f1673d;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            AbstractC3340k.d(charsetForName, "forName(...)");
            a.f1673d = charsetForName;
            return charsetForName;
        }
        if (iR != 4) {
            throw new AssertionError();
        }
        Charset charset4 = a.f1670a;
        Charset charset5 = a.f1672c;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        AbstractC3340k.d(charsetForName2, "forName(...)");
        a.f1672c = charsetForName2;
        return charsetForName2;
    }

    public static final int s(C1610B c1610b) {
        AbstractC3340k.e(c1610b, "<this>");
        return (c1610b.readByte() & ForkServer.ERROR) | ((c1610b.readByte() & ForkServer.ERROR) << 16) | ((c1610b.readByte() & ForkServer.ERROR) << 8);
    }

    public static final int t(C1618g c1618g) throws EOFException {
        int i5 = 0;
        while (!c1618g.exhausted() && c1618g.o(0L) == 61) {
            i5++;
            c1618g.readByte();
        }
        return i5;
    }

    public static final boolean u(H h10, int i5) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC3340k.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = h10.timeout().e() ? h10.timeout().c() - jNanoTime : Long.MAX_VALUE;
        h10.timeout().d(Math.min(jC, timeUnit.toNanos(i5)) + jNanoTime);
        try {
            C1618g c1618g = new C1618g();
            while (h10.read(c1618g, 8192L) != -1) {
                c1618g.a();
            }
            if (jC == Long.MAX_VALUE) {
                h10.timeout().a();
                return true;
            }
            h10.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                h10.timeout().a();
                return false;
            }
            h10.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                h10.timeout().a();
            } else {
                h10.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final Headers v(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.c(header.f42702a.t(), header.f42703b.t());
        }
        return builder.d();
    }

    public static final String w(HttpUrl httpUrl, boolean z2) {
        AbstractC3340k.e(httpUrl, "<this>");
        String strF = httpUrl.f42276d;
        if (k.n0(strF, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, false)) {
            strF = AbstractC3256n.f(']', "[", strF);
        }
        int i5 = httpUrl.f42277e;
        if (!z2) {
            HttpUrl.k.getClass();
            if (i5 == HttpUrl.Companion.b(httpUrl.f42273a)) {
                return strF;
            }
        }
        return strF + ':' + i5;
    }

    public static final List x(List list) {
        AbstractC3340k.e(list, "<this>");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(o.U0(list));
        AbstractC3340k.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int y(String str, int i5) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        if (lValueOf == null) {
            return i5;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return f.API_PRIORITY_OTHER;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String z(String str, int i5, int i10) {
        int iM = m(str, i5, i10);
        String strSubstring = str.substring(iM, n(str, iM, i10));
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
