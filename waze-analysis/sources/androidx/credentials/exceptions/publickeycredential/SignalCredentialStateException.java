package androidx.credentials.exceptions.publickeycredential;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class SignalCredentialStateException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SignalCredentialStateException createFrom(String str, String str2) {
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            int iHashCode = str.hashCode();
            if (iHashCode != 23095403) {
                if (iHashCode != 1509209331) {
                    if (iHashCode == 1902044575 && str.equals(SignalCredentialUnknownException.TYPE_SIGNAL_CREDENTIAL_STATE_UNKNOWN_EXCEPTION)) {
                        return new SignalCredentialUnknownException(str2);
                    }
                } else if (str.equals(SignalCredentialStateProviderConfigurationException.TYPE_SIGNAL_CREDENTIAL_STATE_PROVIDER_CONFIGURATION_EXCEPTION)) {
                    return new SignalCredentialStateProviderConfigurationException(str2);
                }
            } else if (str.equals(SignalCredentialSecurityException.TYPE_SIGNAL_CREDENTIAL_STATE_SECURITY_EXCEPTION)) {
                return new SignalCredentialSecurityException(str2);
            }
            return new SignalCredentialUnknownException(str2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final SignalCredentialStateException createFrom(String str) {
            return new SignalCredentialUnknownException(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignalCredentialStateException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
    }

    public /* synthetic */ SignalCredentialStateException(String str, CharSequence charSequence, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : charSequence);
    }
}
