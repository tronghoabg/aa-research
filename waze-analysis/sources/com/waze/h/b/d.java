package com.waze.h.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends com.waze.i.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f24321a;

    public d(int i2) {
        super(null);
        this.f24321a = i2;
    }

    public final int a() {
        return this.f24321a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f24321a == ((d) obj).f24321a;
    }

    public final int hashCode() {
        return this.f24321a;
    }

    public final String toString() {
        return "Success(bytesRead=" + this.f24321a + ")";
    }
}
