package com.waze.ev;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f23685a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23686b;

    /* renamed from: c, reason: collision with root package name */
    private final float f23687c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f23688d;

    public c(String str, int i2, float f2, Integer num) {
        x.f(str, "typeId");
        this.f23685a = str;
        this.f23686b = i2;
        this.f23687c = f2;
        this.f23688d = num;
    }

    public final float a() {
        return this.f23687c;
    }

    public final int b() {
        return this.f23686b;
    }

    public final Integer c() {
        return this.f23688d;
    }

    public final String d() {
        return this.f23685a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f23685a, cVar.f23685a) && this.f23686b == cVar.f23686b && Float.compare(this.f23687c, cVar.f23687c) == 0 && x.n(this.f23688d, cVar.f23688d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f23685a.hashCode() * 31) + this.f23686b) * 31) + Float.floatToIntBits(this.f23687c);
        Integer num = this.f23688d;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "EVConnectorOverview(typeId=" + this.f23685a + ", count=" + this.f23686b + ", maxPowerKW=" + this.f23687c + ", availableCount=" + this.f23688d + ")";
    }
}
