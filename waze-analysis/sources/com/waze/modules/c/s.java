package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s extends com.waze.gas.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f30191a;

    public s(int i2) {
        super(null, null);
        this.f30191a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f30191a == ((s) obj).f30191a;
    }

    public final int f() {
        return this.f30191a;
    }

    public final int hashCode() {
        return this.f30191a;
    }

    public final String toString() {
        return "RoundaboutEnter(exitNumber=" + this.f30191a + ")";
    }
}
