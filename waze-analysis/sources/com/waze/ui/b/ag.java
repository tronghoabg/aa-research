package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends aq {

    /* renamed from: a, reason: collision with root package name */
    private final int f42004a;

    public ag(int i2) {
        super(null);
        this.f42004a = i2;
    }

    public final int a() {
        return this.f42004a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && this.f42004a == ((ag) obj).f42004a;
    }

    public final int hashCode() {
        return this.f42004a;
    }

    public final String toString() {
        return "Hov(minPassengers=" + this.f42004a + ")";
    }
}
