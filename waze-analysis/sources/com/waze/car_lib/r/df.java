package com.waze.car_lib.r;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class df extends com.waze.o.ad {

    /* renamed from: a, reason: collision with root package name */
    private final String f21373a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21374b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21375c;

    /* renamed from: d, reason: collision with root package name */
    private final cv f21376d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.d f21377e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.alerters.a.k f21378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(String str, List list, boolean z, cv cvVar, com.waze.alerters.a.k kVar, com.waze.reports_v2.d dVar) {
        super(null, null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "items");
        h.g.b.x.f(dVar, "conversationalMode");
        this.f21373a = str;
        this.f21374b = list;
        this.f21375c = z;
        this.f21376d = cvVar;
        this.f21378f = kVar;
        this.f21377e = dVar;
    }

    public static /* synthetic */ df g(df dfVar, List list, cv cvVar, com.waze.alerters.a.k kVar, com.waze.reports_v2.d dVar, int i2) {
        String str = (i2 & 1) != 0 ? dfVar.f21373a : null;
        if ((i2 & 2) != 0) {
            list = dfVar.f21374b;
        }
        List list2 = list;
        boolean z = (i2 & 4) != 0 ? dfVar.f21375c : false;
        if ((i2 & 8) != 0) {
            cvVar = dfVar.f21376d;
        }
        cv cvVar2 = cvVar;
        if ((i2 & 16) != 0) {
            kVar = dfVar.f21378f;
        }
        com.waze.alerters.a.k kVar2 = kVar;
        if ((i2 & 32) != 0) {
            dVar = dfVar.f21377e;
        }
        com.waze.reports_v2.d dVar2 = dVar;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list2, "items");
        h.g.b.x.f(dVar2, "conversationalMode");
        return new df(str, list2, z, cvVar2, kVar2, dVar2);
    }

    public final cv a() {
        return this.f21376d;
    }

    public final com.waze.reports_v2.d b() {
        return this.f21377e;
    }

    public final String c() {
        return this.f21373a;
    }

    public final List d() {
        return this.f21374b;
    }

    public final boolean e() {
        return this.f21375c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        return h.g.b.x.n(this.f21373a, dfVar.f21373a) && h.g.b.x.n(this.f21374b, dfVar.f21374b) && this.f21375c == dfVar.f21375c && h.g.b.x.n(this.f21376d, dfVar.f21376d) && h.g.b.x.n(this.f21378f, dfVar.f21378f) && h.g.b.x.n(this.f21377e, dfVar.f21377e);
    }

    public final com.waze.alerters.a.k f() {
        return this.f21378f;
    }

    public final int hashCode() {
        int iHashCode = (this.f21373a.hashCode() * 31) + this.f21374b.hashCode();
        cv cvVar = this.f21376d;
        int iA = ((((iHashCode * 31) + a.a.a(this.f21375c)) * 31) + (cvVar == null ? 0 : cvVar.hashCode())) * 31;
        com.waze.alerters.a.k kVar = this.f21378f;
        return ((iA + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.f21377e.hashCode();
    }

    public final String toString() {
        return "Loaded(title=" + this.f21373a + ", items=" + this.f21374b + ", shouldShowCloseButton=" + this.f21375c + ", reportAgentUiState=" + this.f21376d + ", conversationalReportingUiState=" + this.f21378f + ", conversationalMode=" + this.f21377e + ")";
    }

    public /* synthetic */ df(String str, List list, boolean z, com.waze.reports_v2.b bVar, int i2) {
        this(str, list, (!((i2 & 4) == 0)) | z, null, null, (i2 & 32) != 0 ? com.waze.reports_v2.b.f34001a : bVar);
    }
}
