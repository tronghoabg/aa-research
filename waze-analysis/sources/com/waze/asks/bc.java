package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bc extends bd {

    /* renamed from: a, reason: collision with root package name */
    private final int f15560a;

    public bc(int i2) {
        super(null);
        this.f15560a = i2;
    }

    public final int a() {
        return this.f15560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc) && this.f15560a == ((bc) obj).f15560a;
    }

    public final int hashCode() {
        return this.f15560a;
    }

    public final String toString() {
        return "UpdateBottomSheetHeight(heightPx=" + this.f15560a + ")";
    }
}
