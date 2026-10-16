package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gw implements defpackage.dwb {
    private java.lang.CharSequence a;
    private java.lang.CharSequence b;
    private android.content.Intent c;
    private char d;
    private char f;
    private android.graphics.drawable.Drawable h;
    private final android.content.Context i;
    private java.lang.CharSequence j;
    private java.lang.CharSequence k;
    private int e = 4096;
    private int g = 4096;
    private android.content.res.ColorStateList l = null;
    private android.graphics.PorterDuff.Mode m = null;
    private boolean n = false;
    private boolean o = false;
    private int p = 16;

    public gw(android.content.Context context, java.lang.CharSequence charSequence) {
        this.i = context;
        this.a = charSequence;
    }

    private final void e() {
        android.graphics.drawable.Drawable drawable = this.h;
        if (drawable != null) {
            if (this.n || this.o) {
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                this.h = drawableMutate;
                if (this.n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.o) {
                    this.h.setTintMode(this.m);
                }
            }
        }
    }

    @Override // defpackage.dwb
    public final void a(java.lang.CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // defpackage.dwb
    public final void b(java.lang.CharSequence charSequence) {
        this.k = charSequence;
    }

    @Override // defpackage.dwb
    public final dsy c() {
        return null;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // defpackage.dwb
    public final void d(dsy dsyVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.View getActionView() {
        return null;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        return this.h;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        this.f = java.lang.Character.toLowerCase(c);
        this.g = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z) {
        this.p = (z ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z) {
        this.p = (true != z ? 0 : 2) | (this.p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z) {
        this.p = (true != z ? 0 : 16) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i) {
        this.h = this.i.getDrawable(i);
        e();
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        e();
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c, int i) {
        this.d = c;
        this.e = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d = c;
        this.e = android.view.KeyEvent.normalizeMetaState(i);
        this.f = java.lang.Character.toLowerCase(c2);
        this.g = android.view.KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i) {
        this.a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z) {
        this.p = (this.p & 8) | (true == z ? 0 : 8);
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.h = drawable;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c) {
        this.f = java.lang.Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2) {
        this.d = c;
        this.f = java.lang.Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
