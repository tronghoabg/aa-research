package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final n f30639a = new n(new com.waze.g.b("", ""), "", null);

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.g.b f30640b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30641c;

    /* renamed from: d, reason: collision with root package name */
    private final m f30642d;

    public n(com.waze.g.b bVar, String str, m mVar) {
        h.g.b.x.f(bVar, "installationInfo");
        h.g.b.x.f(str, "sessionUUID");
        this.f30640b = bVar;
        this.f30641c = str;
        this.f30642d = mVar;
    }

    public final m a() {
        return this.f30642d;
    }

    public final com.waze.g.b c() {
        return this.f30640b;
    }

    public final String d() {
        return this.f30641c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f30640b, nVar.f30640b) && h.g.b.x.n(this.f30641c, nVar.f30641c) && this.f30642d == nVar.f30642d;
    }

    public final int hashCode() {
        int iHashCode = (this.f30640b.hashCode() * 31) + this.f30641c.hashCode();
        m mVar = this.f30642d;
        return (iHashCode * 31) + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "AppConfig(installationInfo=" + this.f30640b + ", sessionUUID=" + this.f30641c + ", launchType=" + this.f30642d + ")";
    }
}
