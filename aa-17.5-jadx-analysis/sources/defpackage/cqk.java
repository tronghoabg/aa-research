package defpackage;

/* loaded from: classes.dex */
public class cqk {
    public final byw d = new byw(new cqj[16]);
    public final aag e = new aag(10);

    public boolean c(zs zsVar, cst cstVar, xa xaVar, boolean z) {
        byw bywVar = this.d;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((cqj) objArr[i2]).c(zsVar, cstVar, xaVar, z) || z2;
        }
        return z2;
    }

    public final void f() {
        byw bywVar = this.d;
        int i = bywVar.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (((cqj) bywVar.a[i]).c.a == 0) {
                bywVar.c(i);
            }
        }
    }
}
