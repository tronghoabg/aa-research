package androidx.camera.camera2.pipe;

import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Result3A {
    public static final Companion Companion = new Companion(null);
    private static final CompletableDeferred<FrameInfo> defaultFrameInfoDeferred;
    private final am<FrameInfo> frameInfo;
    private final FrameMetadata frameMetadata;
    private final int status;

    static {
        CompletableDeferred<FrameInfo> completableDeferredJ = bo.j();
        completableDeferredJ.s(null);
        defaultFrameInfoDeferred = completableDeferredJ;
    }

    public /* synthetic */ Result3A(int i2, FrameMetadata frameMetadata, CompletableDeferred<FrameInfo> completableDeferred, int i3, o oVar) {
        this(i2, (i3 & 2) != 0 ? null : frameMetadata, (i3 & 4) != 0 ? defaultFrameInfoDeferred : completableDeferred, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-5MtJfH4$default, reason: not valid java name */
    public static /* synthetic */ Result3A m895copy5MtJfH4$default(Result3A result3A, int i2, FrameMetadata frameMetadata, am amVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = result3A.status;
        }
        if ((i3 & 2) != 0) {
            frameMetadata = result3A.frameMetadata;
        }
        if ((i3 & 4) != 0) {
            amVar = result3A.frameInfo;
        }
        return result3A.m897copy5MtJfH4(i2, frameMetadata, amVar);
    }

    /* renamed from: component1-JvTi9ms, reason: not valid java name */
    public final int m896component1JvTi9ms() {
        return this.status;
    }

    public final FrameMetadata component2() {
        return this.frameMetadata;
    }

    public final am<FrameInfo> component3() {
        return this.frameInfo;
    }

    /* renamed from: copy-5MtJfH4, reason: not valid java name */
    public final Result3A m897copy5MtJfH4(int i2, FrameMetadata frameMetadata, am<? extends FrameInfo> amVar) {
        x.f(amVar, "frameInfo");
        return new Result3A(i2, frameMetadata, amVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result3A)) {
            return false;
        }
        Result3A result3A = (Result3A) obj;
        return Status.m902equalsimpl0(this.status, result3A.status) && x.n(this.frameMetadata, result3A.frameMetadata) && x.n(this.frameInfo, result3A.frameInfo);
    }

    public final am<FrameInfo> getFrameInfo() {
        return this.frameInfo;
    }

    public final FrameMetadata getFrameMetadata() {
        return this.frameMetadata;
    }

    /* renamed from: getStatus-JvTi9ms, reason: not valid java name */
    public final int m898getStatusJvTi9ms() {
        return this.status;
    }

    public int hashCode() {
        FrameMetadata frameMetadata = this.frameMetadata;
        return (((this.status * 31) + (frameMetadata == null ? 0 : frameMetadata.hashCode())) * 31) + this.frameInfo.hashCode();
    }

    public String toString() {
        return "Result3A(status=" + Status.m904toStringimpl(this.status) + ", frameMetadata=" + this.frameMetadata + ", frameInfo=" + this.frameInfo + ")";
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class Status {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int OK = 0;
        private static final int FRAME_LIMIT_REACHED = 1;
        private static final int TIME_LIMIT_REACHED = 2;
        private static final int SUBMIT_CANCELLED = 3;
        private static final int SUBMIT_FAILED = 4;

        private /* synthetic */ Status(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Status m899boximpl(int i2) {
            return new Status(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m901equalsimpl(int i2, Object obj) {
            return (obj instanceof Status) && i2 == ((Status) obj).m905unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m902equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m904toStringimpl(int i2) {
            return a.a(i2, "Status(value=", ")");
        }

        public boolean equals(Object obj) {
            return m901equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m904toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m905unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getFRAME_LIMIT_REACHED-JvTi9ms, reason: not valid java name */
            public final int m906getFRAME_LIMIT_REACHEDJvTi9ms() {
                return Status.FRAME_LIMIT_REACHED;
            }

            /* renamed from: getOK-JvTi9ms, reason: not valid java name */
            public final int m907getOKJvTi9ms() {
                return Status.OK;
            }

            /* renamed from: getSUBMIT_CANCELLED-JvTi9ms, reason: not valid java name */
            public final int m908getSUBMIT_CANCELLEDJvTi9ms() {
                return Status.SUBMIT_CANCELLED;
            }

            /* renamed from: getSUBMIT_FAILED-JvTi9ms, reason: not valid java name */
            public final int m909getSUBMIT_FAILEDJvTi9ms() {
                return Status.SUBMIT_FAILED;
            }

            /* renamed from: getTIME_LIMIT_REACHED-JvTi9ms, reason: not valid java name */
            public final int m910getTIME_LIMIT_REACHEDJvTi9ms() {
                return Status.TIME_LIMIT_REACHED;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m900constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m903hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ Result3A(int i2, FrameMetadata frameMetadata, am amVar, o oVar) {
        this(i2, frameMetadata, amVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Result3A(int i2, FrameMetadata frameMetadata, am<? extends FrameInfo> amVar) {
        x.f(amVar, "frameInfo");
        this.status = i2;
        this.frameMetadata = frameMetadata;
        this.frameInfo = amVar;
    }
}
