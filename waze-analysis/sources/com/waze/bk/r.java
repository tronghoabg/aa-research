package com.waze.bk;

import android.util.Size;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final h f16881a;

    /* renamed from: b, reason: collision with root package name */
    private final k f16882b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f16883c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue f16884d;

    /* renamed from: e, reason: collision with root package name */
    private final Semaphore f16885e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f16886f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16887g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f16888h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Size f16889i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f16890j;

    /* renamed from: k, reason: collision with root package name */
    private final j f16891k;

    public r(h hVar, k kVar, h.c.j jVar) {
        x.f(hVar, "renderer");
        x.f(kVar, "surfaceInterface");
        x.f(jVar, "uiContext");
        this.f16881a = hVar;
        this.f16882b = kVar;
        this.f16884d = new LinkedBlockingQueue();
        this.f16885e = new Semaphore(0);
        this.f16886f = new LinkedBlockingQueue();
        bn bnVarB = ck.b(null);
        this.f16888h = bnVarB;
        this.f16890j = ai.U(bnVarB);
        this.f16891k = new q(this, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        ArrayList arrayList = new ArrayList();
        this.f16884d.drainTo(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof m) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            l(n.f16872a);
            try {
                r rVar = this;
                boolean zTryAcquire = false;
                while (!this.f16883c && !zTryAcquire) {
                    zTryAcquire = this.f16885e.tryAcquire(0L, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                e.b.c.a(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(com.waze.bi.i iVar) {
        boolean zOffer = false;
        while (!this.f16883c && !zOffer) {
            try {
                zOffer = this.f16884d.offer(iVar, 0L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                e.b.c.a(th);
                return;
            }
        }
    }

    public final ch b() {
        return this.f16890j;
    }

    public final void e() {
        this.f16883c = true;
    }

    public final void f() {
        k();
        this.f16883c = true;
        this.f16882b.i(this.f16891k);
    }

    public final void g() {
        this.f16882b.h(this.f16891k);
    }

    public final boolean i() {
        ArrayList arrayList = new ArrayList();
        this.f16884d.drainTo(arrayList);
        if (!arrayList.isEmpty()) {
            if (arrayList.contains(n.f16872a)) {
                this.f16881a.i();
                this.f16885e.release();
                this.f16887g = false;
                this.f16888h.e(null);
            } else {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof m) {
                        arrayList3.add(obj);
                    }
                }
                m mVar = (m) h.a.i.U(arrayList3);
                if (mVar != null) {
                    this.f16881a.h(mVar.k(), mVar.j(), mVar.i(), mVar.h());
                    this.f16887g = true;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (obj2 instanceof o) {
                        arrayList4.add(obj2);
                    }
                }
                o oVar = (o) h.a.i.U(arrayList4);
                if (oVar != null) {
                    this.f16881a.g(oVar.j(), oVar.i(), oVar.h());
                }
            }
        }
        if (!this.f16887g || !this.f16881a.l()) {
            return false;
        }
        bn bnVar = this.f16888h;
        Size size = this.f16889i;
        bnVar.e(size != null ? new l(size) : null);
        ArrayList arrayList5 = new ArrayList();
        this.f16886f.drainTo(arrayList5);
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        return true;
    }
}
