package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class br extends by {

    /* renamed from: a, reason: collision with root package name */
    private final double f29919a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(double d2, String str) {
        super(null);
        h.g.b.x.f(str, "currency");
        this.f29919a = d2;
        this.f29920b = str;
    }

    public final double a() {
        return this.f29919a;
    }

    public final String b() {
        return this.f29920b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        br brVar = (br) obj;
        return Double.compare(this.f29919a, brVar.f29919a) == 0 && h.g.b.x.n(this.f29920b, brVar.f29920b);
    }

    public final int hashCode() {
        return (a.a.e(this.f29919a) * 31) + this.f29920b.hashCode();
    }

    public final String toString() {
        return "FixedPrice(price=" + this.f29919a + ", currency=" + this.f29920b + ")";
    }
}
