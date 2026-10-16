package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SwitchKt$Switch$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ State<Boolean> $currentChecked$delegate;
    final /* synthetic */ State<l<Boolean, ab>> $currentOnCheckedChange$delegate;
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwitchKt$Switch$1$1(AnchoredDraggableState<Boolean> anchoredDraggableState, State<Boolean> state, State<? extends l<? super Boolean, ab>> state2, MutableState<Boolean> mutableState, e<? super SwitchKt$Switch$1$1> eVar) {
        super(2, eVar);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$currentChecked$delegate = state;
        this.$currentOnCheckedChange$delegate = state2;
        this.$forceAnimationCheck$delegate = mutableState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SwitchKt$Switch$1$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SwitchKt$Switch$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final AnchoredDraggableState<Boolean> anchoredDraggableState = this.$anchoredDraggableState;
            this.label = 1;
            if (ai.e(SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: androidx.compose.material.SwitchKt$Switch$1$1$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Boolean.valueOf(((Boolean) anchoredDraggableState.getCurrentValue()).booleanValue());
                }
            }), new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null), this) == aVar) {
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

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SwitchKt$Switch$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Boolean, e<? super ab>, Object> {
        final /* synthetic */ State<Boolean> $currentChecked$delegate;
        final /* synthetic */ State<l<Boolean, ab>> $currentOnCheckedChange$delegate;
        final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(State<Boolean> state, State<? extends l<? super Boolean, ab>> state2, MutableState<Boolean> mutableState, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$currentChecked$delegate = state;
            this.$currentOnCheckedChange$delegate = state2;
            this.$forceAnimationCheck$delegate = mutableState;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, eVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public final Object invoke(boolean z, e<? super ab> eVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            boolean z = this.Z$0;
            if (SwitchKt.Switch$lambda$8(this.$currentChecked$delegate) != z) {
                l lVarSwitch$lambda$7 = SwitchKt.Switch$lambda$7(this.$currentOnCheckedChange$delegate);
                if (lVarSwitch$lambda$7 != null) {
                    lVarSwitch$lambda$7.invoke(Boolean.valueOf(z));
                }
                SwitchKt.Switch$lambda$4(this.$forceAnimationCheck$delegate, !SwitchKt.Switch$lambda$3(r1));
            }
            return ab.f48028a;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, e<? super ab> eVar) {
            return invoke(bool.booleanValue(), eVar);
        }
    }
}
