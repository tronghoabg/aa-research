package com.waze.gw;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.waze.strings.DisplayStrings;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public class FloatSpeedo extends LinearLayout {
    private static volatile WeakReference<FloatSpeedo> activeView = new WeakReference<>(null);
    private static volatile boolean nativeReportVisible;
    private boolean averageZoneShown;
    private final ImageView avgSign;
    private final FrameLayout currentBadge;
    private final TextView currentSpeed;
    private final TextView currentUnit;
    public volatile int desiredX;
    public volatile int desiredY;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f24290h;
    private int lastLayoutStyle;
    private int lastSize;
    private int lastStyle3RingColor;
    private final TextView limit;
    private final FrameLayout limitStack;
    private final TextView minimumLimit;
    private boolean minimumShown;
    private final boolean previewMode;
    private final Runnable tick;

    public FloatSpeedo(Context context) {
        this(context, false);
    }

    FloatSpeedo(Context context, boolean z) {
        super(context);
        this.f24290h = new Handler(Looper.getMainLooper());
        this.lastSize = -1;
        this.lastLayoutStyle = -1;
        this.desiredX = -1;
        this.desiredY = -1;
        this.tick = new Runnable() { // from class: com.waze.gw.FloatSpeedo.1
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmapPin;
                SharedPreferences sharedPreferences = FloatSpeedo.this.getContext().getSharedPreferences("waze_hud_gw", 0);
                boolean z2 = sharedPreferences.getBoolean("float_speedo", true);
                FloatSpeedo.this.applyConfiguredVisibility(z2);
                if (z2) {
                    int i2 = sharedPreferences.getInt("fs_size", 130);
                    int iClampLayoutStyle = FloatSpeedo.this.clampLayoutStyle(sharedPreferences.getInt("fs_layout", 4));
                    boolean z3 = sharedPreferences.getBoolean("float_speed_sign_bold", true);
                    if (i2 != FloatSpeedo.this.lastSize) {
                        FloatSpeedo.this.lastSize = i2;
                        float f2 = i2 / 100.0f;
                        FloatSpeedo.this.setScaleX(f2);
                        FloatSpeedo.this.setScaleY(f2);
                        FloatSpeedo.this.postClampToDesired();
                    }
                    int i3 = Gateway.hudLimit;
                    float f3 = 42.0f;
                    ModTypeface.fitSpeed(FloatSpeedo.this.limit, i3, 50.0f, 42.0f);
                    FloatSpeedo.this.applySpeedWeight(FloatSpeedo.this.limit, z3, i3 >= 100 ? 0.035f : 0.055f);
                    FloatSpeedo.this.limit.setText(i3 >= 10 ? String.valueOf(i3) : "--");
                    int i4 = Gateway.minimumSpeedLimit;
                    boolean z4 = i4 >= 10 && i4 <= 160;
                    boolean z5 = Gateway.avgZone;
                    if (iClampLayoutStyle != FloatSpeedo.this.lastLayoutStyle || z4 != FloatSpeedo.this.minimumShown || z5 != FloatSpeedo.this.averageZoneShown) {
                        FloatSpeedo.this.lastLayoutStyle = iClampLayoutStyle;
                        FloatSpeedo.this.minimumShown = z4;
                        FloatSpeedo.this.averageZoneShown = z5;
                        FloatSpeedo.this.applyLayoutStyle(iClampLayoutStyle, z4, z5);
                    }
                    FloatSpeedo.this.applySpeedWeight(FloatSpeedo.this.minimumLimit, z3, 0.055f);
                    if (z4) {
                        ModTypeface.fitSpeed(FloatSpeedo.this.minimumLimit, i4, 32.0f, 26.0f);
                        FloatSpeedo.this.minimumLimit.setText(String.valueOf(i4));
                    }
                    FloatSpeedo.this.minimumLimit.setVisibility(z4 ? 0 : 8);
                    int iMax = Math.max(0, Gateway.hudSpeed);
                    TextView textView = FloatSpeedo.this.currentSpeed;
                    float f4 = 34.0f;
                    if (iClampLayoutStyle != 1 && iClampLayoutStyle != 3) {
                        f3 = 34.0f;
                    }
                    if (iClampLayoutStyle != 1) {
                        f4 = iClampLayoutStyle == 3 ? 35.0f : 28.0f;
                    }
                    ModTypeface.fitSpeed(textView, iMax, f3, f4);
                    FloatSpeedo.this.currentSpeed.setText(String.valueOf(iMax));
                    boolean z6 = i3 >= 10 && iMax > i3;
                    FloatSpeedo.this.currentSpeed.setTextColor(z6 ? -50384 : FloatSpeedo.this.currentSpeedColor(iClampLayoutStyle));
                    FloatSpeedo.this.currentUnit.setTextColor((z6 && iClampLayoutStyle == 3) ? -40359 : -2565409);
                    FloatSpeedo.this.currentUnit.setText("Km/h");
                    if (iClampLayoutStyle == 3) {
                        FloatSpeedo.this.applyStyle3Dial(z6);
                    }
                    if (z5) {
                        if (FloatSpeedo.this.avgSign.getDrawable() == null && (bitmapPin = Signs.pin(FloatSpeedo.this.getContext(), "no_passing_in")) != null) {
                            FloatSpeedo.this.avgSign.setImageBitmap(bitmapPin);
                        }
                        FloatSpeedo.this.avgSign.setVisibility(0);
                    } else {
                        FloatSpeedo.this.avgSign.setVisibility(8);
                    }
                }
                FloatSpeedo.this.f24290h.postDelayed(this, 500L);
            }
        };
        this.previewMode = z;
        if (!z) {
            activeView = new WeakReference<>(this);
        }
        setOrientation(0);
        setGravity(16);
        setPivotX(0.0f);
        setPivotY(0.0f);
        int iDp = dp(96);
        this.limitStack = new FrameLayout(context);
        this.limit = mkText(38, -16777216, true);
        extraBold(this.limit);
        ModTypeface.applySpeed(this.limit);
        this.limit.setBackground(oval(-1, dp(10), -1957094));
        this.limitStack.addView(this.limit, new FrameLayout.LayoutParams(iDp, iDp));
        int iDp2 = dp(58);
        this.minimumLimit = mkText(25, -1, true);
        this.minimumLimit.setIncludeFontPadding(false);
        extraBold(this.minimumLimit);
        ModTypeface.applySpeed(this.minimumLimit);
        this.minimumLimit.setBackground(oval(-16035917, 0, -16035917));
        this.minimumLimit.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDp2, iDp2);
        layoutParams.leftMargin = dp(60);
        layoutParams.topMargin = dp(54);
        this.limitStack.addView(this.minimumLimit, layoutParams);
        this.currentBadge = new FrameLayout(context);
        this.currentBadge.setClipChildren(false);
        this.currentBadge.setClipToPadding(false);
        this.currentSpeed = mkText(32, -1, false);
        this.currentSpeed.setIncludeFontPadding(false);
        ModTypeface.applySpeed(this.currentSpeed);
        this.currentUnit = mkText(13, -2565409, false);
        this.currentUnit.setIncludeFontPadding(false);
        this.currentBadge.addView(this.currentSpeed);
        this.currentBadge.addView(this.currentUnit);
        this.limitStack.addView(this.currentBadge);
        addView(this.limitStack, new LinearLayout.LayoutParams(iDp, iDp));
        this.avgSign = new ImageView(context);
        this.avgSign.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iDp, iDp);
        layoutParams2.leftMargin = dp(6);
        addView(this.avgSign, layoutParams2);
        applyLayoutStyle(4, false, false);
        if (!z) {
            setupTouch();
            this.tick.run();
        }
    }

    void configurePreview(int i2, int i3, boolean z) {
        if (this.previewMode) {
            int iClampLayoutStyle = clampLayoutStyle(i2);
            applyLayoutStyle(iClampLayoutStyle, true, false);
            float f2 = 42.0f;
            ModTypeface.fitSpeed(this.limit, 90, 50.0f, 42.0f);
            applySpeedWeight(this.limit, z, 0.055f);
            this.limit.setText(String.valueOf(90));
            ModTypeface.fitSpeed(this.minimumLimit, 60, 32.0f, 26.0f);
            applySpeedWeight(this.minimumLimit, z, 0.055f);
            this.minimumLimit.setText(String.valueOf(60));
            this.minimumLimit.setVisibility(0);
            TextView textView = this.currentSpeed;
            float f3 = 34.0f;
            if (iClampLayoutStyle != 1 && iClampLayoutStyle != 3) {
                f2 = 34.0f;
            }
            if (iClampLayoutStyle != 1) {
                f3 = iClampLayoutStyle == 3 ? 35.0f : 28.0f;
            }
            ModTypeface.fitSpeed(textView, 45, f2, f3);
            this.currentSpeed.setText(String.valueOf(45));
            this.currentSpeed.setTextColor(currentSpeedColor(iClampLayoutStyle));
            this.currentUnit.setTextColor(-2565409);
            this.currentUnit.setText("Km/h");
            if (iClampLayoutStyle == 3) {
                this.lastStyle3RingColor = 0;
                applyStyle3Dial(false);
            }
            float fMax = Math.max(0.8f, Math.min(2.2f, i3 / 100.0f));
            setScaleX(fMax);
            setScaleY(fMax);
            setVisibility(0);
            requestLayout();
        }
    }

    static void setNativeReportVisible(boolean z) {
        nativeReportVisible = z;
        FloatSpeedo floatSpeedo = activeView.get();
        if (floatSpeedo == null) {
            return;
        }
        floatSpeedo.post(new Runnable() { // from class: com.waze.gw.FloatSpeedo.2
            @Override // java.lang.Runnable
            public void run() {
                FloatSpeedo.this.applyConfiguredVisibility(FloatSpeedo.this.getContext().getSharedPreferences("waze_hud_gw", 0).getBoolean("float_speedo", true));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyConfiguredVisibility(boolean z) {
        setVisibility(!z ? 8 : nativeReportVisible ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int clampLayoutStyle(int i2) {
        if (i2 < 1 || i2 > 4) {
            return 4;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyLayoutStyle(int i2, boolean z, boolean z2) {
        int i3;
        int iClampLayoutStyle = clampLayoutStyle(i2);
        this.limitStack.setClipChildren(false);
        this.limitStack.setClipToPadding(false);
        this.currentBadge.setVisibility(iClampLayoutStyle == 4 ? 8 : 0);
        this.currentUnit.setVisibility((iClampLayoutStyle == 1 || iClampLayoutStyle == 3) ? 0 : 8);
        this.currentSpeed.setGravity(17);
        this.currentUnit.setGravity(17);
        if (iClampLayoutStyle == 1) {
            i = z ? DisplayStrings.DS_TRIP_OVERVIEW_ERROR_CANT_CALCULATE_ROUTE_MESSAGE : 200;
            this.limitStack.setBackground(roundRect(-434430167, 54));
            setFrame(this.limit, 96, 96, 6, 6);
            setFrame(this.minimumLimit, 58, 58, 25, 108);
            setFrame(this.currentBadge, 96, 76, 6, z ? 178 : 118);
            setFrame(this.currentSpeed, 96, 50, 0, 0);
            setFrame(this.currentUnit, 96, 26, 0, 49);
            this.currentBadge.setBackground(null);
            this.currentSpeed.setTextSize(42.0f);
            this.currentUnit.setTextSize(16.0f);
            i3 = i;
            i = 108;
        } else if (iClampLayoutStyle == 2) {
            int i4 = z ? 122 : 106;
            this.limitStack.setBackground(null);
            setFrame(this.limit, 96, 96, 0, 10);
            setFrame(this.minimumLimit, 58, 58, 60, 64);
            setFrame(this.currentBadge, 58, 58, 75, 0);
            setFrame(this.currentSpeed, 58, 58, 0, 0);
            setFrame(this.currentUnit, 1, 1, 0, 0);
            GradientDrawable gradientDrawableOval = oval(-1972759, 0, -1972759);
            gradientDrawableOval.setStroke(dp(2), -15299102, dp(5), dp(3));
            this.currentBadge.setBackground(gradientDrawableOval);
            this.currentSpeed.setTextSize(34.0f);
            i3 = i4;
            i = 133;
        } else if (iClampLayoutStyle == 3) {
            int i5 = z2 ? 200 : z ? 114 : 96;
            this.limitStack.setBackground(null);
            setFrame(this.limit, 96, 96, 0, 0);
            setFrame(this.minimumLimit, 58, 58, 60, 54);
            setFrame(this.currentBadge, 96, 96, 104, 0);
            setFrame(this.currentSpeed, 96, 66, 0, 7);
            setFrame(this.currentUnit, 96, 22, 0, 67);
            this.lastStyle3RingColor = 0;
            applyStyle3Dial(false);
            this.currentSpeed.setTextSize(42.0f);
            this.currentUnit.setTextSize(13.0f);
            i3 = i5;
        } else {
            i = z ? 120 : 96;
            i3 = z ? 114 : 96;
            this.limitStack.setBackground(null);
            setFrame(this.limit, 96, 96, 0, 0);
            setFrame(this.minimumLimit, 58, 58, 60, 54);
            setFrame(this.currentBadge, 1, 1, 0, 0);
        }
        placeAverageSign(iClampLayoutStyle);
        this.minimumLimit.bringToFront();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.limitStack.getLayoutParams();
        layoutParams.width = dp(i);
        layoutParams.height = dp(i3);
        this.limitStack.setLayoutParams(layoutParams);
        requestLayout();
        postClampToDesired();
    }

    private void placeAverageSign(int i2) {
        ViewGroup viewGroup = (ViewGroup) this.avgSign.getParent();
        if (i2 == 3) {
            if (viewGroup != this.limitStack) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.avgSign);
                }
                this.limitStack.addView(this.avgSign);
            }
            setFrame(this.avgSign, 96, 96, 0, 104);
            return;
        }
        if (viewGroup != this) {
            if (viewGroup != null) {
                viewGroup.removeView(this.avgSign);
            }
            addView(this.avgSign);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(96), dp(96));
        layoutParams.leftMargin = dp(6);
        this.avgSign.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int currentSpeedColor(int i2) {
        return (i2 == 1 || i2 == 3) ? -1 : -15263459;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyStyle3Dial(boolean z) {
        int i2 = z ? -50384 : -5672705;
        if (this.lastStyle3RingColor == i2) {
            return;
        }
        this.lastStyle3RingColor = i2;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{oval(z ? 1442790192 : 1436245247, 0, z ? 1442790192 : 1436245247), oval(-15592936, dp(4), i2)});
        int iDp = dp(3);
        layerDrawable.setLayerInset(1, iDp, iDp, iDp, iDp);
        this.currentBadge.setBackground(layerDrawable);
    }

    private void setFrame(View view, int i2, int i3, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp(i2), dp(i3));
        layoutParams.leftMargin = dp(i4);
        layoutParams.topMargin = dp(i5);
        view.setLayoutParams(layoutParams);
    }

    private GradientDrawable roundRect(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(dp(i3));
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postClampToDesired() {
        post(new Runnable() { // from class: com.waze.gw.FloatSpeedo.3
            @Override // java.lang.Runnable
            public void run() {
                if (FloatSpeedo.this.desiredX < 0 || FloatSpeedo.this.desiredY < 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = FloatSpeedo.this.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int[] iArrClampXY = FloatSpeedo.this.clampXY(FloatSpeedo.this.desiredX, FloatSpeedo.this.desiredY);
                    if (layoutParams2.leftMargin != iArrClampXY[0] || layoutParams2.topMargin != iArrClampXY[1]) {
                        layoutParams2.gravity = 8388659;
                        layoutParams2.leftMargin = iArrClampXY[0];
                        layoutParams2.topMargin = iArrClampXY[1];
                        FloatSpeedo.this.setLayoutParams(layoutParams2);
                    }
                }
            }
        });
    }

    private void setupTouch() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.waze.gw.FloatSpeedo.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (FloatSpeedo.this.getContext().getSharedPreferences("waze_hud_gw", 0).getBoolean("float_speedo_long_press_hud", true)) {
                    FloatSpeedo.this.openHud();
                }
            }
        });
        final int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnTouchListener(new View.OnTouchListener(this) { // from class: com.waze.gw.FloatSpeedo.5
            float downX;
            float downY;
            float dx;
            float dy;
            boolean moved;
            final /* synthetic */ FloatSpeedo this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gestureDetector.onTouchEvent(motionEvent);
                ViewGroup.LayoutParams layoutParams = this.this$0.getLayoutParams();
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    return true;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        if (this.this$0.getParent() != null) {
                            this.this$0.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.downX = motionEvent.getRawX();
                        this.downY = motionEvent.getRawY();
                        this.moved = false;
                        this.dx = motionEvent.getRawX() - layoutParams2.leftMargin;
                        this.dy = motionEvent.getRawY() - layoutParams2.topMargin;
                        return true;
                    case 1:
                    case 3:
                        if (this.moved) {
                            this.this$0.savePos(layoutParams2.leftMargin, layoutParams2.topMargin);
                        }
                        return true;
                    case 2:
                        if (!this.moved && (Math.abs(motionEvent.getRawX() - this.downX) > scaledTouchSlop || Math.abs(motionEvent.getRawY() - this.downY) > scaledTouchSlop)) {
                            this.moved = true;
                        }
                        if (this.moved) {
                            layoutParams2.gravity = 8388659;
                            int[] iArrClampXY = this.this$0.clampXY((int) (motionEvent.getRawX() - this.dx), (int) (motionEvent.getRawY() - this.dy));
                            layoutParams2.leftMargin = iArrClampXY[0];
                            layoutParams2.topMargin = iArrClampXY[1];
                            this.this$0.setLayoutParams(layoutParams2);
                            this.this$0.savePos(layoutParams2.leftMargin, layoutParams2.topMargin);
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] clampXY(int i2, int i3) {
        int iMax;
        int iMax2;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0 && getWidth() > 0) {
            int width = (int) (getWidth() * getScaleX());
            int height = (int) (getHeight() * getScaleY());
            iMax = Math.max(0, Math.min(i2, Math.max(0, view.getWidth() - width)));
            iMax2 = Math.max(0, Math.min(i3, Math.max(0, view.getHeight() - height)));
        } else {
            iMax = Math.max(0, i2);
            iMax2 = Math.max(0, i3);
        }
        return new int[]{iMax, iMax2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePos(int i2, int i3) {
        this.desiredX = i2;
        this.desiredY = i3;
        getContext().getSharedPreferences("waze_hud_gw", 0).edit().putInt("fs_x", i2).putInt("fs_y", i3).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openHud() {
        try {
            Context context = getContext();
            Intent intentCreateIntent = HudActivity.createIntent(context);
            intentCreateIntent.addFlags(268435456);
            context.startActivity(intentCreateIntent);
        } catch (Throwable th) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24290h.removeCallbacks(this.tick);
        if (activeView.get() == this) {
            activeView.clear();
        }
    }

    private TextView mkText(int i2, int i3, boolean z) {
        TextView textView = new TextView(getContext());
        textView.setTextSize(i2);
        textView.setTextColor(i3);
        textView.setGravity(17);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void applySpeedWeight(TextView textView, boolean z, float f2) {
        Paint.Style style;
        if (textView == null) {
            return;
        }
        TextPaint paint = textView.getPaint();
        if (z) {
            style = Paint.Style.FILL_AND_STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
        textView.getPaint().setStrokeWidth(z ? textView.getTextSize() * f2 : 0.0f);
        textView.invalidate();
    }

    private GradientDrawable oval(int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i4);
        return gradientDrawable;
    }

    private int dp(int i2) {
        return (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
