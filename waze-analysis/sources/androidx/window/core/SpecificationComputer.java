package androidx.window.core;

import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    public abstract T compute();

    protected final String createMessage(Object obj, String str) {
        x.f(obj, "value");
        x.f(str, "message");
        return str + " value: " + obj;
    }

    public abstract SpecificationComputer<T> require(String str, l<? super T, Boolean> lVar);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i2, Object obj2) {
            if ((i2 & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i2 & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t, String str, VerificationMode verificationMode, Logger logger) {
            x.f(t, "<this>");
            x.f(str, "tag");
            x.f(verificationMode, "verificationMode");
            x.f(logger, "logger");
            return new ValidSpecification(t, str, verificationMode, logger);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
