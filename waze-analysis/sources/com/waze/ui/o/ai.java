package com.waze.ui.o;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final ab f43126a;

    /* renamed from: b, reason: collision with root package name */
    private final List f43127b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43128c;

    /* renamed from: d, reason: collision with root package name */
    private final ah f43129d;

    /* renamed from: e, reason: collision with root package name */
    private final x f43130e;

    public ai(ab abVar, List list, boolean z, ah ahVar, x xVar) {
        h.g.b.x.f(abVar, "headerState");
        h.g.b.x.f(list, "bannerModels");
        h.g.b.x.f(ahVar, "marketplaceState");
        h.g.b.x.f(xVar, "footerState");
        this.f43126a = abVar;
        this.f43127b = list;
        this.f43128c = z;
        this.f43129d = ahVar;
        this.f43130e = xVar;
    }

    public static /* synthetic */ ai f(ai aiVar, ab abVar, List list, boolean z, ah ahVar, x xVar, int i2) {
        if ((i2 & 1) != 0) {
            abVar = aiVar.f43126a;
        }
        ab abVar2 = abVar;
        if ((i2 & 2) != 0) {
            list = aiVar.f43127b;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            z = aiVar.f43128c;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            ahVar = aiVar.f43129d;
        }
        ah ahVar2 = ahVar;
        if ((i2 & 16) != 0) {
            xVar = aiVar.f43130e;
        }
        x xVar2 = xVar;
        h.g.b.x.f(abVar2, "headerState");
        h.g.b.x.f(list2, "bannerModels");
        h.g.b.x.f(ahVar2, "marketplaceState");
        h.g.b.x.f(xVar2, "footerState");
        return new ai(abVar2, list2, z2, ahVar2, xVar2);
    }

    public final x a() {
        return this.f43130e;
    }

    public final ab b() {
        return this.f43126a;
    }

    public final ah c() {
        return this.f43129d;
    }

    public final List d() {
        return this.f43127b;
    }

    public final boolean e() {
        return this.f43128c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return h.g.b.x.n(this.f43126a, aiVar.f43126a) && h.g.b.x.n(this.f43127b, aiVar.f43127b) && this.f43128c == aiVar.f43128c && h.g.b.x.n(this.f43129d, aiVar.f43129d) && h.g.b.x.n(this.f43130e, aiVar.f43130e);
    }

    public final int hashCode() {
        return (((((((this.f43126a.hashCode() * 31) + this.f43127b.hashCode()) * 31) + a.a.a(this.f43128c)) * 31) + this.f43129d.hashCode()) * 31) + this.f43130e.hashCode();
    }

    public final String toString() {
        return "MainMenuState(headerState=" + this.f43126a + ", bannerModels=" + this.f43127b + ", showInboxNotification=" + this.f43128c + ", marketplaceState=" + this.f43129d + ", footerState=" + this.f43130e + ")";
    }
}
