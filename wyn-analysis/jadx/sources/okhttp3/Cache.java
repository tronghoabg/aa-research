package okhttp3;

import Ba.c;
import Bf.k;
import Bf.r;
import Cd.C0351t;
import ab.b;
import cg.AbstractC1613b;
import cg.C1609A;
import cg.C1610B;
import cg.C1618g;
import cg.C1621j;
import cg.F;
import cg.H;
import cg.InterfaceC1620i;
import cg.n;
import cg.o;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.network.model.HttpRequest;
import ff.v;
import ff.x;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import org.apache.tika.metadata.HttpHeaders;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Cache implements Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f42149b = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final DiskLruCache f42150a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class CacheResponseBody extends ResponseBody {

        /* renamed from: d, reason: collision with root package name */
        public final DiskLruCache.Snapshot f42151d;

        /* renamed from: e, reason: collision with root package name */
        public final String f42152e;

        /* renamed from: f, reason: collision with root package name */
        public final String f42153f;

        /* renamed from: g, reason: collision with root package name */
        public final C1610B f42154g;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.f42151d = snapshot;
            this.f42152e = str;
            this.f42153f = str2;
            this.f42154g = AbstractC1613b.d(new o((H) snapshot.f42515c.get(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // cg.o, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    this.f42151d.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public final long getF42425e() {
            String str = this.f42153f;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = Util.f42438a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public final MediaType getF42424d() {
            String str = this.f42152e;
            if (str == null) {
                return null;
            }
            MediaType.f42292d.getClass();
            return MediaType.Companion.b(str);
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public final InterfaceC1620i getF42426f() {
            return this.f42154g;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static String a(HttpUrl url) {
            AbstractC3340k.e(url, "url");
            C1621j c1621j = C1621j.f19903d;
            return b.c(url.f42281i).c("MD5").e();
        }

        public static int b(C1610B c1610b) throws IOException {
            C1618g c1618g;
            byte bO;
            try {
                c1610b.require(1L);
                long j8 = 0;
                while (true) {
                    long j10 = j8 + 1;
                    boolean zRequest = c1610b.request(j10);
                    c1618g = c1610b.f19864b;
                    if (!zRequest) {
                        break;
                    }
                    bO = c1618g.o(j8);
                    if ((bO < 48 || bO > 57) && (j8 != 0 || bO != 45)) {
                        break;
                    }
                    j8 = j10;
                }
                if (j8 == 0) {
                    tg.b.t(16);
                    String string = Integer.toString(bO, 16);
                    AbstractC3340k.d(string, "toString(...)");
                    throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                }
                long decimalLong = c1618g.readDecimalLong();
                String utf8LineStrict = c1610b.readUtf8LineStrict(Long.MAX_VALUE);
                if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.length() <= 0) {
                    return (int) decimalLong;
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
            } catch (NumberFormatException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        public static Set c(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i5 = 0;
            while (i5 < size) {
                int i10 = i5 + 1;
                if ("Vary".equalsIgnoreCase(headers.c(i5))) {
                    String strF = headers.f(i5);
                    if (treeSet == null) {
                        r.d0();
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = k.H0(strF, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(k.V0((String) it.next()).toString());
                    }
                }
                i5 = i10;
            }
            return treeSet == null ? x.f35434a : treeSet;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class RealCacheRequest implements CacheRequest {

        /* renamed from: a, reason: collision with root package name */
        public final DiskLruCache.Editor f42167a;

        /* renamed from: b, reason: collision with root package name */
        public final F f42168b;

        /* renamed from: c, reason: collision with root package name */
        public final AnonymousClass1 f42169c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f42170d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Cache f42171e;

        /* JADX WARN: Type inference failed for: r0v2, types: [okhttp3.Cache$RealCacheRequest$1] */
        public RealCacheRequest(final Cache this$0, DiskLruCache.Editor editor) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42171e = this$0;
            this.f42167a = editor;
            F fD = editor.d(1);
            this.f42168b = fD;
            this.f42169c = new n(fD) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // cg.n, cg.F, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Cache cache = this$0;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (realCacheRequest.f42170d) {
                            return;
                        }
                        realCacheRequest.f42170d = true;
                        super.close();
                        this.f42167a.b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() throws IOException {
            synchronized (this.f42171e) {
                if (this.f42170d) {
                    return;
                }
                this.f42170d = true;
                Util.c(this.f42168b);
                try {
                    this.f42167a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* renamed from: body, reason: from getter */
        public final AnonymousClass1 getF42169c() {
            return this.f42169c;
        }
    }

    public Cache(File directory, long j8) {
        AbstractC3340k.e(directory, "directory");
        FileSystem fileSystem = FileSystem.f42855a;
        AbstractC3340k.e(fileSystem, "fileSystem");
        this.f42150a = new DiskLruCache(fileSystem, directory, j8, TaskRunner.f42534i);
    }

    public static void i(Response cached, Response response) throws Throwable {
        DiskLruCache.Editor editorD;
        AbstractC3340k.e(cached, "cached");
        Entry entry = new Entry(response);
        ResponseBody responseBody = cached.f42401g;
        if (responseBody == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        DiskLruCache.Snapshot snapshot = ((CacheResponseBody) responseBody).f42151d;
        try {
            String str = snapshot.f42513a;
            editorD = snapshot.f42516d.d(snapshot.f42514b, str);
            if (editorD == null) {
                return;
            }
            try {
                entry.c(editorD);
                editorD.b();
            } catch (IOException unused) {
                if (editorD == null) {
                    return;
                }
                try {
                    editorD.a();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException unused3) {
            editorD = null;
        }
    }

    public final Response a(Request request) throws IOException {
        AbstractC3340k.e(request, "request");
        f42149b.getClass();
        HttpUrl httpUrl = request.f42376a;
        try {
            DiskLruCache.Snapshot snapshotH = this.f42150a.h(Companion.a(httpUrl));
            if (snapshotH != null) {
                try {
                    Entry entry = new Entry((H) snapshotH.f42515c.get(0));
                    Headers headers = entry.f42158b;
                    String str = entry.f42159c;
                    HttpUrl url = entry.f42157a;
                    Headers headers2 = entry.f42163g;
                    String strA = headers2.a("Content-Type");
                    String strA2 = headers2.a(HttpHeaders.CONTENT_LENGTH);
                    Request.Builder builder = new Request.Builder();
                    AbstractC3340k.e(url, "url");
                    builder.f42382a = url;
                    builder.f(str, null);
                    builder.e(headers);
                    Request requestB = builder.b();
                    Response.Builder builder2 = new Response.Builder();
                    builder2.f42408a = requestB;
                    Protocol protocol = entry.f42160d;
                    AbstractC3340k.e(protocol, "protocol");
                    builder2.f42409b = protocol;
                    builder2.f42410c = entry.f42161e;
                    String message = entry.f42162f;
                    AbstractC3340k.e(message, "message");
                    builder2.f42411d = message;
                    builder2.c(headers2);
                    builder2.f42414g = new CacheResponseBody(snapshotH, strA, strA2);
                    builder2.f42412e = entry.f42164h;
                    builder2.k = entry.f42165i;
                    builder2.f42418l = entry.f42166j;
                    Response responseA = builder2.a();
                    if (url.equals(httpUrl) && str.equals(request.f42377b)) {
                        Set<String> setC = Companion.c(responseA.f42400f);
                        if (!(setC instanceof Collection) || !setC.isEmpty()) {
                            for (String str2 : setC) {
                                if (!headers.g(str2).equals(request.f42378c.g(str2))) {
                                }
                            }
                        }
                        return responseA;
                    }
                    ResponseBody responseBody = responseA.f42401g;
                    if (responseBody != null) {
                        Util.c(responseBody);
                        return null;
                    }
                } catch (IOException unused) {
                    Util.c(snapshotH);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final CacheRequest b(Response response) throws Throwable {
        DiskLruCache.Editor editorD;
        Request request = response.f42395a;
        String str = request.f42377b;
        HttpMethod.f42642a.getClass();
        if (!HttpMethod.a(str)) {
            if (str.equals("GET")) {
                f42149b.getClass();
                if (!Companion.c(response.f42400f).contains("*")) {
                    Entry entry = new Entry(response);
                    try {
                        editorD = this.f42150a.d(DiskLruCache.f42474y, Companion.a(request.f42376a));
                        if (editorD != null) {
                            try {
                                entry.c(editorD);
                                return new RealCacheRequest(this, editorD);
                            } catch (IOException unused) {
                                if (editorD != null) {
                                    editorD.a();
                                }
                                return null;
                            }
                        }
                    } catch (IOException unused2) {
                        editorD = null;
                    }
                }
            }
            return null;
        }
        Companion companion = f42149b;
        HttpUrl httpUrl = request.f42376a;
        companion.getClass();
        String key = Companion.a(httpUrl);
        DiskLruCache diskLruCache = this.f42150a;
        synchronized (diskLruCache) {
            AbstractC3340k.e(key, "key");
            diskLruCache.i();
            diskLruCache.a();
            DiskLruCache.P(key);
            DiskLruCache.Entry entry2 = (DiskLruCache.Entry) diskLruCache.f42484i.get(key);
            if (entry2 == null) {
                return null;
            }
            diskLruCache.D(entry2);
            if (diskLruCache.f42482g <= diskLruCache.f42478c) {
                diskLruCache.f42489o = false;
            }
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42150a.close();
    }

    public final void d(Request request) {
        AbstractC3340k.e(request, "request");
        Companion companion = f42149b;
        HttpUrl httpUrl = request.f42376a;
        companion.getClass();
        String key = Companion.a(httpUrl);
        DiskLruCache diskLruCache = this.f42150a;
        synchronized (diskLruCache) {
            AbstractC3340k.e(key, "key");
            diskLruCache.i();
            diskLruCache.a();
            DiskLruCache.P(key);
            DiskLruCache.Entry entry = (DiskLruCache.Entry) diskLruCache.f42484i.get(key);
            if (entry == null) {
                return;
            }
            diskLruCache.D(entry);
            if (diskLruCache.f42482g <= diskLruCache.f42478c) {
                diskLruCache.f42489o = false;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f42150a.flush();
    }

    public final synchronized void h() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Entry {
        public static final String k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f42156l;

        /* renamed from: a, reason: collision with root package name */
        public final HttpUrl f42157a;

        /* renamed from: b, reason: collision with root package name */
        public final Headers f42158b;

        /* renamed from: c, reason: collision with root package name */
        public final String f42159c;

        /* renamed from: d, reason: collision with root package name */
        public final Protocol f42160d;

        /* renamed from: e, reason: collision with root package name */
        public final int f42161e;

        /* renamed from: f, reason: collision with root package name */
        public final String f42162f;

        /* renamed from: g, reason: collision with root package name */
        public final Headers f42163g;

        /* renamed from: h, reason: collision with root package name */
        public final Handshake f42164h;

        /* renamed from: i, reason: collision with root package name */
        public final long f42165i;

        /* renamed from: j, reason: collision with root package name */
        public final long f42166j;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i5) {
                this();
            }

            private Companion() {
            }
        }

        static {
            new Companion(0);
            Platform.f42887a.getClass();
            Platform.f42888b.getClass();
            k = AbstractC3340k.k("-Sent-Millis", "OkHttp");
            Platform.f42888b.getClass();
            f42156l = AbstractC3340k.k("-Received-Millis", "OkHttp");
        }

        public Entry(H rawSource) throws IOException {
            HttpUrl httpUrlC;
            TlsVersion tlsVersionA;
            AbstractC3340k.e(rawSource, "rawSource");
            H h10 = rawSource;
            try {
                C1610B c1610bD = AbstractC1613b.d(rawSource);
                String utf8LineStrict = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
                HttpUrl.k.getClass();
                try {
                    httpUrlC = HttpUrl.Companion.c(utf8LineStrict);
                } catch (IllegalArgumentException unused) {
                    httpUrlC = null;
                }
                if (httpUrlC == null) {
                    IOException iOException = new IOException(AbstractC3340k.k(utf8LineStrict, "Cache corruption for "));
                    Platform.f42887a.getClass();
                    Platform.f42888b.getClass();
                    Platform.i("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f42157a = httpUrlC;
                this.f42159c = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                Cache.f42149b.getClass();
                int iB = Companion.b(c1610bD);
                int i5 = 0;
                int i10 = 0;
                while (i10 < iB) {
                    i10++;
                    builder.b(c1610bD.readUtf8LineStrict(Long.MAX_VALUE));
                }
                this.f42158b = builder.d();
                StatusLine.Companion companion = StatusLine.f42657d;
                String utf8LineStrict2 = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
                companion.getClass();
                StatusLine statusLineA = StatusLine.Companion.a(utf8LineStrict2);
                this.f42160d = statusLineA.f42658a;
                this.f42161e = statusLineA.f42659b;
                this.f42162f = statusLineA.f42660c;
                Headers.Builder builder2 = new Headers.Builder();
                Cache.f42149b.getClass();
                int iB2 = Companion.b(c1610bD);
                while (i5 < iB2) {
                    i5++;
                    builder2.b(c1610bD.readUtf8LineStrict(Long.MAX_VALUE));
                }
                String str = k;
                String strE = builder2.e(str);
                String str2 = f42156l;
                String strE2 = builder2.e(str2);
                builder2.f(str);
                builder2.f(str2);
                long j8 = 0;
                this.f42165i = strE == null ? 0L : Long.parseLong(strE);
                if (strE2 != null) {
                    j8 = Long.parseLong(strE2);
                }
                this.f42166j = j8;
                this.f42163g = builder2.d();
                if (AbstractC3340k.a(this.f42157a.f42273a, HttpRequest.DEFAULT_SCHEME)) {
                    String utf8LineStrict3 = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
                    if (utf8LineStrict3.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict3 + '\"');
                    }
                    CipherSuite cipherSuiteB = CipherSuite.f42203b.b(c1610bD.readUtf8LineStrict(Long.MAX_VALUE));
                    List listA = a(c1610bD);
                    List listA2 = a(c1610bD);
                    if (c1610bD.exhausted()) {
                        tlsVersionA = TlsVersion.SSL_3_0;
                    } else {
                        TlsVersion.Companion companion2 = TlsVersion.f42430b;
                        String utf8LineStrict4 = c1610bD.readUtf8LineStrict(Long.MAX_VALUE);
                        companion2.getClass();
                        tlsVersionA = TlsVersion.Companion.a(utf8LineStrict4);
                    }
                    Handshake.f42261e.getClass();
                    this.f42164h = new Handshake(tlsVersionA, cipherSuiteB, Util.x(listA2), new Handshake$Companion$get$1(Util.x(listA)));
                } else {
                    this.f42164h = null;
                }
                h10.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.n(h10, th);
                    throw th2;
                }
            }
        }

        public static List a(C1610B c1610b) throws IOException, CertificateException {
            Cache.f42149b.getClass();
            int iB = Companion.b(c1610b);
            if (iB == -1) {
                return v.f35432a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(iB);
                int i5 = 0;
                while (i5 < iB) {
                    i5++;
                    String utf8LineStrict = c1610b.readUtf8LineStrict(Long.MAX_VALUE);
                    C1618g c1618g = new C1618g();
                    C1621j c1621j = C1621j.f19903d;
                    C1621j c1621jA = b.a(utf8LineStrict);
                    AbstractC3340k.b(c1621jA);
                    c1618g.Q(c1621jA);
                    arrayList.add(certificateFactory.generateCertificate(new C0351t(c1618g, 2)));
                }
                return arrayList;
            } catch (CertificateException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        public static void b(C1609A c1609a, List list) throws IOException, CertificateEncodingException {
            try {
                c1609a.writeDecimalLong(list.size());
                c1609a.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    C1621j c1621j = C1621j.f19903d;
                    AbstractC3340k.d(bytes, "bytes");
                    c1609a.writeUtf8(b.g(bytes).a());
                    c1609a.writeByte(10);
                }
            } catch (CertificateEncodingException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        public final void c(DiskLruCache.Editor editor) throws Throwable {
            HttpUrl httpUrl = this.f42157a;
            Handshake handshake = this.f42164h;
            Headers headers = this.f42163g;
            Headers headers2 = this.f42158b;
            C1609A c1609aC = AbstractC1613b.c(editor.d(0));
            try {
                c1609aC.writeUtf8(httpUrl.f42281i);
                c1609aC.writeByte(10);
                c1609aC.writeUtf8(this.f42159c);
                c1609aC.writeByte(10);
                c1609aC.writeDecimalLong(headers2.size());
                c1609aC.writeByte(10);
                int size = headers2.size();
                int i5 = 0;
                while (i5 < size) {
                    int i10 = i5 + 1;
                    c1609aC.writeUtf8(headers2.c(i5));
                    c1609aC.writeUtf8(": ");
                    c1609aC.writeUtf8(headers2.f(i5));
                    c1609aC.writeByte(10);
                    i5 = i10;
                }
                c1609aC.writeUtf8(new StatusLine(this.f42160d, this.f42161e, this.f42162f).toString());
                c1609aC.writeByte(10);
                c1609aC.writeDecimalLong(headers.size() + 2);
                c1609aC.writeByte(10);
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c1609aC.writeUtf8(headers.c(i11));
                    c1609aC.writeUtf8(": ");
                    c1609aC.writeUtf8(headers.f(i11));
                    c1609aC.writeByte(10);
                }
                c1609aC.writeUtf8(k);
                c1609aC.writeUtf8(": ");
                c1609aC.writeDecimalLong(this.f42165i);
                c1609aC.writeByte(10);
                c1609aC.writeUtf8(f42156l);
                c1609aC.writeUtf8(": ");
                c1609aC.writeDecimalLong(this.f42166j);
                c1609aC.writeByte(10);
                if (AbstractC3340k.a(httpUrl.f42273a, HttpRequest.DEFAULT_SCHEME)) {
                    c1609aC.writeByte(10);
                    AbstractC3340k.b(handshake);
                    c1609aC.writeUtf8(handshake.f42263b.f42221a);
                    c1609aC.writeByte(10);
                    b(c1609aC, handshake.a());
                    b(c1609aC, handshake.f42264c);
                    c1609aC.writeUtf8(handshake.f42262a.f42437a);
                    c1609aC.writeByte(10);
                }
                c1609aC.close();
            } finally {
            }
        }

        public Entry(Response response) {
            Headers headersD;
            Request request = response.f42395a;
            this.f42157a = request.f42376a;
            Cache.f42149b.getClass();
            Response response2 = response.f42402h;
            AbstractC3340k.b(response2);
            Headers headers = response2.f42395a.f42378c;
            Headers headers2 = response.f42400f;
            Set setC = Companion.c(headers2);
            if (setC.isEmpty()) {
                headersD = Util.f42439b;
            } else {
                Headers.Builder builder = new Headers.Builder();
                int size = headers.size();
                int i5 = 0;
                while (i5 < size) {
                    int i10 = i5 + 1;
                    String strC = headers.c(i5);
                    if (setC.contains(strC)) {
                        builder.a(strC, headers.f(i5));
                    }
                    i5 = i10;
                }
                headersD = builder.d();
            }
            this.f42158b = headersD;
            this.f42159c = request.f42377b;
            this.f42160d = response.f42396b;
            this.f42161e = response.f42398d;
            this.f42162f = response.f42397c;
            this.f42163g = headers2;
            this.f42164h = response.f42399e;
            this.f42165i = response.k;
            this.f42166j = response.f42405l;
        }
    }
}
