package com.waze.car_lib.i.a;

import androidx.car.app.SurfaceCallback;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.waze.z.a.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f19861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19862b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19863c;

    public /* synthetic */ e(float f2, float f3, int i2) {
        this.f19863c = i2;
        this.f19861a = f2;
        this.f19862b = f3;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f19863c;
        if (i2 == 0) {
            SurfaceCallback surfaceCallback = (SurfaceCallback) obj;
            h.g.b.x.f(surfaceCallback, "$this$invokeAll");
            surfaceCallback.onClick(this.f19861a, this.f19862b);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            SurfaceCallback surfaceCallback2 = (SurfaceCallback) obj;
            h.g.b.x.f(surfaceCallback2, "$this$invokeAll");
            surfaceCallback2.onScroll(this.f19861a, this.f19862b);
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            int i3 = aj.f45635a;
            h.g.b.x.f((Density) obj, "$this$offset");
            return IntOffset.m11287boximpl(((int) (this.f19861a * this.f19862b)) << 32);
        }
        SurfaceCallback surfaceCallback3 = (SurfaceCallback) obj;
        h.g.b.x.f(surfaceCallback3, "$this$invokeAll");
        surfaceCallback3.onFling(this.f19861a, this.f19862b);
        return h.ab.f48028a;
    }
}
