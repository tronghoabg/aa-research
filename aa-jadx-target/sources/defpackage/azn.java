package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azn implements defpackage.cvo {
    private final defpackage.aal a;
    private final defpackage.ngb b;

    public azn(defpackage.ngb ngbVar) {
        this.b = ngbVar;
        defpackage.aal aalVar = defpackage.aam.a;
        this.a = new defpackage.aal(6);
    }

    @Override // defpackage.cvo
    public final void a(defpackage.cvn cvnVar) {
        defpackage.aal aalVar = this.a;
        aalVar.e();
        defpackage.aaq aaqVar = cvnVar.a;
        java.lang.Object[] objArr = aaqVar.b;
        long[] jArr = aaqVar.c;
        int i = aaqVar.e;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            java.lang.Object obj = objArr[i];
            java.lang.Object objY = this.b.y(obj);
            int iB = aalVar.b(objY, 0);
            int i2 = (int) (j & 2147483647L);
            if (iB == 7) {
                cvnVar.remove(obj);
            } else {
                aalVar.g(objY, iB + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.cvo
    public final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ngb ngbVar = this.b;
        return defpackage.afga.f(ngbVar.y(obj), ngbVar.y(obj2));
    }
}
