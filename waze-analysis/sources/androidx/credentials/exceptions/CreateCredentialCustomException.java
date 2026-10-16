package androidx.credentials.exceptions;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateCredentialCustomException extends CreateCredentialException {
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCredentialCustomException(String str, CharSequence charSequence) {
        super(str, charSequence);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // androidx.credentials.exceptions.CreateCredentialException
    public String getType() {
        return this.type;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialCustomException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
    }

    public /* synthetic */ CreateCredentialCustomException(String str, CharSequence charSequence, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : charSequence);
    }
}
