package U8;

import java.util.List;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f12377a;

    /* renamed from: b, reason: collision with root package name */
    public String f12378b;

    /* renamed from: c, reason: collision with root package name */
    public int f12379c;

    /* renamed from: d, reason: collision with root package name */
    public int f12380d;

    /* renamed from: e, reason: collision with root package name */
    public long f12381e;

    /* renamed from: f, reason: collision with root package name */
    public long f12382f;

    /* renamed from: g, reason: collision with root package name */
    public long f12383g;

    /* renamed from: h, reason: collision with root package name */
    public String f12384h;

    /* renamed from: i, reason: collision with root package name */
    public List f12385i;

    /* renamed from: j, reason: collision with root package name */
    public byte f12386j;

    public final E a() {
        String str;
        if (this.f12386j == 63 && (str = this.f12378b) != null) {
            return new E(this.f12377a, str, this.f12379c, this.f12380d, this.f12381e, this.f12382f, this.f12383g, this.f12384h, this.f12385i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f12386j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f12378b == null) {
            sb2.append(" processName");
        }
        if ((this.f12386j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f12386j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f12386j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f12386j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f12386j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
