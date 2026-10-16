package com.waze.ui.o;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends t {

    /* renamed from: a, reason: collision with root package name */
    private final c f43152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super(null);
        h.g.b.x.f(cVar, "bannerModel");
        this.f43152a = cVar;
    }

    public final c a() {
        return this.f43152a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f43152a, ((i) obj).f43152a);
    }

    public final int hashCode() {
        return this.f43152a.hashCode();
    }

    public final String toString() {
        return "BannerShown(bannerModel=" + this.f43152a + ")";
    }
}
