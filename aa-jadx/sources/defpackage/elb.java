package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class elb implements java.util.Iterator {
    final /* synthetic */ defpackage.eld a;
    private int b = -1;
    private boolean c;
    private java.util.Iterator d;

    public elb(defpackage.eld eldVar) {
        this.a = eldVar;
    }

    private final java.util.Iterator a() {
        java.util.Iterator it = this.d;
        if (it != null) {
            return it;
        }
        java.util.Iterator it2 = this.a.c.entrySet().iterator();
        this.d = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        defpackage.eld eldVar = this.a;
        if (i >= eldVar.b) {
            return !eldVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        defpackage.eld eldVar = this.a;
        return i < eldVar.b ? (defpackage.ela) eldVar.a[i] : (java.util.Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        defpackage.eld eldVar = this.a;
        eldVar.e();
        int i = this.b;
        if (i >= eldVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            eldVar.c(i);
        }
    }
}
