package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class az extends com.waze.gas.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f27981a;

    public az(int i2) {
        super(null, null);
        this.f27981a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az) && this.f27981a == ((az) obj).f27981a;
    }

    public final int f() {
        return this.f27981a;
    }

    public final int hashCode() {
        return this.f27981a;
    }

    public final String toString() {
        return "ResId(res=" + this.f27981a + ")";
    }
}
