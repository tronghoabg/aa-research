package androidx.collection;

import androidx.collection.MutableOrderedSetWrapper;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.m.j;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MutableOrderedSetWrapper$iterator$1$iterator$1<E> extends f implements p<j<? super E>, e<? super ab>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.AnonymousClass1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1, e<? super MutableOrderedSetWrapper$iterator$1$iterator$1> eVar) {
        super(2, eVar);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = anonymousClass1;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, eVar);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // h.g.a.p
    public final Object invoke(j<? super E> jVar, e<? super ab> eVar) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1;
        MutableOrderedSetWrapper<E> mutableOrderedSetWrapper;
        long[] jArr;
        int i2;
        a aVar = a.f48038a;
        int i3 = this.label;
        if (i3 == 0) {
            c.b(obj);
            jVar = (j) this.L$0;
            MutableOrderedScatterSet mutableOrderedScatterSet = ((MutableOrderedSetWrapper) this.this$0).parent;
            anonymousClass1 = this.this$1;
            mutableOrderedSetWrapper = this.this$0;
            jArr = mutableOrderedScatterSet.nodes;
            i2 = mutableOrderedScatterSet.tail;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            anonymousClass1 = (MutableOrderedSetWrapper.AnonymousClass1) this.L$1;
            jVar = (j) this.L$0;
            c.b(obj);
        }
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2] >> 31;
            anonymousClass1.setCurrent(i2);
            Object obj2 = ((MutableOrderedSetWrapper) mutableOrderedSetWrapper).parent.elements[i2];
            this.L$0 = jVar;
            this.L$1 = anonymousClass1;
            this.L$2 = mutableOrderedSetWrapper;
            this.L$3 = jArr;
            i2 = (int) (j2 & SieveCacheKt.NodeLinkMask);
            this.I$0 = i2;
            this.label = 1;
            if (jVar.a(obj2, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
