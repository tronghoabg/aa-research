package androidx.car.app.utils;

import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.HostException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RemoteUtils {

    /* compiled from: WazeSource */
    public interface HostCall {
        Object dispatch();
    }

    /* compiled from: WazeSource */
    public interface RemoteCall<ReturnT> {
        ReturnT call();
    }

    /* compiled from: WazeSource */
    class SurfaceCallbackStub extends ISurfaceCallback.Stub {
        private final Lifecycle mLifecycle;
        private SurfaceCallback mSurfaceCallback;

        SurfaceCallbackStub(Lifecycle lifecycle, SurfaceCallback surfaceCallback) {
            this.mLifecycle = lifecycle;
            this.mSurfaceCallback = surfaceCallback;
            lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.utils.RemoteUtils.SurfaceCallbackStub.1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                    x.f(lifecycleOwner, "owner");
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    SurfaceCallbackStub.this.mSurfaceCallback = null;
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                    x.f(lifecycleOwner, "owner");
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                    x.f(lifecycleOwner, "owner");
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                    x.f(lifecycleOwner, "owner");
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                    x.f(lifecycleOwner, "owner");
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onClick$7$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1664xa15b6dc7(float f2, float f3) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onClick(f2, f3);
            return null;
        }

        /* renamed from: lambda$onFling$5$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1665xdfc586b5(float f2, float f3) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onFling(f2, f3);
            return null;
        }

        /* renamed from: lambda$onScale$6$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1666x6ea0bd66(float f2, float f3, float f4) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onScale(f2, f3, f4);
            return null;
        }

        /* renamed from: lambda$onScroll$4$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1667x3d2f790d(float f2, float f3) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onScroll(f2, f3);
            return null;
        }

        /* renamed from: lambda$onStableAreaChanged$2$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1668x93973048(Rect rect) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onStableAreaChanged(rect);
            return null;
        }

        /* renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1669x37c861a2(Bundleable bundleable) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onSurfaceAvailable((SurfaceContainer) bundleable.get());
            return null;
        }

        /* renamed from: lambda$onSurfaceDestroyed$3$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1670xde96e8ef(Bundleable bundleable) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onSurfaceDestroyed((SurfaceContainer) bundleable.get());
            return null;
        }

        /* renamed from: lambda$onVisibleAreaChanged$1$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1671xaf1354a8(Rect rect) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onVisibleAreaChanged(rect);
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(5)
        public void onClick(final float f2, final float f3) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onClick", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1664xa15b6dc7(f2, f3);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(2)
        public void onFling(final float f2, final float f3) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onFling", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda5
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1665xdfc586b5(f2, f3);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(2)
        public void onScale(final float f2, final float f3, final float f4) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onScale", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda6
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1666x6ea0bd66(f2, f3, f4);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(2)
        public void onScroll(final float f2, final float f3) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onScroll", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda4
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1667x3d2f790d(f2, f3);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda7
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1668x93973048(rect);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda3
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1669x37c861a2(bundleable);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(final Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1670xde96e8ef(bundleable);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new HostCall() { // from class: androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub$$ExternalSyntheticLambda2
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1671xaf1354a8(rect);
                }
            });
        }
    }

    private RemoteUtils() {
    }

    public static IOnDoneCallback createOnDoneCallbackStub(final OnDoneCallback onDoneCallback) {
        return new IOnDoneCallback.Stub() { // from class: androidx.car.app.utils.RemoteUtils.1
            @Override // androidx.car.app.IOnDoneCallback
            public int getInterfaceVersion() {
                return 1;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(Bundleable bundleable) {
                onDoneCallback.onFailure(bundleable);
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(Bundleable bundleable) {
                onDoneCallback.onSuccess(bundleable);
            }
        };
    }

    public static void dispatchCallFromHost(final IOnDoneCallback iOnDoneCallback, final String str, final HostCall hostCall) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RemoteUtils.lambda$dispatchCallFromHost$0(iOnDoneCallback, str, hostCall);
            }
        });
    }

    public static void dispatchCallToHost(String str, RemoteCall<?> remoteCall) {
        try {
            dispatchCallToHostForResult(str, remoteCall);
        } catch (RemoteException e2) {
            Log.e(LogTags.TAG_DISPATCH, "Host unresponsive when dispatching call ".concat(String.valueOf(str)), e2);
        }
    }

    public static <ReturnT> ReturnT dispatchCallToHostForResult(String str, RemoteCall<ReturnT> remoteCall) {
        try {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "Dispatching call " + str + " to host");
            }
            return remoteCall.call();
        } catch (SecurityException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw new HostException("Remote " + str + " call failed", e3);
        }
    }

    static /* synthetic */ void lambda$dispatchCallFromHost$0(IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        try {
            sendSuccessResponseToHost(iOnDoneCallback, str, hostCall.dispatch());
        } catch (BundlerException e2) {
            sendFailureResponseToHost(iOnDoneCallback, str, e2);
        } catch (RuntimeException e3) {
            sendFailureResponseToHost(iOnDoneCallback, str, e3);
            throw new RuntimeException(e3);
        }
    }

    static /* synthetic */ void lambda$dispatchCallFromHost$1(Lifecycle lifecycle, IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        if (lifecycle != null && lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            dispatchCallFromHost(iOnDoneCallback, str, hostCall);
        } else {
            Objects.toString(hostCall);
            sendFailureResponseToHost(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching ".concat(String.valueOf(hostCall))));
        }
    }

    static /* synthetic */ void lambda$dispatchCallFromHost$2(Lifecycle lifecycle, HostCall hostCall, String str) {
        if (lifecycle != null) {
            try {
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    hostCall.dispatch();
                    return;
                }
            } catch (BundlerException e2) {
                Log.e(LogTags.TAG_DISPATCH, "Serialization failure in ".concat(String.valueOf(str)), e2);
                return;
            }
        }
        Log.w(LogTags.TAG_DISPATCH, "Lifecycle is not at least created when dispatching " + hostCall);
    }

    static /* synthetic */ Object lambda$sendFailureResponseToHost$4(IOnDoneCallback iOnDoneCallback, Throwable th, String str) {
        try {
            iOnDoneCallback.onFailure(Bundleable.create(new FailureResponse(th)));
            return null;
        } catch (BundlerException e2) {
            Log.e(LogTags.TAG_DISPATCH, "Serialization failure in ".concat(String.valueOf(str)), e2);
            return null;
        }
    }

    static /* synthetic */ Object lambda$sendSuccessResponseToHost$3(IOnDoneCallback iOnDoneCallback, Object obj, String str) {
        Bundleable bundleableCreate;
        if (obj == null) {
            bundleableCreate = null;
        } else {
            try {
                bundleableCreate = Bundleable.create(obj);
            } catch (BundlerException e2) {
                sendFailureResponseToHost(iOnDoneCallback, str, e2);
            }
        }
        iOnDoneCallback.onSuccess(bundleableCreate);
        return null;
    }

    public static void sendFailureResponseToHost(final IOnDoneCallback iOnDoneCallback, final String str, final Throwable th) {
        dispatchCallToHost(String.valueOf(str).concat(" onFailure"), new RemoteCall() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                RemoteUtils.lambda$sendFailureResponseToHost$4(iOnDoneCallback, th, str);
                return null;
            }
        });
    }

    public static void sendSuccessResponseToHost(final IOnDoneCallback iOnDoneCallback, final String str, final Object obj) {
        dispatchCallToHost(String.valueOf(str).concat(" onSuccess"), new RemoteCall() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                RemoteUtils.lambda$sendSuccessResponseToHost$3(iOnDoneCallback, obj, str);
                return null;
            }
        });
    }

    public static ISurfaceCallback stubSurfaceCallback(Lifecycle lifecycle, SurfaceCallback surfaceCallback) {
        if (surfaceCallback == null) {
            return null;
        }
        return new SurfaceCallbackStub(lifecycle, surfaceCallback);
    }

    public static void dispatchCallFromHost(final Lifecycle lifecycle, final IOnDoneCallback iOnDoneCallback, final String str, final HostCall hostCall) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                RemoteUtils.lambda$dispatchCallFromHost$1(lifecycle, iOnDoneCallback, str, hostCall);
            }
        });
    }

    public static void dispatchCallFromHost(final Lifecycle lifecycle, final String str, final HostCall hostCall) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RemoteUtils.lambda$dispatchCallFromHost$2(lifecycle, hostCall, str);
            }
        });
    }
}
