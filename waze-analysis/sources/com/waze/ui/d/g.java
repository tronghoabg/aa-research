package com.waze.ui.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends k {

    /* renamed from: a, reason: collision with root package name */
    private final int f42144a;

    public g(int i2) {
        super(null);
        this.f42144a = i2;
    }

    public final int a() {
        return this.f42144a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f42144a == ((g) obj).f42144a;
    }

    public final int hashCode() {
        return this.f42144a;
    }

    public final String toString() {
        return "BottomSheetPositionChanged(heightPx=" + this.f42144a + ")";
    }
}
