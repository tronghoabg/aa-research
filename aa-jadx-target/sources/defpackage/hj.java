package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class hj implements defpackage.dwb {
    private android.view.View B;
    private android.view.MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public java.lang.CharSequence d;
    public android.content.Intent e;
    public char f;
    public char h;
    public final defpackage.hh j;
    public ib k;
    public java.lang.CharSequence l;
    public java.lang.CharSequence m;
    public int n;
    public dsy p;
    private final int q;
    private java.lang.CharSequence r;
    private android.graphics.drawable.Drawable s;
    private android.view.MenuItem.OnMenuItemClickListener u;
    public int g = 4096;
    public int i = 4096;
    private int t = 0;
    private android.content.res.ColorStateList v = null;
    private android.graphics.PorterDuff.Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private int A = 16;
    public boolean o = false;

    public hj(defpackage.hh hhVar, int i, int i2, int i3, int i4, java.lang.CharSequence charSequence, int i5) {
        this.j = hhVar;
        this.a = i2;
        this.b = i;
        this.q = i3;
        this.c = i4;
        this.d = charSequence;
        this.n = i5;
    }

    public static void g(java.lang.StringBuilder sb, int i, int i2, java.lang.String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private final android.graphics.drawable.Drawable v(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            drawable = drawable.mutate();
            if (this.x) {
                drawable.setTintList(this.v);
            }
            if (this.y) {
                drawable.setTintMode(this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    @Override // defpackage.dwb
    public final void a(java.lang.CharSequence charSequence) {
        this.l = charSequence;
        this.j.l(false);
    }

    @Override // defpackage.dwb
    public final void b(java.lang.CharSequence charSequence) {
        this.m = charSequence;
        this.j.l(false);
    }

    @Override // defpackage.dwb
    public final dsy c() {
        return this.p;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.n & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.j.t(this);
        }
        return false;
    }

    @Override // defpackage.dwb
    public final void d(dsy dsyVar) {
        this.B = null;
        this.p = dsyVar;
        this.j.l(true);
        dsy dsyVar2 = this.p;
        if (dsyVar2 != null) {
            dsyVar2.g(new ajnd(this, (byte[]) null));
        }
    }

    public final char e() {
        return this.j.x() ? this.h : this.f;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final boolean expandActionView() {
        if (!m()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.j.v(this);
        }
        return false;
    }

    public final java.lang.CharSequence f(defpackage.hu huVar) {
        return huVar.e() ? getTitleCondensed() : this.d;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View view = this.B;
        if (view != null) {
            return view;
        }
        dsy dsyVar = this.p;
        if (dsyVar == null) {
            return null;
        }
        android.view.View viewA = dsyVar.a(this);
        this.B = viewA;
        return viewA;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.h;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.s;
        if (drawable != null) {
            return v(drawable);
        }
        int i = this.t;
        if (i == 0) {
            return null;
        }
        android.graphics.drawable.Drawable drawableC = defpackage.mu.e().c(this.j.a, i);
        this.t = 0;
        this.s = drawableC;
        return v(drawableC);
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.v;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.e;
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this.k;
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public final java.lang.CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.r;
        return charSequence != null ? charSequence : this.d;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.m;
    }

    public final void h(boolean z) {
        this.o = z;
        this.j.l(false);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.k != null;
    }

    final void i(boolean z) {
        int i = this.A;
        int i2 = (true != z ? 0 : 2) | (i & (-3));
        this.A = i2;
        if (i != i2) {
            this.j.l(false);
        }
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        dsy dsyVar = this.p;
        if (dsyVar == null || !dsyVar.f()) {
            return (this.A & 8) == 0;
        }
        return (this.A & 8) == 0 && this.p.d();
    }

    public final void j(boolean z) {
        this.A = (true != z ? 0 : 4) | (this.A & (-5));
    }

    public final void k(boolean z) {
        int i = this.A;
        this.A = z ? i | 32 : i & (-33);
    }

    public final void l(ib ibVar) {
        this.k = ibVar;
        ibVar.setHeaderTitle(this.d);
    }

    public final boolean m() {
        dsy dsyVar;
        if ((this.n & 8) != 0) {
            android.view.View viewA = this.B;
            if (viewA == null && (dsyVar = this.p) != null) {
                viewA = dsyVar.a(this);
                this.B = viewA;
            }
            if (viewA != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        defpackage.hh hhVar = this.j;
        if (hhVar.u(hhVar, this)) {
            return true;
        }
        android.content.Intent intent = this.e;
        if (intent != null) {
            try {
                hhVar.a.startActivity(intent);
                return true;
            } catch (android.content.ActivityNotFoundException e) {
                android.util.Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        dsy dsyVar = this.p;
        return dsyVar != null && dsyVar.e();
    }

    public final boolean o() {
        return (this.A & 32) == 32;
    }

    public final boolean p() {
        return (this.A & 4) != 0;
    }

    public final boolean q() {
        return (this.n & 1) == 1;
    }

    public final boolean r() {
        return (this.n & 2) == 2;
    }

    final boolean s(boolean z) {
        int i = this.A;
        int i2 = (true != z ? 8 : 0) | (i & (-9));
        this.A = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int i) {
        android.content.Context context = this.j.a;
        u(android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) new android.widget.LinearLayout(context), false));
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = java.lang.Character.toLowerCase(c);
        this.i = android.view.KeyEvent.normalizeMetaState(i);
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z) {
        int i = this.A;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.A = i2;
        if (i != i2) {
            this.j.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z) {
        if ((this.A & 4) == 0) {
            i(z);
            return this;
        }
        defpackage.hh hhVar = this.j;
        int i = this.b;
        java.util.ArrayList arrayList = hhVar.c;
        int size = arrayList.size();
        hhVar.s();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.hj hjVar = (defpackage.hj) arrayList.get(i2);
            if (hjVar.b == i && hjVar.p() && hjVar.isCheckable()) {
                hjVar.i(hjVar == this);
            }
        }
        hhVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        a(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z) {
        int i = this.A;
        this.A = z ? i | 16 : i & (-17);
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i) {
        this.s = null;
        this.t = i;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.e = intent;
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c, int i) {
        if (this.f == c && this.g == i) {
            return this;
        }
        this.f = c;
        this.g = android.view.KeyEvent.normalizeMetaState(i);
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f = c;
        this.g = android.view.KeyEvent.normalizeMetaState(i);
        this.h = java.lang.Character.toLowerCase(c2);
        this.i = android.view.KeyEvent.normalizeMetaState(i2);
        this.j.l(false);
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.n = i;
        this.j.A();
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final /* synthetic */ android.view.MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.d = charSequence;
        this.j.l(false);
        ib ibVar = this.k;
        if (ibVar != null) {
            ibVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.r = charSequence;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z) {
        if (s(z)) {
            this.j.B();
        }
        return this;
    }

    public final boolean t() {
        return this.j.y() && e() != 0;
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void u(android.view.View view) {
        int i;
        this.B = view;
        this.p = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.j.A();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i) {
        setTitle(this.j.a.getString(i));
        return this;
    }

    @Override // defpackage.dwb, android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View view) {
        u(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c) {
        if (this.f == c) {
            return this;
        }
        this.f = c;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2) {
        this.f = c;
        this.h = java.lang.Character.toLowerCase(c2);
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = java.lang.Character.toLowerCase(c);
        this.j.l(false);
        return this;
    }
}
