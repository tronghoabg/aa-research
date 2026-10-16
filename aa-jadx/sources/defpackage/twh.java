package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class twh extends defpackage.tvo {
    private final float e;

    public twh(defpackage.tvv tvvVar, float f, float f2, float f3) {
        super(tvvVar, f, f2);
        this.e = f3 * f3;
    }

    @Override // defpackage.tvo
    protected final void b(defpackage.tvz tvzVar) {
        this.a.l(tvzVar, true);
    }

    @Override // defpackage.tvo
    protected final boolean c(defpackage.tvz tvzVar) {
        return this.a.s(tvzVar, true);
    }

    @Override // defpackage.tvo
    public final boolean d() {
        return true;
    }

    @Override // defpackage.tvo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.tvo
    public final boolean f() {
        return true;
    }

    @Override // defpackage.tvo
    protected final boolean g(defpackage.tvz tvzVar) {
        return this.a.r(tvzVar, true);
    }

    @Override // defpackage.tvo
    public final int h(long j, java.util.Deque deque, java.util.List list) {
        defpackage.tvt tvtVar;
        defpackage.tvt tvtVar2;
        java.util.Iterator it = deque.iterator();
        do {
            tvtVar = null;
            if (!it.hasNext()) {
                tvtVar2 = null;
                break;
            }
            tvtVar2 = (defpackage.tvt) it.next();
        } while (tvtVar2.d != 2);
        java.util.Iterator itDescendingIterator = deque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            defpackage.tvt tvtVar3 = (defpackage.tvt) itDescendingIterator.next();
            if (tvtVar3.d == 2) {
                tvtVar = tvtVar3;
                break;
            }
        }
        if (tvtVar2 == null || tvtVar == null || tvtVar.c - j > 300) {
            return 1;
        }
        float fB = tvtVar.b(0) - tvtVar2.b(0);
        float fC = tvtVar.c(0) - tvtVar2.c(0);
        float fB2 = tvtVar.b(1) - tvtVar2.b(1);
        float fC2 = tvtVar.c(1) - tvtVar2.c(1);
        return java.lang.Math.max((fB * fB) + (fC * fC), (fB2 * fB2) + (fC2 * fC2)) > this.e ? 1 : 3;
    }
}
