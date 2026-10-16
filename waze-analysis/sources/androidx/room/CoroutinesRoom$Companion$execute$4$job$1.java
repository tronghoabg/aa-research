package androidx.room;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.concurrent.Callable;
import kotlinx.coroutines.af;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Callable $callable;
    final /* synthetic */ k $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$job$1(Callable callable, k kVar, e<? super CoroutinesRoom$Companion$execute$4$job$1> eVar) {
        super(2, eVar);
        this.$callable = callable;
        this.$continuation = kVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        try {
            this.$continuation.resumeWith(this.$callable.call());
        } catch (Throwable th) {
            this.$continuation.resumeWith(c.a(th));
        }
        return ab.f48028a;
    }
}
