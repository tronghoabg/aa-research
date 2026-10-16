package com.waze.map;

import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fp implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28981a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f28982b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28983c;

    fp(com.waze.map.canvas.a.e eVar, gb gbVar, int i2) {
        this.f28983c = i2;
        this.f28981a = eVar;
        this.f28982b = gbVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f28983c != 0) {
            Object objS = gb.s(this.f28982b, this.f28981a, (com.waze.google_assistant.ah) obj, eVar);
            return objS == h.c.a.a.f48038a ? objS : h.ab.f48028a;
        }
        h.k kVar = (h.k) obj;
        da daVar = (da) kVar.a();
        Object userLocationOffset = this.f28981a.setUserLocationOffset(this.f28982b.A(daVar.a(), (Rect) kVar.b()), false, eVar);
        return userLocationOffset == h.c.a.a.f48038a ? userLocationOffset : h.ab.f48028a;
    }

    fp(gb gbVar, com.waze.map.canvas.a.e eVar, int i2) {
        this.f28983c = i2;
        this.f28982b = gbVar;
        this.f28981a = eVar;
    }
}
