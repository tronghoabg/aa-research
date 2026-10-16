package androidx.credentials;

import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.util.Log;
import androidx.core.view.DisplayCompat$$ExternalSyntheticApiModelOutline1;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.CredentialProvider;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.internal.ConversionUtilsKt;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.media3.datasource.HttpEngineDataSource$$ExternalSyntheticApiModelOutline0;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderFrameworkImpl implements CredentialProvider {
    private static final String CREATE_DOM_EXCEPTION_PREFIX = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";
    private static final Companion Companion = new Companion(null);
    private static final String GET_DOM_EXCEPTION_PREFIX = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";
    private static final String TAG = "CredManProvService";
    private final android.credentials.CredentialManager credentialManager;

    public CredentialProviderFrameworkImpl(Context context) {
        x.f(context, "context");
        this.credentialManager = DisplayCompat$$ExternalSyntheticApiModelOutline1.m(context.getSystemService("credential"));
    }

    private final android.credentials.CreateCredentialRequest convertCreateRequestToFrameworkClass(CreateCredentialRequest createCredentialRequest, Context context) {
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder(createCredentialRequest.getType(), ConversionUtilsKt.getFinalCreateCredentialData(createCredentialRequest, context), createCredentialRequest.getCandidateQueryData()).setIsSystemProviderRequired(createCredentialRequest.isSystemProviderRequired()).setAlwaysSendAppInfoToProvider(true);
        x.e(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        setOriginForCreateRequest(createCredentialRequest, alwaysSendAppInfoToProvider);
        android.credentials.CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        x.e(createCredentialRequestBuild, "build(...)");
        return createCredentialRequestBuild;
    }

    private final android.credentials.GetCredentialRequest convertGetRequestToFrameworkClass(GetCredentialRequest getCredentialRequest) {
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest));
        for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
            builder.addCredentialOption(new CredentialOption.Builder(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.isSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
        }
        setOriginForGetRequest(getCredentialRequest, builder);
        android.credentials.GetCredentialRequest getCredentialRequestBuild = builder.build();
        x.e(getCredentialRequestBuild, "build(...)");
        return getCredentialRequestBuild;
    }

    private final android.credentials.ClearCredentialStateRequest createFrameworkClearCredentialRequest() {
        return new android.credentials.ClearCredentialStateRequest(new Bundle());
    }

    private final boolean isCredmanDisabled(a<ab> aVar) {
        if (this.credentialManager != null) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    static final ab onClearCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new ClearCredentialUnsupportedException("Your device doesn't support credential manager"));
        return ab.f48028a;
    }

    static final ab onCreateCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
        return ab.f48028a;
    }

    static final ab onGetCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return ab.f48028a;
    }

    static final ab onGetCredential$lambda$1(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return ab.f48028a;
    }

    static final ab onPrepareCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return ab.f48028a;
    }

    private final void setOriginForCreateRequest(CreateCredentialRequest createCredentialRequest, CreateCredentialRequest.Builder builder) {
        if (createCredentialRequest.getOrigin() != null) {
            builder.setOrigin(createCredentialRequest.getOrigin());
        }
    }

    private final void setOriginForGetRequest(GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
        if (getCredentialRequest.getOrigin() != null) {
            builder.setOrigin(getCredentialRequest.getOrigin());
        }
    }

    public final GetCredentialResponse convertGetResponseToJetpackClass$credentials(android.credentials.GetCredentialResponse getCredentialResponse) {
        x.f(getCredentialResponse, "response");
        android.credentials.Credential credential = getCredentialResponse.getCredential();
        x.e(credential, "getCredential(...)");
        Credential.Companion companion = Credential.Companion;
        String type = credential.getType();
        x.e(type, "getType(...)");
        Bundle data = credential.getData();
        x.e(data, "getData(...)");
        return new GetCredentialResponse(companion.createFrom(type, data));
    }

    public final PrepareGetCredentialResponse convertPrepareGetResponseToJetpackClass$credentials(android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse) {
        x.f(prepareGetCredentialResponse, "response");
        PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle = new PrepareGetCredentialResponse.PendingGetCredentialHandle(prepareGetCredentialResponse.getPendingGetCredentialHandle());
        PrepareGetCredentialResponse.Builder builder = new PrepareGetCredentialResponse.Builder();
        builder.setFrameworkResponse(prepareGetCredentialResponse);
        builder.setPendingGetCredentialHandle(pendingGetCredentialHandle);
        return builder.build();
    }

    public final CreateCredentialException convertToJetpackCreateException$credentials(android.credentials.CreateCredentialException createCredentialException) {
        x.f(createCredentialException, "error");
        String type = createCredentialException.getType();
        x.e(type, "getType(...)");
        return ConversionUtilsKt.toJetpackCreateException(type, createCredentialException.getMessage());
    }

    public final GetCredentialException convertToJetpackGetException$credentials(android.credentials.GetCredentialException getCredentialException) {
        x.f(getCredentialException, "error");
        String type = getCredentialException.getType();
        x.e(type, "getType(...)");
        return ConversionUtilsKt.toJetpackGetException(type, getCredentialException.getMessage());
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override // androidx.credentials.CredentialProvider
    public void onClearCredential(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
        x.f(clearCredentialStateRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        Log.i(TAG, "In CredentialProviderFrameworkImpl onClearCredential");
        if (isCredmanDisabled(new a() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onClearCredential$lambda$0(credentialManagerCallback);
            }
        })) {
            return;
        }
        OutcomeReceiver<Void, ClearCredentialStateException> outcomeReceiver = new OutcomeReceiver<Void, ClearCredentialStateException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onClearCredential$outcome$1
            public void onError(ClearCredentialStateException clearCredentialStateException) {
                x.f(clearCredentialStateException, "error");
                Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
                credentialManagerCallback.onError(new ClearCredentialUnknownException(null, 1, null));
            }

            public void onResult(Void r3) {
                Log.i("CredManProvService", "Clear result returned from framework: ");
                credentialManagerCallback.onResult(r3);
            }

            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m((Object) th));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        x.c(credentialManager);
        credentialManager.clearCredentialState(createFrameworkClearCredentialRequest(), cancellationSignal, executor, bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(Context context, final CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(createCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        if (isCredmanDisabled(new a() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onCreateCredential$lambda$0(credentialManagerCallback);
            }
        })) {
            return;
        }
        OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException> outcomeReceiver = new OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$outcome$1
            public void onError(android.credentials.CreateCredentialException createCredentialException) {
                x.f(createCredentialException, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                credentialManagerCallback.onError(this.convertToJetpackCreateException$credentials(createCredentialException));
            }

            public void onResult(android.credentials.CreateCredentialResponse createCredentialResponse) throws FrameworkClassParsingException {
                x.f(createCredentialResponse, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                CreateCredentialRequest createCredentialRequest2 = createCredentialRequest;
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.Companion;
                String type = createCredentialRequest2.getType();
                Bundle data = createCredentialResponse.getData();
                x.e(data, "getData(...)");
                credentialManagerCallback.onResult(companion.createFrom(type, data));
            }

            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12399m((Object) th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) throws FrameworkClassParsingException {
                onResult(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12400m(obj));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        x.c(credentialManager);
        credentialManager.createCredential(context, convertCreateRequestToFrameworkClass(createCredentialRequest, context), cancellationSignal, executor, bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        if (isCredmanDisabled(new a() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onGetCredential$lambda$0(credentialManagerCallback);
            }
        })) {
            return;
        }
        OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> outcomeReceiver = new OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$1
            public void onError(android.credentials.GetCredentialException getCredentialException) {
                x.f(getCredentialException, "error");
                credentialManagerCallback.onError(this.convertToJetpackGetException$credentials(getCredentialException));
            }

            public void onResult(android.credentials.GetCredentialResponse getCredentialResponse) {
                x.f(getCredentialResponse, "response");
                credentialManagerCallback.onResult(this.convertGetResponseToJetpackClass$credentials(getCredentialResponse));
            }

            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12402m((Object) th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12403m(obj));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        x.c(credentialManager);
        PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle = pendingGetCredentialHandle.getFrameworkHandle();
        x.c(frameworkHandle);
        credentialManager.getCredential(context, frameworkHandle, cancellationSignal, executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>) bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onPrepareCredential(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(getCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        if (isCredmanDisabled(new a() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onPrepareCredential$lambda$0(credentialManagerCallback);
            }
        })) {
            return;
        }
        OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException> outcomeReceiver = new OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1
            public void onError(android.credentials.GetCredentialException getCredentialException) {
                x.f(getCredentialException, "error");
                credentialManagerCallback.onError(this.convertToJetpackGetException$credentials(getCredentialException));
            }

            public void onResult(android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse) {
                x.f(prepareGetCredentialResponse, "response");
                credentialManagerCallback.onResult(this.convertPrepareGetResponseToJetpackClass$credentials(prepareGetCredentialResponse));
            }

            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12402m((Object) th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12404m(obj));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        x.c(credentialManager);
        credentialManager.prepareGetCredential(convertGetRequestToFrameworkClass(getCredentialRequest), cancellationSignal, executor, bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver));
    }

    @Override // androidx.credentials.CredentialProvider
    public /* synthetic */ void onSignalCredentialState(SignalCredentialStateRequest signalCredentialStateRequest, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        CredentialProvider.CC.$default$onSignalCredentialState(this, signalCredentialStateRequest, executor, credentialManagerCallback);
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(getCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        if (isCredmanDisabled(new a() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onGetCredential$lambda$1(credentialManagerCallback);
            }
        })) {
            return;
        }
        OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> outcomeReceiver = new OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$2
            public void onError(android.credentials.GetCredentialException getCredentialException) {
                x.f(getCredentialException, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                credentialManagerCallback.onError(this.convertToJetpackGetException$credentials(getCredentialException));
            }

            public void onResult(android.credentials.GetCredentialResponse getCredentialResponse) {
                x.f(getCredentialResponse, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                credentialManagerCallback.onResult(this.convertGetResponseToJetpackClass$credentials(getCredentialResponse));
            }

            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12402m((Object) th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12403m(obj));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        x.c(credentialManager);
        credentialManager.getCredential(context, convertGetRequestToFrameworkClass(getCredentialRequest), cancellationSignal, executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>) bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver));
    }
}
