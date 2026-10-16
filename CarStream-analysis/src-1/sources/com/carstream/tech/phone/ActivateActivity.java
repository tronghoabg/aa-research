package com.carstream.tech.phone;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.car.e;
import com.carstream.tech.core.ui.SplashArt;
import com.carstream.tech.core.ui.SplashView;
import defpackage.a6;
import defpackage.c5;
import defpackage.ec;
import defpackage.f;
import defpackage.g;
import defpackage.i;
import defpackage.j;
import defpackage.k;
import defpackage.k1;
import defpackage.l;
import defpackage.m;
import defpackage.n;
import defpackage.o;
import defpackage.p;
import defpackage.s5;
import defpackage.t6;
import defpackage.u2;
import defpackage.w1;
import defpackage.w6;
import defpackage.xc;
import defpackage.z5;
import defpackage.z6;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ActivateActivity extends Activity {
    private static final String BTN_IDLE = "Kích hoạt";
    private static final long DRIVE_IDLE_MS = 850;
    private static final long ENTER_DELAY_MS = 1400;
    private static final int ERROR = -4050406;
    private static final int HAIRLINE = -992824;
    private static final String HELP_IDLE = "Key phân biệt chữ hoa, không cần gõ dấu cách";
    private static final float KEY_LENGTH = 12.0f;
    private static final int MUTED = -7706020;
    private static final int RISE_DP = 16;
    private static final int SOFT_BORDER = -1919073;
    private static final String STATE_KEY = "key_dang_go";
    private static final int SUCCESS = -14714286;
    private static final int SUCCESS_PALE = -2234404;
    private static final int TRACK = -728363;
    private static final long WELCOME_DELAY_MS = 900;
    private TextView button;
    private View buttonBox;
    private View buyBlock;
    private TextView check;
    private View content;
    private ValueAnimator driveClock;
    private long driveStart;
    private EditText field;
    private View fieldBorder;
    private View fieldBox;
    private View formBlock;
    private SplashArt glyph;
    private TextView helper;
    private boolean manNgang;
    private boolean navigating;
    private View progressFill;
    private View progressTrack;
    private ProgressBar spinner;
    private View titleBlock;
    private View welcome;
    private final Handler main = new Handler(Looper.getMainLooper());
    private p state = p.a;
    private final t6 aaListener = new l(this, 0);
    private final Runnable stopDriving = new j(this, 4);

    /* JADX INFO: Access modifiers changed from: private */
    public void applyResult(z5 z5Var) {
        if (!z5Var.a) {
            render(p.c);
            this.helper.setText(errorText(z5Var.b));
        } else {
            Iterator it = z6.e.iterator();
            while (it.hasNext()) {
                try {
                    ((e) ((w6) it.next()).a).m();
                } catch (Throwable unused) {
                }
            }
            render(p.d);
        }
    }

    private GradientDrawable borderFor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(k1.g(this, 16.0f));
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(Math.max(2, k1.g(this, 2.0f)), i);
        return gradientDrawable;
    }

    private View buildButton() {
        FrameLayout frameLayout = new FrameLayout(this);
        this.buttonBox = frameLayout;
        k1.B(frameLayout, SplashArt.M, false, k1.g(this, 16.0f));
        frameLayout.setOnClickListener(new o(this, 0));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        ProgressBar progressBar = new ProgressBar(this);
        this.spinner = progressBar;
        progressBar.setIndeterminate(true);
        ProgressBar progressBar2 = this.spinner;
        int i = SplashArt.L;
        progressBar2.setIndeterminateTintList(ColorStateList.valueOf(i));
        this.spinner.setVisibility(8);
        int iG = k1.g(this, 20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iG, iG);
        layoutParams.rightMargin = k1.g(this, 10.0f);
        linearLayout.addView(this.spinner, layoutParams);
        TextView textView = new TextView(this);
        this.check = textView;
        textView.setText("✓");
        this.check.setTextColor(i);
        this.check.setTextSize(2, 20.0f);
        this.check.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.rightMargin = k1.g(this, 10.0f);
        linearLayout.addView(this.check, layoutParams2);
        TextView textView2 = new TextView(this);
        this.button = textView2;
        textView2.setText(BTN_IDLE);
        this.button.setTextColor(i);
        this.button.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        this.button.setTextSize(2, 17.0f);
        linearLayout.addView(this.button);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, k1.g(this, 60.0f));
        layoutParams3.topMargin = k1.g(this, 16.0f);
        frameLayout.setLayoutParams(layoutParams3);
        return frameLayout;
    }

    private View buildBuyBlock() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        View view = new View(this);
        view.setBackgroundColor(HAIRLINE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, Math.max(1, k1.g(this, 1.0f) / 2));
        layoutParams.topMargin = k1.g(this, 40.0f);
        layoutParams.bottomMargin = k1.g(this, 18.0f);
        linearLayout.addView(view, layoutParams);
        TextView textView = new TextView(this);
        textView.setText("Chưa có key?");
        textView.setTextColor(MUTED);
        textView.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText("Mua key trên website  ↗");
        textView2.setTextColor(SplashArt.N);
        textView2.setTextSize(2, 16.0f);
        textView2.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(k1.g(this, 16.0f));
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(Math.max(1, k1.g(this, 1.0f)), SOFT_BORDER);
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new o(this, 1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, k1.g(this, 56.0f));
        layoutParams2.topMargin = k1.g(this, KEY_LENGTH);
        linearLayout.addView(textView2, layoutParams2);
        linearLayout.setLayoutParams(matchTop(0));
        return linearLayout;
    }

    private View buildForm() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(buildKeyField());
        TextView textView = new TextView(this);
        this.helper = textView;
        textView.setText(HELP_IDLE);
        this.helper.setTextColor(MUTED);
        this.helper.setTextSize(2, 13.0f);
        this.helper.setGravity(17);
        linearLayout.addView(this.helper, marginTop(12));
        linearLayout.addView(buildButton());
        linearLayout.setLayoutParams(matchTop(28));
        return linearLayout;
    }

    private View buildGlyph() {
        this.glyph = new SplashArt(this);
        int iG = k1.g(this, this.manNgang ? 120.0f : 150.0f);
        this.glyph.setLayoutParams(new LinearLayout.LayoutParams(iG, iG));
        return this.glyph;
    }

    private View buildKeyField() {
        FrameLayout frameLayout = new FrameLayout(this);
        int iG = k1.g(this, 64.0f);
        View view = new View(this);
        this.fieldBorder = view;
        view.setBackground(borderFor(SOFT_BORDER));
        frameLayout.addView(this.fieldBorder, new FrameLayout.LayoutParams(-1, iG));
        EditText editText = new EditText(this);
        this.field = editText;
        editText.setHint("CS-XXXX-XXXX");
        this.field.setHintTextColor(SOFT_BORDER);
        this.field.setTextColor(SplashArt.N);
        this.field.setTextSize(2, 19.0f);
        this.field.setInputType(145);
        this.field.setTypeface(Typeface.MONOSPACE);
        this.field.setLetterSpacing(0.12f);
        this.field.setSingleLine(true);
        this.field.setGravity(17);
        this.field.setImeOptions(6);
        int i = 0;
        this.field.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.field.setBackground(null);
        this.field.addTextChangedListener(new m(this, i));
        this.field.setOnEditorActionListener(new n(this, i));
        frameLayout.addView(this.field, new FrameLayout.LayoutParams(-1, iG));
        int iG2 = k1.g(this, 3.0f);
        int iG3 = k1.g(this, 20.0f);
        View view2 = new View(this);
        this.progressTrack = view2;
        view2.setBackground(k1.t(TRACK, iG2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iG2);
        layoutParams.topMargin = iG - k1.g(this, 14.0f);
        layoutParams.leftMargin = iG3;
        layoutParams.rightMargin = iG3;
        frameLayout.addView(this.progressTrack, layoutParams);
        View view3 = new View(this);
        this.progressFill = view3;
        view3.setBackground(k1.t(SplashArt.M, iG2));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, iG2);
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.leftMargin = iG3;
        frameLayout.addView(this.progressFill, layoutParams2);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.fieldBox = frameLayout;
        return frameLayout;
    }

    private View buildOneColumn() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int iG = k1.g(this, 32.0f);
        linearLayout.setPadding(iG, k1.g(this, 56.0f), iG, k1.g(this, 32.0f));
        linearLayout.addView(buildGlyph());
        View viewBuildTitle = buildTitle();
        this.titleBlock = viewBuildTitle;
        linearLayout.addView(viewBuildTitle);
        View viewBuildForm = buildForm();
        this.formBlock = viewBuildForm;
        linearLayout.addView(viewBuildForm);
        View viewBuildBuyBlock = buildBuyBlock();
        this.buyBlock = viewBuildBuyBlock;
        linearLayout.addView(viewBuildBuyBlock);
        return linearLayout;
    }

    private View buildScreen() {
        View viewBuildTwoColumn = this.manNgang ? buildTwoColumn() : buildOneColumn();
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.addView(viewBuildTwoColumn, new ViewGroup.LayoutParams(-1, -2));
        this.content = scrollView;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(SplashArt.L);
        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
        View viewBuildWelcome = buildWelcome();
        this.welcome = viewBuildWelcome;
        frameLayout.addView(viewBuildWelcome, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private View buildTitle() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.app_name));
        textView.setTextColor(SplashArt.N);
        textView.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        textView.setTextSize(2, 32.0f);
        textView.setIncludeFontPadding(true);
        textView.setGravity(17);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        TextView textView2 = new TextView(this);
        textView2.setText("Nhập key kích hoạt để bắt đầu dùng trên xe");
        textView2.setTextColor(MUTED);
        textView2.setTextSize(2, 15.0f);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParamsMarginTop = marginTop(8);
        layoutParamsMarginTop.width = -1;
        linearLayout.addView(textView2, layoutParamsMarginTop);
        linearLayout.setLayoutParams(matchTop(20));
        return linearLayout;
    }

    private View buildTwoColumn() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int iG = k1.g(this, 40.0f);
        linearLayout.setPadding(iG, k1.g(this, 24.0f), iG, k1.g(this, 24.0f));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.addView(buildGlyph());
        View viewBuildTitle = buildTitle();
        this.titleBlock = viewBuildTitle;
        linearLayout2.addView(viewBuildTitle);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(16);
        View viewBuildForm = buildForm();
        this.formBlock = viewBuildForm;
        linearLayout3.addView(viewBuildForm);
        View viewBuildBuyBlock = buildBuyBlock();
        this.buyBlock = viewBuildBuyBlock;
        linearLayout3.addView(viewBuildBuyBlock);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = k1.g(this, 18.0f);
        linearLayout.addView(linearLayout2, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.leftMargin = k1.g(this, 18.0f);
        linearLayout.addView(linearLayout3, layoutParams2);
        return linearLayout;
    }

    private View buildWelcome() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = SplashArt.L;
        linearLayout.setBackgroundColor(i);
        linearLayout.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(this);
        int iG = k1.g(this, 160.0f);
        View view = new View(this);
        view.setBackground(k1.c(SUCCESS_PALE));
        frameLayout.addView(view, new FrameLayout.LayoutParams(iG, iG));
        View view2 = new View(this);
        view2.setBackground(k1.c(SUCCESS));
        int iG2 = k1.g(this, 112.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG2, iG2);
        layoutParams.gravity = 17;
        frameLayout.addView(view2, layoutParams);
        TextView textView = new TextView(this);
        textView.setText("✓");
        textView.setTextColor(i);
        textView.setTextSize(2, 52.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(textView, layoutParams2);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(iG, iG));
        TextView textView2 = new TextView(this);
        textView2.setText("Đã kích hoạt");
        textView2.setTextColor(-15066598);
        textView2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        textView2.setTextSize(2, 28.0f);
        linearLayout.addView(textView2, marginTop(16));
        TextView textView3 = new TextView(this);
        textView3.setText("Kết nối xe hoặc dùng ngay trên máy này");
        textView3.setTextColor(MUTED);
        textView3.setTextSize(2, 15.0f);
        linearLayout.addView(textView3, marginTop(6));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drive(long j) {
        SplashArt splashArt = this.glyph;
        splashArt.k = ((j % 420) / 420.0f) * 360.0f;
        float f = j;
        splashArt.l = Math.min(1.0f, f / 160.0f);
        this.glyph.p = Math.min(0.5f, (f / 200.0f) * 0.5f);
        this.glyph.o = ((-(j % 550)) / 550.0f) * 68.0f;
        float fPingPong = pingPong(j, 250L);
        SplashArt splashArt2 = this.glyph;
        splashArt2.m = (-3.4f) * fPingPong;
        splashArt2.n = fPingPong - 0.5f;
        splashArt2.invalidate();
    }

    private static String errorText(String str) {
        return "key_not_found".equals(str) ? "Key không đúng" : "key_bound_other_device".equals(str) ? "Key đã dùng trên máy khác" : "key_expired".equals(str) ? "Key đã hết hạn" : "key_revoked".equals(str) ? "Key đã bị thu hồi" : "key_suspended".equals(str) ? "Key đang bị tạm khoá — liên hệ hỗ trợ" : "device_has_key".equals(str) ? "Máy này đang dùng một key khác" : "rate_limited".equals(str) ? "Thử quá nhiều lần, chờ ít phút" : "offline".equals(str) ? "Không có mạng. Kiểm tra kết nối rồi thử lại" : "Không kích hoạt được, thử lại sau";
    }

    private LinearLayout.LayoutParams marginTop(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = k1.g(this, i);
        return layoutParams;
    }

    private LinearLayout.LayoutParams matchTop(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = k1.g(this, i);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openApp() {
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openBuyPage() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://carstream.tech/mua-key")));
        } catch (Exception e) {
            String.valueOf(e);
        }
    }

    private static float pingPong(long j, long j2) {
        long j3 = j % (2 * j2);
        float f = j3 / j2;
        return j3 < j2 ? f : 2.0f - f;
    }

    private void playEnter() {
        riseIn(this.glyph, 40L, 620L, new OvershootInterpolator(1.1f), true);
        riseIn(this.titleBlock, 150L, 500L, new DecelerateInterpolator(), false);
        riseIn(this.formBlock, 260L, 500L, new DecelerateInterpolator(), false);
        riseIn(this.buyBlock, 370L, 500L, new DecelerateInterpolator(), false);
        this.main.postDelayed(new j(this, 2), 700L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pokeDriving() {
        this.main.removeCallbacks(this.stopDriving);
        this.main.postDelayed(this.stopDriving, DRIVE_IDLE_MS);
        if (this.driveClock != null) {
            return;
        }
        this.driveStart = SystemClock.uptimeMillis();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.driveClock = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(420L);
        this.driveClock.setRepeatCount(-1);
        this.driveClock.setInterpolator(null);
        this.driveClock.addUpdateListener(new g(this, 0));
        this.driveClock.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(p pVar) {
        int i;
        String str;
        String str2;
        this.state = pVar;
        int iOrdinal = pVar.ordinal();
        int i2 = SUCCESS;
        if (iOrdinal == 1) {
            i = SplashArt.M;
            str = "Đang kiểm tra key…";
            str2 = "Đang kiểm tra…";
        } else if (iOrdinal == 2) {
            str = "Key không hợp lệ hoặc đã hết hạn";
            str2 = "Thử lại";
            i = ERROR;
        } else if (iOrdinal != 3) {
            str = HELP_IDLE;
            str2 = BTN_IDLE;
            i = SOFT_BORDER;
        } else {
            str = "Kích hoạt thành công — đang mở app";
            str2 = "Vào app";
            i = SUCCESS;
        }
        this.helper.setText(str);
        this.helper.setTextColor(pVar == p.a ? MUTED : i);
        this.fieldBorder.setBackground(borderFor(i));
        View view = this.progressFill;
        p pVar2 = p.c;
        view.setBackground(k1.t(pVar == pVar2 ? ERROR : SplashArt.M, k1.g(this, 3.0f)));
        this.button.setText(str2);
        View view2 = this.buttonBox;
        p pVar3 = p.d;
        if (pVar != pVar3) {
            i2 = pVar == pVar2 ? ERROR : SplashArt.M;
        }
        k1.B(view2, i2, false, k1.g(this, 16.0f));
        ProgressBar progressBar = this.spinner;
        p pVar4 = p.b;
        progressBar.setVisibility(pVar == pVar4 ? 0 : 8);
        this.check.setVisibility(pVar == pVar3 ? 0 : 8);
        this.field.setEnabled((pVar == pVar4 || pVar == pVar3) ? false : true);
        if (pVar == pVar2) {
            shake();
        }
        if (pVar == pVar3) {
            this.check.setScaleX(0.4f);
            this.check.setScaleY(0.4f);
            this.check.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setInterpolator(new OvershootInterpolator(2.2f)).start();
            this.main.postDelayed(new j(this, 0), WELCOME_DELAY_MS);
        }
    }

    private void riseIn(View view, long j, long j2, TimeInterpolator timeInterpolator, boolean z) {
        view.setAlpha(0.0f);
        if (z) {
            view.setScaleX(0.88f);
            view.setScaleY(0.88f);
        } else {
            view.setTranslationY(k1.g(this, 16.0f));
        }
        view.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(j).setDuration(j2).setInterpolator(timeInterpolator).start();
    }

    private void shake() {
        float fG = k1.g(this, 8.0f);
        View view = this.fieldBox;
        view.animate().translationX(-fG).setDuration(80L).withEndAction(new k(view, fG)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWelcome() {
        this.content.animate().alpha(0.0f).scaleX(0.94f).scaleY(0.94f).setDuration(420L).start();
        this.welcome.setAlpha(0.0f);
        this.welcome.setTranslationY(k1.g(this, 26.0f));
        this.welcome.setVisibility(0);
        this.welcome.animate().alpha(1.0f).translationY(0.0f).setDuration(550L).setInterpolator(new DecelerateInterpolator()).start();
        this.main.postDelayed(new j(this, 1), ENTER_DELAY_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBreathing() {
        this.glyph.animate().translationY(-k1.g(this, 7.0f)).setDuration(2750L).withEndAction(new j(this, 3)).start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2800L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new g(this, 2));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void submit() throws JSONException {
        p pVar = this.state;
        p pVar2 = p.b;
        if (pVar == pVar2) {
            return;
        }
        if (pVar == p.d) {
            openApp();
            return;
        }
        String string = this.field.getText().toString();
        if (string.trim().isEmpty()) {
            render(p.c);
            this.helper.setText("Chưa nhập key");
            return;
        }
        render(pVar2);
        i iVar = new i(this, SystemClock.uptimeMillis());
        String str = a6.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", string);
            jSONObject.put("hwid", c5.c());
            jSONObject.put("hw", a6.d());
            jSONObject.put("device", a6.b(this));
            JSONObject jSONObjectL = w1.l(this);
            if (jSONObjectL != null) {
                jSONObject.put("loc", jSONObjectL);
            }
            a6.b.execute(new s5(xc.b("ZAwo7D/sVohw/D8f"), jSONObject, this, new u2(this, string, iVar)));
        } catch (Exception unused) {
            a6.c.post(new f(iVar, 24));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress(int i) {
        View view = this.progressTrack;
        if (view == null || view.getWidth() == 0) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.progressFill.getWidth(), (int) (Math.min(1.0f, i / KEY_LENGTH) * this.progressTrack.getWidth()));
        valueAnimatorOfInt.setDuration(280L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new g(this, 1));
        valueAnimatorOfInt.start();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        EditText editText;
        super.onCreate(bundle);
        boolean zNamNgang = ModeActivity.namNgang(this);
        boolean z = false;
        if (ec.l(this) || zNamNgang) {
            try {
                setRequestedOrientation(0);
            } catch (Throwable unused) {
            }
            z = true;
        }
        this.manNgang = z;
        if (ec.j(this)) {
            openApp();
            return;
        }
        z6.b(this.aaListener);
        setContentView(buildScreen());
        if (bundle != null && (editText = this.field) != null) {
            editText.setText(bundle.getString(STATE_KEY, ""));
            EditText editText2 = this.field;
            editText2.setSelection(editText2.getText().length());
        }
        SplashView.c(this);
        playEnter();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        z6.j.remove(this.aaListener);
        if (isFinishing() && !this.navigating) {
            ModeActivity.quenLuaChon();
            z6.p();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.navigating = false;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        EditText editText = this.field;
        if (editText != null) {
            bundle.putString(STATE_KEY, editText.getText().toString());
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (intent != null && intent.getComponent() != null && getPackageName().equals(intent.getComponent().getPackageName())) {
            this.navigating = true;
        }
        super.startActivity(intent);
    }
}
