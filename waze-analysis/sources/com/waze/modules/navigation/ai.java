package com.waze.modules.navigation;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ai extends ak {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.av.b.n f30297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(AddressItem addressItem) {
        super(null);
        h.g.b.x.f(addressItem, "address");
        this.f30297a = com.waze.av.b.x.f16010a.a(addressItem);
    }

    @Override // com.waze.modules.navigation.ak
    public final com.waze.av.b.n a() {
        return this.f30297a;
    }

    @Override // com.waze.modules.navigation.ak
    public final ak b() {
        return new ai(this.f30297a);
    }

    @Override // com.waze.modules.navigation.ak
    public final void c(com.waze.av.b.n nVar) {
        h.g.b.x.f(nVar, "<set-?>");
        this.f30297a = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ai(com.waze.av.b.n nVar) {
        this(ak.f30300a);
        h.g.b.x.f(nVar, "genericPlace");
        c(nVar);
    }
}
