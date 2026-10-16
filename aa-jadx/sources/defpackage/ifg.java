package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class ifg extends defpackage.iew {
    protected final android.view.View a;
    private final defpackage.iff b;

    public ifg(android.view.View view) {
        defpackage.a.ak(view, "Argument must not be null");
        this.a = view;
        this.b = new defpackage.iff(view);
    }

    @Override // defpackage.iew, defpackage.ifd
    public void a(android.graphics.drawable.Drawable drawable) {
        this.b.c();
    }

    @Override // defpackage.iew, defpackage.ifd
    public final defpackage.ien d() {
        java.lang.Object tag = this.a.getTag(com.google.android.projection.gearhead.R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof defpackage.ien) {
            return (defpackage.ien) tag;
        }
        throw new java.lang.IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.iew, defpackage.ifd
    public final void e(defpackage.ifc ifcVar) {
        defpackage.iff iffVar = this.b;
        int iB = iffVar.b();
        int iA = iffVar.a();
        if (defpackage.iff.d(iB, iA)) {
            ifcVar.e(iB, iA);
            return;
        }
        java.util.List list = iffVar.c;
        if (!list.contains(ifcVar)) {
            list.add(ifcVar);
        }
        if (iffVar.d == null) {
            android.view.ViewTreeObserver viewTreeObserver = iffVar.b.getViewTreeObserver();
            iffVar.d = new defpackage.ife(iffVar, 0);
            viewTreeObserver.addOnPreDrawListener(iffVar.d);
        }
    }

    @Override // defpackage.iew, defpackage.ifd
    public final void g(defpackage.ifc ifcVar) {
        this.b.c.remove(ifcVar);
    }

    @Override // defpackage.iew, defpackage.ifd
    public final void h(defpackage.ien ienVar) {
        this.a.setTag(com.google.android.projection.gearhead.R.id.glide_custom_view_target_tag, ienVar);
    }

    public final java.lang.String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.iew, defpackage.ifd
    public void f(android.graphics.drawable.Drawable drawable) {
    }
}
