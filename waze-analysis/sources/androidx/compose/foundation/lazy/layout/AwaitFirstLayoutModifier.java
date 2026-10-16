package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnLayoutRectChangedModifierKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier extends ModifierNodeElement<Node> {
    public static final int $stable = 0;
    private Node attachedNode;
    private CompletableDeferred<ab> lock;

    /* compiled from: WazeSource */
    public final class Node extends Modifier.Node {
        private DelegatableNode.RegistrationHandle handle;

        public Node() {
        }

        static final ab requestOnAfterLayoutCallback$lambda$0(Node node, AwaitFirstLayoutModifier awaitFirstLayoutModifier, RelativeLayoutBounds relativeLayoutBounds) {
            DelegatableNode.RegistrationHandle registrationHandle = node.handle;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            node.handle = null;
            CompletableDeferred completableDeferred = awaitFirstLayoutModifier.lock;
            if (completableDeferred != null) {
                completableDeferred.a(ab.f48028a);
            }
            awaitFirstLayoutModifier.lock = null;
            return ab.f48028a;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            AwaitFirstLayoutModifier.this.attachedNode = this;
            if (AwaitFirstLayoutModifier.this.lock != null) {
                requestOnAfterLayoutCallback();
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            if (AwaitFirstLayoutModifier.this.attachedNode == this) {
                AwaitFirstLayoutModifier.this.attachedNode = null;
            }
            DelegatableNode.RegistrationHandle registrationHandle = this.handle;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            this.handle = null;
        }

        public final void requestOnAfterLayoutCallback() {
            final AwaitFirstLayoutModifier awaitFirstLayoutModifier = AwaitFirstLayoutModifier.this;
            this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, new l() { // from class: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$Node$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return AwaitFirstLayoutModifier.Node.requestOnAfterLayoutCallback$lambda$0(this.f$0, awaitFirstLayoutModifier, (RelativeLayoutBounds) obj);
                }
            });
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("AwaitFirstLayoutModifier");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
    }

    public final Object waitForFirstLayout(e<? super ab> eVar) {
        CompletableDeferred<ab> completableDeferredJ = this.lock;
        if (completableDeferredJ == null) {
            completableDeferredJ = bo.j();
            this.lock = completableDeferredJ;
            Node node = this.attachedNode;
            if (node != null && node.isAttached()) {
                node.requestOnAfterLayoutCallback();
            }
        }
        Object objC = completableDeferredJ.c(eVar);
        return objC == a.f48038a ? objC : ab.f48028a;
    }

    public void update(Node node) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return new Node();
    }
}
