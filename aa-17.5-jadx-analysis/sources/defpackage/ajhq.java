package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ajhq {
    private ExecutorService a;
    private final ArrayDeque b = new ArrayDeque();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        if (this.a == null) {
            this.a = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ajir(String.valueOf(ajis.b).concat(" Dispatcher"), false));
        }
        executorService = this.a;
        executorService.getClass();
        return executorService;
    }

    public final void b(ajjj ajjjVar, ajjm ajjmVar, ajjj ajjjVar2) {
        List arrayList;
        ajjj ajjjVar3;
        TimeZone timeZone = ajis.a;
        boolean zIsShutdown = a().isShutdown();
        synchronized (this) {
            if (ajjmVar != null) {
                try {
                    if (!this.d.remove(ajjmVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ajjjVar2 != null) {
                ajjjVar2.a.decrementAndGet();
                if (!this.c.remove(ajjjVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (ajjjVar != null) {
                ArrayDeque arrayDeque = this.b;
                arrayDeque.add(ajjjVar);
                String strA = ajjjVar.a();
                Iterator it = this.c.iterator();
                it.getClass();
                while (true) {
                    if (it.hasNext()) {
                        ajjjVar3 = (ajjj) it.next();
                        if (affa.f(ajjjVar3.a(), strA)) {
                            break;
                        }
                    } else {
                        Iterator it2 = arrayDeque.iterator();
                        it2.getClass();
                        while (true) {
                            if (it2.hasNext()) {
                                ajjjVar3 = (ajjj) it2.next();
                                if (affa.f(ajjjVar3.a(), strA)) {
                                    break;
                                }
                            } else {
                                ajjjVar3 = null;
                                break;
                            }
                        }
                    }
                }
                if (ajjjVar3 != null) {
                    ajjjVar.a = ajjjVar3.a;
                }
            }
            if ((ajjmVar != null || ajjjVar2 != null) && (zIsShutdown || this.c.isEmpty())) {
                this.d.isEmpty();
            }
            if (!zIsShutdown) {
                arrayList = new ArrayList();
                Iterator it3 = this.b.iterator();
                it3.getClass();
                while (it3.hasNext()) {
                    ajjj ajjjVar4 = (ajjj) it3.next();
                    ArrayDeque arrayDeque2 = this.c;
                    if (arrayDeque2.size() >= 64) {
                        break;
                    }
                    if (ajjjVar4.a.get() < 5) {
                        it3.remove();
                        ajjjVar4.a.incrementAndGet();
                        ajjjVar4.getClass();
                        arrayList.add(ajjjVar4);
                        arrayDeque2.add(ajjjVar4);
                    }
                }
            } else {
                ArrayDeque arrayDeque3 = this.b;
                arrayList = woy.cf(arrayDeque3);
                arrayDeque3.clear();
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ajjj ajjjVar5 = (ajjj) arrayList.get(i);
            if (ajjjVar5 != ajjjVar) {
                ajjm ajjmVar2 = ajjjVar5.b;
            }
            if (zIsShutdown) {
                ajjjVar5.c(null);
            } else {
                ajjjVar5.b(a());
            }
        }
    }

    public final synchronized void c(ajjm ajjmVar) {
        this.d.add(ajjmVar);
    }
}
