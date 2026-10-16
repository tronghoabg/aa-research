package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    private final String f30019a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30020b;

    public cx(String str, boolean z) {
        h.g.b.x.f(str, "key");
        this.f30019a = str;
        this.f30020b = z;
    }

    public final String a() {
        return this.f30019a;
    }

    public final i.c.a.a.o b() {
        String str = this.f30019a;
        i.c.a.a.n nVarNewBuilder = i.c.a.a.o.newBuilder();
        nVarNewBuilder.a((i.c.a.a.m) Enum.valueOf(i.c.a.a.m.class, str));
        nVarNewBuilder.b(this.f30020b);
        i.c.a.a.o oVarBuild = nVarNewBuilder.build();
        h.g.b.x.e(oVarBuild, "build(...)");
        return oVarBuild;
    }

    public final boolean c() {
        return this.f30020b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return h.g.b.x.n(this.f30019a, cxVar.f30019a) && this.f30020b == cxVar.f30020b;
    }

    public final int hashCode() {
        return (this.f30019a.hashCode() * 31) + a.a.a(this.f30020b);
    }

    public final String toString() {
        return "Option(key=" + this.f30019a + ", value=" + this.f30020b + ")";
    }
}
