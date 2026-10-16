package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dt extends com.waze.destination_cell.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final int f28223a;

    public dt(int i2) {
        super(null);
        this.f28223a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt) && this.f28223a == ((dt) obj).f28223a;
    }

    public final int h() {
        return this.f28223a;
    }

    public final int hashCode() {
        return this.f28223a;
    }

    public final String toString() {
        return "Middle(yOffsetPx=" + this.f28223a + ")";
    }

    public dt() {
        this((byte[]) null);
    }

    public /* synthetic */ dt(byte[] bArr) {
        this(0);
    }
}
