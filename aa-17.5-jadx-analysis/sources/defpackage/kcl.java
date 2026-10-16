package defpackage;

import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.model.Alert;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.Step;
import com.android.car.libraries.apphost.map.widgets.ProgressView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.CompactStepView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.DetailedStepView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.FloatingNavBarView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.MessageView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kcl {
    public final geu a;
    public final BleedingCardView b;
    public final hlv c;
    public final hlv d;
    public final yph e;
    public int f;
    public final ViewGroup g;
    public final CompactStepView h;
    public final ProgressView i;
    public final FloatingNavBarView j;
    public final CarTextView k;
    public final DetailedStepView l;
    public final MessageView m;
    public final CarTextView n;
    public final ImageView o;
    public final FrameLayout p;
    public final gei q;
    public wz r;
    private final int s;

    public kcl(geu geuVar, BleedingCardView bleedingCardView, ViewGroup viewGroup) {
        geuVar.getClass();
        bleedingCardView.getClass();
        viewGroup.getClass();
        this.a = geuVar;
        this.b = bleedingCardView;
        this.e = yph.c("CarApp.H.Tem");
        this.f = 4;
        this.c = d(false);
        this.d = d(true);
        this.s = bleedingCardView.b;
        View viewFindViewById = viewGroup.findViewById(R.id.steps_container);
        viewFindViewById.getClass();
        this.g = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.compact_step_view);
        viewFindViewById2.getClass();
        this.h = (CompactStepView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.progress_view);
        viewFindViewById3.getClass();
        this.i = (ProgressView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.floating_nav_bar_view);
        viewFindViewById4.getClass();
        this.j = (FloatingNavBarView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.detailed_step_view);
        viewFindViewById5.getClass();
        DetailedStepView detailedStepView = (DetailedStepView) viewFindViewById5;
        this.l = detailedStepView;
        View viewFindViewById6 = detailedStepView.findViewById(R.id.description_text);
        viewFindViewById6.getClass();
        this.k = (CarTextView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.message_view);
        viewFindViewById7.getClass();
        MessageView messageView = (MessageView) viewFindViewById7;
        this.m = messageView;
        View viewFindViewById8 = messageView.findViewById(R.id.message_text);
        viewFindViewById8.getClass();
        this.n = (CarTextView) viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.junction_image_container);
        viewFindViewById9.getClass();
        View viewFindViewById10 = viewGroup.findViewById(R.id.lanes_image_container);
        viewFindViewById10.getClass();
        this.p = (FrameLayout) viewFindViewById10;
        View viewFindViewById11 = viewGroup.findViewById(R.id.junction_image);
        viewFindViewById11.getClass();
        this.o = (ImageView) viewFindViewById11;
        hem hemVarL = geuVar.l(gei.class);
        hemVarL.getClass();
        this.q = (gei) hemVarL;
        bleedingCardView.setClickable(true);
    }

    public static final int c(View view, int i, int i2, boolean z) {
        if (view.getVisibility() != 0 || i <= i2) {
            return 0;
        }
        view.setVisibility(8);
        int measuredHeight = view.getMeasuredHeight();
        if (!z) {
            return measuredHeight;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final hlv d(boolean z) {
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(new int[]{R.attr.templateRoutingDefaultIconTint, R.attr.templateRoutingImageSpanBody2MaxHeight, R.attr.templateRoutingImageSpanBody3MaxHeight});
        typedArrayObtainStyledAttributes.getClass();
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (true == z) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        hlv hlvVar = hlv.a;
        hlu hluVar = new hlu();
        hluVar.c = new Rect(0, 0, Alert.DURATION_SHOW_INDEFINITELY, dimensionPixelSize);
        hluVar.d = 10;
        hluVar.e = color;
        hluVar.a = ghv.c;
        hluVar.f = 4;
        return hluVar.a();
    }

    public final int a(CarColor carColor) {
        return carColor != null ? gbt.k(this.a, carColor, false, -16777216, ghv.a, 0) : this.s;
    }

    public final void b(CarColor carColor) {
        int iA = a(carColor);
        eqm eqmVar = this.q.a;
        hrj hrjVar = (hrj) eqmVar.e();
        hrjVar.getClass();
        if (hrjVar.b != iA) {
            eqmVar.j(new hrj(hrjVar.a, (Step) hrjVar.c, (Distance) hrjVar.d, iA));
        }
        BleedingCardView bleedingCardView = this.b;
        bleedingCardView.a(gbt.j(iA, 0.2f));
        float f = bleedingCardView.a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, f, f});
        gradientDrawable.setColor(gbt.j(iA, 0.4f));
        this.h.setBackground(gradientDrawable);
    }
}
