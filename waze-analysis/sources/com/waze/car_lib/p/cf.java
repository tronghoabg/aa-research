package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cf extends com.waze.car_lib.r.co {

    /* renamed from: a, reason: collision with root package name */
    private final String f20715a;

    /* renamed from: b, reason: collision with root package name */
    private final cm f20716b;

    /* renamed from: c, reason: collision with root package name */
    private final List f20717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(String str, cm cmVar, List list) {
        super(null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "rows");
        this.f20715a = str;
        this.f20716b = cmVar;
        this.f20717c = list;
    }

    public final List c() {
        return this.f20717c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return h.g.b.x.n(this.f20715a, cfVar.f20715a) && h.g.b.x.n(this.f20716b, cfVar.f20716b) && h.g.b.x.n(this.f20717c, cfVar.f20717c);
    }

    @Override // com.waze.car_lib.r.co
    public final cm g() {
        return this.f20716b;
    }

    @Override // com.waze.car_lib.r.co
    public final String h() {
        return this.f20715a;
    }

    public final int hashCode() {
        int iHashCode = this.f20715a.hashCode() * 31;
        cm cmVar = this.f20716b;
        return ((iHashCode + (cmVar == null ? 0 : cmVar.hashCode())) * 31) + this.f20717c.hashCode();
    }

    public final String toString() {
        return "ListUiState(title=" + this.f20715a + ", saveAction=" + this.f20716b + ", rows=" + this.f20717c + ")";
    }
}
