package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zhc {
    private final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(defpackage.zho.a);
    public defpackage.zhb a = new defpackage.zhb();

    public final defpackage.zhs a(defpackage.zgm zgmVar, java.util.concurrent.Executor executor) {
        executor.getClass();
        final defpackage.zha zhaVar = new defpackage.zha(executor, this);
        defpackage.zgy zgyVar = new defpackage.zgy(zhaVar, zgmVar, 0);
        final defpackage.zif zifVar = new defpackage.zif();
        final defpackage.zhs zhsVar = (defpackage.zhs) this.b.getAndSet(zifVar);
        final defpackage.zim zimVar = new defpackage.zim(zgyVar);
        zhsVar.c(zimVar, zhaVar);
        final defpackage.zhs zhsVarCq = defpackage.ysr.cq(zimVar);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: zgx
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.zim zimVar2 = zimVar;
                if (zimVar2.isDone()) {
                    zifVar.r(zhsVar);
                } else if (zhsVarCq.isCancelled() && zhaVar.a()) {
                    zimVar2.cancel(false);
                }
            }
        };
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        zhsVarCq.c(runnable, zgtVar);
        zimVar.c(runnable, zgtVar);
        return zhsVarCq;
    }
}
