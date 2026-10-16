package androidx.window.core;

import h.a.c;
import h.g.a.l;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {
    private final WindowStrictModeException exception;
    private final Logger logger;
    private final String message;
    private final String tag;
    private final T value;
    private final VerificationMode verificationMode;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMode.values().length];
            try {
                iArr[VerificationMode.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMode.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMode.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(T t, String str, String str2, Logger logger, VerificationMode verificationMode) {
        x.f(t, "value");
        x.f(str, "tag");
        x.f(str2, "message");
        x.f(logger, "logger");
        x.f(verificationMode, "verificationMode");
        this.value = t;
        this.tag = str;
        this.message = str2;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(t, str2));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        x.e(stackTrace, "getStackTrace(...)");
        windowStrictModeException.setStackTrace((StackTraceElement[]) c.Q(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.exception = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() throws WindowStrictModeException {
        VerificationMode verificationMode = VerificationMode.STRICT;
        int iOrdinal = this.verificationMode.ordinal();
        if (iOrdinal == 0) {
            throw this.exception;
        }
        if (iOrdinal == 1) {
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        if (iOrdinal == 2) {
            return null;
        }
        throw new i();
    }

    public final WindowStrictModeException getException() {
        return this.exception;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final T getValue() {
        return this.value;
    }

    public final VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String str, l<? super T, Boolean> lVar) {
        x.f(str, "message");
        x.f(lVar, "condition");
        return this;
    }
}
