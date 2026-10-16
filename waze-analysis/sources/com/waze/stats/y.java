package com.waze.stats;

import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.n.r f40619a;

    /* renamed from: b, reason: collision with root package name */
    private final gc f40620b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40621c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.n.i f40622d;

    public y(com.waze.n.r rVar, gc gcVar, String str, com.waze.n.i iVar) {
        h.g.b.x.f(gcVar, "requestClientTimestamp");
        h.g.b.x.f(str, "requestClientTimeZone");
        h.g.b.x.f(iVar, "appInfo");
        this.f40619a = rVar;
        this.f40620b = gcVar;
        this.f40621c = str;
        this.f40622d = iVar;
    }

    public final gc a() {
        return this.f40620b;
    }

    public final com.waze.n.i b() {
        return this.f40622d;
    }

    public final com.waze.n.r c() {
        return this.f40619a;
    }

    public final String d() {
        return this.f40621c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f40619a, yVar.f40619a) && h.g.b.x.n(this.f40620b, yVar.f40620b) && h.g.b.x.n(this.f40621c, yVar.f40621c) && h.g.b.x.n(this.f40622d, yVar.f40622d);
    }

    public final int hashCode() {
        com.waze.n.r rVar = this.f40619a;
        return ((((((rVar == null ? 0 : rVar.hashCode()) * 31) + this.f40620b.hashCode()) * 31) + this.f40621c.hashCode()) * 31) + this.f40622d.hashCode();
    }

    public final String toString() {
        return "SharedRequestMetadata(location=" + this.f40619a + ", requestClientTimestamp=" + this.f40620b + ", requestClientTimeZone=" + this.f40621c + ", appInfo=" + this.f40622d + ")";
    }
}
