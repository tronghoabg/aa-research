package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d1.InterfaceMenuItemC2385a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements InterfaceMenuItemC2385a {

    /* renamed from: A, reason: collision with root package name */
    public n f43065A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f43066B;

    /* renamed from: a, reason: collision with root package name */
    public final int f43068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43071d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f43072e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f43073f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f43074g;

    /* renamed from: h, reason: collision with root package name */
    public char f43075h;

    /* renamed from: j, reason: collision with root package name */
    public char f43077j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f43078l;

    /* renamed from: n, reason: collision with root package name */
    public final k f43080n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC3749D f43081o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f43082p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f43083q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f43084r;

    /* renamed from: y, reason: collision with root package name */
    public int f43091y;

    /* renamed from: z, reason: collision with root package name */
    public View f43092z;

    /* renamed from: i, reason: collision with root package name */
    public int f43076i = 4096;
    public int k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f43079m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f43085s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f43086t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f43087u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f43088v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f43089w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f43090x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f43067C = false;

    public m(k kVar, int i5, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f43080n = kVar;
        this.f43068a = i10;
        this.f43069b = i5;
        this.f43070c = i11;
        this.f43071d = i12;
        this.f43072e = charSequence;
        this.f43091y = i13;
    }

    public static void c(int i5, int i10, String str, StringBuilder sb2) {
        if ((i5 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // d1.InterfaceMenuItemC2385a
    public final n a() {
        return this.f43065A;
    }

    @Override // d1.InterfaceMenuItemC2385a
    public final InterfaceMenuItemC2385a b(n nVar) {
        this.f43092z = null;
        this.f43065A = nVar;
        this.f43080n.p(true);
        n nVar2 = this.f43065A;
        if (nVar2 != null) {
            nVar2.f43096d = new com.google.android.gms.ads.nativead.l(this, 13);
            nVar2.f43094b.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f43091y & 8) == 0) {
            return false;
        }
        if (this.f43092z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f43066B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f43080n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f43089w && (this.f43087u || this.f43088v)) {
            drawable = drawable.mutate();
            if (this.f43087u) {
                drawable.setTintList(this.f43085s);
            }
            if (this.f43088v) {
                drawable.setTintMode(this.f43086t);
            }
            this.f43089w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f43091y & 8) == 0) {
            return false;
        }
        if (this.f43092z == null && (nVar = this.f43065A) != null) {
            this.f43092z = nVar.a(this);
        }
        return this.f43092z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f43066B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f43080n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f43090x |= 32;
        } else {
            this.f43090x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f43092z;
        if (view != null) {
            return view;
        }
        n nVar = this.f43065A;
        if (nVar == null) {
            return null;
        }
        View viewA = nVar.a(this);
        this.f43092z = viewA;
        return viewA;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f43077j;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f43083q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f43069b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f43078l;
        if (drawable != null) {
            return d(drawable);
        }
        int i5 = this.f43079m;
        if (i5 == 0) {
            return null;
        }
        Drawable drawableB = Fe.g.B(this.f43080n.f43039a, i5);
        this.f43079m = 0;
        this.f43078l = drawableB;
        return d(drawableB);
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f43085s;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f43086t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f43074g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f43068a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f43076i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f43075h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f43070c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f43081o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f43072e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f43073f;
        return charSequence != null ? charSequence : this.f43072e;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f43084r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f43081o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f43067C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f43090x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f43090x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f43090x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        n nVar = this.f43065A;
        return (nVar == null || !nVar.f43094b.overridesItemVisibility()) ? (this.f43090x & 8) == 0 : (this.f43090x & 8) == 0 && this.f43065A.f43094b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i5;
        this.f43092z = view;
        this.f43065A = null;
        if (view != null && view.getId() == -1 && (i5 = this.f43068a) > 0) {
            view.setId(i5);
        }
        k kVar = this.f43080n;
        kVar.k = true;
        kVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f43077j == c10) {
            return this;
        }
        this.f43077j = Character.toLowerCase(c10);
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i5 = this.f43090x;
        int i10 = (z2 ? 1 : 0) | (i5 & (-2));
        this.f43090x = i10;
        if (i5 != i10) {
            this.f43080n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i5 = this.f43090x;
        if ((i5 & 4) == 0) {
            int i10 = (i5 & (-3)) | (z2 ? 2 : 0);
            this.f43090x = i10;
            if (i5 != i10) {
                this.f43080n.p(false);
            }
            return this;
        }
        k kVar = this.f43080n;
        kVar.getClass();
        ArrayList arrayList = kVar.f43044f;
        int size = arrayList.size();
        kVar.w();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f43069b == this.f43069b && (mVar.f43090x & 4) != 0 && mVar.isCheckable()) {
                boolean z10 = mVar == this;
                int i12 = mVar.f43090x;
                int i13 = (z10 ? 2 : 0) | (i12 & (-3));
                mVar.f43090x = i13;
                if (i12 != i13) {
                    mVar.f43080n.p(false);
                }
            }
        }
        kVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f43090x |= 16;
        } else {
            this.f43090x &= -17;
        }
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f43079m = 0;
        this.f43078l = drawable;
        this.f43089w = true;
        this.f43080n.p(false);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f43085s = colorStateList;
        this.f43087u = true;
        this.f43089w = true;
        this.f43080n.p(false);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f43086t = mode;
        this.f43088v = true;
        this.f43089w = true;
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f43074g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f43075h == c10) {
            return this;
        }
        this.f43075h = c10;
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f43066B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f43082p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f43075h = c10;
        this.f43077j = Character.toLowerCase(c11);
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i5) {
        int i10 = i5 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f43091y = i5;
        k kVar = this.f43080n;
        kVar.k = true;
        kVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f43072e = charSequence;
        this.f43080n.p(false);
        SubMenuC3749D subMenuC3749D = this.f43081o;
        if (subMenuC3749D != null) {
            subMenuC3749D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f43073f = charSequence;
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i5 = this.f43090x;
        int i10 = (z2 ? 0 : 8) | (i5 & (-9));
        this.f43090x = i10;
        if (i5 != i10) {
            k kVar = this.f43080n;
            kVar.f43046h = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f43072e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final InterfaceMenuItemC2385a setContentDescription(CharSequence charSequence) {
        this.f43083q = charSequence;
        this.f43080n.p(false);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final InterfaceMenuItemC2385a setTooltipText(CharSequence charSequence) {
        this.f43084r = charSequence;
        this.f43080n.p(false);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i5) {
        if (this.f43077j == c10 && this.k == i5) {
            return this;
        }
        this.f43077j = Character.toLowerCase(c10);
        this.k = KeyEvent.normalizeMetaState(i5);
        this.f43080n.p(false);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i5) {
        if (this.f43075h == c10 && this.f43076i == i5) {
            return this;
        }
        this.f43075h = c10;
        this.f43076i = KeyEvent.normalizeMetaState(i5);
        this.f43080n.p(false);
        return this;
    }

    @Override // d1.InterfaceMenuItemC2385a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i5, int i10) {
        this.f43075h = c10;
        this.f43076i = KeyEvent.normalizeMetaState(i5);
        this.f43077j = Character.toLowerCase(c11);
        this.k = KeyEvent.normalizeMetaState(i10);
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i5) {
        this.f43078l = null;
        this.f43079m = i5;
        this.f43089w = true;
        this.f43080n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i5) {
        setTitle(this.f43080n.f43039a.getString(i5));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i5) {
        int i10;
        Context context = this.f43080n.f43039a;
        View viewInflate = LayoutInflater.from(context).inflate(i5, (ViewGroup) new LinearLayout(context), false);
        this.f43092z = viewInflate;
        this.f43065A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f43068a) > 0) {
            viewInflate.setId(i10);
        }
        k kVar = this.f43080n;
        kVar.k = true;
        kVar.p(true);
        return this;
    }
}
