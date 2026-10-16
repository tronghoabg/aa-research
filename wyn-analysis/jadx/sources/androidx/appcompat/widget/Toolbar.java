package androidx.appcompat.widget;

import F6.f;
import Fe.g;
import a2.C1323c;
import ad.L;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.V;
import com.wynauto.wyn.R;
import ff.AbstractC2641B;
import g5.RunnableC2707d;
import i.AbstractC2820a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.C3126m;
import k1.InterfaceC3123j;
import k1.InterfaceC3127n;
import k1.S;
import md.J;
import o.C3628i;
import p.k;
import p.m;
import q.C3816i;
import q.C3837t;
import q.C3839u;
import q.InterfaceC3819j0;
import q.Q0;
import q.Y;
import q.h1;
import q.j1;
import q.k1;
import q.l1;
import q.m1;
import q.n1;
import q.o1;
import q.v1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC3123j {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f17961A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17962B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17963C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f17964D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f17965E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f17966F;

    /* renamed from: G, reason: collision with root package name */
    public final C3126m f17967G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f17968H;

    /* renamed from: I, reason: collision with root package name */
    public final L f17969I;

    /* renamed from: J, reason: collision with root package name */
    public o1 f17970J;

    /* renamed from: K, reason: collision with root package name */
    public C3816i f17971K;
    public j1 L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f17972M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f17973N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f17974O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f17975P;

    /* renamed from: Q, reason: collision with root package name */
    public final RunnableC2707d f17976Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f17977a;

    /* renamed from: b, reason: collision with root package name */
    public Y f17978b;

    /* renamed from: c, reason: collision with root package name */
    public Y f17979c;

    /* renamed from: d, reason: collision with root package name */
    public C3837t f17980d;

    /* renamed from: e, reason: collision with root package name */
    public C3839u f17981e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f17982f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f17983g;

    /* renamed from: h, reason: collision with root package name */
    public C3837t f17984h;

    /* renamed from: i, reason: collision with root package name */
    public View f17985i;

    /* renamed from: j, reason: collision with root package name */
    public Context f17986j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f17987l;

    /* renamed from: m, reason: collision with root package name */
    public int f17988m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17989n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17990o;

    /* renamed from: p, reason: collision with root package name */
    public int f17991p;

    /* renamed from: q, reason: collision with root package name */
    public int f17992q;

    /* renamed from: r, reason: collision with root package name */
    public int f17993r;

    /* renamed from: s, reason: collision with root package name */
    public int f17994s;

    /* renamed from: t, reason: collision with root package name */
    public Q0 f17995t;

    /* renamed from: u, reason: collision with root package name */
    public int f17996u;

    /* renamed from: v, reason: collision with root package name */
    public int f17997v;

    /* renamed from: w, reason: collision with root package name */
    public final int f17998w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f17999x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f18000y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f18001z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i5 = 0; i5 < menu.size(); i5++) {
            arrayList.add(menu.getItem(i5));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C3628i(getContext());
    }

    public static k1 h() {
        k1 k1Var = new k1(-2, -2);
        k1Var.f43822b = 0;
        k1Var.f43821a = 8388627;
        return k1Var;
    }

    public static k1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof k1;
        if (z2) {
            k1 k1Var = (k1) layoutParams;
            k1 k1Var2 = new k1(k1Var);
            k1Var2.f43822b = 0;
            k1Var2.f43822b = k1Var.f43822b;
            return k1Var2;
        }
        if (z2) {
            k1 k1Var3 = new k1((k1) layoutParams);
            k1Var3.f43822b = 0;
            return k1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            k1 k1Var4 = new k1(layoutParams);
            k1Var4.f43822b = 0;
            return k1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        k1 k1Var5 = new k1(marginLayoutParams);
        k1Var5.f43822b = 0;
        ((ViewGroup.MarginLayoutParams) k1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) k1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) k1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) k1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return k1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i5) {
        WeakHashMap weakHashMap = S.f38779a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                k1 k1Var = (k1) childAt.getLayoutParams();
                if (k1Var.f43822b == 0 && t(childAt)) {
                    int i11 = k1Var.f43821a;
                    WeakHashMap weakHashMap2 = S.f38779a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            k1 k1Var2 = (k1) childAt2.getLayoutParams();
            if (k1Var2.f43822b == 0 && t(childAt2)) {
                int i13 = k1Var2.f43821a;
                WeakHashMap weakHashMap3 = S.f38779a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // k1.InterfaceC3123j
    public final void addMenuProvider(InterfaceC3127n interfaceC3127n) {
        C3126m c3126m = this.f17967G;
        c3126m.f38847b.add(interfaceC3127n);
        c3126m.f38846a.run();
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k1 k1VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (k1) layoutParams;
        k1VarH.f43822b = 1;
        if (!z2 || this.f17985i == null) {
            addView(view, k1VarH);
        } else {
            view.setLayoutParams(k1VarH);
            this.f17965E.add(view);
        }
    }

    public final void c() {
        if (this.f17984h == null) {
            C3837t c3837t = new C3837t(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f17984h = c3837t;
            c3837t.setImageDrawable(this.f17982f);
            this.f17984h.setContentDescription(this.f17983g);
            k1 k1VarH = h();
            k1VarH.f43821a = (this.f17989n & 112) | 8388611;
            k1VarH.f43822b = 2;
            this.f17984h.setLayoutParams(k1VarH);
            this.f17984h.setOnClickListener(new f(this, 5));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof k1);
    }

    public final void d() {
        if (this.f17995t == null) {
            Q0 q02 = new Q0();
            q02.f43695a = 0;
            q02.f43696b = 0;
            q02.f43697c = Integer.MIN_VALUE;
            q02.f43698d = Integer.MIN_VALUE;
            q02.f43699e = 0;
            q02.f43700f = 0;
            q02.f43701g = false;
            q02.f43702h = false;
            this.f17995t = q02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f17977a;
        if (actionMenuView.f17840p == null) {
            k kVar = (k) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new j1(this);
            }
            this.f17977a.setExpandedActionViewsExclusive(true);
            kVar.b(this.L, this.f17986j);
            u();
        }
    }

    public final void f() {
        if (this.f17977a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f17977a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.f17977a.setOnMenuItemClickListener(this.f17969I);
            ActionMenuView actionMenuView2 = this.f17977a;
            C1323c c1323c = new C1323c(this, 24);
            actionMenuView2.getClass();
            actionMenuView2.f17845u = c1323c;
            k1 k1VarH = h();
            k1VarH.f43821a = (this.f17989n & 112) | 8388613;
            this.f17977a.setLayoutParams(k1VarH);
            b(this.f17977a, false);
        }
    }

    public final void g() {
        if (this.f17980d == null) {
            this.f17980d = new C3837t(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            k1 k1VarH = h();
            k1VarH.f43821a = (this.f17989n & 112) | 8388611;
            this.f17980d.setLayoutParams(k1VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C3837t c3837t = this.f17984h;
        if (c3837t != null) {
            return c3837t.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C3837t c3837t = this.f17984h;
        if (c3837t != null) {
            return c3837t.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q0 q02 = this.f17995t;
        if (q02 != null) {
            return q02.f43701g ? q02.f43695a : q02.f43696b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i5 = this.f17997v;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q0 q02 = this.f17995t;
        if (q02 != null) {
            return q02.f43695a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q0 q02 = this.f17995t;
        if (q02 != null) {
            return q02.f43696b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q0 q02 = this.f17995t;
        if (q02 != null) {
            return q02.f43701g ? q02.f43696b : q02.f43695a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i5 = this.f17996u;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        k kVar;
        ActionMenuView actionMenuView = this.f17977a;
        return (actionMenuView == null || (kVar = actionMenuView.f17840p) == null || !kVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f17997v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = S.f38779a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = S.f38779a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f17996u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C3839u c3839u = this.f17981e;
        if (c3839u != null) {
            return c3839u.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C3839u c3839u = this.f17981e;
        if (c3839u != null) {
            return c3839u.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f17977a.getMenu();
    }

    public View getNavButtonView() {
        return this.f17980d;
    }

    public CharSequence getNavigationContentDescription() {
        C3837t c3837t = this.f17980d;
        if (c3837t != null) {
            return c3837t.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C3837t c3837t = this.f17980d;
        if (c3837t != null) {
            return c3837t.getDrawable();
        }
        return null;
    }

    public C3816i getOuterActionMenuPresenter() {
        return this.f17971K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f17977a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f17986j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.f18000y;
    }

    public final TextView getSubtitleTextView() {
        return this.f17979c;
    }

    public CharSequence getTitle() {
        return this.f17999x;
    }

    public int getTitleMarginBottom() {
        return this.f17994s;
    }

    public int getTitleMarginEnd() {
        return this.f17992q;
    }

    public int getTitleMarginStart() {
        return this.f17991p;
    }

    public int getTitleMarginTop() {
        return this.f17993r;
    }

    public final TextView getTitleTextView() {
        return this.f17978b;
    }

    public InterfaceC3819j0 getWrapper() {
        Drawable drawable;
        if (this.f17970J == null) {
            o1 o1Var = new o1();
            o1Var.f43862n = 0;
            o1Var.f43850a = this;
            o1Var.f43857h = getTitle();
            o1Var.f43858i = getSubtitle();
            o1Var.f43856g = o1Var.f43857h != null;
            o1Var.f43855f = getNavigationIcon();
            J jS = J.s(getContext(), null, AbstractC2820a.f36438a, R.attr.actionBarStyle, 0);
            o1Var.f43863o = jS.n(15);
            TypedArray typedArray = (TypedArray) jS.f40581b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                o1Var.f43856g = true;
                o1Var.f43857h = text;
                if ((o1Var.f43851b & 8) != 0) {
                    Toolbar toolbar = o1Var.f43850a;
                    toolbar.setTitle(text);
                    if (o1Var.f43856g) {
                        S.n(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                o1Var.f43858i = text2;
                if ((o1Var.f43851b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableN = jS.n(20);
            if (drawableN != null) {
                o1Var.f43854e = drawableN;
                o1Var.c();
            }
            Drawable drawableN2 = jS.n(17);
            if (drawableN2 != null) {
                o1Var.f43853d = drawableN2;
                o1Var.c();
            }
            if (o1Var.f43855f == null && (drawable = o1Var.f43863o) != null) {
                o1Var.f43855f = drawable;
                int i5 = o1Var.f43851b & 4;
                Toolbar toolbar2 = o1Var.f43850a;
                if (i5 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            o1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = o1Var.f43852c;
                if (view != null && (o1Var.f43851b & 16) != 0) {
                    removeView(view);
                }
                o1Var.f43852c = viewInflate;
                if (viewInflate != null && (o1Var.f43851b & 16) != 0) {
                    addView(viewInflate);
                }
                o1Var.a(o1Var.f43851b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f17995t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f17987l = resourceId2;
                Y y10 = this.f17978b;
                if (y10 != null) {
                    y10.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f17988m = resourceId3;
                Y y11 = this.f17979c;
                if (y11 != null) {
                    y11.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            jS.v();
            if (R.string.abc_action_bar_up_description != o1Var.f43862n) {
                o1Var.f43862n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = o1Var.f43862n;
                    o1Var.f43859j = i10 != 0 ? getContext().getString(i10) : null;
                    o1Var.b();
                }
            }
            o1Var.f43859j = getNavigationContentDescription();
            setNavigationOnClickListener(new n1(o1Var));
            this.f17970J = o1Var;
        }
        return this.f17970J;
    }

    public final int j(int i5, View view) {
        k1 k1Var = (k1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i5 > 0 ? (measuredHeight - i5) / 2 : 0;
        int i11 = k1Var.f43821a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f17998w & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) k1Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) k1Var).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) k1Var).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i5) {
        getMenuInflater().inflate(i5, getMenu());
    }

    public final void n() {
        Iterator it = this.f17968H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f17967G.f38847b.iterator();
        while (it2.hasNext()) {
            ((V) ((InterfaceC3127n) it2.next())).f18344a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f17968H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f17965E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f17976Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f17963C = false;
        }
        if (!this.f17963C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f17963C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f17963C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0295 A[LOOP:0: B:104:0x0293->B:105:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ad A[LOOP:1: B:107:0x02ab->B:108:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cd A[LOOP:2: B:110:0x02cb->B:111:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0321 A[LOOP:3: B:119:0x031f->B:120:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = v1.a(this);
        int i11 = !zA ? 1 : 0;
        int i12 = 0;
        if (t(this.f17980d)) {
            s(this.f17980d, i5, 0, i10, this.f17990o);
            iK = k(this.f17980d) + this.f17980d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f17980d) + this.f17980d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f17980d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.f17984h)) {
            s(this.f17984h, i5, 0, i10, this.f17990o);
            iK = k(this.f17984h) + this.f17984h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f17984h) + this.f17984h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f17984h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.f17966F;
        iArr[zA ? 1 : 0] = iMax4;
        if (t(this.f17977a)) {
            s(this.f17977a, i5, iMax3, i10, this.f17990o);
            iK2 = k(this.f17977a) + this.f17977a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f17977a) + this.f17977a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f17977a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[i11] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.f17985i)) {
            iMax5 += r(this.f17985i, i5, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f17985i) + this.f17985i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f17985i.getMeasuredState());
        }
        if (t(this.f17981e)) {
            iMax5 += r(this.f17981e, i5, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f17981e) + this.f17981e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f17981e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((k1) childAt.getLayoutParams()).f43822b == 0 && t(childAt)) {
                iMax5 += r(childAt, i5, iMax5, i10, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.f17993r + this.f17994s;
        int i16 = this.f17991p + this.f17992q;
        if (t(this.f17978b)) {
            r(this.f17978b, i5, i14 + i16, i10, i15, iArr);
            int iK3 = k(this.f17978b) + this.f17978b.getMeasuredWidth();
            iL = l(this.f17978b) + this.f17978b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f17978b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f17979c)) {
            iMax2 = Math.max(iMax2, r(this.f17979c, i5, i14 + i16, i10, i15 + iL, iArr));
            iL += l(this.f17979c) + this.f17979c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f17979c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i5, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16);
        if (!this.f17972M) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof m1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m1 m1Var = (m1) parcelable;
        super.onRestoreInstanceState(m1Var.f44826a);
        ActionMenuView actionMenuView = this.f17977a;
        k kVar = actionMenuView != null ? actionMenuView.f17840p : null;
        int i5 = m1Var.f43833c;
        if (i5 != 0 && this.L != null && kVar != null && (menuItemFindItem = kVar.findItem(i5)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (m1Var.f43834d) {
            RunnableC2707d runnableC2707d = this.f17976Q;
            removeCallbacks(runnableC2707d);
            post(runnableC2707d);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        d();
        Q0 q02 = this.f17995t;
        boolean z2 = i5 == 1;
        if (z2 == q02.f43701g) {
            return;
        }
        q02.f43701g = z2;
        if (!q02.f43702h) {
            q02.f43695a = q02.f43699e;
            q02.f43696b = q02.f43700f;
            return;
        }
        if (z2) {
            int i10 = q02.f43698d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = q02.f43699e;
            }
            q02.f43695a = i10;
            int i11 = q02.f43697c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = q02.f43700f;
            }
            q02.f43696b = i11;
            return;
        }
        int i12 = q02.f43697c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = q02.f43699e;
        }
        q02.f43695a = i12;
        int i13 = q02.f43698d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = q02.f43700f;
        }
        q02.f43696b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C3816i c3816i;
        m mVar;
        m1 m1Var = new m1(super.onSaveInstanceState());
        j1 j1Var = this.L;
        if (j1Var != null && (mVar = j1Var.f43813b) != null) {
            m1Var.f43833c = mVar.f43068a;
        }
        ActionMenuView actionMenuView = this.f17977a;
        m1Var.f43834d = (actionMenuView == null || (c3816i = actionMenuView.f17844t) == null || !c3816i.j()) ? false : true;
        return m1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17962B = false;
        }
        if (!this.f17962B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f17962B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f17962B = false;
        return true;
    }

    public final int p(View view, int i5, int i10, int[] iArr) {
        k1 k1Var = (k1) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) k1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i11) + i5;
        iArr[0] = Math.max(0, -i11);
        int iJ = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) k1Var).rightMargin + iMax;
    }

    public final int q(View view, int i5, int i10, int[] iArr) {
        k1 k1Var = (k1) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) k1Var).rightMargin - iArr[1];
        int iMax = i5 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int iJ = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) k1Var).leftMargin);
    }

    public final int r(View view, int i5, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // k1.InterfaceC3123j
    public final void removeMenuProvider(InterfaceC3127n interfaceC3127n) {
        this.f17967G.b(interfaceC3127n);
    }

    public final void s(View view, int i5, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f17975P != z2) {
            this.f17975P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i5) {
        setCollapseContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setCollapseIcon(int i5) {
        setCollapseIcon(g.B(getContext(), i5));
    }

    public void setCollapsible(boolean z2) {
        this.f17972M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.f17997v) {
            this.f17997v = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.f17996u) {
            this.f17996u = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i5) {
        setLogo(g.B(getContext(), i5));
    }

    public void setLogoDescription(int i5) {
        setLogoDescription(getContext().getText(i5));
    }

    public void setNavigationContentDescription(int i5) {
        setNavigationContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setNavigationIcon(int i5) {
        setNavigationIcon(g.B(getContext(), i5));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f17980d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f17977a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i5) {
        if (this.k != i5) {
            this.k = i5;
            if (i5 == 0) {
                this.f17986j = getContext();
            } else {
                this.f17986j = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setSubtitle(int i5) {
        setSubtitle(getContext().getText(i5));
    }

    public void setSubtitleTextColor(int i5) {
        setSubtitleTextColor(ColorStateList.valueOf(i5));
    }

    public void setTitle(int i5) {
        setTitle(getContext().getText(i5));
    }

    public void setTitleMarginBottom(int i5) {
        this.f17994s = i5;
        requestLayout();
    }

    public void setTitleMarginEnd(int i5) {
        this.f17992q = i5;
        requestLayout();
    }

    public void setTitleMarginStart(int i5) {
        this.f17991p = i5;
        requestLayout();
    }

    public void setTitleMarginTop(int i5) {
        this.f17993r = i5;
        requestLayout();
    }

    public void setTitleTextColor(int i5) {
        setTitleTextColor(ColorStateList.valueOf(i5));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L4f
            android.window.OnBackInvokedDispatcher r1 = q.i1.a(r4)
            q.j1 r2 = r4.L
            if (r2 == 0) goto L23
            p.m r2 = r2.f43813b
            if (r2 == 0) goto L23
            if (r1 == 0) goto L23
            java.util.WeakHashMap r2 = k1.S.f38779a
            boolean r2 = r4.isAttachedToWindow()
            if (r2 == 0) goto L23
            boolean r2 = r4.f17975P
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = r0
        L24:
            if (r2 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.f17974O
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r2 = r4.f17973N
            if (r2 != 0) goto L39
            q.h1 r2 = new q.h1
            r2.<init>(r4, r0)
            android.window.OnBackInvokedCallback r0 = q.i1.b(r2)
            r4.f17973N = r0
        L39:
            android.window.OnBackInvokedCallback r0 = r4.f17973N
            q.i1.c(r1, r0)
            r4.f17974O = r1
            return
        L41:
            if (r2 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.f17974O
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.f17973N
            q.i1.d(r0, r1)
            r0 = 0
            r4.f17974O = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.u():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f17998w = 8388627;
        this.f17964D = new ArrayList();
        this.f17965E = new ArrayList();
        this.f17966F = new int[2];
        this.f17967G = new C3126m(new h1(this, 1));
        this.f17968H = new ArrayList();
        this.f17969I = new L(this, 22);
        this.f17976Q = new RunnableC2707d(this, 21);
        Context context2 = getContext();
        int[] iArr = AbstractC2820a.f36461y;
        J jS = J.s(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        S.l(this, context, iArr, attributeSet, (TypedArray) jS.f40581b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        this.f17987l = typedArray.getResourceId(28, 0);
        this.f17988m = typedArray.getResourceId(19, 0);
        this.f17998w = typedArray.getInteger(0, 8388627);
        this.f17989n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f17994s = dimensionPixelOffset;
        this.f17993r = dimensionPixelOffset;
        this.f17992q = dimensionPixelOffset;
        this.f17991p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f17991p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f17992q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f17993r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f17994s = dimensionPixelOffset5;
        }
        this.f17990o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q0 q02 = this.f17995t;
        q02.f43702h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q02.f43699e = dimensionPixelSize;
            q02.f43695a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q02.f43700f = dimensionPixelSize2;
            q02.f43696b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f17996u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f17997v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f17982f = jS.n(4);
        this.f17983g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f17986j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableN = jS.n(16);
        if (drawableN != null) {
            setNavigationIcon(drawableN);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableN2 = jS.n(11);
        if (drawableN2 != null) {
            setLogo(drawableN2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(jS.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(jS.m(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        jS.v();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k1 k1Var = new k1(context, attributeSet);
        k1Var.f43821a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36439b);
        k1Var.f43821a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        k1Var.f43822b = 0;
        return k1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C3837t c3837t = this.f17984h;
        if (c3837t != null) {
            c3837t.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f17984h.setImageDrawable(drawable);
        } else {
            C3837t c3837t = this.f17984h;
            if (c3837t != null) {
                c3837t.setImageDrawable(this.f17982f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f17981e == null) {
                this.f17981e = new C3839u(getContext(), null, 0);
            }
            if (!o(this.f17981e)) {
                b(this.f17981e, true);
            }
        } else {
            C3839u c3839u = this.f17981e;
            if (c3839u != null && o(c3839u)) {
                removeView(this.f17981e);
                this.f17965E.remove(this.f17981e);
            }
        }
        C3839u c3839u2 = this.f17981e;
        if (c3839u2 != null) {
            c3839u2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f17981e == null) {
            this.f17981e = new C3839u(getContext(), null, 0);
        }
        C3839u c3839u = this.f17981e;
        if (c3839u != null) {
            c3839u.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C3837t c3837t = this.f17980d;
        if (c3837t != null) {
            c3837t.setContentDescription(charSequence);
            AbstractC2641B.J(this.f17980d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f17980d)) {
                b(this.f17980d, true);
            }
        } else {
            C3837t c3837t = this.f17980d;
            if (c3837t != null && o(c3837t)) {
                removeView(this.f17980d);
                this.f17965E.remove(this.f17980d);
            }
        }
        C3837t c3837t2 = this.f17980d;
        if (c3837t2 != null) {
            c3837t2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Y y10 = this.f17979c;
            if (y10 != null && o(y10)) {
                removeView(this.f17979c);
                this.f17965E.remove(this.f17979c);
            }
        } else {
            if (this.f17979c == null) {
                Context context = getContext();
                Y y11 = new Y(context, null);
                this.f17979c = y11;
                y11.setSingleLine();
                this.f17979c.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.f17988m;
                if (i5 != 0) {
                    this.f17979c.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.f17961A;
                if (colorStateList != null) {
                    this.f17979c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f17979c)) {
                b(this.f17979c, true);
            }
        }
        Y y12 = this.f17979c;
        if (y12 != null) {
            y12.setText(charSequence);
        }
        this.f18000y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f17961A = colorStateList;
        Y y10 = this.f17979c;
        if (y10 != null) {
            y10.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Y y10 = this.f17978b;
            if (y10 != null && o(y10)) {
                removeView(this.f17978b);
                this.f17965E.remove(this.f17978b);
            }
        } else {
            if (this.f17978b == null) {
                Context context = getContext();
                Y y11 = new Y(context, null);
                this.f17978b = y11;
                y11.setSingleLine();
                this.f17978b.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.f17987l;
                if (i5 != 0) {
                    this.f17978b.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.f18001z;
                if (colorStateList != null) {
                    this.f17978b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f17978b)) {
                b(this.f17978b, true);
            }
        }
        Y y12 = this.f17978b;
        if (y12 != null) {
            y12.setText(charSequence);
        }
        this.f17999x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f18001z = colorStateList;
        Y y10 = this.f17978b;
        if (y10 != null) {
            y10.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(l1 l1Var) {
    }
}
