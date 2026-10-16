package com.waze.w;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f45431a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45432b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45433c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.av.b.n f45434d;

    /* renamed from: e, reason: collision with root package name */
    private final g f45435e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f45436f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.ui.ac.i f45437g;

    /* renamed from: h, reason: collision with root package name */
    private final String f45438h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.j.n f45439i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.av.a.p f45440j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, String str2, String str3, com.waze.av.b.n nVar, g gVar, boolean z, com.waze.ui.ac.i iVar, String str4, com.waze.j.n nVar2) {
        super(null);
        h.g.b.x.f(str, "subtitle");
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str3, TtmlNode.ATTR_ID);
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(gVar, "source");
        this.f45431a = str;
        this.f45432b = str2;
        this.f45433c = str3;
        this.f45434d = nVar;
        this.f45435e = gVar;
        this.f45436f = z;
        this.f45437g = iVar;
        this.f45438h = str4;
        this.f45439i = nVar2;
        this.f45440j = nVar.e();
    }

    @Override // com.waze.w.i
    public final com.waze.j.n a() {
        return this.f45439i;
    }

    @Override // com.waze.w.i
    public final com.waze.av.a.p b() {
        return this.f45440j;
    }

    public final g c() {
        return this.f45435e;
    }

    public final com.waze.av.b.n d() {
        return this.f45434d;
    }

    public final com.waze.ui.ac.i e() {
        return this.f45437g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return h.g.b.x.n(this.f45431a, hVar.f45431a) && h.g.b.x.n(this.f45432b, hVar.f45432b) && h.g.b.x.n(this.f45433c, hVar.f45433c) && h.g.b.x.n(this.f45434d, hVar.f45434d) && this.f45435e == hVar.f45435e && this.f45436f == hVar.f45436f && h.g.b.x.n(this.f45437g, hVar.f45437g) && h.g.b.x.n(this.f45438h, hVar.f45438h) && h.g.b.x.n(this.f45439i, hVar.f45439i);
    }

    @Override // com.waze.w.i
    public final String f() {
        return this.f45433c;
    }

    @Override // com.waze.w.i
    public final String g() {
        return this.f45431a;
    }

    @Override // com.waze.w.i
    public final String h() {
        return this.f45432b;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f45431a.hashCode() * 31) + this.f45432b.hashCode()) * 31) + this.f45433c.hashCode()) * 31) + this.f45434d.hashCode()) * 31) + this.f45435e.hashCode();
        com.waze.ui.ac.i iVar = this.f45437g;
        int iA = ((((iHashCode * 31) + a.a.a(this.f45436f)) * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f45438h;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.j.n nVar = this.f45439i;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String i() {
        return this.f45438h;
    }

    public final boolean j() {
        return this.f45436f;
    }

    public final String toString() {
        return "GenericAutoCompletePlace(subtitle=" + this.f45431a + ", title=" + this.f45432b + ", id=" + this.f45433c + ", genericPlace=" + this.f45434d + ", source=" + this.f45435e + ", organicAd=" + this.f45436f + ", imageSource=" + this.f45437g + ", autoCompleteResponse=" + this.f45438h + ", serverProvidedDistance=" + this.f45439i + ")";
    }

    public /* synthetic */ h(String str, String str2, String str3, com.waze.av.b.n nVar, g gVar, boolean z, com.waze.j.n nVar2) {
        this(str, str2, str3, nVar, gVar, z, null, null, nVar2);
    }
}
