package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private final long f15947a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15948b;

    public e(long j2, long j3) {
        super(null);
        this.f15947a = j2;
        this.f15948b = j3;
    }

    @Override // com.waze.av.b.h
    public final long a() {
        return this.f15948b;
    }

    @Override // com.waze.av.b.h
    public final long b() {
        return this.f15947a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f15947a == eVar.f15947a && this.f15948b == eVar.f15948b;
    }

    public final int hashCode() {
        return (a.a.b(this.f15947a) * 31) + a.a.b(this.f15948b);
    }

    public final String toString() {
        return "Home(serverId=" + this.f15947a + ", id=" + this.f15948b + ")";
    }
}
