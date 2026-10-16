package androidx.car.app.utils;

import android.graphics.Rect;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.serialization.Bundleable;
import defpackage.ept;
import defpackage.ra;
import defpackage.tr;
import defpackage.xr;
import defpackage.xy;
import defpackage.yi;

/* loaded from: classes2.dex */
public class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final ept mLifecycle;
    private ra mSurfaceCallback;

    RemoteUtils$SurfaceCallbackStub(ept eptVar, ra raVar) {
        this.mLifecycle = eptVar;
        this.mSurfaceCallback = raVar;
        eptVar.c(new yi(this));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public int getInterfaceVersion() {
        return 1;
    }

    /* renamed from: lambda$onClick$7$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m166xa15b6dc7(float f, float f2) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.a();
        return null;
    }

    /* renamed from: lambda$onFling$5$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m167xdfc586b5(float f, float f2) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.b();
        return null;
    }

    /* renamed from: lambda$onScale$6$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m168x6ea0bd66(float f, float f2, float f3) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.c();
        return null;
    }

    /* renamed from: lambda$onScroll$4$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m169x3d2f790d(float f, float f2) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.d();
        return null;
    }

    /* renamed from: lambda$onStableAreaChanged$2$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m170x93973048(Rect rect) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.e();
        return null;
    }

    /* renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m171x37c861a2(Bundleable bundleable) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.f();
        return null;
    }

    /* renamed from: lambda$onSurfaceDestroyed$3$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m172xde96e8ef(Bundleable bundleable) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.g();
        return null;
    }

    /* renamed from: lambda$onVisibleAreaChanged$1$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ Object m173xaf1354a8(Rect rect) throws xr {
        ra raVar = this.mSurfaceCallback;
        if (raVar == null) {
            return null;
        }
        raVar.h();
        return null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(final float f, final float f2) throws RemoteException {
        tr.c(this.mLifecycle, "onClick", new xy() { // from class: yb
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m166xa15b6dc7(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(final float f, final float f2) {
        tr.c(this.mLifecycle, "onFling", new xy() { // from class: yf
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m167xdfc586b5(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        tr.c(this.mLifecycle, "onScale", new xy() { // from class: yg
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m168x6ea0bd66(f, f2, f3);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(final float f, final float f2) {
        tr.c(this.mLifecycle, "onScroll", new xy() { // from class: ye
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m169x3d2f790d(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
        tr.d(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new xy() { // from class: yh
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m170x93973048(rect);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
        tr.d(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new xy() { // from class: yd
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m171x37c861a2(bundleable);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
        tr.d(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new xy() { // from class: ya
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m172xde96e8ef(bundleable);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
        tr.d(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new xy() { // from class: yc
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m173xaf1354a8(rect);
            }
        });
    }
}
