package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bf extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final int f29906a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f29907b;

    public bf(int i2, Long l2) {
        super(null);
        this.f29906a = i2;
        this.f29907b = l2;
    }

    public final int a() {
        return this.f29906a;
    }

    public final Long b() {
        return this.f29907b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return this.f29906a == bfVar.f29906a && h.g.b.x.n(this.f29907b, bfVar.f29907b);
    }

    public final int hashCode() {
        Long l2 = this.f29907b;
        return (this.f29906a * 31) + (l2 == null ? 0 : l2.hashCode());
    }

    public final String toString() {
        return "Hov(minPassengers=" + this.f29906a + ", hovLessVariant=" + this.f29907b + ")";
    }
}
