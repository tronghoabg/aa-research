package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zvm {
    public final Executor a;
    public final zys b;
    public zvs c;
    public vfu d;
    public sm e;

    public zvm(zys zysVar) {
        Executor executorB = zrz.b();
        this.b = zysVar;
        this.a = executorB;
        synchronized (this) {
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    public final synchronized void a(sm smVar) {
        this.e = smVar;
    }
}
