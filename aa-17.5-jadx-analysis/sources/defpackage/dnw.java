package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dnw {
    public Object a;
    public doa b;
    public doc c = new doc();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        doc docVar = this.c;
        if (docVar != null) {
            docVar.c(runnable, executor);
        }
    }

    public final void b(Object obj) {
        this.d = true;
        doa doaVar = this.b;
        if (doaVar == null || !doaVar.b.e(obj)) {
            return;
        }
        e();
    }

    public final void c() {
        this.d = true;
        doa doaVar = this.b;
        if (doaVar == null || !doaVar.b.cancel(true)) {
            return;
        }
        e();
    }

    public final void d(Throwable th) {
        this.d = true;
        doa doaVar = this.b;
        if (doaVar == null || !doaVar.a(th)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        doc docVar;
        doa doaVar = this.b;
        if (doaVar != null && !doaVar.isDone()) {
            doaVar.a(new dnx("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(String.valueOf(this.a)))));
        }
        if (this.d || (docVar = this.c) == null) {
            return;
        }
        docVar.e(null);
    }
}
