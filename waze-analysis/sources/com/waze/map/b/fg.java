package com.waze.map.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fg {

    /* renamed from: a, reason: collision with root package name */
    private final List f28330a;

    /* renamed from: b, reason: collision with root package name */
    private final fh f28331b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28332c;

    public fg(List list, fh fhVar, String str) {
        h.g.b.x.f(list, "positions");
        h.g.b.x.f(fhVar, "style");
        this.f28330a = list;
        this.f28331b = fhVar;
        this.f28332c = str;
    }

    public final fh a() {
        return this.f28331b;
    }

    public final String b() {
        return this.f28332c;
    }

    public final List c() {
        return this.f28330a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        return h.g.b.x.n(this.f28330a, fgVar.f28330a) && this.f28331b == fgVar.f28331b && h.g.b.x.n(this.f28332c, fgVar.f28332c);
    }

    public final int hashCode() {
        int iHashCode = (this.f28330a.hashCode() * 31) + this.f28331b.hashCode();
        String str = this.f28332c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PolygonData(positions=" + this.f28330a + ", style=" + this.f28331b + ", displayLabel=" + this.f28332c + ")";
    }
}
