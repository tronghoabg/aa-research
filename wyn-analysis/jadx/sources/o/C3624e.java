package o;

import Y2.B;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q.C3816i;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3624e extends AbstractC3620a implements p.i {

    /* renamed from: c, reason: collision with root package name */
    public Context f41188c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f41189d;

    /* renamed from: e, reason: collision with root package name */
    public B f41190e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f41191f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41192g;

    /* renamed from: h, reason: collision with root package name */
    public p.k f41193h;

    @Override // o.AbstractC3620a
    public final void a() {
        if (this.f41192g) {
            return;
        }
        this.f41192g = true;
        this.f41190e.w(this);
    }

    @Override // o.AbstractC3620a
    public final View b() {
        WeakReference weakReference = this.f41191f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.AbstractC3620a
    public final p.k c() {
        return this.f41193h;
    }

    @Override // o.AbstractC3620a
    public final MenuInflater d() {
        return new C3628i(this.f41189d.getContext());
    }

    @Override // o.AbstractC3620a
    public final CharSequence e() {
        return this.f41189d.getSubtitle();
    }

    @Override // p.i
    public final boolean f(p.k kVar, MenuItem menuItem) {
        return ((S3.i) this.f41190e.f16383b).g(this, menuItem);
    }

    @Override // o.AbstractC3620a
    public final CharSequence g() {
        return this.f41189d.getTitle();
    }

    @Override // o.AbstractC3620a
    public final void h() {
        this.f41190e.y(this, this.f41193h);
    }

    @Override // o.AbstractC3620a
    public final boolean i() {
        return this.f41189d.f17811s;
    }

    @Override // o.AbstractC3620a
    public final void j(View view) {
        this.f41189d.setCustomView(view);
        this.f41191f = view != null ? new WeakReference(view) : null;
    }

    @Override // o.AbstractC3620a
    public final void k(int i5) {
        l(this.f41188c.getString(i5));
    }

    @Override // o.AbstractC3620a
    public final void l(CharSequence charSequence) {
        this.f41189d.setSubtitle(charSequence);
    }

    @Override // o.AbstractC3620a
    public final void m(int i5) {
        n(this.f41188c.getString(i5));
    }

    @Override // o.AbstractC3620a
    public final void n(CharSequence charSequence) {
        this.f41189d.setTitle(charSequence);
    }

    @Override // o.AbstractC3620a
    public final void o(boolean z2) {
        this.f41181b = z2;
        this.f41189d.setTitleOptional(z2);
    }

    @Override // p.i
    public final void z(p.k kVar) {
        h();
        C3816i c3816i = this.f41189d.f17797d;
        if (c3816i != null) {
            c3816i.k();
        }
    }
}
