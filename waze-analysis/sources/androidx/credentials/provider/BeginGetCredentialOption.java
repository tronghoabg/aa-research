package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final Bundle candidateQueryData;
    private final String id;
    private final String type;

    public BeginGetCredentialOption(String str, String str2, Bundle bundle) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "candidateQueryData");
        this.id = str;
        this.type = str2;
        this.candidateQueryData = bundle;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final BeginGetCredentialOption createFrom$credentials(String str, String str2, Bundle bundle) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(bundle, "candidateQueryData");
            return x.n(str2, PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? BeginGetPasswordOption.Companion.createFrom$credentials(bundle, str) : x.n(str2, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? BeginGetPublicKeyCredentialOption.Companion.createFrom$credentials(bundle, str) : new BeginGetCustomCredentialOption(str, str2, bundle);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
