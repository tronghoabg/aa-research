package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;
import h.g.b.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateRestoreCredentialRequest extends CreateCredentialRequest {
    private static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST";
    private static final String BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD = "androidx.credentials.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD";
    public static final Companion Companion = new Companion(null);
    private final boolean isCloudBackupEnabled;
    private final String requestJson;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateRestoreCredentialRequest(String str, boolean z) throws JSONException {
        x.f(str, "requestJson");
        Companion companion = Companion;
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, companion.toCredentialDataBundle(str, z), new Bundle(), false, false, companion.getDisplayInfoFromJson(str), null, false);
        this.requestJson = str;
        this.isCloudBackupEnabled = z;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final boolean isCloudBackupEnabled() {
        return this.isCloudBackupEnabled;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CreateCredentialRequest.DisplayInfo getDisplayInfoFromJson(String str) throws JSONException {
            try {
                String string = new JSONObject(str).getJSONObject("user").getString(TtmlNode.ATTR_ID);
                x.e(string, "getString(...)");
                return new CreateCredentialRequest.DisplayInfo(string, (CharSequence) null, 2, (o) null);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.id must be defined in requestJson");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toCredentialDataBundle(String str, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialRequest.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST, str);
            bundle.putBoolean(CreateRestoreCredentialRequest.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD, z);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialRequest(String str) {
        this(str, false, 2, null);
        x.f(str, "requestJson");
    }

    public /* synthetic */ CreateRestoreCredentialRequest(String str, boolean z, int i2, o oVar) {
        this(str, z | (!((i2 & 2) == 0)));
    }
}
