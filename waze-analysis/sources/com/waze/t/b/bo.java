package com.waze.t.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bo extends bs {

    /* renamed from: a, reason: collision with root package name */
    private final ah f40752a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(ah ahVar, String str) {
        super(null);
        h.g.b.x.f(ahVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f40752a = ahVar;
        this.f40753b = str;
    }

    public final ah a() {
        return this.f40752a;
    }

    public final String b() {
        return this.f40753b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return this.f40752a == boVar.f40752a && h.g.b.x.n(this.f40753b, boVar.f40753b);
    }

    public final int hashCode() {
        int iHashCode = this.f40752a.hashCode() * 31;
        String str = this.f40753b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Error(type=" + this.f40752a + ", errorMessage=" + this.f40753b + ")";
    }

    public /* synthetic */ bo(ah ahVar) {
        this(ahVar, null);
    }
}
