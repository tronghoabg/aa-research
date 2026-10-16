package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.media.ImageSource;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface StreamGraph {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.StreamGraph$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$get-aKI5c8E, reason: not valid java name */
        public static CameraStream m966$default$getaKI5c8E(StreamGraph streamGraph, int i2) {
            Object next;
            Iterator<T> it = streamGraph.getStreams().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StreamId.m977equalsimpl0(((CameraStream) next).m578getIdptHMqGs(), i2)) {
                    break;
                }
            }
            return (CameraStream) next;
        }

        /* renamed from: $default$get-iYJqvbA, reason: not valid java name */
        public static OutputStream m967$default$getiYJqvbA(StreamGraph streamGraph, int i2) {
            Object next;
            Iterator<T> it = streamGraph.getOutputs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (OutputId.m737equalsimpl0(((OutputStream) next).mo758getId4LaLFng(), i2)) {
                    break;
                }
            }
            return (OutputStream) next;
        }

        /* renamed from: getOutputLatency-IL232MI$default, reason: not valid java name */
        public static /* synthetic */ OutputLatency m970getOutputLatencyIL232MI$default(StreamGraph streamGraph, int i2, OutputId outputId, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOutputLatency-IL232MI");
            }
            if ((i3 & 2) != 0) {
                outputId = null;
            }
            return streamGraph.mo965getOutputLatencyIL232MI(i2, outputId);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: get-aKI5c8E, reason: not valid java name */
        public static CameraStream m971getaKI5c8E(StreamGraph streamGraph, int i2) {
            return CC.m966$default$getaKI5c8E(streamGraph, i2);
        }

        @Deprecated
        /* renamed from: get-iYJqvbA, reason: not valid java name */
        public static OutputStream m972getiYJqvbA(StreamGraph streamGraph, int i2) {
            return CC.m967$default$getiYJqvbA(streamGraph, i2);
        }
    }

    /* compiled from: WazeSource */
    public final class OutputLatency {
        private final long estimatedCaptureLatencyNs;
        private final long estimatedProcessingLatencyNs;

        public OutputLatency(long j2, long j3) {
            this.estimatedCaptureLatencyNs = j2;
            this.estimatedProcessingLatencyNs = j3;
        }

        public static /* synthetic */ OutputLatency copy$default(OutputLatency outputLatency, long j2, long j3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = outputLatency.estimatedCaptureLatencyNs;
            }
            if ((i2 & 2) != 0) {
                j3 = outputLatency.estimatedProcessingLatencyNs;
            }
            return outputLatency.copy(j2, j3);
        }

        public final long component1() {
            return this.estimatedCaptureLatencyNs;
        }

        public final long component2() {
            return this.estimatedProcessingLatencyNs;
        }

        public final OutputLatency copy(long j2, long j3) {
            return new OutputLatency(j2, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutputLatency)) {
                return false;
            }
            OutputLatency outputLatency = (OutputLatency) obj;
            return this.estimatedCaptureLatencyNs == outputLatency.estimatedCaptureLatencyNs && this.estimatedProcessingLatencyNs == outputLatency.estimatedProcessingLatencyNs;
        }

        public final long getEstimatedCaptureLatencyNs() {
            return this.estimatedCaptureLatencyNs;
        }

        public final long getEstimatedLatencyNs() {
            return this.estimatedCaptureLatencyNs + this.estimatedProcessingLatencyNs;
        }

        public final long getEstimatedProcessingLatencyNs() {
            return this.estimatedProcessingLatencyNs;
        }

        public int hashCode() {
            return (StreamGraph$OutputLatency$$ExternalSyntheticBackport0.m(this.estimatedCaptureLatencyNs) * 31) + StreamGraph$OutputLatency$$ExternalSyntheticBackport0.m(this.estimatedProcessingLatencyNs);
        }

        public String toString() {
            return "OutputLatency(estimatedCaptureLatencyNs=" + this.estimatedCaptureLatencyNs + ", estimatedProcessingLatencyNs=" + this.estimatedProcessingLatencyNs + ")";
        }
    }

    CameraStream get(CameraStream.Config config);

    /* renamed from: get-aKI5c8E, reason: not valid java name */
    CameraStream mo962getaKI5c8E(int i2);

    /* renamed from: get-iYJqvbA, reason: not valid java name */
    OutputStream mo963getiYJqvbA(int i2);

    /* renamed from: getImageSource-aKI5c8E, reason: not valid java name */
    ImageSource mo964getImageSourceaKI5c8E(int i2);

    List<InputStream> getInputs();

    /* renamed from: getOutputLatency-IL232MI, reason: not valid java name */
    OutputLatency mo965getOutputLatencyIL232MI(int i2, OutputId outputId);

    List<OutputStream> getOutputs();

    Set<StreamId> getStreamIds();

    List<CameraStream> getStreams();
}
