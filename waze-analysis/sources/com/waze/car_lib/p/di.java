package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    private final String f20790a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20791b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f20792c;

    public di(String str, h.g.a.a aVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar, "clickListener");
        this.f20790a = str;
        this.f20791b = true;
        this.f20792c = aVar;
    }

    public final String a() {
        return this.f20790a;
    }

    public final h.g.a.a b() {
        return this.f20792c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        if (!h.g.b.x.n(this.f20790a, diVar.f20790a)) {
            return false;
        }
        boolean z = diVar.f20791b;
        return h.g.b.x.n(this.f20792c, diVar.f20792c);
    }

    public final int hashCode() {
        return (((this.f20790a.hashCode() * 31) + DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS) * 31) + this.f20792c.hashCode();
    }

    public final String toString() {
        return "RowUiState(title=" + this.f20790a + ", isBrowsable=true, clickListener=" + this.f20792c + ")";
    }
}
