package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class utk implements uyl {
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);

    public final uvj a() {
        uvj uvjVar = (uvj) this.a.poll();
        c();
        return uvjVar;
    }

    public final void c() {
        int size = this.a.size();
        String[] strArr = vaq.a;
        fdi.a("EntityQueueBuffer", size);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
