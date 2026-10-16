package com.waze.gw;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.common.C;
import com.waze.gw.Gateway;
import com.waze.strings.DisplayStrings;
import i.b.l.n;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class AaSpeedo {
    private static final String PREFS = "waze_hud_gw";
    private static final String TAG = "WazeGW";
    private static volatile Context appContext;
    private static boolean lastAverageZone;
    private static long lastErrorLogMs;
    private static boolean lastSpeedSignBold;
    private static int program;
    private static volatile SharedPreferences sharedPreferences;
    private static int texture;
    private static int textureHeight;
    private static int textureWidth;
    private static volatile SurfaceState surface = new SurfaceState(0, 0, 160, 0, null, null);
    private static int seenGeneration = -1;
    private static int aPosition = -1;
    private static int aTexCoord = -1;
    private static int uTexture = -1;
    private static int lastSpeed = Integer.MIN_VALUE;
    private static int lastLimit = Integer.MIN_VALUE;
    private static int lastMinimum = Integer.MIN_VALUE;
    private static int lastSize = Integer.MIN_VALUE;
    private static int lastDpi = Integer.MIN_VALUE;
    private static int lastLayoutStyle = Integer.MIN_VALUE;
    private static String lastUnits = "";
    private static final FloatBuffer VERTICES = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();

    private static final class SurfaceState {
        final int dpi;
        final int generation;
        final int height;
        final Rect stable;
        final Rect visible;
        final int width;

        SurfaceState(int i2, int i3, int i4, int i5, Rect rect, Rect rect2) {
            this.width = i2;
            this.height = i3;
            this.dpi = i4;
            this.generation = i5;
            this.stable = rect == null ? null : new Rect(rect);
            this.visible = rect2 != null ? new Rect(rect2) : null;
        }
    }

    private AaSpeedo() {
    }

    public static synchronized void onSurface(int i2, int i3, int i4) {
        SurfaceState surfaceState = surface;
        surface = new SurfaceState(Math.max(0, i2), Math.max(0, i3), i4 > 0 ? i4 : 160, surfaceState.generation + 1, surfaceState.stable, surfaceState.visible);
    }

    public static synchronized void onSurfaceDestroyed() {
        SurfaceState surfaceState = surface;
        surface = new SurfaceState(0, 0, surfaceState.dpi, surfaceState.generation + 1, null, null);
    }

    static boolean isSurfaceActive() {
        SurfaceState surfaceState = surface;
        return surfaceState.width > 0 && surfaceState.height > 0;
    }

    public static synchronized void onStableArea(Rect rect) {
        SurfaceState surfaceState = surface;
        surface = new SurfaceState(surfaceState.width, surfaceState.height, surfaceState.dpi, surfaceState.generation, rect, surfaceState.visible);
    }

    public static synchronized void onVisibleArea(Rect rect) {
        SurfaceState surfaceState = surface;
        surface = new SurfaceState(surfaceState.width, surfaceState.height, surfaceState.dpi, surfaceState.generation, surfaceState.stable, rect);
    }

    public static void draw() {
        int iMax;
        try {
            SurfaceState surfaceState = surface;
            int i2 = surfaceState.width;
            int i3 = surfaceState.height;
            int i4 = surfaceState.dpi;
            if (i2 > 0 && i3 > 0 && Gateway.modEnabled() && prefBool("aa_float_speedo", false)) {
                int i5 = -1;
                if (seenGeneration != surfaceState.generation) {
                    seenGeneration = surfaceState.generation;
                    program = 0;
                    texture = 0;
                    uTexture = -1;
                    aTexCoord = -1;
                    aPosition = -1;
                    invalidateTexture();
                }
                if (ensureProgram()) {
                    Rect rectSafeArea = safeArea(surfaceState);
                    int iMax2 = Math.max(6, Math.round(Math.max(0.75f, i4 / 160.0f) * 12.0f));
                    int iClamp = clamp(prefInt("aa_fs_size", 100), 60, 180);
                    int iClampLayoutStyle = clampLayoutStyle(prefInt("aa_fs_layout", 3));
                    Gateway.AaSpeedSnapshot aaSpeedSnapshotAaPhoneSpeedSnapshot = Gateway.aaPhoneSpeedSnapshot();
                    boolean z = ((aaSpeedSnapshotAaPhoneSpeedSnapshot.elapsedRealtimeMs > 0L ? 1 : (aaSpeedSnapshotAaPhoneSpeedSnapshot.elapsedRealtimeMs == 0L ? 0 : -1)) <= 0 ? Long.MAX_VALUE : Math.max(0L, SystemClock.elapsedRealtime() - aaSpeedSnapshotAaPhoneSpeedSnapshot.elapsedRealtimeMs)) <= 8000;
                    if (!z || aaSpeedSnapshotAaPhoneSpeedSnapshot.speed < 0) {
                        iMax = Math.max(0, Gateway.hudSpeed);
                    } else {
                        iMax = aaSpeedSnapshotAaPhoneSpeedSnapshot.speed;
                    }
                    int i6 = (!z || aaSpeedSnapshotAaPhoneSpeedSnapshot.limit < 0) ? Gateway.hudLimit : aaSpeedSnapshotAaPhoneSpeedSnapshot.limit;
                    String str = (!z || aaSpeedSnapshotAaPhoneSpeedSnapshot.units == null || aaSpeedSnapshotAaPhoneSpeedSnapshot.units.isEmpty()) ? Gateway.hudUnits : aaSpeedSnapshotAaPhoneSpeedSnapshot.units;
                    int i7 = Gateway.minimumSpeedLimit;
                    if (i7 >= 10 && i7 <= 160) {
                        i5 = i7;
                    }
                    boolean z2 = Gateway.avgZone;
                    boolean zPrefBool = prefBool("aa_speed_sign_bold", true);
                    if (texture == 0 || iMax != lastSpeed || i6 != lastLimit || i5 != lastMinimum || !same(str, lastUnits) || iClamp != lastSize || i4 != lastDpi || z2 != lastAverageZone || zPrefBool != lastSpeedSignBold || iClampLayoutStyle != lastLayoutStyle) {
                        int i8 = i5;
                        String str2 = str;
                        int i9 = iMax;
                        int i10 = i6;
                        if (!rebuildTexture(i9, str2, i10, i8, iClamp, i4, z2, zPrefBool, iClampLayoutStyle)) {
                            return;
                        }
                        lastSpeed = i9;
                        lastLimit = i10;
                        lastMinimum = i8;
                        lastUnits = str2 == null ? "" : str2;
                        lastSize = iClamp;
                        lastDpi = i4;
                        lastAverageZone = z2;
                        lastSpeedSignBold = zPrefBool;
                        lastLayoutStyle = iClampLayoutStyle;
                    }
                    int i11 = iMax2 * 2;
                    float fMin = Math.min(1.0f, Math.min(Math.max(1, rectSafeArea.width() - i11) / textureWidth, Math.max(1, rectSafeArea.height() - i11) / textureHeight));
                    int iMax3 = Math.max(1, Math.round(textureWidth * fMin));
                    int iMax4 = Math.max(1, Math.round(textureHeight * fMin));
                    int i12 = i2 - iMax3;
                    int iClamp2 = clamp(rectSafeArea.left, 0, Math.max(0, i12));
                    int i13 = i3 - iMax4;
                    int iClamp3 = clamp(rectSafeArea.top, 0, Math.max(0, i13));
                    drawTexture(texture, i2, i3, clamp(rectSafeArea.left + iMax2, iClamp2, clamp(rectSafeArea.right - iMax3, iClamp2, Math.max(iClamp2, i12))), clamp(rectSafeArea.top + iMax2, iClamp3, clamp(rectSafeArea.bottom - iMax4, iClamp3, Math.max(iClamp3, i13))), iMax3, iMax4);
                }
            }
        } catch (Throwable th) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - lastErrorLogMs >= 10000) {
                lastErrorLogMs = jElapsedRealtime;
                Log.w(TAG, "AA speedo draw failed", th);
            }
        }
    }

    private static Rect safeArea(SurfaceState surfaceState) {
        Rect rect = new Rect(0, 0, surfaceState.width, surfaceState.height);
        Rect rectBounded = bounded(surfaceState.stable, rect);
        Rect rectBounded2 = bounded(surfaceState.visible, rect);
        Rect rect2 = new Rect(rect);
        if (valid(rectBounded)) {
            rect2.intersect(rectBounded);
        }
        if (valid(rectBounded2)) {
            Rect rect3 = new Rect(rect2);
            if (rect3.intersect(rectBounded2) && !rect3.isEmpty()) {
                rect2 = rect3;
            } else {
                rect2 = new Rect(rectBounded2);
            }
        }
        if (rect2.isEmpty() && valid(rectBounded)) {
            rect2 = new Rect(rectBounded);
        }
        if (rect2.isEmpty()) {
            rect2 = new Rect(rect);
        }
        return (!rect2.intersect(rect) || rect2.isEmpty()) ? new Rect(rect) : rect2;
    }

    private static Rect bounded(Rect rect, Rect rect2) {
        if (!valid(rect)) {
            return null;
        }
        Rect rect3 = new Rect(rect);
        if (!rect3.intersect(rect2) || rect3.isEmpty()) {
            return null;
        }
        return rect3;
    }

    private static boolean valid(Rect rect) {
        return rect != null && !rect.isEmpty() && rect.width() > 0 && rect.height() > 0;
    }

    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    private static boolean rebuildTexture(int i2, String str, int i3, int i4, int i5, int i6, boolean z, boolean z2, int i7) {
        Canvas canvas;
        Paint paint;
        ?? r10;
        float fMax = Math.max(0.75f, i6 / 160.0f);
        float f2 = i5;
        int iMax = Math.max(48, Math.round(((88.0f * fMax) * f2) / 100.0f));
        float f3 = iMax;
        float f4 = 0.6f * f3;
        int iMax2 = Math.max(30, Math.round(f4));
        int iRound = Math.round((i7 == 2 ? 0.62f : 0.58f) * f3);
        int iRound2 = Math.round((i7 == 2 ? 0.66f : 0.54f) * f3);
        int iMax3 = i4 >= 10 ? Math.max(iMax, iRound + iMax2) : iMax;
        int iMax4 = i4 >= 10 ? Math.max(iMax, iRound2 + iMax2) : iMax;
        int iRound3 = Math.round((i7 == 2 ? 0.76f : 1.08f) * f3);
        int iMax5 = i7 == 2 ? Math.max(30, Math.round(f4)) : iMax;
        boolean z3 = i7 != 4;
        if (z3) {
            iMax3 = Math.max(iMax3, iRound3 + iMax5);
        }
        if (z3) {
            iMax4 = Math.max(iMax4, iMax5 + 0);
        }
        Bitmap bitmapPin = z ? Signs.pin(context(), "no_passing_in") : null;
        int iMax6 = Math.max(3, Math.round(((fMax * 6.0f) * f2) / 100.0f));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, (bitmapPin == null ? 0 : iMax6 + iMax) + iMax3), Math.max(1, Math.max(iMax4, bitmapPin == null ? 0 : iMax)), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        Paint paint2 = new Paint(129);
        float f5 = f3 / 2.0f;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1694177);
        canvas2.drawCircle(f5, f5, f5, paint2);
        paint2.setColor(-1);
        canvas2.drawCircle(f5, f5, 0.79f * f5, paint2);
        drawCenteredSpeedText(canvas2, paint2, i3 >= 10 ? String.valueOf(i3) : "--", f5, f5, f3 * 0.43f, -16777216, z2);
        if (i7 == 2) {
            drawCurrentSpeedBadge(canvas2, paint2, i2, i3, iRound3, 0, iMax5);
            canvas = canvas2;
            paint = paint2;
        } else if (i7 != 3) {
            canvas = canvas2;
            paint = paint2;
        } else {
            drawCurrentSpeedDial(canvas2, paint2, i2, str, i3, iRound3, 0, iMax5);
            canvas = canvas2;
            paint = paint2;
        }
        if (i4 >= 10) {
            float f6 = iMax2;
            float f7 = f6 / 2.0f;
            float f8 = iRound + f7;
            float f9 = iRound2 + f7;
            paint.setColor(-16035917);
            canvas.drawCircle(f8, f9, f7, paint);
            drawCenteredSpeedText(canvas, paint, String.valueOf(i4), f8, f9, f6 * 0.44f, -1, z2);
        }
        if (bitmapPin != null) {
            canvas.drawBitmap(bitmapPin, new Rect(0, 0, bitmapPin.getWidth(), bitmapPin.getHeight()), new RectF(iMax3 + iMax6, 0.0f, r14 + iMax, f3), paint);
        }
        if (texture != 0) {
            r10 = 0;
        } else {
            int[] iArr = new int[1];
            r10 = 0;
            GLES20.glGenTextures(1, iArr, 0);
            texture = iArr[0];
        }
        if (texture == 0) {
            bitmapCreateBitmap.recycle();
            return r10;
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(34016, iArr2, r10);
        GLES20.glActiveTexture(33984);
        GLES20.glGetIntegerv(32873, iArr3, r10);
        GLES20.glBindTexture(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, texture);
        GLES20.glTexParameteri(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, n.ACQUAINTANCETYPE_FIELD_NUMBER, 33071);
        GLES20.glTexParameteri(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, 10243, 33071);
        GLUtils.texImage2D(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, 0, bitmapCreateBitmap, 0);
        GLES20.glBindTexture(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, iArr3[0]);
        GLES20.glActiveTexture(iArr2[0]);
        textureWidth = bitmapCreateBitmap.getWidth();
        textureHeight = bitmapCreateBitmap.getHeight();
        bitmapCreateBitmap.recycle();
        return true;
    }

    private static void drawCurrentSpeedBadge(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6) {
        float f2 = i6;
        float f3 = f2 / 2.0f;
        float f4 = i4 + f3;
        float f5 = i5 + f3;
        boolean z = i3 >= 10 && i2 > i3;
        paint.setShader(null);
        paint.setPathEffect(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1972759);
        canvas.drawCircle(f4, f5, f3, paint);
        float fMax = Math.max(2.0f, 0.035f * f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fMax);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setPathEffect(new DashPathEffect(new float[]{Math.max(3.0f, 0.1f * f2), Math.max(2.0f, 0.06f * f2)}, 0.0f));
        paint.setColor(z ? -50384 : -15299102);
        canvas.drawCircle(f4, f5, f3 - (fMax / 2.0f), paint);
        paint.setPathEffect(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        drawCenteredSpeedText(canvas, paint, i2 >= 0 ? String.valueOf(i2) : "--", f4, f5, f2 * 0.43f, z ? -50384 : -15263459, false);
    }

    private static void drawCurrentSpeedDial(Canvas canvas, Paint paint, int i2, String str, int i3, int i4, int i5, int i6) {
        float f2 = i4;
        float f3 = i6;
        float f4 = f3 / 2.0f;
        float f5 = f2 + f4;
        float f6 = i5;
        float f7 = f6 + f4;
        boolean z = i3 >= 10 && i2 > i3;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-15263198);
        canvas.drawCircle(f5, f7, f4, paint);
        float fMax = Math.max(3.0f, 0.075f * f3);
        float f8 = fMax / 2.0f;
        RectF rectF = new RectF(f2 + f8, f6 + f8, (i4 + i6) - f8, (i5 + i6) - f8);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fMax);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-13617598);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        Paint paint2 = paint;
        float fMax2 = Math.max(0.0f, Math.min(1.0f, i2 / (i3 >= 10 ? i3 : 160.0f)));
        if (fMax2 > 0.0f) {
            paint2.setColor(z ? -50384 : -15279896);
            canvas.drawArc(rectF, 135.0f, 270.0f * fMax2, false, paint2);
            paint2 = paint2;
        }
        paint2.setStrokeCap(Paint.Cap.BUTT);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeWidth(0.0f);
        drawCenteredSpeedText(canvas, paint2, i2 >= 0 ? String.valueOf(i2) : "--", f5, f7 - (0.08f * f3), f3 * 0.38f, z ? -40359 : -1, false);
        drawCenteredText(canvas, paint, displayUnits(str), f5, f7 + (0.29f * f3), f3 * 0.12f, z ? -40359 : -2565409, false);
    }

    private static String displayUnits(String str) {
        if (str == null) {
            return "Km/h";
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.contains("mph") && !lowerCase.contains("mi/h")) {
            return "Km/h";
        }
        return "mph";
    }

    private static boolean same(String str, String str2) {
        return str == null ? str2 == null || str2.isEmpty() : str.equals(str2);
    }

    private static int clampLayoutStyle(int i2) {
        if (i2 == 2 || i2 == 4) {
            return i2;
        }
        return 3;
    }

    private static void drawCenteredText(Canvas canvas, Paint paint, String str, float f2, float f3, float f4, int i2) {
        drawCenteredText(canvas, paint, str, f2, f3, f4, i2, true);
    }

    private static void drawCenteredText(Canvas canvas, Paint paint, String str, float f2, float f3, float f4, int i2, boolean z) {
        Typeface typeface;
        paint.setColor(i2);
        paint.setTextSize(f4);
        if (z) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(z ? Paint.Style.FILL_AND_STROKE : Paint.Style.FILL);
        paint.setStrokeWidth(z ? f4 * 0.035f : 0.0f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.drawText(str, f2, f3 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
    }

    private static void drawCenteredSpeedText(Canvas canvas, Paint paint, String str, float f2, float f3, float f4, int i2, boolean z) {
        Typeface typeface;
        Typeface typefaceSpeed = ModTypeface.speed(context());
        paint.setColor(i2);
        paint.setTextSize(f4);
        if (typefaceSpeed != null) {
            typeface = typefaceSpeed;
        } else {
            typeface = z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        paint.setTextScaleX(typefaceSpeed != null ? 1.16f : 1.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(z ? Paint.Style.FILL_AND_STROKE : Paint.Style.FILL);
        paint.setStrokeWidth(z ? f4 * 0.035f : 0.0f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.drawText(str, f2, f3 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        paint.setTextScaleX(1.0f);
    }

    private static void drawTexture(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f2 = i3;
        float f3 = ((i5 * 2.0f) / f2) - 1.0f;
        float f4 = (((i5 + i7) * 2.0f) / f2) - 1.0f;
        float f5 = i4;
        float f6 = 1.0f - ((i6 * 2.0f) / f5);
        float f7 = 1.0f - (((i6 + i8) * 2.0f) / f5);
        float[] fArr = {f3, f6, 0.0f, 0.0f, f3, f7, 0.0f, 1.0f, f4, f6, 1.0f, 0.0f, f4, f7, 1.0f, 1.0f};
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[4];
        int[] iArr6 = new int[1];
        int[] iArr7 = new int[1];
        int[] iArr8 = new int[1];
        int[] iArr9 = new int[1];
        int[] iArr10 = new int[1];
        int[] iArr11 = new int[1];
        GLES20.glGetIntegerv(35725, iArr, 0);
        GLES20.glGetIntegerv(34016, iArr2, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glGetIntegerv(32873, iArr3, 0);
        GLES20.glGetIntegerv(34964, iArr4, 0);
        GLES20.glGetIntegerv(DisplayStrings.DS_AADC_EDIT_AGE_TITLE, iArr5, 0);
        GLES20.glGetIntegerv(32969, iArr6, 0);
        GLES20.glGetIntegerv(32968, iArr7, 0);
        GLES20.glGetIntegerv(32971, iArr8, 0);
        GLES20.glGetIntegerv(32970, iArr9, 0);
        GLES20.glGetVertexAttribiv(aPosition, 34338, iArr10, 0);
        GLES20.glGetVertexAttribiv(aTexCoord, 34338, iArr11, 0);
        boolean zGlIsEnabled = GLES20.glIsEnabled(DisplayStrings.DS_AAOS_UGC_REPORTS_INCORRECT_JUNCTION);
        boolean zGlIsEnabled2 = GLES20.glIsEnabled(DisplayStrings.DS_ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_YES);
        boolean zGlIsEnabled3 = GLES20.glIsEnabled(DisplayStrings.DS_DETOUR_LABEL_SIMILAR_ETA);
        boolean zGlIsEnabled4 = GLES20.glIsEnabled(DisplayStrings.DS_AAOS_ABOUT_SETTINGS_ABOUT_QR_TEXT);
        boolean zGlIsEnabled5 = GLES20.glIsEnabled(DisplayStrings.DS_ACCOUNT_EXISTS_POINTS);
        GLES20.glDisable(DisplayStrings.DS_ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_YES);
        GLES20.glDisable(DisplayStrings.DS_DETOUR_LABEL_SIMILAR_ETA);
        GLES20.glDisable(DisplayStrings.DS_AAOS_ABOUT_SETTINGS_ABOUT_QR_TEXT);
        GLES20.glDisable(DisplayStrings.DS_ACCOUNT_EXISTS_POINTS);
        GLES20.glEnable(DisplayStrings.DS_AAOS_UGC_REPORTS_INCORRECT_JUNCTION);
        GLES20.glBlendFunc(1, DisplayStrings.DS_REC);
        GLES20.glViewport(0, 0, i3, i4);
        GLES20.glUseProgram(program);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindTexture(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, i2);
        GLES20.glUniform1i(uTexture, 0);
        GLES20.glEnableVertexAttribArray(aPosition);
        GLES20.glVertexAttribPointer(aPosition, 2, 5126, false, 16, (Buffer) VERTICES);
        GLES20.glEnableVertexAttribArray(aTexCoord);
        GLES20.glVertexAttribPointer(aTexCoord, 2, 5126, false, 16, (Buffer) VERTICES);
        GLES20.glDrawArrays(5, 0, 4);
        if (iArr10[0] == 0) {
            GLES20.glDisableVertexAttribArray(aPosition);
        }
        if (iArr11[0] == 0) {
            GLES20.glDisableVertexAttribArray(aTexCoord);
        }
        GLES20.glBindBuffer(34962, iArr4[0]);
        GLES20.glBindTexture(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, iArr3[0]);
        GLES20.glActiveTexture(iArr2[0]);
        GLES20.glUseProgram(iArr[0]);
        GLES20.glViewport(iArr5[0], iArr5[1], iArr5[2], iArr5[3]);
        GLES20.glBlendFuncSeparate(iArr6[0], iArr7[0], iArr8[0], iArr9[0]);
        restore(DisplayStrings.DS_AAOS_UGC_REPORTS_INCORRECT_JUNCTION, zGlIsEnabled);
        restore(DisplayStrings.DS_ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_YES, zGlIsEnabled2);
        restore(DisplayStrings.DS_DETOUR_LABEL_SIMILAR_ETA, zGlIsEnabled3);
        restore(DisplayStrings.DS_AAOS_ABOUT_SETTINGS_ABOUT_QR_TEXT, zGlIsEnabled4);
        restore(DisplayStrings.DS_ACCOUNT_EXISTS_POINTS, zGlIsEnabled5);
    }

    private static boolean ensureProgram() {
        if (program != 0) {
            return true;
        }
        int iCompileShader = compileShader(35633, "attribute vec2 aPosition;attribute vec2 aTexCoord;varying vec2 vTexCoord;void main(){vTexCoord=aTexCoord;gl_Position=vec4(aPosition,0.0,1.0);}");
        int iCompileShader2 = compileShader(35632, "precision mediump float;varying vec2 vTexCoord;uniform sampler2D uTexture;void main(){gl_FragColor=texture2D(uTexture,vTexCoord);}");
        if (iCompileShader == 0 || iCompileShader2 == 0) {
            return false;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iCompileShader);
        GLES20.glAttachShader(iGlCreateProgram, iCompileShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GLES20.glDeleteShader(iCompileShader);
        GLES20.glDeleteShader(iCompileShader2);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(iGlCreateProgram);
            return false;
        }
        program = iGlCreateProgram;
        aPosition = GLES20.glGetAttribLocation(program, "aPosition");
        aTexCoord = GLES20.glGetAttribLocation(program, "aTexCoord");
        uTexture = GLES20.glGetUniformLocation(program, "uTexture");
        return aPosition >= 0 && aTexCoord >= 0 && uTexture >= 0;
    }

    private static int compileShader(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(iGlCreateShader);
            return 0;
        }
        return iGlCreateShader;
    }

    private static void invalidateTexture() {
        textureHeight = 0;
        textureWidth = 0;
        lastDpi = Integer.MIN_VALUE;
        lastSize = Integer.MIN_VALUE;
        lastMinimum = Integer.MIN_VALUE;
        lastLimit = Integer.MIN_VALUE;
        lastSpeed = Integer.MIN_VALUE;
        lastLayoutStyle = Integer.MIN_VALUE;
        lastUnits = "";
        lastAverageZone = false;
    }

    private static void restore(int i2, boolean z) {
        if (z) {
            GLES20.glEnable(i2);
        } else {
            GLES20.glDisable(i2);
        }
    }

    private static Context context() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        try {
            Context context2 = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            if (context2 != null) {
                appContext = context2.getApplicationContext();
            }
            return appContext;
        } catch (Throwable th) {
            return null;
        }
    }

    private static SharedPreferences prefs() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        Context context = context();
        if (context != null) {
            sharedPreferences = context.getSharedPreferences(PREFS, 0);
        }
        return sharedPreferences;
    }

    private static int prefInt(String str, int i2) {
        SharedPreferences sharedPreferencesPrefs = prefs();
        return sharedPreferencesPrefs == null ? i2 : sharedPreferencesPrefs.getInt(str, i2);
    }

    private static boolean prefBool(String str, boolean z) {
        SharedPreferences sharedPreferencesPrefs = prefs();
        return sharedPreferencesPrefs == null ? z : sharedPreferencesPrefs.getBoolean(str, z);
    }

    private static int clamp(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }
}
