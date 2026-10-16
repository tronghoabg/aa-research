package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rgh implements defpackage.rfy {
    private final int a;
    private final int b;
    private final defpackage.rfy c;
    private final java.util.List d = new java.util.ArrayList();

    public rgh(defpackage.rgf rgfVar) {
        this.a = rgfVar.a;
        this.b = rgfVar.b;
        defpackage.rfy rfyVar = rgfVar.c;
        rfyVar.getClass();
        this.c = rfyVar;
    }

    @Override // defpackage.rfy
    public final synchronized void a(ouy ouyVar) {
        rgg rggVar;
        defpackage.wfp.c();
        int i = ouyVar.c;
        java.util.List list = this.d;
        java.util.Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                rggVar = new rgg(this.b);
                list.add(rggVar);
                break;
            }
            rggVar = (rgg) it.next();
        } while (rggVar.e.c != i);
        int i2 = this.b;
        int i3 = this.a;
        defpackage.yfd yfdVar = rggVar.a;
        int size = yfdVar.size() + ouyVar.g.size();
        yfdVar.addAll(ouyVar.g);
        int i4 = size - i2;
        if (i4 > 0) {
            rggVar.b += i4;
        }
        rggVar.b += ouyVar.h;
        ovb ovbVar = ouyVar.f;
        if (ovbVar == null) {
            ovbVar = ovb.a;
        }
        defpackage.abnv abnvVar = ovbVar.j;
        int iD = (rggVar.c.d() + abnvVar.d()) - i3;
        if (iD > 0) {
            rggVar.c = rggVar.c.x(iD);
            rggVar.d += iD;
        }
        rggVar.c = rggVar.c.s(abnvVar);
        rggVar.d += ovbVar.k;
        rggVar.e = ouyVar;
        if (ouyVar.e == 0) {
            this.c.a(rggVar.a());
            list.remove(rggVar);
        }
    }

    public final synchronized void b() {
        defpackage.wfp.c();
        java.util.List list = this.d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.a(((rgg) it.next()).a());
        }
        list.clear();
    }
}
