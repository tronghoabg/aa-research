package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class hqw {
    public final hqz e;
    public hqi g;
    public final tsu i;
    public final ieb j;
    public final AtomicInteger a = new AtomicInteger();
    public final Set b = new HashSet();
    public final PriorityBlockingQueue c = new PriorityBlockingQueue();
    public final PriorityBlockingQueue d = new PriorityBlockingQueue();
    public final List h = new ArrayList();
    private final List k = new ArrayList();
    public final hqo[] f = new hqo[4];

    public hqw(tsu tsuVar, ieb iebVar, hqz hqzVar) {
        this.i = tsuVar;
        this.j = iebVar;
        this.e = hqzVar;
    }

    public void a(hqt hqtVar) {
        throw null;
    }

    public final void b() {
        List list = this.k;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((hqu) it.next()).a();
            }
        }
    }
}
