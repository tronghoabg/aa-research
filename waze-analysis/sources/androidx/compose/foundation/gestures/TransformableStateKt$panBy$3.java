package androidx.compose.foundation.gestures;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TransformableStateKt$panBy$3 extends g implements p<TransformScope, e<? super ab>, Object> {
    final /* synthetic */ long $centroid;
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$panBy$3(long j2, long j3, e<? super TransformableStateKt$panBy$3> eVar) {
        super(2, eVar);
        this.$centroid = j2;
        this.$offset = j3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TransformableStateKt$panBy$3 transformableStateKt$panBy$3 = new TransformableStateKt$panBy$3(this.$centroid, this.$offset, eVar);
        transformableStateKt$panBy$3.L$0 = obj;
        return transformableStateKt$panBy$3;
    }

    @Override // h.g.a.p
    public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
        return ((TransformableStateKt$panBy$3) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        ((TransformScope) this.L$0).mo2171transformByWithCentroidIEwrmTk(this.$centroid, 1.0f, this.$offset, 0.0f);
        return ab.f48028a;
    }
}
