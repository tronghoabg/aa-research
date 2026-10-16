package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final ak f20545a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20546b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f20547c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f20548d;

    public aj(ak akVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        h.g.b.x.f(akVar, "state");
        h.g.b.x.f(aVar, "firstActionClicked");
        h.g.b.x.f(aVar2, "secondActionClicked");
        h.g.b.x.f(aVar3, "onDismiss");
        this.f20545a = akVar;
        this.f20546b = aVar;
        this.f20547c = aVar2;
        this.f20548d = aVar3;
    }

    public final ak a() {
        return this.f20545a;
    }

    public final h.g.a.a b() {
        return this.f20546b;
    }

    public final h.g.a.a c() {
        return this.f20548d;
    }

    public final h.g.a.a d() {
        return this.f20547c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return h.g.b.x.n(this.f20545a, ajVar.f20545a) && h.g.b.x.n(this.f20546b, ajVar.f20546b) && h.g.b.x.n(this.f20547c, ajVar.f20547c) && h.g.b.x.n(this.f20548d, ajVar.f20548d);
    }

    public final int hashCode() {
        return (((((this.f20545a.hashCode() * 31) + this.f20546b.hashCode()) * 31) + this.f20547c.hashCode()) * 31) + this.f20548d.hashCode();
    }

    public final String toString() {
        return "PopupUiState(state=" + this.f20545a + ", firstActionClicked=" + this.f20546b + ", secondActionClicked=" + this.f20547c + ", onDismiss=" + this.f20548d + ")";
    }
}
