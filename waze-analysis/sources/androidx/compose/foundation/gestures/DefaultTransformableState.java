package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.r;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {
    private final r<Offset, Float, Offset, Float, ab> onTransformation;
    private final TransformScope transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
        public void mo2170transformByd4ec7I(float f2, long j2, float f3) {
            mo2171transformByWithCentroidIEwrmTk(Offset.Companion.m7995getUnspecifiedF1C5BW0(), f2, j2, f3);
        }

        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformByWithCentroid-IEwrmTk, reason: not valid java name */
        public void mo2171transformByWithCentroidIEwrmTk(long j2, float f2, long j3, float f3) {
            this.this$0.getOnTransformation().invoke(Offset.m7969boximpl(j2), Float.valueOf(f2), Offset.m7969boximpl(j3), Float.valueOf(f3));
        }
    };
    private final MutatorMutex transformMutex = new MutatorMutex();
    private final MutableState<Boolean> isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<TransformScope, e<? super ab>, Object> $block;
        final /* synthetic */ MutatePriority $transformPriority;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<TransformScope, e<? super ab>, Object> {
            final /* synthetic */ p<TransformScope, e<? super ab>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultTransformableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DefaultTransformableState defaultTransformableState, p<? super TransformScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = defaultTransformableState;
                this.$block = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
                return ((AnonymousClass1) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v6, types: [h.ab, java.lang.Object] */
            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        c.b(obj);
                        TransformScope transformScope = (TransformScope) this.L$0;
                        this.this$0.isTransformingState.setValue(true);
                        p<TransformScope, e<? super ab>, Object> pVar = this.$block;
                        this.label = 1;
                        if (pVar.invoke(transformScope, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.b(obj);
                    }
                    this.this$0.isTransformingState.setValue(false);
                    this = ab.f48028a;
                    return this;
                } catch (Throwable th) {
                    this.this$0.isTransformingState.setValue(false);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, p<? super TransformScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$transformPriority = mutatePriority;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return DefaultTransformableState.this.new AnonymousClass2(this.$transformPriority, this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                DefaultTransformableState defaultTransformableState = DefaultTransformableState.this;
                MutatePriority mutatePriority = this.$transformPriority;
                p<TransformScope, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (defaultTransformableState.transformMutex.mutateWith(defaultTransformableState.transformScope, mutatePriority, new AnonymousClass1(defaultTransformableState, pVar, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(r<? super Offset, ? super Float, ? super Offset, ? super Float, ab> rVar) {
        this.onTransformation = rVar;
    }

    public final r<Offset, Float, Offset, Float, ab> getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, p<? super TransformScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(mutatePriority, pVar, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }
}
