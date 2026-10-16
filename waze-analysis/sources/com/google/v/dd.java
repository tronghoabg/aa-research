package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dd {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12838a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12839b;

    dd(Object obj, int i2) {
        this.f12838a = obj;
        this.f12839b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return this.f12838a == ddVar.f12838a && this.f12839b == ddVar.f12839b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f12838a) * 65535) + this.f12839b;
    }
}
