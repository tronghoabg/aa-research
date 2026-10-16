package androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.ResultReceiver;
import androidx.core.os.BundleCompat;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.DigitalCredential;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetDigitalCredentialOption;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import androidx.credentials.provider.PendingIntentHandler;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.util.g;
import com.google.android.gms.identitycredentials.k;
import com.google.android.gms.identitycredentials.n;
import com.google.android.gms.identitycredentials.o;
import com.google.android.gms.identitycredentials.r;
import com.google.android.gms.o.m;
import com.google.android.gms.o.t;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderGetDigitalCredentialController extends CredentialProviderController<GetCredentialRequest, com.google.android.gms.identitycredentials.GetCredentialRequest, o, GetCredentialResponse, GetCredentialException> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DigitalCredentialClient";
    public CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    public Executor executor;
    private final CredentialProviderGetDigitalCredentialController$largePayloadResultReceiver$1 largePayloadResultReceiver;
    private Bundle largeResultData;
    private final CredentialProviderGetDigitalCredentialController$pendingActivityResultReceiver$1 pendingActivityResultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$pendingActivityResultReceiver$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$largePayloadResultReceiver$1] */
    public CredentialProviderGetDigitalCredentialController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.pendingActivityResultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$pendingActivityResultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                x.f(bundle, "resultData");
                CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback = this.this$0.getCallback();
                if (bundle.containsKey(CredentialProviderBaseController.DUMMY_RESPONSE_TAG)) {
                    bundle = this.this$0.largeResultData;
                    x.e(bundle, "access$getLargeResultData$p(...)");
                }
                Bundle bundle2 = bundle;
                CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this.this$0;
                if (!credentialProviderGetDigitalCredentialController.maybeReportErrorFromResultReceiver(bundle2, new CredentialProviderGetDigitalCredentialController$pendingActivityResultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), credentialProviderGetDigitalCredentialController.getExecutor(), callback, credentialProviderGetDigitalCredentialController.cancellationSignal)) {
                    ResponseUtils.Companion companion = ResponseUtils.Companion;
                    int i3 = bundle2.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG);
                    Intent intent = (Intent) BundleCompat.getParcelable(bundle2, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class);
                    CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController2 = this.this$0;
                    companion.handleGetCredentialResponse(i3, i2, intent, credentialProviderGetDigitalCredentialController2.getExecutor(), callback, credentialProviderGetDigitalCredentialController2.cancellationSignal);
                }
                this.this$0.setCallback(CredentialProviderBaseController.Companion.emptyCallback$credentials_play_services_auth());
                this.this$0.largeResultData = Bundle.EMPTY;
            }
        };
        this.largeResultData = Bundle.EMPTY;
        final Handler handler2 = new Handler(Looper.getMainLooper());
        this.largePayloadResultReceiver = new ResultReceiver(handler2) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$largePayloadResultReceiver$1
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i2, Bundle bundle) {
                x.f(bundle, "resultData");
                this.this$0.largeResultData = bundle;
            }
        };
    }

    private final GetCredentialException fromGmsException(Throwable th) {
        if (th instanceof n) {
            throw null;
        }
        if (!(th instanceof i)) {
            Objects.toString(th);
            return new GetCredentialUnknownException("Get digital credential failed, failure: ".concat(String.valueOf(th)));
        }
        int iA = ((i) th).a();
        if (iA == 16) {
            return new GetCredentialCancellationException(th.getMessage());
        }
        if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(iA))) {
            return new GetCredentialInterruptedException(th.getMessage());
        }
        Objects.toString(th);
        return new GetCredentialUnknownException("Get digital credential failed, failure: ".concat(String.valueOf(th)));
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getPendingActivityResultReceiver$annotations() {
    }

    static final ab invokePlayServices$lambda$0(CancellationSignal cancellationSignal, Context context, CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, r rVar) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return ab.f48028a;
        }
        Intent intent = new Intent(context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, credentialProviderGetDigitalCredentialController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController.pendingActivityResultReceiver));
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, rVar.a());
        intent.putExtra(CredentialProviderBaseController.EXTRA_ERROR_NAME, CredentialProviderBaseController.GET_UNKNOWN);
        context.startActivity(intent);
        return ab.f48028a;
    }

    static final void invokePlayServices$lambda$2(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Exception exc) {
        x.f(exc, "e");
        final GetCredentialException getCredentialExceptionFromGmsException = credentialProviderGetDigitalCredentialController.fromGmsException(exc);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, getCredentialExceptionFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$2$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(getCredentialException);
            }
        });
        return ab.f48028a;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public com.google.android.gms.identitycredentials.GetCredentialRequest convertRequestToPlayServices(GetCredentialRequest getCredentialRequest) {
        x.f(getCredentialRequest, "request");
        ArrayList arrayList = new ArrayList();
        for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
            if (credentialOption instanceof GetDigitalCredentialOption) {
                Bundle requestData = credentialOption.getRequestData();
                requestData.putParcelable(PendingIntentHandler.EXTRA_LARGE_PAYLOAD_RESULT_RECEIVER, toIpcFriendlyResultReceiver(this.largePayloadResultReceiver));
                requestData.putInt(PendingIntentHandler.EXTRA_RP_PID, Process.myPid());
                arrayList.add(new k(credentialOption.getType(), requestData, credentialOption.getCandidateQueryData(), ((GetDigitalCredentialOption) credentialOption).getRequestJson(), "", ""));
            }
        }
        return new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList, GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest), getCredentialRequest.getOrigin(), new ResultReceiver(null));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialResponse convertResponseToCredentialManager(o oVar) {
        x.f(oVar, "response");
        return new GetCredentialResponse(Credential.Companion.createFrom(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, oVar.a().a()));
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
    public void invokePlayServices(GetCredentialRequest getCredentialRequest, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        x.f(getCredentialRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(credentialManagerCallback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        com.google.android.gms.identitycredentials.GetCredentialRequest getCredentialRequestConvertRequestToPlayServices = convertRequestToPlayServices(getCredentialRequest);
        final Context context = this.contextReference.get();
        if (context != null) {
            t tVarC = g.c(context).c(getCredentialRequestConvertRequestToPlayServices);
            final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$0(cancellationSignal, context, this, (r) obj);
                }
            };
            tVarC.r(new com.google.android.gms.o.o() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.o.o
                public final void onSuccess(Object obj) {
                    lVar.invoke(obj);
                }
            });
            tVarC.o(new m() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.o.m
                public final void onFailure(Exception exc) {
                    CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2(this.f$0, cancellationSignal, executor, credentialManagerCallback, exc);
                }
            });
        }
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
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
