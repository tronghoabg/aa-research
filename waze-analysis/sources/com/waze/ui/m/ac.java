package com.waze.ui.m;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f42768a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f42769b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.z.a.c.g f42770c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.z.a.c.c f42771d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f42772e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.z.a.c.h f42773f;

    public /* synthetic */ ac(com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, com.waze.z.a.c.g gVar, com.waze.z.a.c.c cVar) {
        com.waze.ui.a.b bVar = new com.waze.ui.a.b(18);
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(nVar2, "text");
        h.g.b.x.f(gVar, "onClick");
        h.g.b.x.f(cVar, "dialogActions");
        h.g.b.x.f(bVar, "onDismiss");
        super(null);
        this.f42768a = nVar;
        this.f42769b = nVar2;
        this.f42770c = gVar;
        this.f42771d = cVar;
        this.f42772e = bVar;
        this.f42773f = null;
    }

    public final com.waze.z.a.c.c a() {
        return this.f42771d;
    }

    public final com.waze.z.a.c.g b() {
        return this.f42770c;
    }

    public final com.waze.ui.ac.n c() {
        return this.f42769b;
    }

    public final com.waze.ui.ac.n d() {
        return this.f42768a;
    }

    public final h.g.a.a e() {
        return this.f42772e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if (!h.g.b.x.n(this.f42768a, acVar.f42768a) || !h.g.b.x.n(this.f42769b, acVar.f42769b) || !h.g.b.x.n(this.f42770c, acVar.f42770c) || !h.g.b.x.n(this.f42771d, acVar.f42771d) || !h.g.b.x.n(this.f42772e, acVar.f42772e)) {
            return false;
        }
        com.waze.z.a.c.h hVar = acVar.f42773f;
        return h.g.b.x.n(null, null);
    }

    public final int hashCode() {
        return ((((((((this.f42768a.hashCode() * 31) + this.f42769b.hashCode()) * 31) + this.f42770c.hashCode()) * 31) + this.f42771d.hashCode()) * 31) + this.f42772e.hashCode()) * 31;
    }

    public final String toString() {
        return "ConfirmationDialog(title=" + this.f42768a + ", text=" + this.f42769b + ", onClick=" + this.f42770c + ", dialogActions=" + this.f42771d + ", onDismiss=" + this.f42772e + ", imageData=null)";
    }
}
