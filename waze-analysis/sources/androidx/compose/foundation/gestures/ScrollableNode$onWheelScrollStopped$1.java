package androidx.compose.foundation.gestures;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollableNode$onWheelScrollStopped$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$onWheelScrollStopped$1(ScrollableNode scrollableNode, long j2, e<? super ScrollableNode$onWheelScrollStopped$1> eVar) {
        super(2, eVar);
        this.this$0 = scrollableNode;
        this.$velocity = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ScrollableNode$onWheelScrollStopped$1(this.this$0, this.$velocity, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ScrollableNode$onWheelScrollStopped$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            ScrollableNode scrollableNode = this.this$0;
            long j2 = this.$velocity;
            this.label = 1;
            if (scrollableNode.scrollingLogic.m2315onScrollStoppedBMRW4eQ(j2, true, this) == aVar) {
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
