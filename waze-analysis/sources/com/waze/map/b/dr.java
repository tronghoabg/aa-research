package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dr extends com.waze.destination_cell.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final int f28221a;

    public dr(int i2) {
        super(null);
        this.f28221a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr) && this.f28221a == ((dr) obj).f28221a;
    }

    public final int h() {
        return this.f28221a;
    }

    public final int hashCode() {
        return this.f28221a;
    }

    public final String toString() {
        return "Bottom(bottomPaddingPx=" + this.f28221a + ")";
    }
}
