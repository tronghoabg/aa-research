package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class drj implements defpackage.drh {
    public final defpackage.drr d;
    public int e;
    public int f;
    public defpackage.drh a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    defpackage.drk h = null;
    public boolean i = false;
    public final java.util.List j = new java.util.ArrayList();
    final java.util.List k = new java.util.ArrayList();

    public drj(defpackage.drr drrVar) {
        this.d = drrVar;
    }

    public final void a(defpackage.drh drhVar) {
        this.j.add(drhVar);
        if (this.i) {
            drhVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((defpackage.drh) it.next()).f();
        }
    }

    @Override // defpackage.drh
    public final void f() {
        java.util.List<defpackage.drj> list = this.k;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((defpackage.drj) it.next()).i) {
                return;
            }
        }
        this.c = true;
        defpackage.drh drhVar = this.a;
        if (drhVar != null) {
            drhVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        defpackage.drj drjVar = null;
        for (defpackage.drj drjVar2 : list) {
            if (!(drjVar2 instanceof defpackage.drk)) {
                i++;
                drjVar = drjVar2;
            }
        }
        if (drjVar != null && i == 1 && drjVar.i) {
            defpackage.drk drkVar = this.h;
            if (drkVar != null) {
                if (!drkVar.i) {
                    return;
                } else {
                    this.e = this.g * drkVar.f;
                }
            }
            c(drjVar.f + this.e);
        }
        defpackage.drh drhVar2 = this.a;
        if (drhVar2 != null) {
            drhVar2.f();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.d.d.as;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        java.lang.Object objValueOf = this.i ? java.lang.Integer.valueOf(this.f) : "unresolved";
        java.util.List list = this.k;
        java.util.List list2 = this.j;
        return str2 + ":" + str + "(" + objValueOf.toString() + ") <t=" + list.size() + ":d=" + list2.size() + ">";
    }
}
