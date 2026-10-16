package com.waze.navigate;

import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.Place;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationStartPointNativeManager extends eg implements eh {
    public static final int $stable = 8;
    private final kotlinx.coroutines.b.bn<com.waze.places.f> navigationStartPointState = kotlinx.coroutines.b.ck.b(null);

    static final h.ab clearNavigationStartPoint$lambda$0(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    static final h.ab setNavigationStartPoint$lambda$0(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    static final h.ab setNavigationStartPoint$lambda$1(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    @Override // com.waze.navigate.eh
    public com.waze.shared_infra.s.c<h.ab> clearNavigationStartPoint() {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        clearNavigationStartPointImpl(new g(completableDeferredJ, 7));
        return new com.waze.shared_infra.s.c<>(completableDeferredJ);
    }

    public final native void clearNavigationStartPointImplNTV();

    public final native void initNativeLayerNTV();

    @Override // com.waze.navigate.eg
    public void onStartPointChanged(VenueData venueData) {
        h.g.b.x.f(venueData, "venue");
        kotlinx.coroutines.b.bn<com.waze.places.f> navigationStartPointState = getNavigationStartPointState();
        Place placeI = new com.waze.reports.ed(venueData).i();
        h.g.b.x.e(placeI, "getPlace(...)");
        navigationStartPointState.e(com.waze.notifications.c.k.h(placeI, null));
    }

    @Override // com.waze.navigate.eg
    public void onStartPointRemoved() {
        getNavigationStartPointState().e(null);
    }

    @Override // com.waze.navigate.eh
    public com.waze.shared_infra.s.c<h.ab> setNavigationStartPoint(com.waze.reports.ed edVar) {
        h.g.b.x.f(edVar, "venue");
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        VenueData venueDataH = edVar.h();
        h.g.b.x.e(venueDataH, "getProto(...)");
        setNavigationStartPointVenue(venueDataH, new g(completableDeferredJ, 6));
        return new com.waze.shared_infra.s.c<>(completableDeferredJ);
    }

    public final native void setNavigationStartPointLatLonNTV(int i2, int i3);

    public final native void setNavigationStartPointVenueNTV(byte[] bArr);

    @Override // com.waze.navigate.eh
    public kotlinx.coroutines.b.bn<com.waze.places.f> getNavigationStartPointState() {
        return this.navigationStartPointState;
    }

    @Override // com.waze.navigate.eh
    public com.waze.shared_infra.s.c<h.ab> setNavigationStartPoint(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        setNavigationStartPointLatLon(cVar.c(), cVar.d(), new g(completableDeferredJ, 5));
        return new com.waze.shared_infra.s.c<>(completableDeferredJ);
    }
}
