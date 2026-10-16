package com.waze.ui.m;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f43010a;

    /* renamed from: b, reason: collision with root package name */
    private final cb f43011b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.design_components.button.e f43012c;

    public h(com.waze.ui.ac.n nVar, cb cbVar, com.waze.design_components.button.e eVar) {
        h.g.b.x.f(nVar, "label");
        h.g.b.x.f(cbVar, NotificationCompat.CATEGORY_EVENT);
        h.g.b.x.f(eVar, "sentiment");
        this.f43010a = nVar;
        this.f43011b = cbVar;
        this.f43012c = eVar;
    }

    public final com.waze.design_components.button.e a() {
        return this.f43012c;
    }

    public final cb b() {
        return this.f43011b;
    }

    public final com.waze.ui.ac.n c() {
        return this.f43010a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return h.g.b.x.n(this.f43010a, hVar.f43010a) && h.g.b.x.n(this.f43011b, hVar.f43011b) && this.f43012c == hVar.f43012c;
    }

    public final int hashCode() {
        return (((this.f43010a.hashCode() * 31) + this.f43011b.hashCode()) * 31) + this.f43012c.hashCode();
    }

    public final String toString() {
        return "BottomActionButton(label=" + this.f43010a + ", event=" + this.f43011b + ", sentiment=" + this.f43012c + ")";
    }

    public /* synthetic */ h(com.waze.ui.ac.n nVar, cb cbVar) {
        this(nVar, cbVar, com.waze.design_components.button.e.f23349a);
    }
}
