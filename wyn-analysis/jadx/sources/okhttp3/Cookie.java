package okhttp3;

import N0.a;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.http.DatesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Cookie {

    /* renamed from: j, reason: collision with root package name */
    public static final Companion f42233j = new Companion(0);
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f42234l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f42235m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f42236n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f42237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42238b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42239c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42240d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42241e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f42242f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f42243g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f42244h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f42245i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static int a(String str, int i5, int i10, boolean z2) {
            while (i5 < i10) {
                int i11 = i5 + 1;
                char cCharAt = str.charAt(i5);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z2)) {
                    return i5;
                }
                i5 = i11;
            }
            return i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static long b(int r14, java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.b(int, java.lang.String):long");
        }

        private Companion() {
        }
    }

    public Cookie(String str, String str2, long j8, String str3, String str4, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.f42237a = str;
        this.f42238b = str2;
        this.f42239c = j8;
        this.f42240d = str3;
        this.f42241e = str4;
        this.f42242f = z2;
        this.f42243g = z10;
        this.f42244h = z11;
        this.f42245i = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return AbstractC3340k.a(cookie.f42237a, this.f42237a) && AbstractC3340k.a(cookie.f42238b, this.f42238b) && cookie.f42239c == this.f42239c && AbstractC3340k.a(cookie.f42240d, this.f42240d) && AbstractC3340k.a(cookie.f42241e, this.f42241e) && cookie.f42242f == this.f42242f && cookie.f42243g == this.f42243g && cookie.f42244h == this.f42244h && cookie.f42245i == this.f42245i;
    }

    public final int hashCode() {
        int iC = a.c(a.c(527, 31, this.f42237a), 31, this.f42238b);
        long j8 = this.f42239c;
        return ((((((a.c(a.c((iC + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.f42240d), 31, this.f42241e) + (this.f42242f ? 1231 : 1237)) * 31) + (this.f42243g ? 1231 : 1237)) * 31) + (this.f42244h ? 1231 : 1237)) * 31) + (this.f42245i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42237a);
        sb2.append('=');
        sb2.append(this.f42238b);
        if (this.f42244h) {
            long j8 = this.f42239c;
            if (j8 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = DatesKt.f42637a.get().format(new Date(j8));
                AbstractC3340k.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f42245i) {
            sb2.append("; domain=");
            sb2.append(this.f42240d);
        }
        sb2.append("; path=");
        sb2.append(this.f42241e);
        if (this.f42242f) {
            sb2.append("; secure");
        }
        if (this.f42243g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString()");
        return string;
    }
}
