package com.waze.places;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class aa implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab f33101a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33102b;

    public /* synthetic */ aa(ab abVar, int i2) {
        this.f33102b = i2;
        this.f33101a = abVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f33102b;
        if (i2 == 0) {
            return ab.fetchFutureEvents$lambda$0(this.f33101a);
        }
        if (i2 == 1) {
            return ab.fetchFavorites$lambda$0(this.f33101a);
        }
        ab abVar = this.f33101a;
        if (i2 != 2) {
            return ab.fetchRecents$lambda$0(abVar);
        }
        ab.registerPlacesUpdateHook$lambda$0(abVar);
        return null;
    }
}
