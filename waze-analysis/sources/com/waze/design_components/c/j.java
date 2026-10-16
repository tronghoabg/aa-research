package com.waze.design_components.c;

import com.waze.gas.GasNativeManager;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f23405a;

    /* renamed from: b, reason: collision with root package name */
    private final l f23406b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f23407c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23408d;

    /* renamed from: e, reason: collision with root package name */
    private final c f23409e;

    /* renamed from: f, reason: collision with root package name */
    private final a f23410f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.design_components.d f23411g;

    public j(String str, com.waze.design_components.d dVar, l lVar, CharSequence charSequence, boolean z, c cVar) {
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(dVar, "ctaBarData");
        x.f(lVar, "onDismissCallback");
        this.f23405a = str;
        this.f23411g = dVar;
        this.f23406b = lVar;
        this.f23407c = charSequence;
        this.f23408d = z;
        this.f23409e = cVar;
        this.f23410f = null;
    }

    public static /* synthetic */ j g(j jVar, com.waze.design_components.d dVar) {
        String str = jVar.f23405a;
        l lVar = jVar.f23406b;
        CharSequence charSequence = jVar.f23407c;
        boolean z = jVar.f23408d;
        c cVar = jVar.f23409e;
        a aVar = jVar.f23410f;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(dVar, "ctaBarData");
        x.f(lVar, "onDismissCallback");
        return new j(str, dVar, lVar, charSequence, z, cVar);
    }

    public final c a() {
        return this.f23409e;
    }

    public final CharSequence b() {
        return this.f23407c;
    }

    public final String c() {
        return this.f23405a;
    }

    public final l d() {
        return this.f23406b;
    }

    public final boolean e() {
        return this.f23408d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!x.n(this.f23405a, jVar.f23405a) || !x.n(this.f23411g, jVar.f23411g) || !x.n(this.f23406b, jVar.f23406b) || !x.n(this.f23407c, jVar.f23407c) || this.f23408d != jVar.f23408d || !x.n(this.f23409e, jVar.f23409e)) {
            return false;
        }
        a aVar = jVar.f23410f;
        return x.n(null, null);
    }

    public final com.waze.design_components.d f() {
        return this.f23411g;
    }

    public final int hashCode() {
        int iHashCode = (((this.f23405a.hashCode() * 31) + this.f23411g.hashCode()) * 31) + this.f23406b.hashCode();
        CharSequence charSequence = this.f23407c;
        int iHashCode2 = ((((iHashCode * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + a.a.a(this.f23408d)) * 31;
        c cVar = this.f23409e;
        return (iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "WazeDialogData(title=" + this.f23405a + ", ctaBarData=" + this.f23411g + ", onDismissCallback=" + this.f23406b + ", description=" + ((Object) this.f23407c) + ", dismissible=" + this.f23408d + ", dialogImage=" + this.f23409e + ", checkBoxData=null)";
    }

    public /* synthetic */ j(String str, com.waze.design_components.d dVar, l lVar, CharSequence charSequence, boolean z, c cVar, int i2) {
        this(str, dVar, lVar, (i2 & 8) != 0 ? null : charSequence, z & ((i2 & 16) == 0), (i2 & 32) != 0 ? null : cVar);
    }
}
