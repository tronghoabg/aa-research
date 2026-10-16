package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    private final long f15635a;

    public s(long j2) {
        super(null);
        this.f15635a = j2;
    }

    public final long a() {
        return this.f15635a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f15635a == ((s) obj).f15635a;
    }

    public final int hashCode() {
        return a.a.b(this.f15635a);
    }

    public final String toString() {
        return "Success(receivedPoints=" + this.f15635a + ")";
    }
}
