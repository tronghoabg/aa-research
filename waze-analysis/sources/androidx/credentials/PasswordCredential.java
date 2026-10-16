package androidx.credentials;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PasswordCredential extends Credential {
    public static final String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";
    public static final String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_PASSWORD_CREDENTIAL = "android.credentials.TYPE_PASSWORD_CREDENTIAL";
    private final String id;
    private final String password;

    private PasswordCredential(String str, String str2, Bundle bundle) {
        super(TYPE_PASSWORD_CREDENTIAL, bundle);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
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

        public final PasswordCredential createFrom$credentials(Bundle bundle) throws FrameworkClassParsingException {
            x.f(bundle, "data");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                x.c(string);
                x.c(string2);
                return new PasswordCredential(string, string2, bundle, null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials(String str, String str2) {
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
    public PasswordCredential(String str, String str2) {
        this(str, str2, Companion.toBundle$credentials(str, str2));
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
    }

    public /* synthetic */ PasswordCredential(String str, String str2, Bundle bundle, o oVar) {
        this(str, str2, bundle);
    }
}
