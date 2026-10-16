package defpackage;

import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class hqi extends Thread {
    private static final boolean b = hrf.b;
    public final BlockingQueue a;
    private final BlockingQueue c;
    private final hqz d;
    private volatile boolean e = false;
    private final tsu f;
    private final kzt g;

    public hqi(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, tsu tsuVar, hqz hqzVar) {
        this.c = blockingQueue;
        this.a = blockingQueue2;
        this.f = tsuVar;
        this.d = hqzVar;
        this.g = new kzt(this, blockingQueue2, hqzVar);
    }

    private void b() throws InterruptedException {
        List arrayList;
        List list;
        hqt hqtVar = (hqt) this.c.take();
        hqtVar.e("cache-queue-take");
        hqtVar.n();
        try {
            if (hqtVar.k()) {
                hqtVar.h("cache-discard-canceled");
            } else {
                tsu tsuVar = this.f;
                hqh hqhVarC = tsuVar.c(hqtVar.c());
                if (hqhVarC == null) {
                    hqtVar.e("cache-miss");
                    if (!this.g.j(hqtVar)) {
                        this.a.put(hqtVar);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (hqhVarC.a(jCurrentTimeMillis)) {
                        hqtVar.e("cache-hit-expired");
                        hqtVar.k = hqhVarC;
                        if (!this.g.j(hqtVar)) {
                            this.a.put(hqtVar);
                        }
                    } else {
                        hqtVar.e("cache-hit");
                        byte[] bArr = hqhVarC.a;
                        Map map = hqhVarC.g;
                        if (map == null) {
                            list = null;
                        } else {
                            if (map.isEmpty()) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList(map.size());
                                for (Map.Entry entry : map.entrySet()) {
                                    arrayList.add(new hqn((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                            list = arrayList;
                        }
                        scz sczVarO = hqtVar.o(new hqq(200, bArr, map, list, false));
                        hqtVar.e("cache-hit-parsed");
                        if (!sczVarO.d()) {
                            hqtVar.e("cache-parsing-failed");
                            tsuVar.m(hqtVar.c());
                            hqtVar.k = null;
                            if (!this.g.j(hqtVar)) {
                                this.a.put(hqtVar);
                            }
                        } else if (hqhVarC.f < jCurrentTimeMillis) {
                            hqtVar.e("cache-hit-refresh-needed");
                            hqtVar.k = hqhVarC;
                            sczVarO.b = true;
                            boolean zJ = this.g.j(hqtVar);
                            hqz hqzVar = this.d;
                            if (zJ) {
                                hqzVar.b(hqtVar, sczVarO);
                            } else {
                                hhw hhwVar = new hhw(this, hqtVar, 7, (byte[]) null);
                                String str = zsy.c;
                                if (zrn.e(str, 3)) {
                                    Log.d(str, "REQUEST: " + zsy.e(hqtVar) + "\nRESPONSE: " + zsy.f(sczVarO));
                                }
                                if (hqtVar.i && sczVarO.d()) {
                                    ((zso) hqzVar).a.c(hqtVar.c, sczVarO);
                                }
                                ((zso) hqzVar).b.c(hqtVar, sczVarO, hhwVar);
                            }
                        } else {
                            this.d.b(hqtVar, sczVarO);
                        }
                    }
                }
            }
        } finally {
            hqtVar.n();
        }
    }

    public final void a() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (b) {
            hrf.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f.f();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                hrf.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
