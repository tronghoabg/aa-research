package defpackage;

/* loaded from: classes.dex */
public class fde extends fdg {
    public volatile fdh a;
    public volatile fdh b;
    private final zo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fde(fdj fdjVar) {
        super(fdjVar);
        fcz.a.incrementAndGet();
        int i = zp.a;
        this.d = new zo(6);
        long[] jArr = aao.a;
        new aan(6);
        boolean z = fdjVar.e;
    }

    public fdh a(long j) {
        fdh fdhVar;
        zo zoVar = this.d;
        synchronized (zoVar) {
            Object objA = zoVar.a(j);
            if (objA == null) {
                objA = new fdh(j, this);
                zoVar.e(j, objA);
            }
            fdhVar = (fdh) objA;
        }
        return fdhVar;
    }
}
