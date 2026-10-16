package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p.MenuC3746A;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3625f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41194a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3620a f41195b;

    public C3625f(Context context, AbstractC3620a abstractC3620a) {
        this.f41194a = context;
        this.f41195b = abstractC3620a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f41195b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f41195b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC3746A(this.f41194a, this.f41195b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f41195b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f41195b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f41195b.f41180a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f41195b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f41195b.f41181b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f41195b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f41195b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f41195b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f41195b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f41195b.f41180a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f41195b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f41195b.o(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i5) {
        this.f41195b.k(i5);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i5) {
        this.f41195b.m(i5);
    }
}
