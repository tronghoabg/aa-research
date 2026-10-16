package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.a.c;
import android.support.a.f;
import android.support.a.h;
import android.support.a.j;
import android.support.a.l;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    static final String TARGET_ORIGIN_KEY = "target_origin";
    private final f mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final j mService;

    /* compiled from: WazeSource */
    /* renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends l {
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ EngagementSignalsCallback val$callback;

        AnonymousClass1(EngagementSignalsCallback engagementSignalsCallback) {
            this.val$callback = engagementSignalsCallback;
        }

        @Override // android.support.a.m
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.a.m
        public void onGreatestScrollPercentageIncreased(final int i2, final Bundle bundle) {
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onGreatestScrollPercentageIncreased(i2, bundle);
                }
            });
        }

        @Override // android.support.a.m
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onSessionEnded(z, bundle);
                }
            });
        }

        @Override // android.support.a.m
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                }
            });
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends l {
        private final Executor mExecutor;
        final /* synthetic */ EngagementSignalsCallback val$callback;
        final /* synthetic */ Executor val$executor;

        AnonymousClass2(Executor executor, EngagementSignalsCallback engagementSignalsCallback) {
            this.val$executor = executor;
            this.val$callback = engagementSignalsCallback;
            this.mExecutor = executor;
        }

        @Override // android.support.a.m
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.a.m
        public void onGreatestScrollPercentageIncreased(final int i2, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onGreatestScrollPercentageIncreased(i2, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.a.m
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onSessionEnded(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.a.m
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    /* compiled from: WazeSource */
    public class PendingSession {
        private final CustomTabsCallback mCallback;
        private final PendingIntent mId;

        PendingSession(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        CustomTabsCallback getCallback() {
            return this.mCallback;
        }

        PendingIntent getId() {
            return this.mId;
        }
    }

    CustomTabsSession(j jVar, f fVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.mService = jVar;
        this.mCallback = fVar;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle createBundleWithId(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private l createEngagementSignalsCallbackWrapper(EngagementSignalsCallback engagementSignalsCallback) {
        return new AnonymousClass1(engagementSignalsCallback);
    }

    public static CustomTabsSession createMockSessionForTesting(ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    private Bundle createPostMessageExtraBundle(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(TARGET_ORIGIN_KEY, uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    ComponentName getComponentName() {
        return this.mComponentName;
    }

    PendingIntent getId() {
        return this.mId;
    }

    public boolean isEngagementSignalsApiAvailable(Bundle bundle) {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(String str, Bundle bundle) {
        int iPostMessage;
        Object obj = this.mLock;
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        synchronized (obj) {
            try {
                try {
                    iPostMessage = this.mService.postMessage(this.mCallback, str, bundleCreateBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public void prefetch(Uri uri, PrefetchOptions prefetchOptions) {
        try {
            this.mService.prefetch(this.mCallback, uri, createBundleWithId(prefetchOptions.toBundle()));
        } catch (RemoteException unused) {
        }
    }

    public boolean receiveFile(Uri uri, int i2, Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i2, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleCreatePostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (bundleCreatePostMessageExtraBundle == null) {
                return this.mService.requestPostMessageChannel(this.mCallback, uri);
            }
            bundle.putAll(bundleCreatePostMessageExtraBundle);
            return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setActionButton(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback), bundleCreateBundleWithId);
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i2, Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i2);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i2, Uri uri, Bundle bundle) {
        if (i2 > 0 && i2 <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i2, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    private l createEngagementSignalsCallbackWrapper(EngagementSignalsCallback engagementSignalsCallback, Executor executor) {
        return new AnonymousClass2(executor, engagementSignalsCallback);
    }

    public void prefetch(List<Uri> list, PrefetchOptions prefetchOptions) {
        try {
            this.mService.prefetchWithMultipleUrls(this.mCallback, list, createBundleWithId(prefetchOptions.toBundle()));
        } catch (RemoteException unused) {
        }
    }

    public boolean setEngagementSignalsCallback(Executor executor, EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback, executor), bundleCreateBundleWithId);
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }

    public boolean requestPostMessageChannel(Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    /* compiled from: WazeSource */
    class MockSession extends h {
        MockSession() {
        }

        @Override // android.support.a.j
        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.a.j
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.a.j
        public boolean isEngagementSignalsApiAvailable(f fVar, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public boolean mayLaunchUrl(f fVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return false;
        }

        @Override // android.support.a.j
        public boolean newAuthTabSession(c cVar, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public boolean newSession(f fVar) {
            return false;
        }

        @Override // android.support.a.j
        public boolean newSessionWithExtras(f fVar, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public int postMessage(f fVar, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.a.j
        public boolean receiveFile(f fVar, Uri uri, int i2, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public boolean requestPostMessageChannel(f fVar, Uri uri) {
            return false;
        }

        @Override // android.support.a.j
        public boolean requestPostMessageChannelWithExtras(f fVar, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public boolean setEngagementSignalsCallback(f fVar, IBinder iBinder, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public boolean updateVisuals(f fVar, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public boolean validateRelationship(f fVar, int i2, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.a.j
        public boolean warmup(long j2) {
            return false;
        }

        @Override // android.support.a.j
        public void prefetch(f fVar, Uri uri, Bundle bundle) {
        }

        @Override // android.support.a.j
        public void prefetchWithMultipleUrls(f fVar, List<Uri> list, Bundle bundle) {
        }
    }
}
