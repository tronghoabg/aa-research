package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.b.a.g;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.e;
import h.k.n;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SliderState implements DraggableState {
    private final DragScope dragScope;
    private final a<ab> gestureEndAction;
    private final MutableState isDragging$delegate;
    private boolean isRtl;
    private l<? super Float, ab> onValueChange;
    private a<ab> onValueChangeFinished;
    private Orientation orientation;
    private final MutableFloatState pressOffset$delegate;
    private final MutableFloatState rawOffset$delegate;
    private boolean reverseVerticalDirection;
    private final MutatorMutex scrollMutex;
    private boolean shouldAutoSnap;
    private final int steps;
    private final MutableIntState thumbHeight$delegate;
    private final MutableIntState thumbWidth$delegate;
    private final float[] tickFractions;
    private final MutableIntState totalHeight$delegate;
    private final MutableIntState totalWidth$delegate;
    private final e<Float> valueRange;
    private final MutableFloatState valueState$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.SliderState$drag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, h.c.e<? super ab>, Object> {
        final /* synthetic */ p<DragScope, h.c.e<? super ab>, Object> $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, p<? super DragScope, ? super h.c.e<? super ab>, ? extends Object> pVar, h.c.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$dragPriority = mutatePriority;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return SliderState.this.new AnonymousClass2(this.$dragPriority, this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [h.ab, java.lang.Object] */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    SliderState.this.setDragging(true);
                    this.label = 1;
                    if (SliderState.this.scrollMutex.mutateWith(SliderState.this.dragScope, this.$dragPriority, this.$block, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                SliderState.this.setDragging(false);
                this = ab.f48028a;
                return this;
            } catch (Throwable th) {
                SliderState.this.setDragging(false);
                throw th;
            }
        }
    }

    public SliderState(float f2, int i2, a<ab> aVar, e<Float> eVar) {
        this.steps = i2;
        this.onValueChangeFinished = aVar;
        this.valueRange = eVar;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.shouldAutoSnap = true;
        this.tickFractions = SliderKt.stepsToTickFractions(i2);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.totalHeight$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbHeight$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.orientation = Orientation.Horizontal;
        this.isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.gestureEndAction = new a() { // from class: androidx.compose.material3.SliderState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SliderState.gestureEndAction$lambda$0(this.f$0);
            }
        };
        this.rawOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f2));
        this.pressOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f3) {
                this.this$0.dispatchRawDelta(f3);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    private final float calculateSnappedValue(float f2) {
        return SliderKt.snapValueToTick(n.g(f2, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    static final ab gestureEndAction$lambda$0(SliderState sliderState) {
        a<ab> aVar;
        if (!sliderState.isDragging() && (aVar = sliderState.onValueChangeFinished) != null) {
            aVar.invoke();
        }
        return ab.f48028a;
    }

    private final float getPressOffset() {
        return this.pressOffset$delegate.getFloatValue();
    }

    private final float getRawOffset() {
        return this.rawOffset$delegate.getFloatValue();
    }

    private final int getTotalHeight() {
        return this.totalHeight$delegate.getIntValue();
    }

    private final int getTotalWidth() {
        return this.totalWidth$delegate.getIntValue();
    }

    private final float getValueState() {
        return this.valueState$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f2, float f3, float f4) {
        return SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), f4, f2, f3);
    }

    private final float scaleToUserValue(float f2, float f3, float f4) {
        return SliderKt.scale(f2, f3, f4, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setPressOffset(float f2) {
        this.pressOffset$delegate.setFloatValue(f2);
    }

    private final void setRawOffset(float f2) {
        this.rawOffset$delegate.setFloatValue(f2);
    }

    private final void setTotalHeight(int i2) {
        this.totalHeight$delegate.setIntValue(i2);
    }

    private final void setTotalWidth(int i2) {
        this.totalWidth$delegate.setIntValue(i2);
    }

    private final void setValueState(float f2) {
        this.valueState$delegate.setFloatValue(f2);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f2) {
        float fMax;
        float fMin;
        if (this.orientation == Orientation.Vertical) {
            fMax = Math.max(getTotalHeight() - (getThumbHeight$material3() / 2.0f), 0.0f);
            fMin = Math.min(getThumbHeight$material3() / 2.0f, fMax);
        } else {
            fMax = Math.max(getTotalWidth() - (getThumbWidth$material3() / 2.0f), 0.0f);
            fMin = Math.min(getThumbWidth$material3() / 2.0f, fMax);
        }
        setRawOffset(getRawOffset() + f2 + getPressOffset());
        setPressOffset(0.0f);
        float fScaleToUserValue = scaleToUserValue(fMin, fMax, SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, fMin, fMax));
        if (fScaleToUserValue == getValue()) {
            return;
        }
        l<? super Float, ab> lVar = this.onValueChange;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(fScaleToUserValue));
        } else {
            setValue(fScaleToUserValue);
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, p<? super DragScope, ? super h.c.e<? super ab>, ? extends Object> pVar, h.c.e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(mutatePriority, pVar, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final float getCoercedValueAsFraction() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), n.g(getValue(), this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final a<ab> getGestureEndAction$material3() {
        return this.gestureEndAction;
    }

    public final l<Float, ab> getOnValueChange() {
        return this.onValueChange;
    }

    public final a<ab> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final Orientation getOrientation$material3() {
        return this.orientation;
    }

    public final boolean getReverseVerticalDirection$material3() {
        return this.reverseVerticalDirection;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final int getThumbHeight$material3() {
        return this.thumbHeight$delegate.getIntValue();
    }

    public final int getThumbWidth$material3() {
        return this.thumbWidth$delegate.getIntValue();
    }

    public final float[] getTickFractions$material3() {
        return this.tickFractions;
    }

    public final float getValue() {
        return getValueState();
    }

    public final e<Float> getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    public final boolean isRtl$material3() {
        return this.isRtl;
    }

    /* renamed from: onPress-k-4lQ0M$material3, reason: not valid java name */
    public final void m5621onPressk4lQ0M$material3(long j2) {
        float fIntBitsToFloat;
        float totalWidth;
        float fIntBitsToFloat2;
        if (this.orientation == Orientation.Vertical) {
            int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            if (this.reverseVerticalDirection) {
                totalWidth = getTotalHeight();
                fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                fIntBitsToFloat = totalWidth - fIntBitsToFloat2;
            } else {
                fIntBitsToFloat = Float.intBitsToFloat(i2);
            }
        } else {
            int i3 = (int) (j2 >> 32);
            if (this.isRtl) {
                totalWidth = getTotalWidth();
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                fIntBitsToFloat = totalWidth - fIntBitsToFloat2;
            } else {
                fIntBitsToFloat = Float.intBitsToFloat(i3);
            }
        }
        setPressOffset(fIntBitsToFloat - getRawOffset());
    }

    public final void setOnValueChange(l<? super Float, ab> lVar) {
        this.onValueChange = lVar;
    }

    public final void setOnValueChangeFinished(a<ab> aVar) {
        this.onValueChangeFinished = aVar;
    }

    public final void setOrientation$material3(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setReverseVerticalDirection$material3(boolean z) {
        this.reverseVerticalDirection = z;
    }

    public final void setRtl$material3(boolean z) {
        this.isRtl = z;
    }

    public final void setShouldAutoSnap(boolean z) {
        this.shouldAutoSnap = z;
    }

    public final void setThumbHeight$material3(int i2) {
        this.thumbHeight$delegate.setIntValue(i2);
    }

    public final void setThumbWidth$material3(int i2) {
        this.thumbWidth$delegate.setIntValue(i2);
    }

    public final void setValue(float f2) {
        if (this.shouldAutoSnap) {
            f2 = calculateSnappedValue(f2);
        }
        setValueState(f2);
    }

    public final boolean shouldAutoSnap() {
        return this.shouldAutoSnap;
    }

    public final void updateDimensions$material3(int i2, int i3) {
        setTotalWidth(i2);
        setTotalHeight(i3);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final SliderState Saver$lambda$1(a aVar, e eVar, List list) {
            Object obj = list.get(0);
            x.d(obj, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            return new SliderState(fFloatValue, ((Integer) obj2).intValue(), aVar, eVar);
        }

        public final Saver<SliderState, ?> Saver(final a<ab> aVar, final e<Float> eVar) {
            return ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.SliderState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    SliderState sliderState = (SliderState) obj2;
                    return i.i(Float.valueOf(sliderState.getValue()), Integer.valueOf(sliderState.getSteps()));
                }
            }, new l() { // from class: androidx.compose.material3.SliderState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SliderState.Companion.Saver$lambda$1(aVar, eVar, (List) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SliderState(float f2, int i2, a aVar, e eVar, int i3, o oVar) {
        eVar = (i3 & 8) != 0 ? n.b(0.0f, 1.0f) : eVar;
        int i4 = i3 & 4;
        int i5 = i3 & 2;
        int i6 = i3 & 1;
        aVar = i4 != 0 ? null : aVar;
        this(1 == i6 ? 0.0f : f2, i5 != 0 ? 0 : i2, aVar, eVar);
    }
}
