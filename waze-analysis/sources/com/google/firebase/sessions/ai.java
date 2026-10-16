package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final l f10803a;

    /* renamed from: b, reason: collision with root package name */
    private final aq f10804b;

    /* renamed from: c, reason: collision with root package name */
    private final b f10805c;

    public ai(l lVar, aq aqVar, b bVar) {
        h.g.b.x.f(lVar, "eventType");
        h.g.b.x.f(aqVar, "sessionData");
        h.g.b.x.f(bVar, "applicationInfo");
        this.f10803a = lVar;
        this.f10804b = aqVar;
        this.f10805c = bVar;
    }

    public final b a() {
        return this.f10805c;
    }

    public final l b() {
        return this.f10803a;
    }

    public final aq c() {
        return this.f10804b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return this.f10803a == aiVar.f10803a && h.g.b.x.n(this.f10804b, aiVar.f10804b) && h.g.b.x.n(this.f10805c, aiVar.f10805c);
    }

    public final int hashCode() {
        return (((this.f10803a.hashCode() * 31) + this.f10804b.hashCode()) * 31) + this.f10805c.hashCode();
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f10803a + ", sessionData=" + this.f10804b + ", applicationInfo=" + this.f10805c + ")";
    }
}
