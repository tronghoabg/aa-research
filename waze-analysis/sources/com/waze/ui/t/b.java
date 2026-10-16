package com.waze.ui.t;

import com.waze.gas.GasNativeManager;
import com.waze.ui.ac.i;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f43410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43411b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43412c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43413d;

    /* renamed from: e, reason: collision with root package name */
    private final i f43414e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43415f;

    public b(String str, String str2, String str3, String str4, i iVar, String str5) {
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(str2, "subtitle");
        x.f(str3, "primaryActionButtonText");
        x.f(str4, "secondaryActionButtonText");
        this.f43410a = str;
        this.f43411b = str2;
        this.f43412c = str3;
        this.f43413d = str4;
        this.f43414e = iVar;
        this.f43415f = str5;
    }

    public final i a() {
        return this.f43414e;
    }

    public final String b() {
        return this.f43415f;
    }

    public final String c() {
        return this.f43412c;
    }

    public final String d() {
        return this.f43413d;
    }

    public final String e() {
        return this.f43411b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f43410a, bVar.f43410a) && x.n(this.f43411b, bVar.f43411b) && x.n(this.f43412c, bVar.f43412c) && x.n(this.f43413d, bVar.f43413d) && x.n(this.f43414e, bVar.f43414e) && x.n(this.f43415f, bVar.f43415f);
    }

    public final String f() {
        return this.f43410a;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f43410a.hashCode() * 31) + this.f43411b.hashCode()) * 31) + this.f43412c.hashCode()) * 31) + this.f43413d.hashCode();
        i iVar = this.f43414e;
        int iHashCode2 = ((iHashCode * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f43415f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RoutingPopupUiState(title=" + this.f43410a + ", subtitle=" + this.f43411b + ", primaryActionButtonText=" + this.f43412c + ", secondaryActionButtonText=" + this.f43413d + ", imageSource=" + this.f43414e + ", checkboxText=" + this.f43415f + ")";
    }
}
