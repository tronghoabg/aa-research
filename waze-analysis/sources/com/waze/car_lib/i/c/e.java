package com.waze.car_lib.i.c;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final String f20093a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f20094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, Integer num) {
        super(null);
        h.g.b.x.f(str, "text");
        this.f20093a = str;
        this.f20094b = num;
    }

    public final Integer a() {
        return this.f20094b;
    }

    public final String b() {
        return this.f20093a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.g.b.x.n(this.f20093a, eVar.f20093a) && h.g.b.x.n(this.f20094b, eVar.f20094b);
    }

    public final int hashCode() {
        int iHashCode = this.f20093a.hashCode() * 31;
        Integer num = this.f20094b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Insight(text=" + this.f20093a + ", icon=" + this.f20094b + ")";
    }
}
