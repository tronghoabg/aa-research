package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class qco implements qcp {
    public final Context b;
    private qcx c;
    private final ScheduledExecutorService e;
    private final boolean f;
    private final String g;
    private final qdi h;
    private final qcn i;
    private final Set d = new CopyOnWriteArraySet();
    public final Set a = new CopyOnWriteArraySet();

    public qco(zfy zfyVar) {
        zfyVar.b.getClass();
        this.e = Executors.newSingleThreadScheduledExecutor();
        this.f = true;
        this.i = new qcn();
        this.b = ((Context) zfyVar.b).getApplicationContext();
        this.h = (qdi) zfyVar.a;
        Object obj = zfyVar.c;
        if (obj == null) {
            throw new NullPointerException("serviceClassName must be specified");
        }
        this.g = (String) obj;
    }

    @Override // defpackage.qcp
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qcp) it.next()).a();
        }
    }

    public final qcx b() {
        qcx qcxVar = this.c;
        if (qcxVar != null) {
            return qcxVar;
        }
        Context context = this.b;
        qcx qcxVar2 = new qcx(context.getApplicationContext(), this.g, this.i, this, this, this.e, this.h);
        this.c = qcxVar2;
        return qcxVar2;
    }

    public final void c() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((qco) it.next()).c();
        }
    }

    public final boolean d() {
        return b().n();
    }

    public final qcq e() {
        return new qcq(this.b);
    }

    public final mbm f() {
        return new mbm(this.b, this.i);
    }

    protected final void finalize() throws Throwable {
        if (this.f) {
            this.e.shutdownNow();
        }
    }
}
