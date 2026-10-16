package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.CameraTimestamp;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.media.Finalizer;
import h.a.i;
import h.e.b;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OutputDistributor<T> implements AutoCloseable {
    private final Map<Long, OutputResult<T>> availableOutputs;
    private long cameraOutputSequenceNumbers;
    private boolean closed;
    private long lastFailedCameraOutputNumber;
    private long lastFailedFrameNumber;
    private final Object lock;
    private final int maximumCachedOutputs;
    private long newestCameraOutputNumber;
    private long newestFrameNumber;
    private final Finalizer<T> outputFinalizer;
    private final OutputMatcher outputMatcher;
    private final List<StartedOutput<T>> startedOutputs;

    /* compiled from: WazeSource */
    public interface OutputListener<T> {
        /* renamed from: onOutputComplete-3ejhThk */
        void mo1218onOutputComplete3ejhThk(long j2, long j3, long j4, long j5, Object obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OutputDistributor(int i2, Finalizer<? super T> finalizer, OutputMatcher outputMatcher) {
        x.f(finalizer, "outputFinalizer");
        x.f(outputMatcher, "outputMatcher");
        this.maximumCachedOutputs = i2;
        this.outputFinalizer = finalizer;
        this.outputMatcher = outputMatcher;
        this.lock = new Object();
        this.cameraOutputSequenceNumbers = 1L;
        this.newestCameraOutputNumber = Long.MIN_VALUE;
        this.newestFrameNumber = Long.MIN_VALUE;
        this.lastFailedFrameNumber = Long.MIN_VALUE;
        this.lastFailedCameraOutputNumber = Long.MIN_VALUE;
        this.startedOutputs = new ArrayList();
        this.availableOutputs = new LinkedHashMap();
    }

    private final List<StartedOutput<T>> removeOutputsOlderThan(boolean z, long j2, long j3) {
        List<StartedOutput<T>> list = this.startedOutputs;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            StartedOutput startedOutput = (StartedOutput) t;
            if (startedOutput.isOutOfOrder() == z && startedOutput.getCameraOutputSequence() < j2 && startedOutput.getCameraOutputNumber() < j3) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        this.startedOutputs.removeAll(arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            List listAq = i.aq(this.availableOutputs.values());
            this.availableOutputs.clear();
            List listAq2 = i.aq(this.startedOutputs);
            this.startedOutputs.clear();
            Iterator it = listAq.iterator();
            while (it.hasNext()) {
                Object objM1249unboximpl = ((OutputResult) it.next()).m1249unboximpl();
                Finalizer<T> finalizer = this.outputFinalizer;
                if (true != OutputResult.m1243getAvailableimpl(objM1249unboximpl)) {
                    objM1249unboximpl = null;
                }
                finalizer.finalize(objM1249unboximpl);
            }
            Iterator it2 = listAq2.iterator();
            while (it2.hasNext()) {
                ((StartedOutput) it2.next()).m1232completeWithFailuretXNfJfc(OutputStatus.Companion.m749getERROR_OUTPUT_ABORTEDU7r42EA());
            }
        }
    }

    /* renamed from: onOutputFailure-Vw7M1qk, reason: not valid java name */
    public final void m1227onOutputFailureVw7M1qk(long j2) {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.lastFailedFrameNumber = j2;
            Iterator<T> it = this.startedOutputs.iterator();
            StartedOutput startedOutput = null;
            boolean z = false;
            StartedOutput startedOutput2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    T next = it.next();
                    if (FrameNumber.m693equalsimpl0(((StartedOutput) next).m1236getCameraFrameNumberUgla2oM(), j2)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        startedOutput2 = next;
                    }
                }
            }
            startedOutput2 = null;
            StartedOutput startedOutput3 = startedOutput2;
            if (startedOutput3 != null) {
                this.lastFailedCameraOutputNumber = startedOutput3.getCameraOutputNumber();
                this.startedOutputs.remove(startedOutput3);
                startedOutput = startedOutput3;
            }
            if (startedOutput != null) {
                startedOutput.m1232completeWithFailuretXNfJfc(OutputStatus.Companion.m751getERROR_OUTPUT_FAILEDU7r42EA());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onOutputResult-DvZWqE8, reason: not valid java name */
    public final void m1228onOutputResultDvZWqE8(long j2, Object obj) {
        OutputResult<T> outputResultM1239boximpl;
        List<StartedOutput<T>> listRemoveOutputsOlderThan;
        T next;
        synchronized (this.lock) {
            if (this.closed || this.outputMatcher.fuzzyEqual(this.lastFailedCameraOutputNumber, j2)) {
                outputResultM1239boximpl = OutputResult.m1239boximpl(obj);
            } else {
                Iterator<T> it = this.startedOutputs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    } else {
                        next = it.next();
                        if (this.outputMatcher.fuzzyEqual(((StartedOutput) next).getCameraOutputNumber(), j2)) {
                            break;
                        }
                    }
                }
                StartedOutput<T> startedOutput = next;
                if (startedOutput != null) {
                    listRemoveOutputsOlderThan = removeOutputsOlderThan(startedOutput);
                    startedOutput.m1231completeWithDvZWqE8(j2, obj);
                    this.startedOutputs.remove(startedOutput);
                    outputResultM1239boximpl = null;
                } else {
                    this.availableOutputs.put(Long.valueOf(j2), OutputResult.m1239boximpl(obj));
                    if (this.availableOutputs.size() > this.maximumCachedOutputs) {
                        outputResultM1239boximpl = this.availableOutputs.remove(Long.valueOf(((Number) i.O(this.availableOutputs.keySet())).longValue()));
                    } else {
                        outputResultM1239boximpl = null;
                        listRemoveOutputsOlderThan = null;
                    }
                }
            }
            listRemoveOutputsOlderThan = null;
        }
        OutputResult<T> outputResult = outputResultM1239boximpl;
        if (outputResult != null) {
            Object objM1249unboximpl = outputResult.m1249unboximpl();
            Object obj2 = true == OutputResult.m1243getAvailableimpl(objM1249unboximpl) ? objM1249unboximpl : null;
            if (obj2 != null) {
                this.outputFinalizer.finalize(obj2);
            }
        }
        if (listRemoveOutputsOlderThan != null) {
            Iterator<T> it2 = listRemoveOutputsOlderThan.iterator();
            while (it2.hasNext()) {
                ((StartedOutput) it2.next()).m1232completeWithFailuretXNfJfc(OutputStatus.Companion.m752getERROR_OUTPUT_MISSINGU7r42EA());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* renamed from: onOutputStarted-qGubWw0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1229onOutputStartedqGubWw0(long r20, long r22, long r24, androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener<T> r26) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.OutputDistributor.m1229onOutputStartedqGubWw0(long, long, long, androidx.camera.camera2.pipe.internal.OutputDistributor$OutputListener):void");
    }

    /* compiled from: WazeSource */
    final class StartedOutput<T> {
        private final long cameraFrameNumber;
        private final long cameraOutputNumber;
        private final long cameraOutputSequence;
        private final long cameraTimestamp;
        private final a complete;
        private final boolean isOutOfOrder;
        private final OutputListener<T> outputListener;

        private StartedOutput(boolean z, long j2, long j3, long j4, long j5, OutputListener<T> outputListener) {
            x.f(outputListener, "outputListener");
            this.isOutOfOrder = z;
            this.cameraFrameNumber = j2;
            this.cameraTimestamp = j3;
            this.cameraOutputSequence = j4;
            this.cameraOutputNumber = j5;
            this.outputListener = outputListener;
            this.complete = b.e(false);
        }

        private final OutputListener<T> component6() {
            return this.outputListener;
        }

        /* renamed from: copy-HscHeSQ$default, reason: not valid java name */
        public static /* synthetic */ StartedOutput m1230copyHscHeSQ$default(StartedOutput startedOutput, boolean z, long j2, long j3, long j4, long j5, OutputListener outputListener, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = startedOutput.isOutOfOrder;
            }
            if ((i2 & 2) != 0) {
                j2 = startedOutput.cameraFrameNumber;
            }
            if ((i2 & 4) != 0) {
                j3 = startedOutput.cameraTimestamp;
            }
            if ((i2 & 8) != 0) {
                j4 = startedOutput.cameraOutputSequence;
            }
            if ((i2 & 16) != 0) {
                j5 = startedOutput.cameraOutputNumber;
            }
            if ((i2 & 32) != 0) {
                outputListener = startedOutput.outputListener;
            }
            OutputListener outputListener2 = outputListener;
            long j6 = j5;
            long j7 = j4;
            return startedOutput.m1235copyHscHeSQ(z, j2, j3, j7, j6, outputListener2);
        }

        /* renamed from: completeWith-DvZWqE8, reason: not valid java name */
        public final void m1231completeWithDvZWqE8(long j2, Object obj) {
            if (this.complete.b(false, true)) {
                this.outputListener.mo1218onOutputComplete3ejhThk(this.cameraFrameNumber, this.cameraTimestamp, this.cameraOutputSequence, j2, obj);
                return;
            }
            throw new IllegalStateException("Output " + this.cameraOutputSequence + " at " + FrameNumber.m695toStringimpl(this.cameraFrameNumber) + " for " + j2 + " was completed multiple times!");
        }

        /* renamed from: completeWithFailure-tXNfJfc, reason: not valid java name */
        public final void m1232completeWithFailuretXNfJfc(int i2) {
            m1231completeWithDvZWqE8(-1L, OutputStatus.m741boximpl(i2));
        }

        public final boolean component1() {
            return this.isOutOfOrder;
        }

        /* renamed from: component2-Ugla2oM, reason: not valid java name */
        public final long m1233component2Ugla2oM() {
            return this.cameraFrameNumber;
        }

        /* renamed from: component3-LS1Wq50, reason: not valid java name */
        public final long m1234component3LS1Wq50() {
            return this.cameraTimestamp;
        }

        public final long component4() {
            return this.cameraOutputSequence;
        }

        public final long component5() {
            return this.cameraOutputNumber;
        }

        /* renamed from: copy-HscHeSQ, reason: not valid java name */
        public final StartedOutput<T> m1235copyHscHeSQ(boolean z, long j2, long j3, long j4, long j5, OutputListener<T> outputListener) {
            x.f(outputListener, "outputListener");
            return new StartedOutput<>(z, j2, j3, j4, j5, outputListener, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartedOutput)) {
                return false;
            }
            StartedOutput startedOutput = (StartedOutput) obj;
            return this.isOutOfOrder == startedOutput.isOutOfOrder && FrameNumber.m693equalsimpl0(this.cameraFrameNumber, startedOutput.cameraFrameNumber) && CameraTimestamp.m591equalsimpl0(this.cameraTimestamp, startedOutput.cameraTimestamp) && this.cameraOutputSequence == startedOutput.cameraOutputSequence && this.cameraOutputNumber == startedOutput.cameraOutputNumber && x.n(this.outputListener, startedOutput.outputListener);
        }

        /* renamed from: getCameraFrameNumber-Ugla2oM, reason: not valid java name */
        public final long m1236getCameraFrameNumberUgla2oM() {
            return this.cameraFrameNumber;
        }

        public final long getCameraOutputNumber() {
            return this.cameraOutputNumber;
        }

        public final long getCameraOutputSequence() {
            return this.cameraOutputSequence;
        }

        /* renamed from: getCameraTimestamp-LS1Wq50, reason: not valid java name */
        public final long m1237getCameraTimestampLS1Wq50() {
            return this.cameraTimestamp;
        }

        public int hashCode() {
            int iM = OutputDistributor$StartedOutput$$ExternalSyntheticBackport0.m(this.isOutOfOrder);
            OutputListener<T> outputListener = this.outputListener;
            long j2 = this.cameraOutputNumber;
            long j3 = this.cameraOutputSequence;
            return (((((((((iM * 31) + FrameNumber.m694hashCodeimpl(this.cameraFrameNumber)) * 31) + CameraTimestamp.m592hashCodeimpl(this.cameraTimestamp)) * 31) + OutputDistributor$StartedOutput$$ExternalSyntheticBackport1.m(j3)) * 31) + OutputDistributor$StartedOutput$$ExternalSyntheticBackport1.m(j2)) * 31) + outputListener.hashCode();
        }

        public final boolean isOutOfOrder() {
            return this.isOutOfOrder;
        }

        public String toString() {
            long j2 = this.cameraTimestamp;
            return "StartedOutput(isOutOfOrder=" + this.isOutOfOrder + ", cameraFrameNumber=" + FrameNumber.m695toStringimpl(this.cameraFrameNumber) + ", cameraTimestamp=" + CameraTimestamp.m593toStringimpl(j2) + ", cameraOutputSequence=" + this.cameraOutputSequence + ", cameraOutputNumber=" + this.cameraOutputNumber + ", outputListener=" + this.outputListener + ")";
        }

        public /* synthetic */ StartedOutput(boolean z, long j2, long j3, long j4, long j5, OutputListener outputListener, o oVar) {
            this(z, j2, j3, j4, j5, outputListener);
        }
    }

    public /* synthetic */ OutputDistributor(int i2, Finalizer finalizer, OutputMatcher outputMatcher, int i3, o oVar) {
        this(1 == (i3 & 1) ? 3 : i2, finalizer, outputMatcher);
    }

    private final List<StartedOutput<T>> removeOutputsOlderThan(StartedOutput<T> startedOutput) {
        return removeOutputsOlderThan(startedOutput.isOutOfOrder(), startedOutput.getCameraOutputSequence(), startedOutput.getCameraOutputNumber());
    }
}
