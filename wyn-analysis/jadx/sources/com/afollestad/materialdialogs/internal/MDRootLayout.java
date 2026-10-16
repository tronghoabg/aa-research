package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import l4.AbstractC3392h;
import l4.EnumC3388d;
import l4.EnumC3393i;
import m4.a;
import m4.b;
import m4.c;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f19950t = 0;

    /* renamed from: a, reason: collision with root package name */
    public final MDButton[] f19951a;

    /* renamed from: b, reason: collision with root package name */
    public int f19952b;

    /* renamed from: c, reason: collision with root package name */
    public View f19953c;

    /* renamed from: d, reason: collision with root package name */
    public View f19954d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19955e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19956f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC3393i f19957g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19958h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19959i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19960j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19961l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19962m;

    /* renamed from: n, reason: collision with root package name */
    public final int f19963n;

    /* renamed from: o, reason: collision with root package name */
    public EnumC3388d f19964o;

    /* renamed from: p, reason: collision with root package name */
    public final int f19965p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f19966q;

    /* renamed from: r, reason: collision with root package name */
    public c f19967r;

    /* renamed from: s, reason: collision with root package name */
    public final int f19968s;

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19951a = new MDButton[3];
        this.f19955e = false;
        this.f19956f = false;
        this.f19957g = EnumC3393i.f40003b;
        this.f19958h = false;
        this.f19959i = true;
        this.f19964o = EnumC3388d.f39952a;
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3392h.f40001a, 0, 0);
        this.f19960j = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f19961l = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.f19962m = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.f19965p = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.f19963n = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.f19966q = new Paint();
        this.f19968s = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.f19966q.setColor(AbstractC4345a.D(context, R.attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.afollestad.materialdialogs.internal.MDRootLayout r3, android.view.ViewGroup r4, boolean r5, boolean r6) {
        /*
            r3.getClass()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L31
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L31
            android.view.View r5 = r3.f19953c
            if (r5 == 0) goto L2e
            int r5 = r5.getVisibility()
            r2 = 8
            if (r5 == r2) goto L2e
            int r5 = r4.getScrollY()
            int r2 = r4.getPaddingTop()
            int r2 = r2 + r5
            android.view.View r5 = r4.getChildAt(r1)
            int r5 = r5.getTop()
            if (r2 <= r5) goto L2e
            r5 = r0
            goto L2f
        L2e:
            r5 = r1
        L2f:
            r3.f19955e = r5
        L31:
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L5a
            if (r6 == 0) goto L57
            int r5 = r4.getScrollY()
            int r6 = r4.getHeight()
            int r6 = r6 + r5
            int r5 = r4.getPaddingBottom()
            int r6 = r6 - r5
            int r5 = r4.getChildCount()
            int r5 = r5 - r0
            android.view.View r4 = r4.getChildAt(r5)
            int r4 = r4.getBottom()
            if (r6 >= r4) goto L57
            goto L58
        L57:
            r0 = r1
        L58:
            r3.f19956f = r0
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.a(com.afollestad.materialdialogs.internal.MDRootLayout, android.view.ViewGroup, boolean, boolean):void");
    }

    public static boolean c(View view) {
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        return (z2 && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z2;
    }

    public final void b(ViewGroup viewGroup, boolean z2) {
        if (this.f19967r == null) {
            if (viewGroup instanceof RecyclerView) {
                b bVar = new b(this, viewGroup, z2);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.addOnScrollListener(bVar);
                bVar.onScrolled(recyclerView, 0, 0);
                return;
            }
            c cVar = new c(this, viewGroup, z2);
            this.f19967r = cVar;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f19967r);
            cVar.onScrollChanged();
        }
    }

    public final void d(View view, boolean z2) {
        View childAt;
        if (view == null) {
            return;
        }
        boolean z10 = false;
        if (view instanceof ScrollView) {
            ViewGroup viewGroup = (ScrollView) view;
            if (viewGroup.getChildCount() != 0) {
                if ((viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(0).getMeasuredHeight()) {
                    b(viewGroup, z2);
                    return;
                }
            }
            if (z2) {
                this.f19955e = false;
            }
            this.f19956f = false;
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (adapterView.getLastVisiblePosition() != -1) {
                boolean z11 = adapterView.getFirstVisiblePosition() == 0;
                boolean z12 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
                if (!z11 || !z12 || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom()) {
                    b(adapterView, z2);
                    return;
                }
            }
            if (z2) {
                this.f19955e = false;
            }
            this.f19956f = false;
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new a(this, view, z2));
            return;
        }
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null && recyclerView.getLayoutManager().canScrollVertically()) {
                z10 = true;
            }
            if (z2) {
                this.f19955e = z10;
            }
            this.f19956f = z10;
            if (z10) {
                b((ViewGroup) view, z2);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            View view2 = null;
            if (viewGroup2.getChildCount() == 0) {
                childAt = null;
            } else {
                for (int childCount = viewGroup2.getChildCount() - 1; childCount >= 0; childCount--) {
                    childAt = viewGroup2.getChildAt(childCount);
                    if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                        break;
                    }
                }
                childAt = null;
            }
            d(childAt, z2);
            if (viewGroup2.getChildCount() != 0) {
                int childCount2 = viewGroup2.getChildCount() - 1;
                while (true) {
                    if (childCount2 < 0) {
                        break;
                    }
                    View childAt2 = viewGroup2.getChildAt(childCount2);
                    if (childAt2.getVisibility() == 0 && childAt2.getBottom() == viewGroup2.getMeasuredHeight()) {
                        view2 = childAt2;
                        break;
                    }
                    childCount2--;
                }
            }
            if (view2 != childAt) {
                d(view2, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        View view = this.f19954d;
        if (view != null) {
            if (this.f19955e) {
                canvas2 = canvas;
                canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r0 - this.f19968s, getMeasuredWidth(), view.getTop(), this.f19966q);
            } else {
                canvas2 = canvas;
            }
            if (this.f19956f) {
                canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f19954d.getBottom(), getMeasuredWidth(), r15 + this.f19968s, this.f19966q);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() == R.id.md_titleFrame) {
                this.f19953c = childAt;
            } else {
                int id2 = childAt.getId();
                MDButton[] mDButtonArr = this.f19951a;
                if (id2 == R.id.md_buttonDefaultNeutral) {
                    mDButtonArr[0] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultNegative) {
                    mDButtonArr[1] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultPositive) {
                    mDButtonArr[2] = (MDButton) childAt;
                } else {
                    this.f19954d = childAt;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int i13;
        char c10;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        int i14 = i10;
        if (c(this.f19953c)) {
            int measuredHeight = this.f19953c.getMeasuredHeight() + i14;
            this.f19953c.layout(i5, i14, i11, measuredHeight);
            i14 = measuredHeight;
        } else if (!this.k && this.f19959i) {
            i14 += this.f19961l;
        }
        if (c(this.f19954d)) {
            View view = this.f19954d;
            view.layout(i5, i14, i11, view.getMeasuredHeight() + i14);
        }
        boolean z10 = this.f19958h;
        MDButton[] mDButtonArr = this.f19951a;
        if (z10) {
            int measuredHeight2 = i12 - this.f19962m;
            for (MDButton mDButton : mDButtonArr) {
                if (c(mDButton)) {
                    mDButton.layout(i5, measuredHeight2 - mDButton.getMeasuredHeight(), i11, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            int i15 = this.f19959i ? i12 - this.f19962m : i12;
            int i16 = i15 - this.f19963n;
            int measuredWidth9 = this.f19965p;
            boolean zC = c(mDButtonArr[2]);
            EnumC3388d enumC3388d = EnumC3388d.f39954c;
            if (zC) {
                if (this.f19964o == enumC3388d) {
                    measuredWidth7 = i5 + measuredWidth9;
                    measuredWidth8 = mDButtonArr[2].getMeasuredWidth() + measuredWidth7;
                    i13 = -1;
                } else {
                    int i17 = i11 - measuredWidth9;
                    measuredWidth7 = i17 - mDButtonArr[2].getMeasuredWidth();
                    measuredWidth8 = i17;
                    i13 = measuredWidth7;
                }
                mDButtonArr[2].layout(measuredWidth7, i16, measuredWidth8, i15);
                measuredWidth9 += mDButtonArr[2].getMeasuredWidth();
            } else {
                i13 = -1;
            }
            boolean zC2 = c(mDButtonArr[1]);
            EnumC3388d enumC3388d2 = EnumC3388d.f39952a;
            if (zC2) {
                EnumC3388d enumC3388d3 = this.f19964o;
                if (enumC3388d3 == enumC3388d) {
                    measuredWidth5 = measuredWidth9 + i5;
                    measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                } else if (enumC3388d3 == enumC3388d2) {
                    measuredWidth6 = i11 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - mDButtonArr[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f19965p + i5;
                    measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    c10 = 0;
                    mDButtonArr[1].layout(measuredWidth5, i16, measuredWidth6, i15);
                }
                measuredWidth = -1;
                c10 = 0;
                mDButtonArr[1].layout(measuredWidth5, i16, measuredWidth6, i15);
            } else {
                c10 = 0;
                measuredWidth = -1;
            }
            if (c(mDButtonArr[c10])) {
                EnumC3388d enumC3388d4 = this.f19964o;
                if (enumC3388d4 == enumC3388d) {
                    measuredWidth3 = i11 - this.f19965p;
                    measuredWidth4 = measuredWidth3 - mDButtonArr[c10].getMeasuredWidth();
                } else if (enumC3388d4 == enumC3388d2) {
                    measuredWidth4 = this.f19965p + i5;
                    measuredWidth3 = mDButtonArr[c10].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i13 == -1) {
                        if (i13 == -1 && measuredWidth != -1) {
                            measuredWidth2 = mDButtonArr[c10].getMeasuredWidth();
                        } else if (i13 == -1) {
                            measuredWidth = ((i11 - i5) / 2) - (mDButtonArr[c10].getMeasuredWidth() / 2);
                            measuredWidth2 = mDButtonArr[c10].getMeasuredWidth();
                        }
                        i13 = measuredWidth2 + measuredWidth;
                    } else {
                        measuredWidth = i13 - mDButtonArr[c10].getMeasuredWidth();
                    }
                    measuredWidth3 = i13;
                    measuredWidth4 = measuredWidth;
                }
                mDButtonArr[c10].layout(measuredWidth4, i16, measuredWidth3, i15);
            }
        }
        d(this.f19954d, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(EnumC3388d enumC3388d) {
        this.f19964o = enumC3388d;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int iOrdinal = this.f19964o.ordinal();
            if (iOrdinal == 0) {
                this.f19964o = EnumC3388d.f39954c;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                this.f19964o = EnumC3388d.f39952a;
            }
        }
    }

    public void setButtonStackedGravity(EnumC3388d enumC3388d) {
        for (MDButton mDButton : this.f19951a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(enumC3388d);
            }
        }
    }

    public void setDividerColor(int i5) {
        this.f19966q.setColor(i5);
        invalidate();
    }

    public void setMaxHeight(int i5) {
        this.f19952b = i5;
    }

    public void setStackingBehavior(EnumC3393i enumC3393i) {
        this.f19957g = enumC3393i;
        invalidate();
    }
}
