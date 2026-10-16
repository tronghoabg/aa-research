package com.bytedance.sdk.component.ivm.uef.oa;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.ivm.uef.lw;
import com.bytedance.sdk.component.ivm.uef.xs;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class moa {
    private volatile com.bytedance.sdk.component.ivm.uef.oa.oa.yo cz;
    private final Comparator<com.bytedance.sdk.component.ivm.uef.moa.uef> dj;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.ivm.uef.moa.uef> wrv;
    private volatile Handler zjm;
    public static final moa uef = new moa();
    public static final com.bytedance.sdk.component.ivm.uef.oa.uef.uef moa = new com.bytedance.sdk.component.ivm.uef.oa.uef.uef();
    public static final AtomicLong lw = new AtomicLong(0);
    public static final AtomicLong ivm = new AtomicLong(0);
    public static final long xs = System.currentTimeMillis();
    public static long bcc = 0;

    /* renamed from: oa, reason: collision with root package name */
    public volatile boolean f24993oa = false;
    public volatile boolean yo = false;

    private moa() {
        Comparator<com.bytedance.sdk.component.ivm.uef.moa.uef> comparator = new Comparator<com.bytedance.sdk.component.ivm.uef.moa.uef>() { // from class: com.bytedance.sdk.component.ivm.uef.oa.moa.1
            @Override // java.util.Comparator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, com.bytedance.sdk.component.ivm.uef.moa.uef uefVar2) {
                return moa.this.uef(uefVar, uefVar2);
            }
        };
        this.dj = comparator;
        this.wrv = new PriorityBlockingQueue<>(8, comparator);
    }

    public void lw() {
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(moa.oyt(), 1);
        final com.bytedance.sdk.component.ivm.uef.oa.oa.yo yoVar = this.cz;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (yoVar != null) {
                yoVar.yo(2);
                return;
            }
            return;
        }
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk != null) {
            Executor executorMoa = lwVarWk.moa();
            if (executorMoa == null) {
                executorMoa = lwVarWk.lw();
            }
            if (executorMoa != null) {
                executorMoa.execute(new com.bytedance.sdk.component.ivm.uef.lw.lw("flush") { // from class: com.bytedance.sdk.component.ivm.uef.oa.moa.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.ivm.uef.oa.oa.yo yoVar2 = yoVar;
                        if (yoVar2 != null) {
                            yoVar2.yo(2);
                        }
                    }
                });
            }
        }
    }

    public boolean moa() {
        try {
            if (this.cz != null || com.bytedance.sdk.component.ivm.uef.oa.oa()) {
                return false;
            }
            synchronized (this) {
                if (this.cz != null) {
                    return false;
                }
                this.cz = new com.bytedance.sdk.component.ivm.uef.oa.oa.yo(this.wrv);
                this.cz.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void oa() {
        moa();
        lw();
    }

    public void yo() {
        if (this.cz == null || !this.cz.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.cz != null && this.cz.isAlive()) {
                    if (this.zjm != null) {
                        this.zjm.removeCallbacksAndMessages(null);
                    }
                    this.cz.uef(false);
                    this.cz.quitSafely();
                    this.cz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.ivm.uef.moa.uef> uef() {
        return this.wrv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, com.bytedance.sdk.component.ivm.uef.moa.uef uefVar2) {
        long jUef;
        long jOa;
        long jOa2;
        long jUef2;
        if (uefVar == null) {
            return uefVar2 == null ? 0 : -1;
        }
        if (uefVar2 == null) {
            return 1;
        }
        if (uefVar.lw() == uefVar2.lw()) {
            if (uefVar.uef() != null) {
                jUef = uefVar.uef().uef();
                jOa = uefVar.uef().oa();
            } else {
                jUef = 0;
                jOa = 0;
            }
            if (uefVar2.uef() != null) {
                jUef2 = uefVar2.uef().uef();
                jOa2 = uefVar2.uef().oa();
            } else {
                jOa2 = 0;
                jUef2 = 0;
            }
            if (jUef == 0 || jUef2 == 0) {
                return 0;
            }
            long j8 = jUef - jUef2;
            if (Math.abs(j8) > 2147483647L) {
                return 0;
            }
            if (j8 != 0) {
                return (int) j8;
            }
            if (jOa == 0 || jOa2 == 0) {
                return 0;
            }
            return (int) (jOa - jOa2);
        }
        return uefVar.lw() - uefVar2.lw();
    }

    public void uef(Handler handler) {
        this.zjm = handler;
    }

    public void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, int i5) {
        moa();
        lw lwVarWk = xs.ivm().wk();
        com.bytedance.sdk.component.ivm.uef.oa.oa.yo yoVar = this.cz;
        if (yoVar != null) {
            uef(lwVarWk, uefVar);
            yoVar.uef(uefVar, uefVar.lw() == 4);
        }
    }

    private void uef(final lw lwVar, com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) {
        if (lwVar != null) {
            try {
                if (lwVar.xs()) {
                    final long jOa = (uefVar == null || uefVar.uef() == null) ? 0L : uefVar.uef().oa();
                    if (jOa == 1) {
                        bcc = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongVyg = moa.vyg();
                    com.bytedance.sdk.component.ivm.uef.yo.oa.uef(atomicLongVyg, 1);
                    if (atomicLongVyg.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorMoa = lwVar.moa();
                                if (executorMoa == null) {
                                    executorMoa = lwVar.lw();
                                }
                                if (executorMoa != null) {
                                    executorMoa.execute(new com.bytedance.sdk.component.ivm.uef.lw.lw("report") { // from class: com.bytedance.sdk.component.ivm.uef.oa.moa.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            moa.this.uef(lwVar, jOa);
                                        }
                                    });
                                }
                            } else {
                                uef(lwVar, jOa);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(lw lwVar, long j8) {
        com.bytedance.sdk.component.ivm.uef.oa.oa.yo yoVar = this.cz;
        if (lwVar == null || yoVar == null) {
            return;
        }
        com.bytedance.sdk.component.ivm.uef.oa.uef.uef uefVar = moa;
        yoVar.uef(lwVar.uef(uefVar.oa(j8)), true);
        uefVar.gem();
    }
}
