package com.waze.jni.protos.canvas;

import com.waze.jni.protos.canvas.LocationPickerCanvas;
import com.waze.jni.protos.canvas.LocationPickerCanvasKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LocationPickerCanvasKtKt {
    /* renamed from: -initializelocationPickerCanvas, reason: not valid java name */
    public static final LocationPickerCanvas m26067initializelocationPickerCanvas(l<? super LocationPickerCanvasKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LocationPickerCanvasKt.Dsl.Companion companion = LocationPickerCanvasKt.Dsl.Companion;
        LocationPickerCanvas.Builder builderNewBuilder = LocationPickerCanvas.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LocationPickerCanvasKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LocationPickerCanvas copy(LocationPickerCanvas locationPickerCanvas, l<? super LocationPickerCanvasKt.Dsl, ab> lVar) {
        x.f(locationPickerCanvas, "<this>");
        x.f(lVar, "block");
        LocationPickerCanvasKt.Dsl.Companion companion = LocationPickerCanvasKt.Dsl.Companion;
        LocationPickerCanvas.Builder builder = locationPickerCanvas.toBuilder();
        x.e(builder, "toBuilder(...)");
        LocationPickerCanvasKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
