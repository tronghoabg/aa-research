package com.carstream.tech.launcher;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class Ui {
    private static final float CHU_K = 1.15f;
    private static final float FULL_DP = 1024.0f;
    private static final String PREF = "ui";
    public static final int R_CARD = 28;
    public static final int R_CELL = 22;
    public static final int R_ICON = 19;
    public static final int R_PANE = 24;
    public static final int R_PILL = 999;
    public static final int R_QS = 22;
    public static final int R_TILE = 16;
    public static int demVer;
    private static final List<Runnable> nguoiNghe = new CopyOnWriteArrayList();
    public int bg;
    public int bg2;
    public int blue;
    public int card;
    public int card2;
    public float d;
    public int green;
    public float k = 1.0f;
    public int kinhMau;
    public boolean night;
    public int orange;
    public int paneW;
    public int press;
    public int red;
    public int sub;
    public int text;
    public int tint;
    public int vien;

    public Ui(Context context) {
        refresh(context);
    }

    public static void boDangKyDoiDem(Runnable runnable) {
        nguoiNghe.remove(runnable);
    }

    public static String cap(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static int chedoDem(Context context) {
        try {
            return context.getSharedPreferences(PREF, 0).getInt("dem", 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void clipRound(View view, final float f) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.carstream.tech.launcher.Ui.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
            }
        });
        view.setClipToOutline(true);
    }

    public static void dangKyDoiDem(Runnable runnable) {
        if (runnable != null) {
            nguoiNghe.add(runnable);
        }
    }

    public static void datChedoDem(Context context, int i) {
        try {
            context.getSharedPreferences(PREF, 0).edit().putInt("dem", i).apply();
        } catch (Throwable unused) {
        }
        demVer++;
        Iterator<Runnable> it = nguoiNghe.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Throwable unused2) {
            }
        }
    }

    public static GradientDrawable round(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        return gradientDrawable;
    }

    public static GradientDrawable roundStroke(int i, float f, int i2, int i3) {
        GradientDrawable gradientDrawableRound = round(i, f);
        gradientDrawableRound.setStroke(i2, i3);
        return gradientDrawableRound;
    }

    public Drawable bgDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.bg, this.bg2});
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setGradientType(1);
        gradientDrawable2.setGradientCenter(0.22f, 0.0f);
        gradientDrawable2.setGradientRadius(Math.max(this.paneW * 0.9f, 1.0f));
        gradientDrawable2.setColors(new int[]{this.night ? 504005887 : 436239103, 0});
        return new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
    }

    public int dp(float f) {
        return Math.round(f * this.d);
    }

    public GradientDrawable kinh(float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.kinhMau);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setStroke(Math.max(1, dp(1.0f)), this.vien);
        return gradientDrawable;
    }

    public void refresh(Context context) {
        this.d = context.getResources().getDisplayMetrics().density;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        this.paneW = i;
        this.k = Math.max(0.58f, Math.min(1.0f, i / (this.d * FULL_DP)));
        int iChedoDem = chedoDem(context);
        boolean z = true;
        if (iChedoDem != 1 && (iChedoDem != 0 || (context.getResources().getConfiguration().uiMode & 48) != 32)) {
            z = false;
        }
        this.night = z;
        int i2 = ViewCompat.MEASURED_STATE_MASK;
        this.bg = z ? -16777216 : -723463;
        this.bg2 = z ? -16119284 : -1249805;
        this.card = z ? -14935010 : -1;
        this.card2 = z ? -13882322 : -1447442;
        if (z) {
            i2 = -1;
        }
        this.text = i2;
        this.sub = z ? -6776673 : -7434605;
        this.blue = z ? -16087809 : -16745729;
        this.green = z ? -13577896 : -13318311;
        this.red = z ? -47814 : -50384;
        this.orange = z ? -24822 : -27392;
        this.vien = z ? -2141957032 : 524041283;
        this.kinhMau = z ? -954459106 : -939524097;
        this.tint = z ? 940213503 : 520125183;
        this.press = z ? -13882322 : -1710614;
    }

    public int s(float f) {
        return Math.max(1, Math.round(f * this.d * this.k));
    }

    public float sp(float f) {
        return f * this.k * CHU_K;
    }

    public GradientDrawable the(float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.card);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setStroke(Math.max(1, dp(1.0f)), this.vien);
        return gradientDrawable;
    }

    public GradientDrawable vienThuoc(int i, float f) {
        return round(i, f / 2.0f);
    }
}
