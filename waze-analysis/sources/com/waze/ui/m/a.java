package com.waze.ui.m;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.design_components.b.d f42752a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.design_components.b.e f42753b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.n f42754c;

    /* renamed from: d, reason: collision with root package name */
    private final cb f42755d;

    public a(com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar, com.waze.ui.ac.n nVar, cb cbVar) {
        h.g.b.x.f(dVar, "icon");
        h.g.b.x.f(eVar, "iconType");
        h.g.b.x.f(nVar, "label");
        h.g.b.x.f(cbVar, NotificationCompat.CATEGORY_EVENT);
        this.f42752a = dVar;
        this.f42753b = eVar;
        this.f42754c = nVar;
        this.f42755d = cbVar;
    }

    public final com.waze.design_components.b.d a() {
        return this.f42752a;
    }

    public final com.waze.design_components.b.e b() {
        return this.f42753b;
    }

    public final cb c() {
        return this.f42755d;
    }

    public final com.waze.ui.ac.n d() {
        return this.f42754c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f42752a == aVar.f42752a && this.f42753b == aVar.f42753b && h.g.b.x.n(this.f42754c, aVar.f42754c) && h.g.b.x.n(this.f42755d, aVar.f42755d);
    }

    public final int hashCode() {
        return (((((this.f42752a.hashCode() * 31) + this.f42753b.hashCode()) * 31) + this.f42754c.hashCode()) * 31) + this.f42755d.hashCode();
    }

    public final String toString() {
        return "ActionItem(icon=" + this.f42752a + ", iconType=" + this.f42753b + ", label=" + this.f42754c + ", event=" + this.f42755d + ")";
    }

    public /* synthetic */ a(com.waze.design_components.b.d dVar, com.waze.ui.ac.n nVar, cb cbVar) {
        this(dVar, com.waze.design_components.b.e.f23312a, nVar, cbVar);
    }
}
