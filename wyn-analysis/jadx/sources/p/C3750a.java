package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d1.InterfaceMenuItemC2385a;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3750a implements InterfaceMenuItemC2385a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f42981a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f42982b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f42983c;

    /* renamed from: d, reason: collision with root package name */
    public char f42984d;

    /* renamed from: e, reason: collision with root package name */
    public int f42985e;

    /* renamed from: f, reason: collision with root package name */
    public char f42986f;

    /* renamed from: g, reason: collision with root package name */
    public int f42987g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f42988h;

    /* renamed from: i, reason: collision with root package name */
    public Context f42989i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f42990j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f42991l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f42992m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f42993n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f42994o;

    /* renamed from: p, reason: collision with root package name */
    public int f42995p;

    @Override // d1.InterfaceMenuItemC2385a
    public final n a() {
        return null;
    }

    @Override // d1.InterfaceMenuItemC2385a
    public final InterfaceMenuItemC2385a b(n nVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f42988h;
        if (drawable != null) {
            if (this.f42993n || this.f42994o) {
                this.f42988h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f42988h = drawableMutate;
                if (this.f42993n) {
                    drawableMutate.setTintList(this.f42991l);
                }
                if (this.f42994o) {
                    this.f42988h.setTintMode(this.f42992m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f42987g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f42986f;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f42990j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f42988h;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f42991l;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f42992m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f42983c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f42985e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f42984d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f42981a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f42982b;
        return charSequence != null ? charSequence : this.f42981a;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f42995p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f42995p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f42995p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f42995p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f42986f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f42995p = (z2 ? 1 : 0) | (this.f42995p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f42995p = (z2 ? 2 : 0) | (this.f42995p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f42990j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f42995p = (z2 ? 16 : 0) | (this.f42995p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f42988h = drawable;
        c();
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f42991l = colorStateList;
        this.f42993n = true;
        c();
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f42992m = mode;
        this.f42994o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f42983c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f42984d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f42984d = c10;
        this.f42986f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f42981a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f42982b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f42995p = (this.f42995p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i5) {
        this.f42986f = Character.toLowerCase(c10);
        this.f42987g = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final InterfaceMenuItemC2385a setContentDescription(CharSequence charSequence) {
        this.f42990j = charSequence;
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i5) {
        this.f42984d = c10;
        this.f42985e = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i5) {
        this.f42981a = this.f42989i.getResources().getString(i5);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final InterfaceMenuItemC2385a setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i5) {
        this.f42988h = Y0.e.getDrawable(this.f42989i, i5);
        c();
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i5, int i10) {
        this.f42984d = c10;
        this.f42985e = KeyEvent.normalizeMetaState(i5);
        this.f42986f = Character.toLowerCase(c11);
        this.f42987g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i5) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i5) {
        return this;
    }
}
