package okhttp3.internal.http2;

import ab.b;
import cg.C1621j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.metadata.TikaCoreProperties;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Header {

    /* renamed from: d, reason: collision with root package name */
    public static final C1621j f42696d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1621j f42697e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1621j f42698f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1621j f42699g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1621j f42700h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1621j f42701i;

    /* renamed from: a, reason: collision with root package name */
    public final C1621j f42702a;

    /* renamed from: b, reason: collision with root package name */
    public final C1621j f42703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42704c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "<init>", "()V", "Lcg/j;", "PSEUDO_PREFIX", "Lcg/j;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        C1621j c1621j = C1621j.f19903d;
        f42696d = b.c(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        f42697e = b.c(com.applovin.shadow.okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);
        f42698f = b.c(com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);
        f42699g = b.c(com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_PATH_UTF8);
        f42700h = b.c(com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);
        f42701i = b.c(com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    }

    public Header(C1621j name, C1621j value) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(value, "value");
        this.f42702a = name;
        this.f42703b = value;
        this.f42704c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return AbstractC3340k.a(this.f42702a, header.f42702a) && AbstractC3340k.a(this.f42703b, header.f42703b);
    }

    public final int hashCode() {
        return this.f42703b.hashCode() + (this.f42702a.hashCode() * 31);
    }

    public final String toString() {
        return this.f42702a.t() + ": " + this.f42703b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String name, String value) {
        this(b.c(name), b.c(value));
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(value, "value");
        C1621j c1621j = C1621j.f19903d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C1621j name, String value) {
        this(name, b.c(value));
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(value, "value");
        C1621j c1621j = C1621j.f19903d;
    }
}
