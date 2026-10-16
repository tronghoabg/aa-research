package com.waze.ui.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f41760a;

    public d(int i2) {
        this.f41760a = i2;
    }

    @Override // com.waze.ui.ac.e
    public final int a() {
        return this.f41760a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f41760a == ((d) obj).f41760a;
    }

    public final int hashCode() {
        return this.f41760a;
    }

    public final String toString() {
        return "T3(resId=" + this.f41760a + ")";
    }
}
