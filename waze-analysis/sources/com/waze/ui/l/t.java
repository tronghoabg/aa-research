package com.waze.ui.l;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements ad, y, m {

    /* renamed from: a, reason: collision with root package name */
    private final String f42727a;

    /* renamed from: b, reason: collision with root package name */
    private final w f42728b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42729c;

    /* renamed from: d, reason: collision with root package name */
    private final q f42730d;

    /* renamed from: e, reason: collision with root package name */
    private final List f42731e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f42732f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f42733g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f42734h;

    public t(String str, w wVar, String str2, q qVar, List list, h.g.a.a aVar, boolean z, h.g.a.a aVar2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "buttons");
        h.g.b.x.f(aVar, "onMapTap");
        h.g.b.x.f(aVar2, "onBackPressed");
        this.f42727a = str;
        this.f42728b = wVar;
        this.f42729c = str2;
        this.f42730d = qVar;
        this.f42731e = list;
        this.f42732f = aVar;
        this.f42733g = z;
        this.f42734h = aVar2;
    }

    @Override // com.waze.ui.l.m
    public final h.g.a.a a() {
        return this.f42734h;
    }

    public final q b() {
        return this.f42730d;
    }

    public final w c() {
        return this.f42728b;
    }

    @Override // com.waze.ui.l.y
    public final h.g.a.a d() {
        return this.f42732f;
    }

    @Override // com.waze.ui.l.ad
    public final boolean e() {
        return this.f42733g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f42727a, tVar.f42727a) && h.g.b.x.n(this.f42728b, tVar.f42728b) && h.g.b.x.n(this.f42729c, tVar.f42729c) && h.g.b.x.n(this.f42730d, tVar.f42730d) && h.g.b.x.n(this.f42731e, tVar.f42731e) && h.g.b.x.n(this.f42732f, tVar.f42732f) && this.f42733g == tVar.f42733g && h.g.b.x.n(this.f42734h, tVar.f42734h);
    }

    public final String f() {
        return this.f42729c;
    }

    public final String g() {
        return this.f42727a;
    }

    public final List h() {
        return this.f42731e;
    }

    public final int hashCode() {
        int iHashCode = this.f42727a.hashCode() * 31;
        w wVar = this.f42728b;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str = this.f42729c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        q qVar = this.f42730d;
        return ((((((((iHashCode3 + (qVar != null ? qVar.hashCode() : 0)) * 31) + this.f42731e.hashCode()) * 31) + this.f42732f.hashCode()) * 31) + a.a.a(this.f42733g)) * 31) + this.f42734h.hashCode();
    }

    public final String toString() {
        return "Extended(title=" + this.f42727a + ", icon=" + this.f42728b + ", description=" + this.f42729c + ", closeBehavior=" + this.f42730d + ", buttons=" + this.f42731e + ", onMapTap=" + this.f42732f + ", visible=" + this.f42733g + ", onBackPressed=" + this.f42734h + ")";
    }
}
