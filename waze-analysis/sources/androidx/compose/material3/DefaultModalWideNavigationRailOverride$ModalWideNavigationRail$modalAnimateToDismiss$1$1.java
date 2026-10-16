package androidx.compose.material3;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$modalAnimateToDismiss$1$1 extends g implements l<e<? super ab>, Object> {
    final /* synthetic */ ModalWideNavigationRailState $modalState;
    final /* synthetic */ ModalWideNavigationRailOverrideScope $this_ModalWideNavigationRail;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$modalAnimateToDismiss$1$1(ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, ModalWideNavigationRailState modalWideNavigationRailState, e<? super DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$modalAnimateToDismiss$1$1> eVar) {
        super(1, eVar);
        this.$this_ModalWideNavigationRail = modalWideNavigationRailOverrideScope;
        this.$modalState = modalWideNavigationRailState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$modalAnimateToDismiss$1$1(this.$this_ModalWideNavigationRail, this.$modalState, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$modalAnimateToDismiss$1$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            if (this.$this_ModalWideNavigationRail.getShouldHideOnCollapse() && !WideNavigationRailStateKt.isExpanded(this.$modalState.getTargetValue())) {
                this.label = 1;
                if (this.$this_ModalWideNavigationRail.getState().collapse(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
