package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.a.c;
import android.support.a.f;
import android.support.a.h;
import androidx.browser.auth.AuthTabSessionToken;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_AUTH_TAB = "androidx.browser.auth.category.AuthTab";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_EPHEMERAL_BROWSING = "androidx.browser.customtabs.category.EphemeralBrowsing";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_SET_NETWORK = "androidx.browser.customtabs.category.SetNetwork";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "CustomTabsService";
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final SimpleArrayMap<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new SimpleArrayMap<>();
    private h mBinder = new AnonymousClass1();

    /* compiled from: WazeSource */
    /* renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    class AnonymousClass1 extends h {
        AnonymousClass1() {
        }

        private PendingIntent getSessionIdFromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        private Uri getTargetOriginFromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) Api33Impl.getParcelable(bundle, "target_origin", Uri.class) : (Uri) bundle.getParcelable("target_origin");
        }

        private boolean newSessionInternal(f fVar, PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(fVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda2
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f$0.m177x67c68af6(customTabsSessionToken);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    fVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(fVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.a.j
        public Bundle extraCommand(String str, Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // android.support.a.j
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.a.j
        public boolean isEngagementSignalsApiAvailable(f fVar, Bundle bundle) {
            return CustomTabsService.this.isEngagementSignalsApiAvailable(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), bundle);
        }

        /* renamed from: lambda$newAuthTabSession$1$androidx-browser-customtabs-CustomTabsService$1, reason: not valid java name */
        /* synthetic */ void m176x3d26a773(AuthTabSessionToken authTabSessionToken) {
            CustomTabsService.this.cleanUpSession(authTabSessionToken);
        }

        /* renamed from: lambda$newSessionInternal$0$androidx-browser-customtabs-CustomTabsService$1, reason: not valid java name */
        /* synthetic */ void m177x67c68af6(CustomTabsSessionToken customTabsSessionToken) {
            CustomTabsService.this.cleanUpSession(customTabsSessionToken);
        }

        @Override // android.support.a.j
        public boolean mayLaunchUrl(f fVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), uri, bundle, list);
        }

        @Override // android.support.a.j
        public boolean newAuthTabSession(c cVar, Bundle bundle) {
            final AuthTabSessionToken authTabSessionToken = new AuthTabSessionToken(cVar, getSessionIdFromBundle(bundle));
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda3
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f$0.m176x3d26a773(authTabSessionToken);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    cVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(cVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.registerAuthTabSession(authTabSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.a.j
        public boolean newSession(f fVar) {
            return newSessionInternal(fVar, null);
        }

        @Override // android.support.a.j
        public boolean newSessionWithExtras(f fVar, Bundle bundle) {
            return newSessionInternal(fVar, getSessionIdFromBundle(bundle));
        }

        @Override // android.support.a.j
        public int postMessage(f fVar, String str, Bundle bundle) {
            return CustomTabsService.this.postMessage(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), str, bundle);
        }

        @Override // android.support.a.j
        public void prefetch(f fVar, Uri uri, Bundle bundle) {
            CustomTabsService.this.prefetch(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), CustomTabsService$1$$ExternalSyntheticBackport0.m(new Object[]{uri}), PrefetchOptions.fromBundle(bundle));
        }

        @Override // android.support.a.j
        public void prefetchWithMultipleUrls(f fVar, List<Uri> list, Bundle bundle) {
            CustomTabsService.this.prefetch(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), list, PrefetchOptions.fromBundle(bundle));
        }

        @Override // android.support.a.j
        public boolean receiveFile(f fVar, Uri uri, int i2, Bundle bundle) {
            return CustomTabsService.this.receiveFile(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), uri, i2, bundle);
        }

        @Override // android.support.a.j
        public boolean requestPostMessageChannel(f fVar, Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(fVar, null), uri, null, new Bundle());
        }

        @Override // android.support.a.j
        public boolean requestPostMessageChannelWithExtras(f fVar, Uri uri, Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), uri, getTargetOriginFromBundle(bundle), bundle);
        }

        @Override // android.support.a.j
        public boolean setEngagementSignalsCallback(f fVar, IBinder iBinder, Bundle bundle) {
            EngagementSignalsCallbackRemote engagementSignalsCallbackRemoteFromBinder = EngagementSignalsCallbackRemote.fromBinder(iBinder);
            return CustomTabsService.this.setEngagementSignalsCallback(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), engagementSignalsCallbackRemoteFromBinder, bundle);
        }

        @Override // android.support.a.j
        public boolean updateVisuals(f fVar, Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.a.j
        public boolean validateRelationship(f fVar, int i2, Uri uri, Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(fVar, getSessionIdFromBundle(bundle)), i2, uri, bundle);
        }

        @Override // android.support.a.j
        public boolean warmup(long j2) {
            return CustomTabsService.this.warmup(j2);
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    protected boolean cleanUpSession(AuthTabSessionToken authTabSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                IBinder callbackBinder = authTabSessionToken.getCallbackBinder();
                if (callbackBinder == null) {
                    return false;
                }
                callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                this.mDeathRecipientMap.remove(callbackBinder);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    protected abstract Bundle extraCommand(String str, Bundle bundle);

    protected boolean isEngagementSignalsApiAvailable(CustomTabsSessionToken customTabsSessionToken, Bundle bundle) {
        return false;
    }

    protected abstract boolean mayLaunchUrl(CustomTabsSessionToken customTabsSessionToken, Uri uri, Bundle bundle, List<Bundle> list);

    protected abstract boolean newSession(CustomTabsSessionToken customTabsSessionToken);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    protected abstract int postMessage(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle);

    protected abstract boolean receiveFile(CustomTabsSessionToken customTabsSessionToken, Uri uri, int i2, Bundle bundle);

    protected boolean registerAuthTabSession(AuthTabSessionToken authTabSessionToken) {
        return false;
    }

    protected abstract boolean requestPostMessageChannel(CustomTabsSessionToken customTabsSessionToken, Uri uri);

    protected boolean requestPostMessageChannel(CustomTabsSessionToken customTabsSessionToken, Uri uri, Uri uri2, Bundle bundle) {
        return requestPostMessageChannel(customTabsSessionToken, uri);
    }

    protected boolean setEngagementSignalsCallback(CustomTabsSessionToken customTabsSessionToken, EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        return false;
    }

    protected abstract boolean updateVisuals(CustomTabsSessionToken customTabsSessionToken, Bundle bundle);

    protected abstract boolean validateRelationship(CustomTabsSessionToken customTabsSessionToken, int i2, Uri uri, Bundle bundle);

    protected abstract boolean warmup(long j2);

    protected void prefetch(CustomTabsSessionToken customTabsSessionToken, List<Uri> list, PrefetchOptions prefetchOptions) {
    }

    protected boolean cleanUpSession(CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
                if (callbackBinder == null) {
                    return false;
                }
                callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                this.mDeathRecipientMap.remove(callbackBinder);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    protected void prefetch(CustomTabsSessionToken customTabsSessionToken, Uri uri, PrefetchOptions prefetchOptions) {
    }
}
