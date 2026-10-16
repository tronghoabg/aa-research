package com.waze.gw;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
final class Bubble {
    private static final int COLOR_BRAND_GLASS = -1089597932;
    private static final int COLOR_BUBBLE_BORDER = -13221288;
    private static final int COLOR_BUBBLE_GLASS = -1089597932;
    private static final int MAX_ALERT_M = 2000;
    private static final String PREFS = "waze_hud_gw";
    private static LinearLayout alertsCol;
    private static ImageView avgImg;
    private static boolean avgShown;
    private static boolean basicLayout;
    private static int bubbleLayout;
    private static float dens;
    private static GpsSignalView gpsSignal;
    private static View lanePanel;
    private static LaneGuidanceStrip laneStrip;
    private static boolean lifecycleReady;
    private static int limitBaseSize;
    private static TextView limitDash;
    private static ImageView limitImg;
    private static FrameLayout limitStack;
    private static WindowManager.LayoutParams lp;
    private static int minimumDiameter;
    private static int minimumLeft;
    private static TextView minimumLimit;
    private static int minimumSafePadding;
    private static boolean minimumShown;
    private static int minimumTop;
    private static TextView navDist;
    private static TextView navExit;
    private static boolean navShown;
    private static TextView navStreet;
    private static boolean navStreetShown;
    private static ImageView navTurn;
    private static LinearLayout navWrap;
    private static ImageView parkingImg;
    private static float scale;
    private static TextView spd;
    private static int startedActivities;
    private static boolean verticalLayout;
    private static View view;
    private static WindowManager wm;
    private static int lastTurn = Integer.MIN_VALUE;
    private static String alertsSig = "";

    /* renamed from: h, reason: collision with root package name */
    private static final Handler f24289h = new Handler(Looper.getMainLooper());
    private static final Runnable resizeR = new Runnable() { // from class: com.waze.gw.Bubble.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (Bubble.view == null) {
                    return;
                }
                Bubble.view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                Bubble.lp.width = Bubble.view.getMeasuredWidth();
                Bubble.lp.height = Bubble.view.getMeasuredHeight();
                boolean zClampPosition = Bubble.clampPosition();
                Bubble.wm.updateViewLayout(Bubble.view, Bubble.lp);
                if (zClampPosition) {
                    Bubble.savePosition(Bubble.view.getContext());
                }
            } catch (Throwable th) {
            }
        }
    };
    private static final Runnable tick = new Runnable() { // from class: com.waze.gw.Bubble.3
        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmapPin;
            int iMax;
            int iMax2;
            try {
                Context context = Bubble.view.getContext();
                int i2 = Gateway.hudSpeed;
                int i3 = Gateway.hudLimit;
                ModTypeface.fitSpeed(Bubble.spd, i2, (Bubble.verticalLayout ? 29.0f : 30.0f) * Bubble.scale, (Bubble.verticalLayout ? 24.0f : 25.0f) * Bubble.scale);
                Bubble.spd.setText(String.valueOf(i2 >= 0 ? i2 : 0));
                Bubble.spd.setTextColor((i3 < 10 || i2 <= i3) ? -1 : -45747);
                if (Bubble.gpsSignal != null) {
                    Bubble.gpsSignal.setLevel(Gateway.gpsSignalLevel());
                }
                Bitmap bitmapLimit = Signs.limit(context, i3);
                if (bitmapLimit != null) {
                    Bubble.limitImg.setImageBitmap(bitmapLimit);
                    Bubble.limitImg.setVisibility(0);
                    Bubble.limitDash.setVisibility(8);
                } else {
                    Bubble.limitDash.setVisibility(0);
                    Bubble.limitImg.setVisibility(8);
                }
                int i4 = Gateway.minimumSpeedLimit;
                boolean z = i4 >= 10 && i4 <= 160;
                if (z) {
                    ModTypeface.fitSpeed(Bubble.minimumLimit, i4, Bubble.scale * 18.0f, Bubble.scale * 15.0f);
                    Bubble.minimumLimit.setText(String.valueOf(i4));
                }
                Bubble.minimumLimit.setVisibility(z ? 0 : 8);
                if (z != Bubble.minimumShown) {
                    Bubble.minimumShown = z;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) Bubble.limitStack.getLayoutParams();
                    if (z) {
                        iMax = Math.max(Bubble.limitBaseSize, Bubble.minimumLeft + Bubble.minimumDiameter + Bubble.minimumSafePadding);
                    } else {
                        iMax = Bubble.limitBaseSize;
                    }
                    layoutParams.width = iMax;
                    if (z) {
                        iMax2 = Math.max(Bubble.limitBaseSize, Bubble.minimumTop + Bubble.minimumDiameter + Bubble.minimumSafePadding);
                    } else {
                        iMax2 = Bubble.limitBaseSize;
                    }
                    layoutParams.height = iMax2;
                    Bubble.limitStack.setLayoutParams(layoutParams);
                    Bubble.view.post(Bubble.resizeR);
                }
                boolean snapshot = Bubble.laneStrip.setSnapshot(Gateway.hudLanes);
                if (Bubble.lanePanel != null) {
                    int i5 = Gateway.hudLanes.size() > 0 ? 0 : 8;
                    if (Bubble.lanePanel.getVisibility() != i5) {
                        Bubble.lanePanel.setVisibility(i5);
                        snapshot = true;
                    }
                }
                if (snapshot) {
                    Bubble.view.post(Bubble.resizeR);
                }
                int i6 = Gateway.hudTurn;
                boolean z2 = i6 >= 1;
                if (z2) {
                    if (i6 != Bubble.lastTurn) {
                        Bubble.lastTurn = i6;
                        int iTurnDrawable = Bubble.turnDrawable(context, i6);
                        if (iTurnDrawable != 0) {
                            Bubble.navTurn.setImageResource(iTurnDrawable);
                        } else {
                            Bubble.navTurn.setImageDrawable(null);
                        }
                        Bubble.applyNavTint(i6);
                    }
                    Bubble.navDist.setText(Bubble.fmtTurnDist(Gateway.hudTurnDist));
                    String strTrim = Gateway.hudStreet == null ? "" : Gateway.hudStreet.trim();
                    Bubble.navStreet.setTextColor(AmbientTheme.color(context));
                    Bubble.navStreet.setText(strTrim);
                    boolean z3 = strTrim.length() > 0;
                    Bubble.navStreet.setVisibility(z3 ? 0 : 8);
                    if (z3 != Bubble.navStreetShown) {
                        Bubble.navStreetShown = z3;
                        Bubble.view.post(Bubble.resizeR);
                    }
                    int i7 = Gateway.hudExit;
                    boolean z4 = i6 >= 6 && i6 <= 15 && i7 > 0;
                    Bubble.navTurn.setVisibility(0);
                    if (z4) {
                        Bubble.navExit.setText(String.valueOf(i7));
                    }
                    Bubble.navExit.setVisibility(z4 ? 0 : 8);
                }
                Bubble.navWrap.setVisibility(z2 ? 0 : 8);
                if (z2 != Bubble.navShown) {
                    Bubble.navShown = z2;
                    Bubble.view.post(Bubble.resizeR);
                }
                boolean z5 = Gateway.avgZone;
                if (z5 && Bubble.avgImg.getDrawable() == null && (bitmapPin = Signs.pin(context, "no_passing_in")) != null) {
                    Bubble.avgImg.setImageBitmap(bitmapPin);
                }
                Bubble.avgImg.setVisibility(z5 ? 0 : 8);
                if (z5 != Bubble.avgShown) {
                    Bubble.avgShown = z5;
                    Bubble.view.post(Bubble.resizeR);
                }
                int i8 = Gateway.parkingRestriction;
                if (i8 > 0 && Bubble.parkingImg.getDrawable() == null) {
                    Bitmap bitmapPin2 = Signs.pin(context, i8 == 1 ? "no_parking" : "no_stopping_and_parking");
                    if (bitmapPin2 != null) {
                        Bubble.parkingImg.setImageBitmap(bitmapPin2);
                    }
                }
                Bubble.parkingImg.setVisibility(i8 > 0 ? 0 : 8);
                List<String[]> listAlertsList = Bubble.alertsList();
                StringBuilder sb = new StringBuilder();
                for (String[] strArr : listAlertsList) {
                    sb.append(strArr[0]).append('@').append(strArr[1]).append(';');
                }
                String string = sb.toString();
                if (!string.equals(Bubble.alertsSig)) {
                    Bubble.alertsSig = string;
                    Bubble.fillAlerts(context, listAlertsList);
                    Bubble.view.post(Bubble.resizeR);
                }
            } catch (Throwable th) {
            }
            Bubble.f24289h.postDelayed(this, 500L);
        }
    };

    Bubble() {
    }

    static void installAutoHide(Context context) {
        if (Gateway.modEnabled(context)) {
            BubbleKeepAliveService.sync(context);
            if (lifecycleReady) {
                return;
            }
            try {
                Application application = (Application) context.getApplicationContext();
                startedActivities = 1;
                application.registerActivityLifecycleCallbacks(new AnonymousClass2(application));
                lifecycleReady = true;
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: com.waze.gw.Bubble$2, reason: invalid class name */
    class AnonymousClass2 implements Application.ActivityLifecycleCallbacks {
        private final Handler hh = new Handler(Looper.getMainLooper());
        private Runnable pendingShow;
        final /* synthetic */ Application val$app;

        AnonymousClass2(Application application) {
            this.val$app = application;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            cancelPendingShow();
            Bubble.startedActivities++;
            Bubble.hide();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Bubble.startedActivities = Math.max(0, Bubble.startedActivities - 1);
            if (Bubble.startedActivities == 0) {
                cancelPendingShow();
                final Application application = this.val$app;
                this.pendingShow = new Runnable() { // from class: com.waze.gw.Bubble$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$onActivityStopped$0(application);
                    }
                };
                this.hh.postDelayed(this.pendingShow, 700L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onActivityStopped$0(Application application) {
            boolean z = application.getSharedPreferences(Bubble.PREFS, 0).getBoolean("bubble", false);
            boolean zIsProcessForeground = isProcessForeground();
            if (z && !zIsProcessForeground) {
                Bubble.show(application);
            } else if (zIsProcessForeground) {
                Bubble.hide();
            }
            this.pendingShow = null;
        }

        private void cancelPendingShow() {
            if (this.pendingShow != null) {
                this.hh.removeCallbacks(this.pendingShow);
                this.pendingShow = null;
            }
        }

        private boolean isProcessForeground() {
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                return runningAppProcessInfo.importance == 100;
            } catch (Throwable th) {
                return Bubble.startedActivities > 0;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            cancelPendingShow();
            Bubble.hide();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }
    }

    static boolean canShow(Context context) {
        return Gateway.modEnabled(context) && (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
    }

    static void requestPermission(Context context) {
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable th) {
        }
    }

    static synchronized void show(Context context) {
        if (!Gateway.modEnabled(context)) {
            hide();
            return;
        }
        if (view != null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (canShow(applicationContext)) {
            wm = (WindowManager) applicationContext.getSystemService("window");
            dens = applicationContext.getResources().getDisplayMetrics().density;
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(PREFS, 0);
            scale = Math.max(0.8f, Math.min(2.0f, sharedPreferences.getInt("bub_size", 100) / 100.0f));
            bubbleLayout = sharedPreferences.getInt("bubble_layout", 0);
            verticalLayout = bubbleLayout == 1;
            basicLayout = bubbleLayout == 2;
            view = build(applicationContext);
            alertsSig = null;
            lp = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? DisplayStrings.DS_SDK_UPDATE_PARTNER_APP_BODY : 2002, DisplayStrings.DS_ETA, -3);
            lp.gravity = 8388659;
            lp.x = sharedPreferences.getInt("bub_x", (int) (dens * 10.0f));
            lp.y = sharedPreferences.getInt("bub_y", (int) (dens * 150.0f));
            wm.addView(view, lp);
            setupTouch(applicationContext);
            tick.run();
        }
    }

    static synchronized void hide() {
        try {
            f24289h.removeCallbacks(tick);
        } catch (Throwable th) {
        }
        try {
            if (wm != null && view != null) {
                wm.removeView(view);
            }
        } catch (Throwable th2) {
        }
        view = null;
    }

    static synchronized boolean isShowing() {
        return view != null;
    }

    static synchronized void refresh() {
        if (!Gateway.modEnabled()) {
            hide();
        } else {
            if (view == null) {
                return;
            }
            Context context = view.getContext();
            hide();
            show(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String[]> alertsList() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        List<String> list = Gateway.hudAlerts;
        if (list != null) {
            for (int i2 = 0; i2 < list.size() && arrayList.size() < 4; i2++) {
                String[] strArrSplit = list.get(i2).split("\t");
                if (strArrSplit.length >= 5 && strArrSplit[4].length() != 0) {
                    try {
                        int i3 = Integer.parseInt(strArrSplit[3]);
                        if (i3 >= 0 && i3 <= 2000 && hashSet.add(strArrSplit[4])) {
                            arrayList.add(new String[]{strArrSplit[4], strArrSplit[2]});
                        }
                    } catch (Throwable th) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fillAlerts(Context context, List<String[]> list) {
        alertsCol.removeAllViews();
        boolean z = false;
        for (String[] strArr : list) {
            Bitmap bitmapAlertIcon = Signs.alertIcon(context, strArr[0]);
            if (bitmapAlertIcon != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (z) {
                    if (verticalLayout) {
                        layoutParams.topMargin = px(8.0f);
                    } else {
                        layoutParams.leftMargin = px(10.0f);
                    }
                }
                alertsCol.addView(alertItem(context, bitmapAlertIcon, strArr[1]), layoutParams);
                z = true;
            }
        }
        if (!z) {
            alertsCol.addView(alertItem(context, null, "–"));
        }
        alertsCol.setVisibility(0);
    }

    private static View alertItem(Context context, Bitmap bitmap, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int iPx = px(verticalLayout ? 42.0f : 38.0f);
        if (bitmap != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            linearLayout.addView(imageView, new LinearLayout.LayoutParams(iPx, iPx));
        } else {
            TextView textView = new TextView(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1184275);
            gradientDrawable.setStroke(px(3.0f), -5197648);
            textView.setBackground(gradientDrawable);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(iPx, iPx));
        }
        TextView textView2 = new TextView(context);
        textView2.setText(str);
        textView2.setTextColor(-2235674);
        textView2.setTextSize(scale * 10.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = px(verticalLayout ? 1.0f : 2.0f);
        linearLayout.addView(textView2, layoutParams);
        return linearLayout;
    }

    private static View build(Context context) {
        lastTurn = Integer.MIN_VALUE;
        navShown = false;
        navStreetShown = false;
        minimumShown = false;
        minimumSafePadding = 0;
        lanePanel = null;
        gpsSignal = null;
        return basicLayout ? buildBasic(context) : verticalLayout ? buildVertical(context) : buildHorizontal(context);
    }

    private static View buildBasic(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(roundBorder(-1089597932, px(30.0f)));
        linearLayout.setPadding(px(3.0f), px(3.0f), px(3.0f), px(3.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(COLOR_BUBBLE_BORDER);
        frameLayout.setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(circularAppIcon(context, px(42.0f)));
        int iPx = px(46.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(px(42.0f), px(42.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(imageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iPx, iPx);
        layoutParams2.rightMargin = px(4.0f);
        linearLayout.addView(frameLayout, layoutParams2);
        LinearLayout linearLayoutSpeedBlockHorizontal = speedBlockHorizontal(context);
        gpsSignal = new GpsSignalView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(px(15.0f), px(15.0f));
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = px(2.0f);
        linearLayoutSpeedBlockHorizontal.addView(gpsSignal, layoutParams3);
        linearLayout.addView(linearLayoutSpeedBlockHorizontal);
        linearLayout.addView(limitBlockBasic(context));
        navWrap = new LinearLayout(context);
        navWrap.setVisibility(8);
        navTurn = new ImageView(context);
        navDist = new TextView(context);
        navStreet = new TextView(context);
        navExit = new TextView(context);
        laneStrip = new LaneGuidanceStrip(context);
        alertsCol = new LinearLayout(context);
        alertsCol.setOrientation(0);
        avgImg = new ImageView(context);
        avgImg.setVisibility(8);
        parkingImg = new ImageView(context);
        parkingImg.setVisibility(8);
        return linearLayout;
    }

    private static View limitBlockBasic(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int iPx = px(46.0f);
        limitStack = frameLayout;
        limitBaseSize = iPx;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iPx, iPx);
        layoutParams.leftMargin = px(4.0f);
        frameLayout.setLayoutParams(layoutParams);
        limitDash = new TextView(context);
        limitDash.setText("–");
        limitDash.setTextColor(-9538439);
        limitDash.setTextSize(scale * 22.0f);
        limitDash.setTypeface(Typeface.DEFAULT_BOLD);
        limitDash.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1184275);
        gradientDrawable.setStroke(px(2.0f), -5197648);
        limitDash.setBackground(gradientDrawable);
        frameLayout.addView(limitDash, new FrameLayout.LayoutParams(iPx, iPx));
        limitImg = new ImageView(context);
        limitImg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        limitImg.setVisibility(8);
        frameLayout.addView(limitImg, new FrameLayout.LayoutParams(iPx, iPx));
        addMinimumLimit(context, frameLayout, px(27.0f), px(29.0f), px(25.0f));
        minimumSafePadding = px(4.0f);
        return frameLayout;
    }

    private static Bitmap circularAppIcon(Context context, int i2) {
        if (i2 <= 0) {
            return null;
        }
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageName());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Path path = new Path();
            float f2 = i2 / 2.0f;
            path.addCircle(f2, f2, f2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            int iMax = Math.max(1, i2 / 10);
            int i3 = -iMax;
            int i4 = i2 + iMax;
            applicationIcon.setBounds(i3, i3, i4, i4);
            applicationIcon.draw(canvas);
            canvas.restore();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            return null;
        }
    }

    private static View buildHorizontal(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setBackground(roundBorder(-1089597932, px(22.0f)));
        int iPx = px(14.0f);
        linearLayout2.setPadding(iPx, px(14.0f), iPx, px(10.0f));
        linearLayout.addView(brandTabHorizontal(context), new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.addView(turnBlockHorizontal(context));
        linearLayout2.addView(speedBlockHorizontal(context));
        linearLayout2.addView(limitBlockHorizontal(context));
        View view2 = new View(context);
        view2.setBackgroundColor(-2130706433);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.max(1, (int) (scale * 1.5f)), px(34.0f));
        layoutParams.leftMargin = px(12.0f);
        layoutParams.rightMargin = px(12.0f);
        linearLayout2.addView(view2, layoutParams);
        alertsCol = new LinearLayout(context);
        alertsCol.setOrientation(0);
        alertsCol.setGravity(16);
        alertsCol.setVisibility(8);
        linearLayout2.addView(alertsCol);
        avgImg = new ImageView(context);
        avgImg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        avgImg.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(px(40.0f), px(40.0f));
        layoutParams2.gravity = 16;
        layoutParams2.leftMargin = px(10.0f);
        linearLayout2.addView(avgImg, layoutParams2);
        parkingImg = new ImageView(context);
        parkingImg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        parkingImg.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(px(40.0f), px(40.0f));
        layoutParams3.gravity = 16;
        layoutParams3.leftMargin = px(6.0f);
        linearLayout2.addView(parkingImg, layoutParams3);
        return linearLayout;
    }

    private static View brandTabHorizontal(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(brandTopRoundBorder(-1089597932, brandPx(10.0f)));
        int iBrandPx = brandPx(11.0f);
        int iBrandPx2 = brandPx(4.0f);
        linearLayout.setPadding(iBrandPx, iBrandPx2, iBrandPx, iBrandPx2);
        gpsSignal = new GpsSignalView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(brandPx(15.0f), brandPx(15.0f));
        layoutParams.rightMargin = brandPx(6.0f);
        linearLayout.addView(gpsSignal, layoutParams);
        TextView textView = new TextView(context);
        textView.setText("WAZE MOD");
        textView.setTextColor(-1);
        textView.setTextSize(10.5f);
        ModTypeface.applyBrand(textView);
        textView.setGravity(16);
        linearLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageName());
            if (applicationIcon != null) {
                imageView.setImageDrawable(applicationIcon);
            }
        } catch (Throwable th) {
        }
        int iBrandPx3 = brandPx(16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iBrandPx3, iBrandPx3);
        layoutParams2.leftMargin = brandPx(6.0f);
        linearLayout.addView(imageView, layoutParams2);
        return linearLayout;
    }

    private static LinearLayout speedBlockHorizontal(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setMinimumWidth(px(45.0f));
        spd = new TextView(context);
        spd.setTextColor(-1);
        spd.setTextSize(scale * 24.0f);
        spd.setGravity(17);
        spd.setIncludeFontPadding(false);
        extraBold(spd);
        ModTypeface.applySpeed(spd);
        linearLayout.addView(spd);
        TextView textView = new TextView(context);
        textView.setText("km/h");
        textView.setTextColor(-5327686);
        textView.setTextSize(scale * 11.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private static View limitBlockHorizontal(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int iPx = px(44.0f);
        limitStack = frameLayout;
        limitBaseSize = iPx;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iPx, iPx);
        layoutParams.leftMargin = px(12.0f);
        frameLayout.setLayoutParams(layoutParams);
        limitDash = new TextView(context);
        limitDash.setText("–");
        limitDash.setTextColor(-9538439);
        limitDash.setTextSize(scale * 22.0f);
        limitDash.setTypeface(Typeface.DEFAULT_BOLD);
        limitDash.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1184275);
        gradientDrawable.setStroke(px(2.0f), -5197648);
        limitDash.setBackground(gradientDrawable);
        frameLayout.addView(limitDash, new FrameLayout.LayoutParams(iPx, iPx));
        limitImg = new ImageView(context);
        limitImg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        limitImg.setVisibility(8);
        frameLayout.addView(limitImg, new FrameLayout.LayoutParams(iPx, iPx));
        addMinimumLimit(context, frameLayout, px(27.0f), px(27.0f), px(24.0f));
        return frameLayout;
    }

    private static View turnBlockHorizontal(Context context) {
        navWrap = new LinearLayout(context);
        navWrap.setOrientation(0);
        navWrap.setGravity(16);
        navWrap.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumWidth(px(102.0f));
        int iPx = px(38.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        navTurn = new ImageView(context);
        navTurn.setScaleType(ImageView.ScaleType.FIT_CENTER);
        navTurn.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(navTurn, new FrameLayout.LayoutParams(iPx, iPx));
        navExit = new TextView(context);
        navExit.setTextColor(-1);
        navExit.setTextSize(scale * 12.0f);
        navExit.setTypeface(Typeface.DEFAULT_BOLD);
        navExit.setGravity(17);
        navExit.setVisibility(8);
        frameLayout.addView(navExit, new FrameLayout.LayoutParams(iPx, iPx));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(iPx, iPx));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px(62.0f), -2);
        layoutParams.leftMargin = px(5.0f);
        navDist = new TextView(context);
        navDist.setTextColor(-1);
        navDist.setTextSize(scale * 13.0f);
        navDist.setTypeface(Typeface.DEFAULT_BOLD);
        navDist.setSingleLine(true);
        linearLayout2.addView(navDist);
        navStreet = new TextView(context);
        navStreet.setTextColor(AmbientTheme.color(context));
        navStreet.setTextSize(scale * 9.0f);
        navStreet.setSingleLine(true);
        navStreet.setEllipsize(TextUtils.TruncateAt.END);
        navStreet.setVisibility(8);
        linearLayout2.addView(navStreet);
        linearLayout.addView(linearLayout2, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(1);
        laneStrip = new LaneGuidanceStrip(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(px(104.0f), px(34.0f));
        layoutParams2.bottomMargin = px(2.0f);
        linearLayout3.addView(laneStrip, layoutParams2);
        linearLayout3.addView(linearLayout);
        navWrap.addView(linearLayout3);
        View view2 = new View(context);
        view2.setBackgroundColor(-2130706433);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(Math.max(1, (int) (scale * 1.5f)), px(34.0f));
        layoutParams3.leftMargin = px(8.0f);
        layoutParams3.rightMargin = px(10.0f);
        navWrap.addView(view2, layoutParams3);
        return navWrap;
    }

    private static View buildVertical(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(48);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.addView(brandTabVertical(context));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setBackground(roundBorder(-1089597932, px(22.0f)));
        int iPx = px(7.0f);
        linearLayout2.setPadding(iPx, px(9.0f), iPx, px(9.0f));
        linearLayout2.addView(turnBlockVertical(context));
        linearLayout2.addView(limitBlockVertical(context));
        linearLayout2.addView(speedBlockVertical(context), gapTop(6));
        View view2 = new View(context);
        view2.setBackgroundColor(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px(44.0f), Math.max(1, (int) (scale * 2.0f)));
        layoutParams.topMargin = (int) (scale * 15.0f);
        layoutParams.bottomMargin = (int) (scale * 15.0f);
        linearLayout2.addView(view2, layoutParams);
        alertsCol = new LinearLayout(context);
        alertsCol.setOrientation(1);
        alertsCol.setGravity(1);
        alertsCol.setVisibility(8);
        linearLayout2.addView(alertsCol);
        linearLayout.addView(linearLayout2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(roundBorder(-1089597932, px(17.0f)));
        frameLayout.setPadding(px(7.0f), px(5.0f), px(7.0f), px(5.0f));
        frameLayout.setVisibility(8);
        laneStrip = new LaneGuidanceStrip(context);
        frameLayout.addView(laneStrip, new FrameLayout.LayoutParams(px(116.0f), px(46.0f)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(px(130.0f), px(56.0f));
        layoutParams2.leftMargin = px(8.0f);
        layoutParams2.topMargin = px(7.0f);
        linearLayout.addView(frameLayout, layoutParams2);
        lanePanel = frameLayout;
        avgImg = new ImageView(context);
        avgImg.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(px(46.0f), px(46.0f));
        layoutParams3.gravity = 16;
        layoutParams3.leftMargin = px(6.0f);
        linearLayout.addView(avgImg, layoutParams3);
        parkingImg = new ImageView(context);
        parkingImg.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(px(46.0f), px(46.0f));
        layoutParams4.gravity = 16;
        layoutParams4.leftMargin = px(4.0f);
        linearLayout.addView(parkingImg, layoutParams4);
        return linearLayout;
    }

    private static View brandTabVertical(Context context) {
        int iBrandPx = brandPx(112.0f);
        int iBrandPx2 = brandPx(30.0f);
        int iBrandPx3 = brandPx(132.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(brandLeftRoundBorder(-1089597932, brandPx(10.0f)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iBrandPx2, iBrandPx3);
        layoutParams.gravity = 21;
        frameLayout.addView(frameLayout2, layoutParams);
        ImageView imageView = new ImageView(context);
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageName());
            if (applicationIcon != null) {
                imageView.setImageDrawable(applicationIcon);
            }
        } catch (Throwable th) {
        }
        int iBrandPx4 = brandPx(16.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iBrandPx4, iBrandPx4);
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = brandPx(8.0f);
        frameLayout2.addView(imageView, layoutParams2);
        TextView textView = new TextView(context);
        textView.setText("WAZE MOD");
        textView.setTextColor(-1);
        textView.setTextSize(9.5f);
        ModTypeface.applyBrand(textView);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setRotation(-90.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(brandPx(80.0f), brandPx(22.0f));
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = brandPx(9.0f);
        frameLayout2.addView(textView, layoutParams3);
        gpsSignal = new GpsSignalView(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(brandPx(14.0f), brandPx(14.0f));
        layoutParams4.gravity = 81;
        layoutParams4.bottomMargin = brandPx(6.0f);
        frameLayout2.addView(gpsSignal, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iBrandPx, iBrandPx3);
        layoutParams5.gravity = 16;
        layoutParams5.leftMargin = -(iBrandPx - iBrandPx2);
        frameLayout.setLayoutParams(layoutParams5);
        return frameLayout;
    }

    private static View speedBlockVertical(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        spd = new TextView(context);
        spd.setTextColor(-1);
        spd.setTextSize(scale * 23.0f);
        spd.setGravity(17);
        extraBold(spd);
        ModTypeface.applySpeed(spd);
        linearLayout.addView(spd);
        TextView textView = new TextView(context);
        textView.setText("km/h");
        textView.setTextColor(-5327686);
        textView.setTextSize(scale * 10.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private static View limitBlockVertical(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int iPx = px(42.0f);
        limitStack = frameLayout;
        limitBaseSize = iPx;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(iPx, iPx));
        limitDash = new TextView(context);
        limitDash.setText("–");
        limitDash.setTextColor(-9538439);
        limitDash.setTextSize(scale * 22.0f);
        limitDash.setTypeface(Typeface.DEFAULT_BOLD);
        limitDash.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1184275);
        gradientDrawable.setStroke(px(3.0f), -5197648);
        limitDash.setBackground(gradientDrawable);
        frameLayout.addView(limitDash, new FrameLayout.LayoutParams(iPx, iPx));
        limitImg = new ImageView(context);
        limitImg.setVisibility(8);
        frameLayout.addView(limitImg, new FrameLayout.LayoutParams(iPx, iPx));
        addMinimumLimit(context, frameLayout, px(25.0f), px(26.0f), px(23.0f));
        return frameLayout;
    }

    private static void addMinimumLimit(Context context, FrameLayout frameLayout, int i2, int i3, int i4) {
        minimumDiameter = i2;
        minimumLeft = i3;
        minimumTop = i4;
        minimumLimit = new TextView(context);
        minimumLimit.setTextColor(-1);
        minimumLimit.setTextSize(scale * 14.0f);
        minimumLimit.setGravity(17);
        minimumLimit.setIncludeFontPadding(false);
        extraBold(minimumLimit);
        ModTypeface.applySpeed(minimumLimit);
        minimumLimit.setBackground(oval(-16035917));
        minimumLimit.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        frameLayout.addView(minimumLimit, layoutParams);
    }

    private static View turnBlockVertical(Context context) {
        navWrap = new LinearLayout(context);
        navWrap.setOrientation(1);
        navWrap.setGravity(1);
        navWrap.setVisibility(8);
        int iPx = px(42.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        navTurn = new ImageView(context);
        navTurn.setScaleType(ImageView.ScaleType.FIT_CENTER);
        navTurn.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(navTurn, new FrameLayout.LayoutParams(iPx, iPx));
        navExit = new TextView(context);
        navExit.setTextColor(-1);
        navExit.setTextSize(scale * 12.0f);
        navExit.setTypeface(Typeface.DEFAULT_BOLD);
        navExit.setGravity(17);
        navExit.setVisibility(8);
        frameLayout.addView(navExit, new FrameLayout.LayoutParams(iPx, iPx));
        navWrap.addView(frameLayout, new LinearLayout.LayoutParams(iPx, iPx));
        navDist = new TextView(context);
        navDist.setTextColor(-1);
        navDist.setTextSize(scale * 12.0f);
        navDist.setTypeface(Typeface.DEFAULT_BOLD);
        navDist.setGravity(17);
        navDist.setSingleLine(true);
        navDist.setMinWidth(px(60.0f));
        navWrap.addView(navDist);
        navStreet = new TextView(context);
        navStreet.setTextColor(AmbientTheme.color(context));
        navStreet.setTextSize(scale * 8.0f);
        navStreet.setGravity(17);
        navStreet.setSingleLine(true);
        navStreet.setMaxWidth(px(56.0f));
        navStreet.setEllipsize(TextUtils.TruncateAt.END);
        navStreet.setVisibility(8);
        navWrap.addView(navStreet);
        View view2 = new View(context);
        view2.setBackgroundColor(-2130706433);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px(44.0f), Math.max(1, (int) (scale * 1.5f)));
        layoutParams.topMargin = px(7.0f);
        layoutParams.bottomMargin = px(8.0f);
        navWrap.addView(view2, layoutParams);
        return navWrap;
    }

    private static void setupTouch(final Context context) {
        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.waze.gw.Bubble.4
            float downX;
            float downY;
            float dx;
            float dy;
            boolean moved;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        this.downX = motionEvent.getRawX();
                        this.downY = motionEvent.getRawY();
                        this.moved = false;
                        this.dx = motionEvent.getRawX() - Bubble.lp.x;
                        this.dy = motionEvent.getRawY() - Bubble.lp.y;
                        return true;
                    case 1:
                    case 3:
                        if (this.moved) {
                            Bubble.savePosition(context);
                        } else {
                            Bubble.openWaze(context);
                        }
                        return true;
                    case 2:
                        if (!this.moved && (Math.abs(motionEvent.getRawX() - this.downX) > scaledTouchSlop || Math.abs(motionEvent.getRawY() - this.downY) > scaledTouchSlop)) {
                            this.moved = true;
                        }
                        if (this.moved) {
                            Bubble.lp.x = (int) (motionEvent.getRawX() - this.dx);
                            Bubble.lp.y = (int) (motionEvent.getRawY() - this.dy);
                            Bubble.clampPosition();
                            try {
                                Bubble.wm.updateViewLayout(Bubble.view, Bubble.lp);
                            } catch (Throwable th) {
                            }
                        }
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean clampPosition() {
        int iMax;
        int iMax2;
        try {
            if (wm != null && lp != null) {
                Point point = new Point();
                wm.getDefaultDisplay().getSize(point);
                if (lp.width > 0) {
                    iMax = lp.width;
                } else {
                    iMax = view == null ? 0 : Math.max(view.getWidth(), view.getMeasuredWidth());
                }
                if (lp.height > 0) {
                    iMax2 = lp.height;
                } else {
                    iMax2 = view == null ? 0 : Math.max(view.getHeight(), view.getMeasuredHeight());
                }
                int iMax3 = Math.max(0, point.x - Math.max(0, iMax));
                int iMax4 = Math.max(0, point.y - Math.max(0, iMax2));
                int iMax5 = Math.max(0, Math.min(lp.x, iMax3));
                int iMax6 = Math.max(0, Math.min(lp.y, iMax4));
                if (iMax5 == lp.x && iMax6 == lp.y) {
                    return false;
                }
                lp.x = iMax5;
                lp.y = iMax6;
                return true;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void savePosition(Context context) {
        if (context == null || lp == null) {
            return;
        }
        context.getSharedPreferences(PREFS, 0).edit().putInt("bub_x", lp.x).putInt("bub_y", lp.y).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void openWaze(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fmtTurnDist(int i2) {
        if (i2 < 0) {
            return "";
        }
        if (i2 < 1000) {
            return i2 + " m";
        }
        Locale locale = Locale.US;
        double d2 = i2;
        Double.isNaN(d2);
        return String.format(locale, "%.1f km", Double.valueOf(d2 / 1000.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int turnDrawable(Context context, int i2) {
        String strDrawableName = HudManeuverAssets.drawableName(i2);
        int identifier = context.getResources().getIdentifier(strDrawableName, "drawable", context.getPackageName());
        return identifier == 0 ? context.getResources().getIdentifier(strDrawableName, "drawable", "com.waze") : identifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyNavTint(int i2) {
        if (!HudManeuverAssets.preserveArtwork(i2)) {
            navTurn.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        } else {
            navTurn.clearColorFilter();
        }
    }

    private static int px(float f2) {
        return (int) ((f2 * dens * scale) + 0.5f);
    }

    private static int brandPx(float f2) {
        return (int) ((f2 * dens) + 0.5f);
    }

    private static LinearLayout.LayoutParams gapLeft(int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = px(i2);
        return layoutParams;
    }

    private static LinearLayout.LayoutParams gapTop(int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = px(i2);
        return layoutParams;
    }

    private static GradientDrawable round(int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(f2);
        return gradientDrawable;
    }

    private static GradientDrawable roundBorder(int i2, float f2) {
        GradientDrawable gradientDrawableRound = round(i2, f2);
        gradientDrawableRound.setStroke(Math.max(1, px(1.0f)), COLOR_BUBBLE_BORDER);
        return gradientDrawableRound;
    }

    private static GradientDrawable topRoundBorder(int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setStroke(Math.max(1, px(1.0f)), COLOR_BUBBLE_BORDER);
        return gradientDrawable;
    }

    private static GradientDrawable brandTopRoundBorder(int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setStroke(Math.max(1, brandPx(1.0f)), COLOR_BUBBLE_BORDER);
        return gradientDrawable;
    }

    private static GradientDrawable leftRoundBorder(int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadii(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
        gradientDrawable.setStroke(Math.max(1, px(1.0f)), COLOR_BUBBLE_BORDER);
        return gradientDrawable;
    }

    private static GradientDrawable brandLeftRoundBorder(int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadii(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
        gradientDrawable.setStroke(Math.max(1, brandPx(1.0f)), COLOR_BUBBLE_BORDER);
        return gradientDrawable;
    }

    private static GradientDrawable oval(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    private static void extraBold(TextView textView) {
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(textView.getTextSize() * 0.05f);
    }
}
