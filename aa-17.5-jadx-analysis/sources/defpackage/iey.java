package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.projection.gearhead.R;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class iey extends ieo {
    protected final View a;
    private final iex b;

    public iey(View view) {
        a.al(view, "Argument must not be null");
        this.a = view;
        this.b = new iex(view);
    }

    @Override // defpackage.ieo, defpackage.iev
    public void a(Drawable drawable) {
        this.b.c();
    }

    @Override // defpackage.ieo, defpackage.iev
    public final ief d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof ief) {
            return (ief) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.ieo, defpackage.iev
    public final void e(ieu ieuVar) {
        iex iexVar = this.b;
        int iB = iexVar.b();
        int iA = iexVar.a();
        if (iex.d(iB, iA)) {
            ieuVar.e(iB, iA);
            return;
        }
        List list = iexVar.c;
        if (!list.contains(ieuVar)) {
            list.add(ieuVar);
        }
        if (iexVar.d == null) {
            ViewTreeObserver viewTreeObserver = iexVar.b.getViewTreeObserver();
            iexVar.d = new iew(iexVar, 0);
            viewTreeObserver.addOnPreDrawListener(iexVar.d);
        }
    }

    @Override // defpackage.ieo, defpackage.iev
    public final void g(ieu ieuVar) {
        this.b.c.remove(ieuVar);
    }

    @Override // defpackage.ieo, defpackage.iev
    public final void h(ief iefVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, iefVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.ieo, defpackage.iev
    public void f(Drawable drawable) {
    }
}
