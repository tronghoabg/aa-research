package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class by extends com.waze.z.a.d.ai {

    /* renamed from: a, reason: collision with root package name */
    private final int f28118a;

    /* JADX WARN: Illegal instructions before constructor call */
    public by(int i2) {
        byte[] bArr = null;
        super(bArr, bArr);
        this.f28118a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by) && this.f28118a == ((by) obj).f28118a;
    }

    public final int hashCode() {
        return this.f28118a;
    }

    public final String toString() {
        return "OnNavigationSegment(navigationSegmentIndex=" + this.f28118a + ")";
    }

    public final int w() {
        return this.f28118a;
    }
}
