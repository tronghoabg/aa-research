package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ProviderCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREATE_CREDENTIAL_REQUEST_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_TYPE";
    private static final String EXTRA_CREATE_REQUEST_CANDIDATE_QUERY_DATA = "androidx.credentials.provider.extra.CREATE_REQUEST_CANDIDATE_QUERY_DATA";
    private static final String EXTRA_CREATE_REQUEST_CREDENTIAL_DATA = "androidx.credentials.provider.extra.CREATE_REQUEST_CREDENTIAL_DATA";
    private final BiometricPromptResult biometricPromptResult;
    private final CallingAppInfo callingAppInfo;
    private final CreateCredentialRequest callingRequest;
    private final Bundle sourceBundle;

    public ProviderCreateCredentialRequest(CreateCredentialRequest createCredentialRequest, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle) {
        x.f(createCredentialRequest, "callingRequest");
        x.f(callingAppInfo, "callingAppInfo");
        this.callingRequest = createCredentialRequest;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
        this.sourceBundle = bundle;
    }

    public static final Bundle asBundle(ProviderCreateCredentialRequest providerCreateCredentialRequest) {
        return Companion.asBundle(providerCreateCredentialRequest);
    }

    public static final ProviderCreateCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final CreateCredentialRequest getCallingRequest() {
        return this.callingRequest;
    }

    public final Bundle getSourceBundle() {
        return this.sourceBundle;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(ProviderCreateCredentialRequest providerCreateCredentialRequest) {
            x.f(providerCreateCredentialRequest, "request");
            Bundle bundle = new Bundle();
            bundle.putString(ProviderCreateCredentialRequest.EXTRA_CREATE_CREDENTIAL_REQUEST_TYPE, providerCreateCredentialRequest.getCallingRequest().getType());
            bundle.putBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CREDENTIAL_DATA, providerCreateCredentialRequest.getCallingRequest().getCredentialData());
            bundle.putBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CANDIDATE_QUERY_DATA, providerCreateCredentialRequest.getCallingRequest().getCandidateQueryData());
            CallingAppInfo.Companion.setCallingAppInfo$credentials(bundle, providerCreateCredentialRequest.getCallingAppInfo());
            return bundle;
        }

        public final ProviderCreateCredentialRequest fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            String string = bundle.getString(ProviderCreateCredentialRequest.EXTRA_CREATE_CREDENTIAL_REQUEST_TYPE);
            if (string == null) {
                throw new IllegalArgumentException("Bundle was missing request type.");
            }
            Bundle bundle2 = bundle.getBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CREDENTIAL_DATA);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            Bundle bundle4 = bundle.getBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CANDIDATE_QUERY_DATA);
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            Bundle bundle5 = bundle4;
            String string2 = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            CallingAppInfo callingAppInfoExtractCallingAppInfo = CallingAppInfo.Companion.extractCallingAppInfo(bundle);
            if (callingAppInfoExtractCallingAppInfo == null) {
                throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            try {
                return new ProviderCreateCredentialRequest(CreateCredentialRequest.Companion.createFrom(string, bundle3, bundle5, false, string2), callingAppInfoExtractCallingAppInfo, null, bundle);
            } catch (Exception e2) {
                e2.toString();
                throw new IllegalArgumentException("Conversion failed with ".concat(e2.toString()));
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderCreateCredentialRequest(CreateCredentialRequest createCredentialRequest, CallingAppInfo callingAppInfo) {
        this(createCredentialRequest, callingAppInfo, null, 4, null);
        x.f(createCredentialRequest, "callingRequest");
        x.f(callingAppInfo, "callingAppInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderCreateCredentialRequest(CreateCredentialRequest createCredentialRequest, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult) {
        this(createCredentialRequest, callingAppInfo, biometricPromptResult, null);
        x.f(createCredentialRequest, "callingRequest");
        x.f(callingAppInfo, "callingAppInfo");
    }

    public /* synthetic */ ProviderCreateCredentialRequest(CreateCredentialRequest createCredentialRequest, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, int i2, o oVar) {
        this(createCredentialRequest, callingAppInfo, (i2 & 4) != 0 ? null : biometricPromptResult);
    }
}
