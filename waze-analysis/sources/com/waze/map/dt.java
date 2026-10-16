package com.waze.map;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dt implements ds {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28767a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f28768b;

    public dt() {
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.f28767a = bnVarB;
        this.f28768b = bnVarB;
    }

    @Override // com.waze.map.ds
    public final kotlinx.coroutines.b.k a() {
        return this.f28768b;
    }

    @Override // com.waze.map.ds
    public final void b() {
        this.f28767a.e(null);
    }

    @Override // com.waze.map.ds
    public final void c(AddressItem addressItem) {
        h.g.b.x.f(addressItem, "place");
        this.f28767a.e(addressItem);
    }
}
