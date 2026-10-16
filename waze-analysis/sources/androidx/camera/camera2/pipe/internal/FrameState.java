package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.Frame;
import androidx.camera.camera2.pipe.FrameId;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.internal.OutputDistributor;
import androidx.camera.camera2.pipe.media.OutputImage;
import androidx.camera.camera2.pipe.media.SharedOutputImage;
import androidx.camera.camera2.pipe.media.TrackedOutputImage;
import h.a.i;
import h.c.e;
import h.d.a;
import h.e.b;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.a.c;
import kotlinx.a.d;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameState {
    public static final Companion Companion = new Companion(null);
    private static final c frameIds = b.g(0);
    private final Set<StreamId> concurrentImageStreams;
    private final long frameId;
    private final FrameInfoOutput frameInfoOutput;
    private final long frameNumber;
    private final long frameTimestamp;
    private final List<ImageOutput> imageOutputs;
    private final CopyOnWriteArrayList<ListenerState> listenerStates;
    private final kotlinx.a.b remainingStreamCount;
    private final RequestMetadata requestMetadata;
    private final d<State> state;

    /* compiled from: WazeSource */
    public abstract class FrameOutput<T> {
        private final kotlinx.a.b count = b.f(1);
        private final CompletableDeferred<OutputResult<T>> internalResult = bo.j();

        public abstract Object await(e<? super T> eVar);

        public final void decrement() {
            if (this.count.a() == 0) {
                this.internalResult.a(OutputResult.m1239boximpl(OutputStatus.m741boximpl(OutputStatus.Companion.m754getUNAVAILABLEU7r42EA())));
                release();
            }
        }

        protected final CompletableDeferred<OutputResult<T>> getInternalResult() {
            return this.internalResult;
        }

        public final am<OutputResult<T>> getResult() {
            return this.internalResult;
        }

        /* renamed from: getStatus-U7r42EA, reason: not valid java name */
        public final int m1219getStatusU7r42EA() {
            if (this.count.d() == 0) {
                return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
            }
            CompletableDeferred<OutputResult<T>> completableDeferred = this.internalResult;
            if (!completableDeferred.ca()) {
                return OutputStatus.Companion.m753getPENDINGU7r42EA();
            }
            if (completableDeferred.u()) {
                return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
            }
            Object objM1249unboximpl = ((OutputResult) completableDeferred.e()).m1249unboximpl();
            return OutputResult.m1243getAvailableimpl(objM1249unboximpl) ? OutputStatus.Companion.m748getAVAILABLEU7r42EA() : objM1249unboximpl == null ? OutputStatus.Companion.m754getUNAVAILABLEU7r42EA() : ((OutputStatus) objM1249unboximpl).m747unboximpl();
        }

        public final boolean increment() {
            kotlinx.a.b bVar;
            int iD;
            int i2;
            do {
                bVar = this.count;
                iD = bVar.d();
                i2 = iD <= 0 ? 0 : iD + 1;
            } while (!bVar.g(iD, i2));
            return i2 != 0;
        }

        public abstract T outputOrNull();

        protected abstract void release();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State STARTED = new State("STARTED", 0);
        public static final State FRAME_INFO_COMPLETE = new State("FRAME_INFO_COMPLETE", 1);
        public static final State STREAM_RESULTS_COMPLETE = new State("STREAM_RESULTS_COMPLETE", 2);
        public static final State COMPLETE = new State("COMPLETE", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STARTED, FRAME_INFO_COMPLETE, STREAM_RESULTS_COMPLETE, COMPLETE};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = h.d.b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.FRAME_INFO_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.STREAM_RESULTS_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FrameState(RequestMetadata requestMetadata, long j2, long j3, Set<CameraStream> set, Set<StreamId> set2) {
        Object next;
        x.f(requestMetadata, "requestMetadata");
        x.f(set, "imageStreams");
        this.requestMetadata = requestMetadata;
        this.frameNumber = j2;
        this.frameTimestamp = j3;
        this.concurrentImageStreams = set2;
        this.frameId = Companion.m1217nextFrameIdOMxQvVY();
        this.frameInfoOutput = new FrameInfoOutput();
        List listB = i.b();
        Iterator<StreamId> it = requestMetadata.getStreams().keySet().iterator();
        while (it.hasNext()) {
            int iM980unboximpl = it.next().m980unboximpl();
            Iterator<T> it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (StreamId.m977equalsimpl0(((CameraStream) next).m578getIdptHMqGs(), iM980unboximpl)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            CameraStream cameraStream = (CameraStream) next;
            if (cameraStream != null) {
                List<OutputStream> outputs = cameraStream.getOutputs();
                kotlinx.a.b bVarF = b.f(outputs.size());
                int size = outputs.size();
                for (int i2 = 0; i2 < size; i2++) {
                    listB.add(new ImageOutput(this, iM980unboximpl, outputs.get(i2).mo758getId4LaLFng(), bVarF, null));
                }
            }
        }
        List<ImageOutput> listA = i.a(listB);
        this.imageOutputs = listA;
        this.state = b.h(State.STARTED);
        List<ImageOutput> list = listA;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(StreamId.m974boximpl(((ImageOutput) it3.next()).m1221getStreamIdptHMqGs()));
        }
        this.remainingStreamCount = b.f(i.aa(arrayList).size());
        this.listenerStates = new CopyOnWriteArrayList<>();
    }

    private final void invokeOnFrameComplete() {
        Iterator<ListenerState> it = this.listenerStates.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().m1222invokeOnFrameCompletecfZT5Y(this.frameNumber, this.frameTimestamp);
        }
    }

    public final void addListener(Frame.Listener listener) {
        x.f(listener, "listener");
        ListenerState listenerState = new ListenerState(listener);
        this.listenerStates.add(listenerState);
        State state = (State) this.state.b();
        State state2 = State.STARTED;
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            listenerState.m1226invokeOnStartedcfZT5Y(this.frameNumber, this.frameTimestamp);
            return;
        }
        if (iOrdinal == 1) {
            listenerState.m1223invokeOnFrameInfoAvailablecfZT5Y(this.frameNumber, this.frameTimestamp);
        } else if (iOrdinal == 2) {
            listenerState.m1225invokeOnImagesAvailablecfZT5Y(this.frameNumber, this.frameTimestamp);
        } else {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            listenerState.m1222invokeOnFrameCompletecfZT5Y(this.frameNumber, this.frameTimestamp);
        }
    }

    public final Set<StreamId> getConcurrentImageStreams() {
        return this.concurrentImageStreams;
    }

    /* renamed from: getFrameId-OMxQvVY, reason: not valid java name */
    public final long m1212getFrameIdOMxQvVY() {
        return this.frameId;
    }

    public final FrameInfoOutput getFrameInfoOutput() {
        return this.frameInfoOutput;
    }

    /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
    public final long m1213getFrameNumberUgla2oM() {
        return this.frameNumber;
    }

    /* renamed from: getFrameTimestamp-LS1Wq50, reason: not valid java name */
    public final long m1214getFrameTimestampLS1Wq50() {
        return this.frameTimestamp;
    }

    public final List<ImageOutput> getImageOutputs() {
        return this.imageOutputs;
    }

    public final RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    public final void onFrameInfoComplete() {
        d<State> dVar;
        Object objB;
        State state;
        do {
            dVar = this.state;
            objB = dVar.b();
            State state2 = (State) objB;
            State state3 = State.STARTED;
            int iOrdinal = state2.ordinal();
            if (iOrdinal == 0) {
                state = State.FRAME_INFO_COMPLETE;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + this + "! State is " + state2 + " ");
                }
                state = State.COMPLETE;
            }
        } while (!dVar.e(objB, state));
        Iterator<ListenerState> it = this.listenerStates.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().m1223invokeOnFrameInfoAvailablecfZT5Y(this.frameNumber, this.frameTimestamp);
        }
        if (state == State.COMPLETE) {
            invokeOnFrameComplete();
        }
    }

    /* renamed from: onStreamResultComplete-aKI5c8E, reason: not valid java name */
    public final void m1215onStreamResultCompleteaKI5c8E(int i2) {
        Object objB;
        State state;
        if (this.remainingStreamCount.a() != 0) {
            return;
        }
        d<State> dVar = this.state;
        do {
            objB = dVar.b();
            State state2 = (State) objB;
            State state3 = State.STARTED;
            int iOrdinal = state2.ordinal();
            if (iOrdinal == 0) {
                state = State.STREAM_RESULTS_COMPLETE;
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Unexpected frame state for " + this + "! State is " + state2 + " ");
                }
                state = State.COMPLETE;
            }
        } while (!dVar.e(objB, state));
        Iterator<ListenerState> it = this.listenerStates.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().m1225invokeOnImagesAvailablecfZT5Y(this.frameNumber, this.frameTimestamp);
        }
        if (state == State.COMPLETE) {
            invokeOnFrameComplete();
        }
    }

    public String toString() {
        return "Frame-" + FrameId.m686toStringimpl(this.frameId) + "(" + this.frameNumber + "@" + this.frameTimestamp + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: nextFrameId-OMxQvVY, reason: not valid java name */
        public final long m1217nextFrameIdOMxQvVY() {
            return FrameState.frameIds.e();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class FrameInfoOutput extends FrameOutput<FrameInfo> implements OutputDistributor.OutputListener<FrameInfo> {
        public FrameInfoOutput() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object await(h.c.e<? super androidx.camera.camera2.pipe.FrameInfo> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.camera.camera2.pipe.internal.FrameState$FrameInfoOutput$await$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.camera.camera2.pipe.internal.FrameState$FrameInfoOutput$await$1 r0 = (androidx.camera.camera2.pipe.internal.FrameState$FrameInfoOutput$await$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.camera.camera2.pipe.internal.FrameState$FrameInfoOutput$await$1 r0 = new androidx.camera.camera2.pipe.internal.FrameState$FrameInfoOutput$await$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.b.c.b(r5)
                goto L3e
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                e.b.c.b(r5)
                kotlinx.coroutines.am r4 = r4.getResult()
                r0.label = r3
                java.lang.Object r5 = r4.c(r0)
                if (r5 == r1) goto L4d
            L3e:
                androidx.camera.camera2.pipe.internal.OutputResult r5 = (androidx.camera.camera2.pipe.internal.OutputResult) r5
                java.lang.Object r4 = r5.m1249unboximpl()
                boolean r5 = androidx.camera.camera2.pipe.internal.OutputResult.m1243getAvailableimpl(r4)
                if (r5 == 0) goto L4b
                return r4
            L4b:
                r4 = 0
                return r4
            L4d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameState.FrameInfoOutput.await(h.c.e):java.lang.Object");
        }

        @Override // androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener
        /* renamed from: onOutputComplete-3ejhThk, reason: not valid java name */
        public void mo1218onOutputComplete3ejhThk(long j2, long j3, long j4, long j5, Object obj) {
            getInternalResult().a(OutputResult.m1239boximpl(obj));
            FrameState.this.onFrameInfoComplete();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        public FrameInfo outputOrNull() {
            am<OutputResult<FrameInfo>> result = getResult();
            Object obj = null;
            if (result.ca() && !result.u()) {
                Object objM1249unboximpl = ((OutputResult) result.e()).m1249unboximpl();
                if (true == OutputResult.m1243getAvailableimpl(objM1249unboximpl)) {
                    obj = objM1249unboximpl;
                }
            }
            return (FrameInfo) obj;
        }

        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        protected void release() {
        }
    }

    /* compiled from: WazeSource */
    public final class ImageOutput extends FrameOutput<SharedOutputImage> implements OutputDistributor.OutputListener<OutputImage> {
        private final int outputId;
        private final kotlinx.a.b pendingExternalUseCount;
        private final kotlinx.a.b remainingOutputResults;
        private final int streamId;
        final /* synthetic */ FrameState this$0;
        private final d<TrackedOutputImage> trackedImage;

        private ImageOutput(FrameState frameState, int i2, int i3, kotlinx.a.b bVar) {
            x.f(bVar, "remainingOutputResults");
            this.this$0 = frameState;
            this.streamId = i2;
            this.outputId = i3;
            this.remainingOutputResults = bVar;
            this.pendingExternalUseCount = b.f(0);
            this.trackedImage = b.h(null);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.camera.camera2.pipe.media.SharedOutputImage acquireOrNullForExternalUse() {
            /*
                r3 = this;
                kotlinx.coroutines.CompletableDeferred r3 = r3.getInternalResult()
                kotlinx.coroutines.am r3 = (kotlinx.coroutines.am) r3
                boolean r0 = r3.ca()
                r1 = 0
                if (r0 == 0) goto L24
                boolean r0 = r3.u()
                if (r0 != 0) goto L24
                java.lang.Object r3 = r3.e()
                androidx.camera.camera2.pipe.internal.OutputResult r3 = (androidx.camera.camera2.pipe.internal.OutputResult) r3
                java.lang.Object r3 = r3.m1249unboximpl()
                r0 = 1
                boolean r2 = androidx.camera.camera2.pipe.internal.OutputResult.m1243getAvailableimpl(r3)
                if (r0 == r2) goto L25
            L24:
                r3 = r1
            L25:
                androidx.camera.camera2.pipe.media.SharedOutputImage r3 = (androidx.camera.camera2.pipe.media.SharedOutputImage) r3
                if (r3 != 0) goto L2a
                return r1
            L2a:
                androidx.camera.camera2.pipe.media.SharedOutputImage r3 = androidx.camera.camera2.pipe.internal.FrameStateKt.acquireOrNullForExternalUse(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameState.ImageOutput.acquireOrNullForExternalUse():androidx.camera.camera2.pipe.media.SharedOutputImage");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object await(h.c.e<? super androidx.camera.camera2.pipe.media.SharedOutputImage> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$await$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$await$1 r0 = (androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$await$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$await$1 r0 = new androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$await$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.b.c.b(r5)
                goto L3e
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                e.b.c.b(r5)
                kotlinx.coroutines.am r4 = r4.getResult()
                r0.label = r3
                java.lang.Object r5 = r4.c(r0)
                if (r5 == r1) goto L56
            L3e:
                androidx.camera.camera2.pipe.internal.OutputResult r5 = (androidx.camera.camera2.pipe.internal.OutputResult) r5
                java.lang.Object r4 = r5.m1249unboximpl()
                boolean r5 = androidx.camera.camera2.pipe.internal.OutputResult.m1243getAvailableimpl(r4)
                r0 = 0
                if (r3 == r5) goto L4c
                r4 = r0
            L4c:
                androidx.camera.camera2.pipe.media.SharedOutputImage r4 = (androidx.camera.camera2.pipe.media.SharedOutputImage) r4
                if (r4 == 0) goto L55
                androidx.camera.camera2.pipe.media.SharedOutputImage r4 = androidx.camera.camera2.pipe.media.SharedOutputImage.CC.acquireOrNull$default(r4, r0, r3, r0)
                return r4
            L55:
                return r0
            L56:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameState.ImageOutput.await(h.c.e):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object awaitForExternalUse(h.c.e<? super androidx.camera.camera2.pipe.media.SharedOutputImage> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$awaitForExternalUse$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$awaitForExternalUse$1 r0 = (androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$awaitForExternalUse$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$awaitForExternalUse$1 r0 = new androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$awaitForExternalUse$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.b.c.b(r5)
                goto L3e
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                e.b.c.b(r5)
                kotlinx.coroutines.CompletableDeferred r4 = r4.getInternalResult()
                r0.label = r3
                java.lang.Object r5 = r4.c(r0)
                if (r5 == r1) goto L56
            L3e:
                androidx.camera.camera2.pipe.internal.OutputResult r5 = (androidx.camera.camera2.pipe.internal.OutputResult) r5
                java.lang.Object r4 = r5.m1249unboximpl()
                boolean r5 = androidx.camera.camera2.pipe.internal.OutputResult.m1243getAvailableimpl(r4)
                r0 = 0
                if (r3 == r5) goto L4c
                r4 = r0
            L4c:
                androidx.camera.camera2.pipe.media.SharedOutputImage r4 = (androidx.camera.camera2.pipe.media.SharedOutputImage) r4
                if (r4 != 0) goto L51
                return r0
            L51:
                androidx.camera.camera2.pipe.media.SharedOutputImage r4 = androidx.camera.camera2.pipe.internal.FrameStateKt.acquireOrNullForExternalUse(r4)
                return r4
            L56:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameState.ImageOutput.awaitForExternalUse(h.c.e):java.lang.Object");
        }

        public final void decrementExternalUseCount() {
            kotlinx.a.b bVar;
            int iD;
            int i2;
            TrackedOutputImage trackedOutputImage;
            do {
                bVar = this.pendingExternalUseCount;
                iD = bVar.d();
                i2 = iD != Integer.MIN_VALUE ? iD - 1 : Integer.MIN_VALUE;
            } while (!bVar.g(iD, i2));
            if (i2 != Integer.MIN_VALUE || (trackedOutputImage = (TrackedOutputImage) this.trackedImage.b()) == null) {
                return;
            }
            trackedOutputImage.decrementExternalUse();
        }

        /* renamed from: getOutputId-4LaLFng, reason: not valid java name */
        public final int m1220getOutputId4LaLFng() {
            return this.outputId;
        }

        /* renamed from: getStreamId-ptHMqGs, reason: not valid java name */
        public final int m1221getStreamIdptHMqGs() {
            return this.streamId;
        }

        public final void incrementExternalUseCount() {
            kotlinx.a.b bVar;
            int iD;
            int i2;
            TrackedOutputImage trackedOutputImage;
            do {
                bVar = this.pendingExternalUseCount;
                iD = bVar.d();
                i2 = iD != Integer.MIN_VALUE ? iD + 1 : Integer.MIN_VALUE;
            } while (!bVar.g(iD, i2));
            if (i2 != Integer.MIN_VALUE || (trackedOutputImage = (TrackedOutputImage) this.trackedImage.b()) == null) {
                return;
            }
            trackedOutputImage.incrementExternalUse();
        }

        @Override // androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener
        /* renamed from: onOutputComplete-3ejhThk */
        public void mo1218onOutputComplete3ejhThk(long j2, long j3, long j4, long j5, Object obj) throws Exception {
            OutputImage outputImage = (OutputImage) (true != OutputResult.m1243getAvailableimpl(obj) ? null : obj);
            if (outputImage != null) {
                SharedOutputImage sharedOutputImageFrom = SharedOutputImage.Companion.from(outputImage);
                if (getInternalResult().a(OutputResult.m1239boximpl(sharedOutputImageFrom))) {
                    TrackedOutputImage trackedOutputImage = (TrackedOutputImage) sharedOutputImageFrom.unwrapAs(TrackedOutputImage.class);
                    if (trackedOutputImage != null) {
                        this.trackedImage.d(trackedOutputImage);
                        int iJ = this.pendingExternalUseCount.j();
                        if (iJ != Integer.MIN_VALUE) {
                            trackedOutputImage.addExternalUse(iJ);
                        }
                    }
                } else {
                    FrameState$ImageOutput$$ExternalSyntheticAutoCloseableDispatcher0.m(sharedOutputImageFrom);
                }
            } else {
                getInternalResult().a(OutputResult.m1239boximpl(OutputStatus.m741boximpl(OutputResult.m1243getAvailableimpl(obj) ? OutputStatus.Companion.m748getAVAILABLEU7r42EA() : obj == null ? OutputStatus.Companion.m754getUNAVAILABLEU7r42EA() : ((OutputStatus) obj).m747unboximpl())));
            }
            if (this.remainingOutputResults.a() == 0) {
                Iterator it = this.this$0.listenerStates.iterator();
                x.e(it, "iterator(...)");
                while (it.hasNext()) {
                    ((ListenerState) it.next()).m1224invokeOnImageAvailableaKI5c8E(this.streamId);
                }
                this.this$0.m1215onStreamResultCompleteaKI5c8E(this.streamId);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.camera.camera2.pipe.media.SharedOutputImage outputOrNull() {
            /*
                r3 = this;
                kotlinx.coroutines.am r3 = r3.getResult()
                boolean r0 = r3.ca()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L22
                boolean r0 = r3.u()
                if (r0 != 0) goto L22
                java.lang.Object r3 = r3.e()
                androidx.camera.camera2.pipe.internal.OutputResult r3 = (androidx.camera.camera2.pipe.internal.OutputResult) r3
                java.lang.Object r3 = r3.m1249unboximpl()
                boolean r0 = androidx.camera.camera2.pipe.internal.OutputResult.m1243getAvailableimpl(r3)
                if (r1 == r0) goto L23
            L22:
                r3 = r2
            L23:
                androidx.camera.camera2.pipe.media.SharedOutputImage r3 = (androidx.camera.camera2.pipe.media.SharedOutputImage) r3
                if (r3 == 0) goto L2c
                androidx.camera.camera2.pipe.media.SharedOutputImage r3 = androidx.camera.camera2.pipe.media.SharedOutputImage.CC.acquireOrNull$default(r3, r2, r1, r2)
                return r3
            L2c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameState.ImageOutput.outputOrNull():androidx.camera.camera2.pipe.media.SharedOutputImage");
        }

        @Override // androidx.camera.camera2.pipe.internal.FrameState.FrameOutput
        protected void release() throws Exception {
            CompletableDeferred<OutputResult<SharedOutputImage>> internalResult = getInternalResult();
            Object obj = null;
            if (internalResult.ca() && !internalResult.u()) {
                Object objM1249unboximpl = ((OutputResult) internalResult.e()).m1249unboximpl();
                if (true == OutputResult.m1243getAvailableimpl(objM1249unboximpl)) {
                    obj = objM1249unboximpl;
                }
            }
            SharedOutputImage sharedOutputImage = (SharedOutputImage) obj;
            if (sharedOutputImage != null) {
                FrameState$ImageOutput$$ExternalSyntheticAutoCloseableDispatcher0.m(sharedOutputImage);
            }
        }

        public /* synthetic */ ImageOutput(FrameState frameState, int i2, int i3, kotlinx.a.b bVar, o oVar) {
            this(frameState, i2, i3, bVar);
        }
    }

    public /* synthetic */ FrameState(RequestMetadata requestMetadata, long j2, long j3, Set set, Set set2, o oVar) {
        this(requestMetadata, j2, j3, set, set2);
    }
}
