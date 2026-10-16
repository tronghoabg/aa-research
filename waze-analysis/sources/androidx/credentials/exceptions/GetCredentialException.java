package androidx.credentials.exceptions;

import android.os.Bundle;
import androidx.credentials.internal.ConversionUtilsKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class GetCredentialException extends Exception {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE";
    private static final String EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE";
    private final CharSequence errorMessage;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.type = str;
        this.errorMessage = charSequence;
    }

    public static final Bundle asBundle(GetCredentialException getCredentialException) {
        return Companion.asBundle(getCredentialException);
    }

    public static final GetCredentialException fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    public String getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(GetCredentialException getCredentialException) {
            x.f(getCredentialException, "ex");
            Bundle bundle = new Bundle();
            bundle.putString(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE, getCredentialException.getType());
            CharSequence errorMessage = getCredentialException.getErrorMessage();
            if (errorMessage != null) {
                bundle.putCharSequence(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE, errorMessage);
            }
            return bundle;
        }

        public final GetCredentialException fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            String string = bundle.getString(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE);
            if (string != null) {
                return ConversionUtilsKt.toJetpackGetException(string, bundle.getCharSequence(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE));
            }
            throw new IllegalArgumentException("Bundle was missing exception type.");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
    }

    public /* synthetic */ GetCredentialException(String str, CharSequence charSequence, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : charSequence);
    }
}
