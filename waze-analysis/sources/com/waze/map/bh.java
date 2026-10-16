package com.waze.map;

import com.waze.NativeManager;
import com.waze.jni.protos.MapAdObject;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class bh {
    public static final int $stable = 0;

    static final void onMapClickedJNI$lambda$0(bh bhVar) {
        h.g.b.x.d(bhVar, "null cannot be cast to non-null type com.waze.map.MapNativeManager");
        ((MapNativeManager) bhVar).onMapClicked();
    }

    static final void onMapDraggedJNI$lambda$0(bh bhVar) {
        h.g.b.x.d(bhVar, "null cannot be cast to non-null type com.waze.map.MapNativeManager");
        ((MapNativeManager) bhVar).onMapDragged();
    }

    static final void onMapIsDarkOverlayShownChangedJNI$lambda$0(bh bhVar, boolean z) {
        h.g.b.x.d(bhVar, "null cannot be cast to non-null type com.waze.map.MapNativeManager");
        ((MapNativeManager) bhVar).onMapIsDarkOverlayShownChanged(z);
    }

    static final void onMapObjectTappedJNI$lambda$0(bh bhVar, MapAdObject mapAdObject) {
        h.g.b.x.d(bhVar, "null cannot be cast to non-null type com.waze.map.MapNativeManager");
        ((MapNativeManager) bhVar).onMapObjectTapped(mapAdObject);
    }

    static final void onShareDriveCanvasDraggedJNI$lambda$0(bh bhVar) {
        h.g.b.x.d(bhVar, "null cannot be cast to non-null type com.waze.map.MapNativeManager");
        ((MapNativeManager) bhVar).onShareDriveCanvasDragged();
    }

    static final void onShareDriveCanvasTappedJNI$lambda$0(bh bhVar) {
        h.g.b.x.d(bhVar, "null cannot be cast to non-null type com.waze.map.MapNativeManager");
        ((MapNativeManager) bhVar).onShareDriveCanvasTapped();
    }

    protected final boolean isPopupShownWithTypeJNI(int i2) {
        return ((MapNativeManager) this).isPopupShownWithType(i2);
    }

    protected final void onMapClickedJNI() {
        NativeManager.runMainThreadTask(new bg(this, 1));
    }

    protected final void onMapDraggedJNI() {
        NativeManager.runMainThreadTask(new bg(this, 2));
    }

    protected final void onMapIsDarkOverlayShownChangedJNI(boolean z) {
        NativeManager.runMainThreadTask(new bf(this, z, 0));
    }

    protected final void onMapObjectTappedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "adObject");
        try {
            NativeManager.runMainThreadTask(new p(this, (MapAdObject) MapAdObject.parser().c(bArr), 7));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onShareDriveCanvasDraggedJNI() {
        NativeManager.runMainThreadTask(new bg(this, 0));
    }

    protected final void onShareDriveCanvasTappedJNI() {
        NativeManager.runMainThreadTask(new bg(this, 3));
    }
}
