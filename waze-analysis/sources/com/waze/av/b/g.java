package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    private final long f15953a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15954b;

    public g(long j2, long j3) {
        super(null);
        this.f15953a = j2;
        this.f15954b = j3;
    }

    @Override // com.waze.av.b.h
    public final long a() {
        return this.f15954b;
    }

    @Override // com.waze.av.b.h
    public final long b() {
        return this.f15953a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f15953a == gVar.f15953a && this.f15954b == gVar.f15954b;
    }

    public final int hashCode() {
        return (a.a.b(this.f15953a) * 31) + a.a.b(this.f15954b);
    }

    public final String toString() {
        return "Work(serverId=" + this.f15953a + ", id=" + this.f15954b + ")";
    }
}
