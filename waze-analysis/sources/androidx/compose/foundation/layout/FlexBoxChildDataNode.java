package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlexBoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private FlexConfig config;

    public FlexBoxChildDataNode(FlexConfig flexConfig) {
        this.config = flexConfig;
    }

    public final FlexConfig getConfig() {
        return this.config;
    }

    public final void setConfig(FlexConfig flexConfig) {
        this.config = flexConfig;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        return this;
    }
}
