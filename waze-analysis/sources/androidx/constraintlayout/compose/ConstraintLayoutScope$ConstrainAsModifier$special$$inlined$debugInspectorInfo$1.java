package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ l $constrainBlock$inlined;
    final /* synthetic */ ConstrainedLayoutReference $ref$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1(ConstrainedLayoutReference constrainedLayoutReference, l lVar) {
        super(1);
        this.$ref$inlined = constrainedLayoutReference;
        this.$constrainBlock$inlined = lVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("constrainAs");
        inspectorInfo.getProperties().set("ref", this.$ref$inlined);
        inspectorInfo.getProperties().set("constrainBlock", this.$constrainBlock$inlined);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
