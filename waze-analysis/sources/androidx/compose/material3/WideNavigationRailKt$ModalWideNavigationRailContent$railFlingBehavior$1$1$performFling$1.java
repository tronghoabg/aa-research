package androidx.compose.material3;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1 extends c {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1(WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1, e<? super WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1> eVar) {
        super(eVar);
        this.this$0 = wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}
