package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InfiniteAnimationPolicyKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e, Object> {
        final /* synthetic */ l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(l lVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$onFrame = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.$onFrame, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.$onFrame, this);
            return objWithFrameNanos == aVar ? aVar : objWithFrameNanos;
        }
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) eVar.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(lVar, eVar) : infiniteAnimationPolicy.onInfiniteOperation(new AnonymousClass2(lVar, null), eVar);
    }
}
