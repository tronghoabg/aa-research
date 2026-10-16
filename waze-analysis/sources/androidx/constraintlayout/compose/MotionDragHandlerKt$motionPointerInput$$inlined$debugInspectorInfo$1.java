package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.constraintlayout.motion.widget.Key;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionDragHandlerKt$motionPointerInput$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ Object $key$inlined;
    final /* synthetic */ MotionMeasurer $measurer$inlined;
    final /* synthetic */ MutableFloatState $motionProgress$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDragHandlerKt$motionPointerInput$$inlined$debugInspectorInfo$1(Object obj, MutableFloatState mutableFloatState, MotionMeasurer motionMeasurer) {
        super(1);
        this.$key$inlined = obj;
        this.$motionProgress$inlined = mutableFloatState;
        this.$measurer$inlined = motionMeasurer;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("motionPointerInput");
        inspectorInfo.getProperties().set("key", this.$key$inlined);
        inspectorInfo.getProperties().set(Key.MOTIONPROGRESS, this.$motionProgress$inlined);
        inspectorInfo.getProperties().set("measurer", this.$measurer$inlined);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
