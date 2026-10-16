package androidx.credentials;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreatePasswordRequest extends CreateCredentialRequest {
    public static final String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";
    public static final String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";
    public static final Companion Companion = new Companion(null);
    private final String id;
    private final String password;

    /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2, int i2, o oVar) {
        this(str, str2, z, displayInfo, (i2 & 16) != 0 ? null : str3, z2, (i2 & 64) != 0 ? Companion.toCredentialDataBundle$credentials(str, str2) : bundle, (i2 & 128) != 0 ? Companion.toCandidateDataBundle$credentials() : bundle2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreatePasswordRequest createFrom$credentials(Bundle bundle, String str, Bundle bundle2) throws FrameworkClassParsingException {
            CreateCredentialRequest.DisplayInfo displayInfo;
            x.f(bundle, "data");
            x.f(bundle2, "candidateQueryData");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                x.c(string);
                String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                x.c(string2);
                try {
                    displayInfo = CreateCredentialRequest.DisplayInfo.Companion.createFrom(bundle);
                } catch (IllegalArgumentException unused) {
                    displayInfo = new CreateCredentialRequest.DisplayInfo(string, null);
                }
                return new CreatePasswordRequest(string, string2, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), displayInfo, str, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false), bundle, bundle2, null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toCandidateDataBundle$credentials() {
            return new Bundle();
        }

        public final Bundle toCredentialDataBundle$credentials(String str, String str2) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(String str, String str2, String str3) {
        this(str, str2, str3, false, false, 24, null);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, false, 16, null);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2, o oVar) {
        this(str, str2, z, displayInfo, str3, z2, bundle, bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this(str, str2, z2, new CreateCredentialRequest.DisplayInfo(str, null, str4), str3, z, null, null, 192, null);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(String str, String str2, String str3, boolean z, boolean z2) {
        this(str, str2, z2, new CreateCredentialRequest.DisplayInfo(str, null), str3, z, null, null, 192, null);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, String str3, boolean z, boolean z2, int i2, o oVar) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, ((i2 & 8) == 0) & z, ((i2 & 16) == 0) & z2);
    }

    private CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str3, z2);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(String str, String str2) {
        this(str, str2, null, false, false, 28, null);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
    }
}
