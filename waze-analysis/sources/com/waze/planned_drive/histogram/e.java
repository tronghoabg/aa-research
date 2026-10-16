package com.waze.planned_drive.histogram;

import android.support.v7.widget.fe;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ui.z.as;
import h.g.b.x;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends fe {

    /* renamed from: a, reason: collision with root package name */
    private int f33333a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f33334b;

    /* renamed from: c, reason: collision with root package name */
    private final PlannedDriveGraphView f33335c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f33336d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f33337e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f33338f;

    /* renamed from: g, reason: collision with root package name */
    private final LinearOutSlowInInterpolator f33339g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view) {
        super(view);
        x.f(view, "itemView");
        this.f33333a = Integer.MAX_VALUE;
        View viewFindViewById = view.findViewById(R.id.lblTime);
        x.e(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f33334b = textView;
        View viewFindViewById2 = view.findViewById(R.id.graphView);
        x.e(viewFindViewById2, "findViewById(...)");
        this.f33335c = (PlannedDriveGraphView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.lblDriveDuration);
        x.e(viewFindViewById3, "findViewById(...)");
        this.f33336d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.lblLeaveBy);
        x.e(viewFindViewById4, "findViewById(...)");
        this.f33337e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.imgArrow);
        x.e(viewFindViewById5, "findViewById(...)");
        this.f33338f = (ImageView) viewFindViewById5;
        this.f33339g = new LinearOutSlowInInterpolator();
        textView.setTextSize(true != NativeManager.getInstance().is24HrClock() ? 16 : 18);
    }

    public static final float c() {
        return NativeManager.getInstance().is24HrClock() ? 1.5f : 1.25f;
    }

    public final void a(f fVar) {
        String str;
        String strValueOf;
        x.f(fVar, "mModel");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(true != NativeManager.getInstance().is24HrClock() ? "hh:mm a" : "HH:mm");
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.getDefault());
        dateFormatSymbols.setAmPmStrings(new String[]{"am", "pm"});
        simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
        Calendar calendar = Calendar.getInstance();
        x.e(calendar, "getInstance(...)");
        calendar.setTimeInMillis(fVar.c());
        this.f33334b.setText(simpleDateFormat.format(calendar.getTime()));
        calendar.setTimeInMillis(fVar.c() - fVar.b());
        this.f33337e.setText(com.waze.shared_infra.o.b.a().c(R.string.FUTURE_DRIVES_PLAN_LEAVE_BY_PS, simpleDateFormat.format(calendar.getTime())));
        long jB = fVar.b() / 60000;
        long j2 = jB / 60;
        if (j2 > 0) {
            long j3 = jB - (60 * j2);
            if (j3 > 9) {
                strValueOf = String.valueOf(j3);
            } else {
                strValueOf = "0" + j3;
            }
            str = String.format(com.waze.shared_infra.o.b.a().c(R.string.FUTURE_DRIVES_PLAN_PD_HOUR_DRIVE, new Object[0]), Arrays.copyOf(new Object[]{j2 + ":" + strValueOf}, 1));
            x.e(str, "format(...)");
        } else {
            str = String.format(com.waze.shared_infra.o.b.a().c(R.string.FUTURE_DRIVES_PLAN_PD_MIN_DRIVE, new Object[0]), Arrays.copyOf(new Object[]{Long.valueOf(jB)}, 1));
            x.e(str, "format(...)");
        }
        this.f33336d.setText(str);
        PlannedDriveGraphView plannedDriveGraphView = this.f33335c;
        plannedDriveGraphView.a(fVar.d());
        setIsRecyclable(false);
        plannedDriveGraphView.setTranslationX(as.e(R.dimen.planDriveGraphWidth));
        plannedDriveGraphView.animate().setInterpolator(this.f33339g).setDuration(250L).translationX(0.0f).withEndAction(new com.waze.ads.f(this, 17));
        b(this.f33333a);
    }

    public final void b(int i2) {
        if (i2 == this.f33333a) {
            return;
        }
        this.f33333a = i2;
        float fE = this.f33333a / as.e(R.dimen.planDriveCellHeight);
        if (fE <= 0.25f) {
            TextView textView = this.f33334b;
            textView.setScaleX(c());
            textView.setScaleY(c());
            TextView textView2 = this.f33337e;
            textView2.setVisibility(0);
            TextView textView3 = this.f33336d;
            textView3.setVisibility(0);
            ImageView imageView = this.f33338f;
            imageView.setVisibility(0);
            textView2.setAlpha(1.0f);
            textView3.setAlpha(1.0f);
            imageView.setTranslationX(0.0f);
            return;
        }
        if (fE > 1.5d) {
            TextView textView4 = this.f33334b;
            textView4.setScaleX(1.0f);
            textView4.setScaleY(1.0f);
            this.f33337e.setVisibility(4);
            this.f33336d.setVisibility(4);
            this.f33338f.setVisibility(4);
            return;
        }
        TextView textView5 = this.f33337e;
        textView5.setVisibility(0);
        TextView textView6 = this.f33336d;
        textView6.setVisibility(0);
        ImageView imageView2 = this.f33338f;
        imageView2.setVisibility(0);
        float fMax = Math.max(((-1.3333334f) * fE) + 1.3333334f, 0.0f);
        textView5.setAlpha(fMax);
        textView6.setAlpha(fMax);
        imageView2.setTranslationX((-(1.0f - fMax)) * imageView2.getWidth());
        float fC = (c() - 1.0f) / (-0.75f);
        TextView textView7 = this.f33334b;
        float fMax2 = Math.max((fE * fC) + (1.0f - fC), 1.0f);
        textView7.setScaleX(fMax2);
        textView7.setScaleY(fMax2);
    }
}
