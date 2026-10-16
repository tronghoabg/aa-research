package android.support.v7.view;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.support.v7.view.menu.t;
import android.support.v7.view.menu.y;
import android.support.v7.widget.cg;
import android.support.v7.widget.gc;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class h {
    private String A;
    private String B;
    private CharSequence C;
    private CharSequence D;
    private ColorStateList E = null;
    private PorterDuff.Mode F = null;

    /* renamed from: a, reason: collision with root package name */
    ActionProvider f685a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f686b;

    /* renamed from: c, reason: collision with root package name */
    private final Menu f687c;

    /* renamed from: d, reason: collision with root package name */
    private int f688d;

    /* renamed from: e, reason: collision with root package name */
    private int f689e;

    /* renamed from: f, reason: collision with root package name */
    private int f690f;

    /* renamed from: g, reason: collision with root package name */
    private int f691g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f692h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f693i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f694j;

    /* renamed from: k, reason: collision with root package name */
    private int f695k;

    /* renamed from: l, reason: collision with root package name */
    private int f696l;
    private CharSequence m;
    private CharSequence n;
    private int o;
    private char p;
    private int q;
    private char r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private String z;

    public h(i iVar, Menu menu) {
        this.f686b = iVar;
        this.f687c = menu;
        e();
    }

    private final Object g(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f686b.f701e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e2);
            return null;
        }
    }

    private final void h(MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = false;
        menuItem.setChecked(this.u).setVisible(this.v).setEnabled(this.w).setCheckable(this.t > 0).setTitleCondensed(this.n).setIcon(this.o);
        int i2 = this.x;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.B != null) {
            i iVar = this.f686b;
            if (iVar.f701e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new g(iVar.a(), this.B));
        }
        if (this.t >= 2) {
            if (menuItem instanceof t) {
                ((t) menuItem).g(true);
            } else if (menuItem instanceof y) {
                ((y) menuItem).f();
            }
        }
        String str = this.z;
        if (str != null) {
            menuItem.setActionView((View) g(str, i.f697a, this.f686b.f699c));
            z = true;
        }
        int i3 = this.y;
        if (i3 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        ActionProvider actionProvider = this.f685a;
        if (actionProvider != null) {
            MenuItemCompat.setActionProvider(menuItem, actionProvider);
        }
        MenuItemCompat.setContentDescription(menuItem, this.C);
        MenuItemCompat.setTooltipText(menuItem, this.D);
        MenuItemCompat.setAlphabeticShortcut(menuItem, this.p, this.q);
        MenuItemCompat.setNumericShortcut(menuItem, this.r, this.s);
        PorterDuff.Mode mode = this.F;
        if (mode != null) {
            MenuItemCompat.setIconTintMode(menuItem, mode);
        }
        ColorStateList colorStateList = this.E;
        if (colorStateList != null) {
            MenuItemCompat.setIconTintList(menuItem, colorStateList);
        }
    }

    private static final char i(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    public final SubMenu a() {
        this.f694j = true;
        SubMenu subMenuAddSubMenu = this.f687c.addSubMenu(this.f688d, this.f695k, this.f696l, this.m);
        h(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    public final void b() {
        this.f694j = true;
        h(this.f687c.add(this.f688d, this.f695k, this.f696l, this.m));
    }

    public final void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f686b.f701e.obtainStyledAttributes(attributeSet, android.support.v7.a.a.p);
        this.f688d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f689e = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f690f = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f691g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f692h = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f693i = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(AttributeSet attributeSet) {
        i iVar = this.f686b;
        gc gcVarM = gc.m(iVar.f701e, attributeSet, android.support.v7.a.a.q);
        this.f695k = gcVarM.f(2, 0);
        this.f696l = (gcVarM.c(5, this.f689e) & SupportMenu.CATEGORY_MASK) | ((char) gcVarM.c(6, this.f690f));
        this.m = gcVarM.o(7);
        this.n = gcVarM.o(8);
        this.o = gcVarM.f(0, 0);
        this.p = i(gcVarM.p(9));
        this.q = gcVarM.c(16, 4096);
        this.r = i(gcVarM.p(10));
        this.s = gcVarM.c(20, 4096);
        if (gcVarM.s(11)) {
            this.t = gcVarM.r(11, false) ? 1 : 0;
        } else {
            this.t = this.f691g;
        }
        this.u = gcVarM.r(3, false);
        this.v = gcVarM.r(4, this.f692h);
        this.w = gcVarM.r(1, this.f693i);
        this.x = gcVarM.c(21, -1);
        this.B = gcVarM.p(12);
        this.y = gcVarM.f(13, 0);
        this.z = gcVarM.p(15);
        String strP = gcVarM.p(14);
        this.A = strP;
        if (strP == null) {
            this.f685a = null;
        } else if (this.y == 0 && this.z == null) {
            this.f685a = (ActionProvider) g(strP, i.f698b, iVar.f700d);
        } else {
            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            this.f685a = null;
        }
        this.C = gcVarM.o(17);
        this.D = gcVarM.o(22);
        if (gcVarM.s(19)) {
            int iC = gcVarM.c(19, -1);
            PorterDuff.Mode mode = this.F;
            Rect rect = cg.f1231a;
            this.F = com.waze.c.c.e.h(iC, mode);
        } else {
            this.F = null;
        }
        if (gcVarM.s(18)) {
            this.E = gcVarM.g(18);
        } else {
            this.E = null;
        }
        gcVarM.q();
        this.f694j = false;
    }

    public final void e() {
        this.f688d = 0;
        this.f689e = 0;
        this.f690f = 0;
        this.f691g = 0;
        this.f692h = true;
        this.f693i = true;
    }

    public final boolean f() {
        return this.f694j;
    }
}
