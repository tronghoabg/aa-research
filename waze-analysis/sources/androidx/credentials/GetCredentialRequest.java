package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.CredentialOption;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.media3.datasource.HttpEngineDataSource$$ExternalSyntheticApiModelOutline0;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GetCredentialRequest {
    private static final String BUNDLE_KEY_PREFER_IDENTITY_DOC_UI = "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI";
    public static final String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";
    private static final String BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME = "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME";
    public static final Companion Companion = new Companion(null);
    private final List<CredentialOption> credentialOptions;
    private final String origin;
    private final boolean preferIdentityDocUi;
    private final boolean preferImmediatelyAvailableCredentials;
    private final ComponentName preferUiBrandingComponentName;

    /* compiled from: WazeSource */
    public final class Builder {
        private List<CredentialOption> credentialOptions = new ArrayList();
        private String origin;
        private boolean preferIdentityDocUi;
        private boolean preferImmediatelyAvailableCredentials;
        private ComponentName preferUiBrandingComponentName;

        public final Builder addCredentialOption(CredentialOption credentialOption) {
            x.f(credentialOption, "credentialOption");
            this.credentialOptions.add(credentialOption);
            return this;
        }

        public final GetCredentialRequest build() {
            return new GetCredentialRequest(i.ao(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        public final Builder setCredentialOptions(List<? extends CredentialOption> list) {
            x.f(list, "credentialOptions");
            this.credentialOptions = i.aq(list);
            return this;
        }

        public final Builder setOrigin(String str) {
            x.f(str, TtmlNode.ATTR_TTS_ORIGIN);
            this.origin = str;
            return this;
        }

        public final Builder setPreferIdentityDocUi(boolean z) {
            this.preferIdentityDocUi = z;
            return this;
        }

        public final Builder setPreferImmediatelyAvailableCredentials(boolean z) {
            this.preferImmediatelyAvailableCredentials = z;
            return this;
        }

        public final Builder setPreferUiBrandingComponentName(ComponentName componentName) {
            this.preferUiBrandingComponentName = componentName;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z, ComponentName componentName, boolean z2) {
        x.f(list, "credentialOptions");
        this.credentialOptions = list;
        this.origin = str;
        this.preferIdentityDocUi = z;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            List<? extends CredentialOption> list2 = list;
            int i2 = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((CredentialOption) it.next()) instanceof GetDigitalCredentialOption) && (i2 = i2 + 1) < 0) {
                        i.o();
                    }
                }
            }
            if (i2 > 0 && i2 != this.credentialOptions.size()) {
                throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            Iterator<CredentialOption> it2 = this.credentialOptions.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof GetRestoreCredentialOption) {
                    throw new IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                }
            }
        }
    }

    public static final GetCredentialRequest createFrom(android.credentials.GetCredentialRequest getCredentialRequest) {
        return Companion.createFrom(getCredentialRequest);
    }

    public static final Bundle getRequestMetadataBundle(GetCredentialRequest getCredentialRequest) {
        return Companion.getRequestMetadataBundle(getCredentialRequest);
    }

    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    public final boolean preferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final GetCredentialRequest createFrom(android.credentials.GetCredentialRequest getCredentialRequest) {
            x.f(getCredentialRequest, "request");
            List credentialOptions = getCredentialRequest.getCredentialOptions();
            x.e(credentialOptions, "getCredentialOptions(...)");
            List list = credentialOptions;
            ArrayList arrayList = new ArrayList(i.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                android.credentials.CredentialOption credentialOptionM12401m = HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12401m(it.next());
                CredentialOption.Companion companion = CredentialOption.Companion;
                x.c(credentialOptionM12401m);
                arrayList.add(companion.createFrom(credentialOptionM12401m));
            }
            String origin = getCredentialRequest.getOrigin();
            Bundle data = getCredentialRequest.getData();
            x.e(data, "getData(...)");
            return createFrom(arrayList, origin, data);
        }

        public final Bundle getRequestMetadataBundle(GetCredentialRequest getCredentialRequest) {
            x.f(getCredentialRequest, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI, getCredentialRequest.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", getCredentialRequest.preferImmediatelyAvailableCredentials());
            bundle.putParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME, getCredentialRequest.getPreferUiBrandingComponentName());
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final GetCredentialRequest createFrom(List<? extends CredentialOption> list, String str, Bundle bundle) throws FrameworkClassParsingException {
            x.f(list, "credentialOptions");
            x.f(bundle, TtmlNode.TAG_METADATA);
            try {
                boolean z = bundle.getBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI);
                boolean z2 = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS");
                ComponentName componentName = (ComponentName) bundle.getParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME);
                Builder builder = new Builder();
                builder.setCredentialOptions(list);
                builder.setPreferIdentityDocUi(z);
                builder.setPreferUiBrandingComponentName(componentName);
                builder.setPreferImmediatelyAvailableCredentials(z2);
                if (str != null) {
                    builder.setOrigin(str);
                }
                return builder.build();
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }
    }

    public static final GetCredentialRequest createFrom(List<? extends CredentialOption> list, String str, Bundle bundle) {
        return Companion.createFrom(list, str, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str) {
        this(list, str, false, null, false, 28, null);
        x.f(list, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z) {
        this(list, str, z, null, false, 24, null);
        x.f(list, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z, ComponentName componentName) {
        this(list, str, z, componentName, false, 16, null);
        x.f(list, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list) {
        this(list, null, false, null, false, 30, null);
        x.f(list, "credentialOptions");
    }

    public /* synthetic */ GetCredentialRequest(List list, String str, boolean z, ComponentName componentName, boolean z2, int i2, o oVar) {
        this(list, (i2 & 2) != 0 ? null : str, z & ((i2 & 4) == 0), (i2 & 8) != 0 ? null : componentName, z2 & ((i2 & 16) == 0));
    }
}
