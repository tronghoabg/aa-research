package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class en implements er {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23662a;

    public en(boolean z) {
        this.f23662a = z;
    }

    public final boolean a() {
        return this.f23662a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en) && this.f23662a == ((en) obj).f23662a;
    }

    public final int hashCode() {
        return a.a.a(this.f23662a);
    }

    public final String toString() {
        return "ForceUpgrade(isProjected=" + this.f23662a + ")";
    }
}
