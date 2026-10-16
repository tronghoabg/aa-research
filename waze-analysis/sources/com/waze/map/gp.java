package com.waze.map;

import com.waze.jni.protos.map.MapContent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class gp extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeMapNativeManager f29168a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MapContent f29169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gp(WazeMapNativeManager wazeMapNativeManager, MapContent mapContent, h.c.e eVar) {
        super(2, eVar);
        this.f29168a = wazeMapNativeManager;
        this.f29169b = mapContent;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new gp(this.f29168a, this.f29169b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gp) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        WazeMapNativeManager wazeMapNativeManager = this.f29168a;
        String str = wazeMapNativeManager.mapId;
        byte[] byteArray = this.f29169b.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        wazeMapNativeManager.nativePrepareMapContent(str, byteArray);
        return h.ab.f48028a;
    }
}
