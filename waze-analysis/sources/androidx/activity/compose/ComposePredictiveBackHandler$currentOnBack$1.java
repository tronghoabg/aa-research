package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ComposePredictiveBackHandler$currentOnBack$1 extends g implements p<k<? extends BackEventCompat>, e<? super ab>, Object> {
    int label;

    ComposePredictiveBackHandler$currentOnBack$1(e<? super ComposePredictiveBackHandler$currentOnBack$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ComposePredictiveBackHandler$currentOnBack$1(eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(k<BackEventCompat> kVar, e<? super ab> eVar) {
        return ((ComposePredictiveBackHandler$currentOnBack$1) create(kVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        return ab.f48028a;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(k<? extends BackEventCompat> kVar, e<? super ab> eVar) {
        return invoke2((k<BackEventCompat>) kVar, eVar);
    }
}
