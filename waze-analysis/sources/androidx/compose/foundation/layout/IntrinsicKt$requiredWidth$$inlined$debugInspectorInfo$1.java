package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ IntrinsicSize $intrinsicSize$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1(IntrinsicSize intrinsicSize) {
        super(1);
        this.$intrinsicSize$inlined = intrinsicSize;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requiredWidth");
        inspectorInfo.getProperties().set("intrinsicSize", this.$intrinsicSize$inlined);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
