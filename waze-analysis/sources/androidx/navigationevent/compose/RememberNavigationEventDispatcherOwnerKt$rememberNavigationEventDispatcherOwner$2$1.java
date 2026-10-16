package androidx.navigationevent.compose;

import androidx.navigationevent.NavigationEventDispatcher;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ NavigationEventDispatcher $localDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1(NavigationEventDispatcher navigationEventDispatcher, boolean z, e<? super RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1> eVar) {
        super(2, eVar);
        this.$localDispatcher = navigationEventDispatcher;
        this.$enabled = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1(this.$localDispatcher, this.$enabled, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.$localDispatcher.setEnabled(this.$enabled);
        return ab.f48028a;
    }
}
