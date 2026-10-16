package com.waze.gw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.waze.strings.DisplayStrings;

/* loaded from: classes10.dex */
final class ModReport {
    private static final long SUBMISSION_DELAY_MS = 10000;
    private static final int[] PRESETS = {30, 40, 50, 60, 70, 80, 90, 100, 120};
    private static final String[][] ISSUES = {new String[]{"bigpin_dummy_camera", "Không có camera này ở đây", "Không có camera này ở đây [báo tự động]"}, new String[]{"no_passing_in", "Cấm vượt", "Đoạn cấm vượt chưa có trên bản đồ. [báo tự động]"}, new String[]{"no_passing_out", "Hết cấm vượt", "Ở đây có biển hết cấm vượt [báo tự động]"}, new String[]{"end_of_previous_prohibitions", "Hết mọi lệnh cấm", "Ở đây có bảng hết mọi lệnh cấm [báo tự động]"}, new String[]{"residential_area_start", "Bắt đầu khu đông dân cư", "Chỗ này có biển Bắt đầu Khu đông dân cư [Báo tự động]"}, new String[]{"residential_area_end", "Kết thúc khu đông dân cư", "Chỗ này có biển Kết thúc Khu đông dân cư [Báo tự động]"}};
    private static final String[][] TURNS = {new String[]{"no_left_turn", "Cấm rẽ trái", "Vị trí này cấm rẽ trái. [báo tự động]"}, new String[]{"no_right_turn", "Cấm rẽ phải", "Vị trí này cấm rẽ phải. [báo tự động]"}, new String[]{"no_u_turn", "Cấm quay đầu", "Vị trí này cấm quay đầu (U-turn). [báo tự động]"}, new String[]{"no_left_and_u_turn", "Cấm rẽ trái & quay đầu", "Vị trí này cấm rẽ trái và quay đầu. [báo tự động]"}, new String[]{"no_right_and_u_turn", "Cấm rẽ phải & quay đầu", "Vị trí này cấm rẽ phải và quay đầu. [báo tự động]"}};
    private static final String[][] CAMERAS = {new String[]{"bigpin_red_light_and_speed_camera", "Camera phạt nguội", "Thiếu camera phạt nguội tại đây. [báo tự động]"}, new String[]{"bigpin_speed_camera", "Camera bắn tốc độ", "Thiếu camera bắn tốc độ tại đây. [báo tự động]"}, new String[]{"bigpin_red_light_camera", "Camera đèn đỏ", "Thiếu camera đèn đỏ tại đây. [báo tự động]"}};

    ModReport() {
    }

    private static final class PendingSubmission {
        ValueAnimator animator;
        boolean cancelled;
        final Runnable submit;

        PendingSubmission(Runnable runnable) {
            this.submit = runnable;
        }

        void cancel() {
            this.cancelled = true;
            if (this.animator != null) {
                this.animator.cancel();
            }
        }
    }

    static boolean submitNativeItem(String str) throws NumberFormatException {
        int i2;
        String[][] strArr;
        if (str == null) {
            return false;
        }
        if (str.startsWith("gw_mod:speed:")) {
            try {
                int i3 = Integer.parseInt(str.substring("gw_mod:speed:".length()));
                for (int i4 : PRESETS) {
                    if (i4 == i3) {
                        Gateway.reportWrongSpeed(i3);
                        return true;
                    }
                }
            } catch (NumberFormatException e2) {
            }
            return false;
        }
        if ("gw_mod:turn:left".equals(str)) {
            strArr = TURNS;
            i2 = 0;
        } else if ("gw_mod:turn:right".equals(str)) {
            strArr = TURNS;
            i2 = 1;
        } else if ("gw_mod:turn:u".equals(str)) {
            strArr = TURNS;
            i2 = 2;
        } else {
            i2 = 3;
            if ("gw_mod:turn:left_u".equals(str)) {
                strArr = TURNS;
            } else if ("gw_mod:turn:right_u".equals(str)) {
                strArr = TURNS;
                i2 = 4;
            } else if ("gw_mod:camera:combined".equals(str)) {
                strArr = CAMERAS;
                i2 = 0;
            } else if ("gw_mod:camera:speed".equals(str)) {
                strArr = CAMERAS;
                i2 = 1;
            } else if ("gw_mod:camera:red_light".equals(str)) {
                strArr = CAMERAS;
                i2 = 2;
            } else if ("gw_mod:no_camera_here".equals(str)) {
                strArr = ISSUES;
                i2 = 0;
            } else if ("gw_mod:no_passing".equals(str)) {
                strArr = ISSUES;
                i2 = 1;
            } else if ("gw_mod:end_no_passing".equals(str)) {
                strArr = ISSUES;
                i2 = 2;
            } else if ("gw_mod:end_prohibitions".equals(str)) {
                strArr = ISSUES;
            } else if ("gw_mod:residential_start".equals(str)) {
                strArr = ISSUES;
                i2 = 4;
            } else if ("gw_mod:residential_end".equals(str)) {
                strArr = ISSUES;
                i2 = 5;
            } else {
                strArr = null;
                i2 = -1;
            }
        }
        if (strArr == null || i2 < 0 || i2 >= strArr.length) {
            return false;
        }
        Gateway.reportIssue(strArr[i2][1], strArr[i2][2]);
        return true;
    }

    static void attach(FrameLayout frameLayout, boolean z) {
        try {
            if (frameLayout.findViewWithTag("mod_report_scrim") != null) {
                return;
            }
            Context context = frameLayout.getContext();
            float f2 = context.getResources().getDisplayMetrics().density;
            final FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setTag("mod_report_scrim");
            frameLayout2.setVisibility(8);
            frameLayout2.setBackgroundColor(-1728053248);
            frameLayout2.setClickable(true);
            final LinearLayout linearLayoutBuildSheet = buildSheet(context, f2, frameLayout2);
            linearLayoutBuildSheet.setClickable(true);
            frameLayout2.addView(linearLayoutBuildSheet, new FrameLayout.LayoutParams(-1, -2, 80));
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModReport.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ModReport.dismiss(frameLayout2, linearLayoutBuildSheet);
                }
            });
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (z) {
                TextView textView = new TextView(context);
                textView.setTag("mod_report");
                textView.setText("⚠");
                textView.setTextColor(-1);
                textView.setTextSize(z ? 20.0f : 30.0f);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setGravity(17);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(AmbientTheme.withAlpha(AmbientTheme.color(context), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5));
                gradientDrawable.setStroke((int) (2.0f * f2), 1728053247);
                textView.setBackground(gradientDrawable);
                textView.setElevation(6.0f * f2);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModReport.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (frameLayout2.getVisibility() != 0) {
                            ModReport.showMain(linearLayoutBuildSheet);
                            ModReport.reveal(frameLayout2, linearLayoutBuildSheet);
                        } else {
                            ModReport.dismiss(frameLayout2, linearLayoutBuildSheet);
                        }
                    }
                });
                int i2 = (int) ((z ? 46 : 66) * f2);
                int i3 = (int) (12.0f * f2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
                if (z) {
                    layoutParams.gravity = 8388693;
                    layoutParams.rightMargin = i3;
                    layoutParams.bottomMargin = (int) (f2 * 14.0f);
                } else {
                    layoutParams.gravity = 8388693;
                    layoutParams.rightMargin = i3;
                    layoutParams.bottomMargin = (int) (f2 * 220.0f);
                }
                frameLayout.addView(textView, layoutParams);
            }
        } catch (Throwable th) {
        }
    }

    static void openFromReportMenu(FrameLayout frameLayout, String str) {
        if (frameLayout == null || str == null) {
            return;
        }
        try {
            attach(frameLayout, false);
            View viewFindViewWithTag = frameLayout.findViewWithTag("mod_report_scrim");
            if (viewFindViewWithTag instanceof FrameLayout) {
                FrameLayout frameLayout2 = (FrameLayout) viewFindViewWithTag;
                View childAt = frameLayout2.getChildCount() > 0 ? frameLayout2.getChildAt(0) : null;
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if ("gw_mod:wrong_speed".equals(str)) {
                        showSpeed(linearLayout);
                    } else if ("gw_mod:turn".equals(str)) {
                        showTurn(linearLayout);
                    } else if ("gw_mod:camera".equals(str)) {
                        showCamera(linearLayout);
                    } else if ("gw_mod:no_camera_here".equals(str)) {
                        showDirectIssue(frameLayout.getContext(), frameLayout2, linearLayout, ISSUES[0]);
                    } else if ("gw_mod:no_passing".equals(str)) {
                        showDirectIssue(frameLayout.getContext(), frameLayout2, linearLayout, ISSUES[1]);
                    } else if ("gw_mod:end_no_passing".equals(str)) {
                        showDirectIssue(frameLayout.getContext(), frameLayout2, linearLayout, ISSUES[2]);
                    } else if ("gw_mod:end_prohibitions".equals(str)) {
                        showDirectIssue(frameLayout.getContext(), frameLayout2, linearLayout, ISSUES[3]);
                    } else if ("gw_mod:residential_start".equals(str)) {
                        showDirectIssue(frameLayout.getContext(), frameLayout2, linearLayout, ISSUES[4]);
                    } else if ("gw_mod:residential_end".equals(str)) {
                        showDirectIssue(frameLayout.getContext(), frameLayout2, linearLayout, ISSUES[5]);
                    } else {
                        return;
                    }
                    reveal(frameLayout2, linearLayout);
                }
            }
        } catch (Throwable th) {
        }
    }

    private static void showDirectIssue(Context context, FrameLayout frameLayout, LinearLayout linearLayout, final String[] strArr) {
        showConfirmation(context, context.getResources().getDisplayMetrics().density, frameLayout, linearLayout, strArr[0], -1, "Báo cáo: " + strArr[1] + "\n" + strArr[2], new Runnable() { // from class: com.waze.gw.ModReport.3
            @Override // java.lang.Runnable
            public void run() {
                Gateway.reportIssue(strArr[1], strArr[2]);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reveal(FrameLayout frameLayout, final View view) {
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(0);
        frameLayout.animate().alpha(1.0f).setDuration(200L).start();
        view.post(new Runnable() { // from class: com.waze.gw.ModReport.4
            @Override // java.lang.Runnable
            public void run() {
                int height = view.getHeight();
                View view2 = view;
                if (height <= 0) {
                    height = view.getResources().getDisplayMetrics().heightPixels;
                }
                view2.setTranslationY(height);
                view.animate().translationY(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(1.6f)).start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dismiss(final FrameLayout frameLayout, View view) {
        if (frameLayout.getVisibility() != 0) {
            return;
        }
        cancelPending(view);
        int height = view.getHeight();
        view.animate().translationY(height > 0 ? height : 1200.0f).setDuration(220L).setInterpolator(new AccelerateInterpolator(1.2f)).start();
        frameLayout.animate().alpha(0.0f).setDuration(220L).withEndAction(new Runnable() { // from class: com.waze.gw.ModReport.5
            @Override // java.lang.Runnable
            public void run() {
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(1.0f);
            }
        }).start();
    }

    private static void show(LinearLayout linearLayout, String str) {
        String[] strArr = {"panel_main", "panel_speed", "panel_turn", "panel_camera", "panel_confirm"};
        for (int i2 = 0; i2 < 5; i2++) {
            String str2 = strArr[i2];
            View viewFindViewWithTag = linearLayout.findViewWithTag(str2);
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag.setVisibility(str2.equals(str) ? 0 : 8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showMain(LinearLayout linearLayout) {
        show(linearLayout, "panel_main");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showSpeed(LinearLayout linearLayout) {
        show(linearLayout, "panel_speed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showTurn(LinearLayout linearLayout) {
        show(linearLayout, "panel_turn");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showCamera(LinearLayout linearLayout) {
        show(linearLayout, "panel_camera");
    }

    private static LinearLayout buildSheet(Context context, float f2, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int i2 = (int) (18.0f * f2);
        linearLayout.setPadding(i2, (int) (10.0f * f2), i2, (int) (22.0f * f2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-183036126);
        float f3 = 26.0f * f2;
        gradientDrawable.setCornerRadii(new float[]{f3, f3, f3, f3, 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setElevation(16.0f * f2);
        View view = new View(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(1308622847);
        gradientDrawable2.setCornerRadius(3.0f * f2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (42.0f * f2), (int) (5.0f * f2));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = (int) (12.0f * f2);
        view.setBackground(gradientDrawable2);
        linearLayout.addView(view, layoutParams);
        linearLayout.addView(buildMainPanel(context, f2, frameLayout, linearLayout));
        linearLayout.addView(buildSpeedPanel(context, f2, frameLayout, linearLayout));
        linearLayout.addView(buildListPanel(context, f2, frameLayout, linearLayout, "panel_turn", "Cấm rẽ / quay đầu", "Chọn loại biển cấm", TURNS));
        linearLayout.addView(buildListPanel(context, f2, frameLayout, linearLayout, "panel_camera", "Thiếu camera", "Chọn loại camera", CAMERAS));
        linearLayout.addView(buildConfirmationPanel(context, f2));
        return linearLayout;
    }

    private static LinearLayout buildMainPanel(final Context context, final float f2, final FrameLayout frameLayout, LinearLayout linearLayout) {
        final LinearLayout linearLayout2 = linearLayout;
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setTag("panel_main");
        linearLayout3.setOrientation(1);
        linearLayout3.addView(header(context, f2, "Báo lỗi cho Waze", "Gửi cho biên tập viên sửa bản đồ"));
        linearLayout3.addView(issueRow(context, f2, "⚠", "Sai tốc độ giới hạn", new View.OnClickListener() { // from class: com.waze.gw.ModReport.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModReport.showSpeed(linearLayout2);
            }
        }), rowLp(f2));
        linearLayout3.addView(issueRow(context, f2, "no_left_turn", "Cấm rẽ / quay đầu", new View.OnClickListener() { // from class: com.waze.gw.ModReport.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModReport.showTurn(linearLayout2);
            }
        }), rowLp(f2));
        linearLayout3.addView(issueRow(context, f2, "bigpin_speed_camera", "Thiếu camera", new View.OnClickListener() { // from class: com.waze.gw.ModReport.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModReport.showCamera(linearLayout2);
            }
        }), rowLp(f2));
        String[][] strArr = ISSUES;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            final String[] strArr2 = strArr[i2];
            linearLayout3.addView(issueRow(context, f2, strArr2[0], strArr2[1], new View.OnClickListener() { // from class: com.waze.gw.ModReport.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Context context2 = context;
                    float f3 = f2;
                    FrameLayout frameLayout2 = frameLayout;
                    LinearLayout linearLayout4 = linearLayout2;
                    String str = strArr2[0];
                    String str2 = "Báo cáo: " + strArr2[1] + "\n" + strArr2[2];
                    final String[] strArr3 = strArr2;
                    ModReport.showConfirmation(context2, f3, frameLayout2, linearLayout4, str, -1, str2, new Runnable(this) { // from class: com.waze.gw.ModReport.9.1
                        final /* synthetic */ AnonymousClass9 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            Gateway.reportIssue(strArr3[1], strArr3[2]);
                        }
                    });
                }
            }), rowLp(f2));
            i2++;
            linearLayout2 = linearLayout;
        }
        linearLayout3.addView(closeBtn(context, f2, frameLayout, linearLayout));
        return linearLayout3;
    }

    private static View issueRow(Context context, float f2, String str, String str2, final View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        float f3 = 14.0f * f2;
        int i2 = (int) f3;
        int i3 = (int) (10.0f * f2);
        linearLayout.setPadding(i2, i3, i2, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(352321535);
        gradientDrawable.setCornerRadius(f3);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setClickable(true);
        int i4 = (int) (38.0f * f2);
        Bitmap bitmapPin = Signs.pin(context, str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
        layoutParams.rightMargin = (int) (f2 * 12.0f);
        if (bitmapPin != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmapPin);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            linearLayout.addView(imageView, layoutParams);
        } else {
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(22.0f);
            textView.setGravity(17);
            linearLayout.addView(textView, layoutParams);
        }
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextColor(-1);
        textView2.setTextSize(16.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView3 = new TextView(context);
        textView3.setText("›");
        textView3.setTextColor(-7696488);
        textView3.setTextSize(22.0f);
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModReport.10
            @Override // android.view.View.OnClickListener
            public void onClick(final View view) {
                ViewPropertyAnimator duration = view.animate().alpha(0.5f).setDuration(80L);
                final View.OnClickListener onClickListener2 = onClickListener;
                duration.withEndAction(new Runnable(this) { // from class: com.waze.gw.ModReport.10.1
                    final /* synthetic */ AnonymousClass10 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        view.setAlpha(1.0f);
                        onClickListener2.onClick(view);
                    }
                }).start();
            }
        });
        return linearLayout;
    }

    private static LinearLayout buildSpeedPanel(Context context, float f2, FrameLayout frameLayout, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setTag("panel_speed");
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        linearLayout2.addView(backHeader(context, f2, linearLayout, "Báo sai tốc độ", "Chọn tốc độ đúng (km/h)"));
        boolean z = context.getResources().getConfiguration().orientation == 1;
        int i2 = z ? 3 : 4;
        int i3 = (int) ((z ? 84 : 92) * f2);
        LinearLayout linearLayout3 = null;
        int i4 = 0;
        while (i4 < PRESETS.length) {
            if (i4 % i2 == 0) {
                linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                linearLayout3.setGravity(17);
                LinearLayout.LayoutParams layoutParamsWrap = wrap(1);
                layoutParamsWrap.topMargin = (int) (14.0f * f2);
                linearLayout2.addView(linearLayout3, layoutParamsWrap);
            }
            Context context2 = context;
            linearLayout3.addView(speedBtn(context2, f2, i3, PRESETS[i4], frameLayout, linearLayout));
            i4++;
            context = context2;
        }
        linearLayout2.addView(closeBtn(context, f2, frameLayout, linearLayout));
        return linearLayout2;
    }

    private static LinearLayout buildListPanel(final Context context, final float f2, final FrameLayout frameLayout, LinearLayout linearLayout, String str, String str2, String str3, String[][] strArr) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setTag(str);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        final LinearLayout linearLayout3 = linearLayout;
        linearLayout2.addView(backHeader(context, f2, linearLayout3, str2, str3));
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            final String[] strArr2 = strArr[i2];
            linearLayout2.addView(issueRow(context, f2, strArr2[0], strArr2[1], new View.OnClickListener() { // from class: com.waze.gw.ModReport.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Context context2 = context;
                    float f3 = f2;
                    FrameLayout frameLayout2 = frameLayout;
                    LinearLayout linearLayout4 = linearLayout3;
                    String str4 = strArr2[0];
                    String str5 = "Báo cáo: " + strArr2[1] + "\n" + strArr2[2];
                    final String[] strArr3 = strArr2;
                    ModReport.showConfirmation(context2, f3, frameLayout2, linearLayout4, str4, -1, str5, new Runnable(this) { // from class: com.waze.gw.ModReport.11.1
                        final /* synthetic */ AnonymousClass11 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            Gateway.reportIssue(strArr3[1], strArr3[2]);
                        }
                    });
                }
            }), rowLp(f2));
            i2++;
            linearLayout3 = linearLayout;
        }
        linearLayout2.addView(closeBtn(context, f2, frameLayout, linearLayout));
        return linearLayout2;
    }

    private static View backHeader(Context context, float f2, final LinearLayout linearLayout, String str, String str2) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(context);
        textView.setText("‹");
        textView.setTextColor(-1);
        textView.setTextSize(28.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView.setPadding((int) (4.0f * f2), 0, (int) (14.0f * f2), 0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModReport.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModReport.showMain(linearLayout);
            }
        });
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        TextView textView2 = new TextView(context);
        textView2.setText(str);
        textView2.setTextColor(-1);
        textView2.setTextSize(19.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText(str2);
        textView3.setTextColor(-6643546);
        textView3.setTextSize(13.0f);
        linearLayout3.addView(textView3);
        linearLayout2.addView(linearLayout3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) (f2 * 6.0f);
        linearLayout2.setLayoutParams(layoutParams);
        return linearLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View speedBtn(final Context context, final float f2, int i2, final int i3, final FrameLayout frameLayout, final View view) {
        ImageView imageView;
        int i4 = (int) (10.0f * f2);
        Bitmap bitmapLimit = Signs.limit(context, i3);
        if (bitmapLimit != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap(bitmapLimit);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int i5 = (int) (2.0f * f2);
            imageView2.setPadding(i5, i5, i5, i5);
            imageView = imageView2;
        } else {
            TextView textView = new TextView(context);
            textView.setText(String.valueOf(i3));
            textView.setTextColor(-1);
            textView.setTextSize(20.0f);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(AmbientTheme.color(context));
            gradientDrawable.setCornerRadius(12.0f * f2);
            textView.setBackground(gradientDrawable);
            imageView = textView;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.leftMargin = i4;
        layoutParams.rightMargin = i4;
        imageView.setLayoutParams(layoutParams);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModReport.13
            @Override // android.view.View.OnClickListener
            public void onClick(final View view2) {
                ViewPropertyAnimator duration = view2.animate().scaleX(0.85f).scaleY(0.85f).setDuration(90L);
                final Context context2 = context;
                final float f3 = f2;
                final FrameLayout frameLayout2 = frameLayout;
                final View view3 = view;
                final int i6 = i3;
                duration.withEndAction(new Runnable(this) { // from class: com.waze.gw.ModReport.13.1
                    final /* synthetic */ AnonymousClass13 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        view2.setScaleX(1.0f);
                        view2.setScaleY(1.0f);
                        Context context3 = context2;
                        float f4 = f3;
                        FrameLayout frameLayout3 = frameLayout2;
                        LinearLayout linearLayout = (LinearLayout) view3;
                        int i7 = i6;
                        String str = "Báo cáo: Sai tốc độ - tốc độ đúng " + i6 + " km/h?";
                        final int i8 = i6;
                        ModReport.showConfirmation(context3, f4, frameLayout3, linearLayout, "", i7, str, new Runnable(this) { // from class: com.waze.gw.ModReport.13.1.1
                            final /* synthetic */ AnonymousClass1 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                Gateway.reportWrongSpeed(i8);
                            }
                        });
                    }
                }).start();
            }
        });
        return imageView;
    }

    private static LinearLayout buildConfirmationPanel(Context context, float f2) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("panel_confirm");
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setVisibility(8);
        int i2 = (int) (12.0f * f2);
        int i3 = (int) (2.0f * f2);
        linearLayout.setPadding(i2, (int) (4.0f * f2), i2, i3);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setTag("confirm_icon");
        int i4 = (int) (104.0f * f2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = (int) (f2 * 18.0f);
        linearLayout.addView(frameLayout, layoutParams);
        TextView textView = new TextView(context);
        textView.setTag("confirm_description");
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView.setLineSpacing(0.0f, 1.12f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = (int) (22.0f * f2);
        linearLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        TextView textView2 = new TextView(context);
        textView2.setTag("confirm_cancel");
        textView2.setText("Hủy bỏ");
        textView2.setTextColor(-1);
        textView2.setTextSize(15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(234881023);
        float f3 = 11.0f * f2;
        gradientDrawable.setCornerRadius(f3);
        gradientDrawable.setStroke(Math.max(2, i3), -1);
        textView2.setBackground(gradientDrawable);
        int i5 = (int) (48.0f * f2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, i5, 1.0f);
        int i6 = (int) (f2 * 8.0f);
        layoutParams3.rightMargin = i6;
        linearLayout2.addView(textView2, layoutParams3);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setTag("confirm_submit");
        frameLayout2.setClipToOutline(true);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(234881023);
        gradientDrawable2.setCornerRadius(f3);
        gradientDrawable2.setStroke(Math.max(2, i3), -1);
        frameLayout2.setBackground(gradientDrawable2);
        View view = new View(context);
        view.setTag("confirm_progress");
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setColor(-7222798);
        gradientDrawable3.setCornerRadius(9.0f * f2);
        view.setBackground(gradientDrawable3);
        frameLayout2.addView(view, new FrameLayout.LayoutParams(0, -1, GravityCompat.START));
        TextView textView3 = new TextView(context);
        textView3.setTag("confirm_submit_label");
        textView3.setText("Báo cáo");
        textView3.setTextColor(-1);
        textView3.setTextSize(15.0f);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        textView3.setGravity(17);
        frameLayout2.addView(textView3, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, i5, 1.0f);
        layoutParams4.leftMargin = i6;
        linearLayout2.addView(frameLayout2, layoutParams4);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showConfirmation(Context context, float f2, final FrameLayout frameLayout, final LinearLayout linearLayout, String str, int i2, String str2, Runnable runnable) {
        cancelPending(linearLayout);
        View viewFindViewWithTag = linearLayout.findViewWithTag("panel_confirm");
        if (viewFindViewWithTag instanceof LinearLayout) {
            LinearLayout linearLayout2 = (LinearLayout) viewFindViewWithTag;
            View viewFindViewWithTag2 = linearLayout2.findViewWithTag("confirm_icon");
            View viewFindViewWithTag3 = linearLayout2.findViewWithTag("confirm_description");
            View viewFindViewWithTag4 = linearLayout2.findViewWithTag("confirm_cancel");
            View viewFindViewWithTag5 = linearLayout2.findViewWithTag("confirm_submit");
            final View viewFindViewWithTag6 = linearLayout2.findViewWithTag("confirm_progress");
            View viewFindViewWithTag7 = linearLayout2.findViewWithTag("confirm_submit_label");
            if (!(viewFindViewWithTag2 instanceof FrameLayout) || !(viewFindViewWithTag3 instanceof TextView) || !(viewFindViewWithTag5 instanceof FrameLayout) || !(viewFindViewWithTag7 instanceof TextView) || viewFindViewWithTag6 == null || viewFindViewWithTag4 == null) {
                return;
            }
            FrameLayout frameLayout2 = (FrameLayout) viewFindViewWithTag2;
            frameLayout2.removeAllViews();
            Bitmap bitmapLimit = i2 > 0 ? Signs.limit(context, i2) : Signs.pin(context, str);
            if (bitmapLimit != null) {
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(bitmapLimit);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                frameLayout2.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            } else {
                TextView textView = new TextView(context);
                textView.setText(str);
                textView.setTextColor(-1);
                textView.setTextSize(42.0f);
                textView.setGravity(17);
                frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
            }
            ((TextView) viewFindViewWithTag3).setText(str2);
            final int iMax = Math.max(1, 10);
            final TextView textView2 = (TextView) viewFindViewWithTag7;
            textView2.setText("Báo cáo · " + iMax + CmcdData.STREAMING_FORMAT_SS);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewWithTag6.getLayoutParams();
            layoutParams.width = 0;
            viewFindViewWithTag6.setLayoutParams(layoutParams);
            final PendingSubmission pendingSubmission = new PendingSubmission(runnable);
            linearLayout.setTag(pendingSubmission);
            viewFindViewWithTag4.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModReport.14
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ModReport.cancelPending(linearLayout);
                    ModReport.dismiss(frameLayout, linearLayout);
                }
            });
            show(linearLayout, "panel_confirm");
            final FrameLayout frameLayout3 = (FrameLayout) viewFindViewWithTag5;
            frameLayout3.setContentDescription("Báo cáo sẽ tự gửi sau " + iMax + " giây");
            frameLayout3.post(new Runnable() { // from class: com.waze.gw.ModReport.15
                @Override // java.lang.Runnable
                public void run() {
                    if (pendingSubmission.cancelled || linearLayout.getTag() != pendingSubmission) {
                        return;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pendingSubmission.animator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(10000L);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    final View view = viewFindViewWithTag6;
                    final FrameLayout frameLayout4 = frameLayout3;
                    final int i3 = iMax;
                    final TextView textView3 = textView2;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.waze.gw.ModReport.15.1
                        final /* synthetic */ AnonymousClass15 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                            layoutParams2.width = Math.round(frameLayout4.getWidth() * fFloatValue);
                            view.setLayoutParams(layoutParams2);
                            textView3.setText("Báo cáo · " + Math.max(1, (int) Math.ceil((1.0f - fFloatValue) * i3)) + CmcdData.STREAMING_FORMAT_SS);
                        }
                    });
                    final PendingSubmission pendingSubmission2 = pendingSubmission;
                    final LinearLayout linearLayout3 = linearLayout;
                    final TextView textView4 = textView2;
                    final FrameLayout frameLayout5 = frameLayout;
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter(this) { // from class: com.waze.gw.ModReport.15.2
                        final /* synthetic */ AnonymousClass15 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (pendingSubmission2.cancelled || linearLayout3.getTag() != pendingSubmission2) {
                                return;
                            }
                            linearLayout3.setTag(null);
                            textView4.setText("Đang gửi…");
                            ModReport.dismiss(frameLayout5, linearLayout3);
                            pendingSubmission2.submit.run();
                        }
                    });
                    valueAnimatorOfFloat.start();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cancelPending(View view) {
        Object tag = view.getTag();
        if (tag instanceof PendingSubmission) {
            ((PendingSubmission) tag).cancel();
            view.setTag(null);
        }
    }

    private static View header(Context context, float f2, String str, String str2) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(19.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextColor(-6643546);
        textView2.setTextSize(13.0f);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = (int) (2.0f * f2);
        layoutParams.bottomMargin = (int) (f2 * 8.0f);
        linearLayout.addView(textView2, layoutParams);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    private static TextView closeBtn(Context context, float f2, final FrameLayout frameLayout, final LinearLayout linearLayout) {
        TextView textView = new TextView(context);
        textView.setText("Đóng");
        textView.setTextColor(-2235674);
        textView.setTextSize(16.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        int i2 = (int) (13.0f * f2);
        textView.setPadding(0, i2, 0, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(452984831);
        gradientDrawable.setCornerRadius(14.0f * f2);
        textView.setBackground(gradientDrawable);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModReport.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModReport.dismiss(frameLayout, linearLayout);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) (f2 * 16.0f);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private static LinearLayout.LayoutParams rowLp(float f2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) (f2 * 8.0f);
        return layoutParams;
    }

    private static LinearLayout.LayoutParams wrap(int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i2;
        return layoutParams;
    }
}
