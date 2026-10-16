package androidx.autofill.inline.v1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.waze.R;
import h.g.b.ao;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BalancingTitleSubtitleLayout extends ViewGroup {
    public static final Companion Companion = new Companion(null);
    private static final float SUBTITLE_MAX_WIDTH_PERCENTAGE = 0.37f;
    private View endIcon;
    private View startIcon;
    private TextView subtitleView;
    private TextView titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    private static final void onLayout$layout(View view, int i2, int i3, ao aoVar, boolean z, int i4) {
        if (view.getVisibility() == 8) {
            return;
        }
        int measuredHeight = i2 + ((i3 - view.getMeasuredHeight()) / 2);
        int i5 = aoVar.f48103a;
        Companion companion = Companion;
        int marginStart = i5 + companion.getMarginStart(view);
        aoVar.f48103a = marginStart;
        if (!z) {
            marginStart = (i4 - marginStart) - view.getMeasuredWidth();
        }
        view.layout(marginStart, measuredHeight, view.getMeasuredWidth() + marginStart, view.getMeasuredHeight() + measuredHeight);
        aoVar.f48103a += view.getMeasuredWidth() + companion.getMarginEnd(view);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.MarginLayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 4) {
            throw new IllegalStateException("TitleSubtitleLayout can host up to 4 children.");
        }
        View viewFindViewById = findViewById(R.id.autofill_inline_suggestion_start_icon);
        x.e(viewFindViewById, "findViewById(...)");
        this.startIcon = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.autofill_inline_suggestion_title);
        x.e(viewFindViewById2, "findViewById(...)");
        this.titleView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.autofill_inline_suggestion_subtitle);
        x.e(viewFindViewById3, "findViewById(...)");
        this.subtitleView = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.autofill_inline_suggestion_end_icon);
        x.e(viewFindViewById4, "findViewById(...)");
        this.endIcon = viewFindViewById4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        View view2;
        int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        int paddingTop2 = getPaddingTop();
        int layoutDirection = getLayoutDirection();
        ao aoVar = new ao();
        aoVar.f48103a = getPaddingStart();
        View view3 = this.startIcon;
        if (view3 == null) {
            x.j("startIcon");
            view = null;
        } else {
            view = view3;
        }
        boolean z2 = layoutDirection == 0;
        int i6 = i4 - i2;
        onLayout$layout(view, paddingTop2, paddingTop, aoVar, z2, i6);
        TextView textView = this.titleView;
        if (textView == null) {
            x.j("titleView");
            textView = null;
        }
        onLayout$layout(textView, paddingTop2, paddingTop, aoVar, z2, i6);
        TextView textView2 = this.subtitleView;
        if (textView2 == null) {
            x.j("subtitleView");
            textView2 = null;
        }
        onLayout$layout(textView2, paddingTop2, paddingTop, aoVar, z2, i6);
        View view4 = this.endIcon;
        if (view4 == null) {
            x.j("endIcon");
            view2 = null;
        } else {
            view2 = view4;
        }
        onLayout$layout(view2, paddingTop2, paddingTop, aoVar, z2, i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        View view = this.startIcon;
        TextView textView = null;
        if (view == null) {
            x.j("startIcon");
            view = null;
        }
        measureChildWithMargins(view, i2, 0, i3, 0);
        Companion companion = Companion;
        View view2 = this.startIcon;
        if (view2 == null) {
            x.j("startIcon");
            view2 = null;
        }
        int totalWidth = companion.getTotalWidth(view2);
        View view3 = this.startIcon;
        if (view3 == null) {
            x.j("startIcon");
            view3 = null;
        }
        int iMax = Math.max(0, companion.getTotalHeight(view3));
        View view4 = this.endIcon;
        if (view4 == null) {
            x.j("endIcon");
            view4 = null;
        }
        measureChildWithMargins(view4, i2, 0, i3, 0);
        View view5 = this.endIcon;
        if (view5 == null) {
            x.j("endIcon");
            view5 = null;
        }
        int totalWidth2 = totalWidth + companion.getTotalWidth(view5);
        View view6 = this.endIcon;
        if (view6 == null) {
            x.j("endIcon");
            view6 = null;
        }
        int iMax2 = Math.max(iMax, companion.getTotalHeight(view6));
        TextView textView2 = this.titleView;
        if (textView2 == null) {
            x.j("titleView");
            textView2 = null;
        }
        measureChildWithMargins(textView2, i2, 0, i3, 0);
        TextView textView3 = this.subtitleView;
        if (textView3 == null) {
            x.j("subtitleView");
            textView3 = null;
        }
        measureChildWithMargins(textView3, i2, 0, i3, 0);
        TextView textView4 = this.titleView;
        if (textView4 == null) {
            x.j("titleView");
            textView4 = null;
        }
        int totalWidth3 = companion.getTotalWidth(textView4);
        TextView textView5 = this.subtitleView;
        if (textView5 == null) {
            x.j("subtitleView");
            textView5 = null;
        }
        int totalWidth4 = companion.getTotalWidth(textView5);
        int i4 = paddingStart - totalWidth2;
        float f2 = size;
        if (totalWidth3 + totalWidth4 > i4) {
            int i5 = i4 - totalWidth3;
            int i6 = (int) (f2 * SUBTITLE_MAX_WIDTH_PERCENTAGE);
            if (i5 >= i6) {
                totalWidth4 = i5;
            } else if (totalWidth4 <= i6) {
                totalWidth3 = i4 - totalWidth4;
            } else {
                totalWidth3 = i4 - i6;
                totalWidth4 = i6;
            }
        }
        TextView textView6 = this.titleView;
        if (textView6 == null) {
            x.j("titleView");
            textView6 = null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(totalWidth3 - companion.getMarginHorizontal(textView6), 1073741824);
        TextView textView7 = this.subtitleView;
        if (textView7 == null) {
            x.j("subtitleView");
            textView7 = null;
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(totalWidth4 - companion.getMarginHorizontal(textView7), 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView8 = this.titleView;
        if (textView8 == null) {
            x.j("titleView");
            textView8 = null;
        }
        textView8.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
        TextView textView9 = this.subtitleView;
        if (textView9 == null) {
            x.j("subtitleView");
            textView9 = null;
        }
        textView9.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        TextView textView10 = this.titleView;
        if (textView10 == null) {
            x.j("titleView");
            textView10 = null;
        }
        int totalWidth5 = totalWidth2 + companion.getTotalWidth(textView10);
        TextView textView11 = this.subtitleView;
        if (textView11 == null) {
            x.j("subtitleView");
            textView11 = null;
        }
        int totalWidth6 = totalWidth5 + companion.getTotalWidth(textView11);
        TextView textView12 = this.titleView;
        if (textView12 == null) {
            x.j("titleView");
            textView12 = null;
        }
        int iMax3 = Math.max(iMax2, companion.getTotalHeight(textView12));
        TextView textView13 = this.subtitleView;
        if (textView13 == null) {
            x.j("subtitleView");
        } else {
            textView = textView13;
        }
        setMeasuredDimension(ViewGroup.resolveSize(totalWidth6 + getPaddingStart() + getPaddingEnd(), i2), ViewGroup.resolveSize(Math.max(iMax3, companion.getTotalHeight(textView)) + getPaddingTop() + getPaddingBottom(), i3));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final int getMarginBottom(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                return marginLayoutParams.bottomMargin;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getMarginEnd(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                return marginLayoutParams.getMarginEnd();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getMarginHorizontal(View view) {
            return getMarginStart(view) + getMarginEnd(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getMarginStart(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                return marginLayoutParams.getMarginStart();
            }
            return 0;
        }

        private final int getMarginTop(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                return marginLayoutParams.topMargin;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getTotalHeight(View view) {
            return view.getMeasuredHeight() + getMarginTop(view) + getMarginBottom(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getTotalWidth(View view) {
            return view.getMeasuredWidth() + getMarginHorizontal(view);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.MarginLayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.MarginLayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        x.f(context, "context");
    }

    public /* synthetic */ BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
