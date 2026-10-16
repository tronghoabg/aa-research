package androidx.autofill.inline.v1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.affa;
import defpackage.afft;
import defpackage.mt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \"2\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006#"}, d2 = {"Landroidx/autofill/inline/v1/BalancingTitleSubtitleLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startIcon", "Landroid/view/View;", "titleView", "Landroid/widget/TextView;", "subtitleView", "endIcon", "onFinishInflate", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "generateDefaultLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "generateLayoutParams", "checkLayoutParams", "p", "Landroid/view/ViewGroup$LayoutParams;", "Companion", "autofill"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BalancingTitleSubtitleLayout extends ViewGroup {
    public static final mt a = new mt();
    private View b;
    private TextView c;
    private TextView d;
    private View e;

    public /* synthetic */ BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static final void a(View view, int i, int i2, afft afftVar, boolean z, int i3) {
        if (view.getVisibility() == 8) {
            return;
        }
        int measuredHeight = i + ((i2 - view.getMeasuredHeight()) / 2);
        int iC = afftVar.a + mt.c(view);
        afftVar.a = iC;
        if (!z) {
            iC = (i3 - iC) - view.getMeasuredWidth();
        }
        view.layout(iC, measuredHeight, view.getMeasuredWidth() + iC, view.getMeasuredHeight() + measuredHeight);
        afftVar.a += view.getMeasuredWidth() + mt.b(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 4) {
            throw new IllegalStateException("TitleSubtitleLayout can host up to 4 children.");
        }
        View viewFindViewById = findViewById(R.id.autofill_inline_suggestion_start_icon);
        viewFindViewById.getClass();
        this.b = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.autofill_inline_suggestion_title);
        viewFindViewById2.getClass();
        this.c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.autofill_inline_suggestion_subtitle);
        viewFindViewById3.getClass();
        this.d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.autofill_inline_suggestion_end_icon);
        viewFindViewById4.getClass();
        this.e = viewFindViewById4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        TextView textView;
        TextView textView2;
        View view2;
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int paddingTop2 = getPaddingTop();
        int layoutDirection = getLayoutDirection();
        afft afftVar = new afft();
        afftVar.a = getPaddingStart();
        View view3 = this.b;
        if (view3 == null) {
            affa.d("startIcon");
            view = null;
        } else {
            view = view3;
        }
        boolean z2 = layoutDirection == 0;
        int i5 = i3 - i;
        a(view, paddingTop2, paddingTop, afftVar, z2, i5);
        TextView textView3 = this.c;
        if (textView3 == null) {
            affa.d("titleView");
            textView = null;
        } else {
            textView = textView3;
        }
        a(textView, paddingTop2, paddingTop, afftVar, z2, i5);
        TextView textView4 = this.d;
        if (textView4 == null) {
            affa.d("subtitleView");
            textView2 = null;
        } else {
            textView2 = textView4;
        }
        a(textView2, paddingTop2, paddingTop, afftVar, z2, i5);
        View view4 = this.e;
        if (view4 == null) {
            affa.d("endIcon");
            view2 = null;
        } else {
            view2 = view4;
        }
        a(view2, paddingTop2, paddingTop, afftVar, z2, i5);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        View view = this.b;
        TextView textView = null;
        if (view == null) {
            affa.d("startIcon");
            view = null;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        View view2 = this.b;
        if (view2 == null) {
            affa.d("startIcon");
            view2 = null;
        }
        int iF = mt.f(view2);
        View view3 = this.b;
        if (view3 == null) {
            affa.d("startIcon");
            view3 = null;
        }
        int iMax = Math.max(0, mt.d(view3));
        View view4 = this.e;
        if (view4 == null) {
            affa.d("endIcon");
            view4 = null;
        }
        measureChildWithMargins(view4, i, 0, i2, 0);
        View view5 = this.e;
        if (view5 == null) {
            affa.d("endIcon");
            view5 = null;
        }
        int iF2 = iF + mt.f(view5);
        View view6 = this.e;
        if (view6 == null) {
            affa.d("endIcon");
            view6 = null;
        }
        int iMax2 = Math.max(iMax, mt.d(view6));
        TextView textView2 = this.c;
        if (textView2 == null) {
            affa.d("titleView");
            textView2 = null;
        }
        measureChildWithMargins(textView2, i, 0, i2, 0);
        TextView textView3 = this.d;
        if (textView3 == null) {
            affa.d("subtitleView");
            textView3 = null;
        }
        measureChildWithMargins(textView3, i, 0, i2, 0);
        TextView textView4 = this.c;
        if (textView4 == null) {
            affa.d("titleView");
            textView4 = null;
        }
        int iF3 = mt.f(textView4);
        TextView textView5 = this.d;
        if (textView5 == null) {
            affa.d("subtitleView");
            textView5 = null;
        }
        int i3 = paddingStart - iF2;
        float f = size;
        int iF4 = mt.f(textView5);
        if (iF3 + iF4 > i3) {
            int i4 = i3 - iF3;
            int i5 = (int) (f * 0.37f);
            if (i4 >= i5) {
                iF4 = i4;
            } else if (iF4 <= i5) {
                iF3 = i3 - iF4;
            } else {
                iF3 = i3 - i5;
                iF4 = i5;
            }
        }
        TextView textView6 = this.c;
        if (textView6 == null) {
            affa.d("titleView");
            textView6 = null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iF3 - mt.e(textView6), 1073741824);
        TextView textView7 = this.d;
        if (textView7 == null) {
            affa.d("subtitleView");
            textView7 = null;
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iF4 - mt.e(textView7), 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView8 = this.c;
        if (textView8 == null) {
            affa.d("titleView");
            textView8 = null;
        }
        textView8.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
        TextView textView9 = this.d;
        if (textView9 == null) {
            affa.d("subtitleView");
            textView9 = null;
        }
        textView9.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        TextView textView10 = this.c;
        if (textView10 == null) {
            affa.d("titleView");
            textView10 = null;
        }
        int iF5 = iF2 + mt.f(textView10);
        TextView textView11 = this.d;
        if (textView11 == null) {
            affa.d("subtitleView");
            textView11 = null;
        }
        int iF6 = iF5 + mt.f(textView11);
        TextView textView12 = this.c;
        if (textView12 == null) {
            affa.d("titleView");
            textView12 = null;
        }
        int iMax3 = Math.max(iMax2, mt.d(textView12));
        TextView textView13 = this.d;
        if (textView13 == null) {
            affa.d("subtitleView");
        } else {
            textView = textView13;
        }
        setMeasuredDimension(ViewGroup.resolveSize(iF6 + getPaddingStart() + getPaddingEnd(), i), ViewGroup.resolveSize(Math.max(iMax3, mt.d(textView)) + getPaddingTop() + getPaddingBottom(), i2));
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
