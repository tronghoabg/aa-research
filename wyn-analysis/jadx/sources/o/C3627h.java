package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import d1.InterfaceMenuItemC2385a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p.n;
import p.r;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3627h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f41199A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f41200B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C3628i f41203E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f41204a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41211h;

    /* renamed from: i, reason: collision with root package name */
    public int f41212i;

    /* renamed from: j, reason: collision with root package name */
    public int f41213j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f41214l;

    /* renamed from: m, reason: collision with root package name */
    public int f41215m;

    /* renamed from: n, reason: collision with root package name */
    public char f41216n;

    /* renamed from: o, reason: collision with root package name */
    public int f41217o;

    /* renamed from: p, reason: collision with root package name */
    public char f41218p;

    /* renamed from: q, reason: collision with root package name */
    public int f41219q;

    /* renamed from: r, reason: collision with root package name */
    public int f41220r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f41221s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f41222t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41223u;

    /* renamed from: v, reason: collision with root package name */
    public int f41224v;

    /* renamed from: w, reason: collision with root package name */
    public int f41225w;

    /* renamed from: x, reason: collision with root package name */
    public String f41226x;

    /* renamed from: y, reason: collision with root package name */
    public String f41227y;

    /* renamed from: z, reason: collision with root package name */
    public n f41228z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f41201C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f41202D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f41205b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f41206c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f41207d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f41208e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41209f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41210g = true;

    public C3627h(C3628i c3628i, Menu menu) {
        this.f41203E = c3628i;
        this.f41204a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f41203E.f41233c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f41221s).setVisible(this.f41222t).setEnabled(this.f41223u).setCheckable(this.f41220r >= 1).setTitleCondensed(this.f41214l).setIcon(this.f41215m);
        int i5 = this.f41224v;
        if (i5 >= 0) {
            menuItem.setShowAsAction(i5);
        }
        String str = this.f41227y;
        C3628i c3628i = this.f41203E;
        if (str != null) {
            if (c3628i.f41233c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c3628i.f41234d == null) {
                c3628i.f41234d = C3628i.a(c3628i.f41233c);
            }
            Object obj = c3628i.f41234d;
            String str2 = this.f41227y;
            MenuItemOnMenuItemClickListenerC3626g menuItemOnMenuItemClickListenerC3626g = new MenuItemOnMenuItemClickListenerC3626g();
            menuItemOnMenuItemClickListenerC3626g.f41197a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC3626g.f41198b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC3626g.f41196c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC3626g);
            } catch (Exception e7) {
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbW.append(cls.getName());
                InflateException inflateException = new InflateException(sbW.toString());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f41220r >= 2) {
            if (menuItem instanceof p.m) {
                p.m mVar = (p.m) menuItem;
                mVar.f43090x = (mVar.f43090x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                try {
                    Method method = rVar.f43103e;
                    InterfaceMenuItemC2385a interfaceMenuItemC2385a = rVar.f43102d;
                    if (method == null) {
                        rVar.f43103e = interfaceMenuItemC2385a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.f43103e.invoke(interfaceMenuItemC2385a, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str3 = this.f41226x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C3628i.f41229e, c3628i.f41231a));
            z2 = true;
        }
        int i10 = this.f41225w;
        if (i10 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        n nVar = this.f41228z;
        if (nVar != null) {
            if (menuItem instanceof InterfaceMenuItemC2385a) {
                ((InterfaceMenuItemC2385a) menuItem).b(nVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f41199A;
        boolean z10 = menuItem instanceof InterfaceMenuItemC2385a;
        if (z10) {
            ((InterfaceMenuItemC2385a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Y0.b.m(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f41200B;
        if (z10) {
            ((InterfaceMenuItemC2385a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Y0.b.q(menuItem, charSequence2);
        }
        char c10 = this.f41216n;
        int i11 = this.f41217o;
        if (z10) {
            ((InterfaceMenuItemC2385a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Y0.b.l(menuItem, c10, i11);
        }
        char c11 = this.f41218p;
        int i12 = this.f41219q;
        if (z10) {
            ((InterfaceMenuItemC2385a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Y0.b.p(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.f41202D;
        if (mode != null) {
            if (z10) {
                ((InterfaceMenuItemC2385a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                Y0.b.o(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f41201C;
        if (colorStateList != null) {
            if (z10) {
                ((InterfaceMenuItemC2385a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                Y0.b.n(menuItem, colorStateList);
            }
        }
    }
}
