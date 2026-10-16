package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SliderKt$sliderTapModifier$2$1$1 implements PointerInputEventHandler {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ State<l<Float, ab>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;
    final /* synthetic */ af $scope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements q<PressGestureScope, Offset, e<? super ab>, Object> {
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ MutableState<Float> $pressOffset;
        final /* synthetic */ State<Float> $rawOffset;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, float f2, MutableState<Float> mutableState, State<Float> state, e<? super AnonymousClass1> eVar) {
            super(3, eVar);
            this.$isRtl = z;
            this.$maxPx = f2;
            this.$pressOffset = mutableState;
            this.$rawOffset = state;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, e<? super ab> eVar) {
            return m4193invoked4ec7I(pressGestureScope, offset.m7990unboximpl(), eVar);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m4193invoked4ec7I(PressGestureScope pressGestureScope, long j2, e<? super ab> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, eVar);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j2;
            return anonymousClass1.invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v8 */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    int i3 = (int) (this.J$0 >> 32);
                    this.$pressOffset.setValue(new Float((this.$isRtl ? this.$maxPx - Float.intBitsToFloat(i3) : Float.intBitsToFloat(i3)) - this.$rawOffset.getValue().floatValue()));
                    this.label = 1;
                    Object objAwaitRelease = pressGestureScope.awaitRelease(this);
                    this = objAwaitRelease;
                    if (objAwaitRelease == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                    this = this;
                }
            } catch (GestureCancellationException unused) {
                this.$pressOffset.setValue(new Float(0.0f));
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$sliderTapModifier$2$1$1(boolean z, float f2, MutableState<Float> mutableState, State<Float> state, af afVar, DraggableState draggableState, State<? extends l<? super Float, ab>> state2) {
        this.$isRtl = z;
        this.$maxPx = f2;
        this.$pressOffset = mutableState;
        this.$rawOffset = state;
        this.$scope = afVar;
        this.$draggableState = draggableState;
        this.$gestureEndAction = state2;
    }

    static final ab invoke$lambda$0(af afVar, DraggableState draggableState, State state, Offset offset) {
        aj.z(afVar, null, null, new SliderKt$sliderTapModifier$2$1$1$2$1(draggableState, state, null), 3);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
        final af afVar = this.$scope;
        final DraggableState draggableState = this.$draggableState;
        final State<l<Float, ab>> state = this.$gestureEndAction;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, new l() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SliderKt$sliderTapModifier$2$1$1.invoke$lambda$0(afVar, draggableState, state, (Offset) obj);
            }
        }, eVar, 3, null);
        return objDetectTapGestures$default == a.f48038a ? objDetectTapGestures$default : ab.f48028a;
    }
}
