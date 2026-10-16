package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollableNode$onKeyEvent$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
        final /* synthetic */ long $scrollAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j2, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$scrollAmount = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
            return ((AnonymousClass1) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            ((NestedScrollScope) this.L$0).mo2255scrollByOzD1aCk(this.$scrollAmount, NestedScrollSource.Companion.m9476getUserInputWNlRxjI());
            return ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j2, e<? super ScrollableNode$onKeyEvent$1> eVar) {
        super(2, eVar);
        this.this$0 = scrollableNode;
        this.$scrollAmount = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ScrollableNode$onKeyEvent$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            ScrollableNode scrollableNode = this.this$0;
            long j2 = this.$scrollAmount;
            this.label = 1;
            if (scrollableNode.scrollingLogic.scroll(MutatePriority.UserInput, new AnonymousClass1(j2, null), this) == aVar) {
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
