package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ActionMenuView extends db implements android.support.v7.view.menu.p, android.support.v7.view.menu.af {

    /* renamed from: a, reason: collision with root package name */
    android.support.v7.view.menu.o f891a;

    /* renamed from: b, reason: collision with root package name */
    t f892b;

    /* renamed from: c, reason: collision with root package name */
    private android.support.v7.view.menu.q f893c;

    /* renamed from: d, reason: collision with root package name */
    private Context f894d;

    /* renamed from: e, reason: collision with root package name */
    private int f895e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f896f;

    /* renamed from: g, reason: collision with root package name */
    private p f897g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f898h;

    /* renamed from: i, reason: collision with root package name */
    private int f899i;

    /* renamed from: j, reason: collision with root package name */
    private int f900j;

    /* renamed from: k, reason: collision with root package name */
    private int f901k;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f900j = (int) (56.0f * f2);
        this.f901k = (int) (f2 * 4.0f);
        this.f894d = context;
        this.f895e = 0;
    }

    protected static final s s() {
        s sVar = new s();
        sVar.gravity = 16;
        return sVar;
    }

    protected static final s u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return s();
        }
        s sVar = layoutParams instanceof s ? new s((s) layoutParams) : new s(layoutParams);
        if (sVar.gravity <= 0) {
            sVar.gravity = 16;
        }
        return sVar;
    }

    @Override // android.support.v7.view.menu.af
    public final void a(android.support.v7.view.menu.q qVar) {
        this.f893c = qVar;
    }

    @Override // android.support.v7.view.menu.p
    public final boolean b(android.support.v7.view.menu.t tVar) {
        return this.f893c.F(tVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.db
    /* renamed from: bn */
    public final /* bridge */ /* synthetic */ da generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return u(layoutParams);
    }

    public final android.support.v7.view.menu.q c() {
        return this.f893c;
    }

    @Override // android.support.v7.widget.db, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof s;
    }

    @Override // android.support.v7.widget.db, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final s generateLayoutParams(AttributeSet attributeSet) {
        return new s(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.db
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ da generateDefaultLayoutParams() {
        return s();
    }

    @Override // android.support.v7.widget.db, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return s();
    }

    public final Menu h() {
        if (this.f893c == null) {
            Context context = getContext();
            android.support.v7.view.menu.q qVar = new android.support.v7.view.menu.q(context);
            this.f893c = qVar;
            qVar.t(new ge(this, 1));
            p pVar = new p(context);
            this.f897g = pVar;
            pVar.z();
            this.f897g.e(new r());
            this.f893c.k(this.f897g, this.f894d);
            this.f897g.s(this);
        }
        return this.f893c;
    }

    public final void i() {
        p pVar = this.f897g;
        if (pVar != null) {
            pVar.w();
        }
    }

    public final void j(boolean z) {
        this.f896f = z;
    }

    public final void k(int i2) {
        if (this.f895e != i2) {
            this.f895e = i2;
            if (i2 == 0) {
                this.f894d = getContext();
            } else {
                this.f894d = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public final void l(p pVar) {
        this.f897g = pVar;
        pVar.s(this);
    }

    protected final boolean m(int i2) {
        boolean zE = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof q)) {
            zE = ((q) childAt).e();
        }
        return (i2 <= 0 || !(childAt2 instanceof q)) ? zE : ((q) childAt2).f() | zE;
    }

    public final boolean n() {
        p pVar = this.f897g;
        return pVar != null && pVar.t();
    }

    public final boolean o() {
        p pVar = this.f897g;
        if (pVar != null) {
            return pVar.f1606i != null || pVar.u();
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p pVar = this.f897g;
        if (pVar != null) {
            pVar.j();
            if (this.f897g.u()) {
                this.f897g.t();
                this.f897g.v();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.support.v7.widget.db, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int paddingLeft;
        if (!this.f898h) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = i5 - i3;
        int iV = v();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zC = android.support.v4.app.dc.c(this);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = i7 / 2;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                s sVar = (s) childAt.getLayoutParams();
                if (sVar.f1610a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i9)) {
                        measuredWidth += iV;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zC) {
                        paddingLeft = getPaddingLeft() + sVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - sVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + sVar.leftMargin) + sVar.rightMargin;
                    m(i9);
                    i11++;
                }
            }
            i9++;
        }
        if (childCount == 1) {
            if (i10 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = i6 - (measuredHeight2 / 2);
                int i14 = (i8 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i14, i13, measuredWidth2 + i14, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i15 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zC) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                s sVar2 = (s) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !sVar2.f1610a) {
                    int i17 = width2 - sVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + sVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            s sVar3 = (s) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !sVar3.f1610a) {
                int i20 = paddingLeft2 + sVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + sVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // android.support.v7.widget.db, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public final boolean p() {
        p pVar = this.f897g;
        return pVar != null && pVar.u();
    }

    public final boolean q() {
        return this.f896f;
    }

    public final boolean r() {
        p pVar = this.f897g;
        return pVar != null && pVar.v();
    }

    public final void t() {
        this.f897g.y();
    }

    @Override // android.support.v7.widget.db, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return u(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
