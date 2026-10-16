package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class fdl extends defpackage.fdn {
    public volatile defpackage.fdo a;
    public volatile defpackage.fdo b;
    private final defpackage.zv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdl(defpackage.fdq fdqVar) {
        super(fdqVar);
        defpackage.fdg.a.incrementAndGet();
        int i = defpackage.zw.a;
        this.d = new defpackage.zv(6);
        long[] jArr = defpackage.aav.a;
        new defpackage.aau(6);
        boolean z = fdqVar.e;
    }

    public defpackage.fdo a(long j) {
        defpackage.fdo fdoVar;
        defpackage.zv zvVar = this.d;
        synchronized (zvVar) {
            java.lang.Object objA = zvVar.a(j);
            if (objA == null) {
                objA = new defpackage.fdo(j, this);
                zvVar.e(j, objA);
            }
            fdoVar = (defpackage.fdo) objA;
        }
        return fdoVar;
    }
}
