package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import h.g.a.l;
import h.g.b.am;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;
    private PointerIcon icon;
    private boolean overrideDescendants;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<HoverIconModifierNode, Boolean> {
        final /* synthetic */ aq<HoverIconModifierNode> $hoverIconModifierNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(aq<HoverIconModifierNode> aqVar) {
            super(1);
            this.$hoverIconModifierNode = aqVar;
        }

        @Override // h.g.a.l
        public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
            if (this.$hoverIconModifierNode.f48105a == null && hoverIconModifierNode.cursorInBoundsOfNode) {
                this.$hoverIconModifierNode.f48105a = hoverIconModifierNode;
            } else if (this.$hoverIconModifierNode.f48105a != null && hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                this.$hoverIconModifierNode.f48105a = hoverIconModifierNode;
            }
            return true;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1, reason: invalid class name and case insensitive filesystem */
    final class C03681 extends y implements l<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {
        final /* synthetic */ am $hasIconRightsOverDescendants;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03681(am amVar) {
            super(1);
            this.$hasIconRightsOverDescendants = amVar;
        }

        @Override // h.g.a.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
            if (!hoverIconModifierNode.cursorInBoundsOfNode) {
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
            this.$hasIconRightsOverDescendants.f48101a = false;
            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1, reason: invalid class name and case insensitive filesystem */
    final class C03691 extends y implements l<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {
        final /* synthetic */ aq<HoverIconModifierNode> $descendantNodeWithCursorInBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03691(aq<HoverIconModifierNode> aqVar) {
            super(1);
            this.$descendantNodeWithCursorInBounds = aqVar;
        }

        @Override // h.g.a.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
            TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            if (hoverIconModifierNode.cursorInBoundsOfNode) {
                this.$descendantNodeWithCursorInBounds.f48105a = hoverIconModifierNode;
                if (hoverIconModifierNode.getOverrideDescendants()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
            }
            return traverseDescendantsAction;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1, reason: invalid class name and case insensitive filesystem */
    final class C03701 extends y implements l<HoverIconModifierNode, Boolean> {
        final /* synthetic */ aq<HoverIconModifierNode> $hoverIconModifierNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03701(aq<HoverIconModifierNode> aqVar) {
            super(1);
            this.$hoverIconModifierNode = aqVar;
        }

        @Override // h.g.a.l
        public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
            if (hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                this.$hoverIconModifierNode.f48105a = hoverIconModifierNode;
            }
            return true;
        }
    }

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i2, o oVar) {
        this(pointerIcon, z & ((i2 & 2) == 0), (i2 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        HoverIconModifierNode hoverIconModifierNodeFindOverridingAncestorNode = findOverridingAncestorNode();
        if (hoverIconModifierNodeFindOverridingAncestorNode == null || (pointerIcon = hoverIconModifierNodeFindOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        displayIcon(pointerIcon);
    }

    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        aq aqVar = new aq();
        TraversableNodeKt.traverseAncestors(this, new AnonymousClass1(aqVar));
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) aqVar.f48105a;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.displayIcon();
        } else {
            displayIcon(null);
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        HoverIconModifierNode hoverIconModifierNodeFindDescendantNodeWithCursorInBounds;
        if (this.cursorInBoundsOfNode) {
            if (!this.overrideDescendants && (hoverIconModifierNodeFindDescendantNodeWithCursorInBounds = findDescendantNodeWithCursorInBounds()) != null) {
                this = hoverIconModifierNodeFindDescendantNodeWithCursorInBounds;
            }
            this.displayIcon();
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        am amVar = new am();
        amVar.f48101a = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new C03681(amVar));
        }
        if (amVar.f48101a) {
            displayIcon();
        }
    }

    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        aq aqVar = new aq();
        TraversableNodeKt.traverseDescendants(this, new C03691(aqVar));
        return (HoverIconModifierNode) aqVar.f48105a;
    }

    private final HoverIconModifierNode findOverridingAncestorNode() {
        aq aqVar = new aq();
        TraversableNodeKt.traverseAncestors(this, new C03701(aqVar));
        return (HoverIconModifierNode) aqVar.f48105a;
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    public abstract void displayIcon(PointerIcon pointerIcon);

    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    protected final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1935getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.m9959roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this)) : TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo9512isRelevantPointerTypeuerMTgs(int i2);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (pointerEventPass == PointerEventPass.Main) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (mo9512isRelevantPointerTypeuerMTgs(changes.get(i2).m9611getTypeT8wyACA())) {
                    if (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9552getEnter7fucELk())) {
                        onEnter();
                        return;
                    } else {
                        if (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9553getExit7fucELk())) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    public final void setDpTouchBoundsExpansion(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void setIcon(PointerIcon pointerIcon) {
        if (x.n(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z) {
        if (this.overrideDescendants != z) {
            this.overrideDescendants = z;
            boolean z2 = this.cursorInBoundsOfNode;
            if (z) {
                if (z2) {
                    displayIcon();
                }
            } else if (z2) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z;
    }
}
