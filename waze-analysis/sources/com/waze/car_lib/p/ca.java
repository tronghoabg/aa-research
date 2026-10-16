package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    private final dg f20699a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20700b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f20701c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20702d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20703e;

    public ca(dg dgVar, h.g.a.a aVar, h.g.a.a aVar2, String str) {
        h.g.b.x.f(dgVar, "wazeMessageUiState");
        h.g.b.x.f(aVar, "firstActionClicked");
        h.g.b.x.f(aVar2, "secondActionClicked");
        this.f20699a = dgVar;
        this.f20700b = aVar;
        this.f20701c = aVar2;
        this.f20702d = str;
        this.f20703e = null;
    }

    public final dg a() {
        return this.f20699a;
    }

    public final String b() {
        return this.f20702d;
    }

    public final h.g.a.a c() {
        return this.f20700b;
    }

    public final h.g.a.a d() {
        return this.f20701c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        if (!h.g.b.x.n(this.f20699a, caVar.f20699a) || !h.g.b.x.n(this.f20700b, caVar.f20700b) || !h.g.b.x.n(this.f20701c, caVar.f20701c) || !h.g.b.x.n(this.f20702d, caVar.f20702d)) {
            return false;
        }
        String str = caVar.f20703e;
        return h.g.b.x.n(null, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.f20699a.hashCode() * 31) + this.f20700b.hashCode()) * 31) + this.f20701c.hashCode();
        String str = this.f20702d;
        return ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return "MessageUiState(wazeMessageUiState=" + this.f20699a + ", firstActionClicked=" + this.f20700b + ", secondActionClicked=" + this.f20701c + ", firstActionAnalytic=" + this.f20702d + ", secondActionAnalytic=null)";
    }
}
