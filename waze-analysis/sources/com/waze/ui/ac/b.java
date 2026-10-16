package com.waze.ui.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f41758a;

    public b(int i2) {
        this.f41758a = i2;
    }

    @Override // com.waze.ui.ac.e
    public final int a() {
        return this.f41758a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f41758a == ((b) obj).f41758a;
    }

    public final int hashCode() {
        return this.f41758a;
    }

    public final String toString() {
        return "T1(resId=" + this.f41758a + ")";
    }
}
