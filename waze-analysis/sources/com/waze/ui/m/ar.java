package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar extends cb {

    /* renamed from: a, reason: collision with root package name */
    private final String f42795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(String str) {
        super(null);
        h.g.b.x.f(str, "reservationUri");
        this.f42795a = str;
    }

    public final String a() {
        return this.f42795a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar) && h.g.b.x.n(this.f42795a, ((ar) obj).f42795a);
    }

    public final int hashCode() {
        return this.f42795a.hashCode();
    }

    public final String toString() {
        return "BookParkingPressed(reservationUri=" + this.f42795a + ")";
    }
}
