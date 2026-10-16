package com.waze.feedback;

import android.support.v4.app.ar;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.c.a.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f23850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f23852c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23853d;

    public /* synthetic */ a(View view, View view2, ab abVar, int i2) {
        this.f23853d = i2;
        this.f23850a = view;
        this.f23852c = view2;
        this.f23851b = abVar;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.f23853d == 0) {
            View view2 = this.f23852c;
            return FeedbackActivity.l((FeedbackActivity) this.f23851b, this.f23850a, (LinearLayout) view2, windowInsetsCompat);
        }
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_CLOSE);
        int i2 = insets.left;
        int i3 = insets.right;
        View view3 = this.f23850a;
        view3.setPadding(i2, view3.getPaddingTop(), i3, view3.getPaddingBottom());
        int i4 = insets.top;
        View view4 = this.f23852c;
        view4.setPadding(view4.getPaddingLeft(), i4, view4.getPaddingRight(), view4.getPaddingBottom());
        View viewFindViewById = ((ar) this.f23851b).requireView().findViewById(R.id.tripOverview_fragmentRoutes_layout);
        x.e(viewFindViewById, "findViewById(...)");
        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public /* synthetic */ a(FeedbackActivity feedbackActivity, View view, LinearLayout linearLayout, int i2) {
        this.f23853d = i2;
        this.f23851b = feedbackActivity;
        this.f23850a = view;
        this.f23852c = linearLayout;
    }
}
