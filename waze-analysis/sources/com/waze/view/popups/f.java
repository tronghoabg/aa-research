package com.waze.view.popups;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.MoodManager;
import com.waze.R;
import com.waze.lm;
import com.waze.navigate.eo;
import com.waze.view.button.ReportMenuButton;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class f extends m {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f45302a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.waze.main_screen.ab.a.e f45303b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45304c;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnClickListener[] f45305e;

    /* renamed from: f, reason: collision with root package name */
    private final eo f45306f;

    public f(Context context, com.waze.main_screen.ab.a.e eVar) {
        super(context);
        this.f45305e = new View.OnClickListener[3];
        this.f45306f = (eo) com.waze.web.r.h(eo.class);
        this.f45302a = context;
        this.f45303b = eVar;
        c();
    }

    static void s(int i2, View view, TextView textView, View.OnClickListener onClickListener) {
        view.setEnabled(true);
        textView.setBackgroundResource(i2);
        textView.setText("");
        view.setOnClickListener(onClickListener);
    }

    @Override // com.waze.view.popups.m
    public final void K() {
        Drawable drawable;
        int i2;
        ImageView imageView = (ImageView) findViewById(R.id.genTakeOverIcon);
        int visibility = imageView.getVisibility();
        Drawable drawable2 = imageView.getDrawable();
        int visibility2 = findViewById(R.id.genTakeOverUserImageContainer).getVisibility();
        Drawable drawable3 = ((ImageView) findViewById(R.id.genTakeOverUserImage)).getDrawable();
        String strA = a(R.id.genTakeOverUserImageInitials);
        int visibility3 = findViewById(R.id.genTakeOverPictureContainer).getVisibility();
        Drawable drawable4 = ((ImageView) findViewById(R.id.genTakeOverPicture)).getDrawable();
        ImageView imageView2 = (ImageView) findViewById(R.id.genTakeOverSmallIcon);
        int visibility4 = imageView2.getVisibility();
        Drawable drawable5 = imageView2.getDrawable();
        String strA2 = a(R.id.genTakeOverReportTime);
        String strA3 = a(R.id.genTakeOverLine1);
        String strA4 = a(R.id.genTakeOverLine2);
        String strA5 = a(R.id.genTakeOverLine3);
        ReportMenuButton reportMenuButton = (ReportMenuButton) findViewById(R.id.genTakeOverUserMoodRmb);
        reportMenuButton.h();
        int visibility5 = reportMenuButton.getVisibility();
        int iA = reportMenuButton.a();
        int iB = reportMenuButton.b();
        String strA6 = a(R.id.genTakeOverUser);
        View viewFindViewById = findViewById(R.id.genTakeOverRight1Button);
        TextView textView = (TextView) findViewById(R.id.genTakeOverRight1ButtonText);
        int visibility6 = viewFindViewById.getVisibility();
        boolean zIsEnabled = viewFindViewById.isEnabled();
        Drawable background = textView.getBackground();
        String string = textView.getText().toString();
        View viewFindViewById2 = findViewById(R.id.genTakeOverRight2Button);
        TextView textView2 = (TextView) findViewById(R.id.genTakeOverRight2ButtonText);
        int visibility7 = viewFindViewById2.getVisibility();
        boolean zIsEnabled2 = viewFindViewById2.isEnabled();
        Drawable background2 = textView2.getBackground();
        String string2 = textView2.getText().toString();
        View viewFindViewById3 = findViewById(R.id.genTakeOverRight3Button);
        TextView textView3 = (TextView) findViewById(R.id.genTakeOverRight3ButtonText);
        int visibility8 = viewFindViewById3.getVisibility();
        boolean zIsEnabled3 = viewFindViewById3.isEnabled();
        Drawable background3 = textView3.getBackground();
        String string3 = textView3.getText().toString();
        removeAllViews();
        c();
        ImageView imageView3 = (ImageView) findViewById(R.id.genTakeOverIcon);
        if (visibility == 0) {
            drawable = background;
            i2 = 0;
        } else {
            drawable = background;
            i2 = 8;
        }
        imageView3.setVisibility(i2);
        if (visibility == 0) {
            imageView3.setImageDrawable(drawable2);
        }
        findViewById(R.id.genTakeOverUserImageContainer).setVisibility(visibility2 == 0 ? 0 : 8);
        if (visibility2 == 0) {
            ((ImageView) findViewById(R.id.genTakeOverUserImage)).setImageDrawable(drawable3);
            j(R.id.genTakeOverUserImageInitials, strA);
        }
        findViewById(R.id.genTakeOverPictureContainer).setVisibility(visibility3 == 0 ? 0 : 8);
        if (visibility3 == 0) {
            ((ImageView) findViewById(R.id.genTakeOverPicture)).setImageDrawable(drawable4);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.genTakeOverSmallIcon);
        imageView4.setVisibility(visibility4 == 0 ? 0 : 8);
        if (visibility4 == 0) {
            imageView4.setImageDrawable(drawable5);
        }
        j(R.id.genTakeOverReportTime, strA2);
        j(R.id.genTakeOverLine1, strA3);
        j(R.id.genTakeOverLine2, strA4);
        j(R.id.genTakeOverLine3, strA5);
        ReportMenuButton reportMenuButton2 = (ReportMenuButton) findViewById(R.id.genTakeOverUserMoodRmb);
        reportMenuButton2.h();
        reportMenuButton2.setVisibility(visibility5 == 0 ? 0 : 8);
        if (visibility5 == 0) {
            reportMenuButton2.setBackgroundColor(iA);
            reportMenuButton2.f(iB);
        }
        j(R.id.genTakeOverUser, strA6);
        View viewFindViewById4 = findViewById(R.id.genTakeOverRight1Button);
        viewFindViewById4.setVisibility(visibility6 == 0 ? 0 : 8);
        if (visibility6 == 0) {
            TextView textView4 = (TextView) findViewById(R.id.genTakeOverRight1ButtonText);
            viewFindViewById4.setEnabled(zIsEnabled);
            textView4.setBackgroundDrawable(drawable);
            textView4.setText(string);
            viewFindViewById4.setOnClickListener(this.f45305e[0]);
        }
        View viewFindViewById5 = findViewById(R.id.genTakeOverRight2Button);
        viewFindViewById5.setVisibility(visibility7 == 0 ? 0 : 8);
        if (visibility7 == 0) {
            TextView textView5 = (TextView) findViewById(R.id.genTakeOverRight2ButtonText);
            viewFindViewById5.setEnabled(zIsEnabled2);
            textView5.setBackgroundDrawable(background2);
            textView5.setText(string2);
            viewFindViewById5.setOnClickListener(this.f45305e[1]);
        }
        View viewFindViewById6 = findViewById(R.id.genTakeOverRight3Button);
        viewFindViewById6.setVisibility(visibility8 == 0 ? 0 : 8);
        if (visibility8 == 0) {
            TextView textView6 = (TextView) findViewById(R.id.genTakeOverRight3ButtonText);
            viewFindViewById6.setEnabled(zIsEnabled3);
            textView6.setBackgroundDrawable(background3);
            textView6.setText(string3);
            viewFindViewById6.setOnClickListener(this.f45305e[0]);
        }
    }

    final String a(int i2) {
        TextView textView = (TextView) findViewById(i2);
        if (textView != null && textView.getVisibility() == 0) {
            return textView.getText().toString();
        }
        return null;
    }

    public final void b() {
        this.f45304c = false;
        this.f45303b.g();
    }

    @Override // com.waze.view.popups.m
    public final void bG(boolean z) {
        findViewById(R.id.genTakeOverLayout).setPadding(0, getResources().getDimensionPixelSize(true != z ? R.dimen.takeover_top_padding_no_indicator : R.dimen.takeover_top_padding), 0, 0);
    }

    @Override // com.waze.view.popups.m
    public final void bH(boolean z, float f2) {
        float f3 = f2;
        int[] iArr = {R.id.genTakeOverRight1Button, R.id.genTakeOverRight2Button, R.id.genTakeOverRight3Button, R.id.genTakeOverUserMoodRmb, R.id.genTakeOverUser, R.id.genTakeOverReportTime};
        for (int i2 = 0; i2 < 6; i2++) {
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
        int[] iArr2 = {R.id.genTakeOverLine1, R.id.genTakeOverLine2, R.id.genTakeOverLine3};
        float f5 = 0.5f;
        for (int i3 = 0; i3 < 3; i3++) {
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

    protected final void c() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.generic_takeover, this);
        View viewFindViewById = findViewById(R.id.genTakeOverLayout);
        if (getResources().getConfiguration().orientation != 2) {
            viewFindViewById.setBackgroundResource(R.drawable.takeover_bg);
        } else {
            viewFindViewById.setBackgroundResource(true != this.f45306f.T() ? R.drawable.takeover_bg_ls_standalone : R.drawable.takeover_bg_ls_nested);
            findViewById(R.id.genTakeoverShadow).setVisibility(8);
        }
    }

    protected final void d() {
        if (this.f45304c) {
            b();
        }
        this.f45304c = true;
    }

    @Override // com.waze.view.popups.m
    public final void e() {
        b();
    }

    @Override // com.waze.view.popups.m
    public final void f() {
        this.f45303b.f(1);
    }

    protected final void g() {
        findViewById(R.id.genTakeOverUser).setVisibility(8);
        findViewById(R.id.genTakeOverUserMoodRmb).setVisibility(8);
    }

    final void h() {
        findViewById(R.id.genTakeOverRight2Button).setVisibility(8);
        this.f45305e[1] = null;
    }

    final void i() {
        findViewById(R.id.genTakeOverRight3Button).setVisibility(8);
        this.f45305e[2] = null;
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f45304c;
    }

    final void j(int i2, String str) {
        TextView textView = (TextView) findViewById(i2);
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    final void k(String str) {
        TextView textView = (TextView) findViewById(R.id.genTakeOverLine1);
        if (str == null) {
            textView.setVisibility(8);
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    final void l(String str) {
        TextView textView = (TextView) findViewById(R.id.genTakeOverLine2);
        if (str == null) {
            textView.setVisibility(8);
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    final void m(String str) {
        TextView textView = (TextView) findViewById(R.id.genTakeOverLine3);
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    final void p(int i2) {
        ImageView imageView = (ImageView) findViewById(R.id.genTakeOverSmallIcon);
        imageView.setVisibility(0);
        imageView.setImageResource(i2);
    }

    protected final void q(String str) {
        TextView textView = (TextView) findViewById(R.id.genTakeOverReportTime);
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str.toUpperCase());
        }
    }

    final void r(String str, String str2, String str3) {
        findViewById(R.id.genTakeOverSmallIcon).setVisibility(8);
        Drawable moodDrawable = MoodManager.getMoodDrawable(str3);
        View viewFindViewById = findViewById(R.id.genTakeOverImageFrame);
        viewFindViewById.findViewById(R.id.genTakeOverPictureContainer).setVisibility(8);
        if (str == null) {
            viewFindViewById.findViewById(R.id.genTakeOverUserImageContainer).setVisibility(8);
            ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.genTakeOverIcon);
            imageView.setVisibility(0);
            imageView.setImageDrawable(moodDrawable);
            return;
        }
        viewFindViewById.findViewById(R.id.genTakeOverIcon).setVisibility(8);
        viewFindViewById.findViewById(R.id.genTakeOverUserImageContainer).setVisibility(0);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.genTakeOverUserImageInitials);
        if (!str2.startsWith("+") || str2.length() > 3) {
            StringBuilder sb = new StringBuilder();
            for (String str4 : str2.split(" ")) {
                if (str4 != null && str4.length() != 0 && Character.isLetter(str4.charAt(0))) {
                    sb.append(str4.substring(0, 1).toUpperCase(Locale.US));
                }
            }
            if (sb.length() > 3) {
                sb = new StringBuilder(sb.substring(0, 3));
            }
            str2 = sb.toString();
        }
        textView.setText(str2);
        com.waze.utils.n.f44897a.a(str, 2, (ImageView) viewFindViewById.findViewById(R.id.genTakeOverUserImage), textView, lm.d().e().getApplicationContext());
    }

    final void t(int i2, View.OnClickListener onClickListener) {
        s(i2, findViewById(R.id.genTakeOverRight1Button), (TextView) findViewById(R.id.genTakeOverRight1ButtonText), onClickListener);
        this.f45305e[0] = onClickListener;
    }

    final void u(View.OnClickListener onClickListener) {
        s(R.drawable.flag_icon_red, findViewById(R.id.genTakeOverRight2Button), (TextView) findViewById(R.id.genTakeOverRight2ButtonText), onClickListener);
        this.f45305e[1] = onClickListener;
    }
}
