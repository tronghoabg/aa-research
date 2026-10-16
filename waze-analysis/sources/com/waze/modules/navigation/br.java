package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class br extends com.waze.av.d.t {

    /* renamed from: a, reason: collision with root package name */
    private final ao f30416a;

    public br(ao aoVar) {
        h.g.b.x.f(aoVar, "params");
        this.f30416a = aoVar;
    }

    @Override // com.waze.av.d.t
    public final ao e() {
        return this.f30416a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br) && h.g.b.x.n(this.f30416a, ((br) obj).f30416a);
    }

    public final int hashCode() {
        return this.f30416a.hashCode();
    }

    public final String toString() {
        return "Immediate(params=" + this.f30416a + ")";
    }
}
