package com.waze.ui.u;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final ah f43439a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f43440b;

    /* renamed from: c, reason: collision with root package name */
    private final ag f43441c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43442d;

    /* renamed from: e, reason: collision with root package name */
    private final h.o.a f43443e;

    /* renamed from: f, reason: collision with root package name */
    private final af f43444f;

    /* renamed from: g, reason: collision with root package name */
    private final ae f43445g;

    private aj(ah ahVar, ad adVar, ag agVar, String str, h.o.a aVar, af afVar, ae aeVar) {
        h.g.b.x.f(ahVar, "destination");
        h.g.b.x.f(adVar, "source");
        h.g.b.x.f(agVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f43439a = ahVar;
        this.f43440b = adVar;
        this.f43441c = agVar;
        this.f43442d = str;
        this.f43443e = aVar;
        this.f43444f = afVar;
        this.f43445g = aeVar;
    }

    public static /* synthetic */ aj h(aj ajVar, String str, h.o.a aVar, af afVar, int i2) {
        ah ahVar = (i2 & 1) != 0 ? ajVar.f43439a : null;
        ad adVar = (i2 & 2) != 0 ? ajVar.f43440b : null;
        ag agVar = (i2 & 4) != 0 ? ajVar.f43441c : null;
        if ((i2 & 8) != 0) {
            str = ajVar.f43442d;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            aVar = ajVar.f43443e;
        }
        h.o.a aVar2 = aVar;
        if ((i2 & 32) != 0) {
            afVar = ajVar.f43444f;
        }
        af afVar2 = afVar;
        ae aeVar = (i2 & 64) != 0 ? ajVar.f43445g : null;
        h.g.b.x.f(ahVar, "destination");
        h.g.b.x.f(adVar, "source");
        h.g.b.x.f(agVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return new aj(ahVar, adVar, agVar, str2, aVar2, afVar2, aeVar);
    }

    public final ad a() {
        return this.f43440b;
    }

    public final ae b() {
        return this.f43445g;
    }

    public final af c() {
        return this.f43444f;
    }

    public final ag d() {
        return this.f43441c;
    }

    public final ah e() {
        return this.f43439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return h.g.b.x.n(this.f43439a, ajVar.f43439a) && h.g.b.x.n(this.f43440b, ajVar.f43440b) && this.f43441c == ajVar.f43441c && h.g.b.x.n(this.f43442d, ajVar.f43442d) && h.g.b.x.n(this.f43443e, ajVar.f43443e) && this.f43444f == ajVar.f43444f && h.g.b.x.n(this.f43445g, ajVar.f43445g);
    }

    public final String f() {
        return this.f43442d;
    }

    public final h.o.a g() {
        return this.f43443e;
    }

    public final int hashCode() {
        int iHashCode = (((this.f43439a.hashCode() * 31) + this.f43440b.hashCode()) * 31) + this.f43441c.hashCode();
        String str = this.f43442d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        h.o.a aVar = this.f43443e;
        int iB = (iHashCode2 + (aVar == null ? 0 : a.a.b(aVar.w()))) * 31;
        af afVar = this.f43444f;
        int iHashCode3 = (iB + (afVar == null ? 0 : afVar.hashCode())) * 31;
        ae aeVar = this.f43445g;
        return iHashCode3 + (aeVar != null ? aeVar.hashCode() : 0);
    }

    public final String toString() {
        return "PredictionState(destination=" + this.f43439a + ", source=" + this.f43440b + ", type=" + this.f43441c + ", etaString=" + this.f43442d + ", duration=" + this.f43443e + ", trafficInfo=" + this.f43444f + ", timer=" + this.f43445g + ")";
    }

    public /* synthetic */ aj(ah ahVar, ad adVar, ag agVar, ae aeVar) {
        this(ahVar, adVar, agVar, null, null, null, aeVar);
    }
}
