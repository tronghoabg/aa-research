package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.Motion;
import androidx.core.internal.view.SupportMenu;
import h.g.b.o;
import h.g.b.x;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionRenderDebug {
    private static final int DEBUG_PATH_TICKS_PER_MS = 16;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static final int MAX_KEY_FRAMES = 50;
    private DashPathEffect mDashPathEffect;
    private Paint mFillPaint;
    private int mKeyFrameCount;
    private float[] mKeyFramePoints;
    private Paint mPaint;
    private Paint mPaintGraph;
    private Paint mPaintKeyframes;
    private Path mPath;
    private int[] mPathMode;
    private float[] mPoints;
    private boolean mPresentationMode;
    private final float[] mRectangle;
    private int mShadowTranslate;
    private Paint mTextPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int mRedColor = -21965;
    private final int mKeyframeColor = -2067046;
    private final int mGraphColor = -13391360;
    private final int mShadowColor = 1996488704;
    private final int mDiamondSize = 10;
    private Rect mBounds = new Rect();

    public MotionRenderDebug(float f2) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        this.mPaint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.mPaintKeyframes = paint2;
        paint2.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.mPaintGraph = paint3;
        paint3.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.mTextPaint = paint4;
        paint4.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(f2);
        this.mRectangle = new float[8];
        Paint paint5 = new Paint();
        this.mFillPaint = paint5;
        paint5.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    private final void drawBasicPath(Canvas canvas) {
        float[] fArr = this.mPoints;
        x.c(fArr);
        canvas.drawLines(fArr, this.mPaint);
    }

    private final void drawPathAsConfigured(Canvas canvas) {
        int i2 = this.mKeyFrameCount;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.mPathMode[i3];
            z |= !(i4 != 1);
            z2 |= !(i4 != 0);
        }
        if (z) {
            drawPathRelative(canvas);
        }
        if (z2) {
            drawPathCartesian(canvas);
        }
    }

    private final void drawPathCartesian(Canvas canvas) {
        float[] fArr = this.mPoints;
        x.c(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.mPoints;
        x.c(fArr2);
        float f3 = fArr2[1];
        float[] fArr3 = this.mPoints;
        x.c(fArr3);
        x.c(this.mPoints);
        float f4 = fArr3[r4.length - 2];
        float[] fArr4 = this.mPoints;
        x.c(fArr4);
        x.c(this.mPoints);
        float f5 = fArr4[r5.length - 1];
        canvas.drawLine(Math.min(f2, f4), Math.max(f3, f5), Math.max(f2, f4), Math.max(f3, f5), this.mPaintGraph);
        canvas.drawLine(Math.min(f2, f4), Math.min(f3, f5), Math.min(f2, f4), Math.max(f3, f5), this.mPaintGraph);
    }

    private final void drawPathCartesianTicks(Canvas canvas, float f2, float f3) {
        float[] fArr = this.mPoints;
        x.c(fArr);
        float f4 = fArr[0];
        float[] fArr2 = this.mPoints;
        x.c(fArr2);
        float f5 = fArr2[1];
        float[] fArr3 = this.mPoints;
        x.c(fArr3);
        x.c(this.mPoints);
        float f6 = fArr3[r4.length - 2];
        float[] fArr4 = this.mPoints;
        x.c(fArr4);
        x.c(this.mPoints);
        float f7 = fArr4[r5.length - 1];
        float fMin = Math.min(f4, f6);
        float fMax = Math.max(f5, f7);
        float fMin2 = f2 - Math.min(f4, f6);
        float fMax2 = Math.max(f5, f7) - f3;
        String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((fMin2 / 2.0f) - (this.mBounds.width() / 2)) + fMin, f3 - 20.0f, this.mTextPaint);
        canvas.drawLine(f2, f3, Math.min(f4, f6), f3, this.mPaintGraph);
        String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f7 - f5)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, f2 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(f2, f3, f2, Math.max(f5, f7), this.mPaintGraph);
    }

    private final void drawPathRelative(Canvas canvas) {
        float[] fArr = this.mPoints;
        x.c(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.mPoints;
        x.c(fArr2);
        float f3 = fArr2[1];
        float[] fArr3 = this.mPoints;
        x.c(fArr3);
        x.c(this.mPoints);
        float f4 = fArr3[r1.length - 2];
        float[] fArr4 = this.mPoints;
        x.c(fArr4);
        x.c(this.mPoints);
        canvas.drawLine(f2, f3, f4, fArr4[r1.length - 1], this.mPaintGraph);
    }

    private final void drawPathRelativeTicks(Canvas canvas, float f2, float f3) {
        float[] fArr = this.mPoints;
        x.c(fArr);
        float f4 = fArr[0];
        float[] fArr2 = this.mPoints;
        x.c(fArr2);
        float f5 = fArr2[1];
        float[] fArr3 = this.mPoints;
        x.c(fArr3);
        x.c(this.mPoints);
        float f6 = fArr3[r5.length - 2];
        float[] fArr4 = this.mPoints;
        x.c(fArr4);
        x.c(this.mPoints);
        float f7 = fArr4[r6.length - 1];
        float fHypot = (float) Math.hypot(f4 - f6, f5 - f7);
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        float f10 = (((f2 - f4) * f8) + ((f3 - f5) * f9)) / (fHypot * fHypot);
        float f11 = f4 + (f8 * f10);
        float f12 = f5 + (f10 * f9);
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f11, f12);
        float fHypot2 = (float) Math.hypot(f11 - f2, f12 - f3);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(f2, f3, f11, f12, this.mPaintGraph);
    }

    private final void drawPathScreenTicks(Canvas canvas, float f2, float f3, int i2, int i3, int i4, int i5) {
        String str = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (i4 - i2)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((f2 / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, f3 - 20.0f, this.mTextPaint);
        canvas.drawLine(f2, f3, Math.min(0.0f, 1.0f), f3, this.mPaintGraph);
        String str2 = "" + (((int) ((((f3 - (i3 / 2)) * 100.0f) / (i5 - i3)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, f2 + 5.0f, -((f3 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(f2, f3, f2, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }

    private final void drawRectangle(Canvas canvas, Motion motion) {
        Path path = this.mPath;
        x.c(path);
        path.reset();
        int i2 = 0;
        while (true) {
            motion.buildRect(i2 / 50.0f, this.mRectangle, 0);
            Path path2 = this.mPath;
            x.c(path2);
            float[] fArr = this.mRectangle;
            path2.moveTo(fArr[0], fArr[1]);
            Path path3 = this.mPath;
            x.c(path3);
            float[] fArr2 = this.mRectangle;
            path3.lineTo(fArr2[2], fArr2[3]);
            Path path4 = this.mPath;
            x.c(path4);
            float[] fArr3 = this.mRectangle;
            path4.lineTo(fArr3[4], fArr3[5]);
            Path path5 = this.mPath;
            x.c(path5);
            float[] fArr4 = this.mRectangle;
            path5.lineTo(fArr4[6], fArr4[7]);
            Path path6 = this.mPath;
            x.c(path6);
            path6.close();
            if (i2 == 50) {
                this.mPaint.setColor(1140850688);
                canvas.translate(2.0f, 2.0f);
                Path path7 = this.mPath;
                x.c(path7);
                canvas.drawPath(path7, this.mPaint);
                canvas.translate(-2.0f, -2.0f);
                this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
                Path path8 = this.mPath;
                x.c(path8);
                canvas.drawPath(path8, this.mPaint);
                return;
            }
            i2++;
        }
    }

    private final void drawTicks(Canvas canvas, int i2, int i3, Motion motion, int i4, int i5) {
        int width;
        int height;
        int i6;
        int i7;
        if (motion.getView() != null) {
            width = motion.getView().getWidth();
            height = motion.getView().getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i8 = i3 - 1;
        for (int i9 = 1; i9 < i8; i9++) {
            int i10 = 4;
            if (i2 == 4) {
                if (this.mPathMode[i9 - 1] != 0) {
                    i6 = 4;
                }
            } else {
                i6 = i2;
            }
            float[] fArr = this.mKeyFramePoints;
            int i11 = i9 + i9;
            float f2 = fArr[i11];
            float f3 = fArr[i11 + 1];
            Path path = this.mPath;
            x.c(path);
            path.reset();
            Path path2 = this.mPath;
            x.c(path2);
            path2.moveTo(f2, this.mDiamondSize + f3);
            Path path3 = this.mPath;
            x.c(path3);
            path3.lineTo(this.mDiamondSize + f2, f3);
            Path path4 = this.mPath;
            x.c(path4);
            path4.lineTo(f2, f3 - this.mDiamondSize);
            Path path5 = this.mPath;
            x.c(path5);
            path5.lineTo(f2 - this.mDiamondSize, f3);
            Path path6 = this.mPath;
            x.c(path6);
            path6.close();
            if (i6 == 4) {
                int i12 = this.mPathMode[i9 - 1];
                if (i12 == 1) {
                    drawPathRelativeTicks(canvas, f2 + 0.0f, f3 + 0.0f);
                } else if (i12 == 0) {
                    drawPathCartesianTicks(canvas, f2 + 0.0f, f3 + 0.0f);
                } else {
                    if (i12 == 2) {
                        i7 = 2;
                        drawPathScreenTicks(canvas, f2 + 0.0f, f3 + 0.0f, width, height, i4, i5);
                    }
                    Path path7 = this.mPath;
                    x.c(path7);
                    canvas.drawPath(path7, this.mFillPaint);
                }
                i7 = 2;
                Path path72 = this.mPath;
                x.c(path72);
                canvas.drawPath(path72, this.mFillPaint);
            } else {
                i7 = 2;
                i10 = i6;
            }
            if (i10 == i7) {
                drawPathRelativeTicks(canvas, f2 + 0.0f, f3 + 0.0f);
            }
            if (i10 == 3) {
                drawPathCartesianTicks(canvas, f2 + 0.0f, f3 + 0.0f);
            }
            if (i10 == 6) {
                drawPathScreenTicks(canvas, f2 + 0.0f, f3 + 0.0f, width, height, i4, i5);
            }
            Path path8 = this.mPath;
            x.c(path8);
            canvas.drawPath(path8, this.mFillPaint);
        }
        float[] fArr2 = this.mPoints;
        x.c(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.mPoints;
            x.c(fArr3);
            float f4 = fArr3[0];
            float[] fArr4 = this.mPoints;
            x.c(fArr4);
            canvas.drawCircle(f4, fArr4[1], 8.0f, this.mPaintKeyframes);
            float[] fArr5 = this.mPoints;
            x.c(fArr5);
            x.c(this.mPoints);
            float f5 = fArr5[r3.length - 2];
            float[] fArr6 = this.mPoints;
            x.c(fArr6);
            x.c(this.mPoints);
            canvas.drawCircle(f5, fArr6[r4.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    private final void drawTranslation(Canvas canvas, float f2, float f3, float f4, float f5) {
        canvas.drawRect(f2, f3, f4, f5, this.mPaintGraph);
        canvas.drawLine(f2, f3, f4, f5, this.mPaintGraph);
    }

    public final void basicDraw(Canvas canvas, Motion motion, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        int i6;
        Motion motion2;
        this.mKeyFrameCount = motion.buildKeyFrames(this.mKeyFramePoints, this.mPathMode, null);
        int i7 = i2 / 16;
        int i8 = i7 + i7;
        float[] fArr = this.mPoints;
        if (fArr == null || fArr.length != i8) {
            this.mPoints = new float[i8];
            this.mPath = new Path();
        }
        float f2 = this.mShadowTranslate;
        canvas.translate(f2, f2);
        this.mPaint.setColor(this.mShadowColor);
        this.mFillPaint.setColor(this.mShadowColor);
        this.mPaintKeyframes.setColor(this.mShadowColor);
        this.mPaintGraph.setColor(this.mShadowColor);
        motion.buildPath(this.mPoints, i7);
        if (z) {
            drawBasicPath(canvas);
        }
        if (z2) {
            i5 = i4;
            drawTicks(canvas, 1, this.mKeyFrameCount, motion, i3, i5);
            motion2 = motion;
            i6 = i3;
        } else {
            i5 = i4;
            i6 = i3;
            motion2 = motion;
        }
        this.mPaint.setColor(this.mRedColor);
        this.mPaintKeyframes.setColor(this.mKeyframeColor);
        this.mFillPaint.setColor(this.mKeyframeColor);
        this.mPaintGraph.setColor(this.mGraphColor);
        float f3 = -this.mShadowTranslate;
        canvas.translate(f3, f3);
        if (z) {
            drawBasicPath(canvas);
        }
        if (z2) {
            drawTicks(canvas, 1, this.mKeyFrameCount, motion2, i6, i5);
        }
    }

    public final void draw(Canvas canvas, Motion motion, int i2, int i3, int i4, int i5) {
        int drawPath = motion.getDrawPath();
        if (i3 > 0 && drawPath == 0) {
            drawPath = 1;
        }
        if (drawPath == 0) {
            return;
        }
        this.mKeyFrameCount = motion.buildKeyFrames(this.mKeyFramePoints, this.mPathMode, null);
        if (drawPath > 0) {
            int i6 = i2 / 16;
            float[] fArr = this.mPoints;
            int i7 = i6 + i6;
            if (fArr == null || fArr.length != i7) {
                this.mPoints = new float[i7];
                this.mPath = new Path();
            }
            float f2 = this.mShadowTranslate;
            canvas.translate(f2, f2);
            this.mPaint.setColor(this.mShadowColor);
            this.mFillPaint.setColor(this.mShadowColor);
            this.mPaintKeyframes.setColor(this.mShadowColor);
            this.mPaintGraph.setColor(this.mShadowColor);
            motion.buildPath(this.mPoints, i6);
            int i8 = drawPath;
            drawAll(canvas, i8, this.mKeyFrameCount, motion, i4, i5);
            this.mPaint.setColor(this.mRedColor);
            this.mPaintKeyframes.setColor(this.mKeyframeColor);
            this.mFillPaint.setColor(this.mKeyframeColor);
            this.mPaintGraph.setColor(this.mGraphColor);
            float f3 = -this.mShadowTranslate;
            canvas.translate(f3, f3);
            drawAll(canvas, i8, this.mKeyFrameCount, motion, i4, i5);
            if (i8 == 5) {
                drawRectangle(canvas, motion);
            }
        }
    }

    public final void drawAll(Canvas canvas, int i2, int i3, Motion motion, int i4, int i5) {
        int i6;
        if (i2 == 4) {
            drawPathAsConfigured(canvas);
            i2 = 4;
        }
        if (i2 == 2) {
            drawPathRelative(canvas);
            i6 = 2;
        } else {
            i6 = i2;
        }
        if (i6 == 3) {
            drawPathCartesian(canvas);
        }
        drawBasicPath(canvas);
        drawTicks(canvas, i6, i3, motion, i4, i5);
    }

    public final Rect getMBounds() {
        return this.mBounds;
    }

    public final DashPathEffect getMDashPathEffect() {
        return this.mDashPathEffect;
    }

    public final int getMDiamondSize() {
        return this.mDiamondSize;
    }

    public final Paint getMFillPaint() {
        return this.mFillPaint;
    }

    public final int getMGraphColor() {
        return this.mGraphColor;
    }

    public final int getMKeyFrameCount() {
        return this.mKeyFrameCount;
    }

    public final float[] getMKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public final int getMKeyframeColor() {
        return this.mKeyframeColor;
    }

    public final Paint getMPaint() {
        return this.mPaint;
    }

    public final Paint getMPaintGraph() {
        return this.mPaintGraph;
    }

    public final Paint getMPaintKeyframes() {
        return this.mPaintKeyframes;
    }

    public final Path getMPath() {
        return this.mPath;
    }

    public final int[] getMPathMode() {
        return this.mPathMode;
    }

    public final float[] getMPoints() {
        return this.mPoints;
    }

    public final boolean getMPresentationMode() {
        return this.mPresentationMode;
    }

    public final int getMRedColor() {
        return this.mRedColor;
    }

    public final int getMShadowColor() {
        return this.mShadowColor;
    }

    public final int getMShadowTranslate() {
        return this.mShadowTranslate;
    }

    public final Paint getMTextPaint() {
        return this.mTextPaint;
    }

    public final void getTextBounds(String str, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.mBounds);
    }

    public final void setMBounds(Rect rect) {
        this.mBounds = rect;
    }

    public final void setMDashPathEffect(DashPathEffect dashPathEffect) {
        this.mDashPathEffect = dashPathEffect;
    }

    public final void setMFillPaint(Paint paint) {
        this.mFillPaint = paint;
    }

    public final void setMKeyFrameCount(int i2) {
        this.mKeyFrameCount = i2;
    }

    public final void setMKeyFramePoints(float[] fArr) {
        this.mKeyFramePoints = fArr;
    }

    public final void setMPaint(Paint paint) {
        this.mPaint = paint;
    }

    public final void setMPaintGraph(Paint paint) {
        this.mPaintGraph = paint;
    }

    public final void setMPaintKeyframes(Paint paint) {
        this.mPaintKeyframes = paint;
    }

    public final void setMPath(Path path) {
        this.mPath = path;
    }

    public final void setMPathMode(int[] iArr) {
        this.mPathMode = iArr;
    }

    public final void setMPoints(float[] fArr) {
        this.mPoints = fArr;
    }

    public final void setMPresentationMode(boolean z) {
        this.mPresentationMode = z;
    }

    public final void setMShadowTranslate(int i2) {
        this.mShadowTranslate = i2;
    }

    public final void setMTextPaint(Paint paint) {
        this.mTextPaint = paint;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final void draw(Canvas canvas, HashMap<String, Motion> map, int i2, int i3, int i4, int i5) {
        if (map == null || map.size() == 0) {
            return;
        }
        canvas.save();
        Iterator<Motion> it = map.values().iterator();
        while (it.hasNext()) {
            draw(canvas, it.next(), i2, i3, i4, i5);
        }
        canvas.restore();
    }
}
