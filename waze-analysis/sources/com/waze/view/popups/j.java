package com.waze.view.popups;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.lm;
import com.waze.mg;
import com.waze.navigate.eo;
import com.waze.reports.cv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class j extends m {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f45312a;

    /* renamed from: b, reason: collision with root package name */
    protected RtAlertItem f45313b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.waze.main_screen.ab.a.e f45314c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45315e;

    /* renamed from: f, reason: collision with root package name */
    private String f45316f;

    /* renamed from: g, reason: collision with root package name */
    private int f45317g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.view.a.f f45318h;

    /* renamed from: i, reason: collision with root package name */
    private final eo f45319i;

    public j(Context context, com.waze.main_screen.ab.a.e eVar) {
        super(context);
        this.f45317g = 0;
        this.f45319i = (eo) com.waze.web.r.h(eo.class);
        this.f45312a = context;
        this.f45314c = eVar;
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.generic_takeover_revamp, this);
        a();
    }

    private final void a() {
        View viewFindViewById = findViewById(R.id.genTakeOverLayout);
        if (getResources().getConfiguration().orientation != 2) {
            viewFindViewById.setBackgroundResource(R.drawable.takeover_bg);
        } else {
            viewFindViewById.setBackgroundResource(true != this.f45319i.T() ? R.drawable.takeover_bg_ls_standalone : R.drawable.takeover_bg_ls_nested);
            findViewById(R.id.genericTakeoverShadow).setVisibility(8);
        }
    }

    public static int d(Context context, String str) {
        String strValueOf = String.valueOf(str.replace("-", "_").toLowerCase());
        return context.getResources().getIdentifier("drawable/".concat(strValueOf), null, context.getPackageName());
    }

    public static /* synthetic */ void g(final j jVar, View view) {
        String str = jVar.f45316f;
        com.waze.sharedui.a.e eVarE = lm.d().e();
        Bundle bundle = new Bundle();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        bundle.putInt(TtmlNode.LEFT, iArr[0]);
        bundle.putInt("top", iArr[1]);
        bundle.putInt("width", view.getWidth());
        bundle.putInt("height", view.getHeight());
        com.waze.view.a.f fVar = new com.waze.view.a.f(eVarE, str, bundle);
        jVar.f45318h = fVar;
        fVar.setCanceledOnTouchOutside(true);
        jVar.f45318h.show();
        jVar.f45318h.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.waze.view.popups.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f45307a.f45318h = null;
            }
        });
    }

    protected static final void t(String str, boolean z, View view, TextView textView, View.OnClickListener onClickListener) {
        view.setEnabled(z);
        textView.setText(str);
        view.setOnClickListener(onClickListener);
    }

    @Override // com.waze.view.popups.m
    public final void K() {
        a();
    }

    @Override // com.waze.view.popups.m
    public final void bG(boolean z) {
        findViewById(R.id.genTakeOverLayout).setPadding(0, getResources().getDimensionPixelSize(true != z ? R.dimen.takeover_top_padding_no_indicator : R.dimen.takeover_top_padding), 0, 0);
    }

    @Override // com.waze.view.popups.m
    public final void bH(boolean z, float f2) {
        float f3 = f2;
        int[] iArr = {R.id.genTakeOverRight1Button, R.id.genTakeOverRight2Button, R.id.genTakeOverUser};
        for (int i2 = 0; i2 < 3; i2++) {
            View viewFindViewById = findViewById(iArr[i2]);
            if (viewFindViewById.getVisibility() == 0) {
                float f4 = 1.0f - (f3 + f3);
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                viewFindViewById.setAlpha(f4);
            }
        }
        if (z) {
            f3 = -f3;
        }
        int[] iArr2 = {R.id.genTakeOverLine1, R.id.genTakeOverLine2, R.id.genTakeOverLine3, R.id.genTakeOverLine4};
        float f5 = 0.5f;
        for (int i3 = 0; i3 < 4; i3++) {
            View viewFindViewById2 = findViewById(iArr2[i3]);
            if (viewFindViewById2.getVisibility() == 0) {
                float f6 = f5 * f3;
                TranslateAnimation translateAnimation = new TranslateAnimation(2, f6, 2, f6, 2, 0.0f, 2, 0.0f);
                translateAnimation.setFillAfter(true);
                viewFindViewById2.startAnimation(translateAnimation);
            }
            f5 += 0.5f;
        }
    }

    @Override // com.waze.view.popups.m
    public final void e() {
        h();
    }

    @Override // com.waze.view.popups.m
    public final void f() {
        this.f45314c.f(1);
    }

    public final void h() {
        this.f45315e = false;
        this.f45314c.g();
    }

    protected final void i() {
        if (this.f45315e) {
            h();
        }
        this.f45315e = true;
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f45315e;
    }

    final void j(int i2, boolean z, View.OnClickListener onClickListener) {
        String str = "";
        if (i2 > 0) {
            str = "" + i2;
        }
        t(str, z, findViewById(R.id.genTakeOverRight1Button), (TextView) findViewById(R.id.genTakeOverRight1ButtonText), onClickListener);
    }

    final void k(boolean z, View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R.id.genTakeOverRight3Button);
        viewFindViewById.setEnabled(z);
        viewFindViewById.setOnClickListener(onClickListener);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new i(this, (LinearLayout) findViewById(R.id.genTakeOverButtonsLinearLayout), viewFindViewById));
    }

    final void l(String str, int i2) {
        this.f45317g = i2 | (-16777216);
        this.f45316f = null;
        int i3 = mg.a().getResources().getConfiguration().orientation;
        ImageView imageView = (ImageView) findViewById(R.id.genTakeOverHazardBg);
        int i4 = this.f45317g;
        imageView.getContext();
        imageView.setImageDrawable(new com.waze.sharedui.views.h(i4, i3 != 2 ? 4 : 2));
        ImageView imageView2 = (ImageView) findViewById(R.id.genTakeOverHazardIcon);
        imageView2.setImageResource(d(this.f45312a, str));
        imageView2.setVisibility(0);
    }

    final void m(String str) {
        TextView textView = (TextView) findViewById(R.id.genTakeOverLine2);
        if (str == null) {
            textView.setVisibility(8);
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    final void p(String str) {
        findViewById(R.id.genTakeOverHazardIcon).setVisibility(8);
        ImageView imageView = (ImageView) findViewById(R.id.genTakeOverHazardBg);
        imageView.getContext();
        imageView.setImageDrawable(new com.waze.sharedui.views.h(2004318071, 4));
        this.f45316f = str;
        this.f45317g = 0;
        com.waze.utils.i.a().e(str, new h(this, imageView), null, imageView.getWidth(), imageView.getHeight(), false);
        findViewById(R.id.genTakeOverHazard).setOnClickListener(new cv(this, 16));
    }

    final void q(String str, int i2) {
        View viewFindViewById = findViewById(R.id.genTakeOverHazardSmall);
        if (viewFindViewById == null) {
            return;
        }
        if (this.f45316f == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        this.f45317g = i2 | (-16777216);
        ImageView imageView = (ImageView) findViewById(R.id.genTakeOverHazardSmallBg);
        int i3 = this.f45317g;
        imageView.getContext();
        imageView.setImageDrawable(new com.waze.sharedui.views.h(i3, 2));
        ImageView imageView2 = (ImageView) findViewById(R.id.genTakeOverSmallIcon);
        imageView2.setImageResource(d(this.f45312a, str));
        imageView.setVisibility(0);
        imageView2.setVisibility(0);
    }

    protected final boolean r() {
        return this.f45319i.T();
    }
}
