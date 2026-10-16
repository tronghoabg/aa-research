package com.waze.main_screen.u;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.aa f27647a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27648b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f27649c;

    /* renamed from: d, reason: collision with root package name */
    private final b f27650d;

    public a(com.waze.av.b.aa aaVar, String str, Long l2, b bVar) {
        h.g.b.x.f(aaVar, "destinationPlace");
        h.g.b.x.f(bVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f27647a = aaVar;
        this.f27648b = str;
        this.f27649c = l2;
        this.f27650d = bVar;
    }

    public final b a() {
        return this.f27650d;
    }

    public final com.waze.av.b.aa b() {
        return this.f27647a;
    }

    public final Long c() {
        return this.f27649c;
    }

    public final String d() {
        return this.f27648b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f27647a, aVar.f27647a) && h.g.b.x.n(this.f27648b, aVar.f27648b) && h.g.b.x.n(this.f27649c, aVar.f27649c) && this.f27650d == aVar.f27650d;
    }

    public final int hashCode() {
        int iHashCode = this.f27647a.hashCode() * 31;
        String str = this.f27648b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f27649c;
        return ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.f27650d.hashCode();
    }

    public final String toString() {
        return "Result(destinationPlace=" + this.f27647a + ", eventId=" + this.f27648b + ", favoriteId=" + this.f27649c + ", type=" + this.f27650d + ")";
    }
}
