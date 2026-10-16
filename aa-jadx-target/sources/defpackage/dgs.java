package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class dgs implements defpackage.dgv {
    public abstract int a(int i);

    @Override // defpackage.dgv
    public final int b(int i) {
        return a(i);
    }

    @Override // defpackage.dgv
    public final int c(int i) {
        int iA = a(i);
        if (iA == -1 || a(iA) == -1) {
            return -1;
        }
        return iA;
    }

    public abstract int d(int i);

    @Override // defpackage.dgv
    public final int e(int i) {
        int iD = d(i);
        if (iD == -1 || d(iD) == -1) {
            return -1;
        }
        return iD;
    }

    @Override // defpackage.dgv
    public final int f(int i) {
        return d(i);
    }
}
