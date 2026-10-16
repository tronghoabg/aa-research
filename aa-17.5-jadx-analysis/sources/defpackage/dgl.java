package defpackage;

/* loaded from: classes.dex */
public abstract class dgl implements dgo {
    public abstract int a(int i);

    @Override // defpackage.dgo
    public final int b(int i) {
        return a(i);
    }

    @Override // defpackage.dgo
    public final int c(int i) {
        int iA = a(i);
        if (iA == -1 || a(iA) == -1) {
            return -1;
        }
        return iA;
    }

    public abstract int d(int i);

    @Override // defpackage.dgo
    public final int e(int i) {
        int iD = d(i);
        if (iD == -1 || d(iD) == -1) {
            return -1;
        }
        return iD;
    }

    @Override // defpackage.dgo
    public final int f(int i) {
        return d(i);
    }
}
