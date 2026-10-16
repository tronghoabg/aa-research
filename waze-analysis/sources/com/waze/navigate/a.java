package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30928a;

    public a(boolean z) {
        this.f30928a = z;
    }

    public final boolean a() {
        return this.f30928a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f30928a == ((a) obj).f30928a;
    }

    public final int hashCode() {
        return a.a.a(this.f30928a);
    }

    public final String toString() {
        return "ActiveNavigationBeaconInfoState(hasBeacons=" + this.f30928a + ")";
    }
}
