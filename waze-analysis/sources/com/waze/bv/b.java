package com.waze.bv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f17491a;

    /* renamed from: b, reason: collision with root package name */
    private final a f17492b;

    public b(Integer num, a aVar) {
        this.f17491a = num;
        this.f17492b = aVar;
    }

    public static /* synthetic */ b c(b bVar, Integer num, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            num = bVar.f17491a;
        }
        if ((i2 & 2) != 0) {
            aVar = bVar.f17492b;
        }
        return new b(num, aVar);
    }

    public final a a() {
        return this.f17492b;
    }

    public final Integer b() {
        return this.f17491a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f17491a, bVar.f17491a) && h.g.b.x.n(this.f17492b, bVar.f17492b);
    }

    public final int hashCode() {
        Integer num = this.f17491a;
        int iHashCode = num == null ? 0 : num.hashCode();
        a aVar = this.f17492b;
        return (iHashCode * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(lastAllowedSpeedNoUnits=" + this.f17491a + ", lastAlert=" + this.f17492b + ")";
    }

    public b() {
        this(null);
    }

    public /* synthetic */ b(byte[] bArr) {
        this(null, null);
    }
}
