package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class CreatePublicKeyCredentialException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialException(String str, CharSequence charSequence) {
        super(str, charSequence);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    public static final CreateCredentialException createFrom(String str, String str2) {
        return Companion.createFrom(str, str2);
    }

    @Override // androidx.credentials.exceptions.CreateCredentialException
    public String getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreateCredentialException createFrom(String str, String str2) throws FrameworkClassParsingException {
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            try {
                if (o.F(str, CreatePublicKeyCredentialDomException.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false)) {
                    return CreatePublicKeyCredentialDomException.Companion.createFrom(str, str2);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CreateCredentialCustomException(str, str2);
            }
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreatePublicKeyCredentialException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
    }

    public /* synthetic */ CreatePublicKeyCredentialException(String str, CharSequence charSequence, int i2, h.g.b.o oVar) {
        this(str, (i2 & 2) != 0 ? null : charSequence);
    }
}
