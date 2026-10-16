package com.waze.car_lib.i.a;

import android.graphics.Rect;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements SurfaceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f19890a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19891b;

    m(Object obj, int i2) {
        this.f19891b = i2;
        this.f19890a = obj;
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onClick(float f2, float f3) {
        int i2 = this.f19891b;
        Object obj = this.f19890a;
        if (i2 != 0) {
            ((a) obj).f19837b.a();
            return;
        }
        j jVar = ((o) obj).f19895c;
        if (jVar != null) {
            jVar.c(f2, f3);
        }
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onFling(float f2, float f3) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onScale(float f2, float f3, float f4) {
        int i2 = this.f19891b;
        Object obj = this.f19890a;
        if (i2 != 0) {
            ((a) obj).f19837b.a();
            return;
        }
        j jVar = ((o) obj).f19895c;
        if (jVar != null) {
            jVar.d(f2, f3, f4);
        }
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onScroll(float f2, float f3) {
        int i2 = this.f19891b;
        Object obj = this.f19890a;
        if (i2 != 0) {
            ((a) obj).f19837b.a();
            return;
        }
        j jVar = ((o) obj).f19895c;
        if (jVar != null) {
            jVar.e(f2, f3);
        }
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onStableAreaChanged(Rect rect) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onSurfaceAvailable(SurfaceContainer surfaceContainer) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onSurfaceDestroyed(SurfaceContainer surfaceContainer) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onVisibleAreaChanged(Rect rect) {
    }
}
