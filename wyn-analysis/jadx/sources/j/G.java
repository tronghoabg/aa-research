package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import o.AbstractC3620a;
import o.C3628i;
import q.C3816i;

/* loaded from: classes.dex */
public final class G extends AbstractC3620a implements p.i {

    /* renamed from: c, reason: collision with root package name */
    public final Context f38379c;

    /* renamed from: d, reason: collision with root package name */
    public final p.k f38380d;

    /* renamed from: e, reason: collision with root package name */
    public Y2.B f38381e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f38382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f38383g;

    public G(H h10, Context context, Y2.B b5) {
        this.f38383g = h10;
        this.f38379c = context;
        this.f38381e = b5;
        p.k kVar = new p.k(context);
        kVar.f43049l = 1;
        this.f38380d = kVar;
        kVar.f43043e = this;
    }

    @Override // o.AbstractC3620a
    public final void a() {
        H h10 = this.f38383g;
        if (h10.f38397n != this) {
            return;
        }
        if (h10.f38404u) {
            h10.f38398o = this;
            h10.f38399p = this.f38381e;
        } else {
            this.f38381e.w(this);
        }
        this.f38381e = null;
        h10.d0(false);
        ActionBarContextView actionBarContextView = h10.k;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        h10.f38392h.setHideOnContentScrollEnabled(h10.f38409z);
        h10.f38397n = null;
    }

    @Override // o.AbstractC3620a
    public final View b() {
        WeakReference weakReference = this.f38382f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.AbstractC3620a
    public final p.k c() {
        return this.f38380d;
    }

    @Override // o.AbstractC3620a
    public final MenuInflater d() {
        return new C3628i(this.f38379c);
    }

    @Override // o.AbstractC3620a
    public final CharSequence e() {
        return this.f38383g.k.getSubtitle();
    }

    @Override // p.i
    public final boolean f(p.k kVar, MenuItem menuItem) {
        Y2.B b5 = this.f38381e;
        if (b5 != null) {
            return ((S3.i) b5.f16383b).g(this, menuItem);
        }
        return false;
    }

    @Override // o.AbstractC3620a
    public final CharSequence g() {
        return this.f38383g.k.getTitle();
    }

    @Override // o.AbstractC3620a
    public final void h() {
        if (this.f38383g.f38397n != this) {
            return;
        }
        p.k kVar = this.f38380d;
        kVar.w();
        try {
            this.f38381e.y(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override // o.AbstractC3620a
    public final boolean i() {
        return this.f38383g.k.f17811s;
    }

    @Override // o.AbstractC3620a
    public final void j(View view) {
        this.f38383g.k.setCustomView(view);
        this.f38382f = new WeakReference(view);
    }

    @Override // o.AbstractC3620a
    public final void k(int i5) {
        l(this.f38383g.f38389e.getResources().getString(i5));
    }

    @Override // o.AbstractC3620a
    public final void l(CharSequence charSequence) {
        this.f38383g.k.setSubtitle(charSequence);
    }

    @Override // o.AbstractC3620a
    public final void m(int i5) {
        n(this.f38383g.f38389e.getResources().getString(i5));
    }

    @Override // o.AbstractC3620a
    public final void n(CharSequence charSequence) {
        this.f38383g.k.setTitle(charSequence);
    }

    @Override // o.AbstractC3620a
    public final void o(boolean z2) {
        this.f41181b = z2;
        this.f38383g.k.setTitleOptional(z2);
    }

    @Override // p.i
    public final void z(p.k kVar) {
        if (this.f38381e == null) {
            return;
        }
        h();
        C3816i c3816i = this.f38383g.k.f17797d;
        if (c3816i != null) {
            c3816i.k();
        }
    }
}
