package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.domerrors.AbortError;
import androidx.credentials.exceptions.domerrors.ConstraintError;
import androidx.credentials.exceptions.domerrors.DataCloneError;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.HierarchyRequestError;
import androidx.credentials.exceptions.domerrors.InUseAttributeError;
import androidx.credentials.exceptions.domerrors.InvalidCharacterError;
import androidx.credentials.exceptions.domerrors.InvalidModificationError;
import androidx.credentials.exceptions.domerrors.InvalidNodeTypeError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NamespaceError;
import androidx.credentials.exceptions.domerrors.NetworkError;
import androidx.credentials.exceptions.domerrors.NoModificationAllowedError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.NotFoundError;
import androidx.credentials.exceptions.domerrors.NotReadableError;
import androidx.credentials.exceptions.domerrors.NotSupportedError;
import androidx.credentials.exceptions.domerrors.OperationError;
import androidx.credentials.exceptions.domerrors.OptOutError;
import androidx.credentials.exceptions.domerrors.QuotaExceededError;
import androidx.credentials.exceptions.domerrors.ReadOnlyError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.domerrors.SyntaxError;
import androidx.credentials.exceptions.domerrors.TimeoutError;
import androidx.credentials.exceptions.domerrors.TransactionInactiveError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.domerrors.VersionError;
import androidx.credentials.exceptions.domerrors.WrongDocumentError;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialDomException extends CreatePublicKeyCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";
    private final DomError domError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialDomException(DomError domError, CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(String.valueOf(domError.getType())), charSequence);
        x.f(domError, "domError");
        this.domError = domError;
    }

    public static final CreateCredentialException createFrom(String str, String str2) {
        return Companion.createFrom(str, str2);
    }

    public final DomError getDomError() {
        return this.domError;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CreateCredentialException createFrom(String str, String str2) throws FrameworkClassParsingException {
            Object objGenerateException;
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            try {
                DomExceptionUtils.Companion companion = DomExceptionUtils.Companion;
                CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException(new UnknownError(), null, 2, 0 == true ? 1 : 0);
                if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", AbortError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ABORT_ERROR))) {
                    objGenerateException = companion.generateException(new AbortError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", ConstraintError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_CONSTRAINT_ERROR))) {
                    objGenerateException = companion.generateException(new ConstraintError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", DataCloneError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_CLONE_ERROR))) {
                    objGenerateException = companion.generateException(new DataCloneError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", DataError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_ERROR))) {
                    objGenerateException = companion.generateException(new DataError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", EncodingError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ENCODING_ERROR))) {
                    objGenerateException = companion.generateException(new EncodingError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", HierarchyRequestError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_HIERARCHY_REQUEST_ERROR))) {
                    objGenerateException = companion.generateException(new HierarchyRequestError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", InUseAttributeError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_IN_USE_ATTRIBUTE_ERROR))) {
                    objGenerateException = companion.generateException(new InUseAttributeError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", InvalidCharacterError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_CHARACTER_ERROR))) {
                    objGenerateException = companion.generateException(new InvalidCharacterError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", InvalidModificationError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_MODIFICATION_ERROR))) {
                    objGenerateException = companion.generateException(new InvalidModificationError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", InvalidNodeTypeError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_NODE_TYPE_ERROR))) {
                    objGenerateException = companion.generateException(new InvalidNodeTypeError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", InvalidStateError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_STATE_ERROR))) {
                    objGenerateException = companion.generateException(new InvalidStateError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", NamespaceError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NAMESPACE_ERROR))) {
                    objGenerateException = companion.generateException(new NamespaceError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", NetworkError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NETWORK_ERROR))) {
                    objGenerateException = companion.generateException(new NetworkError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", NoModificationAllowedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NO_MODIFICATION_ALLOWED_ERROR))) {
                    objGenerateException = companion.generateException(new NoModificationAllowedError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", NotAllowedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_ALLOWED_ERROR))) {
                    objGenerateException = companion.generateException(new NotAllowedError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", NotFoundError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_FOUND_ERROR))) {
                    objGenerateException = companion.generateException(new NotFoundError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", NotReadableError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_READABLE_ERROR))) {
                    objGenerateException = companion.generateException(new NotReadableError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", NotSupportedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_SUPPORTED_ERROR))) {
                    objGenerateException = companion.generateException(new NotSupportedError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", OperationError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPERATION_ERROR))) {
                    objGenerateException = companion.generateException(new OperationError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", OptOutError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPT_OUT_ERROR))) {
                    objGenerateException = companion.generateException(new OptOutError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", QuotaExceededError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_QUOTA_EXCEEDED_ERROR))) {
                    objGenerateException = companion.generateException(new QuotaExceededError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", ReadOnlyError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_READ_ONLY_ERROR))) {
                    objGenerateException = companion.generateException(new ReadOnlyError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", SecurityError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SECURITY_ERROR))) {
                    objGenerateException = companion.generateException(new SecurityError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", SyntaxError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SYNTAX_ERROR))) {
                    objGenerateException = companion.generateException(new SyntaxError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", TimeoutError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TIMEOUT_ERROR))) {
                    objGenerateException = companion.generateException(new TimeoutError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", TransactionInactiveError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TRANSACTION_INACTIVE_ERROR))) {
                    objGenerateException = companion.generateException(new TransactionInactiveError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", UnknownError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_UNKNOWN_ERROR))) {
                    objGenerateException = companion.generateException(new UnknownError(), str2, createPublicKeyCredentialDomException);
                } else if (x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", VersionError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_VERSION_ERROR))) {
                    objGenerateException = companion.generateException(new VersionError(), str2, createPublicKeyCredentialDomException);
                } else {
                    if (!x.n(str, a.a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", WrongDocumentError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_WRONG_DOCUMENT_ERROR))) {
                        throw new FrameworkClassParsingException();
                    }
                    objGenerateException = companion.generateException(new WrongDocumentError(), str2, createPublicKeyCredentialDomException);
                }
                return (CreateCredentialException) objGenerateException;
            } catch (FrameworkClassParsingException unused) {
                return new CreateCredentialCustomException(str, str2);
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreatePublicKeyCredentialDomException(DomError domError) {
        this(domError, null, 2, 0 == true ? 1 : 0);
        x.f(domError, "domError");
    }

    public /* synthetic */ CreatePublicKeyCredentialDomException(DomError domError, CharSequence charSequence, int i2, o oVar) {
        this(domError, (i2 & 2) != 0 ? null : charSequence);
    }
}
