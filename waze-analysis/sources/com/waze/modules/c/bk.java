package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final String f29912a;

    public bk(String str) {
        super(null);
        this.f29912a = str;
    }

    public final String a() {
        return this.f29912a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk) && h.g.b.x.n(this.f29912a, ((bk) obj).f29912a);
    }

    public final int hashCode() {
        String str = this.f29912a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "RestrictedArea(area=" + this.f29912a + ")";
    }
}
