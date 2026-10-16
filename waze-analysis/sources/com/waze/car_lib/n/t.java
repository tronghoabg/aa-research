package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends v {

    /* renamed from: a, reason: collision with root package name */
    private final String f20436a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20437b;

    /* renamed from: c, reason: collision with root package name */
    private final s f20438c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, boolean z, s sVar, String str2) {
        super(null);
        h.g.b.x.f(str, "category");
        h.g.b.x.f(sVar, "source");
        h.g.b.x.f(str2, "searchId");
        this.f20436a = str;
        this.f20437b = z;
        this.f20438c = sVar;
        this.f20439d = str2;
    }

    public final s a() {
        return this.f20438c;
    }

    public final String b() {
        return this.f20436a;
    }

    @Override // com.waze.car_lib.n.v
    public final String c() {
        return this.f20439d;
    }

    public final boolean d() {
        return this.f20437b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f20436a, tVar.f20436a) && this.f20437b == tVar.f20437b && this.f20438c == tVar.f20438c && h.g.b.x.n(this.f20439d, tVar.f20439d);
    }

    public final int hashCode() {
        return (((((this.f20436a.hashCode() * 31) + a.a.a(this.f20437b)) * 31) + this.f20438c.hashCode()) * 31) + this.f20439d.hashCode();
    }

    public final String toString() {
        return "Category(category=" + this.f20436a + ", isGroup=" + this.f20437b + ", source=" + this.f20438c + ", searchId=" + this.f20439d + ")";
    }

    public /* synthetic */ t(String str, boolean z, s sVar) {
        this(str, z, sVar, com.waze.ad.c.b.u());
    }
}
