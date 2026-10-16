package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gkq {
    public boolean a;
    public java.lang.Object b;
    public java.lang.Object c;

    public gkq(defpackage.aect aectVar) {
        this.c = aectVar.c;
        this.b = aectVar.d;
        this.a = aectVar.e;
    }

    public final void a(defpackage.aecs... aecsVarArr) {
        java.lang.String[] strArr = new java.lang.String[aecsVarArr.length];
        for (int i = 0; i < aecsVarArr.length; i++) {
            strArr[i] = aecsVarArr[i].bb;
        }
        this.c = strArr;
    }

    public final void b() {
        this.a = true;
    }

    public final void c(defpackage.aedc... aedcVarArr) {
        java.lang.String[] strArr = new java.lang.String[aedcVarArr.length];
        for (int i = 0; i < aedcVarArr.length; i++) {
            strArr[i] = aedcVarArr[i].f;
        }
        this.b = strArr;
    }
}
