package androidx.compose.ui.semantics;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SemanticsNode$emitFakeNodes$fakeNode$1 extends y implements l<SemanticsPropertyReceiver, ab> {
    final /* synthetic */ Role $nodeRole;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SemanticsNode$emitFakeNodes$fakeNode$1(Role role) {
        super(1);
        this.$nodeRole = role;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, this.$nodeRole.m10315unboximpl());
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return ab.f48028a;
    }
}
