package androidx.credentials.provider;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.CredentialOption;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ProviderGetCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_";
    private static final String EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_";
    private static final String EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_";
    private static final String EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_";
    private static final String EXTRA_CREDENTIAL_OPTION_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE";
    private static final String EXTRA_CREDENTIAL_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";
    private final BiometricPromptResult biometricPromptResult;
    private final CallingAppInfo callingAppInfo;
    private final List<CredentialOption> credentialOptions;
    private final Bundle sourceBundle;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderGetCredentialRequest(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle) {
        x.f(list, "credentialOptions");
        x.f(callingAppInfo, "callingAppInfo");
        this.credentialOptions = list;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
        this.sourceBundle = bundle;
    }

    public static final Bundle asBundle(ProviderGetCredentialRequest providerGetCredentialRequest) {
        return Companion.asBundle(providerGetCredentialRequest);
    }

    public static final ProviderGetCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final Bundle getSourceBundle() {
        return this.sourceBundle;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ProviderGetCredentialRequest createFrom$credentials$default(Companion companion, List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                biometricPromptResult = null;
            }
            return companion.createFrom$credentials(list, callingAppInfo, biometricPromptResult, bundle);
        }

        public final Bundle asBundle(ProviderGetCredentialRequest providerGetCredentialRequest) {
            x.f(providerGetCredentialRequest, "request");
            Bundle bundle = new Bundle();
            int size = providerGetCredentialRequest.getCredentialOptions().size();
            bundle.putInt(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_SIZE, size);
            for (int i2 = 0; i2 < size; i2++) {
                CredentialOption credentialOption = providerGetCredentialRequest.getCredentialOptions().get(i2);
                bundle.putString(a.a(i2, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_"), credentialOption.getType());
                bundle.putBundle(a.a(i2, ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX), credentialOption.getCandidateQueryData());
                bundle.putBundle(a.a(i2, ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX), credentialOption.getRequestData());
                bundle.putBoolean(a.a(i2, ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX), credentialOption.isSystemProviderRequired());
                bundle.putParcelableArray(a.a(i2, ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX), (Parcelable[]) credentialOption.getAllowedProviders().toArray(new ComponentName[0]));
            }
            CallingAppInfo.Companion.setCallingAppInfo$credentials(bundle, providerGetCredentialRequest.getCallingAppInfo());
            return bundle;
        }

        public final ProviderGetCredentialRequest createFrom$credentials(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle) {
            x.f(list, "options");
            x.f(callingAppInfo, "callingAppInfo");
            return new ProviderGetCredentialRequest(list, callingAppInfo, biometricPromptResult, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #0 {Exception -> 0x0085, blocks: (B:15:0x0053, B:17:0x005f, B:19:0x006a, B:21:0x0070, B:22:0x0073, B:23:0x0076, B:25:0x0080), top: B:41:0x0053 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.credentials.provider.ProviderGetCredentialRequest fromBundle(android.os.Bundle r17) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.ProviderGetCredentialRequest.Companion.fromBundle(android.os.Bundle):androidx.credentials.provider.ProviderGetCredentialRequest");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderGetCredentialRequest(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo) {
        this(list, callingAppInfo, null, 4, null);
        x.f(list, "credentialOptions");
        x.f(callingAppInfo, "callingAppInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderGetCredentialRequest(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult) {
        this(list, callingAppInfo, biometricPromptResult, null);
        x.f(list, "credentialOptions");
        x.f(callingAppInfo, "callingAppInfo");
    }

    public /* synthetic */ ProviderGetCredentialRequest(List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, int i2, o oVar) {
        this(list, callingAppInfo, (i2 & 4) != 0 ? null : biometricPromptResult);
    }
}
