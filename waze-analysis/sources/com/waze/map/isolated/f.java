package com.waze.map.isolated;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    private final e f29230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(null);
        h.g.b.x.f(eVar, "ad");
        this.f29230a = eVar;
    }

    public final e a() {
        return this.f29230a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.g.b.x.n(this.f29230a, ((f) obj).f29230a);
    }

    public final int hashCode() {
        return this.f29230a.hashCode();
    }

    public final String toString() {
        return "AdObjectTapped(ad=" + this.f29230a + ")";
    }
}
