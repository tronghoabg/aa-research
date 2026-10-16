package com.waze.ui.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f41759a;

    public c(int i2) {
        this.f41759a = i2;
    }

    @Override // com.waze.ui.ac.e
    public final int a() {
        return this.f41759a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f41759a == ((c) obj).f41759a;
    }

    public final int hashCode() {
        return this.f41759a;
    }

    public final String toString() {
        return "T2(resId=" + this.f41759a + ")";
    }
}
