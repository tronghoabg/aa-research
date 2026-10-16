package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cc extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final int f21185a;

    /* JADX WARN: Illegal instructions before constructor call */
    public cc(int i2) {
        byte[] bArr = null;
        super(bArr, bArr);
        this.f21185a = i2;
    }

    public final int b() {
        return this.f21185a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc) && this.f21185a == ((cc) obj).f21185a;
    }

    public final int hashCode() {
        return this.f21185a;
    }

    public final String toString() {
        return "Resource(instructionResId=" + this.f21185a + ")";
    }
}
