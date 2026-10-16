package com.waze;

/* compiled from: WazeSource */
/* renamed from: com.waze.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo {

    /* renamed from: a, reason: collision with root package name */
    private static final Cdo f23571a = new Cdo(false);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23572b;

    public Cdo(boolean z) {
        this.f23572b = z;
    }

    public final boolean b() {
        return this.f23572b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cdo) && this.f23572b == ((Cdo) obj).f23572b;
    }

    public final int hashCode() {
        return a.a.a(this.f23572b);
    }

    public final String toString() {
        return "State(isSignedIn=" + this.f23572b + ")";
    }
}
