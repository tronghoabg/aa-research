package androidx.credentials;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.credentials.CredentialManager;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialSecurityException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateProviderConfigurationException;
import androidx.credentials.internal.FormFactorHelper;
import androidx.credentials.internal.MutableContextTracker;
import h.c.e;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialManagerImpl implements CredentialManager {
    public static final Companion Companion = new Companion(null);
    private static final String INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS = "android.settings.CREDENTIAL_PROVIDER";
    private static final String ORIGIN_PERMISSION = "android.permission.CREDENTIAL_MANAGER_SET_ORIGIN";
    private final Context context;

    public CredentialManagerImpl(Context context) {
        x.f(context, "context");
        this.context = context;
    }

    private final boolean isOriginAllowed(Context context) {
        return Build.VERSION.SDK_INT < 34 || context.checkSelfPermission(ORIGIN_PERMISSION) == 0;
    }

    @Override // androidx.credentials.CredentialManager
    public /* synthetic */ Object clearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, e eVar) {
        return CredentialManager.CC.clearCredentialState$suspendImpl(this, clearCredentialStateRequest, eVar);
    }

    @Override // androidx.credentials.CredentialManager
    public void clearCredentialStateAsync(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
        x.f(clearCredentialStateRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(this.context).getBestAvailableProvider(clearCredentialStateRequest.getRequestType(), false | (!((2 & 2) == 0)));
        if (bestAvailableProvider == null) {
            credentialManagerCallback.onError(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider.onClearCredential(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public /* synthetic */ Object createCredential(Context context, CreateCredentialRequest createCredentialRequest, e eVar) {
        return CredentialManager.CC.createCredential$suspendImpl(this, context, createCredentialRequest, eVar);
    }

    @Override // androidx.credentials.CredentialManager
    public void createCredentialAsync(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(createCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallbackWrapCallback = MutableContextTracker.INSTANCE.wrapCallback(context, cancellationSignal, credentialManagerCallback);
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(this.context).getBestAvailableProvider(createCredentialRequest, false | (!((2 & 2) == 0)));
        if (bestAvailableProvider == null) {
            credentialManagerCallbackWrapCallback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (FormFactorHelper.isWear(context)) {
            credentialManagerCallbackWrapCallback.onError(new CreateCredentialUnsupportedException("createCredential is not supported on this device"));
        } else {
            bestAvailableProvider.onCreateCredential(context, createCredentialRequest, cancellationSignal, executor, credentialManagerCallbackWrapCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public PendingIntent createSettingsPendingIntent() {
        Intent intent = new Intent(INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS);
        intent.setData(Uri.parse("package:".concat(String.valueOf(this.context.getPackageName()))));
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, intent, 67108864);
        x.e(activity, "getActivity(...)");
        return activity;
    }

    @Override // androidx.credentials.CredentialManager
    public /* synthetic */ Object getCredential(Context context, GetCredentialRequest getCredentialRequest, e eVar) {
        return CredentialManager.CC.getCredential$suspendImpl(this, context, getCredentialRequest, (e<? super GetCredentialResponse>) eVar);
    }

    @Override // androidx.credentials.CredentialManager
    public void getCredentialAsync(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(getCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallbackWrapCallback = MutableContextTracker.INSTANCE.wrapCallback(context, cancellationSignal, credentialManagerCallback);
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(context).getBestAvailableProvider(getCredentialRequest, false | (!((2 & 2) == 0)));
        if (bestAvailableProvider == null) {
            credentialManagerCallbackWrapCallback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider.onGetCredential(context, getCredentialRequest, cancellationSignal, executor, credentialManagerCallbackWrapCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public /* synthetic */ Object prepareGetCredential(GetCredentialRequest getCredentialRequest, e eVar) {
        return CredentialManager.CC.prepareGetCredential$suspendImpl(this, getCredentialRequest, eVar);
    }

    @Override // androidx.credentials.CredentialManager
    public void prepareGetCredentialAsync(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(getCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(this.context).getBestAvailableProvider(false);
        if (bestAvailableProvider == null) {
            credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider.onPrepareCredential(getCredentialRequest, cancellationSignal, executor, credentialManagerCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public /* synthetic */ Object signalCredentialState(SignalCredentialStateRequest signalCredentialStateRequest, e eVar) {
        return CredentialManager.CC.signalCredentialState$suspendImpl(this, signalCredentialStateRequest, eVar);
    }

    @Override // androidx.credentials.CredentialManager
    public void signalCredentialStateAsync(SignalCredentialStateRequest signalCredentialStateRequest, Executor executor, CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> credentialManagerCallback) {
        x.f(signalCredentialStateRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        if (signalCredentialStateRequest.getOrigin() != null && !isOriginAllowed(this.context)) {
            credentialManagerCallback.onError(new SignalCredentialSecurityException("Must have android.permissions.CREDENTIAL_MANAGER_SET_ORIGIN permission"));
            return;
        }
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(this.context).getBestAvailableProvider(signalCredentialStateRequest, false | (!((2 & 2) == 0)));
        if (bestAvailableProvider == null) {
            credentialManagerCallback.onError(new SignalCredentialStateProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider.onSignalCredentialState(signalCredentialStateRequest, executor, credentialManagerCallback);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.credentials.CredentialManager
    public /* synthetic */ Object getCredential(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, e eVar) {
        return CredentialManager.CC.getCredential$suspendImpl(this, context, pendingGetCredentialHandle, (e<? super GetCredentialResponse>) eVar);
    }

    @Override // androidx.credentials.CredentialManager
    public void getCredentialAsync(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallbackWrapCallback = MutableContextTracker.INSTANCE.wrapCallback(context, cancellationSignal, credentialManagerCallback);
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(context).getBestAvailableProvider(false);
        if (bestAvailableProvider == null) {
            credentialManagerCallbackWrapCallback.onError(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider.onGetCredential(context, pendingGetCredentialHandle, cancellationSignal, executor, credentialManagerCallbackWrapCallback);
        }
    }
}
