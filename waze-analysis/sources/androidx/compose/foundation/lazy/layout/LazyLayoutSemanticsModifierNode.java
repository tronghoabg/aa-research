package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    private final l<Object, Integer> indexForKeyMapping = new l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Integer.valueOf(LazyLayoutSemanticsModifierNode.indexForKeyMapping$lambda$0(this.f$0, obj));
        }
    };
    private a<? extends LazyLayoutItemProvider> itemProviderLambda;
    private Orientation orientation;
    private boolean reverseScrolling;
    private ScrollAxisRange scrollAxisRange;
    private l<? super Integer, Boolean> scrollToIndexAction;
    private LazyLayoutSemanticState state;
    private boolean userScrollEnabled;

    public LazyLayoutSemanticsModifierNode(a<? extends LazyLayoutItemProvider> aVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        this.itemProviderLambda = aVar;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z;
        this.reverseScrolling = z2;
        updateCachedSemanticsValues();
    }

    private final CollectionInfo getCollectionInfo() {
        return this.state.collectionInfo();
    }

    static final int indexForKeyMapping$lambda$0(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, Object obj) {
        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
        int itemCount = lazyLayoutItemProviderInvoke.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (x.n(lazyLayoutItemProviderInvoke.getKey(i2), obj)) {
                return i2;
            }
        }
        return -1;
    }

    private final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    private final void updateCachedSemanticsValues() {
        this.scrollAxisRange = new ScrollAxisRange(new a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(this.f$0.state.getScrollOffset());
            }
        }, new a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(this.f$0.state.getMaxScrollOffset());
            }
        }, this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$2(this.f$0, ((Integer) obj).intValue());
                return true;
            }
        } : null;
    }

    static final boolean updateCachedSemanticsValues$lambda$2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i2) {
        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
        if (i2 < 0 || i2 >= lazyLayoutItemProviderInvoke.getItemCount()) {
            InlineClassHelperKt.throwIllegalArgumentException("Can't scroll to index " + i2 + ", it is out of bounds [0, " + lazyLayoutItemProviderInvoke.getItemCount() + ')');
        }
        aj.z(lazyLayoutSemanticsModifierNode.getCoroutineScope(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(lazyLayoutSemanticsModifierNode, i2, null), 3);
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, this.indexForKeyMapping);
        boolean zIsVertical = isVertical();
        ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
        if (zIsVertical) {
            if (scrollAxisRange == null) {
                x.j("scrollAxisRange");
                scrollAxisRange = null;
            }
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            if (scrollAxisRange == null) {
                x.j("scrollAxisRange");
                scrollAxisRange = null;
            }
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
        l<? super Integer, Boolean> lVar = this.scrollToIndexAction;
        if (lVar != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, lVar, 1, null);
        }
        SemanticsPropertiesKt.getScrollViewportLength$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.f$0;
                return Float.valueOf(lazyLayoutSemanticsModifierNode.state.getViewport() - lazyLayoutSemanticsModifierNode.state.getContentPadding());
            }
        }, 1, null);
        SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, getCollectionInfo());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    public final void update(a<? extends LazyLayoutItemProvider> aVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        this.itemProviderLambda = aVar;
        this.state = lazyLayoutSemanticState;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (this.userScrollEnabled == z && this.reverseScrolling == z2) {
            return;
        }
        this.userScrollEnabled = z;
        this.reverseScrolling = z2;
        updateCachedSemanticsValues();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }
}
