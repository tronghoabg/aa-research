package androidx.window.core;

import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final VerificationMode verificationMode;

    public ValidSpecification(T t, String str, VerificationMode verificationMode, Logger logger) {
        x.f(t, "value");
        x.f(str, "tag");
        x.f(verificationMode, "verificationMode");
        x.f(logger, "logger");
        this.value = t;
        this.tag = str;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        return this.value;
    }

    public final Logger getLogger() {
        return this.logger;
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
        return lVar.invoke(this.value).booleanValue() ? this : new FailedSpecification(this.value, this.tag, str, this.logger, this.verificationMode);
    }
}
