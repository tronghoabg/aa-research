package com.waze.search.v2;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final String f36613a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.i f36614b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36615c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36616d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ui.ac.n f36617e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ui.ac.n f36618f;

    /* renamed from: g, reason: collision with root package name */
    private final List f36619g;

    /* renamed from: h, reason: collision with root package name */
    private final List f36620h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.settings.v f36621i;

    public r(String str, com.waze.ui.ac.i iVar, boolean z, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, List list, com.waze.settings.v vVar, List list2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(iVar, "leadingImage");
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "badges");
        h.g.b.x.f(list2, "secondaryDescriptions");
        this.f36613a = str;
        this.f36614b = iVar;
        this.f36615c = false;
        this.f36616d = z;
        this.f36617e = nVar;
        this.f36618f = nVar2;
        this.f36619g = list;
        this.f36621i = vVar;
        this.f36620h = list2;
    }

    public final com.waze.ui.ac.i a() {
        return this.f36614b;
    }

    public final com.waze.ui.ac.n b() {
        return this.f36618f;
    }

    public final com.waze.ui.ac.n c() {
        return this.f36617e;
    }

    public final String d() {
        return this.f36613a;
    }

    public final List e() {
        return this.f36619g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!h.g.b.x.n(this.f36613a, rVar.f36613a) || !h.g.b.x.n(this.f36614b, rVar.f36614b)) {
            return false;
        }
        boolean z = rVar.f36615c;
        return this.f36616d == rVar.f36616d && h.g.b.x.n(this.f36617e, rVar.f36617e) && h.g.b.x.n(this.f36618f, rVar.f36618f) && h.g.b.x.n(this.f36619g, rVar.f36619g) && h.g.b.x.n(this.f36621i, rVar.f36621i) && h.g.b.x.n(this.f36620h, rVar.f36620h);
    }

    public final List f() {
        return this.f36620h;
    }

    public final boolean g() {
        return this.f36616d;
    }

    public final com.waze.settings.v h() {
        return this.f36621i;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f36613a.hashCode() * 31) + this.f36614b.hashCode()) * 31) + a.a.a(false)) * 31) + a.a.a(this.f36616d)) * 31) + this.f36617e.hashCode()) * 31) + this.f36618f.hashCode()) * 31) + this.f36619g.hashCode();
        com.waze.settings.v vVar = this.f36621i;
        return (((iHashCode * 31) + (vVar != null ? vVar.hashCode() : 0)) * 31) + this.f36620h.hashCode();
    }

    public final String toString() {
        return "SearchResult(id=" + this.f36613a + ", leadingImage=" + this.f36614b + ", isAd=false, isLogo=" + this.f36616d + ", title=" + this.f36617e + ", subtitle=" + this.f36618f + ", badges=" + this.f36619g + ", trailingText=" + this.f36621i + ", secondaryDescriptions=" + this.f36620h + ")";
    }
}
