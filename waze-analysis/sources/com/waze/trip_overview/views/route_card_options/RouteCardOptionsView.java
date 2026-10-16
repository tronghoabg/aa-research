package com.waze.trip_overview.views.route_card_options;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.ui.z.as;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class RouteCardOptionsView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final SwitchCompat f41543a;

    /* renamed from: b, reason: collision with root package name */
    private View f41544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteCardOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.f(context, "context");
        setBackground(ContextCompat.getDrawable(context, R.drawable.route_option_bg));
        com.waze.design_components.f.a aVar = new com.waze.design_components.f.a(context);
        x.f(aVar, "<set-?>");
        this.f41543a = aVar;
        a().setId(ConstraintLayout.generateViewId());
        addView(a());
        ConstraintSet constraintSet = new ConstraintSet();
        RouteCardOptionsView routeCardOptionsView = this;
        constraintSet.clone(routeCardOptionsView);
        constraintSet.connect(a().getId(), 7, 0, 7);
        constraintSet.connect(a().getId(), 3, 0, 3);
        constraintSet.connect(a().getId(), 4, 0, 4);
        constraintSet.applyTo(routeCardOptionsView);
        setPadding(as.g(context, 8), 0, as.g(context, 8), 0);
    }

    public final SwitchCompat a() {
        SwitchCompat switchCompat = this.f41543a;
        if (switchCompat != null) {
            return switchCompat;
        }
        x.j("switch");
        return null;
    }

    public final void b(View view) {
        x.f(view, "view");
        View view2 = this.f41544b;
        if (view2 != null) {
            removeView(view2);
        }
        this.f41544b = view;
        if (view.getId() == -1) {
            view.setId(ConstraintLayout.generateViewId());
        }
        addView(view);
        ConstraintSet constraintSet = new ConstraintSet();
        RouteCardOptionsView routeCardOptionsView = this;
        constraintSet.clone(routeCardOptionsView);
        constraintSet.connect(view.getId(), 1, 0, 1);
        constraintSet.connect(view.getId(), 3, 0, 3);
        constraintSet.connect(view.getId(), 4, 0, 4);
        constraintSet.applyTo(routeCardOptionsView);
    }

    public final boolean c() {
        return a().isChecked();
    }
}
