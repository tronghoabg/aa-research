package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraStateClosed extends CameraState {
    private final h.o.a cameraActiveDuration;
    private final ClosedReason cameraClosedReason;
    private final h.o.a cameraClosingDuration;
    private final CameraError cameraErrorCode;
    private final Throwable cameraException;
    private final String cameraId;
    private final h.o.a cameraOpenDuration;
    private final Integer cameraRetryCount;
    private final h.o.a cameraRetryDuration;

    public /* synthetic */ CameraStateClosed(String str, ClosedReason closedReason, Integer num, h.o.a aVar, Throwable th, h.o.a aVar2, h.o.a aVar3, h.o.a aVar4, CameraError cameraError, int i2, o oVar) {
        this(str, closedReason, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : aVar, (i2 & 16) != 0 ? null : th, (i2 & 32) != 0 ? null : aVar2, (i2 & 64) != 0 ? null : aVar3, (i2 & 128) != 0 ? null : aVar4, (i2 & 256) != 0 ? null : cameraError, null);
    }

    /* renamed from: copy-JpxXhwY$default, reason: not valid java name */
    public static /* synthetic */ CameraStateClosed m1056copyJpxXhwY$default(CameraStateClosed cameraStateClosed, String str, ClosedReason closedReason, Integer num, h.o.a aVar, Throwable th, h.o.a aVar2, h.o.a aVar3, h.o.a aVar4, CameraError cameraError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cameraStateClosed.cameraId;
        }
        if ((i2 & 2) != 0) {
            closedReason = cameraStateClosed.cameraClosedReason;
        }
        if ((i2 & 4) != 0) {
            num = cameraStateClosed.cameraRetryCount;
        }
        if ((i2 & 8) != 0) {
            aVar = cameraStateClosed.cameraRetryDuration;
        }
        if ((i2 & 16) != 0) {
            th = cameraStateClosed.cameraException;
        }
        if ((i2 & 32) != 0) {
            aVar2 = cameraStateClosed.cameraOpenDuration;
        }
        if ((i2 & 64) != 0) {
            aVar3 = cameraStateClosed.cameraActiveDuration;
        }
        if ((i2 & 128) != 0) {
            aVar4 = cameraStateClosed.cameraClosingDuration;
        }
        if ((i2 & 256) != 0) {
            cameraError = cameraStateClosed.cameraErrorCode;
        }
        h.o.a aVar5 = aVar4;
        CameraError cameraError2 = cameraError;
        h.o.a aVar6 = aVar2;
        h.o.a aVar7 = aVar3;
        Throwable th2 = th;
        Integer num2 = num;
        return cameraStateClosed.m1063copyJpxXhwY(str, closedReason, num2, aVar, th2, aVar6, aVar7, aVar5, cameraError2);
    }

    /* renamed from: component1-Dz_R5H8, reason: not valid java name */
    public final String m1057component1Dz_R5H8() {
        return this.cameraId;
    }

    public final ClosedReason component2() {
        return this.cameraClosedReason;
    }

    public final Integer component3() {
        return this.cameraRetryCount;
    }

    /* renamed from: component4-FghU774, reason: not valid java name */
    public final h.o.a m1058component4FghU774() {
        return this.cameraRetryDuration;
    }

    public final Throwable component5() {
        return this.cameraException;
    }

    /* renamed from: component6-FghU774, reason: not valid java name */
    public final h.o.a m1059component6FghU774() {
        return this.cameraOpenDuration;
    }

    /* renamed from: component7-FghU774, reason: not valid java name */
    public final h.o.a m1060component7FghU774() {
        return this.cameraActiveDuration;
    }

    /* renamed from: component8-FghU774, reason: not valid java name */
    public final h.o.a m1061component8FghU774() {
        return this.cameraClosingDuration;
    }

    /* renamed from: component9-mVEW8x0, reason: not valid java name */
    public final CameraError m1062component9mVEW8x0() {
        return this.cameraErrorCode;
    }

    /* renamed from: copy-JpxXhwY, reason: not valid java name */
    public final CameraStateClosed m1063copyJpxXhwY(String str, ClosedReason closedReason, Integer num, h.o.a aVar, Throwable th, h.o.a aVar2, h.o.a aVar3, h.o.a aVar4, CameraError cameraError) {
        x.f(str, "cameraId");
        x.f(closedReason, "cameraClosedReason");
        return new CameraStateClosed(str, closedReason, num, aVar, th, aVar2, aVar3, aVar4, cameraError, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraStateClosed)) {
            return false;
        }
        CameraStateClosed cameraStateClosed = (CameraStateClosed) obj;
        return CameraId.m549equalsimpl0(this.cameraId, cameraStateClosed.cameraId) && this.cameraClosedReason == cameraStateClosed.cameraClosedReason && x.n(this.cameraRetryCount, cameraStateClosed.cameraRetryCount) && x.n(this.cameraRetryDuration, cameraStateClosed.cameraRetryDuration) && x.n(this.cameraException, cameraStateClosed.cameraException) && x.n(this.cameraOpenDuration, cameraStateClosed.cameraOpenDuration) && x.n(this.cameraActiveDuration, cameraStateClosed.cameraActiveDuration) && x.n(this.cameraClosingDuration, cameraStateClosed.cameraClosingDuration) && x.n(this.cameraErrorCode, cameraStateClosed.cameraErrorCode);
    }

    /* renamed from: getCameraActiveDuration-FghU774, reason: not valid java name */
    public final h.o.a m1064getCameraActiveDurationFghU774() {
        return this.cameraActiveDuration;
    }

    public final ClosedReason getCameraClosedReason() {
        return this.cameraClosedReason;
    }

    /* renamed from: getCameraClosingDuration-FghU774, reason: not valid java name */
    public final h.o.a m1065getCameraClosingDurationFghU774() {
        return this.cameraClosingDuration;
    }

    /* renamed from: getCameraErrorCode-mVEW8x0, reason: not valid java name */
    public final CameraError m1066getCameraErrorCodemVEW8x0() {
        return this.cameraErrorCode;
    }

    public final Throwable getCameraException() {
        return this.cameraException;
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final String m1067getCameraIdDz_R5H8() {
        return this.cameraId;
    }

    /* renamed from: getCameraOpenDuration-FghU774, reason: not valid java name */
    public final h.o.a m1068getCameraOpenDurationFghU774() {
        return this.cameraOpenDuration;
    }

    public final Integer getCameraRetryCount() {
        return this.cameraRetryCount;
    }

    /* renamed from: getCameraRetryDuration-FghU774, reason: not valid java name */
    public final h.o.a m1069getCameraRetryDurationFghU774() {
        return this.cameraRetryDuration;
    }

    public int hashCode() {
        int iM550hashCodeimpl = (CameraId.m550hashCodeimpl(this.cameraId) * 31) + this.cameraClosedReason.hashCode();
        Integer num = this.cameraRetryCount;
        int iHashCode = ((iM550hashCodeimpl * 31) + (num == null ? 0 : num.hashCode())) * 31;
        h.o.a aVar = this.cameraRetryDuration;
        int iB = (iHashCode + (aVar == null ? 0 : a.a.b(aVar.w()))) * 31;
        Throwable th = this.cameraException;
        int iHashCode2 = (iB + (th == null ? 0 : th.hashCode())) * 31;
        h.o.a aVar2 = this.cameraOpenDuration;
        int iB2 = (iHashCode2 + (aVar2 == null ? 0 : a.a.b(aVar2.w()))) * 31;
        h.o.a aVar3 = this.cameraActiveDuration;
        int iB3 = (iB2 + (aVar3 == null ? 0 : a.a.b(aVar3.w()))) * 31;
        h.o.a aVar4 = this.cameraClosingDuration;
        int iB4 = (iB3 + (aVar4 == null ? 0 : a.a.b(aVar4.w()))) * 31;
        CameraError cameraError = this.cameraErrorCode;
        return iB4 + (cameraError != null ? cameraError.m478unboximpl() : 0);
    }

    public String toString() {
        return "CameraStateClosed(cameraId=" + CameraId.m552toStringimpl(this.cameraId) + ", cameraClosedReason=" + this.cameraClosedReason + ", cameraRetryCount=" + this.cameraRetryCount + ", cameraRetryDuration=" + this.cameraRetryDuration + ", cameraException=" + this.cameraException + ", cameraOpenDuration=" + this.cameraOpenDuration + ", cameraActiveDuration=" + this.cameraActiveDuration + ", cameraClosingDuration=" + this.cameraClosingDuration + ", cameraErrorCode=" + this.cameraErrorCode + ")";
    }

    public /* synthetic */ CameraStateClosed(String str, ClosedReason closedReason, Integer num, h.o.a aVar, Throwable th, h.o.a aVar2, h.o.a aVar3, h.o.a aVar4, CameraError cameraError, o oVar) {
        this(str, closedReason, num, aVar, th, aVar2, aVar3, aVar4, cameraError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CameraStateClosed(String str, ClosedReason closedReason, Integer num, h.o.a aVar, Throwable th, h.o.a aVar2, h.o.a aVar3, h.o.a aVar4, CameraError cameraError) {
        super(null);
        x.f(str, "cameraId");
        x.f(closedReason, "cameraClosedReason");
        this.cameraId = str;
        this.cameraClosedReason = closedReason;
        this.cameraRetryCount = num;
        this.cameraRetryDuration = aVar;
        this.cameraException = th;
        this.cameraOpenDuration = aVar2;
        this.cameraActiveDuration = aVar3;
        this.cameraClosingDuration = aVar4;
        this.cameraErrorCode = cameraError;
    }
}
