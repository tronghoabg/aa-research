package androidx.compose.material3;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ ModalWideNavigationRailState $modalState;
    final /* synthetic */ ModalWideNavigationRailOverrideScope $this_ModalWideNavigationRail;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1$1(ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, ModalWideNavigationRailState modalWideNavigationRailState, e<? super DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1$1> eVar) {
        super(2, eVar);
        this.$this_ModalWideNavigationRail = modalWideNavigationRailOverrideScope;
        this.$modalState = modalWideNavigationRailState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1$1(this.$this_ModalWideNavigationRail, this.$modalState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r4.$this_ModalWideNavigationRail.getState().collapse(r4) != r0) goto L17;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r5)
            goto L46
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L18:
            e.b.c.b(r5)
            goto L35
        L1c:
            e.b.c.b(r5)
            androidx.compose.material3.ModalWideNavigationRailOverrideScope r5 = r4.$this_ModalWideNavigationRail
            boolean r5 = r5.getShouldHideOnCollapse()
            if (r5 == 0) goto L35
            androidx.compose.material3.ModalWideNavigationRailState r5 = r4.$modalState
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r3
            java.lang.Object r5 = r5.collapse(r1)
            if (r5 != r0) goto L35
            goto L49
        L35:
            androidx.compose.material3.ModalWideNavigationRailOverrideScope r5 = r4.$this_ModalWideNavigationRail
            androidx.compose.material3.WideNavigationRailState r5 = r5.getState()
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r2
            java.lang.Object r4 = r5.collapse(r1)
            if (r4 == r0) goto L49
        L46:
            h.ab r4 = h.ab.f48028a
            return r4
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
