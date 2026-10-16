package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BeginCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private final CallingAppInfo callingAppInfo;
    private final Bundle candidateQueryData;
    private final String type;

    /* compiled from: WazeSource */
    final class Api21Impl {
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA";
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE";
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialRequest beginCreateCredentialRequest) {
            x.f(bundle, "bundle");
            x.f(beginCreateCredentialRequest, "request");
            bundle.putString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE, beginCreateCredentialRequest.getType());
            bundle.putBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA, beginCreateCredentialRequest.getCandidateQueryData());
            CallingAppInfo callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion.setCallingAppInfo$credentials(bundle, callingAppInfo);
            }
        }

        public static final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            String string = bundle.getString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE);
            if (string == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            return BeginCreateCredentialRequest.Companion.createFrom(string, bundle2, CallingAppInfo.Companion.extractCallingAppInfo(bundle));
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialRequest";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialRequest beginCreateCredentialRequest) {
            x.f(bundle, "bundle");
            x.f(beginCreateCredentialRequest, "request");
            bundle.putParcelable(REQUEST_KEY, BeginCreateCredentialUtil.Companion.convertToFrameworkRequest(beginCreateCredentialRequest));
        }

        public static final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest = (android.service.credentials.BeginCreateCredentialRequest) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return BeginCreateCredentialUtil.Companion.convertToJetpackRequest$credentials(beginCreateCredentialRequest);
            }
            return null;
        }
    }

    public BeginCreateCredentialRequest(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "candidateQueryData");
        this.type = str;
        this.candidateQueryData = bundle;
        this.callingAppInfo = callingAppInfo;
    }

    public static final Bundle asBundle(BeginCreateCredentialRequest beginCreateCredentialRequest) {
        return Companion.asBundle(beginCreateCredentialRequest);
    }

    public static final BeginCreateCredentialRequest createFrom(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        return Companion.createFrom(str, bundle, callingAppInfo);
    }

    public static final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(BeginCreateCredentialRequest beginCreateCredentialRequest) {
            x.f(beginCreateCredentialRequest, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginCreateCredentialRequest);
                return bundle;
            }
            Api21Impl.asBundle(bundle, beginCreateCredentialRequest);
            return bundle;
        }

        public final BeginCreateCredentialRequest createFrom(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(bundle, "candidateQueryData");
            try {
                return x.n(str, PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? BeginCreatePasswordCredentialRequest.Companion.createFrom$credentials(bundle, callingAppInfo) : x.n(str, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? BeginCreatePublicKeyCredentialRequest.Companion.createFrom$credentials(bundle, callingAppInfo) : new BeginCreateCustomCredentialRequest(str, bundle, callingAppInfo);
            } catch (FrameworkClassParsingException unused) {
                return new BeginCreateCustomCredentialRequest(str, bundle, callingAppInfo);
            }
        }

        public final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api21Impl.fromBundle(bundle);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
