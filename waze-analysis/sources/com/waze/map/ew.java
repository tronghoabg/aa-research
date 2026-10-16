package com.waze.map;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ew implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f28867a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28868b;

    ew(Object obj, int i2) {
        this.f28868b = i2;
        this.f28867a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.waze.map.canvas.a.e, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f28868b;
        if (i2 == 0) {
            eb ebVar = eb.f28816a;
            int iOrdinal = ((eb) obj).ordinal();
            if (iOrdinal == 0) {
                ((cx) this.f28867a).j().invoke(com.waze.map.b.dg.f28188a);
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                ((cx) this.f28867a).j().invoke(com.waze.map.b.df.f28187a);
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            bz.e((bz) this.f28867a, (Map) obj);
            return h.ab.f48028a;
        }
        db dbVar = db.f28740a;
        int iOrdinal2 = ((db) obj).ordinal();
        if (iOrdinal2 == 0) {
            Object objPerformZoomIn = this.f28867a.performZoomIn(eVar);
            if (objPerformZoomIn == h.c.a.a.f48038a) {
                return objPerformZoomIn;
            }
        } else {
            if (iOrdinal2 != 1) {
                throw new h.i();
            }
            Object objPerformZoomOut = this.f28867a.performZoomOut(eVar);
            if (objPerformZoomOut == h.c.a.a.f48038a) {
                return objPerformZoomOut;
            }
        }
        return h.ab.f48028a;
    }
}
