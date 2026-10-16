package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.LatestFrameMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LatestFrameMetadataAggregator implements Request.Listener {
    private final CaptureResult.Key<?>[] captureResultKeys;
    private final l<RequestMetadata, Boolean> filter;
    private long lastTotalFrameNumber;
    private LatestFrameMetadataImpl latestSnapshot;
    private final int maxWindowSize;
    private final Metadata.Key<?>[] metadataKeys;
    private final l<LatestFrameMetadata, ab> onValuesUpdated;
    private final List<FrameMetadataState> window;

    /* JADX WARN: Multi-variable type inference failed */
    public LatestFrameMetadataAggregator(Set<? extends CaptureResult.Key<?>> set, Set<? extends Metadata.Key<?>> set2, int i2, l<? super RequestMetadata, Boolean> lVar, l<? super LatestFrameMetadata, ab> lVar2) {
        x.f(set, "captureResultKeys");
        x.f(set2, "metadataKeys");
        x.f(lVar2, "onValuesUpdated");
        this.maxWindowSize = i2;
        this.filter = lVar;
        this.onValuesUpdated = lVar2;
        this.captureResultKeys = (CaptureResult.Key[]) set.toArray(new CaptureResult.Key[0]);
        this.metadataKeys = (Metadata.Key[]) set2.toArray(new Metadata.Key[0]);
        this.window = new ArrayList();
        this.lastTotalFrameNumber = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.camera2.pipe.graph.LatestFrameMetadataImpl buildNextSnapshotIfChanged() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.LatestFrameMetadataAggregator.buildNextSnapshotIfChanged():androidx.camera.camera2.pipe.graph.LatestFrameMetadataImpl");
    }

    /* renamed from: getOrCreateFrameState-Vw7M1qk, reason: not valid java name */
    private final FrameMetadataState m1161getOrCreateFrameStateVw7M1qk(long j2) {
        int size = this.window.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (FrameNumber.m693equalsimpl0(this.window.get(i3).m1163getFrameNumberUgla2oM(), j2)) {
                return this.window.get(i3);
            }
        }
        int length = this.captureResultKeys.length;
        Object[] objArr = new Object[length];
        for (int i4 = 0; i4 < length; i4++) {
            objArr[i4] = LatestFrameMetadataAggregatorKt.ABSENT;
        }
        int length2 = this.metadataKeys.length;
        Object[] objArr2 = new Object[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            objArr2[i5] = LatestFrameMetadataAggregatorKt.ABSENT;
        }
        FrameMetadataState frameMetadataState = new FrameMetadataState(j2, objArr, objArr2, null);
        int size2 = this.window.size();
        while (true) {
            List<FrameMetadataState> list = this.window;
            if (i2 >= size2) {
                list.add(frameMetadataState);
                return frameMetadataState;
            }
            if (j2 > list.get(i2).m1163getFrameNumberUgla2oM()) {
                this.window.add(i2, frameMetadataState);
                return frameMetadataState;
            }
            i2++;
        }
    }

    /* renamed from: updateFrame-jRrQLwc, reason: not valid java name */
    private final void m1162updateFramejRrQLwc(long j2, FrameMetadata frameMetadata, boolean z) {
        synchronized (this.window) {
            if (j2 <= this.lastTotalFrameNumber) {
                return;
            }
            FrameMetadataState frameMetadataStateM1161getOrCreateFrameStateVw7M1qk = m1161getOrCreateFrameStateVw7M1qk(j2);
            int length = this.captureResultKeys.length;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = frameMetadata.get(this.captureResultKeys[i2]);
                if (obj != null) {
                    frameMetadataStateM1161getOrCreateFrameStateVw7M1qk.getCaptureResultValues()[i2] = obj;
                }
            }
            int length2 = this.metadataKeys.length;
            for (int i3 = 0; i3 < length2; i3++) {
                Object obj2 = frameMetadata.get(this.metadataKeys[i3]);
                if (obj2 != null) {
                    frameMetadataStateM1161getOrCreateFrameStateVw7M1qk.getMetadataValues()[i3] = obj2;
                }
            }
            if (z && j2 > this.lastTotalFrameNumber) {
                this.lastTotalFrameNumber = j2;
                for (int iE = i.e(this.window); iE >= 0; iE--) {
                    if (this.window.get(iE).m1163getFrameNumberUgla2oM() < this.lastTotalFrameNumber) {
                        this.window.remove(iE);
                    }
                }
            }
            while (this.window.size() > this.maxWindowSize) {
                List<FrameMetadataState> list = this.window;
                list.remove(i.e(list));
            }
            LatestFrameMetadataImpl latestFrameMetadataImplBuildNextSnapshotIfChanged = buildNextSnapshotIfChanged();
            if (latestFrameMetadataImplBuildNextSnapshotIfChanged != null) {
                this.onValuesUpdated.invoke(latestFrameMetadataImplBuildNextSnapshotIfChanged);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onAborted(Request request) {
        x.f(request, "request");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-DlC0U5Y */
    public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public /* synthetic */ void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public /* synthetic */ void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        Request.Listener.CC.m854$default$onCompleteCcXjc1I(this, requestMetadata, j2, frameInfo);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public /* synthetic */ void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        Request.Listener.CC.m855$default$onFailedCcXjc1I(this, requestMetadata, j2, requestFailure);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameMetadata, "captureResult");
        if (requestMetadata.getRequest().getInputRequest() != null) {
            return;
        }
        l<RequestMetadata, Boolean> lVar = this.filter;
        if (lVar == null || !lVar.invoke(requestMetadata).booleanValue()) {
            m1162updateFramejRrQLwc(j2, frameMetadata, false);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w */
    public /* synthetic */ void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceAborted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
    public /* synthetic */ void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceCreated(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceSubmitted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public /* synthetic */ void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "totalCaptureResult");
        if (requestMetadata.getRequest().getInputRequest() != null) {
            return;
        }
        l<RequestMetadata, Boolean> lVar = this.filter;
        if (lVar == null || !lVar.invoke(requestMetadata).booleanValue()) {
            m1162updateFramejRrQLwc(j2, frameInfo.getMetadata(), true);
        }
    }

    /* compiled from: WazeSource */
    final class FrameMetadataState {
        private final Object[] captureResultValues;
        private final long frameNumber;
        private final Object[] metadataValues;

        private FrameMetadataState(long j2, Object[] objArr, Object[] objArr2) {
            x.f(objArr, "captureResultValues");
            x.f(objArr2, "metadataValues");
            this.frameNumber = j2;
            this.captureResultValues = objArr;
            this.metadataValues = objArr2;
        }

        public final Object[] getCaptureResultValues() {
            return this.captureResultValues;
        }

        /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
        public final long m1163getFrameNumberUgla2oM() {
            return this.frameNumber;
        }

        public final Object[] getMetadataValues() {
            return this.metadataValues;
        }

        public /* synthetic */ FrameMetadataState(long j2, Object[] objArr, Object[] objArr2, o oVar) {
            this(j2, objArr, objArr2);
        }
    }

    public /* synthetic */ LatestFrameMetadataAggregator(Set set, Set set2, int i2, l lVar, l lVar2, int i3, o oVar) {
        this(set, set2, (i3 & 4) != 0 ? 4 : i2, (i3 & 8) != 0 ? null : lVar, lVar2);
    }
}
