package com.waze.reports_v2.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.bg.a.de;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class au {

    /* renamed from: a, reason: collision with root package name */
    private final de f34085a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bg.d.f f34086b;

    public au(de deVar, com.waze.bg.d.f fVar) {
        h.g.b.x.f(deVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(fVar, "direction");
        this.f34085a = deVar;
        this.f34086b = fVar;
    }

    public final de a() {
        return this.f34085a;
    }

    public final com.waze.bg.d.f b() {
        return this.f34086b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return h.g.b.x.n(this.f34085a, auVar.f34085a) && this.f34086b == auVar.f34086b;
    }

    public final int hashCode() {
        return (this.f34085a.hashCode() * 31) + this.f34086b.hashCode();
    }

    public final String toString() {
        return "ReportTypeWithDirection(type=" + this.f34085a + ", direction=" + this.f34086b + ")";
    }

    public /* synthetic */ au(de deVar) {
        this(deVar, com.waze.bg.d.f.FORWARDS);
    }
}
