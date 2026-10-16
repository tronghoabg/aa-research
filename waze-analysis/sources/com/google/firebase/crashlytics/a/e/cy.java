package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    private final cv f9564a;

    /* renamed from: b, reason: collision with root package name */
    private final cx f9565b;

    /* renamed from: c, reason: collision with root package name */
    private final cw f9566c;

    cy(cv cvVar, cx cxVar, cw cwVar) {
        this.f9564a = cvVar;
        this.f9565b = cxVar;
        this.f9566c = cwVar;
    }

    public static cy a(cv cvVar, cx cxVar, cw cwVar) {
        return new cy(cvVar, cxVar, cwVar);
    }

    public final cv b() {
        return this.f9564a;
    }

    public final cw c() {
        return this.f9566c;
    }

    public final cx d() {
        return this.f9565b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cy) {
            cy cyVar = (cy) obj;
            if (this.f9564a.equals(cyVar.f9564a) && this.f9565b.equals(cyVar.f9565b) && this.f9566c.equals(cyVar.f9566c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9564a.hashCode() ^ 1000003) * 1000003) ^ this.f9565b.hashCode();
        return this.f9566c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        cw cwVar = this.f9566c;
        cx cxVar = this.f9565b;
        return "StaticSessionData{appData=" + this.f9564a.toString() + ", osData=" + cxVar.toString() + ", deviceData=" + cwVar.toString() + "}";
    }

    public cy() {
        throw null;
    }
}
