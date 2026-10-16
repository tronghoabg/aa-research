package com.waze.ah;

import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.Position;
import com.waze.places.PlacesNativeManager;
import h.g.b.x;
import h.i;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final PlacesNativeManager f14061a;

    public c(PlacesNativeManager placesNativeManager) {
        x.f(placesNativeManager, "placesNativeManager");
        this.f14061a = placesNativeManager;
    }

    @Override // com.waze.ah.b
    public final am a(com.waze.shared_infra.h.c cVar, a aVar) {
        boolean z;
        x.f(cVar, "coordinate");
        x.f(aVar, "fetchType");
        Position.IntPosition intPosition = ConversionExtensionsKt.toIntPosition(cVar);
        a aVar2 = a.f14058a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            z = true;
            if (iOrdinal != 1) {
                throw new i();
            }
        } else {
            z = false;
        }
        return this.f14061a.fetchReverseGeocodeWazeAddressAsync(intPosition, z);
    }
}
