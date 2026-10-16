package com.waze.navigate;

import com.waze.NativeManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class m extends h.g.b.u implements h.g.a.a {
    m(Object obj) {
        super(0, obj, NativeManager.class, "venueProviderGetServices", "venueProviderGetServices()Lcom/waze/VenueServices;", 0);
    }

    @Override // h.g.a.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return ((NativeManager) this.receiver).venueProviderGetServices();
    }
}
