package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2, reason: invalid class name and case insensitive filesystem */
    final class C02072 extends g implements l<e, Object> {
        final /* synthetic */ l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02072(l lVar, e<? super C02072> eVar) {
            super(1, eVar);
            this.$onFrame = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C02072(this.$onFrame, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e eVar) {
            return ((C02072) create(eVar)).invokeSuspend(ab.f48028a);
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

    public static final <R> Object withInfiniteAnimationFrameMillis(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        return withInfiniteAnimationFrameNanos(new AnonymousClass2(lVar), eVar);
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) eVar.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(lVar, eVar) : infiniteAnimationPolicy.onInfiniteOperation(new C02072(lVar, null), eVar);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, reason: invalid class name */
    public final class AnonymousClass2 implements l {
        final /* synthetic */ l $onFrame;

        public AnonymousClass2(l lVar) {
            this.$onFrame = lVar;
        }

        public final Object invoke(long j2) {
            return this.$onFrame.invoke(Long.valueOf(j2 / 1000000));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }
}
