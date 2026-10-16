package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lh {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public java.util.List l = null;

    public final android.view.View a(defpackage.mh mhVar) {
        java.util.List list = this.l;
        if (list == null) {
            android.view.View viewN = mhVar.n(this.d);
            this.d += this.e;
            return viewN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = ((defpackage.mr) this.l.get(i)).a;
            defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
            if (!mdVar.eZ() && this.d == mdVar.eX()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(android.view.View view) {
        int iEX;
        int size = this.l.size();
        int i = Integer.MAX_VALUE;
        android.view.View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view3 = ((defpackage.mr) this.l.get(i2)).a;
            defpackage.md mdVar = (defpackage.md) view3.getLayoutParams();
            if (view3 != view && !mdVar.eZ() && (iEX = (mdVar.eX() - this.d) * this.e) >= 0 && iEX < i) {
                if (iEX == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i = iEX;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((defpackage.md) view2.getLayoutParams()).eX();
        }
    }

    public final boolean c(defpackage.mo moVar) {
        int i = this.d;
        return i >= 0 && i < moVar.a();
    }
}
