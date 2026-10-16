package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ListenableFutureKt$launchFuture$1$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ p<af, e, Object> $block;
    final /* synthetic */ CallbackToFutureAdapter.Completer $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ListenableFutureKt$launchFuture$1$2(p<? super af, ? super e, ? extends Object> pVar, CallbackToFutureAdapter.Completer completer, e<? super ListenableFutureKt$launchFuture$1$2> eVar) {
        super(2, eVar);
        this.$block = pVar;
        this.$completer = completer;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.$block, this.$completer, eVar);
        listenableFutureKt$launchFuture$1$2.L$0 = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ListenableFutureKt$launchFuture$1$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                af afVar = (af) this.L$0;
                p<af, e, Object> pVar = this.$block;
                this.label = 1;
                obj = pVar.invoke(afVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            this.$completer.set(obj);
        } catch (CancellationException unused) {
            this.$completer.setCancelled();
        } catch (Throwable th) {
            this.$completer.setException(th);
        }
        return ab.f48028a;
    }
}
