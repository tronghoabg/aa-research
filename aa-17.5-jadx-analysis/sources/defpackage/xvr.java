package defpackage;

/* loaded from: classes3.dex */
public final class xvr extends zeu implements Runnable {
    public final zgq a;

    public xvr(zgq zgqVar, hwk hwkVar) {
        this.a = zgqVar;
        zfq zfqVar = zfq.a;
        zgqVar.c(hwkVar, zfqVar);
        wub.ah(zgqVar, new xvq(this), zfqVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
