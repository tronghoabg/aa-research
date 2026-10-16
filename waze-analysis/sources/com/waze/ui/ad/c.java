package com.waze.ui.ad;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f41780a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41781b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f41782c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f41783d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f41784e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f41785f;

    public c(String str, String str2, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4) {
        x.f(aVar, "onHomeClick");
        x.f(aVar2, "onWorkClick");
        x.f(aVar3, "onSkipClick");
        x.f(aVar4, "onDoneClick");
        this.f41780a = str;
        this.f41781b = str2;
        this.f41782c = aVar;
        this.f41783d = aVar2;
        this.f41784e = aVar3;
        this.f41785f = aVar4;
    }

    public final String a() {
        return this.f41780a;
    }

    public final String b() {
        return this.f41781b;
    }

    public final h.g.a.a c() {
        return this.f41785f;
    }

    public final h.g.a.a d() {
        return this.f41782c;
    }

    public final h.g.a.a e() {
        return this.f41784e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f41780a, cVar.f41780a) && x.n(this.f41781b, cVar.f41781b) && x.n(this.f41782c, cVar.f41782c) && x.n(this.f41783d, cVar.f41783d) && x.n(this.f41784e, cVar.f41784e) && x.n(this.f41785f, cVar.f41785f);
    }

    public final h.g.a.a f() {
        return this.f41783d;
    }

    public final int hashCode() {
        String str = this.f41780a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f41781b;
        return (((((((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f41782c.hashCode()) * 31) + this.f41783d.hashCode()) * 31) + this.f41784e.hashCode()) * 31) + this.f41785f.hashCode();
    }

    public final String toString() {
        return "AddHomeAndWorkOnboardingScreenState(home=" + this.f41780a + ", work=" + this.f41781b + ", onHomeClick=" + this.f41782c + ", onWorkClick=" + this.f41783d + ", onSkipClick=" + this.f41784e + ", onDoneClick=" + this.f41785f + ")";
    }
}
