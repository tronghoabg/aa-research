package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.a.n;
import com.google.android.gms.auth.api.identity.r;
import com.google.android.gms.auth.api.identity.s;
import com.google.android.gms.auth.api.identity.w;
import com.google.android.gms.common.api.i;
import com.google.android.gms.o.m;
import com.google.android.gms.o.o;
import com.google.android.gms.o.t;
import com.google.android.libraries.c.a.c;
import com.google.android.libraries.c.a.d;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<GetCredentialRequest, s, w, GetCredentialResponse, GetCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetSignInIntent";
    public CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    public Executor executor;
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                x.f(bundle, "resultData");
                CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback = this.this$0.getCallback();
                CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 credentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
                if (!credentialProviderGetSignInIntentController.maybeReportErrorFromResultReceiver(bundle, credentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1, credentialProviderGetSignInIntentController.getExecutor(), callback, credentialProviderGetSignInIntentController.cancellationSignal)) {
                    this.this$0.handleResponse$credentials_play_services_auth(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i2, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG), callback);
                }
                this.this$0.setCallback(CredentialProviderBaseController.Companion.emptyCallback$credentials_play_services_auth());
            }
        };
    }

    private final GetCredentialException fromGmsException(Throwable th) {
        return CredentialProviderBaseController.Companion.getCredentialExceptionTypeToException$credentials_play_services_auth(((th instanceof i) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((i) th).a()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS, "During get sign-in intent, failure response from one tap: ".concat(String.valueOf(th.getMessage())));
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static final ab handleResponse$lambda$0(CancellationSignal cancellationSignal, a aVar) {
        x.f(aVar, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, aVar);
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$1(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
        x.f(getCredentialException, "e");
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(getCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialResponse getCredentialResponse) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(getCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final CredentialManagerCallback credentialManagerCallback, final aq aqVar) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$3$0(credentialManagerCallback, aqVar);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CredentialManagerCallback credentialManagerCallback, aq aqVar) {
        credentialManagerCallback.onError(aqVar.f48105a);
    }

    static final ab handleResponse$lambda$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(getCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(getCredentialUnknownException);
            }
        });
        return ab.f48028a;
    }

    static final ab invokePlayServices$lambda$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialUnsupportedException getCredentialUnsupportedException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0$0(this.f$0, getCredentialUnsupportedException);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialUnsupportedException getCredentialUnsupportedException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialUnsupportedException);
    }

    static final ab invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Context context, final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, PendingIntent pendingIntent) {
        x.f(pendingIntent, "result");
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            credentialProviderGetSignInIntentController.generateHiddenActivityIntent(credentialProviderGetSignInIntentController.resultReceiver, intent, CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda19
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0(this.f$0);
                    }
                });
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$1$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0$0(this.f$0);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getCallback().onError(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    static final void invokePlayServices$lambda$3(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, CancellationSignal cancellationSignal, Exception exc) {
        x.f(exc, "e");
        final GetCredentialException getCredentialExceptionFromGmsException = credentialProviderGetSignInIntentController.fromGmsException(exc);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0(this.f$0, getCredentialExceptionFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$3$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0$0(this.f$0, getCredentialException);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$3$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialException);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public s convertRequestToPlayServices(GetCredentialRequest getCredentialRequest) throws GetCredentialUnsupportedException {
        x.f(getCredentialRequest, "request");
        if (getCredentialRequest.getCredentialOptions().size() != 1) {
            throw new GetCredentialUnsupportedException("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        CredentialOption credentialOption = getCredentialRequest.getCredentialOptions().get(0);
        x.d(credentialOption, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        c cVar = (c) credentialOption;
        r rVar = new r();
        rVar.f(cVar.b());
        rVar.b(null);
        rVar.d(cVar.a());
        s sVarA = rVar.a();
        x.e(sVarA, "build(...)");
        return sVarA;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialResponse convertResponseToCredentialManager(w wVar) throws GetCredentialUnknownException {
        d dVarCreateGoogleIdCredential;
        x.f(wVar, "response");
        if (wVar.f() != null) {
            dVarCreateGoogleIdCredential = createGoogleIdCredential(wVar);
        } else {
            Log.w(TAG, "Credential returned but no google Id found");
            dVarCreateGoogleIdCredential = null;
        }
        if (dVarCreateGoogleIdCredential != null) {
            return new GetCredentialResponse(dVarCreateGoogleIdCredential);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final d createGoogleIdCredential(w wVar) throws GetCredentialUnknownException {
        x.f(wVar, "response");
        com.google.e.a.d.a.a aVar = new com.google.e.a.d.a.a(null);
        String strG = wVar.g();
        x.e(strG, "getId(...)");
        aVar.l(strG);
        try {
            String strF = wVar.f();
            x.c(strF);
            aVar.m(strF);
            if (wVar.c() != null) {
                aVar.i(wVar.c());
            }
            if (wVar.e() != null) {
                aVar.k(wVar.e());
            }
            if (wVar.d() != null) {
                aVar.j(wVar.d());
            }
            if (wVar.i() != null) {
                aVar.n(wVar.i());
            }
            if (wVar.a() != null) {
                aVar.o(wVar.a());
            }
            return aVar.h();
        } catch (Exception unused) {
            throw new GetCredentialUnknownException("When attempting to convert get response, null Google ID Token found");
        }
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

    public final void handleResponse$credentials_play_services_auth(int i2, int i3, Intent intent, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "callback");
        if (i2 != CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + i2);
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeGet$credentials_play_services_auth(i3, new p() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda6
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$0((CancellationSignal) obj, (a) obj2);
            }
        }, new l() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$1(this.f$0, credentialManagerCallback, (GetCredentialException) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            Context context = this.contextReference.get();
            if (context != null) {
                com.bumptech.glide.g.p.h(context);
                w wVarD = n.d(intent);
                x.e(wVarD, "getSignInCredentialFromIntent(...)");
                final GetCredentialResponse getCredentialResponseConvertResponseToCredentialManager = convertResponseToCredentialManager(wVarD);
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda8
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderGetSignInIntentController.handleResponse$lambda$2(this.f$0, credentialManagerCallback, getCredentialResponseConvertResponseToCredentialManager);
                    }
                });
            }
        } catch (GetCredentialException e2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda10
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$4(this.f$0, credentialManagerCallback, e2);
                }
            });
        } catch (i e3) {
            final aq aqVar = new aq();
            aqVar.f48105a = new GetCredentialUnknownException(e3.getMessage());
            if (e3.a() == 16) {
                aqVar.f48105a = new GetCredentialCancellationException(e3.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e3.a()))) {
                aqVar.f48105a = new GetCredentialInterruptedException(e3.getMessage());
            }
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda9
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$3(this.f$0, credentialManagerCallback, aqVar);
                }
            });
        } catch (Throwable th) {
            final GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th.getMessage());
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda11
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$5(this.f$0, credentialManagerCallback, getCredentialUnknownException);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(GetCredentialRequest getCredentialRequest, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, Executor executor, final CancellationSignal cancellationSignal) {
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
        try {
            t tVarB = com.bumptech.glide.g.p.h(context).b(convertRequestToPlayServices(getCredentialRequest));
            final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda13
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1(cancellationSignal, context, this, (PendingIntent) obj);
                }
            };
            tVarB.r(new o() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda14
                @Override // com.google.android.gms.o.o
                public final void onSuccess(Object obj) {
                    lVar.invoke(obj);
                }
            });
            tVarB.o(new m() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda15
                @Override // com.google.android.gms.o.m
                public final void onFailure(Exception exc) {
                    CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3(this.f$0, cancellationSignal, exc);
                }
            });
        } catch (GetCredentialUnsupportedException e2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda12
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0(this.f$0, e2);
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
    public final class Companion {
        private Companion() {
        }

        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            x.f(context, "context");
            return new CredentialProviderGetSignInIntentController(context);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
