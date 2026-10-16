package androidx.compose.ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final MutableObjectList<SemanticsListener> listeners = new MutableObjectList<>(2);
    private final IntObjectMap<LayoutNode> nodes;
    private final EmptySemanticsModifier outerSemanticsNode;
    private final LayoutNode rootNode;

    public SemanticsOwner(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier, IntObjectMap<LayoutNode> intObjectMap) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = emptySemanticsModifier;
        this.nodes = intObjectMap;
    }

    public final SemanticsInfo get$ui(int i2) {
        return this.nodes.get(i2);
    }

    public final MutableObjectList<SemanticsListener> getListeners$ui() {
        return this.listeners;
    }

    public final SemanticsInfo getRootInfo$ui() {
        return this.rootNode;
    }

    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void notifySemanticsChange$ui(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        MutableObjectList<SemanticsListener> mutableObjectList = this.listeners;
        Object[] objArr = mutableObjectList.content;
        int i2 = mutableObjectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            ((SemanticsListener) objArr[i3]).onSemanticsChanged(semanticsInfo, semanticsConfiguration);
        }
    }
}
