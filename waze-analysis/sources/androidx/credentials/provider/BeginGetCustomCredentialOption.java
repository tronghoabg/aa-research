package androidx.credentials.provider;

import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class BeginGetCustomCredentialOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetCustomCredentialOption(String str, String str2, Bundle bundle) {
        super(str, str2, bundle);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "candidateQueryData");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final BeginGetCustomCredentialOption createFrom$credentials(Bundle bundle, String str, String str2) {
            x.f(bundle, "data");
            x.f(str, TtmlNode.ATTR_ID);
            x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            return new BeginGetCustomCredentialOption(str, str2, bundle);
        }

        public final BeginGetCustomCredentialOption createFromEntrySlice$credentials(Bundle bundle, String str, String str2) {
            x.f(bundle, "data");
            x.f(str, TtmlNode.ATTR_ID);
            x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            return new BeginGetCustomCredentialOption(str, str2, bundle);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
