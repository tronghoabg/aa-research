package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xuo {
    public final defpackage.xul a;
    public final defpackage.zif d;
    private final java.util.concurrent.Executor f;
    public final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(-9223372034707292160L);
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference(null);

    public xuo(defpackage.zgm zgmVar, java.util.concurrent.Executor executor) {
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        this.f = new defpackage.zie(zgtVar);
        defpackage.zif zifVar = new defpackage.zif();
        this.d = zifVar;
        defpackage.xul xulVar = new defpackage.xul(zgmVar, executor);
        this.a = xulVar;
        zifVar.c(xulVar, zgtVar);
    }

    public final defpackage.zhs a() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        final int i;
        defpackage.zhs zhsVar;
        defpackage.zif zifVar = this.d;
        if (zifVar.isDone()) {
            return zifVar;
        }
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) i) << 32) | (((long) (((int) j) + 1)) & 4294967295L)));
        final defpackage.zif zifVar2 = new defpackage.zif();
        defpackage.zhs zhsVar2 = (defpackage.zhs) this.e.getAndSet(zifVar2);
        if (zhsVar2 == null) {
            defpackage.zgm zgmVar = new defpackage.zgm() { // from class: xui
                @Override // defpackage.zgm
                public final defpackage.zhs a() {
                    return this.a.b(i);
                }
            };
            int i2 = defpackage.xvx.a;
            defpackage.zim zimVar = new defpackage.zim(new defpackage.zgy(defpackage.xuy.e(), zgmVar, 1));
            zimVar.run();
            zhsVar = zimVar;
        } else {
            xuj xujVar = new xuj(this, i);
            int i3 = defpackage.xvx.a;
            defpackage.xvv xvvVar = new defpackage.xvv(defpackage.xuy.e(), xujVar);
            java.util.concurrent.Executor executor = this.f;
            int i4 = defpackage.zfz.d;
            defpackage.zfx zfxVar = new defpackage.zfx(zhsVar2, java.lang.Throwable.class, xvvVar);
            zhsVar2.c(zfxVar, defpackage.ysr.ch(executor, zfxVar));
            zhsVar = zfxVar;
        }
        zifVar2.r(zhsVar);
        final defpackage.xum xumVar = new defpackage.xum(this, i);
        zifVar2.c(new java.lang.Runnable() { // from class: xuk
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.xum xumVar2 = xumVar;
                defpackage.zif zifVar3 = zifVar2;
                try {
                    defpackage.ysr.bn(zifVar3.isDone(), "Future was expected to be done: %s", zifVar3);
                    java.lang.Object objK = defpackage.a.K(zifVar3);
                    defpackage.zif zifVar4 = this.a.d;
                    zifVar4.o(objK);
                    xumVar2.r(zifVar4);
                } catch (java.lang.Throwable unused) {
                    xumVar2.r(zifVar3);
                }
            }
        }, defpackage.zgt.INSTANCE);
        return xumVar;
    }

    public final defpackage.zhs b(int i) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.xun xunVar;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            defpackage.zhn zhnVar = defpackage.zhn.a;
            return zhnVar == null ? new defpackage.zhn() : zhnVar;
        }
        defpackage.xun xunVar2 = new defpackage.xun(i);
        do {
            atomicReference = this.c;
            xunVar = (defpackage.xun) atomicReference.get();
            if (xunVar != null && xunVar.a > i) {
                defpackage.zhn zhnVar2 = defpackage.zhn.a;
                return zhnVar2 == null ? new defpackage.zhn() : zhnVar2;
            }
        } while (!defpackage.a.g(atomicReference, xunVar, xunVar2));
        if (((int) (atomicLong.get() >>> 32)) > i) {
            xunVar2.cancel(true);
            defpackage.a.g(atomicReference, xunVar2, null);
            return xunVar2;
        }
        defpackage.xul xulVar = this.a;
        defpackage.zgm zgmVar = xulVar.a;
        java.util.concurrent.Executor executor = xulVar.b;
        if (zgmVar == null || executor == null) {
            xunVar2.r(this.d);
            return xunVar2;
        }
        int i2 = defpackage.xvx.a;
        defpackage.zim zimVar = new defpackage.zim(new defpackage.zgy(defpackage.xuy.e(), zgmVar, 1));
        executor.execute(zimVar);
        xunVar2.r(zimVar);
        return xunVar2;
    }
}
