package androidx.compose.ui.viewinterop;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class BringIntoViewNode$requester$1 extends y implements l<Rect, ab> {
    final /* synthetic */ BringIntoViewNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewNode$requester$1(BringIntoViewNode bringIntoViewNode) {
        super(1);
        this.this$0 = bringIntoViewNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Rect rect) {
        if (this.this$0.isAttached()) {
            BringIntoViewNode bringIntoViewNode = this.this$0;
            aj.z(bringIntoViewNode.getCoroutineScope(), null, null, new AnonymousClass1(bringIntoViewNode, rect, null), 3);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ Rect $rect;
        int label;
        final /* synthetic */ BringIntoViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewNode bringIntoViewNode, Rect rect, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = bringIntoViewNode;
            this.$rect = rect;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.this$0, this.$rect, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                BringIntoViewNode bringIntoViewNode = this.this$0;
                this.label = 1;
                if (BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewNode, new C00921(this.$rect), this) == aVar) {
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

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00921 extends y implements h.g.a.a<Rect> {
            final /* synthetic */ Rect $rect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00921(Rect rect) {
                super(0);
                this.$rect = rect;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h.g.a.a
            public final Rect invoke() {
                return this.$rect;
            }
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Rect rect) {
        invoke2(rect);
        return ab.f48028a;
    }
}
