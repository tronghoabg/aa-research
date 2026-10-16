package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r extends com.waze.install.ah {

    /* renamed from: a, reason: collision with root package name */
    private final String f28365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(null);
        h.g.b.x.f(str, "adId");
        this.f28365a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && h.g.b.x.n(this.f28365a, ((r) obj).f28365a);
    }

    public final String f() {
        return this.f28365a;
    }

    public final int hashCode() {
        return this.f28365a.hashCode();
    }

    public final String toString() {
        return "AdClick(adId=" + this.f28365a + ")";
    }
}
