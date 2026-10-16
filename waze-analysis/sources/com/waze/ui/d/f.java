package com.waze.ui.d;

import com.waze.gas.GasNativeManager;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f42142a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42143b;

    public f(com.waze.ui.ac.n nVar, List list) {
        x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(list, "items");
        this.f42142a = nVar;
        this.f42143b = list;
    }

    public final com.waze.ui.ac.n a() {
        return this.f42142a;
    }

    public final List b() {
        return this.f42143b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f42142a, fVar.f42142a) && x.n(this.f42143b, fVar.f42143b);
    }

    public final int hashCode() {
        return (this.f42142a.hashCode() * 31) + this.f42143b.hashCode();
    }

    public final String toString() {
        return "EnrichAlertQuestionUI(title=" + this.f42142a + ", items=" + this.f42143b + ")";
    }
}
