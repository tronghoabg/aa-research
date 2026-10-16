package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fey implements defpackage.fgg {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.util.ArrayList b;

    public fey(android.view.View view, java.util.ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.fgg
    public final void b(defpackage.fgj fgjVar) {
        throw null;
    }

    @Override // defpackage.fgg
    public final /* synthetic */ void c(defpackage.fgj fgjVar) {
        fgjVar.P(this);
        this.a.setVisibility(8);
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((android.view.View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.fgg
    public final void f() {
        throw null;
    }

    @Override // defpackage.fgg
    public final /* synthetic */ void g(defpackage.fgj fgjVar) {
        fgjVar.P(this);
        fgjVar.H(this);
    }

    @Override // defpackage.fgg
    public final void d() {
    }

    @Override // defpackage.fgg
    public final void e() {
    }

    @Override // defpackage.fgg
    public final void a(defpackage.fgj fgjVar) {
    }
}
