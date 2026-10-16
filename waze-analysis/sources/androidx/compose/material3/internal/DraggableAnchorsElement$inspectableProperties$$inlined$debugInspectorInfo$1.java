package androidx.compose.material3.internal;

import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ DraggableAnchorsElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1(DraggableAnchorsElement draggableAnchorsElement) {
        super(1);
        this.this$0 = draggableAnchorsElement;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.getProperties().set("state", this.this$0.state);
        inspectorInfo.getProperties().set("anchors", this.this$0.anchors);
        inspectorInfo.getProperties().set("orientation", this.this$0.orientation);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
