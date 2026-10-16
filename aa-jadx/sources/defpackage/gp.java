package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gp extends android.view.ActionMode {
    final android.content.Context a;
    final defpackage.gm b;

    public gp(android.content.Context context, defpackage.gm gmVar) {
        this.a = context;
        this.b = gmVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.f();
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
        return this.b.c();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.Menu, dwa] */
    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
        return new defpackage.hw(this.a, this.b.a());
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
        return this.b.d;
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.n();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View view) {
        this.b.h(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.i(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object obj) {
        this.b.d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.m(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence charSequence) {
        this.b.j(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence charSequence) {
        this.b.l(charSequence);
    }
}
