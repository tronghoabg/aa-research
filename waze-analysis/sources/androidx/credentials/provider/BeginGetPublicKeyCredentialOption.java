package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.RequestValidationUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginGetPublicKeyCredentialOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final String requestJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2, byte[] bArr) {
        super(str, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        x.f(bundle, "candidateQueryData");
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "requestJson");
        this.requestJson = str2;
        this.clientDataHash = bArr;
        if (!RequestValidationUtil.Companion.isValidJSON(str2)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final BeginGetPublicKeyCredentialOption createFrom$credentials(Bundle bundle, String str) throws FrameworkClassParsingException {
            x.f(bundle, "data");
            x.f(str, TtmlNode.ATTR_ID);
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                x.c(string);
                return new BeginGetPublicKeyCredentialOption(bundle, str, string, byteArray);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final BeginGetPublicKeyCredentialOption createFromEntrySlice$credentials(Bundle bundle, String str) {
            x.f(bundle, "data");
            x.f(str, TtmlNode.ATTR_ID);
            return new BeginGetPublicKeyCredentialOption(bundle, str, "{\"dummy_key\":\"dummy_value\"}", null, 8, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2) {
        this(bundle, str, str2, null, 8, null);
        x.f(bundle, "candidateQueryData");
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "requestJson");
    }

    public /* synthetic */ BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2, byte[] bArr, int i2, o oVar) {
        this(bundle, str, str2, (i2 & 8) != 0 ? null : bArr);
    }
}
