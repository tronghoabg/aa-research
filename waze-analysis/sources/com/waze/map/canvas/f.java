package com.waze.map.canvas;

import android.graphics.Bitmap;
import com.waze.jni.protos.CanvasSpeedometer;
import com.waze.jni.protos.main_canvas.CenterOnPositionRequest;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28632b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28633c;

    public /* synthetic */ f(CanvasDelegatorImpl canvasDelegatorImpl, Object obj, int i2) {
        this.f28633c = i2;
        this.f28631a = canvasDelegatorImpl;
        this.f28632b = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f28633c) {
            case 0:
                Object obj2 = this.f28632b;
                return CanvasDelegatorImpl.j((CanvasDelegatorImpl) this.f28631a, (Bitmap) obj2, (String) obj);
            case 1:
                Object obj3 = this.f28632b;
                return CanvasDelegatorImpl.i((CanvasDelegatorImpl) this.f28631a, (Bitmap) obj3, (String) obj);
            case 2:
                Object obj4 = this.f28632b;
                return CanvasDelegatorImpl.k((CanvasDelegatorImpl) this.f28631a, (CanvasSpeedometer) obj4, (String) obj);
            case 3:
                Object obj5 = this.f28632b;
                return CanvasDelegatorImpl.g((CanvasDelegatorImpl) this.f28631a, (Bitmap) obj5, (String) obj);
            case 4:
                Object obj6 = this.f28632b;
                return CanvasDelegatorImpl.h((CanvasDelegatorImpl) this.f28631a, (Bitmap) obj6, (String) obj);
            case 5:
                Object obj7 = this.f28632b;
                return MainCanvasDelegatorImpl.y((MainCanvasDelegatorImpl) this.f28631a, (CenterOnPositionRequest) obj7, (String) obj);
            case 6:
                return MainCanvasDelegatorImpl.V((MainCanvasDelegatorImpl) this.f28632b, (com.waze.shared_infra.l.a) this.f28631a);
            default:
                return MainCanvasDelegatorImpl.Y((MainCanvasDelegatorImpl) this.f28632b, (com.waze.shared_infra.h.c) this.f28631a);
        }
    }

    public /* synthetic */ f(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, Object obj, int i2) {
        this.f28633c = i2;
        this.f28632b = mainCanvasDelegatorImpl;
        this.f28631a = obj;
    }
}
