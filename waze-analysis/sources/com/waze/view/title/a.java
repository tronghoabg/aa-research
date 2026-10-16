package com.waze.view.title;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.planned_drive.ay;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f45405a;

    public /* synthetic */ a(int i2) {
        this.f45405a = i2;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i2 = this.f45405a;
        if (i2 == 0) {
            Insets insets = windowInsetsCompat.getInsets(1);
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
            return WindowInsetsCompat.CONSUMED;
        }
        if (i2 == 1) {
            int i3 = ay.f33212a;
            Insets insets2 = windowInsetsCompat.getInsets(2);
            int i4 = insets2.bottom - insets2.top;
            x.c(view);
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i4);
            return windowInsetsCompat;
        }
        Insets insets3 = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = insets3.left;
        marginLayoutParams.bottomMargin = insets3.bottom;
        marginLayoutParams.rightMargin = insets3.right;
        view.setLayoutParams(marginLayoutParams);
        return WindowInsetsCompat.CONSUMED;
    }
}
