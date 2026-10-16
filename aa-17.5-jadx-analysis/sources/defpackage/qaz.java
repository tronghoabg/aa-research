package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class qaz {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;

    public qaz(tmb tmbVar) {
        this.c = new ArrayList();
        this.a = Duration.ZERO;
        this.b = Duration.ZERO;
        this.d = tmbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void a(zgt zgtVar) {
        ?? r0 = this.d;
        if (r0 != 0) {
            this.b = Duration.ofMillis(r0.a());
        }
        synchronized (this) {
            for (pwz pwzVar : this.c) {
                Duration duration = pwz.a;
                if (!pwzVar.A.isDone()) {
                    lws.M(zgtVar.schedule(new pru(pwzVar, 11), pwz.a.toMillis(), TimeUnit.MILLISECONDS), zgtVar);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tmb] */
    public final void b() {
        ?? r0 = this.d;
        if (r0 != 0) {
            this.a = Duration.ofMillis(r0.a());
        }
    }

    public qaz(tmb tmbVar, erb erbVar) {
        this.a = null;
        this.b = null;
        this.c = tmbVar;
        this.d = erbVar;
    }
}
