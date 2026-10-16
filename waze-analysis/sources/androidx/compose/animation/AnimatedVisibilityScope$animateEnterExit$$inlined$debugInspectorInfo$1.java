package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1 extends y implements l<InspectorInfo, ab> {
    final /* synthetic */ EnterTransition $enter$inlined;
    final /* synthetic */ ExitTransition $exit$inlined;
    final /* synthetic */ String $label$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        super(1);
        this.$enter$inlined = enterTransition;
        this.$exit$inlined = exitTransition;
        this.$label$inlined = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateEnterExit");
        inspectorInfo.getProperties().set("enter", this.$enter$inlined);
        inspectorInfo.getProperties().set("exit", this.$exit$inlined);
        inspectorInfo.getProperties().set("label", this.$label$inlined);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return ab.f48028a;
    }
}
