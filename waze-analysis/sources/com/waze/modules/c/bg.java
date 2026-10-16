package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bg extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final String f29908a;

    public bg(String str) {
        super(null);
        this.f29908a = str;
    }

    public final String a() {
        return this.f29908a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg) && h.g.b.x.n(this.f29908a, ((bg) obj).f29908a);
    }

    public final int hashCode() {
        String str = this.f29908a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "LicensePlateRestriction(area=" + this.f29908a + ")";
    }
}
