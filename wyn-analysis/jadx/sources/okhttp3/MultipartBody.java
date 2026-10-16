package okhttp3;

import ab.b;
import cg.C1618g;
import cg.C1621j;
import cg.InterfaceC1619h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.MediaType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "Part", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: g, reason: collision with root package name */
    public static final MediaType f42298g;

    /* renamed from: h, reason: collision with root package name */
    public static final MediaType f42299h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f42300i;

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f42301j;
    public static final byte[] k;

    /* renamed from: c, reason: collision with root package name */
    public final C1621j f42302c;

    /* renamed from: d, reason: collision with root package name */
    public final List f42303d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaType f42304e;

    /* renamed from: f, reason: collision with root package name */
    public long f42305f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final C1621j f42306a;

        /* renamed from: b, reason: collision with root package name */
        public MediaType f42307b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f42308c;

        public Builder() {
            String string = UUID.randomUUID().toString();
            AbstractC3340k.d(string, "randomUUID().toString()");
            C1621j c1621j = C1621j.f19903d;
            this.f42306a = b.c(string);
            this.f42307b = MultipartBody.f42298g;
            this.f42308c = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Part {

        /* renamed from: c, reason: collision with root package name */
        public static final Companion f42309c = new Companion(0);

        /* renamed from: a, reason: collision with root package name */
        public final Headers f42310a;

        /* renamed from: b, reason: collision with root package name */
        public final RequestBody f42311b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i5) {
                this();
            }

            private Companion() {
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f42310a = headers;
            this.f42311b = requestBody;
        }
    }

    static {
        new Companion(0);
        MediaType.f42292d.getClass();
        f42298g = MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        f42299h = MediaType.Companion.a("multipart/form-data");
        f42300i = new byte[]{58, 32};
        f42301j = new byte[]{13, 10};
        k = new byte[]{45, 45};
    }

    public MultipartBody(C1621j boundaryByteString, MediaType type, List list) {
        AbstractC3340k.e(boundaryByteString, "boundaryByteString");
        AbstractC3340k.e(type, "type");
        this.f42302c = boundaryByteString;
        this.f42303d = list;
        MediaType.Companion companion = MediaType.f42292d;
        String str = type + "; boundary=" + boundaryByteString.t();
        companion.getClass();
        this.f42304e = MediaType.Companion.a(str);
        this.f42305f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(InterfaceC1619h interfaceC1619h, boolean z2) throws EOFException {
        C1618g c1618g;
        InterfaceC1619h c1618g2;
        if (z2) {
            c1618g2 = new C1618g();
            c1618g = c1618g2;
        } else {
            c1618g = 0;
            c1618g2 = interfaceC1619h;
        }
        List list = this.f42303d;
        int size = list.size();
        long j8 = 0;
        int i5 = 0;
        while (true) {
            C1621j c1621j = this.f42302c;
            byte[] bArr = k;
            byte[] bArr2 = f42301j;
            if (i5 >= size) {
                AbstractC3340k.b(c1618g2);
                c1618g2.write(bArr);
                c1618g2.u(c1621j);
                c1618g2.write(bArr);
                c1618g2.write(bArr2);
                if (!z2) {
                    return j8;
                }
                AbstractC3340k.b(c1618g);
                long j10 = j8 + c1618g.f19902b;
                c1618g.a();
                return j10;
            }
            int i10 = i5 + 1;
            Part part = (Part) list.get(i5);
            Headers headers = part.f42310a;
            AbstractC3340k.b(c1618g2);
            c1618g2.write(bArr);
            c1618g2.u(c1621j);
            c1618g2.write(bArr2);
            int size2 = headers.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c1618g2.writeUtf8(headers.c(i11)).write(f42300i).writeUtf8(headers.f(i11)).write(bArr2);
            }
            RequestBody requestBody = part.f42311b;
            MediaType f42304e = requestBody.getF42304e();
            if (f42304e != null) {
                c1618g2.writeUtf8("Content-Type: ").writeUtf8(f42304e.f42295a).write(bArr2);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                c1618g2.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(bArr2);
            } else if (z2) {
                AbstractC3340k.b(c1618g);
                c1618g.a();
                return -1L;
            }
            c1618g2.write(bArr2);
            if (z2) {
                j8 += jContentLength;
            } else {
                requestBody.writeTo(c1618g2);
            }
            c1618g2.write(bArr2);
            i5 = i10;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws EOFException {
        long j8 = this.f42305f;
        if (j8 != -1) {
            return j8;
        }
        long jA = a(null, true);
        this.f42305f = jA;
        return jA;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public final MediaType getF42304e() {
        return this.f42304e;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC1619h interfaceC1619h) throws EOFException {
        a(interfaceC1619h, false);
    }
}
