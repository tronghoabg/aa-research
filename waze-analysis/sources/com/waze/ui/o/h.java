package com.waze.ui.o;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends t {

    /* renamed from: a, reason: collision with root package name */
    private final c f43151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar) {
        super(null);
        h.g.b.x.f(cVar, "bannerModel");
        this.f43151a = cVar;
    }

    public final c a() {
        return this.f43151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f43151a, ((h) obj).f43151a);
    }

    public final int hashCode() {
        return this.f43151a.hashCode();
    }

    public final String toString() {
        return "BannerClicked(bannerModel=" + this.f43151a + ")";
    }
}
