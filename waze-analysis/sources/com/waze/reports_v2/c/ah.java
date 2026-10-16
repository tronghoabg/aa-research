package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends al {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34183a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34184b;

    public ah(boolean z, boolean z2) {
        super(null);
        this.f34183a = z;
        this.f34184b = z2;
    }

    public final boolean a() {
        return this.f34184b;
    }

    public final boolean b() {
        return this.f34183a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return this.f34183a == ahVar.f34183a && this.f34184b == ahVar.f34184b;
    }

    public final int hashCode() {
        return (a.a.a(this.f34183a) * 31) + a.a.a(this.f34184b);
    }

    public final String toString() {
        return "DialogShowing(userDeclinedPermissions=" + this.f34183a + ", disclaimerNeeded=" + this.f34184b + ")";
    }
}
