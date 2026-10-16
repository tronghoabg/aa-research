package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetector_androidKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    private final MutableLongObjectMap<DoubleKeyClickState> doubleKeyClickStates;
    private PointerInputChange downEvent;
    private long firstTapUpTime;
    private boolean hapticFeedbackEnabled;
    private boolean ignoreNextUp;
    private IndirectPointerInputChange indirectDownEvent;
    private long indirectFirstTapUpTime;
    private boolean indirectIgnoreNextUp;
    private boolean indirectIsSecondTap;
    private br indirectLongPressJob;
    private boolean indirectLongPressTriggered;
    private br indirectTapJob;
    private boolean isSecondTap;
    private final MutableLongObjectMap<br> longKeyPressJobs;
    private br longPressJob;
    private boolean longPressTriggered;
    private a<ab> onDoubleClick;
    private a<ab> onLongClick;
    private String onLongClickLabel;
    private br tapJob;

    /* compiled from: WazeSource */
    public final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;
        private final br job;

        public DoubleKeyClickState(br brVar) {
            this.job = brVar;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        public final br getJob() {
            return this.job;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z) {
            this.doubleTapMinTimeMillisElapsed = z;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$handleDownEvent$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CombinedClickableNode.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalViewConfiguration())).getLongPressTimeoutMillis(), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            a aVar2 = CombinedClickableNode.this.onLongClick;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            if (CombinedClickableNode.this.getHapticFeedbackEnabled()) {
                ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalHapticFeedback())).mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9047getLongPress5zf0vsI());
            }
            CombinedClickableNode.this.longPressTriggered = true;
            br brVar = CombinedClickableNode.this.tapJob;
            if (brVar != null) {
                brVar.s(null);
            }
            CombinedClickableNode.this.tapJob = null;
            CombinedClickableNode.this.longPressJob = null;
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$handleDownEvent$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CombinedClickableNode.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalViewConfiguration())).getLongPressTimeoutMillis(), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            a aVar2 = CombinedClickableNode.this.onLongClick;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            if (CombinedClickableNode.this.getHapticFeedbackEnabled()) {
                ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalHapticFeedback())).mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9047getLongPress5zf0vsI());
            }
            CombinedClickableNode.this.indirectLongPressTriggered = true;
            br brVar = CombinedClickableNode.this.indirectTapJob;
            if (brVar != null) {
                brVar.s(null);
            }
            CombinedClickableNode.this.indirectTapJob = null;
            CombinedClickableNode.this.indirectLongPressJob = null;
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$handleUpEvent$1, reason: invalid class name and case insensitive filesystem */
    final class C02201 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C02201(e<? super C02201> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CombinedClickableNode.this.new C02201(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02201) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalViewConfiguration())).getDoubleTapTimeoutMillis(), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            CombinedClickableNode.this.getOnClick().invoke();
            CombinedClickableNode.this.tapJob = null;
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$handleUpEvent$2, reason: invalid class name and case insensitive filesystem */
    final class C02212 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C02212(e<? super C02212> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CombinedClickableNode.this.new C02212(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02212) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalViewConfiguration())).getDoubleTapTimeoutMillis(), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            CombinedClickableNode.this.getOnClick().invoke();
            CombinedClickableNode.this.indirectTapJob = null;
            return ab.f48028a;
        }
    }

    private CombinedClickableNode(a<ab> aVar, String str, a<ab> aVar2, a<ab> aVar3, boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, str2, role, aVar, null);
        this.onLongClickLabel = str;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
        this.hapticFeedbackEnabled = z;
        this.longKeyPressJobs = LongObjectMapKt.mutableLongObjectMapOf();
        this.doubleKeyClickStates = LongObjectMapKt.mutableLongObjectMapOf();
        this.firstTapUpTime = -1L;
        this.indirectFirstTapUpTime = -1L;
    }

    static final boolean applyAdditionalSemantics$lambda$0(CombinedClickableNode combinedClickableNode) {
        a<ab> aVar = combinedClickableNode.onLongClick;
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    private final void cancelInput(boolean z) {
        if (z) {
            this.indirectDownEvent = null;
            br brVar = this.indirectLongPressJob;
            if (brVar != null) {
                brVar.s(null);
            }
            this.indirectLongPressJob = null;
            br brVar2 = this.indirectTapJob;
            if (brVar2 != null) {
                brVar2.s(null);
            }
            this.indirectTapJob = null;
            this.indirectIsSecondTap = false;
            this.indirectLongPressTriggered = false;
            this.indirectFirstTapUpTime = -1L;
            this.indirectIgnoreNextUp = false;
        } else {
            this.downEvent = null;
            br brVar3 = this.longPressJob;
            if (brVar3 != null) {
                brVar3.s(null);
            }
            this.longPressJob = null;
            br brVar4 = this.tapJob;
            if (brVar4 != null) {
                brVar4.s(null);
            }
            this.tapJob = null;
            this.isSecondTap = false;
            this.longPressTriggered = false;
            this.firstTapUpTime = -1L;
            this.ignoreNextUp = false;
        }
        handlePressInteractionCancel(z);
    }

    private final void checkForCancellation(IndirectPointerEvent indirectPointerEvent) {
        if (this.indirectDownEvent == null || this.indirectLongPressTriggered) {
            return;
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            IndirectPointerInputChange indirectPointerInputChange = changes.get(i2);
            if (indirectPointerInputChange.isConsumed() && !x.n(indirectPointerInputChange, this.indirectDownEvent)) {
                cancelInput(true);
                return;
            }
        }
    }

    private final void handleDeepPress() {
        if (this.longPressTriggered || !getEnabled() || this.onLongClick == null) {
            return;
        }
        br brVar = this.longPressJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.longPressJob = null;
        a<ab> aVar = this.onLongClick;
        if (aVar != null) {
            aVar.invoke();
        }
        if (this.hapticFeedbackEnabled) {
            ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalHapticFeedback())).mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9047getLongPress5zf0vsI());
        }
        this.longPressTriggered = true;
    }

    private final void handleDownEvent(IndirectPointerInputChange indirectPointerInputChange) {
        indirectPointerInputChange.consume();
        this.indirectDownEvent = indirectPointerInputChange;
        if (getEnabled()) {
            br brVar = this.indirectTapJob;
            if (brVar != null && brVar.bZ()) {
                if (indirectPointerInputChange.getUptimeMillis() - this.indirectFirstTapUpTime < ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getDoubleTapMinTimeMillis()) {
                    this.indirectIgnoreNextUp = true;
                    return;
                }
                this.indirectIsSecondTap = true;
                br brVar2 = this.indirectTapJob;
                if (brVar2 != null) {
                    brVar2.s(null);
                }
                this.indirectTapJob = null;
            }
            this.indirectLongPressTriggered = false;
            handlePressInteractionStart(indirectPointerInputChange);
            if (this.onLongClick != null) {
                this.indirectLongPressJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass2(null), 3);
            }
        }
    }

    private final void handleNonUpEventIfNeeded(IndirectPointerEvent indirectPointerEvent) {
        float touchSlop = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop();
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            IndirectPointerInputChange indirectPointerInputChange = changes.get(i2);
            long jM9108getPositionF1C5BW0 = indirectPointerInputChange.m9108getPositionF1C5BW0();
            IndirectPointerInputChange indirectPointerInputChange2 = this.indirectDownEvent;
            if (indirectPointerInputChange2 == null) {
                x.g();
            }
            float fAbs = Math.abs(Offset.m7978getDistanceimpl(Offset.m7984minusMKHz9U(jM9108getPositionF1C5BW0, indirectPointerInputChange2.m9108getPositionF1C5BW0())));
            if (indirectPointerInputChange.isConsumed() || fAbs > touchSlop) {
                cancelInput(true);
                return;
            }
        }
    }

    /* renamed from: handleNonUpEventIfNeeded-O0kMr_c, reason: not valid java name */
    private final void m2023handleNonUpEventIfNeededO0kMr_c(PointerEvent pointerEvent, long j2) {
        long jM1933getExtendedTouchPaddinghWWAJMo = m1933getExtendedTouchPaddinghWWAJMo(j2);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.isConsumed() || PointerEventKt.m9544isOutOfBoundsjwHxaWs(pointerInputChange, j2, jM1933getExtendedTouchPaddinghWWAJMo)) {
                cancelInput(false);
                return;
            }
        }
    }

    private final void handleUpEvent(long j2, IndirectPointerInputChange indirectPointerInputChange) {
        if (getEnabled() && !this.indirectIgnoreNextUp) {
            m1936handlePressInteractionRelease3MmeM6k(indirectPointerInputChange.m9108getPositionF1C5BW0(), true);
            this.indirectFirstTapUpTime = j2;
            if (!this.indirectLongPressTriggered) {
                boolean z = this.indirectIsSecondTap;
                a<ab> aVar = this.onDoubleClick;
                if (z) {
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else if (aVar != null) {
                    this.indirectTapJob = aj.z(getCoroutineScope(), null, null, new C02212(null), 3);
                } else {
                    getOnClick().invoke();
                }
            }
        }
        this.indirectDownEvent = null;
        this.indirectIgnoreNextUp = false;
        this.indirectIsSecondTap = false;
        br brVar = this.indirectLongPressJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.indirectLongPressJob = null;
        this.indirectLongPressTriggered = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void resetKeyPressState() {
        /*
            r21 = this;
            r0 = r21
            androidx.collection.MutableLongObjectMap<kotlinx.coroutines.br> r1 = r0.longKeyPressJobs
            r2 = r1
            androidx.collection.LongObjectMap r2 = (androidx.collection.LongObjectMap) r2
            java.lang.Object[] r3 = r2.values
            long[] r2 = r2.metadata
            int r4 = r2.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 0
            r13 = 8
            if (r4 < 0) goto L4e
            r14 = r12
            r15 = 128(0x80, double:6.3E-322)
        L1c:
            r5 = r2[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L49
            int r7 = r14 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L30:
            if (r8 >= r7) goto L47
            long r19 = r5 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto L43
            int r19 = r14 << 3
            int r19 = r19 + r8
            r19 = r3[r19]
            kotlinx.coroutines.br r19 = (kotlinx.coroutines.br) r19
            h.g.b.o.o(r19)
        L43:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L30
        L47:
            if (r7 != r13) goto L52
        L49:
            if (r14 == r4) goto L52
            int r14 = r14 + 1
            goto L1c
        L4e:
            r15 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L52:
            r1.clear()
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState> r0 = r0.doubleKeyClickStates
            r1 = r0
            androidx.collection.LongObjectMap r1 = (androidx.collection.LongObjectMap) r1
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L97
            r4 = r12
        L64:
            r5 = r1[r4]
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L92
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L76:
            if (r8 >= r7) goto L90
            long r19 = r5 & r17
            int r14 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r14 >= 0) goto L8c
            int r14 = r4 << 3
            int r14 = r14 + r8
            r14 = r2[r14]
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r14 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r14
            kotlinx.coroutines.br r14 = r14.getJob()
            h.g.b.o.o(r14)
        L8c:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L76
        L90:
            if (r7 != r13) goto L97
        L92:
            if (r4 == r3) goto L97
            int r4 = r4 + 1
            goto L64
        L97:
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode.resetKeyPressState():void");
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new a() { // from class: androidx.compose.foundation.CombinedClickableNode$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    CombinedClickableNode.applyAdditionalSemantics$lambda$0(this.f$0);
                    return true;
                }
            });
        }
    }

    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        cancelInput(true);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    protected void onCancelKeyInput() {
        resetKeyPressState();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        super.onCancelPointerInput();
        cancelInput(false);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    protected boolean mo1937onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
        boolean z = false;
        if (this.onLongClick != null && this.longKeyPressJobs.get(jM9435getKeyZmokQxo) == null) {
            this.longKeyPressJobs.set(jM9435getKeyZmokQxo, aj.z(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3));
            z = true;
        }
        DoubleKeyClickState doubleKeyClickState = this.doubleKeyClickStates.get(jM9435getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().bZ()) {
                doubleKeyClickState.getJob().s(null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.remove(jM9435getKeyZmokQxo);
                    return z;
                }
            } else {
                this.doubleKeyClickStates.remove(jM9435getKeyZmokQxo);
            }
        }
        return z;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    protected boolean mo1938onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        a<ab> aVar;
        MutableLongObjectMap<br> mutableLongObjectMap = this.longKeyPressJobs;
        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
        boolean z = false;
        if (mutableLongObjectMap.get(jM9435getKeyZmokQxo) != null) {
            br brVar = this.longKeyPressJobs.get(jM9435getKeyZmokQxo);
            if (brVar != null) {
                if (brVar.bZ()) {
                    brVar.s(null);
                } else {
                    z = true;
                }
            }
            this.longKeyPressJobs.remove(jM9435getKeyZmokQxo);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.get(jM9435getKeyZmokQxo) != null) {
                if (!z && (aVar = this.onDoubleClick) != null) {
                    aVar.invoke();
                }
                this.doubleKeyClickStates.remove(jM9435getKeyZmokQxo);
            } else if (!z) {
                this.doubleKeyClickStates.set(jM9435getKeyZmokQxo, new DoubleKeyClickState(aj.z(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, jM9435getKeyZmokQxo, null), 3)));
            }
        } else if (!z) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        super.onIndirectPointerEvent(indirectPointerEvent, pointerEventPass);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass == PointerEventPass.Final) {
                checkForCancellation(indirectPointerEvent);
                return;
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(changes.get(i2))) {
                    handleDownEvent(indirectPointerEvent.getChanges().get(0));
                    return;
                }
            }
            return;
        }
        if (!this.indirectLongPressTriggered) {
            List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
            int size2 = changes2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!ClickableKt.changedToUp(changes2.get(i3))) {
                    handleNonUpEventIfNeeded(indirectPointerEvent);
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange = indirectPointerEvent.getChanges().get(0);
            indirectPointerInputChange.consume();
            long uptimeMillis = indirectPointerInputChange.getUptimeMillis();
            IndirectPointerInputChange indirectPointerInputChange2 = this.indirectDownEvent;
            if (indirectPointerInputChange2 == null) {
                x.g();
            }
            handleUpEvent(uptimeMillis, indirectPointerInputChange2);
            return;
        }
        List<IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
        int size3 = changes3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            if (!ClickableKt.changedToUpIgnoreConsumed(changes3.get(i4))) {
                List<IndirectPointerInputChange> changes4 = indirectPointerEvent.getChanges();
                int size4 = changes4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    changes4.get(i5).consume();
                }
                return;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange3 = indirectPointerEvent.getChanges().get(0);
        indirectPointerInputChange3.consume();
        long uptimeMillis2 = indirectPointerInputChange3.getUptimeMillis();
        IndirectPointerInputChange indirectPointerInputChange4 = this.indirectDownEvent;
        if (indirectPointerInputChange4 == null) {
            x.g();
        }
        handleUpEvent(uptimeMillis2, indirectPointerInputChange4);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        super.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass == PointerEventPass.Final) {
                checkForCancellation(pointerEvent);
                return;
            }
            return;
        }
        if (this.downEvent == null) {
            if (TapGestureDetectorKt.isChangedToDown$default(pointerEvent, true, false, 2, null)) {
                handleDownEvent(pointerEvent.getChanges().get(0));
                return;
            }
            return;
        }
        if (TapGestureDetector_androidKt.isDeepPress(pointerEvent)) {
            handleDeepPress();
        }
        if (!this.longPressTriggered) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!PointerEventKt.changedToUp(changes.get(i2))) {
                    m2023handleNonUpEventIfNeededO0kMr_c(pointerEvent, j2);
                    return;
                }
            }
            PointerInputChange pointerInputChange = pointerEvent.getChanges().get(0);
            pointerInputChange.consume();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            PointerInputChange pointerInputChange2 = this.downEvent;
            if (pointerInputChange2 == null) {
                x.g();
            }
            handleUpEvent(uptimeMillis, pointerInputChange2);
            return;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (!PointerEventKt.changedToUpIgnoreConsumed(changes2.get(i3))) {
                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    changes3.get(i4).consume();
                }
                return;
            }
        }
        PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
        pointerInputChange3.consume();
        long uptimeMillis2 = pointerInputChange3.getUptimeMillis();
        PointerInputChange pointerInputChange4 = this.downEvent;
        if (pointerInputChange4 == null) {
            x.g();
        }
        handleUpEvent(uptimeMillis2, pointerInputChange4);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        resetKeyPressState();
    }

    public final void setHapticFeedbackEnabled(boolean z) {
        this.hapticFeedbackEnabled = z;
    }

    /* renamed from: update-2tQrsxU, reason: not valid java name */
    public final void m2024update2tQrsxU(a<ab> aVar, String str, a<ab> aVar2, a<ab> aVar3, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str2, Role role) {
        boolean z3;
        if (!x.n(this.onLongClickLabel, str)) {
            this.onLongClickLabel = str;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.onLongClick == null) != (aVar2 == null)) {
            disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            z3 = true;
        } else {
            z3 = false;
        }
        this.onLongClick = aVar2;
        boolean z4 = !((this.onDoubleClick == null) == (aVar3 == null));
        this.onDoubleClick = aVar3;
        boolean z5 = getEnabled() == z2;
        m1943updateCommonO2vRcR0(mutableInteractionSource, indicationNodeFactory, z, z2, str2, role, aVar);
        if ((z4 | z3) || (!z5)) {
            cancelInput(false);
            cancelInput(true);
        }
    }

    public /* synthetic */ CombinedClickableNode(a aVar, String str, a aVar2, a aVar3, boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, String str2, Role role, o oVar) {
        this(aVar, str, aVar2, aVar3, z, mutableInteractionSource, indicationNodeFactory, z2, z3, str2, role);
    }

    private final void checkForCancellation(PointerEvent pointerEvent) {
        if (this.downEvent == null || this.longPressTriggered) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.isConsumed() && !x.n(pointerInputChange, this.downEvent)) {
                cancelInput(false);
                return;
            }
        }
    }

    private final void handleUpEvent(long j2, PointerInputChange pointerInputChange) {
        if (getEnabled() && !this.ignoreNextUp) {
            m1936handlePressInteractionRelease3MmeM6k(pointerInputChange.m9608getPositionF1C5BW0(), false);
            this.firstTapUpTime = j2;
            if (!this.longPressTriggered) {
                boolean z = this.isSecondTap;
                a<ab> aVar = this.onDoubleClick;
                if (z) {
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else if (aVar != null) {
                    this.tapJob = aj.z(getCoroutineScope(), null, null, new C02201(null), 3);
                } else {
                    getOnClick().invoke();
                }
            }
        }
        this.downEvent = null;
        this.ignoreNextUp = false;
        this.isSecondTap = false;
        br brVar = this.longPressJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.longPressJob = null;
        this.longPressTriggered = false;
    }

    private final void handleDownEvent(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
        this.downEvent = pointerInputChange;
        if (getEnabled()) {
            br brVar = this.tapJob;
            if (brVar != null && brVar.bZ()) {
                if (pointerInputChange.getUptimeMillis() - this.firstTapUpTime < ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getDoubleTapMinTimeMillis()) {
                    this.ignoreNextUp = true;
                    return;
                }
                this.isSecondTap = true;
                br brVar2 = this.tapJob;
                if (brVar2 != null) {
                    brVar2.s(null);
                }
                this.tapJob = null;
            }
            this.longPressTriggered = false;
            handlePressInteractionStart(pointerInputChange);
            if (this.onLongClick != null) {
                this.longPressJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
            }
        }
    }
}
