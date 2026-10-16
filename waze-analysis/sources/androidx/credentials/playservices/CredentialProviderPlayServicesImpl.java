package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreateDigitalCredentialRequest;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreateRestoreCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.CredentialProvider;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetDigitalCredentialOption;
import androidx.credentials.GetRestoreCredentialOption;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.SignalCredentialStateRequest;
import androidx.credentials.SignalCredentialStateResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateProviderConfigurationException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.bumptech.glide.g.p;
import com.google.android.gms.auth.api.identity.a.n;
import com.google.android.gms.common.ad;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.ah;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.d;
import com.google.android.gms.common.h;
import com.google.android.gms.common.util.g;
import com.google.android.gms.identitycredentials.b;
import com.google.android.gms.identitycredentials.c;
import com.google.android.gms.o.m;
import com.google.android.gms.o.o;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.x;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderPlayServicesImpl implements CredentialProvider {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_CONDITIONAL_CREATE_PASSKEY = 251300000;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private h googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        x.f(context, "context");
        this.context = context;
        h hVarB = h.b();
        x.e(hVarB, "getInstance(...)");
        this.googleApiAvailability = hVarB;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int i2) {
        return this.googleApiAvailability.m(context, i2);
    }

    static final ab onClearCredential$lambda$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    static final ab onClearCredential$lambda$1(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Boolean bool) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda24
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(executor, credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab onClearCredential$lambda$1$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(null);
            }
        });
        return ab.f48028a;
    }

    static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Exception exc) {
        x.f(exc, "e");
        Log.w(TAG, "Clearing restore credential failed", exc);
        final aq aqVar = new aq();
        aqVar.f48105a = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof i) && ((i) exc).a() == 40201) {
            aqVar.f48105a = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0(executor, credentialManagerCallback, aqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab onClearCredential$lambda$3$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final aq aqVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(credentialManagerCallback, aqVar);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(CredentialManagerCallback credentialManagerCallback, aq aqVar) {
        credentialManagerCallback.onError(aqVar.f48105a);
    }

    static final ab onClearCredential$lambda$4(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, c cVar) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda20
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(executor, credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab onClearCredential$lambda$4$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(null);
            }
        });
        return ab.f48028a;
    }

    static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        x.f(exc, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
    }

    static final ab onCreateCredential$lambda$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnsupportedException("Conditional create flow is not supported on this version of Google Play Services"));
    }

    static final ab onCreateCredential$lambda$1(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$1$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$1$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    static final ab onGetCredential$lambda$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    static final ab onGetCredential$lambda$1(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(ClearCredentialStateRequest clearCredentialStateRequest, final CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
        n nVarH = p.h(this.context);
        nVarH.f().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator it = t.b().iterator();
        while (it.hasNext()) {
            ((t) it.next()).c();
        }
        ah.w();
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.b.a.f4637b);
        bmVarB.c(new com.google.android.gms.auth.a.b.a.c(nVarH, 1));
        bmVarB.d();
        bmVarB.f(DisplayStrings.DS_MAP_POPUP_USER_KILO_POINTS);
        com.google.android.gms.o.t tVarQ = nVarH.q(bmVarB.b());
        final l lVar = new l() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda25
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, credentialManagerCallback, (Void) obj);
            }
        };
        tVarQ.r(new o() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda26
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarQ.o(new m() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda27
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2(this.f$0, cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }

    static final ab runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Void r4) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda23
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(executor, credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab runFallbackClearCredFlow$lambda$0$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(null);
            }
        });
        return ab.f48028a;
    }

    static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception exc) {
        x.f(exc, "e");
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda15
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0(exc, executor, credentialManagerCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab runFallbackClearCredFlow$lambda$2$0$0(final Exception exc, Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Objects.toString(exc);
        Log.w(TAG, "During clear credential sign out failed with ".concat(String.valueOf(exc)));
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0(credentialManagerCallback, exc);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
        credentialManagerCallback.onError(new ClearCredentialUnknownException(exc.getMessage()));
    }

    public final h getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i2) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i2);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            d dVar = new d(iIsGooglePlayServicesAvailable);
            dVar.toString();
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: ".concat(dVar.toString()));
        }
        return z;
    }

    @Override // androidx.credentials.CredentialProvider
    public void onClearCredential(final ClearCredentialStateRequest clearCredentialStateRequest, final CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
        x.f(clearCredentialStateRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (x.n(clearCredentialStateRequest.getRequestType(), ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda8
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(executor, credentialManagerCallback);
                    }
                });
                return;
            }
            com.google.android.gms.o.t tVarA = ad.c(this.context).a(new com.google.android.gms.auth.a.b.a(clearCredentialStateRequest.getRequestBundle()));
            final l lVar = new l() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda9
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(cancellationSignal, executor, credentialManagerCallback, (Boolean) obj);
                }
            };
            tVarA.r(new o() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10
                @Override // com.google.android.gms.o.o
                public final void onSuccess(Object obj) {
                    lVar.invoke(obj);
                }
            });
            tVarA.o(new m() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda11
                @Override // com.google.android.gms.o.m
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$3(cancellationSignal, executor, credentialManagerCallback, exc);
                }
            });
            return;
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            runFallbackClearCredFlow(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
            return;
        }
        com.google.android.gms.o.t tVarA2 = g.c(this.context).a(new b());
        final l lVar2 = new l() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda12
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(cancellationSignal, executor, credentialManagerCallback, (c) obj);
            }
        };
        tVarA2.r(new o() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda13
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar2.invoke(obj);
            }
        });
        tVarA2.o(new m() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda14
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$6(this.f$0, clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }

    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(createCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (createCredentialRequest instanceof CreatePasswordRequest) {
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePasswordCredentialController.Companion.getInstance(context).invokePlayServices((CreatePasswordRequest) createCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else {
                CredentialProviderCreatePasswordController.Companion.getInstance(context).invokePlayServices((CreatePasswordRequest) createCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            }
        }
        if (!(createCredentialRequest instanceof CreatePublicKeyCredentialRequest)) {
            if (!(createCredentialRequest instanceof CreateRestoreCredentialRequest)) {
                if (!(createCredentialRequest instanceof CreateDigitalCredentialRequest)) {
                    throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
                }
                new CreateDigitalCredentialController(context).invokePlayServices((CreateDigitalCredentialRequest) createCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((CreateRestoreCredentialRequest) createCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda29
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onCreateCredential$lambda$1(executor, credentialManagerCallback);
                    }
                });
                return;
            }
        }
        CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (CreatePublicKeyCredentialRequest) createCredentialRequest;
        if (createPublicKeyCredentialRequest.isConditional()) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_CONDITIONAL_CREATE_PASSKEY)) {
                CreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices(createPublicKeyCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda28
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0(executor, credentialManagerCallback);
                    }
                });
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            CreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices(createPublicKeyCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        } else {
            CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices(createPublicKeyCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(context, "context");
        x.f(getCredentialRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth(getCredentialRequest)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onGetCredential$lambda$0(executor, credentialManagerCallback);
                    }
                });
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth(getCredentialRequest)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, credentialManagerCallback);
                    }
                });
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new GetCredentialController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth(getCredentialRequest)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public /* synthetic */ void onPrepareCredential(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        CredentialProvider.CC.$default$onPrepareCredential(this, getCredentialRequest, cancellationSignal, executor, credentialManagerCallback);
    }

    @Override // androidx.credentials.CredentialProvider
    public void onSignalCredentialState(SignalCredentialStateRequest signalCredentialStateRequest, Executor executor, final CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> credentialManagerCallback) {
        x.f(signalCredentialStateRequest, "request");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_SIGNAL_API)) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    credentialManagerCallback.onError(new SignalCredentialStateProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
                }
            });
        } else {
            CredentialProviderController.invokePlayServices$default(SignalCredentialStateController.Companion.getInstance(this.context), signalCredentialStateRequest, credentialManagerCallback, executor, null, 8, null);
        }
    }

    public final void setGoogleApiAvailability(h hVar) {
        x.f(hVar, "<set-?>");
        this.googleApiAvailability = hVar;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean cancellationReviewer$credentials_play_services_auth(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth(CancellationSignal cancellationSignal, a<ab> aVar) {
            x.f(aVar, "callback");
            if (cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            aVar.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth(GetCredentialRequest getCredentialRequest) {
            x.f(getCredentialRequest, "request");
            Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetDigitalCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth(GetCredentialRequest getCredentialRequest) {
            x.f(getCredentialRequest, "request");
            Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetRestoreCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth(GetCredentialRequest getCredentialRequest) {
            x.f(getCredentialRequest, "request");
            Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof com.google.android.libraries.c.a.c) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    @Override // androidx.credentials.CredentialProvider
    public /* synthetic */ void onGetCredential(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        CredentialProvider.CC.$default$onGetCredential(this, context, pendingGetCredentialHandle, cancellationSignal, executor, credentialManagerCallback);
    }
}
