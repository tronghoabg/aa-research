package androidx.compose.material3.internal;

import androidx.activity.BackEventCompat;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 extends g implements p<k<? extends BackEventCompat>, e<? super ab>, Object> {
    final /* synthetic */ State<a<ab>> $currentOnBack$delegate;
    final /* synthetic */ PredictiveBackState $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(PredictiveBackState predictiveBackState, State<? extends a<ab>> state, e<? super BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1> eVar) {
        super(2, eVar);
        this.$state = predictiveBackState;
        this.$currentOnBack$delegate = state;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(this.$state, this.$currentOnBack$delegate, eVar);
        basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.L$0 = obj;
        return basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(k<BackEventCompat> kVar, e<? super ab> eVar) {
        return ((BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1) create(kVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                k kVar = (k) this.L$0;
                final PredictiveBackState predictiveBackState = this.$state;
                this.label = 1;
                if (kVar.collect(new l() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.1
                    public final Object emit(BackEventCompat backEventCompat, e<? super ab> eVar) {
                        PredictiveBackStateImpl predictiveBackStateImpl = (PredictiveBackStateImpl) predictiveBackState;
                        float touchX = backEventCompat.getTouchX();
                        float touchY = backEventCompat.getTouchY();
                        float progress = backEventCompat.getProgress();
                        int swipeEdge = backEventCompat.getSwipeEdge();
                        predictiveBackStateImpl.setValue(new BackEventProgress.InProgress(touchX, touchY, progress, swipeEdge != 0 ? swipeEdge != 1 ? SwipeEdge.None : SwipeEdge.Right : SwipeEdge.Left));
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((BackEventCompat) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            ((PredictiveBackStateImpl) this.$state).setValue(BackEventProgress.Completed.INSTANCE);
            BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler$lambda$0(this.$currentOnBack$delegate).invoke();
            return ab.f48028a;
        } catch (CancellationException e2) {
            ((PredictiveBackStateImpl) this.$state).setValue(BackEventProgress.NotRunning.INSTANCE);
            throw e2;
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(k<? extends BackEventCompat> kVar, e<? super ab> eVar) {
        return invoke2((k<BackEventCompat>) kVar, eVar);
    }
}
