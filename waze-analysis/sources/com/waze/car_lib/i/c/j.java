package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.z f20109a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20110b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20111c;

    public j(com.waze.map.z zVar, String str, boolean z) {
        h.g.b.x.f(zVar, "mapColors");
        h.g.b.x.f(str, "streetName");
        this.f20109a = zVar;
        this.f20110b = str;
        this.f20111c = z;
    }

    public final com.waze.map.z a() {
        return this.f20109a;
    }

    public final String b() {
        return this.f20110b;
    }

    public final boolean c() {
        return this.f20111c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.g.b.x.n(this.f20109a, jVar.f20109a) && h.g.b.x.n(this.f20110b, jVar.f20110b) && this.f20111c == jVar.f20111c;
    }

    public final int hashCode() {
        return (((this.f20109a.hashCode() * 31) + this.f20110b.hashCode()) * 31) + a.a.a(this.f20111c);
    }

    public final String toString() {
        return "Street(mapColors=" + this.f20109a + ", streetName=" + this.f20110b + ", isHov=" + this.f20111c + ")";
    }
}
