package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public final class ceo {
    public static final Object a = new Object();

    public static final int a(SnapshotStateList snapshotStateList) {
        cex cexVar = snapshotStateList.a;
        cexVar.getClass();
        return ((ceu) cek.e(cexVar, snapshotStateList)).c;
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a.bB(i2, i, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static final boolean c(SnapshotStateList snapshotStateList, afec afecVar) {
        int i;
        cbf cbfVar;
        Object objInvoke;
        cec cecVarB;
        boolean z;
        do {
            Object obj = a;
            synchronized (obj) {
                cex cexVar = snapshotStateList.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, snapshotStateList);
                i = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbl cblVarJ = cbfVar.j();
            objInvoke = afecVar.invoke(cblVarJ);
            cbf cbfVarC = cblVarJ.c();
            if (affa.f(cbfVarC, cbfVar)) {
                break;
            }
            cex cexVar2 = snapshotStateList.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, snapshotStateList, cecVarB);
                synchronized (obj) {
                    int i2 = ceuVar2.b;
                    if (i2 == i) {
                        ceuVar2.a = cbfVarC;
                        z = true;
                        ceuVar2.c++;
                        ceuVar2.b = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            cek.q(cecVarB, snapshotStateList);
        } while (!z);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
