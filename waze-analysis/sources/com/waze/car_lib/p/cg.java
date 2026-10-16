package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cg extends com.waze.car_lib.r.co {

    /* renamed from: a, reason: collision with root package name */
    private final String f20718a;

    /* renamed from: b, reason: collision with root package name */
    private final cm f20719b;

    /* renamed from: c, reason: collision with root package name */
    private final List f20720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(String str, cm cmVar, List list) {
        super(null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "sections");
        this.f20718a = str;
        this.f20719b = cmVar;
        this.f20720c = list;
    }

    public final List c() {
        return this.f20720c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return h.g.b.x.n(this.f20718a, cgVar.f20718a) && h.g.b.x.n(this.f20719b, cgVar.f20719b) && h.g.b.x.n(this.f20720c, cgVar.f20720c);
    }

    @Override // com.waze.car_lib.r.co
    public final cm g() {
        return this.f20719b;
    }

    @Override // com.waze.car_lib.r.co
    public final String h() {
        return this.f20718a;
    }

    public final int hashCode() {
        int iHashCode = this.f20718a.hashCode() * 31;
        cm cmVar = this.f20719b;
        return ((iHashCode + (cmVar == null ? 0 : cmVar.hashCode())) * 31) + this.f20720c.hashCode();
    }

    public final String toString() {
        return "SectionedListUiState(title=" + this.f20718a + ", saveAction=" + this.f20719b + ", sections=" + this.f20720c + ")";
    }
}
