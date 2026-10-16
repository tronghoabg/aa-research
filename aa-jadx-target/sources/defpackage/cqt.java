package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class cqt {
    public final defpackage.bzc d = new defpackage.bzc(new defpackage.cqs[16]);
    public final defpackage.aan e = new defpackage.aan(10);

    public boolean c(defpackage.zz zzVar, defpackage.ctc ctcVar, defpackage.xh xhVar, boolean z) {
        defpackage.bzc bzcVar = this.d;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            ((defpackage.cqs) objArr[i2]).c(zzVar, ctcVar, xhVar, z);
            i2++;
            z2 = true;
        }
        return z2;
    }

    public final void f() {
        defpackage.bzc bzcVar = this.d;
        int i = bzcVar.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (((defpackage.cqs) bzcVar.a[i]).c.a == 0) {
                bzcVar.c(i);
            }
        }
    }
}
