package okhttp3;

import Bf.a;
import cg.C1621j;
import cg.InterfaceC1619h;
import ef.InterfaceC2519c;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "", "isDuplex", "()Z", "isOneShot", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static RequestBody$Companion$toRequestBody$2 a(String str, MediaType mediaType) {
            AbstractC3340k.e(str, "<this>");
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
            byte[] bytes = str.getBytes(charset);
            AbstractC3340k.d(bytes, "this as java.lang.String).getBytes(charset)");
            return b(mediaType, bytes, 0, bytes.length);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [okhttp3.RequestBody$Companion$toRequestBody$2] */
        public static RequestBody$Companion$toRequestBody$2 b(final MediaType mediaType, final byte[] bArr, final int i5, final int i10) {
            AbstractC3340k.e(bArr, "<this>");
            long length = bArr.length;
            long j8 = i5;
            long j10 = i10;
            byte[] bArr2 = Util.f42438a;
            if ((j8 | j10) < 0 || j8 > length || length - j8 < j10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return i10;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public final MediaType getF42391c() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(InterfaceC1619h interfaceC1619h) {
                    interfaceC1619h.T(i5, i10, bArr);
                }
            };
        }

        public static RequestBody$Companion$toRequestBody$2 c(Companion companion, MediaType mediaType, byte[] bArr, int i5, int i10) {
            if ((i10 & 4) != 0) {
                i5 = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return b(mediaType, bArr, i5, length);
        }

        public static /* synthetic */ RequestBody$Companion$toRequestBody$2 d(Companion companion, byte[] bArr, MediaType mediaType, int i5, int i10) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                i5 = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return b(mediaType, bArr, i5, length);
        }

        private Companion() {
        }
    }

    @NotNull
    public static final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.a(str, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    /* renamed from: contentType */
    public abstract MediaType getF42391c();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC1619h interfaceC1619h);

    @InterfaceC2519c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull C1621j content) {
        INSTANCE.getClass();
        AbstractC3340k.e(content, "content");
        return new RequestBody$Companion$toRequestBody$1(mediaType, content);
    }

    @InterfaceC2519c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
        INSTANCE.getClass();
        AbstractC3340k.e(file, "file");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    @InterfaceC2519c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull String content) {
        INSTANCE.getClass();
        AbstractC3340k.e(content, "content");
        return Companion.a(content, mediaType);
    }

    @InterfaceC2519c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content) {
        Companion companion = INSTANCE;
        companion.getClass();
        AbstractC3340k.e(content, "content");
        return Companion.c(companion, mediaType, content, 0, 12);
    }

    @InterfaceC2519c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content, int i5) {
        Companion companion = INSTANCE;
        companion.getClass();
        AbstractC3340k.e(content, "content");
        return Companion.c(companion, mediaType, content, i5, 8);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr) {
        Companion companion = INSTANCE;
        companion.getClass();
        AbstractC3340k.e(bArr, "<this>");
        return Companion.d(companion, bArr, null, 0, 7);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        Companion companion = INSTANCE;
        companion.getClass();
        AbstractC3340k.e(bArr, "<this>");
        return Companion.d(companion, bArr, mediaType, 0, 6);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i5) {
        Companion companion = INSTANCE;
        companion.getClass();
        AbstractC3340k.e(bArr, "<this>");
        return Companion.d(companion, bArr, mediaType, i5, 4);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i5, int i10) {
        INSTANCE.getClass();
        return Companion.b(mediaType, bArr, i5, i10);
    }

    @NotNull
    public static final RequestBody create(@NotNull C1621j c1621j, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        AbstractC3340k.e(c1621j, "<this>");
        return new RequestBody$Companion$toRequestBody$1(mediaType, c1621j);
    }

    @NotNull
    public static final RequestBody create(@NotNull File file, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        AbstractC3340k.e(file, "<this>");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    @InterfaceC2519c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content, int i5, int i10) {
        INSTANCE.getClass();
        AbstractC3340k.e(content, "content");
        return Companion.b(mediaType, content, i5, i10);
    }
}
