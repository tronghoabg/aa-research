package com.waze.places;

import com.waze.NativeManager;
import com.waze.jni.protos.places.Place;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class m {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void formatPlaceToString$default(m mVar, Place place, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatPlaceToString");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        mVar.formatPlaceToString(place, lVar);
    }

    static final String formatPlaceToString$lambda$0(m mVar, Place place) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.places.PlaceFormatterNativeManager");
        byte[] byteArray = place.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        return ((PlaceFormatterNativeManager) mVar).formatPlaceToStringNTV(byteArray);
    }

    public void formatPlaceToString(Place place, h.g.a.l<? super String, h.ab> lVar) {
        h.g.b.x.f(place, "place");
        int i2 = 1;
        NativeManager.runNativeTask(new q(this, place, i2), lVar != null ? new s(lVar, i2) : null);
    }

    public void initNativeLayer() {
        ((PlaceFormatterNativeManager) this).initNativeLayerNTV();
    }

    public final void formatPlaceToString(Place place) {
        h.g.b.x.f(place, "place");
        formatPlaceToString$default(this, place, null, 2, null);
    }
}
