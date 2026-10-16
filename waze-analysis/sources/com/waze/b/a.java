package com.waze.b;

import com.waze.sharedui.profile.AgeRestrictionMode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f16136a;

    /* renamed from: b, reason: collision with root package name */
    private final AgeRestrictionMode f16137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.waze.shared_infra.q.i iVar, AgeRestrictionMode ageRestrictionMode) {
        super(null);
        h.g.b.x.f(iVar, "birthDate");
        h.g.b.x.f(ageRestrictionMode, "restrictionMode");
        this.f16136a = iVar;
        this.f16137b = ageRestrictionMode;
    }

    public final com.waze.shared_infra.q.i a() {
        return this.f16136a;
    }

    public final AgeRestrictionMode b() {
        return this.f16137b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f16136a, aVar.f16136a) && this.f16137b == aVar.f16137b;
    }

    public final int hashCode() {
        return (this.f16136a.hashCode() * 31) + this.f16137b.hashCode();
    }

    public final String toString() {
        return "AgeReceived(birthDate=" + this.f16136a + ", restrictionMode=" + this.f16137b + ")";
    }
}
