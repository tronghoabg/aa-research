package androidx.camera.camera2.impl;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import e.b.c;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 extends g implements l<e<? super am<? extends Result3A>>, Object> {
    final /* synthetic */ Lock3ABehavior $aeLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $aeRegions;
    final /* synthetic */ Lock3ABehavior $afLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $afRegions;
    final /* synthetic */ AeMode $afTriggerStartAeMode;
    final /* synthetic */ Lock3ABehavior $awbLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $awbRegions;
    final /* synthetic */ l<FrameMetadata, Boolean> $convergedCondition;
    final /* synthetic */ long $timeLimitNs;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, l<? super FrameMetadata, Boolean> lVar, long j2, e<? super UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1> eVar) {
        super(1, eVar);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
        this.$aeLockBehavior = lock3ABehavior;
        this.$afLockBehavior = lock3ABehavior2;
        this.$awbLockBehavior = lock3ABehavior3;
        this.$afTriggerStartAeMode = aeMode;
        this.$convergedCondition = lVar;
        this.$timeLimitNs = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this.this$0, this.$aeRegions, this.$afRegions, this.$awbRegions, this.$aeLockBehavior, this.$afLockBehavior, this.$awbLockBehavior, this.$afTriggerStartAeMode, this.$convergedCondition, this.$timeLimitNs, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super am<Result3A>> eVar) {
        return ((UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objAcquireSession;
        Lock3ABehavior lock3ABehavior;
        List<MeteringRectangle> list;
        Lock3ABehavior lock3ABehavior2;
        Lock3ABehavior lock3ABehavior3;
        List<MeteringRectangle> list2;
        List<MeteringRectangle> list3;
        AeMode aeMode;
        l<FrameMetadata, Boolean> lVar;
        long j2;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        Throwable th;
        AutoCloseable autoCloseable3;
        CameraGraph.Session session;
        long j3;
        Throwable th2;
        Object objM540lock3AtS25XM$default;
        AutoCloseable autoCloseable4;
        a aVar = a.f48038a;
        int i2 = this.label;
        try {
            try {
                try {
                    if (i2 == 0) {
                        c.b(obj);
                        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                        if (Logger.isDebugEnabled(Log.TAG)) {
                            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl#startFocusAndMeteringAsync");
                        }
                        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
                        List<MeteringRectangle> list4 = this.$aeRegions;
                        List<MeteringRectangle> list5 = this.$afRegions;
                        List<MeteringRectangle> list6 = this.$awbRegions;
                        Lock3ABehavior lock3ABehavior4 = this.$aeLockBehavior;
                        Lock3ABehavior lock3ABehavior5 = this.$afLockBehavior;
                        Lock3ABehavior lock3ABehavior6 = this.$awbLockBehavior;
                        AeMode aeMode2 = this.$afTriggerStartAeMode;
                        l<FrameMetadata, Boolean> lVar2 = this.$convergedCondition;
                        long j4 = this.$timeLimitNs;
                        this.L$0 = list4;
                        this.L$1 = list5;
                        this.L$2 = list6;
                        this.L$3 = lock3ABehavior4;
                        this.L$4 = lock3ABehavior5;
                        this.L$5 = lock3ABehavior6;
                        this.L$6 = aeMode2;
                        this.L$7 = lVar2;
                        this.J$0 = j4;
                        this.label = 1;
                        objAcquireSession = useCaseCameraRequestControlImpl.useCaseCameraContext.getGraph().acquireSession(this);
                        if (objAcquireSession != aVar) {
                            lock3ABehavior = lock3ABehavior6;
                            list = list6;
                            lock3ABehavior2 = lock3ABehavior5;
                            lock3ABehavior3 = lock3ABehavior4;
                            list2 = list5;
                            list3 = list4;
                            aeMode = aeMode2;
                            lVar = lVar2;
                            j2 = j4;
                        }
                        return aVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        autoCloseable4 = (AutoCloseable) this.L$0;
                        try {
                            c.b(obj);
                            objM540lock3AtS25XM$default = obj;
                            th2 = null;
                            return (am) objM540lock3AtS25XM$default;
                        } catch (Throwable th3) {
                            autoCloseable3 = autoCloseable4;
                            th = th3;
                            try {
                                throw th;
                            } finally {
                                r.y(autoCloseable3, th);
                            }
                        }
                    }
                    j2 = this.J$0;
                    l<FrameMetadata, Boolean> lVar3 = (l) this.L$7;
                    AeMode aeMode3 = (AeMode) this.L$6;
                    Lock3ABehavior lock3ABehavior7 = (Lock3ABehavior) this.L$5;
                    Lock3ABehavior lock3ABehavior8 = (Lock3ABehavior) this.L$4;
                    Lock3ABehavior lock3ABehavior9 = (Lock3ABehavior) this.L$3;
                    List<MeteringRectangle> list7 = (List) this.L$2;
                    List<MeteringRectangle> list8 = (List) this.L$1;
                    List<MeteringRectangle> list9 = (List) this.L$0;
                    c.b(obj);
                    lock3ABehavior = lock3ABehavior7;
                    list = list7;
                    lock3ABehavior2 = lock3ABehavior8;
                    lock3ABehavior3 = lock3ABehavior9;
                    list2 = list8;
                    aeMode = aeMode3;
                    list3 = list9;
                    lVar = lVar3;
                    objAcquireSession = obj;
                    objM540lock3AtS25XM$default = CameraGraph.Session.CC.m540lock3AtS25XM$default(session, null, null, null, list3, list2, list, lock3ABehavior3, lock3ABehavior2, lock3ABehavior, aeMode, lVar, null, 0, j3, j3, this, 6151, null);
                    if (objM540lock3AtS25XM$default != aVar) {
                        autoCloseable4 = autoCloseable2;
                        return (am) objM540lock3AtS25XM$default;
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    autoCloseable3 = autoCloseable2;
                    throw th;
                }
                session = (CameraGraph.Session) autoCloseable;
                UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 useCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 = this;
                this.L$0 = autoCloseable;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 2;
                j3 = j2;
                th2 = null;
                autoCloseable2 = autoCloseable;
            } catch (Throwable th5) {
                th = th5;
                autoCloseable2 = autoCloseable;
            }
            autoCloseable = (AutoCloseable) objAcquireSession;
        } catch (CancellationException e2) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            CancellationException cancellationException = e2;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Cannot acquire the CameraGraph.Session", cancellationException);
            }
            return UseCaseCameraRequestControlImpl.submitFailedResult;
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super am<? extends Result3A>> eVar) {
        return invoke2((e<? super am<Result3A>>) eVar);
    }
}
