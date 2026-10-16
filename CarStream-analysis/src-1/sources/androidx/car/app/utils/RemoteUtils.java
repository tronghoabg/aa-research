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
import defpackage.a7;
import defpackage.ad;
import defpackage.d0;
import defpackage.i9;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class RemoteUtils {

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface HostCall {
        Object dispatch();
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface RemoteCall<ReturnT> {
        ReturnT call();
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class SurfaceCallbackStub extends ISurfaceCallback.Stub {
        private final Lifecycle mLifecycle;
        private SurfaceCallback mSurfaceCallback;

        public SurfaceCallbackStub(Lifecycle lifecycle, SurfaceCallback surfaceCallback) {
            this.mLifecycle = lifecycle;
            this.mSurfaceCallback = surfaceCallback;
            lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.utils.RemoteUtils.SurfaceCallbackStub.1
                @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    SurfaceCallbackStub.this.mSurfaceCallback = null;
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$7(float f, float f2) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onClick(f, f2);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onFling$5(float f, float f2) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onFling(f, f2);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onScale(f, f2, f3);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onScroll$4(float f, float f2) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onScroll(f, f2);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onStableAreaChanged(rect);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSurfaceAvailable$0(Bundleable bundleable) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onSurfaceAvailable((SurfaceContainer) bundleable.get());
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSurfaceDestroyed$3(Bundleable bundleable) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onSurfaceDestroyed((SurfaceContainer) bundleable.get());
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
            SurfaceCallback surfaceCallback = this.mSurfaceCallback;
            if (surfaceCallback == null) {
                return null;
            }
            surfaceCallback.onVisibleAreaChanged(rect);
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(5)
        public void onClick(float f, float f2) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onClick", new b(this, f, f2, 0));
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(2)
        public void onFling(float f, float f2) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onFling", new b(this, f, f2, 2));
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(2)
        public void onScale(final float f, final float f2, final float f3) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onScale", new HostCall() { // from class: androidx.car.app.utils.d
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.a.lambda$onScale$6(f, f2, f3);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        @RequiresCarApi(2)
        public void onScroll(float f, float f2) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, "onScroll", new b(this, f, f2, 1));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new c(this, rect, 1));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new a(this, bundleable, 1));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new a(this, bundleable, 0));
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new c(this, rect, 0));
        }
    }

    private RemoteUtils() {
    }

    public static IOnDoneCallback createOnDoneCallbackStub(final OnDoneCallback onDoneCallback) {
        return new IOnDoneCallback.Stub() { // from class: androidx.car.app.utils.RemoteUtils.1
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

    public static void dispatchCallFromHost(IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        ThreadUtils.runOnMain(new d0(iOnDoneCallback, str, hostCall, 3));
    }

    public static void dispatchCallToHost(String str, RemoteCall<?> remoteCall) {
        try {
            dispatchCallToHostForResult(str, remoteCall);
        } catch (RemoteException unused) {
        }
    }

    public static <ReturnT> ReturnT dispatchCallToHostForResult(String str, RemoteCall<ReturnT> remoteCall) {
        try {
            Log.isLoggable(LogTags.TAG, 3);
            return remoteCall.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new HostException(ad.d("Remote ", str, " call failed"), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchCallFromHost$0(IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        try {
            sendSuccessResponseToHost(iOnDoneCallback, str, hostCall.dispatch());
        } catch (BundlerException e) {
            sendFailureResponseToHost(iOnDoneCallback, str, e);
        } catch (RuntimeException e2) {
            sendFailureResponseToHost(iOnDoneCallback, str, e2);
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchCallFromHost$1(Lifecycle lifecycle, IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        if (lifecycle != null && lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            dispatchCallFromHost(iOnDoneCallback, str, hostCall);
            return;
        }
        sendFailureResponseToHost(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + hostCall));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchCallFromHost$2(Lifecycle lifecycle, HostCall hostCall, String str) {
        if (lifecycle != null) {
            try {
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    hostCall.dispatch();
                    return;
                }
            } catch (BundlerException unused) {
                return;
            }
        }
        Objects.toString(hostCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$sendFailureResponseToHost$4(IOnDoneCallback iOnDoneCallback, Throwable th, String str) {
        try {
            iOnDoneCallback.onFailure(Bundleable.create(new FailureResponse(th)));
            return null;
        } catch (BundlerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$sendSuccessResponseToHost$3(IOnDoneCallback iOnDoneCallback, Object obj, String str) {
        Bundleable bundleableCreate;
        if (obj == null) {
            bundleableCreate = null;
        } else {
            try {
                bundleableCreate = Bundleable.create(obj);
            } catch (BundlerException e) {
                sendFailureResponseToHost(iOnDoneCallback, str, e);
            }
        }
        iOnDoneCallback.onSuccess(bundleableCreate);
        return null;
    }

    public static void sendFailureResponseToHost(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        dispatchCallToHost(ad.c(str, " onFailure"), new i9(iOnDoneCallback, th, str, 1));
    }

    public static void sendSuccessResponseToHost(IOnDoneCallback iOnDoneCallback, String str, Object obj) {
        dispatchCallToHost(ad.c(str, " onSuccess"), new i9(iOnDoneCallback, obj, str, 0));
    }

    public static ISurfaceCallback stubSurfaceCallback(Lifecycle lifecycle, SurfaceCallback surfaceCallback) {
        if (surfaceCallback == null) {
            return null;
        }
        return new SurfaceCallbackStub(lifecycle, surfaceCallback);
    }

    public static void dispatchCallFromHost(Lifecycle lifecycle, IOnDoneCallback iOnDoneCallback, String str, HostCall hostCall) {
        ThreadUtils.runOnMain(new a7(lifecycle, iOnDoneCallback, str, hostCall, 1));
    }

    public static void dispatchCallFromHost(Lifecycle lifecycle, String str, HostCall hostCall) {
        ThreadUtils.runOnMain(new d0(lifecycle, hostCall, str));
    }
}
