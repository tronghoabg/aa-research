package com.waze.search.e;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;
import com.waze.settings.ai;
import com.waze.z.a.ak;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends z {

    /* renamed from: a, reason: collision with root package name */
    private final String f35634a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f35635b;

    /* renamed from: c, reason: collision with root package name */
    private final ak f35636c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f35637d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.l f35638e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.p f35639f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.p f35640g;

    /* renamed from: h, reason: collision with root package name */
    private final List f35641h;

    /* renamed from: i, reason: collision with root package name */
    private final i f35642i;

    /* renamed from: j, reason: collision with root package name */
    private final List f35643j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.ui.ac.n f35644k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35645l;
    private final h.g.a.q m;
    private final j n;
    private final ai o;
    private final com.waze.settings.v p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, ai aiVar, com.waze.ui.ac.n nVar, ak akVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.p pVar, h.g.a.p pVar2, List list, i iVar, List list2, com.waze.settings.v vVar, boolean z, j jVar, int i2) {
        super(null);
        ak akVar2 = (i2 & 8) != 0 ? new ak(h.a.i.h()) : akVar;
        h.g.a.l qVar = (i2 & 16) != 0 ? new com.waze.network.q(12) : lVar;
        h.g.a.l qVar2 = (i2 & 32) != 0 ? new com.waze.network.q(13) : lVar2;
        h.g.a.p aVar = (i2 & 64) != 0 ? new com.waze.search.a.a(17) : pVar;
        h.g.a.p aVar2 = (i2 & 128) != 0 ? new com.waze.search.a.a(18) : pVar2;
        List listH = (i2 & 256) != 0 ? h.a.i.h() : list;
        i iVar2 = (i2 & 512) != 0 ? null : iVar;
        List listH2 = (i2 & 1024) != 0 ? h.a.i.h() : list2;
        com.waze.settings.v vVar2 = (i2 & 2048) != 0 ? null : vVar;
        boolean z2 = ((i2 & 8192) == 0) & z;
        j jVar2 = (i2 & 16384) != 0 ? null : jVar;
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(aiVar, "leadingSection");
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(akVar2, "actionsList");
        h.g.b.x.f(qVar, "onClick");
        h.g.b.x.f(qVar2, "onLongClick");
        h.g.b.x.f(aVar, "onSwiped");
        h.g.b.x.f(aVar2, "onSwipedActionClicked");
        h.g.b.x.f(listH, "badges");
        h.g.b.x.f(listH2, "secondaryDescriptions");
        this.f35634a = str;
        this.o = aiVar;
        this.f35635b = nVar;
        this.f35636c = akVar2;
        this.f35637d = qVar;
        this.f35638e = qVar2;
        this.f35639f = aVar;
        this.f35640g = aVar2;
        this.f35641h = listH;
        this.f35642i = iVar2;
        this.f35643j = listH2;
        this.p = vVar2;
        this.f35644k = null;
        this.f35645l = z2;
        this.n = jVar2;
        this.m = null;
    }

    @Override // com.waze.search.e.z
    public final String a() {
        return this.f35634a;
    }

    public final ak b() {
        return this.f35636c;
    }

    public final i c() {
        return this.f35642i;
    }

    public final com.waze.ui.ac.n d() {
        return this.f35635b;
    }

    public final List e() {
        return this.f35641h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!h.g.b.x.n(this.f35634a, pVar.f35634a) || !h.g.b.x.n(this.o, pVar.o) || !h.g.b.x.n(this.f35635b, pVar.f35635b) || !h.g.b.x.n(this.f35636c, pVar.f35636c) || !h.g.b.x.n(this.f35637d, pVar.f35637d) || !h.g.b.x.n(this.f35638e, pVar.f35638e) || !h.g.b.x.n(this.f35639f, pVar.f35639f) || !h.g.b.x.n(this.f35640g, pVar.f35640g) || !h.g.b.x.n(this.f35641h, pVar.f35641h) || !h.g.b.x.n(this.f35642i, pVar.f35642i) || !h.g.b.x.n(this.f35643j, pVar.f35643j) || !h.g.b.x.n(this.p, pVar.p)) {
            return false;
        }
        com.waze.ui.ac.n nVar = pVar.f35644k;
        if (!h.g.b.x.n(null, null) || this.f35645l != pVar.f35645l || !h.g.b.x.n(this.n, pVar.n)) {
            return false;
        }
        h.g.a.q qVar = pVar.m;
        return h.g.b.x.n(null, null);
    }

    public final List f() {
        return this.f35643j;
    }

    public final void g() {
        this.f35637d.invoke(this);
    }

    public final void h() {
        this.f35638e.invoke(this);
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((this.f35634a.hashCode() * 31) + this.o.hashCode()) * 31) + this.f35635b.hashCode()) * 31) + this.f35636c.hashCode()) * 31) + this.f35637d.hashCode()) * 31) + this.f35638e.hashCode()) * 31) + this.f35639f.hashCode()) * 31) + this.f35640g.hashCode()) * 31) + this.f35641h.hashCode();
        i iVar = this.f35642i;
        int iHashCode2 = ((((iHashCode * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f35643j.hashCode()) * 31;
        com.waze.settings.v vVar = this.p;
        int iHashCode3 = (((iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 961) + a.a.a(this.f35645l)) * 31;
        j jVar = this.n;
        return (iHashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
    }

    public final void i(com.waze.z.a.ad adVar) {
        h.g.b.x.f(adVar, "swipeAction");
        this.f35640g.invoke(this, adVar);
    }

    public final boolean j() {
        return this.f35645l;
    }

    public final com.waze.settings.v k() {
        return this.p;
    }

    public final ai l() {
        return this.o;
    }

    public final String toString() {
        return "DestinationCell(id=" + this.f35634a + ", leadingSection=" + this.o + ", title=" + this.f35635b + ", actionsList=" + this.f35636c + ", onClick=" + this.f35637d + ", onLongClick=" + this.f35638e + ", onSwiped=" + this.f35639f + ", onSwipedActionClicked=" + this.f35640g + ", badges=" + this.f35641h + ", description=" + this.f35642i + ", secondaryDescriptions=" + this.f35643j + ", trailingText=" + this.p + ", secondaryTrailingText=null, showAdBadge=" + this.f35645l + ", transformationInfo=" + this.n + ", leadingImageDecorator=null)";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(String str, com.waze.ui.ac.i iVar, com.waze.ui.ac.n nVar, ak akVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.p pVar, h.g.a.p pVar2, i iVar2, com.waze.z.a.m mVar, com.waze.settings.v vVar, r rVar, j jVar, int i2) {
        ak akVar2 = (i2 & 8) != 0 ? new ak(h.a.i.h()) : akVar;
        h.g.a.l qVar = (i2 & 16) != 0 ? new com.waze.network.q(10) : lVar;
        h.g.a.l qVar2 = (i2 & 32) != 0 ? new com.waze.network.q(11) : lVar2;
        h.g.a.p aVar = (i2 & 64) != 0 ? new com.waze.search.a.a(15) : pVar;
        h.g.a.p aVar2 = (i2 & 128) != 0 ? new com.waze.search.a.a(16) : pVar2;
        List listH = (i2 & 256) != 0 ? h.a.i.h() : null;
        i iVar3 = (i2 & 512) != 0 ? null : iVar2;
        com.waze.z.a.m mVar2 = (i2 & 1024) != 0 ? null : mVar;
        com.waze.settings.v vVar2 = (i2 & 2048) != 0 ? null : vVar;
        r rVar2 = (i2 & 4096) != 0 ? r.f35647a : rVar;
        j jVar2 = (i2 & 16384) != 0 ? null : jVar;
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(iVar, "leadingImage");
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(akVar2, "swipeActions");
        h.g.b.x.f(qVar, "onClick");
        h.g.b.x.f(qVar2, "onLongClick");
        h.g.b.x.f(aVar, "onSwiped");
        h.g.b.x.f(aVar2, "onSwipedActionClicked");
        h.g.b.x.f(listH, "badges");
        h.g.b.x.f(rVar2, "leadingImageType");
        this(str, new t(iVar, rVar2), nVar, akVar2, qVar, qVar2, aVar, aVar2, listH, iVar3, h.a.i.j(mVar2), vVar2, false, jVar2, 36864);
    }
}
