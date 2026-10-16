package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlexBoxChildElement extends ModifierNodeElement<FlexBoxChildDataNode> {
    public static final int $stable = 0;
    private final FlexConfig config;

    public FlexBoxChildElement(FlexConfig flexConfig) {
        this.config = flexConfig;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FlexBoxChildDataNode create() {
        return new FlexBoxChildDataNode(this.config);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlexBoxChildElement) {
            return x.n(this.config, ((FlexBoxChildElement) obj).config);
        }
        return false;
    }

    public final FlexConfig getConfig() {
        return this.config;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.config.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("flex");
        inspectorInfo.getProperties().set("config", this.config);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FlexBoxChildDataNode flexBoxChildDataNode) {
        flexBoxChildDataNode.setConfig(this.config);
    }
}
