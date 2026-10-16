package com.waze.ui.m;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    private final String f42860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42861b;

    /* renamed from: c, reason: collision with root package name */
    private final g f42862c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42863d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42864e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ui.ac.i f42865f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f42866g;

    public ci(String str, String str2, g gVar, boolean z, String str3, com.waze.ui.ac.i iVar, boolean z2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        h.g.b.x.f(gVar, "badges");
        this.f42860a = str;
        this.f42861b = str2;
        this.f42862c = gVar;
        this.f42863d = z;
        this.f42864e = str3;
        this.f42865f = iVar;
        this.f42866g = z2;
    }

    public static /* synthetic */ ci h(ci ciVar, String str, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            str = ciVar.f42860a;
        }
        String str2 = str;
        String str3 = (i2 & 2) != 0 ? ciVar.f42861b : null;
        g gVar = (i2 & 4) != 0 ? ciVar.f42862c : null;
        if ((i2 & 8) != 0) {
            z = ciVar.f42863d;
        }
        boolean z2 = z;
        String str4 = (i2 & 16) != 0 ? ciVar.f42864e : null;
        com.waze.ui.ac.i iVar = (i2 & 32) != 0 ? ciVar.f42865f : null;
        boolean z3 = ciVar.f42866g;
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str3, "subtitle");
        h.g.b.x.f(gVar, "badges");
        return new ci(str2, str3, gVar, z2, str4, iVar, z3);
    }

    public final g a() {
        return this.f42862c;
    }

    public final com.waze.ui.ac.i b() {
        return this.f42865f;
    }

    public final String c() {
        return this.f42864e;
    }

    public final String d() {
        return this.f42861b;
    }

    public final String e() {
        return this.f42860a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return h.g.b.x.n(this.f42860a, ciVar.f42860a) && h.g.b.x.n(this.f42861b, ciVar.f42861b) && h.g.b.x.n(this.f42862c, ciVar.f42862c) && this.f42863d == ciVar.f42863d && h.g.b.x.n(this.f42864e, ciVar.f42864e) && h.g.b.x.n(this.f42865f, ciVar.f42865f) && this.f42866g == ciVar.f42866g;
    }

    public final boolean f() {
        return this.f42866g;
    }

    public final boolean g() {
        return this.f42863d;
    }

    public final int hashCode() {
        int iHashCode = (((this.f42860a.hashCode() * 31) + this.f42861b.hashCode()) * 31) + this.f42862c.hashCode();
        String str = this.f42864e;
        int iA = ((((iHashCode * 31) + a.a.a(this.f42863d)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.ui.ac.i iVar = this.f42865f;
        return ((iA + (iVar != null ? iVar.hashCode() : 0)) * 31) + a.a.a(this.f42866g);
    }

    public final String toString() {
        return "LocationPreviewHeaderState(title=" + this.f42860a + ", subtitle=" + this.f42861b + ", badges=" + this.f42862c + ", isAd=" + this.f42863d + ", dangerZoneDescription=" + this.f42864e + ", imageSource=" + this.f42865f + ", addImageBackground=" + this.f42866g + ")";
    }
}
