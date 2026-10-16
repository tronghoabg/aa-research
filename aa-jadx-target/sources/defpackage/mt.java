package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class mt extends defpackage.dzw {
    final android.support.v7.widget.RecyclerView a;
    public final defpackage.ms b;

    public mt(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
        defpackage.dzw dzwVarJ = j();
        if (dzwVarJ == null || !(dzwVarJ instanceof defpackage.ms)) {
            this.b = new defpackage.ms(this);
        } else {
            this.b = (defpackage.ms) dzwVarJ;
        }
    }

    @Override // defpackage.dzw
    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof android.support.v7.widget.RecyclerView) || k()) {
            return;
        }
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) view;
        if (recyclerView.g() != null) {
            recyclerView.g().Z(accessibilityEvent);
        }
    }

    @Override // defpackage.dzw
    public final void c(android.view.View view, edn ednVar) {
        super.c(view, ednVar);
        if (k()) {
            return;
        }
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (recyclerView.g() != null) {
            defpackage.mc mcVarG = recyclerView.g();
            android.support.v7.widget.RecyclerView recyclerView2 = mcVarG.s;
            mcVarG.ff(recyclerView2.e, recyclerView2.N, ednVar);
        }
    }

    @Override // defpackage.dzw
    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (k()) {
            return false;
        }
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (recyclerView.g() != null) {
            return recyclerView.g().fi(i, bundle);
        }
        return false;
    }

    public defpackage.dzw j() {
        return this.b;
    }

    final boolean k() {
        return this.a.am();
    }
}
