package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList E;
    private final ArrayList F;
    private final int[] G;
    private ArrayList H;
    private final t I;
    private gm J;
    private p K;
    private gg L;
    private final Runnable M;

    /* renamed from: a, reason: collision with root package name */
    ActionMenuView f971a;

    /* renamed from: b, reason: collision with root package name */
    ImageButton f972b;

    /* renamed from: c, reason: collision with root package name */
    View f973c;

    /* renamed from: d, reason: collision with root package name */
    int f974d;

    /* renamed from: e, reason: collision with root package name */
    final MenuHostHelper f975e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f976f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f977g;

    /* renamed from: h, reason: collision with root package name */
    private ImageButton f978h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f979i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f980j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f981k;

    /* renamed from: l, reason: collision with root package name */
    private Context f982l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private fk u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = 8388627;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new int[2];
        this.f975e = new MenuHostHelper(new android.support.v4.app.ae(this, 8));
        this.H = new ArrayList();
        this.I = new gd(this);
        this.M = new e(this, 9);
        Context context2 = getContext();
        int[] iArr = android.support.v7.a.a.x;
        gc gcVarN = gc.n(context2, attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, gcVarN.h(), i2, 0);
        this.n = gcVarN.f(28, 0);
        this.o = gcVarN.f(19, 0);
        this.x = gcVarN.d(0, this.x);
        this.f974d = gcVarN.d(2, 48);
        int iA = gcVarN.a(22, 0);
        iA = gcVarN.s(27) ? gcVarN.a(27, iA) : iA;
        this.t = iA;
        this.s = iA;
        this.r = iA;
        this.q = iA;
        int iA2 = gcVarN.a(25, -1);
        if (iA2 >= 0) {
            this.q = iA2;
        }
        int iA3 = gcVarN.a(24, -1);
        if (iA3 >= 0) {
            this.r = iA3;
        }
        int iA4 = gcVarN.a(26, -1);
        if (iA4 >= 0) {
            this.s = iA4;
        }
        int iA5 = gcVarN.a(23, -1);
        if (iA5 >= 0) {
            this.t = iA5;
        }
        this.p = gcVarN.b(13, -1);
        int iA6 = gcVarN.a(9, Integer.MIN_VALUE);
        int iA7 = gcVarN.a(5, Integer.MIN_VALUE);
        int iB = gcVarN.b(7, 0);
        int iB2 = gcVarN.b(8, 0);
        N();
        this.u.c(iB, iB2);
        if (iA6 != Integer.MIN_VALUE || iA7 != Integer.MIN_VALUE) {
            this.u.e(iA6, iA7);
        }
        this.v = gcVarN.a(10, Integer.MIN_VALUE);
        this.w = gcVarN.a(6, Integer.MIN_VALUE);
        this.f980j = gcVarN.j(4);
        this.f981k = gcVarN.o(3);
        CharSequence charSequenceO = gcVarN.o(21);
        if (!TextUtils.isEmpty(charSequenceO)) {
            w(charSequenceO);
        }
        CharSequence charSequenceO2 = gcVarN.o(18);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            u(charSequenceO2);
        }
        this.f982l = getContext();
        t(gcVarN.f(17, 0));
        Drawable drawableJ = gcVarN.j(16);
        if (drawableJ != null) {
            r(drawableJ);
        }
        CharSequence charSequenceO3 = gcVarN.o(15);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            q(charSequenceO3);
        }
        Drawable drawableJ2 = gcVarN.j(11);
        if (drawableJ2 != null) {
            o(drawableJ2);
        }
        CharSequence charSequenceO4 = gcVarN.o(12);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            if (!TextUtils.isEmpty(charSequenceO4)) {
                O();
            }
            ImageView imageView = this.f979i;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceO4);
            }
        }
        if (gcVarN.s(29)) {
            ColorStateList colorStateListG = gcVarN.g(29);
            this.A = colorStateListG;
            TextView textView = this.f976f;
            if (textView != null) {
                textView.setTextColor(colorStateListG);
            }
        }
        if (gcVarN.s(20)) {
            ColorStateList colorStateListG2 = gcVarN.g(20);
            this.B = colorStateListG2;
            TextView textView2 = this.f977g;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListG2);
            }
        }
        if (gcVarN.s(14)) {
            J().inflate(gcVarN.f(14, 0), f());
        }
        gcVarN.q();
    }

    protected static final gh D(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gh ? new gh((gh) layoutParams) : layoutParams instanceof android.support.v7.app.a ? new gh((android.support.v7.app.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new gh((ViewGroup.MarginLayoutParams) layoutParams) : new gh(layoutParams);
    }

    private final int E(int i2) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i2, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private final int F(View view, int i2) {
        gh ghVar = (gh) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = ghVar.f498a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.x & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ghVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < ghVar.topMargin) {
            iMax = ghVar.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i5 < ghVar.bottomMargin) {
                iMax = Math.max(0, iMax - (ghVar.bottomMargin - i5));
            }
        }
        return paddingTop + iMax;
    }

    private final int G(View view, int i2, int[] iArr, int i3) {
        gh ghVar = (gh) view.getLayoutParams();
        int i4 = ghVar.leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iF = F(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iF, iMax + measuredWidth, view.getMeasuredHeight() + iF);
        return iMax + measuredWidth + ghVar.rightMargin;
    }

    private final int H(View view, int i2, int[] iArr, int i3) {
        gh ghVar = (gh) view.getLayoutParams();
        int i4 = ghVar.rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iF = F(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iF, iMax, view.getMeasuredHeight() + iF);
        return iMax - (measuredWidth + ghVar.leftMargin);
    }

    private final int I(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final MenuInflater J() {
        return new android.support.v7.view.i(getContext());
    }

    private final ArrayList K() {
        ArrayList arrayList = new ArrayList();
        Menu menuF = f();
        for (int i2 = 0; i2 < menuF.size(); i2++) {
            arrayList.add(menuF.getItem(i2));
        }
        return arrayList;
    }

    private final void L(List list, int i2) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                gh ghVar = (gh) childAt.getLayoutParams();
                if (ghVar.f1555b == 0 && S(childAt) && E(ghVar.f498a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            gh ghVar2 = (gh) childAt2.getLayoutParams();
            if (ghVar2.f1555b == 0 && S(childAt2) && E(ghVar2.f498a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void M(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        gh ghVar = layoutParams == null ? new gh() : !checkLayoutParams(layoutParams) ? D(layoutParams) : (gh) layoutParams;
        ghVar.f1555b = 1;
        if (!z || this.f973c == null) {
            addView(view, ghVar);
        } else {
            view.setLayoutParams(ghVar);
            this.F.add(view);
        }
    }

    private final void N() {
        if (this.u == null) {
            this.u = new fk();
        }
    }

    private final void O() {
        if (this.f979i == null) {
            this.f979i = new AppCompatImageView(getContext());
        }
    }

    private final void P() {
        if (this.f971a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f971a = actionMenuView;
            actionMenuView.k(this.m);
            ActionMenuView actionMenuView2 = this.f971a;
            actionMenuView2.f892b = this.I;
            actionMenuView2.f891a = new ge(this, 0);
            gh ghVar = new gh();
            ghVar.f498a = (this.f974d & 112) | GravityCompat.END;
            this.f971a.setLayoutParams(ghVar);
            M(this.f971a, false);
        }
    }

    private final void Q() {
        if (this.f978h == null) {
            this.f978h = new ak(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            gh ghVar = new gh();
            ghVar.f498a = (this.f974d & 112) | GravityCompat.START;
            this.f978h.setLayoutParams(ghVar);
        }
    }

    private final boolean R(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    private final boolean S(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int T(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int U(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void V(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean A() {
        ActionMenuView actionMenuView = this.f971a;
        return actionMenuView != null && actionMenuView.p();
    }

    public final boolean B() {
        ActionMenuView actionMenuView = this.f971a;
        return actionMenuView != null && actionMenuView.r();
    }

    public final gm C() {
        gm gmVar = this.J;
        if (gmVar != null) {
            return gmVar;
        }
        gm gmVar2 = new gm(this);
        this.J = gmVar2;
        return gmVar2;
    }

    public final int a() {
        fk fkVar = this.u;
        if (fkVar != null) {
            return fkVar.a();
        }
        return 0;
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider) {
        this.f975e.addMenuProvider(menuProvider);
    }

    public final int b() {
        fk fkVar = this.u;
        if (fkVar != null) {
            return fkVar.b();
        }
        return 0;
    }

    public final int c() {
        android.support.v7.view.menu.q qVarC;
        ActionMenuView actionMenuView = this.f971a;
        return (actionMenuView == null || (qVarC = actionMenuView.c()) == null || !qVarC.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.w, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof gh);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.v, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.f978h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        P();
        if (this.f971a.c() == null) {
            android.support.v7.view.menu.q qVar = (android.support.v7.view.menu.q) this.f971a.h();
            if (this.L == null) {
                this.L = new gg(this);
            }
            this.f971a.t();
            qVar.k(this.L, this.f982l);
            y();
        }
        return this.f971a.h();
    }

    public final CharSequence g() {
        ImageButton imageButton = this.f978h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gh();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gh(getContext(), attributeSet);
    }

    public final CharSequence h() {
        return this.z;
    }

    public final CharSequence i() {
        return this.y;
    }

    @Override // androidx.core.view.MenuHost
    public final void invalidateMenu() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f().removeItem(((MenuItem) arrayList.get(i2)).getItemId());
        }
        Menu menuF = f();
        ArrayList arrayListK = K();
        this.f975e.onCreateMenu(menuF, J());
        ArrayList arrayListK2 = K();
        arrayListK2.removeAll(arrayListK);
        this.H = arrayListK2;
    }

    final void j() {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                return;
            }
            addView((View) arrayList.get(size));
        }
    }

    public final void k() {
        gg ggVar = this.L;
        android.support.v7.view.menu.t tVar = ggVar == null ? null : ggVar.f1553b;
        if (tVar != null) {
            tVar.collapseActionView();
        }
    }

    final void l() {
        if (this.f972b == null) {
            ak akVar = new ak(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f972b = akVar;
            akVar.setImageDrawable(this.f980j);
            this.f972b.setContentDescription(this.f981k);
            gh ghVar = new gh();
            ghVar.f498a = (this.f974d & 112) | GravityCompat.START;
            ghVar.f1555b = 2;
            this.f972b.setLayoutParams(ghVar);
            this.f972b.setOnClickListener(new gf(this, 0));
        }
    }

    final void m() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = getChildAt(childCount);
            if (((gh) childAt.getLayoutParams()).f1555b != 2 && childAt != this.f971a) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public final void n(int i2, int i3) {
        N();
        this.u.e(i2, i3);
    }

    public final void o(Drawable drawable) {
        if (drawable != null) {
            O();
            if (!R(this.f979i)) {
                M(this.f979i, true);
            }
        } else {
            ImageView imageView = this.f979i;
            if (imageView != null && R(imageView)) {
                removeView(this.f979i);
                this.F.remove(this.f979i);
            }
        }
        ImageView imageView2 = this.f979i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lc
            r5.D = r1
            r0 = r2
        Lc:
            boolean r3 = r5.D
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.D = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.D = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b2 A[LOOP:0: B:118:0x02b0->B:119:0x02b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca A[LOOP:1: B:121:0x02c8->B:122:0x02ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02eb A[LOOP:2: B:124:0x02e9->B:125:0x02eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0339 A[LOOP:3: B:133:0x0337->B:134:0x0339, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int i4;
        int iCombineMeasuredStates2;
        int measuredHeight;
        boolean zC = android.support.v4.app.dc.c(this);
        int i5 = !zC ? 1 : 0;
        int iMax2 = 0;
        if (S(this.f978h)) {
            V(this.f978h, i2, 0, i3, this.p);
            measuredWidth = this.f978h.getMeasuredWidth() + T(this.f978h);
            iMax = Math.max(0, this.f978h.getMeasuredHeight() + U(this.f978h));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f978h.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (S(this.f972b)) {
            V(this.f972b, i2, 0, i3, this.p);
            measuredWidth = this.f972b.getMeasuredWidth() + T(this.f972b);
            iMax = Math.max(iMax, this.f972b.getMeasuredHeight() + U(this.f972b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f972b.getMeasuredState());
        }
        int[] iArr = this.G;
        int iD = d();
        int iMax3 = Math.max(iD, measuredWidth);
        iArr[zC ? 1 : 0] = Math.max(0, iD - measuredWidth);
        if (S(this.f971a)) {
            V(this.f971a, i2, iMax3, i3, this.p);
            measuredWidth2 = this.f971a.getMeasuredWidth() + T(this.f971a);
            iMax = Math.max(iMax, this.f971a.getMeasuredHeight() + U(this.f971a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f971a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + Math.max(iC, measuredWidth2);
        iArr[i5] = Math.max(0, iC - measuredWidth2);
        if (S(this.f973c)) {
            iMax4 += I(this.f973c, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f973c.getMeasuredHeight() + U(this.f973c));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f973c.getMeasuredState());
        }
        if (S(this.f979i)) {
            iMax4 += I(this.f979i, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f979i.getMeasuredHeight() + U(this.f979i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f979i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((gh) childAt.getLayoutParams()).f1555b == 0 && S(childAt)) {
                iMax4 += I(childAt, i2, iMax4, i3, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + U(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i7 = iMax4;
        int i8 = this.s + this.t;
        int i9 = this.q + this.r;
        if (S(this.f976f)) {
            I(this.f976f, i2, i7 + i9, i3, i8, iArr);
            i4 = i8;
            iMax2 = this.f976f.getMeasuredWidth() + T(this.f976f);
            int measuredHeight2 = this.f976f.getMeasuredHeight() + U(this.f976f);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f976f.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            i4 = i8;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (S(this.f977g)) {
            iMax2 = Math.max(iMax2, I(this.f977g, i2, i7 + i9, i3, measuredHeight + i4, iArr));
            measuredHeight += this.f977g.getMeasuredHeight() + U(this.f977g);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f977g.getMeasuredState());
        }
        if (S(this.f976f) || S(this.f977g)) {
            measuredHeight += i4;
        }
        int iMax6 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof gj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gj gjVar = (gj) parcelable;
        super.onRestoreInstanceState(gjVar.getSuperState());
        ActionMenuView actionMenuView = this.f971a;
        android.support.v7.view.menu.q qVarC = actionMenuView != null ? actionMenuView.c() : null;
        int i2 = gjVar.f1557a;
        if (i2 != 0 && this.L != null && qVarC != null && (menuItemFindItem = qVarC.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gjVar.f1558b) {
            Runnable runnable = this.M;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        N();
        this.u.d(i2 == 1);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        android.support.v7.view.menu.t tVar;
        gj gjVar = new gj(super.onSaveInstanceState());
        gg ggVar = this.L;
        if (ggVar != null && (tVar = ggVar.f1553b) != null) {
            gjVar.f1557a = tVar.getItemId();
        }
        gjVar.f1558b = A();
        return gjVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
            actionMasked = 0;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.C = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final void p(android.support.v7.view.menu.q qVar, p pVar) {
        if (qVar == null && this.f971a == null) {
            return;
        }
        P();
        android.support.v7.view.menu.q qVarC = this.f971a.c();
        if (qVarC != qVar) {
            if (qVarC != null) {
                qVarC.q(this.K);
                qVarC.q(this.L);
            }
            if (this.L == null) {
                this.L = new gg(this);
            }
            pVar.y();
            Context context = this.f982l;
            if (qVar != null) {
                qVar.k(pVar, context);
                qVar.k(this.L, this.f982l);
            } else {
                pVar.c(context, null);
                this.L.c(this.f982l, null);
                pVar.j();
                this.L.j();
            }
            this.f971a.k(this.m);
            this.f971a.l(pVar);
            this.K = pVar;
            y();
        }
    }

    public final void q(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            Q();
        }
        ImageButton imageButton = this.f978h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.f978h.setTooltipText(charSequence);
        }
    }

    public final void r(Drawable drawable) {
        if (drawable != null) {
            Q();
            if (!R(this.f978h)) {
                M(this.f978h, true);
            }
        } else {
            ImageButton imageButton = this.f978h;
            if (imageButton != null && R(imageButton)) {
                removeView(this.f978h);
                this.F.remove(this.f978h);
            }
        }
        ImageButton imageButton2 = this.f978h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    @Override // androidx.core.view.MenuHost
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.f975e.removeMenuProvider(menuProvider);
    }

    public final void s(View.OnClickListener onClickListener) {
        Q();
        this.f978h.setOnClickListener(onClickListener);
    }

    public final void t(int i2) {
        if (this.m != i2) {
            this.m = i2;
            if (i2 == 0) {
                this.f982l = getContext();
            } else {
                this.f982l = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public final void u(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f977g;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                bn bnVar = new bn(context);
                this.f977g = bnVar;
                bnVar.setSingleLine();
                this.f977g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.o;
                if (i2 != 0) {
                    this.f977g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f977g.setTextColor(colorStateList);
                }
            }
            if (!R(this.f977g)) {
                M(this.f977g, true);
            }
        } else if (textView != null && R(textView)) {
            removeView(this.f977g);
            this.F.remove(this.f977g);
        }
        TextView textView2 = this.f977g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public final void v(Context context, int i2) {
        this.o = i2;
        TextView textView = this.f977g;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final void w(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f976f;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                bn bnVar = new bn(context);
                this.f976f = bnVar;
                bnVar.setSingleLine();
                this.f976f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.f976f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f976f.setTextColor(colorStateList);
                }
            }
            if (!R(this.f976f)) {
                M(this.f976f, true);
            }
        } else if (textView != null && R(textView)) {
            removeView(this.f976f);
            this.F.remove(this.f976f);
        }
        TextView textView2 = this.f976f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public final void x(Context context, int i2) {
        this.n = i2;
        TextView textView = this.f976f;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    final void y() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (!z() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            isAttachedToWindow();
        }
    }

    public final boolean z() {
        gg ggVar = this.L;
        return (ggVar == null || ggVar.f1553b == null) ? false : true;
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.f975e.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        this.f975e.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return D(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
