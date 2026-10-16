package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Intent;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ContextKt$receiveBroadcastsAsync$2$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ q<BroadcastReceiver.PendingResult, Intent, e<? super ab>, Object> $onReceive;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContextKt$receiveBroadcastsAsync$2$1$1(q<? super BroadcastReceiver.PendingResult, ? super Intent, ? super e<? super ab>, ? extends Object> qVar, BroadcastReceiver.PendingResult pendingResult, Intent intent, e<? super ContextKt$receiveBroadcastsAsync$2$1$1> eVar) {
        super(2, eVar);
        this.$onReceive = qVar;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ContextKt$receiveBroadcastsAsync$2$1$1 contextKt$receiveBroadcastsAsync$2$1$1 = new ContextKt$receiveBroadcastsAsync$2$1$1(this.$onReceive, this.$pendingResult, this.$intent, eVar);
        contextKt$receiveBroadcastsAsync$2$1$1.L$0 = obj;
        return contextKt$receiveBroadcastsAsync$2$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ContextKt$receiveBroadcastsAsync$2$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [h.ab, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                aj.i((af) this.L$0);
                q<BroadcastReceiver.PendingResult, Intent, e<? super ab>, Object> qVar = this.$onReceive;
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                x.c(pendingResult);
                Intent intent = this.$intent;
                this.label = 1;
                if (qVar.invoke(pendingResult, intent, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            this.$pendingResult.finish();
            this = ab.f48028a;
            return this;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }
}
