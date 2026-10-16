package androidx.compose.material3;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.e;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RangeSliderState {
    private final MutableFloatState activeRangeEndState$delegate;
    private final MutableFloatState activeRangeStartState$delegate;
    private final float coercedEnd;
    private final float coercedStart;
    private final MutableFloatState endThumbHeight$delegate;
    private final MutableFloatState endThumbWidth$delegate;
    private final l<Boolean, ab> gestureEndAction;
    private final MutableState isDragging$delegate;
    private final MutableState isRtl$delegate;
    private final MutableFloatState maxPx$delegate;
    private final MutableFloatState minPx$delegate;
    private l<? super SliderRange, ab> onValueChange;
    private a<ab> onValueChangeFinished;
    private final MutableFloatState rawOffsetEnd$delegate;
    private final MutableFloatState rawOffsetStart$delegate;
    private final MutableFloatState startThumbHeight$delegate;
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final e<Float> valueRange;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public RangeSliderState(float f2, float f3, int i2, a<ab> aVar, e<Float> eVar) {
        this.steps = i2;
        this.onValueChangeFinished = aVar;
        this.valueRange = eVar;
        float fFloatValue = ((Number) n.q(Float.valueOf(f2), eVar)).floatValue();
        this.coercedStart = fFloatValue;
        float fFloatValue2 = ((Number) n.q(Float.valueOf(f3), eVar)).floatValue();
        this.coercedEnd = fFloatValue2;
        this.activeRangeStartState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Math.min(fFloatValue, fFloatValue2));
        this.activeRangeEndState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Math.max(fFloatValue, fFloatValue2));
        this.tickFractions = SliderKt.stepsToTickFractions(i2);
        this.startThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.startThumbHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isRtl$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.gestureEndAction = new l() { // from class: androidx.compose.material3.RangeSliderState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RangeSliderState.gestureEndAction$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        };
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    static final ab gestureEndAction$lambda$0(RangeSliderState rangeSliderState, boolean z) {
        a<ab> aVar = rangeSliderState.onValueChangeFinished;
        if (aVar != null) {
            aVar.invoke();
        }
        return ab.f48028a;
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState$delegate.getFloatValue();
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState$delegate.getFloatValue();
    }

    private final float getMaxPx() {
        return this.maxPx$delegate.getFloatValue();
    }

    private final float getMinPx() {
        return this.minPx$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f2, float f3, float f4) {
        return SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), f4, f2, f3);
    }

    /* renamed from: scaleToUserValue-8bqG3aw, reason: not valid java name */
    private final long m5401scaleToUserValue8bqG3aw(boolean z, float f2, float f3, long j2) {
        return SliderKt.m5606scale2geJ7wY(z, f2, f3, j2, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final void setActiveRangeEndState(float f2) {
        this.activeRangeEndState$delegate.setFloatValue(f2);
    }

    private final void setActiveRangeStartState(float f2) {
        this.activeRangeStartState$delegate.setFloatValue(f2);
    }

    private final void setMaxPx(float f2) {
        this.maxPx$delegate.setFloatValue(f2);
    }

    private final void setMinPx(float f2) {
        this.minPx$delegate.setFloatValue(f2);
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final float getCoercedActiveRangeEndAsFraction$material3() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeEnd());
    }

    public final float getCoercedActiveRangeStartAsFraction$material3() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeStart());
    }

    public final int getEndSteps$material3() {
        return (int) Math.floor(this.steps * (1.0f - getCoercedActiveRangeStartAsFraction$material3()));
    }

    public final float getEndThumbHeight$material3() {
        return this.endThumbHeight$delegate.getFloatValue();
    }

    public final float getEndThumbWidth$material3() {
        return this.endThumbWidth$delegate.getFloatValue();
    }

    public final l<Boolean, ab> getGestureEndAction$material3() {
        return this.gestureEndAction;
    }

    public final l<SliderRange, ab> getOnValueChange$material3() {
        return this.onValueChange;
    }

    public final a<ab> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final float getRawOffsetEnd$material3() {
        return this.rawOffsetEnd$delegate.getFloatValue();
    }

    public final float getRawOffsetStart$material3() {
        return this.rawOffsetStart$delegate.getFloatValue();
    }

    public final int getStartSteps$material3() {
        return (int) Math.floor(this.steps * getCoercedActiveRangeEndAsFraction$material3());
    }

    public final float getStartThumbHeight$material3() {
        return this.startThumbHeight$delegate.getFloatValue();
    }

    public final float getStartThumbWidth$material3() {
        return this.startThumbWidth$delegate.getFloatValue();
    }

    public final int getSteps() {
        return this.steps;
    }

    public final float[] getTickFractions$material3() {
        return this.tickFractions;
    }

    public final int getTotalWidth$material3() {
        return this.totalWidth$delegate.getIntValue();
    }

    public final e<Float> getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3() {
        return ((Boolean) this.isRtl$delegate.getValue()).booleanValue();
    }

    public final void onDrag$material3(boolean z, float f2) {
        long jSliderRange;
        if (z) {
            setRawOffsetStart$material3(getRawOffsetStart$material3() + f2);
            setRawOffsetEnd$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3 = getRawOffsetEnd$material3();
            jSliderRange = SliderKt.SliderRange(n.f(SliderKt.snapValueToTick(n.g(getRawOffsetStart$material3(), getMinPx(), rawOffsetEnd$material3), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetEnd$material3), rawOffsetEnd$material3);
        } else {
            setRawOffsetEnd$material3(getRawOffsetEnd$material3() + f2);
            setRawOffsetStart$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3 = getRawOffsetStart$material3();
            jSliderRange = SliderKt.SliderRange(rawOffsetStart$material3, n.e(SliderKt.snapValueToTick(n.g(getRawOffsetEnd$material3(), rawOffsetStart$material3, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetStart$material3));
        }
        long jM5401scaleToUserValue8bqG3aw = m5401scaleToUserValue8bqG3aw(z, getMinPx(), getMaxPx(), jSliderRange);
        if (SliderRange.m5613equalsimpl0(jM5401scaleToUserValue8bqG3aw, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        l<? super SliderRange, ab> lVar = this.onValueChange;
        if (lVar != null) {
            lVar.invoke(SliderRange.m5610boximpl(jM5401scaleToUserValue8bqG3aw));
        } else {
            setActiveRangeStart(SliderRange.m5615getStartimpl(jM5401scaleToUserValue8bqG3aw));
            setActiveRangeEnd(SliderRange.m5614getEndInclusiveimpl(jM5401scaleToUserValue8bqG3aw));
        }
    }

    public final void setActiveRangeEnd(float f2) {
        setActiveRangeEndState(SliderKt.snapValueToTick(n.g(f2, getActiveRangeStart(), this.valueRange.getEndInclusive().floatValue()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final void setActiveRangeStart(float f2) {
        setActiveRangeStartState(SliderKt.snapValueToTick(n.g(f2, this.valueRange.getStart().floatValue(), getActiveRangeEnd()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final void setDragging$material3(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setEndThumbHeight$material3(float f2) {
        this.endThumbHeight$delegate.setFloatValue(f2);
    }

    public final void setEndThumbWidth$material3(float f2) {
        this.endThumbWidth$delegate.setFloatValue(f2);
    }

    public final void setOnValueChange$material3(l<? super SliderRange, ab> lVar) {
        this.onValueChange = lVar;
    }

    public final void setOnValueChangeFinished(a<ab> aVar) {
        this.onValueChangeFinished = aVar;
    }

    public final void setRawOffsetEnd$material3(float f2) {
        this.rawOffsetEnd$delegate.setFloatValue(f2);
    }

    public final void setRawOffsetStart$material3(float f2) {
        this.rawOffsetStart$delegate.setFloatValue(f2);
    }

    public final void setRtl$material3(boolean z) {
        this.isRtl$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setStartThumbHeight$material3(float f2) {
        this.startThumbHeight$delegate.setFloatValue(f2);
    }

    public final void setStartThumbWidth$material3(float f2) {
        this.startThumbWidth$delegate.setFloatValue(f2);
    }

    public final void setTotalWidth$material3(int i2) {
        this.totalWidth$delegate.setIntValue(i2);
    }

    public final void updateMinMaxPx$material3() {
        float fMax = Math.max(getTotalWidth$material3() - (getEndThumbWidth$material3() / 2.0f), 0.0f);
        float fMin = Math.min(getStartThumbWidth$material3() / 2.0f, fMax);
        if (isDragging$material3()) {
            return;
        }
        if (getMinPx() == fMin && getMaxPx() == fMax && getActiveRangeStart() == getActiveRangeEnd()) {
            return;
        }
        setMinPx(fMin);
        setMaxPx(fMax);
        setRawOffsetStart$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final RangeSliderState Saver$lambda$1(a aVar, e eVar, List list) {
            Object obj = list.get(0);
            x.d(obj, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            x.d(obj2, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue2 = ((Float) obj2).floatValue();
            Object obj3 = list.get(2);
            x.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new RangeSliderState(fFloatValue, fFloatValue2, ((Integer) obj3).intValue(), aVar, eVar);
        }

        public final Saver<RangeSliderState, ?> Saver(final a<ab> aVar, final e<Float> eVar) {
            return ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.RangeSliderState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    RangeSliderState rangeSliderState = (RangeSliderState) obj2;
                    return i.i(Float.valueOf(rangeSliderState.getActiveRangeStart()), Float.valueOf(rangeSliderState.getActiveRangeEnd()), Integer.valueOf(rangeSliderState.getSteps()));
                }
            }, new l() { // from class: androidx.compose.material3.RangeSliderState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RangeSliderState.Companion.Saver$lambda$1(aVar, eVar, (List) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RangeSliderState(float f2, float f3, int i2, a aVar, e eVar, int i3, o oVar) {
        e eVarB = (i3 & 16) != 0 ? n.b(0.0f, 1.0f) : eVar;
        int i4 = i3 & 8;
        int i5 = i3 & 4;
        int i6 = i3 & 2;
        int i7 = i3 & 1;
        a aVar2 = i4 != 0 ? null : aVar;
        int i8 = i5 != 0 ? 0 : i2;
        this(1 == i7 ? 0.0f : f2, i6 != 0 ? 1.0f : f3, i8, aVar2, eVarB);
    }
}
