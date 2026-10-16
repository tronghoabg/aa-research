package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ float $maxHeight$inlined;
    final /* synthetic */ float $maxWidth$inlined;
    final /* synthetic */ float $minHeight$inlined;
    final /* synthetic */ float $minWidth$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f2, float f3, float f4, float f5) {
        super(1);
        this.$minWidth$inlined = f2;
        this.$minHeight$inlined = f3;
        this.$maxWidth$inlined = f4;
        this.$maxHeight$inlined = f5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requiredSizeIn");
        inspectorInfo.getProperties().set("minWidth", Dp.m11162boximpl(this.$minWidth$inlined));
        inspectorInfo.getProperties().set("minHeight", Dp.m11162boximpl(this.$minHeight$inlined));
        inspectorInfo.getProperties().set("maxWidth", Dp.m11162boximpl(this.$maxWidth$inlined));
        inspectorInfo.getProperties().set("maxHeight", Dp.m11162boximpl(this.$maxHeight$inlined));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
