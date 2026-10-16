package okhttp3;

import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f55936a = new d().a().c();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55937b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f55938c;

    /* renamed from: d, reason: collision with root package name */
    private final int f55939d;

    /* renamed from: e, reason: collision with root package name */
    private final int f55940e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f55941f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f55942g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f55943h;

    /* renamed from: i, reason: collision with root package name */
    private final int f55944i;

    /* renamed from: j, reason: collision with root package name */
    private final int f55945j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f55946k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f55947l;
    private final boolean m;
    private String n;

    static {
        new d().b().d(TimeUnit.SECONDS).c();
    }

    public /* synthetic */ e(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.f55937b = z;
        this.f55938c = z2;
        this.f55939d = i2;
        this.f55940e = i3;
        this.f55941f = z3;
        this.f55942g = z4;
        this.f55943h = z5;
        this.f55944i = i4;
        this.f55945j = i5;
        this.f55946k = z6;
        this.f55947l = z7;
        this.m = z8;
        this.n = str;
    }

    public final boolean a() {
        return this.f55946k;
    }

    public final String toString() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f55937b) {
            sb.append("no-cache, ");
        }
        if (this.f55938c) {
            sb.append("no-store, ");
        }
        int i2 = this.f55939d;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.f55940e;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.f55941f) {
            sb.append("private, ");
        }
        if (this.f55942g) {
            sb.append("public, ");
        }
        if (this.f55943h) {
            sb.append("must-revalidate, ");
        }
        int i4 = this.f55944i;
        if (i4 != -1) {
            sb.append("max-stale=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f55945j;
        if (i5 != -1) {
            sb.append("min-fresh=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f55946k) {
            sb.append("only-if-cached, ");
        }
        if (this.f55947l) {
            sb.append("no-transform, ");
        }
        if (this.m) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.n = string;
        return string;
    }
}
