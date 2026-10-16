package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.a.b;
import android.support.a.c;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.IntentCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthTabSessionToken {
    private static final String TAG = "AuthTabSessionToken";
    private final AuthTabCallback mCallback;
    private final c mCallbackBinder;
    private final PendingIntent mSessionId;

    public AuthTabSessionToken(c cVar, PendingIntent pendingIntent) {
        if (cVar == null && pendingIntent == null) {
            throw new IllegalStateException("AuthTabSessionToken must have either a session id or a callback (or both).");
        }
        this.mCallbackBinder = cVar;
        this.mSessionId = pendingIntent;
        this.mCallback = cVar == null ? null : new AuthTabCallback() { // from class: androidx.browser.auth.AuthTabSessionToken.1
            @Override // androidx.browser.auth.AuthTabCallback
            public void onExtraCallback(String str, Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onExtraCallback(str, bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
                try {
                    return AuthTabSessionToken.this.mCallbackBinder.onExtraCallbackWithResult(str, bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                    return Bundle.EMPTY;
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onNavigationEvent(int i2, Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onNavigationEvent(i2, bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onWarmupCompleted(Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onWarmupCompleted(bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                }
            }
        };
    }

    public static AuthTabSessionToken createSessionTokenFromIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            IBinder binder = extras.getBinder(CustomTabsIntent.EXTRA_SESSION);
            PendingIntent pendingIntent = (PendingIntent) IntentCompat.getParcelableExtra(intent, CustomTabsIntent.EXTRA_SESSION_ID, PendingIntent.class);
            if (binder != null || pendingIntent != null) {
                return new AuthTabSessionToken(binder != null ? b.asInterface(binder) : null, pendingIntent);
            }
        }
        return null;
    }

    private IBinder getCallbackBinderAssertNotNull() {
        c cVar = this.mCallbackBinder;
        if (cVar != null) {
            return cVar.asBinder();
        }
        throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
    }

    public boolean equals(Object obj) {
        if (obj instanceof AuthTabSessionToken) {
            AuthTabSessionToken authTabSessionToken = (AuthTabSessionToken) obj;
            PendingIntent id = authTabSessionToken.getId();
            PendingIntent pendingIntent = this.mSessionId;
            if ((pendingIntent == null) == (id == null)) {
                return pendingIntent != null ? pendingIntent.equals(id) : getCallbackBinderAssertNotNull().equals(authTabSessionToken.getCallbackBinderAssertNotNull());
            }
        }
        return false;
    }

    public AuthTabCallback getCallback() {
        return this.mCallback;
    }

    public IBinder getCallbackBinder() {
        c cVar = this.mCallbackBinder;
        if (cVar == null) {
            return null;
        }
        return cVar.asBinder();
    }

    public PendingIntent getId() {
        return this.mSessionId;
    }

    public boolean hasId() {
        return this.mSessionId != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.mSessionId;
        return pendingIntent != null ? pendingIntent.hashCode() : getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean isAssociatedWith(AuthTabSession authTabSession) {
        return authTabSession.getBinder().equals(this.mCallbackBinder);
    }

    /* compiled from: WazeSource */
    class MockCallback extends b {
        MockCallback() {
        }

        @Override // android.support.a.c
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.a.c
        public Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
            return Bundle.EMPTY;
        }

        @Override // android.support.a.c
        public void onWarmupCompleted(Bundle bundle) {
        }

        @Override // android.support.a.c
        public void onExtraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.a.c
        public void onNavigationEvent(int i2, Bundle bundle) {
        }
    }
}
