package U8;

import java.util.List;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public String f12405a;

    /* renamed from: b, reason: collision with root package name */
    public String f12406b;

    /* renamed from: c, reason: collision with root package name */
    public String f12407c;

    /* renamed from: d, reason: collision with root package name */
    public long f12408d;

    /* renamed from: e, reason: collision with root package name */
    public Long f12409e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12410f;

    /* renamed from: g, reason: collision with root package name */
    public L f12411g;

    /* renamed from: h, reason: collision with root package name */
    public C0879l0 f12412h;

    /* renamed from: i, reason: collision with root package name */
    public C0877k0 f12413i;

    /* renamed from: j, reason: collision with root package name */
    public O f12414j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public int f12415l;

    /* renamed from: m, reason: collision with root package name */
    public byte f12416m;

    public final K a() {
        String str;
        String str2;
        L l10;
        if (this.f12416m == 7 && (str = this.f12405a) != null && (str2 = this.f12406b) != null && (l10 = this.f12411g) != null) {
            return new K(str, str2, this.f12407c, this.f12408d, this.f12409e, this.f12410f, l10, this.f12412h, this.f12413i, this.f12414j, this.k, this.f12415l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12405a == null) {
            sb2.append(" generator");
        }
        if (this.f12406b == null) {
            sb2.append(" identifier");
        }
        if ((this.f12416m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f12416m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f12411g == null) {
            sb2.append(" app");
        }
        if ((this.f12416m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
