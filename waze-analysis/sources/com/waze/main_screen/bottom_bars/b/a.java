package com.waze.main_screen.bottom_bars.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.ao;
import com.waze.R;
import com.waze.design_components.button.WazeButton;
import com.waze.feedback.b;
import com.waze.main_screen.a.b.h;
import com.waze.main_screen.bottom_bars.scrollable_eta.o;
import com.waze.navigate.fn;
import com.waze.view.anim.g;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a extends com.waze.main_screen.bottom_bars.a {

    /* renamed from: a, reason: collision with root package name */
    private TextView f25924a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f25925b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f25926c;

    /* renamed from: d, reason: collision with root package name */
    private WazeButton f25927d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25928e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25929f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25930g;

    /* renamed from: h, reason: collision with root package name */
    private long f25931h;

    /* renamed from: i, reason: collision with root package name */
    private View f25932i;

    public a(Context context) {
        super(context);
        n();
    }

    public static /* synthetic */ void c(a aVar) {
        if (aVar.f25930g) {
            return;
        }
        aVar.f25927d.setVisibility(8);
    }

    public static /* synthetic */ void d(a aVar) {
        if (aVar.f25928e) {
            return;
        }
        aVar.setVisibility(8);
    }

    public static /* synthetic */ void l(a aVar) {
        if (aVar.o()) {
            return;
        }
        h.d().e(o.f25998a);
        aVar.b(3);
    }

    public static /* synthetic */ void m(a aVar) {
        if (aVar.o()) {
            return;
        }
        h.d().e(o.f25999b);
        aVar.b(2);
        aVar.f();
    }

    private final void n() {
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        setElevation(getContext().getResources().getDimension(R.dimen.card_elevation_2));
        this.f25932i = LayoutInflater.from(getContext()).inflate(R.layout.bottom_recenter_bar, (ViewGroup) this, true);
        this.f25925b = (TextView) findViewById(R.id.lblEtaTime);
        this.f25926c = (TextView) findViewById(R.id.lblEtaDistance);
        this.f25924a = (TextView) findViewById(R.id.lblRecenter);
        this.f25927d = (WazeButton) findViewById(R.id.btnOverview);
        setOnClickListener(new b(this, 1));
        this.f25927d.setOnClickListener(new b(this, 2));
        ((LinearLayout) findViewById(R.id.labelContainer)).setOrientation(getResources().getConfiguration().orientation == 2 ? 0 : 1);
        ImageView imageView = (ImageView) findViewById(R.id.imgCenter);
        imageView.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.mainBottomBarHeightWithoutHandle);
        imageView.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.mainBottomBarHeightWithoutHandle);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }

    private final boolean o() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f25931h;
        this.f25931h = System.currentTimeMillis();
        return jCurrentTimeMillis < 300;
    }

    public final void e() {
        String strA = this.f25927d.a();
        String string = this.f25924a.getText().toString();
        String string2 = this.f25926c.getText().toString();
        String string3 = this.f25925b.getText().toString();
        removeAllViews();
        n();
        this.f25927d.h(strA);
        this.f25924a.setText(string);
        this.f25926c.setText(string2);
        this.f25925b.setText(string3);
    }

    public final void f() {
        this.f25928e = false;
        clearAnimation();
        g.d(this).translationY(getResources().getDimensionPixelSize(R.dimen.mainBottomBarHeight)).setListener(g.a(new ao(this, 18)));
    }

    public final void g(boolean z) {
        boolean z2 = this.f25930g;
        if (z2 && z) {
            this.f25930g = false;
            this.f25927d.clearAnimation();
            g.d(this.f25927d).translationX(this.f25927d.getMeasuredWidth()).alpha(0.0f).setListener(g.a(new ao(this, 17)));
        } else {
            if (z2 || z) {
                return;
            }
            this.f25930g = true;
            this.f25927d.clearAnimation();
            this.f25927d.setVisibility(0);
            this.f25927d.setAlpha(0.0f);
            this.f25927d.setTranslationX(r4.getMeasuredWidth());
            g.d(this.f25927d).translationX(0.0f).alpha(1.0f).setListener(null);
        }
    }

    public final void h() {
        bringToFront();
        if (!this.f25929f) {
            com.waze.shared_infra.o.a aVarD = com.waze.design_components.g.b.d(this);
            this.f25924a.setText(aVarD.c(R.string.OVERVIEW_BAR_RECENTER_BUTTON, new Object[0]));
            this.f25927d.h(aVarD.c(R.string.OVERVIEW_BAR_OVERVIEW_BUTTON, new Object[0]));
            this.f25929f = true;
        }
        this.f25928e = true;
        setTranslationY(getResources().getDimensionPixelSize(R.dimen.mainBottomBarHeight));
        clearAnimation();
        setVisibility(0);
        g.d(this).translationY(0.0f).setListener(null);
        this.f25930g = true;
        this.f25927d.setVisibility(0);
        this.f25927d.setAlpha(1.0f);
        this.f25927d.setTranslationX(0.0f);
    }

    public final void i(int i2) {
        View view = this.f25932i;
        if (view != null) {
            view.setPadding(0, 0, 0, i2);
        }
    }

    public final void j(fn fnVar) {
        this.f25925b.setText(fnVar.b());
        this.f25926c.setText(fnVar.a());
    }

    public final boolean k() {
        return this.f25928e;
    }
}
