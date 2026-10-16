package com.waze.main_screen.k.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final h.l.c f26564a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26565b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.location.q f26566c;

    public t(com.waze.location.q qVar, h.l.c cVar, boolean z) {
        x.f(qVar, TtmlNode.ATTR_ID);
        x.f(cVar, "cardStateType");
        this.f26566c = qVar;
        this.f26564a = cVar;
        this.f26565b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return x.n(this.f26566c, tVar.f26566c) && x.n(this.f26564a, tVar.f26564a) && this.f26565b == tVar.f26565b;
    }

    public final int hashCode() {
        return (((this.f26566c.hashCode() * 31) + this.f26564a.hashCode()) * 31) + a.a.a(this.f26565b);
    }

    public final String toString() {
        return "InsightComparisonKey(id=" + this.f26566c + ", cardStateType=" + this.f26564a + ", isCardVisible=" + this.f26565b + ")";
    }
}
