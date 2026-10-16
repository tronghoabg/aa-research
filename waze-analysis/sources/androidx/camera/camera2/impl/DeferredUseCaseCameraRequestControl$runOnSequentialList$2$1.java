package androidx.camera.camera2.impl;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1 extends g implements p<af, e, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ am<List<am>> $submissionJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(am<? extends List<? extends am>> amVar, int i2, e<? super DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1> eVar) {
        super(2, eVar);
        this.$submissionJob = amVar;
        this.$index = i2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(this.$submissionJob, this.$index, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            obj = this.$submissionJob.c(this);
            if (obj != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        List list = (List) obj;
        if (this.$index >= list.size()) {
            return null;
        }
        this.label = 2;
        Object objC = ((am) list.get(this.$index)).c(this);
        return objC == aVar ? aVar : objC;
    }
}
