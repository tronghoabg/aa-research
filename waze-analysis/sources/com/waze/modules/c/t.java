package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t extends com.waze.gas.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f30192a;

    public t(int i2) {
        super(null, null);
        this.f30192a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f30192a == ((t) obj).f30192a;
    }

    public final int hashCode() {
        return this.f30192a;
    }

    public final String toString() {
        return "RoundaboutExit(exitNumber=" + this.f30192a + ")";
    }
}
