package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.PasswordCredential;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginGetPasswordOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final Set<String> allowedUserIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPasswordOption(Set<String> set, Bundle bundle, String str) {
        super(str, PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
        x.f(set, "allowedUserIds");
        x.f(bundle, "candidateQueryData");
        x.f(str, TtmlNode.ATTR_ID);
        this.allowedUserIds = set;
    }

    public static final BeginGetPasswordOption createForTest(Bundle bundle, String str) {
        return Companion.createForTest(bundle, str);
    }

    public final Set<String> getAllowedUserIds() {
        return this.allowedUserIds;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final BeginGetPasswordOption createForTest(Bundle bundle, String str) {
            x.f(bundle, "data");
            x.f(str, TtmlNode.ATTR_ID);
            return createFrom$credentials(bundle, str);
        }

        public final BeginGetPasswordOption createFrom$credentials(Bundle bundle, String str) {
            Set setP;
            x.f(bundle, "data");
            x.f(str, TtmlNode.ATTR_ID);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            if (stringArrayList == null || (setP = i.au(stringArrayList)) == null) {
                setP = e.c.d.a.p();
            }
            return new BeginGetPasswordOption(setP, bundle, str);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
