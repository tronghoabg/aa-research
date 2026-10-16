package androidx.compose.material;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableStateFor$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ SwipeableState $swipeableState;
    final /* synthetic */ Object $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$rememberSwipeableStateFor$1$1(Object obj, SwipeableState swipeableState, e<? super SwipeableKt$rememberSwipeableStateFor$1$1> eVar) {
        super(2, eVar);
        this.$value = obj;
        this.$swipeableState = swipeableState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SwipeableKt$rememberSwipeableStateFor$1$1(this.$value, this.$swipeableState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SwipeableKt$rememberSwipeableStateFor$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            if (!x.n(this.$value, this.$swipeableState.getCurrentValue())) {
                this.label = 1;
                if (SwipeableState.animateTo$default(this.$swipeableState, this.$value, null, this, 2, null) == aVar) {
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
