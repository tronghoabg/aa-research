package androidx.credentials.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MutableContextTracker {
    public static final MutableContextTracker INSTANCE = new MutableContextTracker();

    /* compiled from: WazeSource */
    final class ReconstructedActivityLifecycleCallback extends EmptyActivityLifecycleCallbacks {
        private WeakReference<Activity> currentActivityRef;
        private final Class<Activity> initialActivityClass;
        private boolean isReconstructing;
        private final int taskId;
        private final WeakReference<MutableContextWrapper> wrapperRef;

        public ReconstructedActivityLifecycleCallback(MutableContextWrapper mutableContextWrapper, Activity activity) {
            x.f(mutableContextWrapper, "wrapper");
            x.f(activity, "initialActivity");
            this.wrapperRef = new WeakReference<>(mutableContextWrapper);
            this.initialActivityClass = activity.getClass();
            this.taskId = activity.getTaskId();
            this.currentActivityRef = new WeakReference<>(activity);
        }

        @Override // androidx.credentials.internal.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            x.f(activity, "activity");
            MutableContextWrapper mutableContextWrapper = this.wrapperRef.get();
            if (mutableContextWrapper == null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                return;
            }
            if (this.isReconstructing && x.n(activity.getClass(), this.initialActivityClass) && activity.getTaskId() == this.taskId) {
                mutableContextWrapper.setBaseContext(activity);
                this.currentActivityRef = new WeakReference<>(activity);
                this.isReconstructing = false;
            }
        }

        @Override // androidx.credentials.internal.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            x.f(activity, "activity");
            MutableContextWrapper mutableContextWrapper = this.wrapperRef.get();
            if (mutableContextWrapper == null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                return;
            }
            if (activity == this.currentActivityRef.get()) {
                if (activity.isChangingConfigurations()) {
                    this.isReconstructing = true;
                } else {
                    mutableContextWrapper.setBaseContext(activity.getApplicationContext());
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                }
            }
        }
    }

    private MutableContextTracker() {
    }

    private final Activity getBaseActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            x.e(context, "getBaseContext(...)");
        }
        return null;
    }

    private final TrackingToken track(MutableContextWrapper mutableContextWrapper) {
        final Application application;
        Context baseContext = mutableContextWrapper.getBaseContext();
        x.c(baseContext);
        Activity baseActivity = getBaseActivity(baseContext);
        if (baseActivity == null || (application = baseActivity.getApplication()) == null) {
            return null;
        }
        final ReconstructedActivityLifecycleCallback reconstructedActivityLifecycleCallback = new ReconstructedActivityLifecycleCallback(mutableContextWrapper, baseActivity);
        application.registerActivityLifecycleCallbacks(reconstructedActivityLifecycleCallback);
        return new TrackingToken() { // from class: androidx.credentials.internal.MutableContextTracker.track.1
            private final AtomicBoolean unregistered = new AtomicBoolean(false);

            @Override // androidx.credentials.internal.TrackingToken
            public void unregister() {
                if (this.unregistered.compareAndSet(false, true)) {
                    application.unregisterActivityLifecycleCallbacks(reconstructedActivityLifecycleCallback);
                }
            }
        };
    }

    static final void wrapCallback$lambda$0(TrackingToken trackingToken) {
        if (trackingToken != null) {
            trackingToken.unregister();
        }
    }

    public final <T, E extends Exception> CredentialManagerCallback<T, E> wrapCallback(Context context, CancellationSignal cancellationSignal, final CredentialManagerCallback<T, E> credentialManagerCallback) {
        x.f(context, "context");
        x.f(credentialManagerCallback, "callback");
        if (!(context instanceof MutableContextWrapper)) {
            return credentialManagerCallback;
        }
        final TrackingToken trackingTokenTrack = track((MutableContextWrapper) context);
        CredentialManagerCallback<T, E> credentialManagerCallback2 = new CredentialManagerCallback() { // from class: androidx.credentials.internal.MutableContextTracker$wrapCallback$wrappedCallback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(Exception exc) {
                x.f(exc, "e");
                TrackingToken trackingToken = trackingTokenTrack;
                if (trackingToken != null) {
                    trackingToken.unregister();
                }
                credentialManagerCallback.onError(exc);
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(Object obj) {
                TrackingToken trackingToken = trackingTokenTrack;
                if (trackingToken != null) {
                    trackingToken.unregister();
                }
                credentialManagerCallback.onResult(obj);
            }
        };
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.credentials.internal.MutableContextTracker$$ExternalSyntheticLambda0
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    MutableContextTracker.wrapCallback$lambda$0(trackingTokenTrack);
                }
            });
        }
        return credentialManagerCallback2;
    }
}
