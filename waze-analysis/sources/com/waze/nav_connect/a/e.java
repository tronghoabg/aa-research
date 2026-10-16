package com.waze.nav_connect.a;

import com.google.v.v;
import com.waze.gas.GasNativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f30717a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30718b;

    /* renamed from: c, reason: collision with root package name */
    private final v f30719c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30720d;

    /* renamed from: e, reason: collision with root package name */
    private final d f30721e;

    public e(String str, String str2, v vVar, String str3, d dVar) {
        x.f(str, "partnerAppId");
        x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(vVar, "iconData");
        x.f(str3, "privacyPolicyUrl");
        this.f30717a = str;
        this.f30718b = str2;
        this.f30719c = vVar;
        this.f30720d = str3;
        this.f30721e = dVar;
    }

    public final v a() {
        return this.f30719c;
    }

    public final d b() {
        return this.f30721e;
    }

    public final String c() {
        return this.f30717a;
    }

    public final String d() {
        return this.f30720d;
    }

    public final String e() {
        return this.f30718b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f30717a, eVar.f30717a) && x.n(this.f30718b, eVar.f30718b) && x.n(this.f30719c, eVar.f30719c) && x.n(this.f30720d, eVar.f30720d) && x.n(this.f30721e, eVar.f30721e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f30717a.hashCode() * 31) + this.f30718b.hashCode()) * 31) + this.f30719c.hashCode()) * 31) + this.f30720d.hashCode();
        d dVar = this.f30721e;
        return (iHashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "NavConnectPartnerAppInfo(partnerAppId=" + this.f30717a + ", title=" + this.f30718b + ", iconData=" + this.f30719c + ", privacyPolicyUrl=" + this.f30720d + ", isvInfo=" + this.f30721e + ")";
    }
}
