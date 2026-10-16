package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.r;
import h.g.b.w;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutoCloseables$useEachIndexedAsync$deferred$1 extends g implements p<af, e, Object> {
    final /* synthetic */ r $action;
    final /* synthetic */ AutoCloseable $closeable;
    final /* synthetic */ int $i;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCloseables$useEachIndexedAsync$deferred$1(AutoCloseable autoCloseable, r rVar, int i2, e<? super AutoCloseables$useEachIndexedAsync$deferred$1> eVar) {
        super(2, eVar);
        this.$closeable = autoCloseable;
        this.$action = rVar;
        this.$i = i2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new AutoCloseables$useEachIndexedAsync$deferred$1(this.$closeable, this.$action, this.$i, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((AutoCloseables$useEachIndexedAsync$deferred$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        AutoCloseable autoCloseable;
        r rVar;
        int i2;
        AutoCloseable autoCloseable2;
        Throwable th;
        AutoCloseable autoCloseable3;
        a aVar = a.f48038a;
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.I$0;
                autoCloseable2 = (AutoCloseable) this.L$2;
                rVar = (r) this.L$1;
                AutoCloseable autoCloseable4 = (AutoCloseable) this.L$0;
                try {
                    c.b(obj);
                    autoCloseable = autoCloseable4;
                } catch (Throwable th2) {
                    th = th2;
                    autoCloseable3 = autoCloseable4;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                autoCloseable3 = (AutoCloseable) this.L$0;
                try {
                    c.b(obj);
                    h.a.r.y(autoCloseable3, null);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            try {
                throw th;
            } catch (Throwable th4) {
                h.a.r.y(autoCloseable3, th);
                throw th4;
            }
        }
        c.b(obj);
        autoCloseable = this.$closeable;
        rVar = this.$action;
        i2 = this.$i;
        try {
            this.L$0 = autoCloseable;
            this.L$1 = rVar;
            this.L$2 = autoCloseable;
            this.I$0 = i2;
            this.label = 1;
            if (w.b(this) != aVar) {
                autoCloseable2 = autoCloseable;
            }
            return aVar;
        } catch (Throwable th5) {
            AutoCloseable autoCloseable5 = autoCloseable;
            th = th5;
            autoCloseable3 = autoCloseable5;
        }
        AutoCloseables$useEachIndexedAsync$deferred$1$1$1 autoCloseables$useEachIndexedAsync$deferred$1$1$1 = new AutoCloseables$useEachIndexedAsync$deferred$1$1$1(rVar, i2, autoCloseable2, null);
        this.L$0 = autoCloseable;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        Object objD = aj.d(autoCloseables$useEachIndexedAsync$deferred$1$1$1, this);
        if (objD != aVar) {
            AutoCloseable autoCloseable6 = autoCloseable;
            obj = objD;
            autoCloseable3 = autoCloseable6;
            h.a.r.y(autoCloseable3, null);
            return obj;
        }
        return aVar;
    }

    public final Object invokeSuspend$$forInline(Object obj) throws Exception {
        r rVar = this.$action;
        int i2 = this.$i;
        AutoCloseable autoCloseable = this.$closeable;
        try {
            w.b(null);
            Object objD = aj.d(new AutoCloseables$useEachIndexedAsync$deferred$1$1$1(rVar, i2, autoCloseable, null), null);
            h.a.r.y(autoCloseable, null);
            return objD;
        } finally {
        }
    }
}
