package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;
import kotlinx.coroutines.bt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.Modifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Modifier $default$then(Modifier modifier, Modifier modifier2) {
            return modifier2 == Modifier.Companion ? modifier : new CombinedModifier(modifier, modifier2);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            return CC.$default$then(modifier, modifier2);
        }
    }

    /* compiled from: WazeSource */
    public interface Element extends Modifier {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.Modifier$Element$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$all(Element element, l lVar) {
                return ((Boolean) lVar.invoke(element)).booleanValue();
            }

            public static boolean $default$any(Element element, l lVar) {
                return ((Boolean) lVar.invoke(element)).booleanValue();
            }

            public static Object $default$foldIn(Element element, Object obj, p pVar) {
                return pVar.invoke(obj, element);
            }

            public static Object $default$foldOut(Element element, Object obj, p pVar) {
                return pVar.invoke(element, obj);
            }
        }

        /* compiled from: WazeSource */
        public final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, l<? super Element, Boolean> lVar) {
                return CC.$default$all(element, lVar);
            }

            @Deprecated
            public static boolean any(Element element, l<? super Element, Boolean> lVar) {
                return CC.$default$any(element, lVar);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r, p<? super R, ? super Element, ? extends R> pVar) {
                return (R) CC.$default$foldIn(element, r, pVar);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r, p<? super Element, ? super R, ? extends R> pVar) {
                return (R) CC.$default$foldOut(element, r, pVar);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return CC.$default$then(element, modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        boolean all(l<? super Element, Boolean> lVar);

        @Override // androidx.compose.ui.Modifier
        boolean any(l<? super Element, Boolean> lVar);

        @Override // androidx.compose.ui.Modifier
        <R> R foldIn(R r, p<? super R, ? super Element, ? extends R> pVar);

        @Override // androidx.compose.ui.Modifier
        <R> R foldOut(R r, p<? super Element, ? super R, ? extends R> pVar);
    }

    boolean all(l<? super Element, Boolean> lVar);

    boolean any(l<? super Element, Boolean> lVar);

    <R> R foldIn(R r, p<? super R, ? super Element, ? extends R> pVar);

    <R> R foldOut(R r, p<? super Element, ? super R, ? extends R> pVar);

    Modifier then(Modifier modifier);

    /* compiled from: WazeSource */
    public abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private a<ab> detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private af scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public final int getAggregateChildKindSet$ui() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui() {
            return this.coordinator;
        }

        public final af getCoroutineScope() {
            af afVar = this.scope;
            if (afVar != null) {
                return afVar;
            }
            Node node = this;
            af afVarE = aj.e(DelegatableNodeKt.requireOwner(node).getCoroutineContext().plus(new bt((br) DelegatableNodeKt.requireOwner(node).getCoroutineContext().get(br.f51766a))));
            this.scope = afVarE;
            return afVarE;
        }

        public final a<ab> getDetachedListener$ui() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui() {
            return this.ownerScope;
        }

        public final Node getParent$ui() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
        public final boolean m7660isKindH91voCI$ui(int i2) {
            return (getKindSet$ui() & i2) != 0;
        }

        public void markAsAttached$ui() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (this.coordinator == null) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            af afVar = this.scope;
            if (afVar != null) {
                aj.h(afVar, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (this.coordinator == null) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            a<ab> aVar = this.detachedListener;
            if (aVar != null) {
                aVar.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui(int i2) {
            this.aggregateChildKindSet = i2;
        }

        public void setAsDelegateTo$ui(Node node) {
            this.node = node;
        }

        public final void setChild$ui(Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui(a<ab> aVar) {
            this.detachedListener = aVar;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui(int i2) {
            this.kindSet = i2;
        }

        public final void setOwnerScope$ui(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void sideEffect(a<ab> aVar) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(aVar);
        }

        public void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public void onAttach() {
        }

        @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
        public /* synthetic */ void onDensityChange() {
        }

        public void onDetach() {
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public /* synthetic */ void onLayoutDirectionChange() {
        }

        public void onReset() {
        }
    }

    /* compiled from: WazeSource */
    public final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(l<? super Element, Boolean> lVar) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(l<? super Element, Boolean> lVar) {
            return false;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r, p<? super R, ? super Element, ? extends R> pVar) {
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r, p<? super Element, ? super R, ? extends R> pVar) {
            return r;
        }
    }
}
