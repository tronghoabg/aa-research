package defpackage;

import java.util.ArrayList;
import java.util.Timer;

/* loaded from: classes2.dex */
public final class gib {
    public final Object a;
    public Object b;

    public gib() {
        this.a = new ArrayList();
    }

    public final void a() {
        Object obj = this.b;
        if (obj != null) {
            ((Timer) obj).cancel();
        }
        this.b = null;
    }

    public final void b() {
        synchronized (this.a) {
            a();
            Timer timer = new Timer(true);
            timer.schedule(new gia(this), 10000L, Long.MAX_VALUE);
            this.b = timer;
        }
    }

    public gib(afdr afdrVar) {
        this.a = afdrVar;
        b();
    }
}
