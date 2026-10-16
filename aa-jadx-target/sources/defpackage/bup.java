package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class bup implements defpackage.buq {
    public final java.lang.Object a;
    public java.lang.Object b;
    private final java.util.ArrayList c = new java.util.ArrayList();

    public bup(java.lang.Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.buq
    public final java.lang.Object a() {
        return this.b;
    }

    @Override // defpackage.buq
    public final /* synthetic */ void b(defpackage.affg affgVar, java.lang.Object obj) {
        affgVar.invoke(a(), obj);
    }

    @Override // defpackage.buq
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.buq
    public final void d(java.lang.Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.buq
    public /* synthetic */ void g() {
        java.lang.Object objA = a();
        defpackage.buy buyVar = objA instanceof defpackage.buy ? (defpackage.buy) objA : null;
        if (buyVar != null) {
            buyVar.i();
        }
    }

    @Override // defpackage.buq
    public final void h() {
        java.util.ArrayList arrayList = this.c;
        this.b = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.buq
    public /* synthetic */ void f() {
    }
}
