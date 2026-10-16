package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends y {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f40427a;

    public x(Integer num) {
        super(null);
        this.f40427a = num;
    }

    public final Integer a() {
        return this.f40427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && h.g.b.x.n(this.f40427a, ((x) obj).f40427a);
    }

    public final int hashCode() {
        Integer num = this.f40427a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Error(errorCode=" + this.f40427a + ")";
    }
}
