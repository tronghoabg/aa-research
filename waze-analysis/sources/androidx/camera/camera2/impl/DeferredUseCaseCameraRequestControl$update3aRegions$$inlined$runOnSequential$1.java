package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Result3A;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeferredUseCaseCameraRequestControl$update3aRegions$$inlined$runOnSequential$1 extends g implements p<af, e<? super Result3A>, Object> {
    final /* synthetic */ List $aeRegions$inlined;
    final /* synthetic */ List $afRegions$inlined;
    final /* synthetic */ List $awbRegions$inlined;
    int label;
    final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredUseCaseCameraRequestControl$update3aRegions$$inlined$runOnSequential$1(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, e eVar, List list, List list2, List list3) {
        super(2, eVar);
        this.this$0 = deferredUseCaseCameraRequestControl;
        this.$aeRegions$inlined = list;
        this.$afRegions$inlined = list2;
        this.$awbRegions$inlined = list3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DeferredUseCaseCameraRequestControl$update3aRegions$$inlined$runOnSequential$1(this.this$0, eVar, this.$aeRegions$inlined, this.$afRegions$inlined, this.$awbRegions$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super Result3A> eVar) {
        return ((DeferredUseCaseCameraRequestControl$update3aRegions$$inlined$runOnSequential$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        this.label = 1;
        Object objC = this.this$0.getOrCreateImpl().update3aRegions(this.$aeRegions$inlined, this.$afRegions$inlined, this.$awbRegions$inlined).c(this);
        return objC == aVar ? aVar : objC;
    }
}
