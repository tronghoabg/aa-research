package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bl extends bo {

    /* renamed from: a, reason: collision with root package name */
    private final al f30409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(al alVar) {
        super(null);
        h.g.b.x.f(alVar, "reason");
        this.f30409a = alVar;
    }

    public final al a() {
        return this.f30409a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl) && this.f30409a == ((bl) obj).f30409a;
    }

    public final int hashCode() {
        return this.f30409a.hashCode();
    }

    public final String toString() {
        return "Finish(reason=" + this.f30409a + ")";
    }
}
