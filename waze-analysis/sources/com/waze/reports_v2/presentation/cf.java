package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cf extends cg {

    /* renamed from: a, reason: collision with root package name */
    private final int f34946a;

    public cf(int i2) {
        super(null);
        this.f34946a = i2;
    }

    public final int a() {
        return this.f34946a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf) && this.f34946a == ((cf) obj).f34946a;
    }

    public final int hashCode() {
        return this.f34946a;
    }

    public final String toString() {
        return "UpdateBottomSheetHeight(height=" + this.f34946a + ")";
    }
}
