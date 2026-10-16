package com.waze.c.e.a;

import androidx.compose.ui.geometry.Rect;
import com.waze.map.b.bi;
import com.waze.map.b.ca;
import com.waze.map.b.dn;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18420a;

    /* renamed from: b, reason: collision with root package name */
    private final bi f18421b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f18422c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18423d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f18424e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f18425f;

    public /* synthetic */ c(h.g.a.a aVar, int i2) {
        this(false, (i2 & 2) != 0 ? new bi((List) null, (List) null, (List) null, (List) null, (List) null, (ca) null, (dn) null, 255) : null, (i2 & 4) != 0 ? h.a.r.j() : null, (i2 & 8) != 0, (i2 & 16) != 0 ? Rect.Companion.getZero() : null, (i2 & 32) != 0 ? new android.support.v4.a.a.c(19) : aVar);
    }

    public static /* synthetic */ c g(c cVar, boolean z, bi biVar, Map map, boolean z2, Rect rect, int i2) {
        if ((i2 & 1) != 0) {
            z = cVar.f18420a;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            biVar = cVar.f18421b;
        }
        bi biVar2 = biVar;
        if ((i2 & 4) != 0) {
            map = cVar.f18422c;
        }
        Map map2 = map;
        if ((i2 & 8) != 0) {
            z2 = cVar.f18423d;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            rect = cVar.f18424e;
        }
        Rect rect2 = rect;
        h.g.a.a aVar = cVar.f18425f;
        x.f(biVar2, "mapContent");
        x.f(map2, "labelPositioning");
        x.f(rect2, "mapViewPort");
        x.f(aVar, "onRecenter");
        return new c(z3, biVar2, map2, z4, rect2, aVar);
    }

    public final Rect a() {
        return this.f18424e;
    }

    public final bi b() {
        return this.f18421b;
    }

    public final Map c() {
        return this.f18422c;
    }

    public final h.g.a.a d() {
        return this.f18425f;
    }

    public final boolean e() {
        return this.f18423d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18420a == cVar.f18420a && x.n(this.f18421b, cVar.f18421b) && x.n(this.f18422c, cVar.f18422c) && this.f18423d == cVar.f18423d && x.n(this.f18424e, cVar.f18424e) && x.n(this.f18425f, cVar.f18425f);
    }

    public final boolean f() {
        return this.f18420a;
    }

    public final int hashCode() {
        return (((((((((a.a.a(this.f18420a) * 31) + this.f18421b.hashCode()) * 31) + this.f18422c.hashCode()) * 31) + a.a.a(this.f18423d)) * 31) + this.f18424e.hashCode()) * 31) + this.f18425f.hashCode();
    }

    public final String toString() {
        return "MapState(ready=" + this.f18420a + ", mapContent=" + this.f18421b + ", labelPositioning=" + this.f18422c + ", centered=" + this.f18423d + ", mapViewPort=" + this.f18424e + ", onRecenter=" + this.f18425f + ")";
    }

    public c(boolean z, bi biVar, Map map, boolean z2, Rect rect, h.g.a.a aVar) {
        x.f(biVar, "mapContent");
        x.f(map, "labelPositioning");
        x.f(rect, "mapViewPort");
        x.f(aVar, "onRecenter");
        this.f18420a = z;
        this.f18421b = biVar;
        this.f18422c = map;
        this.f18423d = z2;
        this.f18424e = rect;
        this.f18425f = aVar;
    }

    public c() {
        this(null, 63);
    }
}
