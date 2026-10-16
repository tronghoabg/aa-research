package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwx extends defpackage.zga implements java.lang.Runnable {
    public final defpackage.zht a;

    public xwx(defpackage.zht zhtVar, defpackage.hwt hwtVar) {
        this.a = zhtVar;
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        zhtVar.c(hwtVar, zgtVar);
        defpackage.ysr.cy(zhtVar, new defpackage.xww(this), zgtVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
