package com.waze.gw;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import com.waze.strings.DisplayStrings;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public class HudActivity extends Activity {
    private static final int RING_OK = -7709441;
    private static final int RING_OVER = -1957094;
    private LinearLayout alertsBox;
    private ImageView avgSign;
    private TextView clock;
    private TextView eta;
    private TextView exitNum;
    private TextView flipBtn;
    private TextView hudBattery;
    private BatteryLevelView hudBatteryIcon;
    private View hudDeviceStatus;
    private GpsSignalView hudGpsSignal;
    private View hudRoot;
    private LaneGuidanceStrip laneStrip;
    private long lastBatteryReadElapsed;
    private TextView limit;
    private int limitDiameter;
    private FrameLayout limitStack;
    private int minimumDiameter;
    private int minimumLeft;
    private TextView minimumLimit;
    private boolean minimumShown;
    private int minimumTop;
    private boolean mirror;
    private TextView navDist;
    private TextView navStreet;
    private ImageView navTurn;
    private View navWrap;
    private int observedWindowHeight;
    private int observedWindowWidth;
    private boolean portraitHud;
    private boolean pulsing;
    private boolean returningToMap;
    private TextView speed;
    private GradientDrawable spkRing;
    private int spkStroke;
    private boolean useV2;
    private TextView v2RoadName;
    private TextView v2RouteSummary;
    private HudSpeedometerDial v2Speedometer;
    private Vignette vignette;
    private String alertsSig = "";
    private String v2ActiveKey = "";
    private final HashMap<String, Bitmap> iconCache = new HashMap<>();
    private int lastTurn = -2;
    private int portraitGaugeStyle = 1;
    private float gaugeScale = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f24291h = new Handler(Looper.getMainLooper());
    private final SimpleDateFormat fmt = new SimpleDateFormat("EEE  dd/MM/yyyy    HH:mm:ss", Locale.US);
    private final SimpleDateFormat fmtV2 = new SimpleDateFormat("HH:mm", Locale.US);
    private final Runnable resizeRecreate = new Runnable() { // from class: com.waze.gw.HudActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (HudActivity.this.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 17 || !HudActivity.this.isDestroyed()) {
                HudActivity.this.recreate();
            }
        }
    };
    private final Runnable tick = new Runnable() { // from class: com.waze.gw.HudActivity.6
        @Override // java.lang.Runnable
        public void run() {
            String str;
            Bitmap bitmapPin;
            float f2;
            int iDp;
            HudActivity hudActivity;
            int i2;
            Date date = new Date();
            HudActivity.this.updateDeviceStatus();
            TextView textView = HudActivity.this.clock;
            if (HudActivity.this.useV2) {
                str = HudActivity.this.portraitHud ? HudActivity.this.fmtV2.format(date) : "HUD  ·  " + HudActivity.this.fmtV2.format(date);
            } else {
                str = HudActivity.this.fmt.format(date);
            }
            textView.setText(str);
            int i3 = Gateway.hudLimit;
            if (HudActivity.this.useV2 && HudActivity.this.portraitHud) {
                if (HudActivity.this.portraitGaugeStyle == 2) {
                    ModTypeface.fitSpeed(HudActivity.this.limit, i3, HudActivity.this.gaugeScale * 100.0f, HudActivity.this.gaugeScale * 80.0f);
                } else if (HudActivity.this.portraitGaugeStyle == 3) {
                    ModTypeface.fitSpeed(HudActivity.this.limit, i3, HudActivity.this.gaugeScale * 88.0f, HudActivity.this.gaugeScale * 70.0f);
                } else {
                    ModTypeface.fitSpeed(HudActivity.this.limit, i3, HudActivity.this.gaugeScale * 61.0f, HudActivity.this.gaugeScale * 49.0f);
                }
            } else {
                ModTypeface.fitSpeed(HudActivity.this.limit, i3, HudActivity.this.gaugeScale * 132.0f, HudActivity.this.gaugeScale * 108.0f);
            }
            HudActivity.this.limit.setText(i3 >= 10 ? String.valueOf(i3) : "--");
            int i4 = Gateway.minimumSpeedLimit;
            boolean z = i4 >= 10 && i4 <= 160;
            if (z) {
                if (HudActivity.this.useV2 && HudActivity.this.portraitHud) {
                    if (HudActivity.this.portraitGaugeStyle == 2) {
                        ModTypeface.fitSpeed(HudActivity.this.minimumLimit, i4, HudActivity.this.gaugeScale * 47.0f, HudActivity.this.gaugeScale * 38.0f);
                    } else if (HudActivity.this.portraitGaugeStyle == 3) {
                        ModTypeface.fitSpeed(HudActivity.this.minimumLimit, i4, HudActivity.this.gaugeScale * 44.0f, HudActivity.this.gaugeScale * 35.0f);
                    } else {
                        ModTypeface.fitSpeed(HudActivity.this.minimumLimit, i4, HudActivity.this.gaugeScale * 41.0f, HudActivity.this.gaugeScale * 33.0f);
                    }
                } else {
                    ModTypeface.fitSpeed(HudActivity.this.minimumLimit, i4, HudActivity.this.gaugeScale * 86.0f, HudActivity.this.gaugeScale * 70.0f);
                }
                HudActivity.this.minimumLimit.setText(String.valueOf(i4));
            }
            HudActivity.this.minimumLimit.setVisibility(z ? 0 : 8);
            if (z != HudActivity.this.minimumShown) {
                HudActivity.this.minimumShown = z;
                ViewGroup.LayoutParams layoutParams = HudActivity.this.limitStack.getLayoutParams();
                layoutParams.width = z ? Math.max(HudActivity.this.limitDiameter, HudActivity.this.minimumLeft + HudActivity.this.minimumDiameter) : HudActivity.this.limitDiameter;
                layoutParams.height = z ? Math.max(HudActivity.this.limitDiameter, HudActivity.this.minimumTop + HudActivity.this.minimumDiameter) : HudActivity.this.limitDiameter;
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (HudActivity.this.portraitHud) {
                        hudActivity = HudActivity.this;
                        i2 = 16;
                    } else if (z) {
                        hudActivity = HudActivity.this;
                        i2 = 48;
                    } else {
                        iDp = 0;
                        layoutParams2.rightMargin = iDp;
                    }
                    iDp = hudActivity.dp(i2);
                    layoutParams2.rightMargin = iDp;
                }
                HudActivity.this.limitStack.setLayoutParams(layoutParams);
            }
            int i5 = Gateway.hudSpeed;
            if (HudActivity.this.useV2) {
                if (!HudActivity.this.portraitHud) {
                    f2 = 42.0f;
                } else if (HudActivity.this.portraitGaugeStyle == 2) {
                    f2 = 36.0f;
                } else {
                    f2 = HudActivity.this.portraitGaugeStyle == 3 ? 52.0f : 72.0f;
                }
                HudActivity.this.speed.setTextSize(f2 * HudActivity.this.gaugeScale);
            } else {
                ModTypeface.fitSpeed(HudActivity.this.speed, i5, HudActivity.this.gaugeScale * 96.0f, HudActivity.this.gaugeScale * 78.0f);
            }
            HudActivity.this.speed.setText(String.valueOf(i5 >= 0 ? i5 : 0));
            HudActivity.this.laneStrip.setSnapshot(Gateway.hudLanes);
            int i6 = Gateway.hudTurn;
            if (i6 < 1) {
                HudActivity.this.navStreet.setText("");
                HudActivity.this.navStreet.setVisibility(8);
                HudActivity.this.navWrap.setVisibility(8);
            } else {
                HudActivity.this.navWrap.setVisibility(0);
                if (i6 != HudActivity.this.lastTurn) {
                    HudActivity.this.lastTurn = i6;
                    int iTurnDrawable = HudActivity.this.turnDrawable(i6);
                    if (iTurnDrawable != 0) {
                        HudActivity.this.navTurn.setImageResource(iTurnDrawable);
                    }
                    HudActivity.this.applyNavTint(i6);
                }
                HudActivity.this.navDist.setText(HudActivity.this.fmtDist(Gateway.hudTurnDist));
                Gateway.refreshNavStreetFromManager();
                String strTrim = Gateway.hudStreet == null ? "" : Gateway.hudStreet.trim();
                HudActivity.this.navStreet.setTextColor(AmbientTheme.color(HudActivity.this));
                HudActivity.this.navStreet.setText(strTrim);
                HudActivity.this.navStreet.setVisibility(strTrim.length() > 0 ? 0 : 8);
                int i7 = Gateway.hudExit;
                boolean z2 = i6 >= 6 && i6 <= 15 && i7 > 0;
                HudActivity.this.navTurn.setVisibility(0);
                if (z2) {
                    HudActivity.this.exitNum.setText(String.valueOf(i7));
                }
                HudActivity.this.exitNum.setVisibility(z2 ? 0 : 8);
            }
            int i8 = Gateway.hudEtaMin;
            if (HudActivity.this.useV2) {
                StringBuilder sb = new StringBuilder();
                if (i8 >= 0) {
                    sb.append(HudActivity.this.fmtMin(i8));
                }
                if (Gateway.hudEtaDistM >= 0) {
                    if (sb.length() > 0) {
                        sb.append("   ·   ");
                    }
                    sb.append(HudActivity.this.fmtDist(Gateway.hudEtaDistM));
                }
                HudActivity.this.v2RouteSummary.setText(sb.toString());
                HudActivity.this.v2RouteSummary.setVisibility(sb.length() > 0 ? 0 : 4);
                String strTrim2 = Gateway.hudCurStreet == null ? "" : Gateway.hudCurStreet.trim();
                HudActivity.this.v2RoadName.setText(strTrim2);
                HudActivity.this.v2RoadName.setVisibility(strTrim2.length() > 0 ? 0 : 4);
            } else if (i8 >= 0) {
                HudActivity.this.eta.setVisibility(0);
                StringBuilder sb2 = new StringBuilder();
                String str2 = Gateway.hudEtaClock;
                if (str2 != null && str2.length() > 0) {
                    sb2.append(str2);
                }
                if (sb2.length() > 0) {
                    sb2.append("    ·    ");
                }
                sb2.append(HudActivity.this.fmtMin(i8));
                if (Gateway.hudEtaDistM >= 0) {
                    sb2.append("    ·    ").append(HudActivity.this.fmtDist(Gateway.hudEtaDistM));
                }
                HudActivity.this.eta.setText(sb2.toString());
            } else {
                HudActivity.this.eta.setVisibility(8);
            }
            boolean z3 = i3 >= 10 && i5 > i3;
            int i9 = HudActivity.this.getSharedPreferences("waze_hud_gw", 0).getInt("hud_overspeed_effect_mode", 0);
            boolean z4 = i9 != 0;
            HudActivity.this.vignette.setMode(i9);
            if (HudActivity.this.useV2) {
                HudActivity.this.v2Speedometer.setValues(i5, i3, z3);
            } else {
                HudActivity.this.spkRing.setStroke(HudActivity.this.spkStroke, z3 ? HudActivity.RING_OVER : HudActivity.RING_OK);
            }
            if (z3 && z4 && !HudActivity.this.pulsing) {
                HudActivity.this.pulsing = true;
                HudActivity.this.vignette.setActive(true);
            } else if ((!z3 || !z4) && HudActivity.this.pulsing) {
                HudActivity.this.pulsing = false;
                HudActivity.this.vignette.setActive(false);
            }
            if (Gateway.avgZone) {
                if (HudActivity.this.avgSign.getDrawable() == null && (bitmapPin = Signs.pin(HudActivity.this, "no_passing_in")) != null) {
                    HudActivity.this.avgSign.setImageBitmap(bitmapPin);
                }
                HudActivity.this.avgSign.setVisibility(0);
            } else if (!HudActivity.this.useV2) {
                HudActivity.this.avgSign.setVisibility(8);
            }
            List<String> list = Gateway.hudAlerts;
            if (HudActivity.this.useV2) {
                HudActivity.this.updateV2ActiveAlert(list);
            }
            String str3 = String.valueOf(list) + (HudActivity.this.useV2 ? "|active=" + HudActivity.this.v2ActiveKey : "");
            if (!str3.equals(HudActivity.this.alertsSig)) {
                HudActivity.this.alertsSig = str3;
                HudActivity.this.rebuildAlerts(list);
            }
            HudActivity.this.f24291h.postDelayed(this, 500L);
        }
    };

    public static Intent createIntent(Context context) {
        return new Intent(context, (Class<?>) (context.getSharedPreferences("waze_hud_gw", 0).getInt("hud_orientation", 1) == 2 ? PortraitHudActivity.class : HudActivity.class));
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        View viewBuildV2;
        super.onCreate(bundle);
        if (!Gateway.modEnabled(this)) {
            finish();
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("waze_hud_gw", 0);
        int i2 = sharedPreferences.getInt("hud_orientation", 1);
        if (i2 == 2) {
            setRequestedOrientation(7);
        } else if (i2 == 0) {
            setRequestedOrientation(10);
        } else {
            setRequestedOrientation(6);
        }
        getWindow().addFlags(128);
        getWindow().getDecorView().setSystemUiVisibility(4102);
        this.clock = text(22, -2959139, 17, true);
        this.eta = text(24, -2235674, 17, true);
        this.eta.setVisibility(8);
        this.portraitHud = getResources().getConfiguration().orientation == 1;
        this.portraitGaugeStyle = sharedPreferences.getInt("hud_portrait_gauge_style", 1);
        if (this.portraitGaugeStyle < 1 || this.portraitGaugeStyle > 3) {
            this.portraitGaugeStyle = 1;
        }
        this.useV2 = this.portraitHud || sharedPreferences.getInt("hud_layout", 1) == 2;
        if (this.portraitHud) {
            viewBuildV2 = buildV2Portrait();
        } else {
            viewBuildV2 = this.useV2 ? buildV2() : buildLandscape();
        }
        installMapReturnGesture();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(viewBuildV2, new FrameLayout.LayoutParams(-1, -1));
        this.vignette = new Vignette(this);
        frameLayout.addView(this.vignette, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        this.flipBtn = new TextView(this);
        this.flipBtn.setText("⇄");
        this.flipBtn.setTextSize(26.0f);
        this.flipBtn.setTypeface(Typeface.DEFAULT_BOLD);
        this.flipBtn.setGravity(17);
        this.flipBtn.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.HudActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HudActivity.this.toggleMirror();
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp(54), dp(54), 8388661);
        layoutParams.topMargin = dp(12);
        layoutParams.rightMargin = dp(12);
        frameLayout2.addView(this.flipBtn, layoutParams);
        View viewBuildDeviceStatus = buildDeviceStatus();
        this.hudDeviceStatus = viewBuildDeviceStatus;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, dp(38), 8388659);
        layoutParams2.topMargin = dp(12);
        layoutParams2.leftMargin = dp(12);
        frameLayout2.addView(viewBuildDeviceStatus, layoutParams2);
        ModReport.attach(frameLayout2, true);
        setContentView(frameLayout2);
        applyDisplayCutoutInsets(frameLayout2);
        installWindowResizeWatcher(frameLayout2);
        this.hudRoot = frameLayout;
        this.mirror = getSharedPreferences("waze_hud_gw", 0).getBoolean("mirror", false);
        applyMirror();
        this.tick.run();
    }

    private void applyDisplayCutoutInsets(View view) {
        if (Build.VERSION.SDK_INT < 20 || view == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.waze.gw.HudActivity.2
            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                DisplayCutout displayCutout;
                int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
                int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                if (Build.VERSION.SDK_INT >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
                    systemWindowInsetLeft = Math.max(systemWindowInsetLeft, displayCutout.getSafeInsetLeft());
                    systemWindowInsetTop = Math.max(systemWindowInsetTop, displayCutout.getSafeInsetTop());
                    systemWindowInsetRight = Math.max(systemWindowInsetRight, displayCutout.getSafeInsetRight());
                    systemWindowInsetBottom = Math.max(systemWindowInsetBottom, displayCutout.getSafeInsetBottom());
                }
                view2.setPadding(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
                return windowInsets;
            }
        });
        view.requestApplyInsets();
    }

    private void installWindowResizeWatcher(View view) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.waze.gw.HudActivity.3
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = i4 - i2;
                int i11 = i5 - i3;
                if (i10 <= 0 || i11 <= 0) {
                    return;
                }
                if (HudActivity.this.observedWindowWidth == 0 || HudActivity.this.observedWindowHeight == 0) {
                    HudActivity.this.observedWindowWidth = i10;
                    HudActivity.this.observedWindowHeight = i11;
                } else if (Math.abs(i10 - HudActivity.this.observedWindowWidth) >= HudActivity.this.dp(12) || Math.abs(i11 - HudActivity.this.observedWindowHeight) >= HudActivity.this.dp(12)) {
                    HudActivity.this.observedWindowWidth = i10;
                    HudActivity.this.observedWindowHeight = i11;
                    HudActivity.this.f24291h.removeCallbacks(HudActivity.this.resizeRecreate);
                    HudActivity.this.f24291h.postDelayed(HudActivity.this.resizeRecreate, 350L);
                }
            }
        });
    }

    private View buildDeviceStatus() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(dp(10), dp(5), dp(11), dp(5));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1290528993);
        gradientDrawable.setCornerRadius(dp(19));
        gradientDrawable.setStroke(dp(1), 1716410728);
        linearLayout.setBackground(gradientDrawable);
        this.hudGpsSignal = new GpsSignalView(this);
        linearLayout.addView(this.hudGpsSignal, new LinearLayout.LayoutParams(dp(21), dp(21)));
        View view = new View(this);
        view.setBackgroundColor(1717528694);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(1), dp(18));
        layoutParams.leftMargin = dp(9);
        layoutParams.rightMargin = dp(9);
        linearLayout.addView(view, layoutParams);
        this.hudBatteryIcon = new BatteryLevelView(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dp(30), dp(18));
        layoutParams2.rightMargin = dp(5);
        linearLayout.addView(this.hudBatteryIcon, layoutParams2);
        this.hudBattery = text(14, -1578515, 17, true);
        this.hudBattery.setText("--");
        linearLayout.addView(this.hudBattery, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDeviceStatus() {
        if (this.hudGpsSignal != null) {
            this.hudGpsSignal.setLevel(Gateway.gpsSignalLevel());
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.hudBattery == null || jElapsedRealtime - this.lastBatteryReadElapsed < 15000) {
            return;
        }
        this.lastBatteryReadElapsed = jElapsedRealtime;
        int intProperty = -1;
        try {
            BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
            if (batteryManager != null) {
                intProperty = batteryManager.getIntProperty(4);
            }
        } catch (Throwable th) {
        }
        if (this.hudBatteryIcon != null) {
            this.hudBatteryIcon.setPercent(intProperty);
        }
        this.hudBattery.setText((intProperty < 0 || intProperty > 100) ? "--" : intProperty + "%");
    }

    private void installMapReturnGesture() {
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: com.waze.gw.HudActivity.5
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (HudActivity.this.returningToMap) {
                    return true;
                }
                HudActivity.this.returningToMap = true;
                try {
                    view.performHapticFeedback(0);
                } catch (Throwable th) {
                }
                HudActivity.this.finish();
                HudActivity.this.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        };
        installMapReturnGesture(this.limitStack, onLongClickListener);
        installMapReturnGesture(this.limit, onLongClickListener);
        installMapReturnGesture(this.minimumLimit, onLongClickListener);
        installMapReturnGesture(this.speed, onLongClickListener);
        installMapReturnGesture(this.v2Speedometer, onLongClickListener);
    }

    private void installMapReturnGesture(View view, View.OnLongClickListener onLongClickListener) {
        if (view == null) {
            return;
        }
        view.setLongClickable(true);
        view.setOnLongClickListener(onLongClickListener);
        view.setContentDescription("Nhấn giữ để trở về bản đồ Waze");
    }

    private void applyMirror() {
        if (this.hudRoot != null) {
            this.hudRoot.setScaleX(this.mirror ? -1.0f : 1.0f);
        }
        if (this.hudDeviceStatus != null) {
            this.hudDeviceStatus.setScaleX(this.mirror ? -1.0f : 1.0f);
        }
        if (this.flipBtn != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(this.mirror ? -863347457 : -870441432);
            gradientDrawable.setStroke(dp(2), this.mirror ? -1 : 1442840575);
            this.flipBtn.setBackground(gradientDrawable);
            this.flipBtn.setTextColor(-1);
        }
        applyBrightness();
    }

    private void applyBrightness() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = this.mirror ? 1.0f : -1.0f;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleMirror() {
        this.mirror = !this.mirror;
        getSharedPreferences("waze_hud_gw", 0).edit().putBoolean("mirror", this.mirror).apply();
        applyMirror();
        Toast.makeText(this, "HUD lật gương: " + (this.mirror ? "BẬT" : "TẮT"), 0).show();
    }

    private View buildLandscape() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16250872);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = dp(14);
        frameLayout.addView(this.clock, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams2.topMargin = dp(44);
        frameLayout.addView(this.eta, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(buildCircles(), mw(-2, -2));
        LinearLayout.LayoutParams layoutParamsMw = mw(-2, -2);
        layoutParamsMw.topMargin = dp(16);
        linearLayout.addView(buildAlerts(), layoutParamsMw);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        return frameLayout;
    }

    private View buildPortrait() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16250872);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = dp(14);
        frameLayout.addView(this.clock, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 49);
        layoutParams2.topMargin = dp(46);
        layoutParams2.leftMargin = dp(14);
        layoutParams2.rightMargin = dp(14);
        frameLayout.addView(this.eta, layoutParams2);
        float f2 = getResources().getDisplayMetrics().density;
        float fMax = Math.max(0.32f, Math.min(getSharedPreferences("waze_hud_gw", 0).getInt("hud_size", 100) / 100.0f, Math.min(Math.max(0.32f, ((getResources().getDisplayMetrics().widthPixels / f2) - 28.0f) / 588.0f), Math.max(0.32f, ((getResources().getDisplayMetrics().heightPixels / f2) - 110.0f) / 560.0f))));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(dp(14), 0, dp(14), dp(10));
        View viewBuildNavBlock = buildNavBlock(dp((int) (244.0f * fMax)), fMax);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = dp(10);
        linearLayout.addView(viewBuildNavBlock, layoutParams3);
        linearLayout.addView(buildPortraitV1Gauges(fMax), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = dp(14);
        linearLayout.addView(buildAlerts(), layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2, 17);
        layoutParams5.topMargin = dp(64);
        frameLayout.addView(linearLayout, layoutParams5);
        return frameLayout;
    }

    private View buildPortraitV1Gauges(float f2) {
        this.gaugeScale = f2;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        int iDp = dp((int) (256.0f * f2));
        this.limitDiameter = iDp;
        int i2 = (int) (154.0f * f2);
        this.minimumDiameter = dp(i2);
        this.minimumLeft = dp(i2);
        this.minimumTop = dp((int) (142.0f * f2));
        this.limitStack = new FrameLayout(this);
        this.limitStack.setClipChildren(false);
        this.limitStack.setClipToPadding(false);
        this.limit = text((int) (104.0f * f2), -16777216, 17, true);
        extraBold(this.limit);
        ModTypeface.applySpeed(this.limit);
        this.limit.setBackground(oval(-1, dp((int) (27.0f * f2)), RING_OVER));
        this.limitStack.addView(this.limit, new FrameLayout.LayoutParams(iDp, iDp));
        this.minimumLimit = text((int) (67.0f * f2), -1, 17, true);
        this.minimumLimit.setIncludeFontPadding(false);
        extraBold(this.minimumLimit);
        ModTypeface.applySpeed(this.minimumLimit);
        this.minimumLimit.setBackground(oval(-16035917, 0, -16035917));
        this.minimumLimit.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.minimumDiameter, this.minimumDiameter);
        layoutParams.leftMargin = this.minimumLeft;
        layoutParams.topMargin = this.minimumTop;
        this.limitStack.addView(this.minimumLimit, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iDp, iDp);
        layoutParams2.rightMargin = dp(16);
        linearLayout2.addView(this.limitStack, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(17);
        this.spkStroke = dp((int) (14.0f * f2));
        this.spkRing = oval(-15461346, this.spkStroke, RING_OK);
        linearLayout3.setBackground(this.spkRing);
        this.speed = text((int) (74.0f * f2), -1, 17, true);
        extraBold(this.speed);
        ModTypeface.applySpeed(this.speed);
        TextView textViewText = text((int) (26.0f * f2), -5327686, 17, true);
        textViewText.setText("km/h");
        linearLayout3.addView(this.speed, mw(-2, -2));
        linearLayout3.addView(textViewText, mw(-2, -2));
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(iDp, iDp));
        linearLayout.addView(linearLayout2);
        this.avgSign = new ImageView(this);
        this.avgSign.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.avgSign.setVisibility(8);
        int i3 = (int) (f2 * 82.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dp(i3), dp(i3));
        layoutParams3.topMargin = dp(8);
        linearLayout.addView(this.avgSign, layoutParams3);
        return linearLayout;
    }

    private View buildV2() {
        FrameLayout frameLayout = new FrameLayout(this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16448250);
        gradientDrawable.setCornerRadius(dp(10));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setPadding(dp(18), dp(12), dp(18), dp(12));
        this.clock.setTextSize(20.0f);
        this.clock.setTextColor(-1644566);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-16448250);
        gradientDrawable2.setStroke(dp(1), -4736063);
        gradientDrawable2.setCornerRadius(dp(4));
        this.clock.setBackground(gradientDrawable2);
        this.clock.setPadding(dp(24), dp(4), dp(24), dp(4));
        frameLayout.addView(this.clock, new FrameLayout.LayoutParams(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        this.v2RouteSummary = text(19, -2565409, 17, true);
        this.v2RouteSummary.setSingleLine(true);
        LinearLayout.LayoutParams layoutParamsMw = mw(-2, -2);
        layoutParamsMw.bottomMargin = dp(6);
        linearLayout2.addView(this.v2RouteSummary, layoutParamsMw);
        linearLayout2.addView(buildV2NavBlock(1.0f), mw(-2, -2));
        this.avgSign = new ImageView(this);
        this.avgSign.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.avgSign.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(62), dp(62));
        layoutParams.topMargin = dp(8);
        linearLayout2.addView(this.avgSign, layoutParams);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -1, 0.27f));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(17);
        linearLayout3.addView(buildV2Gauges(1.0f));
        this.v2RoadName = text(20, -1512980, 17, true);
        this.v2RoadName.setSingleLine(true);
        this.v2RoadName.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(2);
        linearLayout3.addView(this.v2RoadName, layoutParams2);
        this.laneStrip = new LaneGuidanceStrip(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dp(250), dp(54));
        layoutParams3.topMargin = dp(2);
        linearLayout3.addView(this.laneStrip, layoutParams3);
        linearLayout.addView(linearLayout3, new LinearLayout.LayoutParams(0, -1, 0.46f));
        this.alertsBox = new LinearLayout(this);
        this.alertsBox.setOrientation(1);
        this.alertsBox.setGravity(17);
        linearLayout.addView(this.alertsBox, new LinearLayout.LayoutParams(0, -1, 0.27f));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.topMargin = dp(42);
        layoutParams4.bottomMargin = dp(8);
        frameLayout.addView(linearLayout, layoutParams4);
        return frameLayout;
    }

    private View buildV2Portrait() {
        FrameLayout frameLayout = new FrameLayout(this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16448250);
        gradientDrawable.setCornerRadius(dp(10));
        frameLayout.setBackground(gradientDrawable);
        this.clock.setTextSize(18.0f);
        this.clock.setTextColor(-1644566);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-16448250);
        gradientDrawable2.setStroke(dp(1), -4736063);
        gradientDrawable2.setCornerRadius(dp(4));
        this.clock.setBackground(gradientDrawable2);
        this.clock.setPadding(dp(20), dp(4), dp(20), dp(4));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = dp(12);
        frameLayout.addView(this.clock, layoutParams);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(dp(12), 0, dp(12), dp(10));
        linearLayout.addView(buildV2PortraitGauges());
        this.v2RoadName = text(18, -1512980, 17, true);
        this.v2RoadName.setSingleLine(true);
        this.v2RoadName.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(2);
        linearLayout.addView(this.v2RoadName, layoutParams2);
        this.laneStrip = new LaneGuidanceStrip(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_2), dp(50));
        layoutParams3.topMargin = dp(2);
        linearLayout.addView(this.laneStrip, layoutParams3);
        View viewBuildV2PortraitNavBlock = buildV2PortraitNavBlock();
        LinearLayout.LayoutParams layoutParamsMw = mw(-1, -2);
        layoutParamsMw.topMargin = dp(4);
        linearLayout.addView(viewBuildV2PortraitNavBlock, layoutParamsMw);
        this.v2RouteSummary = text(17, -2565409, 17, true);
        this.v2RouteSummary.setSingleLine(true);
        LinearLayout.LayoutParams layoutParamsMw2 = mw(-2, -2);
        layoutParamsMw2.topMargin = dp(4);
        linearLayout.addView(this.v2RouteSummary, layoutParamsMw2);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        this.avgSign = new ImageView(this);
        this.avgSign.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.avgSign.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(dp(54), dp(54));
        layoutParams4.rightMargin = dp(6);
        linearLayout2.addView(this.avgSign, layoutParams4);
        this.alertsBox = new LinearLayout(this);
        this.alertsBox.setOrientation(0);
        this.alertsBox.setGravity(17);
        linearLayout2.addView(this.alertsBox, mw(-2, -2));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = dp(5);
        linearLayout.addView(linearLayout2, layoutParams5);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2, 17);
        layoutParams6.topMargin = dp(56);
        frameLayout.addView(linearLayout, layoutParams6);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View buildV2PortraitGauges() {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.HudActivity.buildV2PortraitGauges():android.view.View");
    }

    private View buildV2PortraitNavBlock() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(dp(12), dp(7), dp(12), dp(7));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1726736609);
        gradientDrawable.setCornerRadius(dp(18));
        gradientDrawable.setStroke(dp(1), 1431198056);
        linearLayout.setBackground(gradientDrawable);
        int iDp = dp(104);
        FrameLayout frameLayout = new FrameLayout(this);
        this.navTurn = new ImageView(this);
        this.navTurn.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.navTurn.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(this.navTurn, new FrameLayout.LayoutParams(iDp, iDp));
        this.exitNum = text(30, -1, 17, true);
        extraBold(this.exitNum);
        this.exitNum.setVisibility(8);
        frameLayout.addView(this.exitNum, new FrameLayout.LayoutParams(iDp, iDp));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(iDp, iDp));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(8388627);
        this.navDist = text(32, -1, GravityCompat.START, true);
        extraBold(this.navDist);
        linearLayout2.addView(this.navDist, mw(-2, -2));
        this.navStreet = text(20, AmbientTheme.color(this), GravityCompat.START, true);
        this.navStreet.setMaxLines(2);
        this.navStreet.setEllipsize(TextUtils.TruncateAt.END);
        this.navStreet.setMaxWidth(dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11));
        this.navStreet.setVisibility(8);
        LinearLayout.LayoutParams layoutParamsMw = mw(-2, -2);
        layoutParamsMw.topMargin = dp(2);
        linearLayout2.addView(this.navStreet, layoutParamsMw);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.leftMargin = dp(12);
        linearLayout.addView(linearLayout2, layoutParams);
        this.navWrap = linearLayout;
        this.navWrap.setVisibility(8);
        return linearLayout;
    }

    private View buildV2NavBlock(float f2) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iDp = dp((int) (118.0f * f2));
        FrameLayout frameLayout = new FrameLayout(this);
        this.navTurn = new ImageView(this);
        this.navTurn.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.navTurn.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(this.navTurn, new FrameLayout.LayoutParams(iDp, iDp));
        this.exitNum = text((int) (34.0f * f2), -1, 17, true);
        extraBold(this.exitNum);
        this.exitNum.setVisibility(8);
        frameLayout.addView(this.exitNum, new FrameLayout.LayoutParams(iDp, iDp));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(iDp, iDp));
        this.navDist = text((int) (30.0f * f2), -1, 17, true);
        extraBold(this.navDist);
        linearLayout.addView(this.navDist, mw(-2, -2));
        this.navStreet = text((int) (19.0f * f2), AmbientTheme.color(this), 17, true);
        this.navStreet.setMaxLines(2);
        this.navStreet.setEllipsize(TextUtils.TruncateAt.END);
        this.navStreet.setMaxWidth(dp((int) (f2 * 300.0f)));
        this.navStreet.setVisibility(8);
        LinearLayout.LayoutParams layoutParamsMw = mw(-2, -2);
        layoutParamsMw.topMargin = dp(3);
        linearLayout.addView(this.navStreet, layoutParamsMw);
        this.navWrap = linearLayout;
        this.navWrap.setVisibility(8);
        return linearLayout;
    }

    private View buildV2Gauges(float f2) {
        float f3 = getResources().getDisplayMetrics().density;
        this.gaugeScale = Math.max(0.32f, Math.min(1.25f, Math.min((getSharedPreferences("waze_hud_gw", 0).getInt("hud_size", 100) / 100.0f) * f2, Math.min(Math.max(0.32f, (((getResources().getDisplayMetrics().widthPixels / f3) * 0.46f) - 18.0f) / 410.0f), Math.max(0.32f, ((getResources().getDisplayMetrics().heightPixels / f3) - 76.0f) / 310.0f)))));
        float f4 = this.gaugeScale;
        int iDp = dp((int) (410.0f * f4));
        int iDp2 = dp((int) (292.0f * f4));
        FrameLayout frameLayout = new FrameLayout(this);
        this.limitDiameter = dp((int) (224.0f * f4));
        this.minimumDiameter = dp((int) (112.0f * f4));
        this.minimumLeft = dp((int) (166.0f * f4));
        this.minimumTop = dp((int) (162.0f * f4));
        this.limitStack = new FrameLayout(this);
        this.limitStack.setClipChildren(false);
        this.limitStack.setClipToPadding(false);
        this.limit = text((int) (98.0f * f4), -16777216, 17, true);
        extraBold(this.limit);
        ModTypeface.applySpeed(this.limit);
        this.limit.setBackground(oval(-1, dp((int) (23.0f * f4)), RING_OVER));
        this.limitStack.addView(this.limit, new FrameLayout.LayoutParams(this.limitDiameter, this.limitDiameter));
        this.minimumLimit = text((int) (58.0f * f4), -1, 17, true);
        this.minimumLimit.setIncludeFontPadding(false);
        extraBold(this.minimumLimit);
        ModTypeface.applySpeed(this.minimumLimit);
        this.minimumLimit.setBackground(oval(-16035917, 0, -16035917));
        this.minimumLimit.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.minimumDiameter, this.minimumDiameter);
        layoutParams.leftMargin = this.minimumLeft;
        layoutParams.topMargin = this.minimumTop;
        this.limitStack.addView(this.minimumLimit, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.limitDiameter, this.limitDiameter);
        layoutParams2.leftMargin = dp((int) (22.0f * f4));
        layoutParams2.topMargin = dp((int) (10.0f * f4));
        frameLayout.addView(this.limitStack, layoutParams2);
        int iDp3 = dp((int) (130.0f * f4));
        HudSpeedometerDial hudSpeedometerDial = new HudSpeedometerDial(this);
        this.v2Speedometer = hudSpeedometerDial;
        this.speed = hudSpeedometerDial.speedText();
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iDp3, iDp3);
        layoutParams3.leftMargin = dp((int) (270.0f * f4));
        layoutParams3.topMargin = dp((int) (f4 * 68.0f));
        frameLayout.addView(hudSpeedometerDial, layoutParams3);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(iDp, iDp2));
        return frameLayout;
    }

    private LinearLayout buildCircles() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        float f2 = getResources().getDisplayMetrics().density;
        float fMax = Math.max(0.3f, Math.min(getSharedPreferences("waze_hud_gw", 0).getInt("hud_size", 100) / 100.0f, Math.min(Math.max(0.3f, ((getResources().getDisplayMetrics().widthPixels / f2) - 30.0f) / 920.0f), Math.max(0.3f, ((getResources().getDisplayMetrics().heightPixels / f2) - 100.0f) / 330.0f))));
        this.gaugeScale = fMax;
        int i2 = (int) (256.0f * fMax);
        int iDp = dp(i2);
        int iDp2 = dp(i2);
        linearLayout.addView(buildNavBlock(iDp2, fMax));
        this.limitDiameter = iDp;
        int i3 = (int) (154.0f * fMax);
        this.minimumDiameter = dp(i3);
        this.minimumLeft = dp(i3);
        this.minimumTop = dp((int) (142.0f * fMax));
        this.limitStack = new FrameLayout(this);
        this.limitStack.setClipChildren(false);
        this.limitStack.setClipToPadding(false);
        this.limit = text((int) (104.0f * fMax), -16777216, 17, true);
        extraBold(this.limit);
        ModTypeface.applySpeed(this.limit);
        this.limit.setBackground(oval(-1, dp((int) (27.0f * fMax)), RING_OVER));
        this.limitStack.addView(this.limit, new FrameLayout.LayoutParams(iDp, iDp));
        this.minimumLimit = text((int) (67.0f * fMax), -1, 17, true);
        this.minimumLimit.setIncludeFontPadding(false);
        extraBold(this.minimumLimit);
        ModTypeface.applySpeed(this.minimumLimit);
        this.minimumLimit.setBackground(oval(-16035917, 0, -16035917));
        this.minimumLimit.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.minimumDiameter, this.minimumDiameter);
        layoutParams.leftMargin = this.minimumLeft;
        layoutParams.topMargin = this.minimumTop;
        this.limitStack.addView(this.minimumLimit, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iDp, iDp);
        layoutParams2.rightMargin = dp(48);
        linearLayout.addView(this.limitStack, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        this.spkStroke = dp((int) (14.0f * fMax));
        this.spkRing = oval(-15461346, this.spkStroke, RING_OK);
        linearLayout2.setBackground(this.spkRing);
        this.speed = text((int) (74.0f * fMax), -1, 17, true);
        extraBold(this.speed);
        ModTypeface.applySpeed(this.speed);
        TextView textViewText = text((int) (26.0f * fMax), -5327686, 17, true);
        textViewText.setText("km/h");
        linearLayout2.addView(this.speed, mw(-2, -2));
        linearLayout2.addView(textViewText, mw(-2, -2));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(iDp2, iDp2));
        this.avgSign = new ImageView(this);
        this.avgSign.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.avgSign.setVisibility(8);
        int iDp3 = dp((int) (fMax * 150.0f));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iDp3, iDp3);
        layoutParams3.leftMargin = dp(40);
        linearLayout.addView(this.avgSign, layoutParams3);
        return linearLayout;
    }

    private LinearLayout buildAlerts() {
        this.alertsBox = new LinearLayout(this);
        this.alertsBox.setOrientation(0);
        this.alertsBox.setGravity(17);
        return this.alertsBox;
    }

    private View buildNavBlock(int i2, float f2) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        this.laneStrip = new LaneGuidanceStrip(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp((int) (210.0f * f2)), dp((int) (66.0f * f2)));
        layoutParams.bottomMargin = dp((int) (4.0f * f2));
        linearLayout.addView(this.laneStrip, layoutParams);
        int iDp = dp((int) (190.0f * f2));
        FrameLayout frameLayout = new FrameLayout(this);
        this.navTurn = new ImageView(this);
        this.navTurn.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.navTurn.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(this.navTurn, new FrameLayout.LayoutParams(iDp, iDp));
        this.exitNum = text((int) (52.0f * f2), -1, 17, true);
        extraBold(this.exitNum);
        this.exitNum.setVisibility(8);
        frameLayout.addView(this.exitNum, new FrameLayout.LayoutParams(iDp, iDp));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(iDp, iDp));
        this.navDist = text((int) (46.0f * f2), -1, 17, true);
        extraBold(this.navDist);
        linearLayout.addView(this.navDist, mw(-2, -2));
        this.navStreet = text((int) (25.0f * f2), AmbientTheme.color(this), 17, true);
        this.navStreet.setMaxLines(2);
        this.navStreet.setEllipsize(TextUtils.TruncateAt.END);
        this.navStreet.setMaxWidth(i2 - dp((int) (12.0f * f2)));
        this.navStreet.setVisibility(8);
        LinearLayout.LayoutParams layoutParamsMw = mw(-2, -2);
        layoutParamsMw.topMargin = dp((int) (f2 * 3.0f));
        linearLayout.addView(this.navStreet, layoutParamsMw);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, -2);
        layoutParams2.rightMargin = dp(48);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams2);
        this.navWrap = linearLayout;
        this.navWrap.setVisibility(8);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void rebuildAlerts(java.util.List<java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.HudActivity.rebuildAlerts(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateV2ActiveAlert(List<String> list) {
        String str;
        Bitmap bitmapPin;
        if (Gateway.avgZone) {
            bitmapPin = Signs.pin(this, "no_passing_in");
            str = "avg";
        } else if (Gateway.parkingRestriction > 0) {
            str = "parking:" + Gateway.parkingRestriction;
            bitmapPin = Signs.pin(this, Gateway.parkingRestriction == 1 ? "no_parking" : "no_stopping_and_parking");
        } else if (list == null) {
            str = "";
            bitmapPin = null;
        } else {
            String str2 = "";
            Bitmap bitmap = null;
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    bitmapPin = bitmap;
                    str = str2;
                    break;
                }
                String[] strArrSplit = list.get(i2).split("\t");
                if (strArrSplit.length >= 5 && strArrSplit[4].length() != 0 && !isUpcomingSpeedIcon(strArrSplit[4])) {
                    try {
                        int i3 = Integer.parseInt(strArrSplit[3]);
                        if (i3 >= 0 && i3 <= 180) {
                            str = "alert:" + strArrSplit[4];
                            Bitmap bitmapAlertIcon = Signs.alertIcon(this, strArrSplit[4]);
                            if (bitmapAlertIcon != null) {
                                bitmapPin = bitmapAlertIcon;
                                break;
                            } else {
                                str2 = str;
                                bitmap = bitmapAlertIcon;
                            }
                        }
                    } catch (Throwable th) {
                    }
                }
                i2++;
            }
        }
        if (str.length() == 0 || bitmapPin == null) {
            if (this.v2ActiveKey.length() != 0) {
                this.v2ActiveKey = "";
                this.avgSign.setImageDrawable(null);
            }
            this.avgSign.setVisibility(8);
            return;
        }
        if (!str.equals(this.v2ActiveKey)) {
            this.v2ActiveKey = str;
            this.avgSign.setImageBitmap(bitmapPin);
        }
        this.avgSign.setVisibility(0);
    }

    private static boolean isUpcomingSpeedIcon(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("speeddrop_");
    }

    private Bitmap loadIcon(String str) {
        Bitmap bitmapDecodeStream;
        Bitmap bitmap = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (this.iconCache.containsKey(str)) {
            return this.iconCache.get(str);
        }
        String strSubstring = str.startsWith("icon_") ? str.substring(5) : str;
        int i2 = 2;
        String[] strArr = str.equals(strSubstring) ? new String[]{str} : new String[]{str, strSubstring};
        String[] strArr2 = {"res/skins/default/alert_icons/", "res/skins/default/"};
        String[] strArr3 = {"@3x", "@2x", ""};
        int length = strArr.length;
        int i3 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            String str2 = strArr[i3];
            int i4 = 0;
            while (i4 < i2) {
                String str3 = strArr2[i4];
                Bitmap bitmap2 = bitmap;
                for (int i5 = 0; i5 < 3; i5++) {
                    try {
                        InputStream inputStreamOpen = getAssets().open(str3 + str2 + strArr3[i5] + ".png");
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th) {
                            bitmap2 = bitmapDecodeStream;
                        }
                    } catch (Throwable th2) {
                    }
                    if (bitmapDecodeStream != null) {
                        bitmap = bitmapDecodeStream;
                        break loop0;
                    }
                    bitmap2 = bitmapDecodeStream;
                }
                i4++;
                bitmap = bitmap2;
                i2 = 2;
            }
            i3++;
            i2 = 2;
        }
        this.iconCache.put(str, bitmap);
        return bitmap;
    }

    private TextView text(int i2, int i3, int i4, boolean z) {
        TextView textView = new TextView(this);
        textView.setTextSize(i2);
        textView.setTextColor(i3);
        textView.setGravity(i4);
        if (z) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        return textView;
    }

    private void extraBold(TextView textView) {
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(textView.getTextSize() * 0.055f);
    }

    private GradientDrawable oval(int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i4);
        return gradientDrawable;
    }

    private LinearLayout.LayoutParams mw(int i2, int i3) {
        return new LinearLayout.LayoutParams(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int dp(int i2) {
        return (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String fmtDist(int i2) {
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
    public String fmtMin(int i2) {
        return i2 < 0 ? "" : i2 < 60 ? i2 + " phút" : String.format(Locale.US, "%dh%02dm", Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int turnDrawable(int i2) {
        String strDrawableName = HudManeuverAssets.drawableName(i2);
        int identifier = getResources().getIdentifier(strDrawableName, "drawable", getPackageName());
        return identifier == 0 ? getResources().getIdentifier(strDrawableName, "drawable", "com.waze") : identifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyNavTint(int i2) {
        if (!HudManeuverAssets.preserveArtwork(i2)) {
            this.navTurn.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        } else {
            this.navTurn.clearColorFilter();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.vignette != null) {
            this.vignette.setActive(false);
        }
        super.onDestroy();
        this.f24291h.removeCallbacks(this.tick);
        this.f24291h.removeCallbacks(this.resizeRecreate);
    }
}
