package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ix implements iz {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f40266a;

    public ix(Integer num) {
        this.f40266a = num;
    }

    public final Integer a() {
        return this.f40266a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix) && h.g.b.x.n(this.f40266a, ((ix) obj).f40266a);
    }

    public final int hashCode() {
        return this.f40266a.hashCode();
    }

    public final String toString() {
        return "Failure(failureReason=" + this.f40266a + ")";
    }
}
