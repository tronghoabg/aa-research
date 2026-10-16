package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ms extends defpackage.dzw {
    final defpackage.mt a;
    public final java.util.Map b = new java.util.WeakHashMap();

    public ms(defpackage.mt mtVar) {
        this.a = mtVar;
    }

    @Override // defpackage.dzw
    public final defpackage.edq a(android.view.View view) {
        defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
        return dzwVar != null ? dzwVar.a(view) : super.a(view);
    }

    @Override // defpackage.dzw
    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
        if (dzwVar != null) {
            dzwVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dzw
    public final void c(android.view.View view, edn ednVar) {
        defpackage.mt mtVar = this.a;
        if (!mtVar.k()) {
            android.support.v7.widget.RecyclerView recyclerView = mtVar.a;
            if (recyclerView.g() != null) {
                recyclerView.g().aN(view, ednVar);
                defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
                if (dzwVar != null) {
                    dzwVar.c(view, ednVar);
                    return;
                } else {
                    super.c(view, ednVar);
                    return;
                }
            }
        }
        super.c(view, ednVar);
    }

    @Override // defpackage.dzw
    public final void d(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
        if (dzwVar != null) {
            dzwVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dzw
    public final void e(android.view.View view, int i) {
        defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
        if (dzwVar != null) {
            dzwVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.dzw
    public final void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
        if (dzwVar != null) {
            dzwVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dzw
    public final boolean g(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
        return dzwVar != null ? dzwVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.dzw
    public final boolean h(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(viewGroup);
        return dzwVar != null ? dzwVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.dzw
    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        defpackage.mt mtVar = this.a;
        if (!mtVar.k()) {
            android.support.v7.widget.RecyclerView recyclerView = mtVar.a;
            if (recyclerView.g() != null) {
                defpackage.dzw dzwVar = (defpackage.dzw) this.b.get(view);
                if (dzwVar != null) {
                    if (dzwVar.i(view, i, bundle)) {
                        return true;
                    }
                } else if (super.i(view, i, bundle)) {
                    return true;
                }
                android.support.v7.widget.RecyclerView recyclerView2 = recyclerView.g().s;
                defpackage.mh mhVar = recyclerView2.e;
                defpackage.mo moVar = recyclerView2.N;
                return false;
            }
        }
        return super.i(view, i, bundle);
    }
}
