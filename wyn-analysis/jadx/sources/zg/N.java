package zg;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes5.dex */
public final class N {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f48549l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f48550m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f48551a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpUrl f48552b;

    /* renamed from: c, reason: collision with root package name */
    public String f48553c;

    /* renamed from: d, reason: collision with root package name */
    public HttpUrl.Builder f48554d;

    /* renamed from: e, reason: collision with root package name */
    public final Request.Builder f48555e = new Request.Builder();

    /* renamed from: f, reason: collision with root package name */
    public final Headers.Builder f48556f;

    /* renamed from: g, reason: collision with root package name */
    public MediaType f48557g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f48558h;

    /* renamed from: i, reason: collision with root package name */
    public final MultipartBody.Builder f48559i;

    /* renamed from: j, reason: collision with root package name */
    public final FormBody.Builder f48560j;
    public RequestBody k;

    public N(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z2, boolean z10, boolean z11) {
        this.f48551a = str;
        this.f48552b = httpUrl;
        this.f48553c = str2;
        this.f48557g = mediaType;
        this.f48558h = z2;
        if (headers != null) {
            this.f48556f = headers.d();
        } else {
            this.f48556f = new Headers.Builder();
        }
        if (z10) {
            this.f48560j = new FormBody.Builder();
            return;
        }
        if (z11) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f48559i = builder;
            MediaType type = MultipartBody.f42299h;
            AbstractC3340k.e(type, "type");
            if (!type.f42296b.equals("multipart")) {
                throw new IllegalArgumentException(AbstractC3340k.k(type, "multipart != ").toString());
            }
            builder.f42307b = type;
        }
    }

    public final void a(String name, String str, boolean z2) {
        FormBody.Builder builder = this.f48560j;
        if (z2) {
            builder.getClass();
            AbstractC3340k.e(name, "name");
            ArrayList arrayList = builder.f42259a;
            HttpUrl.Companion companion = HttpUrl.k;
            arrayList.add(HttpUrl.Companion.a(companion, name, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.FORM_ENCODE_SET, 83));
            builder.f42260b.add(HttpUrl.Companion.a(companion, str, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.FORM_ENCODE_SET, 83));
            return;
        }
        builder.getClass();
        AbstractC3340k.e(name, "name");
        ArrayList arrayList2 = builder.f42259a;
        HttpUrl.Companion companion2 = HttpUrl.k;
        arrayList2.add(HttpUrl.Companion.a(companion2, name, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.FORM_ENCODE_SET, 91));
        builder.f42260b.add(HttpUrl.Companion.a(companion2, str, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.FORM_ENCODE_SET, 91));
    }

    public final void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f48556f.a(str, str2);
            return;
        }
        try {
            MediaType.f42292d.getClass();
            this.f48557g = MediaType.Companion.a(str2);
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(R8.v.f("Malformed content type: ", str2), e7);
        }
    }

    public final void c(Headers headers, RequestBody body) {
        MultipartBody.Builder builder = this.f48559i;
        builder.getClass();
        AbstractC3340k.e(body, "body");
        MultipartBody.Part.f42309c.getClass();
        if (headers.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (headers.a(HttpHeaders.CONTENT_LENGTH) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        builder.f42308c.add(new MultipartBody.Part(headers, body));
    }

    public final void d(String name, String str, boolean z2) {
        String str2 = this.f48553c;
        if (str2 != null) {
            HttpUrl httpUrl = this.f48552b;
            HttpUrl.Builder builderG = httpUrl.g(str2);
            this.f48554d = builderG;
            if (builderG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f48553c);
            }
            this.f48553c = null;
        }
        if (z2) {
            HttpUrl.Builder builder = this.f48554d;
            builder.getClass();
            AbstractC3340k.e(name, "encodedName");
            if (builder.f42290g == null) {
                builder.f42290g = new ArrayList();
            }
            ArrayList arrayList = builder.f42290g;
            AbstractC3340k.b(arrayList);
            HttpUrl.Companion companion = HttpUrl.k;
            arrayList.add(HttpUrl.Companion.a(companion, name, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, 211));
            ArrayList arrayList2 = builder.f42290g;
            AbstractC3340k.b(arrayList2);
            arrayList2.add(str != null ? HttpUrl.Companion.a(companion, str, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, 211) : null);
            return;
        }
        HttpUrl.Builder builder2 = this.f48554d;
        builder2.getClass();
        AbstractC3340k.e(name, "name");
        if (builder2.f42290g == null) {
            builder2.f42290g = new ArrayList();
        }
        ArrayList arrayList3 = builder2.f42290g;
        AbstractC3340k.b(arrayList3);
        HttpUrl.Companion companion2 = HttpUrl.k;
        arrayList3.add(HttpUrl.Companion.a(companion2, name, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE));
        ArrayList arrayList4 = builder2.f42290g;
        AbstractC3340k.b(arrayList4);
        arrayList4.add(str != null ? HttpUrl.Companion.a(companion2, str, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE) : null);
    }
}
