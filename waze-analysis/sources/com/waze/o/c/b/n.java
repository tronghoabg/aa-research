package com.waze.o.c.b;

import com.waze.modules.c.dk;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    private final long f32816a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.a.p f32817b;

    /* renamed from: c, reason: collision with root package name */
    private final List f32818c;

    /* renamed from: d, reason: collision with root package name */
    private final dk f32819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j2, com.waze.av.a.p pVar, List list, dk dkVar) {
        super(true);
        h.g.b.x.f(pVar, "destination");
        h.g.b.x.f(list, "altRoutes");
        h.g.b.x.f(dkVar, "routingResponse");
        this.f32816a = j2;
        this.f32817b = pVar;
        this.f32818c = list;
        this.f32819d = dkVar;
    }

    public final long a() {
        return this.f32816a;
    }

    public final com.waze.av.a.p b() {
        return this.f32817b;
    }

    public final dk c() {
        return this.f32819d;
    }

    public final List d() {
        return this.f32818c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f32816a == nVar.f32816a && h.g.b.x.n(this.f32817b, nVar.f32817b) && h.g.b.x.n(this.f32818c, nVar.f32818c) && h.g.b.x.n(this.f32819d, nVar.f32819d);
    }

    public final int hashCode() {
        return (((((a.a.b(this.f32816a) * 31) + this.f32817b.hashCode()) * 31) + this.f32818c.hashCode()) * 31) + this.f32819d.hashCode();
    }

    public final String toString() {
        return "Success(routeId=" + this.f32816a + ", destination=" + this.f32817b + ", altRoutes=" + this.f32818c + ", routingResponse=" + this.f32819d + ")";
    }
}
