package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.a.b;
import android.support.a.e;
import android.support.a.j;
import android.util.Log;
import androidx.browser.auth.AuthTabCallback;
import androidx.browser.auth.AuthTabSession;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CustomTabsClient {
    private static final String TAG = "CustomTabsClient";
    private final Context mApplicationContext;
    private final j mService;
    private final ComponentName mServiceComponentName;

    /* compiled from: WazeSource */
    /* renamed from: androidx.browser.customtabs.CustomTabsClient$2, reason: invalid class name */
    class AnonymousClass2 extends b {
        private final Executor mExecutor;
        final /* synthetic */ AuthTabCallback val$callback;
        final /* synthetic */ Executor val$executor;

        AnonymousClass2(Executor executor, AuthTabCallback authTabCallback) {
            this.val$executor = executor;
            this.val$callback = authTabCallback;
            if (executor == null) {
                final Handler handler = new Handler(Looper.getMainLooper());
                executor = new Executor() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda3
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                };
            }
            this.mExecutor = executor;
        }

        @Override // android.support.a.c
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.a.c
        public void onExtraCallback(final String str, final Bundle bundle) {
            if (this.val$callback == null) {
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final AuthTabCallback authTabCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        authTabCallback.onExtraCallback(str, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.a.c
        public Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
            if (this.val$callback == null) {
                return Bundle.EMPTY;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return this.val$callback.onExtraCallbackWithResult(str, bundle);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.a.c
        public void onNavigationEvent(final int i2, final Bundle bundle) {
            if (this.val$callback == null) {
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final AuthTabCallback authTabCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        authTabCallback.onNavigationEvent(i2, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.a.c
        public void onWarmupCompleted(final Bundle bundle) {
            if (this.val$callback == null) {
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final AuthTabCallback authTabCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        authTabCallback.onWarmupCompleted(bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    CustomTabsClient(j jVar, ComponentName componentName, Context context) {
        this.mService = jVar;
        this.mServiceComponentName = componentName;
        this.mApplicationContext = context;
    }

    public static boolean bindCustomTabsService(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, customTabsServiceConnection, 1);
    }

    public static boolean connectAndInitialize(Context context, String str) {
        if (str == null) {
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    customTabsClient.warmup(0L);
                    applicationContext.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }
            });
        } catch (SecurityException unused) {
            return false;
        }
    }

    private b createAuthTabCallbackWrapper(AuthTabCallback authTabCallback, Executor executor) {
        return new AnonymousClass2(executor, authTabCallback);
    }

    private e createCallbackWrapper(final CustomTabsCallback customTabsCallback) {
        return new e() { // from class: androidx.browser.customtabs.CustomTabsClient.3
            private Handler mHandler = new Handler(Looper.getMainLooper());

            @Override // android.support.a.f
            public void extraCallback(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public Bundle extraCallbackWithResult(String str, Bundle bundle) {
                CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // android.support.a.f
            public int getInterfaceVersion() {
                return 1;
            }

            @Override // android.support.a.f
            public void onActivityLayout(final int i2, final int i3, final int i4, final int i5, final int i6, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.8
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityLayout(i2, i3, i4, i5, i6, bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onActivityResized(final int i2, final int i3, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.6
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityResized(i2, i3, bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onMessageChannelReady(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.3
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onMinimized(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.9
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMinimized(bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onNavigationEvent(final int i2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onNavigationEvent(i2, bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onPostMessage(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.4
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onRelationshipValidationResult(final int i2, final Uri uri, final boolean z, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.5
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onRelationshipValidationResult(i2, uri, z, bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onUnminimized(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.10
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onUnminimized(bundle);
                    }
                });
            }

            @Override // android.support.a.f
            public void onWarmupCompleted(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.7
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onWarmupCompleted(bundle);
                    }
                });
            }
        };
    }

    public static AuthTabSession.PendingSession createPendingAuthTabSession(Context context, int i2) {
        return new AuthTabSession.PendingSession(createSessionId(context, i2), null, null);
    }

    private static PendingIntent createSessionId(Context context, int i2) {
        return PendingIntent.getActivity(context, i2, new Intent(), 67108864);
    }

    public static String getPackageName(Context context, List<String> list, boolean z) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w(TAG, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static boolean isAuthTabSupported(Context context, String str) {
        return packageHasCategory(context, str, CustomTabsService.CATEGORY_AUTH_TAB);
    }

    public static boolean isEphemeralBrowsingSupported(Context context, String str) {
        return packageHasCategory(context, str, CustomTabsService.CATEGORY_EPHEMERAL_BROWSING);
    }

    public static boolean isSetNetworkSupported(Context context, String str) {
        return packageHasCategory(context, str, CustomTabsService.CATEGORY_SET_NETWORK);
    }

    private AuthTabSession newAuthTabSessionInternal(AuthTabCallback authTabCallback, Executor executor, PendingIntent pendingIntent) {
        b bVarCreateAuthTabCallbackWrapper = createAuthTabCallbackWrapper(authTabCallback, executor);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            if (this.mService.newAuthTabSession(bVarCreateAuthTabCallbackWrapper, bundle)) {
                return new AuthTabSession(bVarCreateAuthTabCallbackWrapper, this.mServiceComponentName, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public static CustomTabsSession.PendingSession newPendingSession(Context context, CustomTabsCallback customTabsCallback, int i2) {
        return new CustomTabsSession.PendingSession(customTabsCallback, createSessionId(context, i2));
    }

    private CustomTabsSession newSessionInternal(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
        boolean zNewSession;
        e eVarCreateCallbackWrapper = createCallbackWrapper(customTabsCallback);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                zNewSession = this.mService.newSessionWithExtras(eVarCreateCallbackWrapper, bundle);
            } else {
                zNewSession = this.mService.newSession(eVarCreateCallbackWrapper);
            }
            if (zNewSession) {
                return new CustomTabsSession(this.mService, eVarCreateCallbackWrapper, this.mServiceComponentName, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    private static boolean packageHasCategory(Context context, String str, String str2) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory(str2)) {
                return true;
            }
        }
        return false;
    }

    public AuthTabSession attachAuthTabSession(AuthTabSession.PendingSession pendingSession) {
        return newAuthTabSessionInternal(pendingSession.getCallback(), pendingSession.getExecutor(), pendingSession.getId());
    }

    public CustomTabsSession attachSession(CustomTabsSession.PendingSession pendingSession) {
        return newSessionInternal(pendingSession.getCallback(), pendingSession.getId());
    }

    public Bundle extraCommand(String str, Bundle bundle) {
        try {
            return this.mService.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public AuthTabSession newAuthTabSession(AuthTabCallback authTabCallback, Executor executor, int i2) {
        return newAuthTabSessionInternal(authTabCallback, executor, createSessionId(this.mApplicationContext, i2));
    }

    public CustomTabsSession newSession(CustomTabsCallback customTabsCallback, int i2) {
        return newSessionInternal(customTabsCallback, createSessionId(this.mApplicationContext, i2));
    }

    public boolean warmup(long j2) {
        try {
            return this.mService.warmup(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public static AuthTabSession.PendingSession createPendingAuthTabSession(Context context, int i2, Executor executor, AuthTabCallback authTabCallback) {
        return new AuthTabSession.PendingSession(createSessionId(context, i2), executor, authTabCallback);
    }

    public AuthTabSession newAuthTabSession(AuthTabCallback authTabCallback, Executor executor) {
        return newAuthTabSessionInternal(authTabCallback, executor, null);
    }

    public CustomTabsSession newSession(CustomTabsCallback customTabsCallback) {
        return newSessionInternal(customTabsCallback, null);
    }

    public static String getPackageName(Context context, List<String> list) {
        return getPackageName(context, list, false);
    }
}
