package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestNumber;
import androidx.camera.camera2.pipe.Result3A;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Result3AStateListenerImpl implements Result3AStateListener {
    private final CompletableDeferred<FrameInfo> _frameInfo;
    private final CompletableDeferred<Result3A> _result;
    private final l<FrameMetadata, Boolean> exitCondition;
    private final Integer frameLimit;
    private volatile FrameNumber frameNumberOfFirstUpdate;
    private RequestNumber initialRequestNumber;
    private volatile FrameInfo lastTotalCaptureResult;
    private volatile FrameNumber matchedFrameNumber;
    private final Long timeLimitNs;
    private volatile Long timestampOfFirstUpdateNs;

    /* JADX WARN: Multi-variable type inference failed */
    public Result3AStateListenerImpl(l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        x.f(lVar, "exitCondition");
        this.exitCondition = lVar;
        this.frameLimit = num;
        this.timeLimitNs = l2;
        this._result = bo.j();
        this._frameInfo = bo.j();
    }

    private final boolean checkLimits(FrameMetadata frameMetadata) {
        Integer num;
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        x.e(key, "SENSOR_TIMESTAMP");
        Long l2 = (Long) frameMetadata.get(key);
        long jMo689getFrameNumberUgla2oM = frameMetadata.mo689getFrameNumberUgla2oM();
        if (l2 != null && this.timestampOfFirstUpdateNs == null) {
            this.timestampOfFirstUpdateNs = l2;
        }
        Long l3 = this.timestampOfFirstUpdateNs;
        if (this.timeLimitNs != null && l3 != null && l2 != null && l2.longValue() - l3.longValue() > this.timeLimitNs.longValue()) {
            this.matchedFrameNumber = FrameNumber.m690boximpl(jMo689getFrameNumberUgla2oM);
            this._result.a(new Result3A(Result3A.Status.Companion.m910getTIME_LIMIT_REACHEDJvTi9ms(), frameMetadata, this._frameInfo, null));
            return true;
        }
        if (this.frameNumberOfFirstUpdate == null) {
            this.frameNumberOfFirstUpdate = FrameNumber.m690boximpl(jMo689getFrameNumberUgla2oM);
        }
        FrameNumber frameNumber = this.frameNumberOfFirstUpdate;
        if (frameNumber == null || (num = this.frameLimit) == null || jMo689getFrameNumberUgla2oM - frameNumber.m696unboximpl() <= num.intValue()) {
            return false;
        }
        this.matchedFrameNumber = FrameNumber.m690boximpl(jMo689getFrameNumberUgla2oM);
        this._result.a(new Result3A(Result3A.Status.Companion.m906getFRAME_LIMIT_REACHEDJvTi9ms(), frameMetadata, this._frameInfo, null));
        return true;
    }

    /* renamed from: isUpdateValid-DThHKJ0, reason: not valid java name */
    private final boolean m1174isUpdateValidDThHKJ0(long j2) {
        boolean z;
        synchronized (this) {
            RequestNumber requestNumber = this.initialRequestNumber;
            z = false;
            if (requestNumber != null) {
                if (j2 >= requestNumber.m886unboximpl()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: matchConditions-voP-kFw, reason: not valid java name */
    private final boolean m1175matchConditionsvoPkFw(long j2, FrameMetadata frameMetadata) {
        if (!m1174isUpdateValidDThHKJ0(j2)) {
            return false;
        }
        if (checkLimits(frameMetadata)) {
            return true;
        }
        if (!this.exitCondition.invoke(frameMetadata).booleanValue()) {
            return false;
        }
        this.matchedFrameNumber = FrameNumber.m690boximpl(frameMetadata.mo689getFrameNumberUgla2oM());
        this._result.a(new Result3A(Result3A.Status.Companion.m907getOKJvTi9ms(), frameMetadata, this._frameInfo, null));
        return true;
    }

    public final am<Result3A> getResult() {
        return this._result;
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphShutdown() {
        this._frameInfo.s(null);
        this._result.a(new Result3A(Result3A.Status.Companion.m908getSUBMIT_CANCELLEDJvTi9ms(), null, this._frameInfo, 2, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphStopped() {
        this._frameInfo.s(null);
        this._result.a(new Result3A(Result3A.Status.Companion.m908getSUBMIT_CANCELLEDJvTi9ms(), null, this._frameInfo, 2, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.Result3AStateListener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public void mo1171onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameMetadata, "captureResult");
        if (this._result.ca()) {
            return;
        }
        m1175matchConditionsvoPkFw(requestMetadata.mo198getRequestNumbermy6kx4g(), frameMetadata);
    }

    @Override // androidx.camera.camera2.pipe.graph.Result3AStateListener
    /* renamed from: onRequestSequenceCreated-DThHKJ0 */
    public void mo1172onRequestSequenceCreatedDThHKJ0(long j2) {
        synchronized (this) {
            if (this.initialRequestNumber == null) {
                this.initialRequestNumber = RequestNumber.m880boximpl(j2);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onStopRepeating() {
        this._frameInfo.s(null);
        this._result.a(new Result3A(Result3A.Status.Companion.m908getSUBMIT_CANCELLEDJvTi9ms(), null, this._frameInfo, 2, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.Result3AStateListener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public boolean mo1173onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "totalCaptureResult");
        this.lastTotalCaptureResult = frameInfo;
        if (!this._result.ca()) {
            if (!m1175matchConditionsvoPkFw(requestMetadata.mo198getRequestNumbermy6kx4g(), frameInfo.getMetadata())) {
                return false;
            }
            this._frameInfo.a(frameInfo);
            return true;
        }
        FrameNumber frameNumber = this.matchedFrameNumber;
        if (frameNumber == null || j2 < frameNumber.m696unboximpl()) {
            return frameNumber == null;
        }
        this._frameInfo.a(frameInfo);
        return true;
    }

    public /* synthetic */ Result3AStateListenerImpl(Map map, Integer num, Long l2, int i2, o oVar) {
        this((Map<CaptureResult.Key<?>, ? extends List<? extends Object>>) map, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : l2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result3AStateListenerImpl(Map<CaptureResult.Key<?>, ? extends List<? extends Object>> map, Integer num, Long l2) {
        this(Result3AStateListenerKt.toConditionChecker(map), num, l2);
        x.f(map, "exitConditionForKeys");
    }

    public /* synthetic */ Result3AStateListenerImpl(l lVar, Integer num, Long l2, int i2, o oVar) {
        this((l<? super FrameMetadata, Boolean>) lVar, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : l2);
    }
}
