package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.r;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutoCloseables$useEachIndexedAsync$deferred$1$1$1 extends g implements p<af, e, Object> {
    final /* synthetic */ r $action;
    final /* synthetic */ int $i;
    final /* synthetic */ AutoCloseable $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCloseables$useEachIndexedAsync$deferred$1$1$1(r rVar, int i2, AutoCloseable autoCloseable, e<? super AutoCloseables$useEachIndexedAsync$deferred$1$1$1> eVar) {
        super(2, eVar);
        this.$action = rVar;
        this.$i = i2;
        this.$it = autoCloseable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        AutoCloseables$useEachIndexedAsync$deferred$1$1$1 autoCloseables$useEachIndexedAsync$deferred$1$1$1 = new AutoCloseables$useEachIndexedAsync$deferred$1$1$1(this.$action, this.$i, this.$it, eVar);
        autoCloseables$useEachIndexedAsync$deferred$1$1$1.L$0 = obj;
        return autoCloseables$useEachIndexedAsync$deferred$1$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((AutoCloseables$useEachIndexedAsync$deferred$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
        af afVar = (af) this.L$0;
        r rVar = this.$action;
        Integer num = new Integer(this.$i);
        AutoCloseable autoCloseable = this.$it;
        this.label = 1;
        Object objInvoke = rVar.invoke(afVar, num, autoCloseable, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke((af) this.L$0, Integer.valueOf(this.$i), this.$it, this);
    }
}
