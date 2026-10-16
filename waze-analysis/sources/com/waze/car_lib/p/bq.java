package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20652a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20653b;

    public bq(String str, List list) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "items");
        this.f20652a = str;
        this.f20653b = list;
    }

    public final String a() {
        return this.f20652a;
    }

    public final List b() {
        return this.f20653b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        return h.g.b.x.n(this.f20652a, bqVar.f20652a) && h.g.b.x.n(this.f20653b, bqVar.f20653b);
    }

    public final int hashCode() {
        return (this.f20652a.hashCode() * 31) + this.f20653b.hashCode();
    }

    public final String toString() {
        return "UiState(title=" + this.f20652a + ", items=" + this.f20653b + ")";
    }
}
