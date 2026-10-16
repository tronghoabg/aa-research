package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class t implements SupportMenuItem {
    private ActionProvider A;
    private MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    final q f841a;

    /* renamed from: b, reason: collision with root package name */
    private final int f842b;

    /* renamed from: c, reason: collision with root package name */
    private final int f843c;

    /* renamed from: d, reason: collision with root package name */
    private final int f844d;

    /* renamed from: e, reason: collision with root package name */
    private final int f845e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f846f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f847g;

    /* renamed from: h, reason: collision with root package name */
    private Intent f848h;

    /* renamed from: i, reason: collision with root package name */
    private char f849i;

    /* renamed from: k, reason: collision with root package name */
    private char f851k;
    private Drawable m;
    private al o;
    private MenuItem.OnMenuItemClickListener p;
    private CharSequence q;
    private CharSequence r;
    private int y;
    private View z;

    /* renamed from: j, reason: collision with root package name */
    private int f850j = 4096;

    /* renamed from: l, reason: collision with root package name */
    private int f852l = 4096;
    private int n = 0;
    private ColorStateList s = null;
    private PorterDuff.Mode t = null;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private int x = 16;
    private boolean C = false;

    t(q qVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f841a = qVar;
        this.f842b = i3;
        this.f843c = i2;
        this.f844d = i4;
        this.f845e = i5;
        this.f846f = charSequence;
        this.y = i6;
    }

    private final Drawable s(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = drawable.mutate();
            if (this.u) {
                DrawableCompat.setTintList(drawable, this.s);
            }
            if (this.v) {
                DrawableCompat.setTintMode(drawable, this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    private static void t(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    final char a() {
        return this.f841a.D() ? this.f851k : this.f849i;
    }

    public final int b() {
        return this.f845e;
    }

    final CharSequence c(ae aeVar) {
        return aeVar.g() ? getTitleCondensed() : this.f846f;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f841a.y(this);
        }
        return false;
    }

    final String d() {
        char cA = a();
        if (cA == 0) {
            return "";
        }
        q qVar = this.f841a;
        Resources resources = qVar.a().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(qVar.a()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        int i2 = qVar.D() ? this.f852l : this.f850j;
        t(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
        t(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        t(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        t(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        t(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        t(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (cA == '\b') {
            sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        } else if (cA == '\n') {
            sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
        } else if (cA != ' ') {
            sb.append(cA);
        } else {
            sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public final void e(boolean z) {
        this.C = z;
        this.f841a.p(false);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f841a.A(this);
        }
        return false;
    }

    final void f(boolean z) {
        int i2 = this.x;
        int i3 = (true != z ? 0 : 2) | (i2 & (-3));
        this.x = i3;
        if (i2 != i3) {
            this.f841a.p(false);
        }
    }

    public final void g(boolean z) {
        this.x = (true != z ? 0 : 4) | (this.x & (-5));
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.A;
        if (actionProvider == null) {
            return null;
        }
        View viewOnCreateActionView = actionProvider.onCreateActionView(this);
        this.z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f852l;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f851k;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f843c;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.m;
        if (drawable != null) {
            return s(drawable);
        }
        int i2 = this.n;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableD = android.support.a.i.d(this.f841a.a(), i2);
        this.n = 0;
        this.m = drawableD;
        return s(drawableD);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f848h;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f842b;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f850j;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f849i;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f844d;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final ActionProvider getSupportActionProvider() {
        return this.A;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f846f;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f847g;
        return charSequence != null ? charSequence : this.f846f;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    public final void h(boolean z) {
        int i2 = this.x;
        this.x = z ? i2 | 32 : i2 & (-33);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    public final void i(al alVar) {
        this.o = alVar;
        alVar.setHeaderTitle(this.f846f);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProvider actionProvider = this.A;
        return (actionProvider == null || !actionProvider.overridesItemVisibility()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.isVisible();
    }

    public final boolean j() {
        ActionProvider actionProvider;
        if ((this.y & 8) != 0) {
            View viewOnCreateActionView = this.z;
            if (viewOnCreateActionView == null && (actionProvider = this.A) != null) {
                viewOnCreateActionView = actionProvider.onCreateActionView(this);
                this.z = viewOnCreateActionView;
            }
            if (viewOnCreateActionView != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.p;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        q qVar = this.f841a;
        if (qVar.z(qVar, this)) {
            return true;
        }
        Intent intent = this.f848h;
        if (intent != null) {
            try {
                qVar.a().startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        ActionProvider actionProvider = this.A;
        return actionProvider != null && actionProvider.onPerformDefaultAction();
    }

    public final boolean l() {
        return (this.x & 32) == 32;
    }

    public final boolean m() {
        return (this.x & 4) != 0;
    }

    public final boolean n() {
        return (this.y & 1) == 1;
    }

    final boolean o(boolean z) {
        int i2 = this.x;
        int i3 = (true != z ? 8 : 0) | (i2 & (-9));
        this.x = i3;
        return i2 != i3;
    }

    final boolean p() {
        return this.f841a.E() && a() != 0;
    }

    public final boolean q() {
        return (this.y & 4) == 4;
    }

    public final void r(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f842b) > 0) {
            view.setId(i2);
        }
        this.f841a.H();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresActionButton() {
        return (this.y & 2) == 2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresOverflow() {
        return (requiresActionButton() || n()) ? false : true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        Context contextA = this.f841a.a();
        r(LayoutInflater.from(contextA).inflate(i2, (ViewGroup) new LinearLayout(contextA), false));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f851k == c2 && this.f852l == i2) {
            return this;
        }
        this.f851k = Character.toLowerCase(c2);
        this.f852l = KeyEvent.normalizeMetaState(i2);
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i2 = this.x;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.x = i3;
        if (i2 != i3) {
            this.f841a.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.x & 4) != 0) {
            this.f841a.u(this);
            return this;
        }
        f(z);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i2 = this.x;
        this.x = z ? i2 | 16 : i2 & (-17);
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.m = null;
        this.n = i2;
        this.w = true;
        this.f841a.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.f841a.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f848h = intent;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f849i == c2 && this.f850j == i2) {
            return this;
        }
        this.f849i = c2;
        this.f850j = KeyEvent.normalizeMetaState(i2);
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f849i = c2;
        this.f850j = KeyEvent.normalizeMetaState(i2);
        this.f851k = Character.toLowerCase(c3);
        this.f852l = KeyEvent.normalizeMetaState(i3);
        this.f841a.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i2;
        this.f841a.H();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.A;
        if (actionProvider2 != null) {
            actionProvider2.reset();
        }
        this.z = null;
        this.A = actionProvider;
        this.f841a.p(true);
        ActionProvider actionProvider3 = this.A;
        if (actionProvider3 != null) {
            actionProvider3.setVisibilityListener(new s(this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f846f = charSequence;
        this.f841a.p(false);
        al alVar = this.o;
        if (alVar != null) {
            alVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f847g = charSequence;
        this.f841a.p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (o(z)) {
            this.f841a.I();
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f846f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.n = 0;
        this.m = drawable;
        this.w = true;
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f841a.a().getString(i2));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        r(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f849i == c2) {
            return this;
        }
        this.f849i = c2;
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f849i = c2;
        this.f851k = Character.toLowerCase(c3);
        this.f841a.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f851k == c2) {
            return this;
        }
        this.f851k = Character.toLowerCase(c2);
        this.f841a.p(false);
        return this;
    }
}
