package com.waze.app_nav.hub.b;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.app_nav.hub.ag;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f15272a;

    /* renamed from: b, reason: collision with root package name */
    private final ag f15273b;

    /* renamed from: c, reason: collision with root package name */
    private final a f15274c;

    /* renamed from: d, reason: collision with root package name */
    private final j f15275d;

    public /* synthetic */ k(String str, a aVar, j jVar, int i2) {
        ag agVarJ;
        if ((i2 & 2) != 0) {
            int i3 = ag.f15247a;
            agVarJ = com.waze.c.c.e.j();
        } else {
            agVarJ = null;
        }
        aVar = (i2 & 4) != 0 ? new a((byte[]) null) : aVar;
        x.f(str, "tag");
        x.f(agVarJ, TtmlNode.ATTR_ID);
        x.f(jVar, "creator");
        this.f15272a = str;
        this.f15273b = agVarJ;
        this.f15274c = aVar;
        this.f15275d = jVar;
    }

    public final a a() {
        return this.f15274c;
    }

    public final j b() {
        return this.f15275d;
    }

    public final String c() {
        return this.f15272a;
    }

    public final boolean equals(Object obj) {
        k kVar = obj instanceof k ? (k) obj : null;
        return x.n(kVar != null ? kVar.f15273b : null, this.f15273b);
    }

    public final int hashCode() {
        return this.f15273b.hashCode();
    }

    public final String toString() {
        return "WazePopupModel(" + this.f15272a + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(String str, j jVar) {
        this(str, null, jVar, 6);
        x.f(str, "tag");
        x.f(jVar, "creator");
    }
}
