package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gx extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f19638a;

    public gx(Integer num) {
        super(null);
        this.f19638a = num;
    }

    public final Integer a() {
        return this.f19638a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx) && h.g.b.x.n(this.f19638a, ((gx) obj).f19638a);
    }

    public final int hashCode() {
        Integer num = this.f19638a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Exit(toastRes=" + this.f19638a + ")";
    }
}
