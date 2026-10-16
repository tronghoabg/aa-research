package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class ier implements iev {
    protected final View a;
    private final gjt b;

    public ier(View view) {
        a.al(view, "Argument must not be null");
        this.a = view;
        this.b = new gjt(view);
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        this.b.M();
    }

    @Override // defpackage.iev
    public final ief d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof ief) {
            return (ief) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.iev
    public final void e(ieu ieuVar) {
        gjt gjtVar = this.b;
        int iL = gjtVar.L();
        int iK = gjtVar.K();
        if (gjt.N(iL, iK)) {
            ieuVar.e(iL, iK);
            return;
        }
        ?? r0 = gjtVar.b;
        if (!r0.contains(ieuVar)) {
            r0.add(ieuVar);
        }
        if (gjtVar.c == null) {
            ViewTreeObserver viewTreeObserver = ((View) gjtVar.a).getViewTreeObserver();
            gjtVar.c = new iew(gjtVar, 1);
            viewTreeObserver.addOnPreDrawListener(gjtVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.iev
    public final void g(ieu ieuVar) {
        this.b.b.remove(ieuVar);
    }

    @Override // defpackage.iev
    public final void h(ief iefVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, iefVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.idh
    public final void j() {
    }

    @Override // defpackage.idh
    public final void k() {
    }

    @Override // defpackage.idh
    public final void l() {
    }

    @Override // defpackage.iev
    public final void b(Drawable drawable) {
    }

    @Override // defpackage.iev
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.iev
    public final void c(Object obj, ife ifeVar) {
    }
}
