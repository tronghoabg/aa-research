package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.CarText;
import androidx.car.app.navigation.model.TravelEstimate;
import com.google.android.projection.gearhead.R;
import defpackage.geu;
import defpackage.gmn;
import defpackage.gth;
import defpackage.guo;
import defpackage.hbz;
import defpackage.hmb;
import defpackage.woy;
import defpackage.yph;

/* loaded from: classes2.dex */
public class TravelEstimateView extends LinearLayout {
    private TextView a;
    private TextView b;
    private ImageView c;

    static {
        yph.c("CarApp.H.Tem");
    }

    public TravelEstimateView(Context context) {
        this(context, null);
    }

    public final void a(geu geuVar, TravelEstimate travelEstimate) {
        String string;
        SpannableString spannableString;
        if (travelEstimate == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        gth gthVarB = gmn.b(travelEstimate, geuVar);
        TextView textView = this.b;
        CarText carText = gthVarB.b;
        if (carText == null || (string = carText.toString()) == null) {
            string = gthVarB.d;
        }
        textView.setText(string);
        TextView textView2 = this.a;
        geuVar.getClass();
        SpannableString spannableString2 = null;
        if (carText != null) {
            spannableString = new SpannableString(gthVarB.d);
        } else {
            String str = gthVarB.c;
            if (str != null) {
                spannableString = new SpannableString(str);
                guo.b(geuVar, gthVarB.g, spannableString);
            } else {
                spannableString = null;
            }
        }
        String str2 = gthVarB.e;
        if (str2 != null) {
            spannableString2 = new SpannableString(str2);
            guo.b(geuVar, gthVarB.f, spannableString2);
        }
        textView2.setText(new SpannableString(woy.cu(woy.da(new SpannableString[]{spannableString, spannableString2}), " · ", null, null, null, 62)));
        ImageView imageView = this.c;
        geuVar.getClass();
        imageView.getClass();
        if (gmn.b(travelEstimate, geuVar).a != null) {
            hbz.j(geuVar, travelEstimate.getTripIcon(), imageView, hmb.a);
        } else {
            imageView.setVisibility(8);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.time_and_distance_text);
        this.b = (TextView) findViewById(R.id.trip_text);
        this.c = (ImageView) findViewById(R.id.trip_icon);
    }

    public TravelEstimateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TravelEstimateView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TravelEstimateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
