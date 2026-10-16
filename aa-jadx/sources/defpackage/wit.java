package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wit {
    public static final /* synthetic */ int a = 0;
    private static final android.graphics.Rect b = new android.graphics.Rect();

    public static int a(android.content.Context context) {
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        if (configuration.smallestScreenWidthDp >= 411) {
            return f(context, com.google.android.projection.gearhead.R.dimen.survey_prompt_max_width_sw_411);
        }
        if (configuration.smallestScreenWidthDp >= 380) {
            return f(context, com.google.android.projection.gearhead.R.dimen.survey_prompt_max_width_sw_380);
        }
        if (configuration.smallestScreenWidthDp >= 320) {
            return f(context, com.google.android.projection.gearhead.R.dimen.survey_prompt_max_width_sw_320);
        }
        return configuration.smallestScreenWidthDp >= 240 ? f(context, com.google.android.projection.gearhead.R.dimen.survey_prompt_max_width_sw_240) : f(context, com.google.android.projection.gearhead.R.dimen.survey_prompt_max_width);
    }

    public static int b(android.view.ViewGroup viewGroup, android.view.View view, int i, int i2, android.view.View view2, android.view.View view3, boolean z) {
        if (viewGroup == view) {
            throw new java.lang.IllegalStateException("contentView should be the single child of containerViewGroup");
        }
        if (viewGroup.getChildCount() == 0) {
            return i2;
        }
        int measuredHeight = 0;
        view.measure(i, 0);
        int measuredHeight2 = view.getMeasuredHeight();
        if (z) {
            return android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
        }
        android.content.res.Resources resources = view.getContext().getResources();
        android.graphics.Rect rect = b;
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.survey_answer_min_height_for_scrolling);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.survey_card_vertical_margin);
        if (view3 != null) {
            defpackage.wpu wpuVar = defpackage.wiz.c;
            android.content.Context context = defpackage.wiz.b;
            measuredHeight = defpackage.wiz.b(true) ? view3.getMeasuredHeight() : view3.getHeight();
        }
        int height = iHeight - view2.getHeight();
        int i3 = dimensionPixelSize2 + dimensionPixelSize2 + measuredHeight;
        if (measuredHeight2 + i3 > iHeight && height - i3 > dimensionPixelSize) {
            measuredHeight2 = iHeight - i3;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
    }

    public static void c(android.widget.ImageView imageView, java.lang.Integer num) {
        if (num == null || num.intValue() == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
        }
    }

    public static boolean d(android.content.Context context) {
        return ((android.app.UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 3;
    }

    public static void e(android.view.View view, android.view.View view2, int i, int i2) {
        view.post(new defpackage.jlq(view2, i, i2, view, 6));
    }

    private static int f(android.content.Context context, int i) {
        return context.getResources().getDimensionPixelOffset(i);
    }
}
