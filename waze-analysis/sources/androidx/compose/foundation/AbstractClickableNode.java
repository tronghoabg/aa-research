package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, IndirectPointerInputModifierNode, GestureConnection {
    public static final int $stable = 8;
    private long centerOffset;
    private final MutableLongObjectMap<PressInteraction.Press> currentKeyPressInteractions;
    private br delayJob;
    private boolean enabled;
    private final FocusableNode focusableNode;
    private DelegatableNode gestureNode;
    private String gestureState;
    private HoverInteraction.Enter hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private Offset indirectPointerEventPressPosition;
    private PressInteraction.Press indirectPointerPressInteraction;
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;
    private IndicationNodeFactory localIndicationNodeFactory;
    private a<ab> onClick;
    private String onClickLabel;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;
    private boolean useLocalIndication;
    private MutableInteractionSource userProvidedInteractionSource;

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, a<ab> aVar) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z2;
        this.onClick = aVar;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.Companion.m7916getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        this.gestureState = GestureState.Companion.m2033getIdle7meUWtM();
        this.currentKeyPressInteractions = LongObjectMapKt.mutableLongObjectMapOf();
        this.centerOffset = Offset.Companion.m7996getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
    }

    static final boolean applySemantics$lambda$0(AbstractClickableNode abstractClickableNode) {
        abstractClickableNode.onClick.invoke();
        return true;
    }

    private final boolean delayPressInteraction() {
        return ClickableKt.hasWaitingParent(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3);
            }
            this.hoverInteraction = enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3);
            }
            this.hoverInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab handlePressInteractionCancel$lambda$0$0$0(MutableInteractionSource mutableInteractionSource, PressInteraction.Cancel cancel, Throwable th) {
        mutableInteractionSource.tryEmit(cancel);
        return ab.f48028a;
    }

    private final void initializeGestureCoordination() {
        if (this.gestureNode == null) {
            DelegatableNode delegatableNodeGestureNode = GestureNodeKt.gestureNode(this);
            delegate(delegatableNodeGestureNode);
            this.gestureNode = delegatableNodeGestureNode;
        }
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        if (this.indicationNode != null) {
            return;
        }
        IndicationNodeFactory indicationNodeFactory = this.useLocalIndication ? this.localIndicationNodeFactory : this.indicationNodeFactory;
        if (indicationNodeFactory != null) {
            MutableInteractionSource MutableInteractionSource = this.interactionSource;
            if (MutableInteractionSource == null) {
                MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                this.interactionSource = MutableInteractionSource;
            }
            this.focusableNode.update(MutableInteractionSource);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource == null) {
                x.g();
            }
            DelegatableNode delegatableNodeCreate = indicationNodeFactory.create(mutableInteractionSource);
            delegate(delegatableNodeCreate);
            this.indicationNode = delegatableNodeCreate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            if (r19 == 0) goto L8
            r0.initializeIndicationAndInteractionSourceIfNeeded()
            return
        L8:
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r0.interactionSource
            r2 = 0
            if (r1 == 0) goto L74
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r0.currentKeyPressInteractions
            androidx.collection.LongObjectMap r1 = (androidx.collection.LongObjectMap) r1
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            r5 = 3
            if (r4 < 0) goto L62
            r6 = 0
            r7 = r6
        L1d:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d
            int r10 = r7 - r4
            r11 = r6
        L30:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            androidx.compose.foundation.interaction.PressInteraction$Press r12 = (androidx.compose.foundation.interaction.PressInteraction.Press) r12
            kotlinx.coroutines.af r14 = r0.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1 r15 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1
            r15.<init>(r0, r12, r2)
            h.g.a.p r15 = (h.g.a.p) r15
            kotlinx.coroutines.aj.z(r14, r2, r2, r15, r5)
        L57:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L30
        L5b:
            if (r12 != r13) goto L62
        L5d:
            if (r7 == r4) goto L62
            int r7 = r7 + 1
            goto L1d
        L62:
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r0.indirectPointerPressInteraction
            if (r1 == 0) goto L74
            kotlinx.coroutines.af r3 = r0.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1 r4 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1
            r4.<init>(r0, r1, r2)
            h.g.a.p r4 = (h.g.a.p) r4
            kotlinx.coroutines.aj.z(r3, r2, r2, r4, r5)
        L74:
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r0.currentKeyPressInteractions
            r1.clear()
            r0.indirectPointerPressInteraction = r2
            r0.onCancelKeyInput()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.onFocusChange(boolean):void");
    }

    static final ab onObservedReadsChanged$lambda$0(AbstractClickableNode abstractClickableNode) {
        Indication indication = (Indication) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractClickableNode, IndicationKt.getLocalIndication());
        if (!(indication instanceof IndicationNodeFactory)) {
            InlineClassHelperKt.throwIllegalArgumentException(ClickableKt.unsupportedIndicationExceptionMessage(indication));
        }
        IndicationNodeFactory indicationNodeFactory = abstractClickableNode.localIndicationNodeFactory;
        IndicationNodeFactory indicationNodeFactory2 = (IndicationNodeFactory) indication;
        abstractClickableNode.localIndicationNodeFactory = indicationNodeFactory2;
        if (indicationNodeFactory != null && !x.n(indicationNodeFactory2, indicationNodeFactory)) {
            abstractClickableNode.recreateIndicationIfNeeded();
        }
        return ab.f48028a;
    }

    private final void recreateIndicationIfNeeded() {
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode == null && this.lazilyCreateIndication) {
            return;
        }
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
        initializeIndicationAndInteractionSourceIfNeeded();
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, role.m10315unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new a() { // from class: androidx.compose.foundation.AbstractClickableNode$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                AbstractClickableNode.applySemantics$lambda$0(this.f$0);
                return true;
            }
        });
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void disposeInteractions() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r0.interactionSource
            if (r1 == 0) goto L80
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = r0.pressInteraction
            if (r2 == 0) goto L14
            androidx.compose.foundation.interaction.PressInteraction$Cancel r3 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r3.<init>(r2)
            androidx.compose.foundation.interaction.Interaction r3 = (androidx.compose.foundation.interaction.Interaction) r3
            r1.tryEmit(r3)
        L14:
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = r0.indirectPointerPressInteraction
            if (r2 == 0) goto L22
            androidx.compose.foundation.interaction.PressInteraction$Cancel r3 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r3.<init>(r2)
            androidx.compose.foundation.interaction.Interaction r3 = (androidx.compose.foundation.interaction.Interaction) r3
            r1.tryEmit(r3)
        L22:
            androidx.compose.foundation.interaction.HoverInteraction$Enter r2 = r0.hoverInteraction
            if (r2 == 0) goto L30
            androidx.compose.foundation.interaction.HoverInteraction$Exit r3 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r3.<init>(r2)
            androidx.compose.foundation.interaction.Interaction r3 = (androidx.compose.foundation.interaction.Interaction) r3
            r1.tryEmit(r3)
        L30:
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r0.currentKeyPressInteractions
            androidx.collection.LongObjectMap r2 = (androidx.collection.LongObjectMap) r2
            java.lang.Object[] r3 = r2.values
            long[] r2 = r2.metadata
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L80
            r5 = 0
            r6 = r5
        L3f:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L7b
            int r9 = r6 - r4
            r10 = r5
        L52:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L79
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L75
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
            androidx.compose.foundation.interaction.PressInteraction$Cancel r13 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r13.<init>(r11)
            androidx.compose.foundation.interaction.Interaction r13 = (androidx.compose.foundation.interaction.Interaction) r13
            r1.tryEmit(r13)
        L75:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L52
        L79:
            if (r11 != r12) goto L80
        L7b:
            if (r6 == r4) goto L80
            int r6 = r6 + 1
            goto L3f
        L80:
            r1 = 0
            r0.pressInteraction = r1
            r0.indirectPointerPressInteraction = r1
            r0.indirectPointerEventPressPosition = r1
            r0.hoverInteraction = r1
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r0.currentKeyPressInteractions
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.disposeInteractions():void");
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: getExtendedTouchPadding-hWWAJMo, reason: not valid java name */
    protected final long m1933getExtendedTouchPaddinghWWAJMo(long j2) {
        long jMo2128toSizeXkaWNTQ = DelegatableNodeKt.requireDensity(this).mo2128toSizeXkaWNTQ(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).mo9982getMinimumTouchTargetSizeMYxV2XQ());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo2128toSizeXkaWNTQ >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jMo2128toSizeXkaWNTQ & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) / 2.0f;
        return (Float.floatToRawIntBits(fMax2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // androidx.compose.foundation.GestureConnection
    /* renamed from: getGestureState-7meUWtM, reason: not valid java name */
    public String mo1934getGestureState7meUWtM() {
        return this.gestureState;
    }

    protected final a<ab> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public /* synthetic */ long mo1935getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    protected final void handlePressInteractionCancel(boolean z) {
        final MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            br brVar = this.delayJob;
            if (brVar == null || !brVar.bZ()) {
                PressInteraction.Press press = z ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    final PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    br brVar2 = (br) getCoroutineScope().getCoroutineContext().get(br.f51766a);
                    aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(mutableInteractionSource, cancel, brVar2 != null ? brVar2.bY(new l() { // from class: androidx.compose.foundation.AbstractClickableNode$$ExternalSyntheticLambda1
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return AbstractClickableNode.handlePressInteractionCancel$lambda$0$0$0(mutableInteractionSource, cancel, (Throwable) obj);
                        }
                    }) : null, null), 3);
                }
            } else {
                br brVar3 = this.delayJob;
                if (brVar3 != null) {
                    brVar3.s(null);
                }
            }
            if (z) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    /* renamed from: handlePressInteractionRelease-3MmeM6k, reason: not valid java name */
    protected final void m1936handlePressInteractionRelease3MmeM6k(long j2, boolean z) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            br brVar = this.delayJob;
            if (brVar == null || !brVar.bZ()) {
                PressInteraction.Press press = z ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(press, mutableInteractionSource, null), 3);
                }
            } else {
                brVar.s(null);
                aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(brVar, j2, mutableInteractionSource, null), 3);
            }
            if (z) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    protected final void handlePressInteractionStart(IndirectPointerInputChange indirectPointerInputChange) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = new PressInteraction.Press(indirectPointerInputChange.m9108getPositionF1C5BW0(), null);
            if (delayPressInteraction()) {
                this.delayJob = aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSource, press, this, null), 3);
            } else {
                this.indirectPointerPressInteraction = press;
                aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(mutableInteractionSource, press, null), 3);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (enter = this.hoverInteraction) != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
        }
        this.hoverInteraction = null;
    }

    /* renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo1937onClickKeyDownEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo1938onClickKeyUpEventZmokQxo(KeyEvent keyEvent);

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
        DelegatableNode delegatableNode2 = this.gestureNode;
        if (delegatableNode2 != null) {
            undelegate(delegatableNode2);
        }
        this.gestureNode = null;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled) {
            initializeGestureCoordination();
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo1939onKeyEventZmokQxo(KeyEvent keyEvent) {
        boolean z;
        initializeIndicationAndInteractionSourceIfNeeded();
        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
        if (this.enabled && ClickableKt.m2020isPressZmokQxo(keyEvent)) {
            if (this.currentKeyPressInteractions.containsKey(jM9435getKeyZmokQxo)) {
                z = false;
            } else {
                PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
                this.currentKeyPressInteractions.set(jM9435getKeyZmokQxo, press);
                if (this.interactionSource != null) {
                    aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3);
                }
                z = true;
            }
            return mo1937onClickKeyDownEventZmokQxo(keyEvent) || z;
        }
        if (!this.enabled || !ClickableKt.m2018isClickZmokQxo(keyEvent)) {
            return false;
        }
        PressInteraction.Press pressRemove = this.currentKeyPressInteractions.remove(jM9435getKeyZmokQxo);
        if (pressRemove != null) {
            if (this.interactionSource != null) {
                aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2(this, pressRemove, null), 3);
            }
            mo1938onClickKeyUpEventZmokQxo(keyEvent);
        }
        return pressRemove != null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (this.useLocalIndication) {
            ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.foundation.AbstractClickableNode$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return AbstractClickableNode.onObservedReadsChanged$lambda$0(this.f$0);
                }
            });
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        long jM11345getCenterozmzZPI = IntSizeKt.m11345getCenterozmzZPI(j2);
        this.centerOffset = (Float.floatToRawIntBits(IntOffset.m11297getYimpl(jM11345getCenterozmzZPI)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(IntOffset.m11296getXimpl(jM11345getCenterozmzZPI)) << 32);
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled) {
            initializeGestureCoordination();
            if (pointerEventPass == PointerEventPass.Main) {
                int iM9541getType7fucELk = pointerEvent.m9541getType7fucELk();
                if (PointerEventType.m9548equalsimpl0(iM9541getType7fucELk, PointerEventType.Companion.m9552getEnter7fucELk())) {
                    aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
                } else if (PointerEventType.m9548equalsimpl0(iM9541getType7fucELk, PointerEventType.Companion.m9553getExit7fucELk())) {
                    aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
                }
            }
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo1941onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    /* renamed from: setGestureState-KFqyr68, reason: not valid java name */
    public void m1942setGestureStateKFqyr68(String str) {
        this.gestureState = str;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* renamed from: updateCommon-O2vRcR0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m1943updateCommonO2vRcR0(androidx.compose.foundation.interaction.MutableInteractionSource r3, androidx.compose.foundation.IndicationNodeFactory r4, boolean r5, boolean r6, java.lang.String r7, androidx.compose.ui.semantics.Role r8, h.g.a.a<h.ab> r9) {
        /*
            r2 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r2.userProvidedInteractionSource
            boolean r0 = h.g.b.x.n(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.disposeInteractions()
            r2.userProvidedInteractionSource = r3
            r2.interactionSource = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            androidx.compose.foundation.IndicationNodeFactory r0 = r2.indicationNodeFactory
            boolean r0 = h.g.b.x.n(r0, r4)
            if (r0 != 0) goto L1e
            r2.indicationNodeFactory = r4
            r3 = r1
        L1e:
            boolean r4 = r2.useLocalIndication
            if (r4 == r5) goto L2a
            r2.useLocalIndication = r5
            if (r5 == 0) goto L2b
            r2.onObservedReadsChanged()
            goto L2b
        L2a:
            r1 = r3
        L2b:
            boolean r3 = r2.enabled
            if (r3 == r6) goto L5e
            androidx.compose.foundation.FocusableNode r3 = r2.focusableNode
            if (r6 == 0) goto L39
            androidx.compose.ui.node.DelegatableNode r3 = (androidx.compose.ui.node.DelegatableNode) r3
            r2.delegate(r3)
            goto L41
        L39:
            androidx.compose.ui.node.DelegatableNode r3 = (androidx.compose.ui.node.DelegatableNode) r3
            r2.undelegate(r3)
            r2.disposeInteractions()
        L41:
            r3 = r2
            androidx.compose.ui.node.SemanticsModifierNode r3 = (androidx.compose.ui.node.SemanticsModifierNode) r3
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r3)
            if (r6 != 0) goto L5c
            androidx.compose.ui.node.DelegatableNode r3 = r2.gestureNode
            if (r3 == 0) goto L50
            r2.undelegate(r3)
        L50:
            r3 = 0
            r2.gestureNode = r3
            androidx.compose.foundation.GestureState$Companion r3 = androidx.compose.foundation.GestureState.Companion
            java.lang.String r3 = r3.m2033getIdle7meUWtM()
            r2.m1942setGestureStateKFqyr68(r3)
        L5c:
            r2.enabled = r6
        L5e:
            java.lang.String r3 = r2.onClickLabel
            boolean r3 = h.g.b.x.n(r3, r7)
            if (r3 != 0) goto L6e
            r2.onClickLabel = r7
            r3 = r2
            androidx.compose.ui.node.SemanticsModifierNode r3 = (androidx.compose.ui.node.SemanticsModifierNode) r3
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r3)
        L6e:
            androidx.compose.ui.semantics.Role r3 = r2.role
            boolean r3 = h.g.b.x.n(r3, r8)
            if (r3 != 0) goto L7e
            r2.role = r8
            r3 = r2
            androidx.compose.ui.node.SemanticsModifierNode r3 = (androidx.compose.ui.node.SemanticsModifierNode) r3
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r3)
        L7e:
            r2.onClick = r9
            boolean r3 = r2.lazilyCreateIndication
            boolean r4 = r2.shouldLazilyCreateIndication()
            if (r3 == r4) goto L95
            boolean r3 = r2.shouldLazilyCreateIndication()
            r2.lazilyCreateIndication = r3
            if (r3 != 0) goto L95
            androidx.compose.ui.node.DelegatableNode r3 = r2.indicationNode
            if (r3 != 0) goto L95
            goto L97
        L95:
            if (r1 == 0) goto L9a
        L97:
            r2.recreateIndicationIfNeeded()
        L9a:
            androidx.compose.foundation.FocusableNode r3 = r2.focusableNode
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r2.interactionSource
            r3.update(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.m1943updateCommonO2vRcR0(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, boolean, java.lang.String, androidx.compose.ui.semantics.Role, h.g.a.a):void");
    }

    protected void onCancelKeyInput() {
    }

    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    protected final void handlePressInteractionStart(PointerInputChange pointerInputChange) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = new PressInteraction.Press(pointerInputChange.m9608getPositionF1C5BW0(), null);
            if (delayPressInteraction()) {
                this.delayJob = aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$1(mutableInteractionSource, press, this, null), 3);
            } else {
                this.pressInteraction = press;
                aj.z(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$2(mutableInteractionSource, press, null), 3);
            }
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, a aVar, o oVar) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, aVar);
    }
}
