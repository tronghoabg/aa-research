package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.OutputStatus;
import h.g.a;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class OutputResult<T> {
    public static final Companion Companion = new Companion(null);
    private final Object result;

    private /* synthetic */ OutputResult(Object obj) {
        this.result = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OutputResult m1239boximpl(Object obj) {
        return new OutputResult(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1241equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof OutputResult) && x.n(obj, ((OutputResult) obj2).m1249unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1242equalsimpl0(Object obj, Object obj2) {
        return x.n(obj, obj2);
    }

    /* renamed from: getAvailable-impl, reason: not valid java name */
    public static final boolean m1243getAvailableimpl(Object obj) {
        return (m1244getFailureimpl(obj) || obj == null) ? false : true;
    }

    /* renamed from: getFailure-impl, reason: not valid java name */
    public static final boolean m1244getFailureimpl(Object obj) {
        return obj instanceof OutputStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOutput-impl, reason: not valid java name */
    public static final T m1245getOutputimpl(Object obj) {
        if (m1243getAvailableimpl(obj)) {
            return obj;
        }
        return null;
    }

    /* renamed from: getStatus-U7r42EA, reason: not valid java name */
    public static final int m1246getStatusU7r42EA(Object obj) {
        return m1243getAvailableimpl(obj) ? OutputStatus.Companion.m748getAVAILABLEU7r42EA() : obj == null ? OutputStatus.Companion.m754getUNAVAILABLEU7r42EA() : ((OutputStatus) obj).m747unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1247hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1248toStringimpl(Object obj) {
        return "OutputResult(result=" + obj + ")";
    }

    public boolean equals(Object obj) {
        return m1241equalsimpl(this.result, obj);
    }

    public int hashCode() {
        return m1247hashCodeimpl(this.result);
    }

    public String toString() {
        return m1248toStringimpl(this.result);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m1249unboximpl() {
        return this.result;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: completeWithFailure-zfbXvnA, reason: not valid java name */
        public final <T> boolean m1250completeWithFailurezfbXvnA(CompletableDeferred<OutputResult<T>> completableDeferred, int i2) {
            x.f(completableDeferred, "$this$completeWithFailure");
            return completableDeferred.a(OutputResult.m1239boximpl(OutputStatus.m741boximpl(i2)));
        }

        public final <T> boolean completeWithOutput(CompletableDeferred<OutputResult<T>> completableDeferred, T t) {
            x.f(completableDeferred, "<this>");
            return completableDeferred.a(OutputResult.m1239boximpl(t));
        }

        /* renamed from: failure-SpuARzU, reason: not valid java name */
        public final <T> Object m1251failureSpuARzU(int i2) {
            return OutputStatus.m741boximpl(i2);
        }

        public final <T> T outputOrNull(am<? extends OutputResult<? extends T>> amVar) {
            x.f(amVar, "<this>");
            if (amVar.ca() && !amVar.u()) {
                T t = (T) ((OutputResult) amVar.e()).m1249unboximpl();
                if (OutputResult.m1243getAvailableimpl(t)) {
                    return t;
                }
            }
            return null;
        }

        /* renamed from: outputStatus-NkQ9T_M, reason: not valid java name */
        public final <T> int m1253outputStatusNkQ9T_M(am<? extends OutputResult<? extends T>> amVar) {
            x.f(amVar, "$this$outputStatus");
            if (!amVar.ca()) {
                return OutputStatus.Companion.m753getPENDINGU7r42EA();
            }
            if (amVar.u()) {
                return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
            }
            Object objM1249unboximpl = ((OutputResult) amVar.e()).m1249unboximpl();
            return OutputResult.m1243getAvailableimpl(objM1249unboximpl) ? OutputStatus.Companion.m748getAVAILABLEU7r42EA() : objM1249unboximpl == null ? OutputStatus.Companion.m754getUNAVAILABLEU7r42EA() : ((OutputStatus) objM1249unboximpl).m747unboximpl();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: from-EASlEvA, reason: not valid java name */
        public final <T> Object m1252fromEASlEvA(T t) {
            return t;
        }
    }

    public static /* synthetic */ void getOutput$annotations() {
    }

    /* renamed from: access$constructor-impl, reason: not valid java name */
    public static final /* synthetic */ Object m1238access$constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> Object m1240constructorimpl(Object obj) {
        return obj;
    }
}
