package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.Result3A;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraGraphImpl$update3A$1 extends g implements p<af, e<? super am<? extends Result3A>>, Object> {
    final /* synthetic */ AeMode $aeMode;
    final /* synthetic */ List<MeteringRectangle> $aeRegions;
    final /* synthetic */ AfMode $afMode;
    final /* synthetic */ List<MeteringRectangle> $afRegions;
    final /* synthetic */ AwbMode $awbMode;
    final /* synthetic */ List<MeteringRectangle> $awbRegions;
    final /* synthetic */ ControlMode $controlMode;
    final /* synthetic */ FlashMode $flashMode;
    final /* synthetic */ boolean $retainLocks;
    int label;
    final /* synthetic */ CameraGraphImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$update3A$1(CameraGraphImpl cameraGraphImpl, AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, ControlMode controlMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, boolean z, e<? super CameraGraphImpl$update3A$1> eVar) {
        super(2, eVar);
        this.this$0 = cameraGraphImpl;
        this.$aeMode = aeMode;
        this.$afMode = afMode;
        this.$awbMode = awbMode;
        this.$flashMode = flashMode;
        this.$controlMode = controlMode;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
        this.$retainLocks = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CameraGraphImpl$update3A$1(this.this$0, this.$aeMode, this.$afMode, this.$awbMode, this.$flashMode, this.$controlMode, this.$aeRegions, this.$afRegions, this.$awbRegions, this.$retainLocks, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(af afVar, e<? super am<Result3A>> eVar) {
        return ((CameraGraphImpl$update3A$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        CameraGraphImpl cameraGraphImpl = this.this$0;
        return cameraGraphImpl.controller3A.m1151update3A0Pt5STg(this.$aeMode, this.$afMode, this.$awbMode, this.$flashMode, this.$controlMode, this.$aeRegions, this.$afRegions, this.$awbRegions, this.$retainLocks);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super am<? extends Result3A>> eVar) {
        return invoke2(afVar, (e<? super am<Result3A>>) eVar);
    }
}
