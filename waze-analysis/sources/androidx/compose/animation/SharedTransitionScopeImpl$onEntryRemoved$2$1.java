package androidx.compose.animation;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedTransitionScopeImpl$onEntryRemoved$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ SharedElementEntry $sharedElementState;
    final /* synthetic */ SharedElement $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedTransitionScopeImpl$onEntryRemoved$2$1(SharedElement sharedElement, SharedElementEntry sharedElementEntry, e<? super SharedTransitionScopeImpl$onEntryRemoved$2$1> eVar) {
        super(2, eVar);
        this.$this_with = sharedElement;
        this.$sharedElementState = sharedElementEntry;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SharedTransitionScopeImpl$onEntryRemoved$2$1(this.$this_with, this.$sharedElementState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SharedTransitionScopeImpl$onEntryRemoved$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (this.$this_with.getAllEntries().isEmpty()) {
            this.$this_with.getScope().sharedElements.remove(this.$this_with.getKey());
        }
        return ab.f48028a;
    }
}
