package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraGraphImpl$lock3A$1 extends g implements p<af, e<? super am<? extends Result3A>>, Object> {
    final /* synthetic */ Lock3ABehavior $aeLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $aeRegions;
    final /* synthetic */ Lock3ABehavior $afLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $afRegions;
    final /* synthetic */ AeMode $afTriggerStartAeMode;
    final /* synthetic */ Lock3ABehavior $awbLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $awbRegions;
    final /* synthetic */ l<FrameMetadata, Boolean> $convergedCondition;
    final /* synthetic */ long $convergedTimeLimitNs;
    final /* synthetic */ int $frameLimit;
    final /* synthetic */ l<FrameMetadata, Boolean> $lockedCondition;
    final /* synthetic */ long $lockedTimeLimitNs;
    int label;
    final /* synthetic */ CameraGraphImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphImpl$lock3A$1(CameraGraphImpl cameraGraphImpl, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, l<? super FrameMetadata, Boolean> lVar, l<? super FrameMetadata, Boolean> lVar2, int i2, long j2, long j3, e<? super CameraGraphImpl$lock3A$1> eVar) {
        super(2, eVar);
        this.this$0 = cameraGraphImpl;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
        this.$aeLockBehavior = lock3ABehavior;
        this.$afLockBehavior = lock3ABehavior2;
        this.$awbLockBehavior = lock3ABehavior3;
        this.$afTriggerStartAeMode = aeMode;
        this.$convergedCondition = lVar;
        this.$lockedCondition = lVar2;
        this.$frameLimit = i2;
        this.$convergedTimeLimitNs = j2;
        this.$lockedTimeLimitNs = j3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CameraGraphImpl$lock3A$1(this.this$0, this.$aeRegions, this.$afRegions, this.$awbRegions, this.$aeLockBehavior, this.$afLockBehavior, this.$awbLockBehavior, this.$afTriggerStartAeMode, this.$convergedCondition, this.$lockedCondition, this.$frameLimit, this.$convergedTimeLimitNs, this.$lockedTimeLimitNs, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(af afVar, e<? super am<Result3A>> eVar) {
        return ((CameraGraphImpl$lock3A$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        CameraGraphImpl cameraGraphImpl = this.this$0;
        List<MeteringRectangle> list = this.$aeRegions;
        List<MeteringRectangle> list2 = this.$afRegions;
        List<MeteringRectangle> list3 = this.$awbRegions;
        Lock3ABehavior lock3ABehavior = this.$aeLockBehavior;
        Lock3ABehavior lock3ABehavior2 = this.$afLockBehavior;
        Lock3ABehavior lock3ABehavior3 = this.$awbLockBehavior;
        AeMode aeMode = this.$afTriggerStartAeMode;
        l<FrameMetadata, Boolean> lVar = this.$convergedCondition;
        l<FrameMetadata, Boolean> lVar2 = this.$lockedCondition;
        int i3 = this.$frameLimit;
        long j2 = this.$convergedTimeLimitNs;
        this.label = 1;
        Object objM1148lock3AQz1gx5w = cameraGraphImpl.controller3A.m1148lock3AQz1gx5w(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, lVar, lVar2, i3, new Long(j2), new Long(this.$lockedTimeLimitNs), this);
        return objM1148lock3AQz1gx5w == aVar ? aVar : objM1148lock3AQz1gx5w;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super am<? extends Result3A>> eVar) {
        return invoke2(afVar, (e<? super am<Result3A>>) eVar);
    }
}
