package defpackage;

import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class rui implements ruh {
    public final AtomicReference a = new AtomicReference();
    public final ruj b;

    public rui(ruj rujVar) {
        this.b = rujVar;
    }

    private final ruh g() {
        ruh ruhVar = (ruh) this.a.get();
        if (ruhVar != null) {
            return ruhVar;
        }
        throw new IllegalStateException("MediaSourceFlowController has not been initialized.");
    }

    @Override // defpackage.ruh
    public final int a() {
        ruh ruhVar = (ruh) this.a.get();
        if (ruhVar != null) {
            return ruhVar.a();
        }
        return 0;
    }

    @Override // defpackage.ruh
    public final void b(PrintWriter printWriter) {
        ruh ruhVar = (ruh) this.a.get();
        if (ruhVar != null) {
            ruhVar.b(printWriter);
        }
    }

    @Override // defpackage.ruh
    public final void c() {
        ruh ruhVar = (ruh) this.a.get();
        if (ruhVar != null) {
            ruhVar.c();
        }
    }

    @Override // defpackage.ruh
    public final void d(List list) {
        g().d(list);
    }

    @Override // defpackage.ruh
    public final void e() {
        g().e();
    }

    @Override // defpackage.ruh
    public final boolean f() throws InterruptedException {
        return g().f();
    }
}
