package com.waze.b;

import com.waze.sharedui.profile.AgeRestrictionMode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f16143a;

    /* renamed from: b, reason: collision with root package name */
    private final AgeRestrictionMode f16144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.waze.shared_infra.q.i iVar, AgeRestrictionMode ageRestrictionMode) {
        super(null);
        h.g.b.x.f(iVar, "userBirthDate");
        h.g.b.x.f(ageRestrictionMode, "aadcRestrictionData");
        this.f16143a = iVar;
        this.f16144b = ageRestrictionMode;
    }

    public final com.waze.shared_infra.q.i a() {
        return this.f16143a;
    }

    public final AgeRestrictionMode b() {
        return this.f16144b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f16143a, iVar.f16143a) && this.f16144b == iVar.f16144b;
    }

    public final int hashCode() {
        return (this.f16143a.hashCode() * 31) + this.f16144b.hashCode();
    }

    public final String toString() {
        return "Provided(userBirthDate=" + this.f16143a + ", aadcRestrictionData=" + this.f16144b + ")";
    }
}
