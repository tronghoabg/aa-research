package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.core.os.BundleCompat;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.common.util.g;
import com.google.android.gms.identitycredentials.k;
import com.google.android.gms.identitycredentials.o;
import com.google.android.gms.identitycredentials.r;
import com.google.android.gms.o.m;
import com.google.android.gms.o.t;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GetCredentialController extends CredentialProviderController<GetCredentialRequest, com.google.android.gms.identitycredentials.GetCredentialRequest, o, GetCredentialResponse, GetCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetCredentialController";
    public CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    public Executor executor;
    private final GetCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1] */
    public GetCredentialController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                x.f(bundle, "resultData");
                CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback = this.this$0.getCallback();
                GetCredentialController$resultReceiver$1$onReceiveResult$1 getCredentialController$resultReceiver$1$onReceiveResult$1 = new GetCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                GetCredentialController getCredentialController = this.this$0;
                if (!getCredentialController.maybeReportErrorFromResultReceiver(bundle, getCredentialController$resultReceiver$1$onReceiveResult$1, getCredentialController.getExecutor(), callback, getCredentialController.cancellationSignal)) {
                    ResponseUtils.Companion companion = ResponseUtils.Companion;
                    int i3 = bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG);
                    Intent intent = (Intent) BundleCompat.getParcelable(bundle, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class);
                    GetCredentialController getCredentialController2 = this.this$0;
                    companion.handleGetCredentialResponse(i3, i2, intent, getCredentialController2.getExecutor(), callback, getCredentialController2.cancellationSignal);
                }
                this.this$0.setCallback(CredentialProviderBaseController.Companion.emptyCallback$credentials_play_services_auth());
            }
        };
    }

    private final k convertCredentialOptionToPlayServices(CredentialOption credentialOption) {
        return new k(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData(), "", "", "");
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    static final ab invokePlayServices$lambda$0(CancellationSignal cancellationSignal, Context context, GetCredentialController getCredentialController, final Executor executor, final CredentialManagerCallback credentialManagerCallback, r rVar) {
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            getCredentialController.generateHiddenActivityIntent(getCredentialController.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, rVar.a());
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return GetCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback);
                    }
                });
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GetCredentialController.invokePlayServices$lambda$0$0$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    static final void invokePlayServices$lambda$2(GetCredentialController getCredentialController, GetCredentialRequest getCredentialRequest, CredentialManagerCallback credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal, Exception exc) {
        x.f(exc, "e");
        Context context = getCredentialController.contextReference.get();
        if (context == null) {
            return;
        }
        if (CredentialProviderPlayServicesImpl.Companion.isGetSignInIntentRequest$credentials_play_services_auth(getCredentialRequest)) {
            Log.w(TAG, "Pre-u credman get flow failed for get sign in intent; retrying with gis flow");
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(getCredentialRequest, (CredentialManagerCallback<GetCredentialResponse, GetCredentialException>) credentialManagerCallback, executor, cancellationSignal);
        } else {
            Log.w(TAG, "Pre-u credman get flow failed; retrying with gis flow");
            new CredentialProviderBeginSignInController(context).invokePlayServices(getCredentialRequest, (CredentialManagerCallback<GetCredentialResponse, GetCredentialException>) credentialManagerCallback, executor, cancellationSignal);
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public com.google.android.gms.identitycredentials.GetCredentialRequest convertRequestToPlayServices(GetCredentialRequest getCredentialRequest) {
        x.f(getCredentialRequest, "request");
        Bundle requestMetadataBundle = GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest);
        List<CredentialOption> credentialOptions = getCredentialRequest.getCredentialOptions();
        ArrayList arrayList = new ArrayList(i.q(credentialOptions, 10));
        Iterator<T> it = credentialOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(convertCredentialOptionToPlayServices((CredentialOption) it.next()));
        }
        return new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList, requestMetadataBundle, getCredentialRequest.getOrigin(), new ResultReceiver(null));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialResponse convertResponseToCredentialManager(o oVar) {
        x.f(oVar, "response");
        return new GetCredentialResponse(Credential.Companion.createFrom(oVar.a().b(), oVar.a().a()));
    }

    public final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> getCallback() {
        CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        x.j("callback");
        return null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        x.j("executor");
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(final GetCredentialRequest getCredentialRequest, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        final Context context;
        x.f(getCredentialRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(credentialManagerCallback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal) || (context = this.contextReference.get()) == null) {
            return;
        }
        t tVarC = g.c(context).c(convertRequestToPlayServices(getCredentialRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return GetCredentialController.invokePlayServices$lambda$0(cancellationSignal, context, this, executor, credentialManagerCallback, (r) obj);
            }
        };
        tVarC.r(new com.google.android.gms.o.o() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarC.o(new m() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                GetCredentialController.invokePlayServices$lambda$2(this.f$0, getCredentialRequest, credentialManagerCallback, executor, cancellationSignal, exc);
            }
        });
    }

    public final void setCallback(CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "<set-?>");
        this.callback = credentialManagerCallback;
    }

    public final void setExecutor(Executor executor) {
        x.f(executor, "<set-?>");
        this.executor = executor;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
