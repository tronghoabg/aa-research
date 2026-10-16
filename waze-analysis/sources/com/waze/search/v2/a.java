package com.waze.search.v2;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f36136a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.speech.k f36137b;

    public a(com.waze.ui.ac.n nVar, com.waze.speech.k kVar) {
        h.g.b.x.f(nVar, "label");
        h.g.b.x.f(kVar, NotificationCompat.CATEGORY_EVENT);
        this.f36136a = nVar;
        this.f36137b = kVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f36136a;
    }

    public final com.waze.speech.k b() {
        return this.f36137b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f36136a, aVar.f36136a) && h.g.b.x.n(this.f36137b, aVar.f36137b);
    }

    public final int hashCode() {
        return (this.f36136a.hashCode() * 31) + this.f36137b.hashCode();
    }

    public final String toString() {
        return "ActionButton(label=" + this.f36136a + ", event=" + this.f36137b + ")";
    }
}
