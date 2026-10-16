package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wll {
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.List c = new java.util.ArrayList();
    public int d = 0;
    public boolean e = false;

    private final void f() {
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((defpackage.wlk) it.next()).a();
        }
        this.e = false;
    }

    public final void a(android.animation.Animator animator) {
        this.a.add(animator);
    }

    public final void b(defpackage.emt emtVar) {
        this.b.add(emtVar);
    }

    public final void c(defpackage.wlk wlkVar) {
        this.c.add(wlkVar);
    }

    public final void d() {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            f();
        }
    }

    public final void e() {
        if (this.e) {
            return;
        }
        this.e = true;
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((defpackage.wlk) it.next()).b();
        }
        java.util.List<defpackage.emt> list = this.b;
        this.d = list.size();
        java.util.List list2 = this.a;
        if (!list2.isEmpty()) {
            this.d++;
        }
        if (this.d == 0) {
            f();
            return;
        }
        defpackage.tfi tfiVar = new defpackage.tfi(this, 2);
        for (defpackage.emt emtVar : list) {
            emtVar.g(tfiVar);
            emtVar.e();
        }
        if (list2.isEmpty()) {
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        defpackage.wpu.n(animatorSet, new java.util.ArrayList(list2));
        animatorSet.addListener(new defpackage.wlj(this));
        animatorSet.start();
    }
}
