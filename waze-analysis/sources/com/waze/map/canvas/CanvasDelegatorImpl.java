package com.waze.map.canvas;

import android.graphics.Bitmap;
import com.waze.jni.protos.CanvasSpeedometer;
import com.waze.jni.protos.common.RawImage;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class CanvasDelegatorImpl {

    /* renamed from: a, reason: collision with root package name */
    private final ch f28477a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f28478b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28479c;

    public CanvasDelegatorImpl(ch chVar, Executor executor, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(chVar, "mapStateFlow");
        h.g.b.x.f(executor, "nativeThreadExecutor");
        h.g.b.x.f(eVar, "logger");
        this.f28477a = chVar;
        this.f28478b = executor;
        this.f28479c = eVar;
    }

    static final h.ab b(CanvasDelegatorImpl canvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeHidePill(str);
        return h.ab.f48028a;
    }

    static final h.ab c(CanvasDelegatorImpl canvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeHideMapLoader(str);
        return h.ab.f48028a;
    }

    static final h.ab d(CanvasDelegatorImpl canvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeOnOverlayHidden(str);
        return h.ab.f48028a;
    }

    static final h.ab e(CanvasDelegatorImpl canvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeOnOverlayShown(str);
        return h.ab.f48028a;
    }

    static final h.ab f(CanvasDelegatorImpl canvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeShowMapLoader(str);
        return h.ab.f48028a;
    }

    static final h.ab g(CanvasDelegatorImpl canvasDelegatorImpl, Bitmap bitmap, String str) {
        h.g.b.x.f(str, "it");
        byte[] byteArray = t(bitmap).toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        canvasDelegatorImpl.nativeShowPillForCurrentStreet(str, byteArray);
        return h.ab.f48028a;
    }

    static final h.ab h(CanvasDelegatorImpl canvasDelegatorImpl, Bitmap bitmap, String str) {
        h.g.b.x.f(str, "it");
        byte[] byteArray = t(bitmap).toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        canvasDelegatorImpl.nativeShowPillForTraffic(str, byteArray);
        return h.ab.f48028a;
    }

    static final h.ab i(CanvasDelegatorImpl canvasDelegatorImpl, Bitmap bitmap, String str) {
        h.g.b.x.f(str, "it");
        byte[] byteArray = t(bitmap).toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        canvasDelegatorImpl.nativeShowPillForTraffic(str, byteArray);
        return h.ab.f48028a;
    }

    static final h.ab j(CanvasDelegatorImpl canvasDelegatorImpl, Bitmap bitmap, String str) {
        h.g.b.x.f(str, "it");
        byte[] byteArray = t(bitmap).toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        canvasDelegatorImpl.nativeShowPillForTraffic(str, byteArray);
        return h.ab.f48028a;
    }

    static final h.ab k(CanvasDelegatorImpl canvasDelegatorImpl, CanvasSpeedometer canvasSpeedometer, String str) {
        h.g.b.x.f(str, "canvasId");
        byte[] byteArray = canvasSpeedometer.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        canvasDelegatorImpl.nativeUpdateSpeedometer(str, byteArray);
        return h.ab.f48028a;
    }

    static final h.ab l(CanvasDelegatorImpl canvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeZoomIn(str);
        return h.ab.f48028a;
    }

    static final h.ab m(CanvasDelegatorImpl canvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeZoomOut(str);
        return h.ab.f48028a;
    }

    static final h.ab n(CanvasDelegatorImpl canvasDelegatorImpl, float f2, String str) {
        h.g.b.x.f(str, "it");
        canvasDelegatorImpl.nativeZoomToRate(str, m.e(f2));
        return h.ab.f48028a;
    }

    private final native void nativeHideMapLoader(String str);

    private final native void nativeHidePill(String str);

    private final native void nativeOnOverlayHidden(String str);

    private final native void nativeOnOverlayShown(String str);

    private final native void nativeShowMapLoader(String str);

    private final native void nativeShowPillForCurrentStreet(String str, byte[] bArr);

    private final native void nativeShowPillForTraffic(String str, byte[] bArr);

    private final native void nativeUpdateSpeedometer(String str, byte[] bArr);

    private final native void nativeZoomIn(String str);

    private final native void nativeZoomOut(String str);

    private final native void nativeZoomToRate(String str, float f2);

    static final void p(CanvasDelegatorImpl canvasDelegatorImpl, String str, h.g.a.l lVar) {
        String strS = canvasDelegatorImpl.s();
        canvasDelegatorImpl.f28479c.a("canvasId(" + strS + ") - will invoke " + str);
        lVar.invoke(strS);
    }

    static final void r(CanvasDelegatorImpl canvasDelegatorImpl, String str, h.g.a.l lVar) {
        String strS = canvasDelegatorImpl.s();
        if (strS == null) {
            canvasDelegatorImpl.f28479c.g("canvasId is null (no active canvas), can't invoke ".concat(str));
            return;
        }
        canvasDelegatorImpl.f28479c.a("canvasId(" + strS + ") - will invoke " + str);
        lVar.invoke(strS);
    }

    private final String s() {
        return com.waze.an.a.a.bd.g((com.waze.an.a.a.bd) this.f28477a.d());
    }

    private static final RawImage t(Bitmap bitmap) {
        RawImage.Builder builderNewBuilder = RawImage.newBuilder();
        h.g.b.x.f(bitmap, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        h.g.b.x.e(byteBufferAllocate, "allocate(...)");
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        h.g.b.x.e(bArrArray, "array(...)");
        builderNewBuilder.setData(com.waze.sharedui.e.e.b(bArrArray));
        builderNewBuilder.setWidth(bitmap.getWidth());
        builderNewBuilder.setHeight(bitmap.getHeight());
        RawImage rawImageBuild = builderNewBuilder.build();
        h.g.b.x.e(rawImageBuild, "let(...)");
        return rawImageBuild;
    }

    protected final com.waze.shared_infra.i.e a() {
        return this.f28479c;
    }

    public final void o(String str, h.g.a.l lVar) {
        h.g.b.x.f(str, "description");
        h.g.b.x.f(lVar, "block");
        this.f28478b.execute(new i(this, str, lVar, 1));
    }

    public final void q(String str, h.g.a.l lVar) {
        h.g.b.x.f(str, "description");
        h.g.b.x.f(lVar, "block");
        this.f28478b.execute(new i(this, str, lVar, 0));
    }
}
