package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay extends com.waze.car_lib.m.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20602a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(String str) {
        super(null, null);
        h.g.b.x.f(str, "eventName");
        this.f20602a = str;
    }

    public final String a() {
        return this.f20602a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay) && h.g.b.x.n(this.f20602a, ((ay) obj).f20602a);
    }

    public final int hashCode() {
        return this.f20602a.hashCode();
    }

    public final String toString() {
        return "CalendarEvent(eventName=" + this.f20602a + ")";
    }
}
