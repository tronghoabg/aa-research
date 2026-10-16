package androidx.compose.material3;

import androidx.camera.video.AudioStats;
import androidx.collection.IntList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AnalogTimePickerState implements TimePickerState, RememberObserver {
    public static final int $stable = 8;
    private Animatable<Float, AnimationVector1D> anim;
    private final MutableState currentDiameter$delegate;
    private float hourAngle;
    private float minuteAngle;
    private final MutatorMutex mutex;
    private final TimePickerState state;
    private final Ref<Boolean> userOverride;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, AnimationSpec<Float> animationSpec, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$end = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return AnalogTimePickerState.this.new AnonymousClass2(this.$end, this.$animationSpec, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super AnimationResult<Float, AnimationVector1D>> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            AnalogTimePickerState analogTimePickerState = AnalogTimePickerState.this;
            float f2 = this.$end;
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(analogTimePickerState.anim, new Float(f2), this.$animationSpec, null, null, this, 12, null);
            return objAnimateTo$default == aVar ? aVar : objAnimateTo$default;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2, reason: invalid class name and case insensitive filesystem */
    final class C03372 extends g implements l<e<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03372(float f2, AnimationSpec<Float> animationSpec, e<? super C03372> eVar) {
            super(1, eVar);
            this.$end = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return AnalogTimePickerState.this.new C03372(this.$end, this.$animationSpec, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super AnimationResult<Float, AnimationVector1D>> eVar) {
            return ((C03372) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            AnalogTimePickerState analogTimePickerState = AnalogTimePickerState.this;
            float f2 = this.$end;
            this.label = 1;
            Object objAnimateTo$default = Animatable.animateTo$default(analogTimePickerState.anim, new Float(f2), this.$animationSpec, null, null, this, 12, null);
            return objAnimateTo$default == aVar ? aVar : objAnimateTo$default;
        }
    }

    public AnalogTimePickerState(TimePickerState timePickerState, Ref<Boolean> ref) {
        this.state = timePickerState;
        this.userOverride = ref;
        this.currentDiameter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(0.0f), null, 2, null);
        this.hourAngle = ((timePickerState.getHour() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (timePickerState.getMinute() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        this.mutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float endValueForAnimation(float f2) {
        float fFloatValue = this.anim.getValue().floatValue() - f2;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.anim.getValue().floatValue() - fFloatValue;
    }

    private final boolean isUpdated() {
        if (TimePickerSelectionMode.m5901equalsimpl0(mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.hourAngle)) {
            return false;
        }
        return (TimePickerSelectionMode.m5901equalsimpl0(mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.minuteAngle)) ? false : true;
    }

    private final float normalize(float f2) {
        double d2 = f2 % 6.283185307179586d;
        if (d2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d2 += 6.283185307179586d;
        }
        return (float) d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetAngle(float f2) {
        float f3 = f2 + 1.5707964f;
        return f3 < 0.0f ? f3 + 6.2831855f : f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f2) {
        return ((int) ((f2 + 1.8325957218792777d) / 0.5235987901687622d)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f2) {
        return ((int) ((f2 + 1.6231562058117728d) / 0.10471975803375244d)) % 60;
    }

    public final Object animateToCurrent(AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        if (isUpdated()) {
            Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new AnonymousClass2(TimePickerSelectionMode.m5901equalsimpl0(mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) ? endValueForAnimation(this.hourAngle) : endValueForAnimation(this.minuteAngle), animationSpec, null), eVar);
            if (objMutate == a.f48038a) {
                return objMutate;
            }
        }
        return ab.f48028a;
    }

    public final IntList getClockFaceValues() {
        return TimePickerSelectionMode.m5901equalsimpl0(mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
    }

    public final float getCurrentAngle() {
        return this.anim.getValue().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDiameter-D9Ej5fM, reason: not valid java name */
    public final float m4330getCurrentDiameterD9Ej5fM() {
        return ((Dp) this.currentDiameter$delegate.getValue()).m11178unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.state.getHour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHourInput() {
        return this.state.getHour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.state.getMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinuteInput() {
        return this.state.getMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI, reason: not valid java name */
    public int mo4331getSelectionyecRtBI() {
        return this.state.mo4331getSelectionyecRtBI();
    }

    public final TimePickerState getState() {
        return this.state;
    }

    public final Ref<Boolean> getUserOverride() {
        return this.userOverride;
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.state.is24hour();
    }

    public final Object onGestureEnd(AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new C03372(endValueForAnimation(TimePickerSelectionMode.m5901equalsimpl0(mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) ? this.hourAngle : this.minuteAngle), animationSpec, null), eVar);
        return objMutate == a.f48038a ? objMutate : ab.f48028a;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.hourAngle = ((this.state.getHour() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (this.state.getMinute() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.Animatable$default(TimePickerSelectionMode.m5901equalsimpl0(this.state.mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI()) ? this.hourAngle : this.minuteAngle, 0.0f, 2, null);
    }

    public final Object rotateTo(float f2, AnimationSpec<Float> animationSpec, boolean z, e<? super ab> eVar) {
        this.userOverride.setValue(false);
        Object objMutate = this.mutex.mutate(MutatePriority.UserInput, new C03382(f2, z, animationSpec, null), eVar);
        return objMutate == a.f48038a ? objMutate : ab.f48028a;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z) {
        this.state.set24hour(z);
    }

    /* renamed from: setCurrentDiameter-0680j_4, reason: not valid java name */
    public final void m4332setCurrentDiameter0680j_4(float f2) {
        this.currentDiameter$delegate.setValue(Dp.m11162boximpl(f2));
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i2) {
        this.state.setHour(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHourInput(int i2) {
        this.hourAngle = ((i2 % 12) * 0.5235988f) - 1.5707964f;
        this.state.setHour(i2);
        if (TimePickerSelectionMode.m5901equalsimpl0(mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5905getHouryecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i2) {
        this.state.setMinute(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinuteInput(int i2) {
        this.minuteAngle = (i2 * 0.10471976f) - 1.5707964f;
        this.state.setMinute(i2);
        if (TimePickerSelectionMode.m5901equalsimpl0(mo4331getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.minuteAngle, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ, reason: not valid java name */
    public void mo4333setSelection6_8s6DQ(int i2) {
        this.state.mo4333setSelection6_8s6DQ(i2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.AnalogTimePickerState$rotateTo$2, reason: invalid class name and case insensitive filesystem */
    final class C03382 extends g implements l<e<? super Object>, Object> {
        final /* synthetic */ float $angle;
        final /* synthetic */ boolean $animate;
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03382(float f2, boolean z, AnimationSpec<Float> animationSpec, e<? super C03382> eVar) {
            super(1, eVar);
            this.$angle = f2;
            this.$animate = z;
            this.$animationSpec = animationSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return AnalogTimePickerState.this.new C03382(this.$angle, this.$animate, this.$animationSpec, eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(e<Object> eVar) {
            return ((C03382) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
        
            if (r1.anim.snapTo(new java.lang.Float(r1.offsetAngle(r12)), r11) == r0) goto L27;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r12)
                return r12
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L18:
                e.b.c.b(r12)
                goto La4
            L1d:
                e.b.c.b(r12)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                int r12 = r12.mo4331getSelectionyecRtBI()
                androidx.compose.material3.TimePickerSelectionMode$Companion r1 = androidx.compose.material3.TimePickerSelectionMode.Companion
                int r1 = r1.m5905getHouryecRtBI()
                boolean r12 = androidx.compose.material3.TimePickerSelectionMode.m5901equalsimpl0(r12, r1)
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                if (r12 == 0) goto L64
                float r12 = r11.$angle
                int r12 = androidx.compose.material3.AnalogTimePickerState.access$toHour(r1, r12)
                r4 = 12
                int r12 = r12 % r4
                float r12 = (float) r12
                r5 = 1057360530(0x3f060a92, float:0.5235988)
                float r12 = r12 * r5
                androidx.compose.material3.AnalogTimePickerState.access$setHourAngle$p(r1, r12)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.material3.TimePickerState r1 = r12.getState()
                float r5 = androidx.compose.material3.AnalogTimePickerState.access$getHourAngle$p(r12)
                int r12 = androidx.compose.material3.AnalogTimePickerState.access$toHour(r12, r5)
                int r12 = r12 % r4
                androidx.compose.material3.AnalogTimePickerState r5 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.material3.TimePickerState r5 = (androidx.compose.material3.TimePickerState) r5
                boolean r5 = androidx.compose.material3.TimePickerKt.isPm(r5)
                if (r3 == r5) goto L5f
                r4 = 0
            L5f:
                int r12 = r12 + r4
                r1.setHourInput(r12)
                goto L83
            L64:
                float r12 = r11.$angle
                int r12 = androidx.compose.material3.AnalogTimePickerState.access$toMinute(r1, r12)
                float r12 = (float) r12
                r4 = 1037465424(0x3dd67750, float:0.10471976)
                float r12 = r12 * r4
                androidx.compose.material3.AnalogTimePickerState.access$setMinuteAngle$p(r1, r12)
                androidx.compose.material3.AnalogTimePickerState r12 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.material3.TimePickerState r1 = r12.getState()
                float r4 = androidx.compose.material3.AnalogTimePickerState.access$getMinuteAngle$p(r12)
                int r12 = androidx.compose.material3.AnalogTimePickerState.access$toMinute(r12, r4)
                r1.setMinuteInput(r12)
            L83:
                boolean r12 = r11.$animate
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                if (r12 != 0) goto La7
                float r12 = r11.$angle
                androidx.compose.animation.core.Animatable r2 = androidx.compose.material3.AnalogTimePickerState.access$getAnim$p(r1)
                float r12 = androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r1, r12)
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r12)
                r12 = r11
                h.c.e r12 = (h.c.e) r12
                r11.label = r3
                java.lang.Object r11 = r2.snapTo(r1, r12)
                if (r11 != r0) goto La4
                goto Lce
            La4:
                h.ab r11 = h.ab.f48028a
                return r11
            La7:
                float r12 = r11.$angle
                float r12 = androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r1, r12)
                float r12 = androidx.compose.material3.AnalogTimePickerState.access$endValueForAnimation(r1, r12)
                androidx.compose.material3.AnalogTimePickerState r1 = androidx.compose.material3.AnalogTimePickerState.this
                androidx.compose.animation.core.Animatable r3 = androidx.compose.material3.AnalogTimePickerState.access$getAnim$p(r1)
                java.lang.Float r4 = new java.lang.Float
                r4.<init>(r12)
                androidx.compose.animation.core.AnimationSpec<java.lang.Float> r5 = r11.$animationSpec
                r8 = r11
                h.c.e r8 = (h.c.e) r8
                r11.label = r2
                r9 = 12
                r10 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r11 != r0) goto Lcf
            Lce:
                return r0
            Lcf:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnalogTimePickerState.C03382.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(e<? super Object> eVar) {
            return invoke2((e<Object>) eVar);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
    }

    public /* synthetic */ AnalogTimePickerState(TimePickerState timePickerState, Ref ref, int i2, o oVar) {
        this(timePickerState, (i2 & 2) != 0 ? new Ref() : ref);
    }
}
