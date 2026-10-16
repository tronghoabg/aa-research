package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ float $height$inlined;
    final /* synthetic */ float $width$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(float f2, float f3) {
        super(1);
        this.$width$inlined = f2;
        this.$height$inlined = f3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requiredSize");
        inspectorInfo.getProperties().set("width", Dp.m11162boximpl(this.$width$inlined));
        inspectorInfo.getProperties().set("height", Dp.m11162boximpl(this.$height$inlined));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
