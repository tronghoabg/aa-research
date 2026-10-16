package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xti {
    public final xtf a;
    public final zhc d;
    private final Executor f;
    public final AtomicLong b = new AtomicLong(-9223372034707292160L);
    public final AtomicReference c = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);

    public xti(zfj zfjVar, Executor executor) {
        zfq zfqVar = zfq.a;
        this.f = new zhb(zfqVar);
        zhc zhcVar = new zhc();
        this.d = zhcVar;
        xtf xtfVar = new xtf(zfjVar, executor);
        this.a = xtfVar;
        zhcVar.c(xtfVar, zfqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Runnable, zhk] */
    public final zgp a() {
        AtomicLong atomicLong;
        long j;
        final int i;
        zer zerVar;
        zhc zhcVar = this.d;
        if (zhcVar.isDone()) {
            return zhcVar;
        }
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (i << 32) | ((((int) j) + 1) & 4294967295L)));
        final zhc zhcVar2 = new zhc();
        zgp zgpVar = (zgp) this.e.getAndSet(zhcVar2);
        if (zgpVar == null) {
            zfj zfjVar = new zfj() { // from class: xtc
                @Override // defpackage.zfj
                public final zgp a() {
                    return this.a.b(i);
                }
            };
            int i2 = xur.a;
            ?? zhkVar = new zhk(new zfv(xts.e(), zfjVar, 1));
            zhkVar.run();
            zerVar = zhkVar;
        } else {
            zfk zfkVar = new zfk() { // from class: xtd
                @Override // defpackage.zfk
                public final zgp a(Object obj) {
                    return this.a.b(i);
                }
            };
            int i3 = xur.a;
            xup xupVar = new xup(xts.e(), zfkVar);
            Executor executor = this.f;
            int i4 = zet.d;
            zer zerVar2 = new zer(zgpVar, Throwable.class, xupVar);
            zgpVar.c(zerVar2, yrm.aK(executor, zerVar2));
            zerVar = zerVar2;
        }
        zhcVar2.r(zerVar);
        final xtg xtgVar = new xtg(this, i);
        zhcVar2.c(new Runnable() { // from class: xte
            @Override // java.lang.Runnable
            public final void run() {
                xtg xtgVar2 = xtgVar;
                zhc zhcVar3 = zhcVar2;
                try {
                    woy.ad(zhcVar3.isDone(), "Future was expected to be done: %s", zhcVar3);
                    Object objL = a.L(zhcVar3);
                    zhc zhcVar4 = this.a.d;
                    zhcVar4.o(objL);
                    xtgVar2.r(zhcVar4);
                } catch (Throwable unused) {
                    xtgVar2.r(zhcVar3);
                }
            }
        }, zfq.a);
        return xtgVar;
    }

    public final zgp b(int i) {
        AtomicReference atomicReference;
        xth xthVar;
        AtomicLong atomicLong = this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            zgk zgkVar = zgk.a;
            return zgkVar == null ? new zgk() : zgkVar;
        }
        xth xthVar2 = new xth(i);
        do {
            atomicReference = this.c;
            xthVar = (xth) atomicReference.get();
            if (xthVar != null && xthVar.a > i) {
                zgk zgkVar2 = zgk.a;
                return zgkVar2 == null ? new zgk() : zgkVar2;
            }
        } while (!a.h(atomicReference, xthVar, xthVar2));
        if (((int) (atomicLong.get() >>> 32)) > i) {
            xthVar2.cancel(true);
            a.h(atomicReference, xthVar2, null);
            return xthVar2;
        }
        xtf xtfVar = this.a;
        zfj zfjVar = xtfVar.a;
        Executor executor = xtfVar.b;
        if (zfjVar == null || executor == null) {
            xthVar2.r(this.d);
            return xthVar2;
        }
        int i2 = xur.a;
        zhk zhkVar = new zhk(new zfv(xts.e(), zfjVar, 1));
        executor.execute(zhkVar);
        xthVar2.r(zhkVar);
        return xthVar2;
    }
}
