package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gt implements com.waze.map.isolated.ad {
    @Override // com.waze.map.isolated.ad
    public final com.waze.map.isolated.ab a(String str, com.waze.map.isolated.d dVar) {
        h.g.b.x.f(str, "canvasTag");
        h.g.b.x.f(dVar, "view");
        return new NativeCanvasRenderer(str, dVar);
    }
}
