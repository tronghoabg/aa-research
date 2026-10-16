package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final float f45741a;

    public e(float f2) {
        this.f45741a = f2;
    }

    @Override // com.waze.z.a.b.h
    public final float a() {
        return this.f45741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f45741a, ((e) obj).f45741a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f45741a);
    }

    public final String toString() {
        return "Custom(percentage=" + this.f45741a + ")";
    }
}
