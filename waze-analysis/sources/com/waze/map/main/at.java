package com.waze.map.main;

import com.waze.jni.protos.map.MapPopupNativeInfo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class at implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f29352a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29353b;

    public /* synthetic */ at(Object obj, int i2) {
        this.f29353b = i2;
        this.f29352a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f29353b) {
            case 0:
                return bm.r((bm) this.f29352a, (com.waze.map.b.s) obj);
            case 1:
                return bm.q((bm) this.f29352a, (com.waze.map.b.v) obj);
            case 2:
                return bm.s((bm) this.f29352a, (com.waze.map.b.af) obj);
            case 3:
                return bm.t((bm) this.f29352a, (com.waze.map.b.aa) obj);
            case 4:
                return bm.u((bm) this.f29352a, (com.waze.map.b.z) obj);
            case 5:
                return bm.v((bm) this.f29352a, (com.waze.map.b.ae) obj);
            case 6:
                return bm.w((bm) this.f29352a, (com.waze.map.b.y) obj);
            case 7:
                return bm.x((bm) this.f29352a, (com.waze.map.b.w) obj);
            case 8:
                return MapPopupDataFetcherNativeManager.fetchWazerPopupInfo$lambda$0(this.f29352a, (MapPopupNativeInfo.WazerPopupInfo) obj);
            case 9:
                return MapPopupDataFetcherNativeManager.fetchMyLocationDetailsPopupInfo$lambda$0(this.f29352a, (MapPopupNativeInfo.DetailsPopupInfo) obj);
            default:
                return MapPopupDataFetcherNativeManager.fetchDetailsPopupInfo$lambda$0(this.f29352a, (MapPopupNativeInfo.DetailsPopupInfo) obj);
        }
    }
}
