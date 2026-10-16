package com.waze.ui.b;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    private final String f42035a;

    /* renamed from: b, reason: collision with root package name */
    private final az f42036b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42037c;

    /* renamed from: d, reason: collision with root package name */
    private final bb f42038d;

    /* renamed from: e, reason: collision with root package name */
    private final av f42039e;

    /* renamed from: f, reason: collision with root package name */
    private final ar f42040f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42041g;

    /* renamed from: h, reason: collision with root package name */
    private final List f42042h;

    /* renamed from: i, reason: collision with root package name */
    private final as f42043i;

    /* renamed from: j, reason: collision with root package name */
    private final ba f42044j;

    /* renamed from: k, reason: collision with root package name */
    private final ac f42045k;

    public bc(String str, az azVar, String str2, bb bbVar, av avVar, ar arVar, String str3, List list, as asVar, ba baVar, ac acVar) {
        h.g.b.x.f(str, "uuid");
        h.g.b.x.f(azVar, TypedValues.TransitionType.S_DURATION);
        h.g.b.x.f(str2, "eta");
        h.g.b.x.f(avVar, "navigateCta");
        h.g.b.x.f(arVar, "distance");
        h.g.b.x.f(list, "badges");
        h.g.b.x.f(acVar, "permitStringType");
        this.f42035a = str;
        this.f42036b = azVar;
        this.f42037c = str2;
        this.f42038d = bbVar;
        this.f42039e = avVar;
        this.f42040f = arVar;
        this.f42041g = str3;
        this.f42042h = list;
        this.f42043i = asVar;
        this.f42044j = baVar;
        this.f42045k = acVar;
    }

    public static /* synthetic */ bc l(bc bcVar, az azVar, String str, bb bbVar, String str2, List list, as asVar, int i2) {
        String str3 = (i2 & 1) != 0 ? bcVar.f42035a : null;
        az azVar2 = (i2 & 2) != 0 ? bcVar.f42036b : azVar;
        String str4 = (i2 & 4) != 0 ? bcVar.f42037c : str;
        bb bbVar2 = (i2 & 8) != 0 ? bcVar.f42038d : bbVar;
        av avVar = (i2 & 16) != 0 ? bcVar.f42039e : null;
        ar arVar = (i2 & 32) != 0 ? bcVar.f42040f : null;
        String str5 = (i2 & 64) != 0 ? bcVar.f42041g : str2;
        List list2 = (i2 & 128) != 0 ? bcVar.f42042h : list;
        as asVar2 = (i2 & 256) != 0 ? bcVar.f42043i : asVar;
        ba baVar = bcVar.f42044j;
        ac acVar = bcVar.f42045k;
        h.g.b.x.f(str3, "uuid");
        h.g.b.x.f(azVar2, TypedValues.TransitionType.S_DURATION);
        h.g.b.x.f(str4, "eta");
        h.g.b.x.f(avVar, "navigateCta");
        h.g.b.x.f(arVar, "distance");
        h.g.b.x.f(list2, "badges");
        h.g.b.x.f(acVar, "permitStringType");
        return new bc(str3, azVar2, str4, bbVar2, avVar, arVar, str5, list2, asVar2, baVar, acVar);
    }

    public final ac a() {
        return this.f42045k;
    }

    public final ar b() {
        return this.f42040f;
    }

    public final as c() {
        return this.f42043i;
    }

    public final av d() {
        return this.f42039e;
    }

    public final az e() {
        return this.f42036b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return h.g.b.x.n(this.f42035a, bcVar.f42035a) && h.g.b.x.n(this.f42036b, bcVar.f42036b) && h.g.b.x.n(this.f42037c, bcVar.f42037c) && h.g.b.x.n(this.f42038d, bcVar.f42038d) && h.g.b.x.n(this.f42039e, bcVar.f42039e) && h.g.b.x.n(this.f42040f, bcVar.f42040f) && h.g.b.x.n(this.f42041g, bcVar.f42041g) && h.g.b.x.n(this.f42042h, bcVar.f42042h) && h.g.b.x.n(this.f42043i, bcVar.f42043i) && h.g.b.x.n(this.f42044j, bcVar.f42044j) && h.g.b.x.n(this.f42045k, bcVar.f42045k);
    }

    public final ba f() {
        return this.f42044j;
    }

    public final bb g() {
        return this.f42038d;
    }

    public final String h() {
        return this.f42037c;
    }

    public final int hashCode() {
        int iHashCode = (((this.f42035a.hashCode() * 31) + this.f42036b.hashCode()) * 31) + this.f42037c.hashCode();
        bb bbVar = this.f42038d;
        int iHashCode2 = ((((((iHashCode * 31) + (bbVar == null ? 0 : bbVar.hashCode())) * 31) + this.f42039e.hashCode()) * 31) + this.f42040f.hashCode()) * 31;
        String str = this.f42041g;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f42042h.hashCode()) * 31;
        as asVar = this.f42043i;
        int iHashCode4 = (iHashCode3 + (asVar == null ? 0 : asVar.hashCode())) * 31;
        ba baVar = this.f42044j;
        return ((iHashCode4 + (baVar != null ? baVar.hashCode() : 0)) * 31) + this.f42045k.hashCode();
    }

    public final String i() {
        return this.f42035a;
    }

    public final String j() {
        return this.f42041g;
    }

    public final List k() {
        return this.f42042h;
    }

    public final String toString() {
        return "RouteCardState(uuid=" + this.f42035a + ", duration=" + this.f42036b + ", eta=" + this.f42037c + ", waypointSplitDuration=" + this.f42038d + ", navigateCta=" + this.f42039e + ", distance=" + this.f42040f + ", viaName=" + this.f42041g + ", badges=" + this.f42042h + ", hovLaneState=" + this.f42043i + ", timelineState=" + this.f42044j + ", permitStringType=" + this.f42045k + ")";
    }
}
