package com.waze.view.navbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.waze.R;
import com.waze.main.navigate.EventOnRoute;
import com.waze.mg;
import com.waze.navigate.DriveToNativeManager;
import com.waze.t;
import com.waze.web.r;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f45115a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f45116b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45117c;

    /* renamed from: d, reason: collision with root package name */
    private String f45118d;

    /* renamed from: e, reason: collision with root package name */
    private final LinearLayout f45119e;

    public q(Context context) {
        super(context, null, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.nav_bar_via, this);
        this.f45116b = (TextView) findViewById(R.id.viaBarViaText);
        this.f45115a = findViewById(R.id.ViaBar);
        this.f45119e = (LinearLayout) findViewById(R.id.viaBarAlerts);
    }

    public static /* synthetic */ ab a(q qVar, EventOnRoute[] eventOnRouteArr) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (EventOnRoute eventOnRoute : eventOnRouteArr) {
            if (eventOnRoute != null) {
                int i8 = eventOnRoute.alertType;
                if (i8 == 1) {
                    i5++;
                } else if (i8 == 2) {
                    i6++;
                } else if (i8 == 4) {
                    int i9 = eventOnRoute.durationSeconds;
                    i3 += i9;
                    i4 += eventOnRoute.severity * i9;
                } else if (i8 == 5) {
                    i7++;
                }
            }
        }
        LinearLayout linearLayout = qVar.f45119e;
        linearLayout.removeAllViews();
        int i10 = t.b().getDisplayMetrics().densityDpi;
        int i11 = (int) (i3 / 60.0d);
        if (i11 > 0) {
            int iCeil = (int) Math.ceil(i4 / i3);
            int color = iCeil != 0 ? iCeil != 1 ? iCeil != 2 ? iCeil != 3 ? qVar.getResources().getColor(R.color.Traffic4) : qVar.getResources().getColor(R.color.Traffic4) : qVar.getResources().getColor(R.color.Traffic3) : qVar.getResources().getColor(R.color.Traffic2) : qVar.getResources().getColor(R.color.Traffic1);
            a aVar = new a(qVar.getContext());
            aVar.a(color);
            aVar.c(i11);
            aVar.d(R.drawable.icon_report_traffic);
            linearLayout.addView(aVar);
            i2 = 1;
        }
        if (i5 > 0) {
            a aVar2 = new a(qVar.getContext());
            aVar2.a(-7943985);
            aVar2.b(i5);
            aVar2.d(R.drawable.icon_report_police);
            linearLayout.addView(aVar2);
            i2++;
        }
        if (i6 > 0) {
            a aVar3 = new a(qVar.getContext());
            aVar3.a(-4078653);
            aVar3.b(i6);
            aVar3.d(R.drawable.icon_report_accident);
            linearLayout.addView(aVar3);
            i2++;
        }
        if (i7 > 0 && (i2 < 3 || i10 > 240)) {
            a aVar4 = new a(qVar.getContext());
            aVar4.a(-15775);
            aVar4.b(i7);
            aVar4.d(R.drawable.icon_report_hazard);
            linearLayout.addView(aVar4);
        }
        return ab.f48028a;
    }

    public final void b() {
        TextView textView = this.f45116b;
        textView.setText(this.f45118d);
        String str = this.f45118d;
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void c(String str) {
        this.f45118d = str;
    }

    public final void d() {
        b();
        if (this.f45117c) {
            return;
        }
        this.f45117c = true;
        int i2 = mg.a().getResources().getConfiguration().orientation;
        View view = this.f45115a;
        if (i2 == 2) {
            view.setBackgroundResource(R.drawable.navbar_landscape_bg_normal);
        } else {
            view.setBackgroundColor(getResources().getColor(R.color.DarkShade));
        }
        int i3 = -getHeight();
        setTranslationY(i3 + i3);
        setVisibility(0);
        com.waze.view.anim.g.d(this).translationY(0.0f).setListener(null);
        ((DriveToNativeManager) r.h(DriveToNativeManager.class)).getAlertsOnRoute(new com.waze.uid.b(this, 5));
    }
}
