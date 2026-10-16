package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hh extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f19654a;

    public hh(Integer num) {
        super(null);
        this.f19654a = num;
    }

    public final Integer a() {
        return this.f19654a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh) && h.g.b.x.n(this.f19654a, ((hh) obj).f19654a);
    }

    public final int hashCode() {
        Integer num = this.f19654a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Exit(toastText=" + this.f19654a + ")";
    }
}
