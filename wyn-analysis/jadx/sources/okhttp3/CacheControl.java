package okhttp3;

import com.google.android.gms.common.api.f;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CacheControl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CacheControl {

    /* renamed from: n, reason: collision with root package name */
    public static final Companion f42175n = new Companion(0);

    /* renamed from: o, reason: collision with root package name */
    public static final CacheControl f42176o;

    /* renamed from: p, reason: collision with root package name */
    public static final CacheControl f42177p;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42178a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42180c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42181d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f42182e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f42183f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f42184g;

    /* renamed from: h, reason: collision with root package name */
    public final int f42185h;

    /* renamed from: i, reason: collision with root package name */
    public final int f42186i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f42187j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f42188l;

    /* renamed from: m, reason: collision with root package name */
    public String f42189m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f42190a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f42191b;

        /* renamed from: c, reason: collision with root package name */
        public int f42192c = -1;

        /* renamed from: d, reason: collision with root package name */
        public boolean f42193d;

        public final CacheControl a() {
            return new CacheControl(this.f42190a, this.f42191b, -1, -1, false, false, false, this.f42192c, -1, this.f42193d, false, false, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "<init>", "()V", "Lokhttp3/CacheControl;", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static okhttp3.CacheControl a(okhttp3.Headers r26) {
            /*
                Method dump skipped, instructions count: 484
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.a(okhttp3.Headers):okhttp3.CacheControl");
        }

        private Companion() {
        }
    }

    static {
        Builder builder = new Builder();
        builder.f42190a = true;
        f42176o = builder.a();
        Builder builder2 = new Builder();
        builder2.f42193d = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC3340k.e(timeUnit, "timeUnit");
        int i5 = f.API_PRIORITY_OTHER;
        long seconds = timeUnit.toSeconds(f.API_PRIORITY_OTHER);
        if (seconds <= 2147483647L) {
            i5 = (int) seconds;
        }
        builder2.f42192c = i5;
        f42177p = builder2.a();
    }

    public CacheControl(boolean z2, boolean z10, int i5, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f42178a = z2;
        this.f42179b = z10;
        this.f42180c = i5;
        this.f42181d = i10;
        this.f42182e = z11;
        this.f42183f = z12;
        this.f42184g = z13;
        this.f42185h = i11;
        this.f42186i = i12;
        this.f42187j = z14;
        this.k = z15;
        this.f42188l = z16;
        this.f42189m = str;
    }

    public final String toString() {
        String str = this.f42189m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f42178a) {
            sb2.append("no-cache, ");
        }
        if (this.f42179b) {
            sb2.append("no-store, ");
        }
        int i5 = this.f42180c;
        if (i5 != -1) {
            sb2.append("max-age=");
            sb2.append(i5);
            sb2.append(", ");
        }
        int i10 = this.f42181d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f42182e) {
            sb2.append("private, ");
        }
        if (this.f42183f) {
            sb2.append("public, ");
        }
        if (this.f42184g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f42185h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f42186i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f42187j) {
            sb2.append("only-if-cached, ");
        }
        if (this.k) {
            sb2.append("no-transform, ");
        }
        if (this.f42188l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f42189m = string;
        return string;
    }
}
