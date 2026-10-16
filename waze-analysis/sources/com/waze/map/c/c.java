package com.waze.map.c;

import com.waze.gas.GasNativeManager;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.map.aw;
import com.waze.map.ba;
import com.waze.ui.ac.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28458a;

    /* renamed from: b, reason: collision with root package name */
    private final n f28459b;

    /* renamed from: c, reason: collision with root package name */
    private final n f28460c;

    /* renamed from: d, reason: collision with root package name */
    private final EtaLabelDefinitions.PinAlignment f28461d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.design_components.b.d f28462e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.design_components.b.d f28463f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f28464g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28465h;

    /* renamed from: i, reason: collision with root package name */
    private final aw f28466i;

    /* renamed from: j, reason: collision with root package name */
    private final ba f28467j;

    public /* synthetic */ c(com.waze.shared_infra.h.c cVar, n nVar, n nVar2, EtaLabelDefinitions.PinAlignment pinAlignment, com.waze.design_components.b.d dVar, com.waze.design_components.b.d dVar2, boolean z, boolean z2, aw awVar, ba baVar, int i2) {
        pinAlignment = (i2 & 8) != 0 ? EtaLabelDefinitions.PinAlignment.BOTTOM_LEFT : pinAlignment;
        nVar2 = (i2 & 4) != 0 ? null : nVar2;
        dVar = (i2 & 16) != 0 ? null : dVar;
        dVar2 = (i2 & 32) != 0 ? null : dVar2;
        boolean z3 = z | (!((i2 & 64) == 0));
        boolean z4 = z2 & ((i2 & 128) == 0);
        baVar = (i2 & 512) != 0 ? null : baVar;
        x.f(cVar, "coordinate");
        x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(pinAlignment, "alignment");
        x.f(awVar, "priority");
        this.f28458a = cVar;
        this.f28459b = nVar;
        this.f28460c = nVar2;
        this.f28461d = pinAlignment;
        this.f28462e = dVar;
        this.f28463f = dVar2;
        this.f28464g = z3;
        this.f28465h = z4;
        this.f28466i = awVar;
        this.f28467j = baVar;
    }

    public final com.waze.design_components.b.d a() {
        return this.f28462e;
    }

    public final com.waze.design_components.b.d b() {
        return this.f28463f;
    }

    public final EtaLabelDefinitions.PinAlignment c() {
        return this.f28461d;
    }

    public final aw d() {
        return this.f28466i;
    }

    public final ba e() {
        return this.f28467j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f28458a, cVar.f28458a) && x.n(this.f28459b, cVar.f28459b) && x.n(this.f28460c, cVar.f28460c) && this.f28461d == cVar.f28461d && this.f28462e == cVar.f28462e && this.f28463f == cVar.f28463f && this.f28464g == cVar.f28464g && this.f28465h == cVar.f28465h && this.f28466i == cVar.f28466i && x.n(this.f28467j, cVar.f28467j);
    }

    public final com.waze.shared_infra.h.c f() {
        return this.f28458a;
    }

    public final n g() {
        return this.f28460c;
    }

    public final n h() {
        return this.f28459b;
    }

    public final int hashCode() {
        int iHashCode = (this.f28458a.hashCode() * 31) + this.f28459b.hashCode();
        n nVar = this.f28460c;
        int iHashCode2 = ((((iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.f28461d.hashCode()) * 31;
        com.waze.design_components.b.d dVar = this.f28462e;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        com.waze.design_components.b.d dVar2 = this.f28463f;
        int iHashCode4 = (((((((iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31) + a.a.a(this.f28464g)) * 31) + a.a.a(this.f28465h)) * 31) + this.f28466i.hashCode()) * 31;
        ba baVar = this.f28467j;
        return iHashCode4 + (baVar != null ? baVar.hashCode() : 0);
    }

    public final boolean i() {
        return this.f28464g;
    }

    public final boolean j() {
        return this.f28465h;
    }

    public final String toString() {
        return "MapMakerLabelDescriptor(coordinate=" + this.f28458a + ", title=" + this.f28459b + ", description=" + this.f28460c + ", alignment=" + this.f28461d + ", icon=" + this.f28462e + ", secondaryIcon=" + this.f28463f + ", isDayMode=" + this.f28464g + ", isStyleSelected=" + this.f28465h + ", priority=" + this.f28466i + ", animationSpec=" + this.f28467j + ")";
    }
}
