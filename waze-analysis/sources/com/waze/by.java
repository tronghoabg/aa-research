package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class by {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18200a;

    /* renamed from: b, reason: collision with root package name */
    private final o f18201b;

    public by(boolean z, o oVar) {
        this.f18200a = z;
        this.f18201b = oVar;
    }

    public final o a() {
        return this.f18201b;
    }

    public final boolean b() {
        return this.f18200a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by)) {
            return false;
        }
        by byVar = (by) obj;
        return this.f18200a == byVar.f18200a && this.f18201b == byVar.f18201b;
    }

    public final int hashCode() {
        o oVar = this.f18201b;
        return (a.a.a(this.f18200a) * 31) + (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        return "DynamicSplashConfiguration(shouldShow=" + this.f18200a + ", frequency=" + this.f18201b + ")";
    }
}
