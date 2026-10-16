package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bw extends by {

    /* renamed from: a, reason: collision with root package name */
    private final String f29930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(String str) {
        super(null);
        h.g.b.x.f(str, "roadName");
        this.f29930a = str;
    }

    public final String a() {
        return this.f29930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw) && h.g.b.x.n(this.f29930a, ((bw) obj).f29930a);
    }

    public final int hashCode() {
        return this.f29930a.hashCode();
    }

    public final String toString() {
        return "PriceChangeByTime(roadName=" + this.f29930a + ")";
    }
}
