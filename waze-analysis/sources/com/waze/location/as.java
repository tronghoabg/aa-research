package com.waze.location;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f25268a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f25269b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.n f25270c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f25271d;

    public as(com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, com.waze.ui.ac.n nVar3, h.g.a.a aVar) {
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(nVar2, "bodyHtml");
        h.g.b.x.f(nVar3, "buttonText");
        h.g.b.x.f(aVar, "buttonOnClickListener");
        this.f25268a = nVar;
        this.f25269b = nVar2;
        this.f25270c = nVar3;
        this.f25271d = aVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f25269b;
    }

    public final com.waze.ui.ac.n b() {
        return this.f25270c;
    }

    public final com.waze.ui.ac.n c() {
        return this.f25268a;
    }

    public final h.g.a.a d() {
        return this.f25271d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return h.g.b.x.n(this.f25268a, asVar.f25268a) && h.g.b.x.n(this.f25269b, asVar.f25269b) && h.g.b.x.n(this.f25270c, asVar.f25270c) && h.g.b.x.n(this.f25271d, asVar.f25271d);
    }

    public final int hashCode() {
        return (((((this.f25268a.hashCode() * 31) + this.f25269b.hashCode()) * 31) + this.f25270c.hashCode()) * 31) + this.f25271d.hashCode();
    }

    public final String toString() {
        return "LocationPermissionData(title=" + this.f25268a + ", bodyHtml=" + this.f25269b + ", buttonText=" + this.f25270c + ", buttonOnClickListener=" + this.f25271d + ")";
    }
}
