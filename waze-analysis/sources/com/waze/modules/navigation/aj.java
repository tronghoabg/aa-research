package com.waze.modules.navigation;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aj extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f30298a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.av.b.n f30299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(AddressItem addressItem, AddressItem addressItem2) {
        super(null);
        h.g.b.x.f(addressItem, "parkingAddress");
        h.g.b.x.f(addressItem2, "originalAddress");
        com.waze.av.b.x xVar = com.waze.av.b.x.f16010a;
        this.f30298a = xVar.a(addressItem2);
        this.f30299b = xVar.a(addressItem);
    }

    @Override // com.waze.modules.navigation.ak
    public final com.waze.av.b.n a() {
        return this.f30299b;
    }

    @Override // com.waze.modules.navigation.ak
    public final /* bridge */ /* synthetic */ ak b() {
        return new aj(this.f30299b, this.f30298a);
    }

    @Override // com.waze.modules.navigation.ak
    public final void c(com.waze.av.b.n nVar) {
        h.g.b.x.f(nVar, "<set-?>");
        this.f30299b = nVar;
    }

    public final com.waze.av.b.n d() {
        return this.f30298a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aj(com.waze.av.b.n nVar, com.waze.av.b.n nVar2) {
        this(ak.f30300a, ak.f30300a);
        h.g.b.x.f(nVar, "parkingPlace");
        h.g.b.x.f(nVar2, "originalPlace");
        this.f30298a = nVar2;
        c(nVar);
    }
}
