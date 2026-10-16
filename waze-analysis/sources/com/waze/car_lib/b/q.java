package com.waze.car_lib.b;

import androidx.car.app.model.CarColor;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f19120a;

    /* renamed from: b, reason: collision with root package name */
    private final p f19121b;

    /* renamed from: c, reason: collision with root package name */
    private final CarColor f19122c;

    /* renamed from: d, reason: collision with root package name */
    private final v f19123d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.k f19124e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.design_components.b.d f19125f;

    public q(String str, p pVar, CarColor carColor, v vVar, com.waze.k kVar, com.waze.design_components.b.d dVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(vVar, "action");
        h.g.b.x.f(kVar, "alertId");
        this.f19120a = str;
        this.f19121b = pVar;
        this.f19122c = carColor;
        this.f19123d = vVar;
        this.f19124e = kVar;
        this.f19125f = dVar;
    }

    public final CarColor a() {
        return this.f19122c;
    }

    public final p b() {
        return this.f19121b;
    }

    public final v c() {
        return this.f19123d;
    }

    public final com.waze.design_components.b.d d() {
        return this.f19125f;
    }

    public final String e() {
        return this.f19120a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.g.b.x.n(this.f19120a, qVar.f19120a) && this.f19121b == qVar.f19121b && h.g.b.x.n(this.f19122c, qVar.f19122c) && h.g.b.x.n(this.f19123d, qVar.f19123d) && h.g.b.x.n(this.f19124e, qVar.f19124e) && this.f19125f == qVar.f19125f;
    }

    public final int hashCode() {
        int iHashCode = this.f19120a.hashCode() * 31;
        p pVar = this.f19121b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        CarColor carColor = this.f19122c;
        int iHashCode3 = (((((iHashCode2 + (carColor == null ? 0 : carColor.hashCode())) * 31) + this.f19123d.hashCode()) * 31) + this.f19124e.hashCode()) * 31;
        com.waze.design_components.b.d dVar = this.f19125f;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "AlertAction(title=" + this.f19120a + ", flag=" + this.f19121b + ", backgroundColor=" + this.f19122c + ", action=" + this.f19123d + ", alertId=" + this.f19124e + ", icon=" + this.f19125f + ")";
    }

    public /* synthetic */ q(String str, p pVar, CarColor carColor, v vVar, com.waze.k kVar, int i2) {
        this(str, (i2 & 2) != 0 ? null : pVar, (i2 & 4) != 0 ? null : carColor, vVar, kVar, (com.waze.design_components.b.d) null);
    }
}
