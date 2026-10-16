package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionLayoutScope$onStartEndBoundsChanged$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ Object $layoutId$inlined;
    final /* synthetic */ p $onBoundsChanged$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutScope$onStartEndBoundsChanged$$inlined$debugInspectorInfo$1(Object obj, p pVar) {
        super(1);
        this.$layoutId$inlined = obj;
        this.$onBoundsChanged$inlined = pVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onStartEndBoundsChanged");
        inspectorInfo.getProperties().set("layoutId", this.$layoutId$inlined);
        inspectorInfo.getProperties().set("onBoundsChanged", this.$onBoundsChanged$inlined);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
