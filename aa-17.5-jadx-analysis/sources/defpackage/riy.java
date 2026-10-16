package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class riy {
    public static final ypf a = ols.R("CAR.DIAGNOSTICS");
    public final Object b;
    public final Callable c;
    public List d;
    private final ExecutorService e;

    public riy(Callable callable) {
        spu spuVar = ssr.a;
        ExecutorService executorServiceAF = spu.aF(1);
        this.b = new Object();
        this.c = callable;
        this.e = executorServiceAF;
    }

    public final void a(rje rjeVar) {
        synchronized (this.b) {
            if (this.d == null) {
                a.l().ai(8174).u("startFetchingLocked");
                this.e.execute(new ral(this, 16, null));
                this.d = new ArrayList();
            }
            this.d.add(rjeVar);
        }
    }
}
