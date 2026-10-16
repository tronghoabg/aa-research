package com.waze.j;

import com.google.d.b.an;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f24866a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24867b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24868c;

    public b(AddressItem addressItem) {
        this.f24866a = addressItem;
        if (an.f(addressItem.getTitle())) {
            this.f24867b = an.e(addressItem.getAddress());
            this.f24868c = an.e(addressItem.getSecondaryTitle());
        } else {
            this.f24867b = addressItem.getTitle();
            this.f24868c = an.f(addressItem.getSecondaryTitle()) ? an.e(addressItem.getAddress()) : addressItem.getSecondaryTitle();
        }
    }

    @Override // com.waze.j.d
    public final String c() {
        return this.f24868c;
    }

    @Override // com.waze.j.d
    public final String d() {
        return this.f24867b;
    }

    @Override // com.waze.j.d
    public final int e() {
        return 3;
    }

    @Override // com.waze.j.d
    public final com.waze.shared_infra.h.c f() {
        return this.f24866a.getCoordinate();
    }

    @Override // com.waze.j.d
    public final AddressItem t() {
        return this.f24866a;
    }
}
