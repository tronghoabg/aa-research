package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    private final String f20440a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, String str2) {
        super(null);
        h.g.b.x.f(str, "searchTerm");
        h.g.b.x.f(str2, "searchId");
        this.f20440a = str;
        this.f20441b = str2;
    }

    public final String a() {
        return this.f20440a;
    }

    @Override // com.waze.car_lib.n.v
    public final String c() {
        return this.f20441b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f20440a, uVar.f20440a) && h.g.b.x.n(this.f20441b, uVar.f20441b);
    }

    public final int hashCode() {
        return (this.f20440a.hashCode() * 31) + this.f20441b.hashCode();
    }

    public final String toString() {
        return "Text(searchTerm=" + this.f20440a + ", searchId=" + this.f20441b + ")";
    }
}
