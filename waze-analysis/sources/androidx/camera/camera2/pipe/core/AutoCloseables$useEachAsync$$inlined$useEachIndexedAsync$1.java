package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import h.g.b.w;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1 extends g implements p<af, e, Object> {
    final /* synthetic */ q $action$inlined;
    final /* synthetic */ AutoCloseable $closeable;
    final /* synthetic */ int $i;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends g implements p<af, e, Object> {
        final /* synthetic */ q $action$inlined;
        final /* synthetic */ int $i;
        final /* synthetic */ AutoCloseable $it;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i2, AutoCloseable autoCloseable, e eVar, q qVar) {
            super(2, eVar);
            this.$i = i2;
            this.$it = autoCloseable;
            this.$action$inlined = qVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$i, this.$it, eVar, this.$action$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
            AutoCloseable autoCloseable = this.$it;
            q qVar = this.$action$inlined;
            this.label = 1;
            Object objInvoke = qVar.invoke(afVar, autoCloseable, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$action$inlined.invoke((af) this.L$0, this.$it, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1(AutoCloseable autoCloseable, int i2, e eVar, q qVar) {
        super(2, eVar);
        this.$closeable = autoCloseable;
        this.$i = i2;
        this.$action$inlined = qVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1(this.$closeable, this.$i, eVar, this.$action$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        AutoCloseable autoCloseable;
        int i2;
        AutoCloseable autoCloseable2;
        Throwable th;
        AutoCloseable autoCloseable3;
        a aVar = a.f48038a;
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.I$0;
                autoCloseable2 = (AutoCloseable) this.L$1;
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
                    r.y(autoCloseable3, null);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            try {
                throw th;
            } catch (Throwable th4) {
                r.y(autoCloseable3, th);
                throw th4;
            }
        }
        c.b(obj);
        autoCloseable = this.$closeable;
        i2 = this.$i;
        try {
            this.L$0 = autoCloseable;
            this.L$1 = autoCloseable;
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i2, autoCloseable2, null, this.$action$inlined);
        this.L$0 = autoCloseable;
        this.L$1 = null;
        this.label = 2;
        Object objD = aj.d(anonymousClass1, this);
        if (objD != aVar) {
            AutoCloseable autoCloseable6 = autoCloseable;
            obj = objD;
            autoCloseable3 = autoCloseable6;
            r.y(autoCloseable3, null);
            return obj;
        }
        return aVar;
    }

    public final Object invokeSuspend$$forInline(Object obj) throws Exception {
        int i2 = this.$i;
        AutoCloseable autoCloseable = this.$closeable;
        try {
            w.b(this);
            Object objD = aj.d(new AnonymousClass1(i2, autoCloseable, null, this.$action$inlined), this);
            r.y(autoCloseable, null);
            return objD;
        } finally {
        }
    }
}
