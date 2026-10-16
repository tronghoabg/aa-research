package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    private final h f43013a;

    /* renamed from: b, reason: collision with root package name */
    private final h f43014b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, h hVar2, boolean z) {
        super(null);
        h.g.b.x.f(hVar, "secondary");
        h.g.b.x.f(hVar2, "primary");
        this.f43013a = hVar;
        this.f43014b = hVar2;
        this.f43015c = z;
    }

    public final h a() {
        return this.f43014b;
    }

    public final h b() {
        return this.f43013a;
    }

    public final boolean c() {
        return this.f43015c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f43013a, iVar.f43013a) && h.g.b.x.n(this.f43014b, iVar.f43014b) && this.f43015c == iVar.f43015c;
    }

    public final int hashCode() {
        return (((this.f43013a.hashCode() * 31) + this.f43014b.hashCode()) * 31) + a.a.a(this.f43015c);
    }

    public final String toString() {
        return "Double(secondary=" + this.f43013a + ", primary=" + this.f43014b + ", balanced=" + this.f43015c + ")";
    }

    public /* synthetic */ i(h hVar, h hVar2) {
        this(hVar, hVar2, false);
    }
}
