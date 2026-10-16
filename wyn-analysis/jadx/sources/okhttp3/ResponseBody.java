package okhttp3;

import Ba.c;
import Bf.a;
import R8.v;
import cg.C1618g;
import cg.C1621j;
import cg.InterfaceC1620i;
import ef.C2515C;
import ef.InterfaceC2519c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "", "bytes", "()[B", "Lcg/j;", "byteString", "()Lcg/j;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "Lef/C;", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @Nullable
    private Reader reader;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1620i f42420a;

        /* renamed from: b, reason: collision with root package name */
        public final Charset f42421b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f42422c;

        /* renamed from: d, reason: collision with root package name */
        public InputStreamReader f42423d;

        public BomAwareReader(InterfaceC1620i source, Charset charset) {
            AbstractC3340k.e(source, "source");
            AbstractC3340k.e(charset, "charset");
            this.f42420a = source;
            this.f42421b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C2515C c2515c;
            this.f42422c = true;
            InputStreamReader inputStreamReader = this.f42423d;
            if (inputStreamReader == null) {
                c2515c = null;
            } else {
                inputStreamReader.close();
                c2515c = C2515C.f34653a;
            }
            if (c2515c == null) {
                this.f42420a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i5, int i10) throws IOException {
            AbstractC3340k.e(cbuf, "cbuf");
            if (this.f42422c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f42423d;
            if (inputStreamReader == null) {
                InterfaceC1620i interfaceC1620i = this.f42420a;
                inputStreamReader = new InputStreamReader(interfaceC1620i.inputStream(), Util.r(interfaceC1620i, this.f42421b));
                this.f42423d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i5, i10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.ResponseBody$Companion$asResponseBody$1] */
        public static ResponseBody$Companion$asResponseBody$1 a(final InterfaceC1620i interfaceC1620i, final MediaType mediaType, final long j8) {
            AbstractC3340k.e(interfaceC1620i, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: contentLength, reason: from getter */
                public final long getF42425e() {
                    return j8;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: contentType, reason: from getter */
                public final MediaType getF42424d() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: source, reason: from getter */
                public final InterfaceC1620i getF42426f() {
                    return interfaceC1620i;
                }
            };
        }

        public static ResponseBody$Companion$asResponseBody$1 b(String string, MediaType mediaType) {
            AbstractC3340k.e(string, "<this>");
            Charset charset = a.f1670a;
            if (mediaType != null) {
                MediaType.Companion companion = MediaType.f42292d;
                Charset charsetA = mediaType.a(null);
                if (charsetA == null) {
                    MediaType.f42292d.getClass();
                    mediaType = MediaType.Companion.b(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetA;
                }
            }
            C1618g c1618g = new C1618g();
            AbstractC3340k.e(charset, "charset");
            int length = string.length();
            AbstractC3340k.e(string, "string");
            if (length < 0) {
                throw new IllegalArgumentException(v.e(length, 0, "endIndex < beginIndex: ", " < ").toString());
            }
            if (length > string.length()) {
                StringBuilder sbL = f.l(length, "endIndex > string.length: ", " > ");
                sbL.append(string.length());
                throw new IllegalArgumentException(sbL.toString().toString());
            }
            if (charset.equals(a.f1670a)) {
                c1618g.c0(0, length, string);
            } else {
                String strSubstring = string.substring(0, length);
                AbstractC3340k.d(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                AbstractC3340k.d(bytes, "getBytes(...)");
                c1618g.W(bytes, 0, bytes.length);
            }
            return a(c1618g, mediaType, c1618g.f19902b);
        }

        public static ResponseBody$Companion$asResponseBody$1 c(byte[] bArr, MediaType mediaType) {
            AbstractC3340k.e(bArr, "<this>");
            C1618g c1618g = new C1618g();
            c1618g.V(bArr);
            return a(c1618g, mediaType, bArr.length);
        }

        private Companion() {
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull InterfaceC1620i interfaceC1620i, @Nullable MediaType mediaType, long j8) {
        INSTANCE.getClass();
        return Companion.a(interfaceC1620i, mediaType, j8);
    }

    @NotNull
    public final InputStream byteStream() {
        return getF42426f().inputStream();
    }

    @NotNull
    public final C1621j byteString() throws IOException {
        long jContentLength = getF42425e();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC3340k.k(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        }
        InterfaceC1620i interfaceC1620iSource = getF42426f();
        try {
            C1621j byteString = interfaceC1620iSource.readByteString();
            c.n(interfaceC1620iSource, null);
            int iD = byteString.d();
            if (jContentLength == -1 || jContentLength == iD) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = getF42425e();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC3340k.k(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        }
        InterfaceC1620i interfaceC1620iSource = getF42426f();
        try {
            byte[] byteArray = interfaceC1620iSource.readByteArray();
            c.n(interfaceC1620iSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader bomAwareReader = this.reader;
        if (bomAwareReader == null) {
            InterfaceC1620i interfaceC1620iSource = getF42426f();
            MediaType mediaTypeContentType = getF42424d();
            Charset charsetA = mediaTypeContentType == null ? null : mediaTypeContentType.a(a.f1670a);
            if (charsetA == null) {
                charsetA = a.f1670a;
            }
            bomAwareReader = new BomAwareReader(interfaceC1620iSource, charsetA);
            this.reader = bomAwareReader;
        }
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.c(getF42426f());
    }

    /* renamed from: contentLength */
    public abstract long getF42425e();

    /* renamed from: contentType */
    public abstract MediaType getF42424d();

    /* renamed from: source */
    public abstract InterfaceC1620i getF42426f();

    @NotNull
    public final String string() throws IOException {
        InterfaceC1620i interfaceC1620iSource = getF42426f();
        try {
            InterfaceC1620i interfaceC1620i = interfaceC1620iSource;
            MediaType mediaTypeContentType = getF42424d();
            Charset charsetA = mediaTypeContentType == null ? null : mediaTypeContentType.a(a.f1670a);
            if (charsetA == null) {
                charsetA = a.f1670a;
            }
            String string = interfaceC1620i.readString(Util.r(interfaceC1620i, charsetA));
            c.n(interfaceC1620iSource, null);
            return string;
        } finally {
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.b(str, mediaType);
    }

    @InterfaceC2519c
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, long j8, @NotNull InterfaceC1620i content) {
        INSTANCE.getClass();
        AbstractC3340k.e(content, "content");
        return Companion.a(content, mediaType, j8);
    }

    @InterfaceC2519c
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull C1621j content) {
        INSTANCE.getClass();
        AbstractC3340k.e(content, "content");
        C1618g c1618g = new C1618g();
        c1618g.Q(content);
        return Companion.a(c1618g, mediaType, content.d());
    }

    @InterfaceC2519c
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String content) {
        INSTANCE.getClass();
        AbstractC3340k.e(content, "content");
        return Companion.b(content, mediaType);
    }

    @InterfaceC2519c
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] content) {
        INSTANCE.getClass();
        AbstractC3340k.e(content, "content");
        return Companion.c(content, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.c(bArr, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@NotNull C1621j c1621j, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        AbstractC3340k.e(c1621j, "<this>");
        C1618g c1618g = new C1618g();
        c1618g.Q(c1621j);
        return Companion.a(c1618g, mediaType, c1621j.d());
    }
}
