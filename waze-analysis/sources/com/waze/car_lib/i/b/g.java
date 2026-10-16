package com.waze.car_lib.i.b;

import android.graphics.Bitmap;
import com.waze.jni.protos.CanvasSpeedometer;
import com.waze.map.canvas.CanvasDelegatorImpl;
import com.waze.map.em;
import com.waze.map.en;
import com.waze.map.eo;
import com.waze.map.ep;
import com.waze.map.isolated.WazeMapWidgetNativeRenderer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f19990a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19991b;

    g(Object obj, int i2) {
        this.f19991b = i2;
        this.f19990a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f19991b;
        if (i2 == 0) {
            s sVar = (s) ((h.k) obj).a();
            com.waze.bv.h hVarA = sVar.a();
            int i3 = hVarA.f17517a;
            String str = hVarA.f17518b;
            boolean z = hVarA.f17519c;
            int i4 = hVarA.f17520d;
            boolean z2 = hVarA.f17521e;
            boolean z3 = hVarA.f17522f;
            boolean z4 = hVarA.f17523g;
            boolean z5 = hVarA.f17524h;
            boolean zB = sVar.b();
            h.g.b.x.f(str, "units");
            CanvasSpeedometer.Builder builderNewBuilder = CanvasSpeedometer.newBuilder();
            builderNewBuilder.setVisible(z2);
            builderNewBuilder.setSpeed(i3);
            builderNewBuilder.setSpeedUnits(str);
            builderNewBuilder.setSpeedLimitEnabled(z4);
            builderNewBuilder.setSpeedLimit(i4);
            builderNewBuilder.setSpeedLimitUsStyle(z);
            builderNewBuilder.setShouldAdjustBottomOffset(zB);
            CanvasSpeedometer canvasSpeedometerBuild = builderNewBuilder.build();
            h.g.b.x.e(canvasSpeedometerBuild, "build(...)");
            CanvasSpeedometer canvasSpeedometer = canvasSpeedometerBuild;
            CanvasDelegatorImpl canvasDelegatorImpl = (CanvasDelegatorImpl) this.f19990a;
            canvasDelegatorImpl.q("updateSpeedometer(" + canvasSpeedometer + ")", new com.waze.map.canvas.f(canvasDelegatorImpl, canvasSpeedometer, 2));
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ((WazeMapWidgetNativeRenderer) this.f19990a).g((com.waze.bk.a.c) obj);
                return h.ab.f48028a;
            }
            boolean zBooleanValue = ((Boolean) ((h.k) obj).a()).booleanValue();
            Object obj2 = this.f19990a;
            if (zBooleanValue) {
                CanvasDelegatorImpl canvasDelegatorImpl2 = (CanvasDelegatorImpl) obj2;
                canvasDelegatorImpl2.q("showMapLoaderOnCanvas", new com.waze.map.canvas.h(canvasDelegatorImpl2, 3));
            } else {
                CanvasDelegatorImpl canvasDelegatorImpl3 = (CanvasDelegatorImpl) obj2;
                canvasDelegatorImpl3.q("hideMapLoaderFromCanvas", new com.waze.map.canvas.h(canvasDelegatorImpl3, 0));
            }
            return h.ab.f48028a;
        }
        com.waze.map.canvas.m mVar = (com.waze.map.canvas.m) obj;
        Object obj3 = this.f19990a;
        if (mVar != null) {
            h.g.b.x.f(mVar, "pillBitmap");
            Bitmap bitmapF = mVar.f();
            if (mVar instanceof eo) {
                CanvasDelegatorImpl canvasDelegatorImpl4 = (CanvasDelegatorImpl) obj3;
                canvasDelegatorImpl4.q(b.b(bitmapF, "updateMapCurrentStreetPill(size:"), new com.waze.map.canvas.f(canvasDelegatorImpl4, bitmapF, 3));
            } else if (mVar instanceof ep) {
                CanvasDelegatorImpl canvasDelegatorImpl5 = (CanvasDelegatorImpl) obj3;
                canvasDelegatorImpl5.q(b.b(bitmapF, "updateMapTrafficMeterPill(size:"), new com.waze.map.canvas.f(canvasDelegatorImpl5, bitmapF, 4));
            } else if (mVar instanceof em) {
                CanvasDelegatorImpl canvasDelegatorImpl6 = (CanvasDelegatorImpl) obj3;
                canvasDelegatorImpl6.q(b.b(bitmapF, "updateMapTrafficMeterPill(size:"), new com.waze.map.canvas.f(canvasDelegatorImpl6, bitmapF, 1));
            } else {
                if (!(mVar instanceof en)) {
                    throw new h.i();
                }
                CanvasDelegatorImpl canvasDelegatorImpl7 = (CanvasDelegatorImpl) obj3;
                canvasDelegatorImpl7.q(b.b(bitmapF, "updateMapTrafficMeterPill(size:"), new com.waze.map.canvas.f(canvasDelegatorImpl7, bitmapF, 0));
            }
        } else {
            CanvasDelegatorImpl canvasDelegatorImpl8 = (CanvasDelegatorImpl) obj3;
            canvasDelegatorImpl8.q("clearBottomPill", new com.waze.map.canvas.h(canvasDelegatorImpl8, 6));
        }
        return h.ab.f48028a;
    }
}
