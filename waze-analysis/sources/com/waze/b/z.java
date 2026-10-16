package com.waze.b;

import com.waze.sharedui.profile.AgeRestrictionMode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final AgeRestrictionMode f16181a;

    public z(AgeRestrictionMode ageRestrictionMode) {
        h.g.b.x.f(ageRestrictionMode, "restrictionMode");
        this.f16181a = ageRestrictionMode;
    }

    public final AgeRestrictionMode a() {
        return this.f16181a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f16181a == ((z) obj).f16181a;
    }

    public final int hashCode() {
        return this.f16181a.hashCode();
    }

    public final String toString() {
        return "U18RestrictionData(restrictionMode=" + this.f16181a + ")";
    }
}
