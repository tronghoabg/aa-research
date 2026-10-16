package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.ag;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.core.internal.view.SupportMenu;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f680a;

    /* renamed from: b, reason: collision with root package name */
    final b f681b;

    public f(Context context, b bVar) {
        this.f680a = context;
        this.f681b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f681b.f();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f681b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new ag(this.f680a, (SupportMenu) this.f681b.a());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f681b.b();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f681b.d();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f681b.p();
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f681b.e();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f681b.r();
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f681b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f681b.o();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f681b.h(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f681b.i(i2);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f681b.q(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f681b.k(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f681b.m(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f681b.j(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f681b.l(charSequence);
    }
}
