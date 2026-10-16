package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraRequestControlImpl$runOnSequentialList$$inlined$confineDeferredListSuspend$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ l $block;
    final /* synthetic */ List $deferredList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$runOnSequentialList$$inlined$confineDeferredListSuspend$1(l lVar, List list, e eVar) {
        super(2, eVar);
        this.$block = lVar;
        this.$deferredList = list;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$runOnSequentialList$$inlined$confineDeferredListSuspend$1(this.$block, this.$deferredList, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((UseCaseCameraRequestControlImpl$runOnSequentialList$$inlined$confineDeferredListSuspend$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            l lVar = this.$block;
            this.label = 1;
            obj = lVar.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        List list = this.$deferredList;
        int i3 = 0;
        for (Object obj2 : (Iterable) obj) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i.p();
            }
            CoroutineAdaptersKt.propagateTo((am) obj2, (CompletableDeferred) list.get(i3));
            i3 = i4;
        }
        return ab.f48028a;
    }
}
