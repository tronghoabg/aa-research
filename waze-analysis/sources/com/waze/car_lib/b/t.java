package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends v {

    /* renamed from: a, reason: collision with root package name */
    private final int f19139a;

    public t(int i2) {
        super((byte[]) null);
        this.f19139a = i2;
    }

    public final int a() {
        return this.f19139a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f19139a == ((t) obj).f19139a;
    }

    public final int hashCode() {
        return this.f19139a;
    }

    public final String toString() {
        return "ButtonClicked(index=" + this.f19139a + ")";
    }
}
