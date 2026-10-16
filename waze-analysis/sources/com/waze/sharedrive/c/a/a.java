package com.waze.sharedrive.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f38055a;

    /* renamed from: b, reason: collision with root package name */
    private final l f38056b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38057c;

    public a(b bVar, l lVar, String str) {
        x.f(bVar, "destination");
        x.f(lVar, "driver");
        x.f(str, "routeUuid");
        this.f38055a = bVar;
        this.f38056b = lVar;
        this.f38057c = str;
    }

    public final l a() {
        return this.f38056b;
    }

    public final String b() {
        return this.f38057c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f38055a, aVar.f38055a) && x.n(this.f38056b, aVar.f38056b) && x.n(this.f38057c, aVar.f38057c);
    }

    public final int hashCode() {
        return (((this.f38055a.hashCode() * 31) + this.f38056b.hashCode()) * 31) + this.f38057c.hashCode();
    }

    public final String toString() {
        return "CreateSharedDriveParams(destination=" + this.f38055a + ", driver=" + this.f38056b + ", routeUuid=" + this.f38057c + ")";
    }
}
