package com.bytedance.sdk.component.ivm.uef.oa.oa;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.ivm.uef.lw;
import com.bytedance.sdk.component.ivm.uef.uef.moa;
import com.bytedance.sdk.component.ivm.uef.xs;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yo extends HandlerThread implements Handler.Callback {
    private static int bs = 10;
    private static int oib = 200;

    /* renamed from: ab, reason: collision with root package name */
    private final AtomicInteger f24998ab;
    private volatile long bcc;
    private volatile Handler cq;
    private final AtomicInteger cz;
    private final int dhk;
    private final long dj;
    private final List<com.bytedance.sdk.component.ivm.uef.moa.uef> dz;
    private volatile int ivm;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.ivm.uef.moa.uef> lw;
    private com.bytedance.sdk.component.ivm.uef.oa.yo moa;

    /* renamed from: oa, reason: collision with root package name */
    private volatile boolean f24999oa;
    private final int orq;
    private long sy;
    private final int tpx;
    protected moa uef;
    private final AtomicInteger wk;
    private final AtomicInteger wrv;
    private volatile long xs;
    private final Object yo;
    private final long zjm;

    public yo(PriorityBlockingQueue<com.bytedance.sdk.component.ivm.uef.moa.uef> priorityBlockingQueue) {
        super("csj_log");
        this.f24999oa = true;
        this.yo = new Object();
        this.xs = 0L;
        this.bcc = 0L;
        this.cz = new AtomicInteger(0);
        this.zjm = 5000L;
        this.dj = 5000000000L;
        this.wrv = new AtomicInteger(0);
        this.dz = new ArrayList();
        this.wk = new AtomicInteger(0);
        this.f24998ab = new AtomicInteger(0);
        this.sy = 60000L;
        this.dhk = 1;
        this.tpx = 2;
        this.orq = 3;
        this.lw = priorityBlockingQueue;
        this.uef = new com.bytedance.sdk.component.ivm.uef.uef.oa();
        if (com.bytedance.sdk.component.ivm.uef.oa.oa()) {
            return;
        }
        long jWrv = xs.ivm().wk().wrv();
        if (jWrv > 0) {
            this.sy = jWrv;
        }
    }

    private boolean bcc() {
        if (com.bytedance.sdk.component.ivm.uef.oa.moa.uef.f24993oa) {
            return this.ivm == 4 || this.ivm == 7 || this.ivm == 6 || this.ivm == 5 || this.ivm == 2;
        }
        return false;
    }

    private void cz() {
        try {
            if (this.lw.size() == 0 && this.cq.hasMessages(11) && uef()) {
                uef(false);
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
    }

    private void ivm() {
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.orq(), 1);
        uef(false);
        com.bytedance.sdk.component.ivm.uef.oa.moa.uef.yo();
    }

    private void lw() {
        while (uef()) {
            try {
                com.bytedance.sdk.component.ivm.uef.oa.uef.uef uefVar = com.bytedance.sdk.component.ivm.uef.oa.moa.moa;
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.bcc(), 1);
                com.bytedance.sdk.component.ivm.uef.moa.uef uefVarPoll = this.lw.poll(this.sy, TimeUnit.MILLISECONDS);
                int size = this.lw.size();
                if (uefVarPoll instanceof com.bytedance.sdk.component.ivm.uef.moa.oa) {
                    uef(uefVarPoll, size);
                } else if (uefVarPoll == null) {
                    int iIncrementAndGet = this.cz.incrementAndGet();
                    com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.swd(), 1);
                    if (moa(iIncrementAndGet)) {
                        ivm();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.ivm = 1;
                        oa((com.bytedance.sdk.component.ivm.uef.moa.uef) null);
                    }
                } else {
                    uef(uefVarPoll);
                    oa(uefVarPoll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.gb(), 1);
            }
        }
    }

    private void moa() {
        if (!isAlive()) {
            com.bytedance.sdk.component.ivm.uef.oa.moa.uef.moa();
        } else {
            if (uef()) {
                return;
            }
            yo(6);
        }
    }

    private void xs() throws JSONException {
        if (this.lw.size() >= 100) {
            for (int i5 = 0; i5 < 100; i5++) {
                com.bytedance.sdk.component.ivm.uef.moa.uef uefVarPoll = this.lw.poll();
                if (!(uefVarPoll instanceof com.bytedance.sdk.component.ivm.uef.moa.oa) && uefVarPoll != null) {
                    uef(uefVarPoll);
                }
            }
        }
    }

    private void yo() {
        moa();
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.km(), 1);
        yo(1);
    }

    private void zjm() {
        long jNanoTime;
        com.bytedance.sdk.component.ivm.uef.oa.moa moaVar;
        if (this.cq.hasMessages(11)) {
            cz();
        } else {
            lw(1);
        }
        com.bytedance.sdk.component.ivm.uef.oa.uef.uef uefVar = com.bytedance.sdk.component.ivm.uef.oa.moa.moa;
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.oa(), 1);
        if (this.ivm == 2) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.xs(), 1);
            synchronized (this.yo) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.yo.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        moaVar = com.bytedance.sdk.component.ivm.uef.oa.moa.uef;
                        if (!moaVar.f24993oa) {
                            boolean z2 = moaVar.yo;
                        }
                    } catch (InterruptedException e7) {
                        e7.getMessage();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!moaVar.f24993oa && !moaVar.yo) {
                            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.pu(), 1);
                            yo(2);
                            return;
                        }
                        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.dj(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.zjm(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i5 = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i5 == 1) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.cz(), 1);
            oa();
            uef(true);
            lw();
        } else {
            if (i5 != 2 && i5 != 3) {
                if (i5 == 11) {
                    ArrayList arrayList = new ArrayList(this.dz);
                    this.dz.clear();
                    uef((List<com.bytedance.sdk.component.ivm.uef.moa.uef>) arrayList, false, "timeout_dispatch");
                    zjm();
                }
                return true;
            }
            yo();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.cq = new Handler(getLooper(), this);
        com.bytedance.sdk.component.ivm.uef.oa.moa.uef.uef(this.cq);
        this.cq.sendEmptyMessage(1);
    }

    public static void oa(int i5) {
        oib = i5;
    }

    private void oa() {
        long jAb = xs.ivm().ab();
        if (jAb <= 0) {
            return;
        }
        this.uef.uef(f.API_PRIORITY_OTHER, jAb);
    }

    public static void uef(int i5) {
        bs = i5;
    }

    public void yo(int i5) {
        try {
            boolean zUef = uef(i5, com.bytedance.sdk.component.ivm.uef.oa.moa.uef.f24993oa);
            if (i5 != 6 && !zUef) {
                return;
            }
            com.bytedance.sdk.component.ivm.uef.moa.oa oaVar = new com.bytedance.sdk.component.ivm.uef.moa.oa();
            oaVar.uef(i5);
            this.lw.add(oaVar);
            lw(3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean moa(int i5) {
        if (i5 < 4 || this.wrv.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.ivm.uef.oa.moa moaVar = com.bytedance.sdk.component.ivm.uef.oa.moa.uef;
        return (moaVar.f24993oa || moaVar.yo) ? false : true;
    }

    private void oa(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) {
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef;
        if (com.bytedance.sdk.component.ivm.uef.yo.uef.oa() && xs.ivm().uef()) {
            return;
        }
        int i5 = 0;
        if (bcc()) {
            com.bytedance.sdk.component.ivm.uef.yo.uef.uef(this.ivm);
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.wrv(), 1);
            if (this.lw.size() != 0) {
                return;
            }
            if (!this.cq.hasMessages(2)) {
                com.bytedance.sdk.component.ivm.uef.oa.moa.uef.f24993oa = false;
                this.bcc = 0L;
                this.xs = 0L;
                this.wk.set(0);
                this.f24998ab.set(0);
            } else {
                uef(false);
                return;
            }
        }
        do {
            boolean zUef = uef(this.ivm, com.bytedance.sdk.component.ivm.uef.oa.moa.uef.f24993oa);
            com.bytedance.sdk.component.ivm.uef.yo.uef.uef(zUef, this.ivm, uefVar);
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.cq(), 1);
            if (zUef && (listUef = this.uef.uef(this.ivm, -1, null)) != null) {
                listUef.size();
                uef(listUef);
            } else {
                cz();
            }
            i5++;
            if (!zUef) {
                return;
            }
        } while (i5 <= 6);
    }

    public void uef(boolean z2) {
        this.f24999oa = z2;
    }

    public boolean uef() {
        return this.f24999oa;
    }

    public boolean uef(int i5, boolean z2) {
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || !lwVarWk.uef(xs.ivm().lw())) {
            return false;
        }
        return this.uef.uef(i5, z2);
    }

    public void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, boolean z2) {
        if (uefVar == null) {
            return;
        }
        uefVar.moa();
        if (z2) {
            if (this.cq != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(uefVar);
                uef((List<com.bytedance.sdk.component.ivm.uef.moa.uef>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.lw.add(uefVar);
        lw(2);
    }

    private void lw(int i5) {
        if (!uef()) {
            if (this.cq == null) {
                return;
            }
            com.bytedance.sdk.component.ivm.uef.oa.uef.uef uefVar = com.bytedance.sdk.component.ivm.uef.oa.moa.moa;
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.yo(), 1);
            if (this.cq.hasMessages(1)) {
                return;
            }
            if (i5 == 1) {
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.ivm(), 1);
            } else if (i5 == 2) {
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.moa(), 1);
            } else if (i5 == 3) {
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar.lw(), 1);
            }
            this.cq.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.uef(), 1);
    }

    private void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, int i5) throws JSONException {
        this.cz.set(0);
        if (i5 == 0) {
            this.ivm = ((com.bytedance.sdk.component.ivm.uef.moa.oa) uefVar).zjm();
            if (this.ivm != 6) {
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.rl(), 1);
                oa(uefVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.ivm.uef.moa.oa oaVar = (com.bytedance.sdk.component.ivm.uef.moa.oa) uefVar;
        if (oaVar.zjm() == 1) {
            this.ivm = 1;
            oa(uefVar);
        } else if (oaVar.zjm() == 2) {
            xs();
            this.ivm = 2;
            oa(uefVar);
        }
    }

    private void oa(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        this.dz.addAll(list);
        this.dz.size();
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk != null && lwVarWk.dj() != null) {
            bs = lwVarWk.dj().oa();
        }
        if (this.dz.size() >= bs) {
            if (this.cq.hasMessages(11)) {
                this.cq.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.dz);
            this.dz.clear();
            uef((List<com.bytedance.sdk.component.ivm.uef.moa.uef>) arrayList, false, "max_size_dispatch");
            zjm();
            return;
        }
        if (this.lw.size() == 0) {
            uef(false);
            if (this.cq.hasMessages(11)) {
                this.cq.removeMessages(11);
            }
            if (this.cq.hasMessages(1)) {
                this.cq.removeMessages(1);
            }
            long jUef = oib;
            if (lwVarWk != null && lwVarWk.dj() != null) {
                jUef = lwVarWk.dj().uef();
            }
            this.cq.sendEmptyMessageDelayed(11, jUef);
            return;
        }
        this.dz.size();
    }

    private void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) throws JSONException {
        this.cz.set(0);
        com.bytedance.sdk.component.ivm.uef.oa.moa moaVar = com.bytedance.sdk.component.ivm.uef.oa.moa.uef;
        if (moaVar.f24993oa) {
            this.ivm = 5;
        } else if (moaVar.yo) {
            this.ivm = 7;
        } else {
            this.ivm = 4;
        }
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.uqx(), 1);
        this.uef.uef(uefVar, this.ivm);
        com.bytedance.sdk.component.ivm.uef.yo.uef.xs(uefVar);
    }

    private void uef(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, String str) {
        uef(str);
        uef(list, false, str);
        zjm();
    }

    private void uef(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.ivm.uef.yo.uef.uef(list, this.lw.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.ivm.uef.yo.uef.yo()) {
                com.bytedance.sdk.component.ivm.uef.moa.uef uefVar = list.get(0);
                if (uefVar != null) {
                    if (uefVar.lw() == 1) {
                        uef(list, "highPriority");
                        return;
                    }
                    if (uefVar.moa() == 0 && uefVar.lw() == 2) {
                        if (uefVar.oa() == 3) {
                            uef(list, "version_v3");
                            return;
                        } else {
                            oa(list);
                            return;
                        }
                    }
                    if (uefVar.moa() == 1) {
                        uef(list, "stats");
                        return;
                    } else if (uefVar.moa() == 3) {
                        uef(list, "adType_v3");
                        return;
                    } else {
                        if (uefVar.moa() == 2) {
                            uef(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            uef(list, "batchRead");
            return;
        }
        cz();
    }

    private void oa(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, final boolean z2, final long j8) {
        this.wrv.incrementAndGet();
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.ou(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.ivm.uef.moa.uef> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.ivm.uef.moa.uef next = it.next();
                int iCz = next == null ? 0 : next.cz();
                if (map.get(Integer.valueOf(iCz)) == null) {
                    map.put(Integer.valueOf(iCz), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iCz))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && xs.ivm().oa() != null && xs.ivm().oa().get(num) != null) {
                    xs.ivm().oa().get(num).uef(list, new com.bytedance.sdk.component.ivm.uef.oa.oa() { // from class: com.bytedance.sdk.component.ivm.uef.oa.oa.yo.3
                        @Override // com.bytedance.sdk.component.ivm.uef.oa.oa
                        public void uef(List<uef> list2) {
                            try {
                                yo.this.wrv.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    uef uefVar = list2.get(i5);
                                    if (uefVar != null) {
                                        yo.this.uef(z2, uefVar.uef(), uefVar.oa(), j8);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.moa.uef(list, new com.bytedance.sdk.component.ivm.uef.oa.oa() { // from class: com.bytedance.sdk.component.ivm.uef.oa.oa.yo.2
                        @Override // com.bytedance.sdk.component.ivm.uef.oa.oa
                        public void uef(List<uef> list2) {
                            try {
                                yo.this.wrv.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    uef uefVar = list2.get(i5);
                                    if (uefVar != null) {
                                        yo.this.uef(z2, uefVar.uef(), uefVar.oa(), j8);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e7) {
            e7.getMessage();
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.gb(), 1);
            this.wrv.decrementAndGet();
        }
    }

    private void uef(String str) {
        if (this.cq.hasMessages(11)) {
            this.cq.removeMessages(11);
        }
        if (this.dz.size() != 0) {
            ArrayList arrayList = new ArrayList(this.dz);
            this.dz.clear();
            uef((List<com.bytedance.sdk.component.ivm.uef.moa.uef>) arrayList, false, "before_".concat(String.valueOf(str)));
            zjm();
            arrayList.size();
        }
    }

    private void uef(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, boolean z2, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.ivm.uef.yo.uef.uef(list, this.ivm, str);
        com.bytedance.sdk.component.ivm.uef.oa.yo yoVarXs = xs.ivm().xs();
        this.moa = yoVarXs;
        if (yoVarXs != null) {
            oa(list, z2, jCurrentTimeMillis);
        } else {
            uef(list, z2, jCurrentTimeMillis);
        }
    }

    private void uef(final List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, final boolean z2, final long j8) {
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk != null) {
            Executor executorLw = lwVarWk.lw();
            if (list.get(0).lw() == 1) {
                executorLw = lwVarWk.moa();
            }
            if (executorLw == null) {
                return;
            }
            this.wrv.incrementAndGet();
            executorLw.execute(new com.bytedance.sdk.component.ivm.uef.lw.lw("csj_log_upload") { // from class: com.bytedance.sdk.component.ivm.uef.oa.oa.yo.1
                @Override // java.lang.Runnable
                public void run() {
                    yo yoVar = yo.this;
                    yoVar.uef((List<com.bytedance.sdk.component.ivm.uef.moa.uef>) list, z2, j8, yoVar.ivm);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, boolean z2, long j8, int i5) {
        yo yoVar;
        Throwable th;
        com.bytedance.sdk.component.ivm.uef.moa.uef uefVar;
        oa oaVarUef;
        try {
            uefVar = list.get(0);
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.ou(), 1);
        } catch (Throwable th2) {
            th = th2;
            yoVar = this;
        }
        try {
            if (uefVar.moa() == 0) {
                oaVarUef = xs.moa().uef(list);
                uef(oaVarUef, list);
                if (oaVarUef != null) {
                    com.bytedance.sdk.component.ivm.uef.yo.uef.uef(list, oaVarUef.moa);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.ivm.uef.moa.uef> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().ivm());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e7) {
                    e7.getMessage();
                }
                oaVarUef = xs.moa().uef(jSONObject);
            }
            oa oaVar = oaVarUef;
            this.wrv.decrementAndGet();
            yoVar = this;
            try {
                yoVar.uef(z2, oaVar, list, j8);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                th.getMessage();
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.gb(), 1);
                yoVar.wrv.decrementAndGet();
            }
        } catch (Throwable th4) {
            th = th4;
            yoVar = this;
            th.getMessage();
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.gb(), 1);
            yoVar.wrv.decrementAndGet();
        }
    }

    private void uef(oa oaVar, List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        if (oaVar == null || !oaVar.uef) {
            return;
        }
        List<Object> listUef = com.bytedance.sdk.component.ivm.uef.oa.uef();
        if (list == null || listUef == null || listUef.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.ivm.uef.moa.uef uefVar : list) {
            if (uefVar.lw() == 1) {
                com.bytedance.sdk.component.ivm.uef.yo.uef.uef(uefVar);
                com.bytedance.sdk.component.ivm.uef.yo.uef.lw(uefVar);
                Iterator<Object> it = listUef.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2, oa oaVar, List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, long j8) {
        if (z2 || oaVar == null) {
            return;
        }
        int i5 = oaVar.f24996oa;
        int i10 = -2;
        if (oaVar.lw) {
            i5 = -1;
        } else if (i5 < 0) {
            i5 = -2;
        }
        if (i5 == 510 || i5 == 511) {
            i5 = -2;
        }
        if (oaVar.uef || ((i5 < 500 || i5 >= 509) && i5 <= 513 && i5 != 404)) {
            i10 = i5;
        }
        if (list != null) {
            list.size();
            this.wrv.get();
        }
        uef(i10, list, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(int r6, java.util.List<com.bytedance.sdk.component.ivm.uef.moa.uef> r7, long r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ivm.uef.oa.oa.yo.uef(int, java.util.List, long):void");
    }

    public void uef(int i5, long j8) {
        if (this.cq == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i5;
        if (i5 == 2) {
            this.cq.sendMessageDelayed(messageObtain, (((this.wk.incrementAndGet() - 1) % 4) + 1) * j8);
        } else if (i5 == 3) {
            this.cq.sendMessageDelayed(messageObtain, (((this.f24998ab.incrementAndGet() - 1) % 4) + 1) * j8);
        }
    }
}
