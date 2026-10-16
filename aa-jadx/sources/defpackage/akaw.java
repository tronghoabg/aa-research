package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akaw implements defpackage.ajqg {
    public defpackage.akbl d = new defpackage.akbl();

    @java.lang.Deprecated
    protected defpackage.akbs e = null;

    @java.lang.Deprecated
    protected akaw() {
    }

    @Override // defpackage.ajqg
    public final void f(defpackage.ajpy ajpyVar) {
        this.d.a(ajpyVar);
    }

    @Override // defpackage.ajqg
    public final void g(java.lang.String str, java.lang.String str2) {
        this.d.a(new defpackage.akax(str, str2));
    }

    @Override // defpackage.ajqg
    public final void h(java.lang.String str, java.lang.String str2) {
        defpackage.akbl akblVar = this.d;
        defpackage.akax akaxVar = new defpackage.akax(str, str2);
        int i = 0;
        while (true) {
            java.util.List list = akblVar.b;
            if (i >= list.size()) {
                list.add(akaxVar);
                return;
            } else {
                if (((defpackage.ajpy) list.get(i)).b().equalsIgnoreCase(akaxVar.a)) {
                    list.set(i, akaxVar);
                    return;
                }
                i++;
            }
        }
    }

    @Override // defpackage.ajqg
    public final defpackage.ajpy hi(java.lang.String str) {
        defpackage.akbl akblVar = this.d;
        int i = 0;
        while (true) {
            java.util.List list = akblVar.b;
            if (i >= list.size()) {
                return null;
            }
            defpackage.ajpy ajpyVar = (defpackage.ajpy) list.get(i);
            if (ajpyVar.b().equalsIgnoreCase(str)) {
                return ajpyVar;
            }
            i++;
        }
    }

    @Override // defpackage.ajqg
    @java.lang.Deprecated
    public final defpackage.akbs hj() {
        if (this.e == null) {
            this.e = new defpackage.akbr();
        }
        return this.e;
    }

    @Override // defpackage.ajqg
    public final void i(defpackage.ajpy[] ajpyVarArr) {
        this.d.c(ajpyVarArr);
    }

    @Override // defpackage.ajqg
    @java.lang.Deprecated
    public final void j(defpackage.akbs akbsVar) {
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        this.e = akbsVar;
    }

    @Override // defpackage.ajqg
    public final boolean k(java.lang.String str) {
        defpackage.akbl akblVar = this.d;
        int i = 0;
        while (true) {
            java.util.List list = akblVar.b;
            if (i >= list.size()) {
                return false;
            }
            if (((defpackage.ajpy) list.get(i)).b().equalsIgnoreCase(str)) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.ajqg
    public final defpackage.ajpy[] l() {
        return this.d.d();
    }

    @Override // defpackage.ajqg
    public final defpackage.ajpy[] m(java.lang.String str) {
        defpackage.akbl akblVar = this.d;
        int i = 0;
        java.util.ArrayList arrayList = null;
        while (true) {
            java.util.List list = akblVar.b;
            if (i >= list.size()) {
                break;
            }
            defpackage.ajpy ajpyVar = (defpackage.ajpy) list.get(i);
            if (ajpyVar.b().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(ajpyVar);
            }
            i++;
        }
        return arrayList != null ? (defpackage.ajpy[]) arrayList.toArray(new defpackage.ajpy[arrayList.size()]) : defpackage.akbl.a;
    }

    @Override // defpackage.ajqg
    public final defpackage.akbf n() {
        return new defpackage.akbf(this.d.b, null);
    }

    @Override // defpackage.ajqg
    public final defpackage.akbf o(java.lang.String str) {
        return new defpackage.akbf(this.d.b, str);
    }
}
