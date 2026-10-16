package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import e.c.d.a;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GetPasswordOption extends CredentialOption {
    public static final String BUNDLE_KEY_ALLOWED_USER_IDS = "androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS";
    public static final Companion Companion = new Companion(null);
    private final Set<String> allowedUserIds;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetPasswordOption(Set<String> set, boolean z, Set<ComponentName> set2) {
        x.f(set, "allowedUserIds");
        x.f(set2, "allowedProviders");
        Companion companion = Companion;
        this(set, z, set2, companion.toBundle$credentials(set), companion.toBundle$credentials(set), 0, 32, null);
    }

    public final Set<String> getAllowedUserIds() {
        return this.allowedUserIds;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final GetPasswordOption createFrom$credentials(Bundle bundle, Set<ComponentName> set, Bundle bundle2) {
            Set setP;
            x.f(bundle, "data");
            x.f(set, "allowedProviders");
            x.f(bundle2, "candidateQueryData");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            if (stringArrayList == null || (setP = i.au(stringArrayList)) == null) {
                setP = a.p();
            }
            return new GetPasswordOption(setP, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle, bundle2, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 1000), null);
        }

        public final Bundle toBundle$credentials(Set<String> set) {
            x.f(set, "allowUserIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS, new ArrayList<>(set));
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPasswordOption(Set<String> set) {
        this(set, false, null, 6, null);
        x.f(set, "allowedUserIds");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPasswordOption(Set<String> set, boolean z) {
        this(set, z, null, 4, null);
        x.f(set, "allowedUserIds");
    }

    public /* synthetic */ GetPasswordOption(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2, int i2, o oVar) {
        this(set, z, set2, bundle, bundle2, i2);
    }

    public GetPasswordOption() {
        this(null, false, null, 7, null);
    }

    public /* synthetic */ GetPasswordOption(Set set, boolean z, Set set2, int i2, o oVar) {
        this((i2 & 1) != 0 ? a.p() : set, z & ((i2 & 2) == 0), (i2 & 4) != 0 ? a.p() : set2);
    }

    private GetPasswordOption(Set<String> set, boolean z, Set<ComponentName> set2, Bundle bundle, Bundle bundle2, int i2) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, set2, i2);
        this.allowedUserIds = set;
    }

    /* synthetic */ GetPasswordOption(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2, int i2, int i3, o oVar) {
        this(set, z, set2, bundle, bundle2, (i3 & 32) != 0 ? 1000 : i2);
    }
}
