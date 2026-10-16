package androidx.compose.foundation.lazy.layout;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ LazyLayoutSemanticsModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i2, e<? super LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2> eVar) {
        super(2, eVar);
        this.this$0 = lazyLayoutSemanticsModifierNode;
        this.$index = i2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(this.this$0, this.$index, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.this$0;
            int i3 = this.$index;
            this.label = 1;
            if (lazyLayoutSemanticsModifierNode.state.scrollToItem(i3, this) == aVar) {
                return aVar;
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
