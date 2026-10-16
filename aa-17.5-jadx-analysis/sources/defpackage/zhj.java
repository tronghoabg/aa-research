package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zhj extends zgn {
    final /* synthetic */ zhk a;
    private final Callable b;

    public zhj(zhk zhkVar, Callable callable) {
        this.a = zhkVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.zgn
    public final Object a() throws Exception {
        return this.b.call();
    }

    @Override // defpackage.zgn
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.zgn
    public final void d(Throwable th) {
        this.a.p(th);
    }

    @Override // defpackage.zgn
    public final void e(Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.zgn
    public final boolean g() {
        return this.a.isDone();
    }
}
