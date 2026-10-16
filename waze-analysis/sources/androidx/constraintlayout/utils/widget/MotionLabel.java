package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MotionLabel extends View implements FloatLayout {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    static final String TAG = "MotionLabel";
    private boolean mAutoSize;
    private int mAutoSizeTextType;
    float mBackgroundPanX;
    float mBackgroundPanY;
    private float mBaseTextSize;
    private float mDeltaLeft;
    private float mFloatHeight;
    private float mFloatWidth;
    private String mFontFamily;
    private int mGravity;
    private Layout mLayout;
    boolean mNotBuilt;
    Matrix mOutlinePositionMatrix;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    TextPaint mPaint;
    Paint mPaintCache;
    float mPaintTextSize;
    Path mPath;
    RectF mRect;
    float mRotate;
    private float mRound;
    private float mRoundPercent;
    private int mStyleIndex;
    Paint mTempPaint;
    Rect mTempRect;
    private String mText;
    private Drawable mTextBackground;
    private Bitmap mTextBackgroundBitmap;
    private Rect mTextBounds;
    private int mTextFillColor;
    private int mTextOutlineColor;
    private float mTextOutlineThickness;
    private float mTextPanX;
    private float mTextPanY;
    private BitmapShader mTextShader;
    private Matrix mTextShaderMatrix;
    private float mTextSize;
    private int mTextureEffect;
    private float mTextureHeight;
    private float mTextureWidth;
    private int mTypefaceIndex;
    private boolean mUseOutline;
    ViewOutlineProvider mViewOutlineProvider;
    float mZoom;

    public MotionLabel(Context context) {
        super(context);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.mPaintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, null);
    }

    private void adjustTexture(float f2, float f3, float f4, float f5) {
        if (this.mTextShaderMatrix == null) {
            return;
        }
        this.mFloatWidth = f4 - f2;
        this.mFloatHeight = f5 - f3;
        updateShaderMatrix();
    }

    private float getHorizontalOffset() {
        float f2 = Float.isNaN(this.mBaseTextSize) ? 1.0f : this.mTextSize / this.mBaseTextSize;
        TextPaint textPaint = this.mPaint;
        String str = this.mText;
        return (((((Float.isNaN(this.mFloatWidth) ? getMeasuredWidth() : this.mFloatWidth) - getPaddingLeft()) - getPaddingRight()) - (f2 * textPaint.measureText(str, 0, str.length()))) * (this.mTextPanX + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f2 = Float.isNaN(this.mBaseTextSize) ? 1.0f : this.mTextSize / this.mBaseTextSize;
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        float measuredHeight = Float.isNaN(this.mFloatHeight) ? getMeasuredHeight() : this.mFloatHeight;
        float paddingTop = getPaddingTop();
        return (((((measuredHeight - paddingTop) - getPaddingBottom()) - ((fontMetrics.descent - fontMetrics.ascent) * f2)) * (1.0f - this.mTextPanY)) / 2.0f) - (f2 * fontMetrics.ascent);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 5) {
                    setText(typedArrayObtainStyledAttributes.getText(5));
                } else if (index == 7) {
                    this.mFontFamily = typedArrayObtainStyledAttributes.getString(7);
                } else if (index == 11) {
                    this.mBaseTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, (int) this.mBaseTextSize);
                } else if (index == R.styleable.MotionLabel_android_textSize) {
                    this.mTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.mTextSize);
                } else if (index == 2) {
                    this.mStyleIndex = typedArrayObtainStyledAttributes.getInt(2, this.mStyleIndex);
                } else if (index == 1) {
                    this.mTypefaceIndex = typedArrayObtainStyledAttributes.getInt(1, this.mTypefaceIndex);
                } else if (index == 3) {
                    this.mTextFillColor = typedArrayObtainStyledAttributes.getColor(3, this.mTextFillColor);
                } else if (index == 9) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(9, this.mRound);
                    this.mRound = dimension;
                    setRound(dimension);
                } else if (index == 10) {
                    float f2 = typedArrayObtainStyledAttributes.getFloat(10, this.mRoundPercent);
                    this.mRoundPercent = f2;
                    setRoundPercent(f2);
                } else if (index == 4) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(4, -1));
                } else if (index == 8) {
                    this.mAutoSizeTextType = typedArrayObtainStyledAttributes.getInt(8, 0);
                } else if (index == 17) {
                    this.mTextOutlineColor = typedArrayObtainStyledAttributes.getInt(17, this.mTextOutlineColor);
                    this.mUseOutline = true;
                } else if (index == 18) {
                    this.mTextOutlineThickness = typedArrayObtainStyledAttributes.getDimension(18, this.mTextOutlineThickness);
                    this.mUseOutline = true;
                } else if (index == 12) {
                    this.mTextBackground = typedArrayObtainStyledAttributes.getDrawable(12);
                    this.mUseOutline = true;
                } else if (index == 13) {
                    this.mBackgroundPanX = typedArrayObtainStyledAttributes.getFloat(13, this.mBackgroundPanX);
                } else if (index == 14) {
                    this.mBackgroundPanY = typedArrayObtainStyledAttributes.getFloat(14, this.mBackgroundPanY);
                } else if (index == 19) {
                    this.mTextPanX = typedArrayObtainStyledAttributes.getFloat(19, this.mTextPanX);
                } else if (index == 20) {
                    this.mTextPanY = typedArrayObtainStyledAttributes.getFloat(20, this.mTextPanY);
                } else if (index == 15) {
                    this.mRotate = typedArrayObtainStyledAttributes.getFloat(15, this.mRotate);
                } else if (index == 16) {
                    this.mZoom = typedArrayObtainStyledAttributes.getFloat(16, this.mZoom);
                } else if (index == 23) {
                    this.mTextureHeight = typedArrayObtainStyledAttributes.getDimension(23, this.mTextureHeight);
                } else if (index == 24) {
                    this.mTextureWidth = typedArrayObtainStyledAttributes.getDimension(24, this.mTextureWidth);
                } else if (index == 22) {
                    this.mTextureEffect = typedArrayObtainStyledAttributes.getInt(22, this.mTextureEffect);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setupTexture();
        setupPath();
    }

    private void setTypefaceFromAttrs(String str, int i2, int i3) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i3);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i2 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i2 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i2 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i3 <= 0) {
            this.mPaint.setFakeBoldText(false);
            this.mPaint.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typefaceCreate, i3);
            setTypeface(typefaceDefaultFromStyle);
            int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
            this.mPaint.setFakeBoldText(1 == (i4 & 1));
            this.mPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.waze.R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.mPaint;
        int i2 = typedValue.data;
        this.mTextFillColor = i2;
        textPaint.setColor(i2);
    }

    private void setupTexture() {
        if (this.mTextBackground != null) {
            this.mTextShaderMatrix = new Matrix();
            int intrinsicWidth = this.mTextBackground.getIntrinsicWidth();
            int intrinsicHeight = this.mTextBackground.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.mTextureWidth) ? 128 : (int) this.mTextureWidth;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.mTextureHeight) ? 128 : (int) this.mTextureHeight;
            }
            if (this.mTextureEffect != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.mTextBackgroundBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.mTextBackgroundBitmap);
            this.mTextBackground.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.mTextBackground.setFilterBitmap(true);
            this.mTextBackground.draw(canvas);
            if (this.mTextureEffect != 0) {
                this.mTextBackgroundBitmap = blur(this.mTextBackgroundBitmap, 4);
            }
            this.mTextShader = new BitmapShader(this.mTextBackgroundBitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        }
    }

    private void updateShaderMatrix() {
        float f2 = Float.isNaN(this.mBackgroundPanX) ? 0.0f : this.mBackgroundPanX;
        float f3 = Float.isNaN(this.mBackgroundPanY) ? 0.0f : this.mBackgroundPanY;
        float f4 = Float.isNaN(this.mZoom) ? 1.0f : this.mZoom;
        float f5 = Float.isNaN(this.mRotate) ? 0.0f : this.mRotate;
        this.mTextShaderMatrix.reset();
        float width = this.mTextBackgroundBitmap.getWidth();
        float height = this.mTextBackgroundBitmap.getHeight();
        float f6 = Float.isNaN(this.mTextureWidth) ? this.mFloatWidth : this.mTextureWidth;
        float f7 = Float.isNaN(this.mTextureHeight) ? this.mFloatHeight : this.mTextureHeight;
        float f8 = f4 * (width * f7 < height * f6 ? f6 / width : f7 / height);
        this.mTextShaderMatrix.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f6 - f9;
        float f11 = f8 * height;
        float f12 = f7 - f11;
        if (!Float.isNaN(this.mTextureHeight)) {
            f12 = this.mTextureHeight / 2.0f;
        }
        if (!Float.isNaN(this.mTextureWidth)) {
            f10 = this.mTextureWidth / 2.0f;
        }
        this.mTextShaderMatrix.postTranslate((((f2 * f10) + f6) - f9) * 0.5f, (((f3 * f12) + f7) - f11) * 0.5f);
        this.mTextShaderMatrix.postRotate(f5, f6 / 2.0f, f7 / 2.0f);
        this.mTextShader.setLocalMatrix(this.mTextShaderMatrix);
    }

    Bitmap blur(Bitmap bitmap, int i2) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i3 = 0; i3 < i2 && width >= 32 && height >= 32; i3++) {
            width >>= 1;
            height >>= 1;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    void buildShape(float f2) {
        if (this.mUseOutline || f2 != 1.0f) {
            this.mPath.reset();
            String str = this.mText;
            int length = str.length();
            this.mPaint.getTextBounds(str, 0, length, this.mTextBounds);
            this.mPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.mPath);
            if (f2 != 1.0f) {
                Log.v(TAG, Debug.getLoc() + " scale " + f2);
                Matrix matrix = new Matrix();
                matrix.postScale(f2, f2);
                this.mPath.transform(matrix);
            }
            Rect rect = this.mTextBounds;
            rect.right--;
            this.mTextBounds.left++;
            this.mTextBounds.bottom++;
            Rect rect2 = this.mTextBounds;
            rect2.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.mNotBuilt = false;
        }
    }

    public float getRound() {
        return this.mRound;
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getScaleFromTextSize() {
        return this.mBaseTextSize;
    }

    public float getTextBackgroundPanX() {
        return this.mBackgroundPanX;
    }

    public float getTextBackgroundPanY() {
        return this.mBackgroundPanY;
    }

    public float getTextBackgroundRotate() {
        return this.mRotate;
    }

    public float getTextBackgroundZoom() {
        return this.mZoom;
    }

    public int getTextOutlineColor() {
        return this.mTextOutlineColor;
    }

    public float getTextPanX() {
        return this.mTextPanX;
    }

    public float getTextPanY() {
        return this.mTextPanY;
    }

    public float getTextureHeight() {
        return this.mTextureHeight;
    }

    public float getTextureWidth() {
        return this.mTextureWidth;
    }

    public Typeface getTypeface() {
        return this.mPaint.getTypeface();
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f2, float f3, float f4, float f5) {
        int i2 = (int) (f2 + 0.5f);
        this.mDeltaLeft = f2 - i2;
        float f6 = f4 - f2;
        this.mFloatWidth = f6;
        float f7 = f5 - f3;
        this.mFloatHeight = f7;
        adjustTexture(f2, f3, f4, f5);
        int i3 = (int) (f5 + 0.5f);
        int i4 = (int) (f3 + 0.5f);
        int i5 = (int) (f4 + 0.5f);
        int i6 = i5 - i2;
        int i7 = i3 - i4;
        if (getMeasuredHeight() == i7 && getMeasuredWidth() == i6) {
            super.layout(i2, i4, i5, i3);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            super.layout(i2, i4, i5, i3);
        }
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.mPaintTextSize = this.mTempPaint.getTextSize();
            }
            this.mFloatWidth = f6;
            this.mFloatHeight = f7;
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            int iWidth = this.mTempRect.width();
            float fHeight = this.mTempRect.height();
            float f8 = iWidth;
            float f9 = fHeight * 1.3f;
            float f10 = (f6 - this.mPaddingRight) - this.mPaddingLeft;
            float f11 = (f7 - this.mPaddingBottom) - this.mPaddingTop;
            float f12 = f8 * f11;
            float f13 = f9 * f10;
            TextPaint textPaint = this.mPaint;
            if (f12 > f13) {
                textPaint.setTextSize((this.mPaintTextSize * f10) / f8);
            } else {
                textPaint.setTextSize((this.mPaintTextSize * f11) / f9);
            }
            if (this.mUseOutline || !Float.isNaN(this.mBaseTextSize)) {
                buildShape(Float.isNaN(this.mBaseTextSize) ? 1.0f : this.mTextSize / this.mBaseTextSize);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2 = Float.isNaN(this.mBaseTextSize) ? 1.0f : this.mTextSize / this.mBaseTextSize;
        super.onDraw(canvas);
        if (!this.mUseOutline && f2 == 1.0f) {
            canvas.drawText(this.mText, this.mDeltaLeft + this.mPaddingLeft + getHorizontalOffset(), this.mPaddingTop + getVerticalOffset(), this.mPaint);
            return;
        }
        if (this.mNotBuilt) {
            buildShape(f2);
        }
        if (this.mOutlinePositionMatrix == null) {
            this.mOutlinePositionMatrix = new Matrix();
        }
        if (!this.mUseOutline) {
            float horizontalOffset = this.mPaddingLeft + getHorizontalOffset();
            float verticalOffset = this.mPaddingTop + getVerticalOffset();
            this.mOutlinePositionMatrix.reset();
            this.mOutlinePositionMatrix.preTranslate(horizontalOffset, verticalOffset);
            this.mPath.transform(this.mOutlinePositionMatrix);
            this.mPaint.setColor(this.mTextFillColor);
            this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            this.mOutlinePositionMatrix.reset();
            this.mOutlinePositionMatrix.preTranslate(-horizontalOffset, -verticalOffset);
            this.mPath.transform(this.mOutlinePositionMatrix);
            return;
        }
        this.mPaintCache.set(this.mPaint);
        this.mOutlinePositionMatrix.reset();
        float horizontalOffset2 = this.mPaddingLeft + getHorizontalOffset();
        float verticalOffset2 = this.mPaddingTop + getVerticalOffset();
        this.mOutlinePositionMatrix.postTranslate(horizontalOffset2, verticalOffset2);
        this.mOutlinePositionMatrix.preScale(f2, f2);
        this.mPath.transform(this.mOutlinePositionMatrix);
        BitmapShader bitmapShader = this.mTextShader;
        TextPaint textPaint = this.mPaint;
        if (bitmapShader != null) {
            textPaint.setFilterBitmap(true);
            this.mPaint.setShader(this.mTextShader);
        } else {
            textPaint.setColor(this.mTextFillColor);
        }
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        canvas.drawPath(this.mPath, this.mPaint);
        if (this.mTextShader != null) {
            this.mPaint.setShader(null);
        }
        this.mPaint.setColor(this.mTextOutlineColor);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        canvas.drawPath(this.mPath, this.mPaint);
        this.mOutlinePositionMatrix.reset();
        this.mOutlinePositionMatrix.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.mPath.transform(this.mOutlinePositionMatrix);
        this.mPaint.set(this.mPaintCache);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            r2 = 0
            r8.mAutoSize = r2
            int r3 = r8.getPaddingLeft()
            r8.mPaddingLeft = r3
            int r3 = r8.getPaddingRight()
            r8.mPaddingRight = r3
            int r3 = r8.getPaddingTop()
            r8.mPaddingTop = r3
            int r3 = r8.getPaddingBottom()
            r8.mPaddingBottom = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L3b
            if (r1 == r3) goto L33
            r0 = r3
            goto L3b
        L33:
            int r0 = r8.mAutoSizeTextType
            if (r0 == 0) goto L76
            r0 = 1
            r8.mAutoSize = r0
            goto L76
        L3b:
            android.text.TextPaint r4 = r8.mPaint
            java.lang.String r5 = r8.mText
            int r6 = r5.length()
            android.graphics.Rect r7 = r8.mTextBounds
            r4.getTextBounds(r5, r2, r6, r7)
            r2 = 1065353048(0x3f7fff58, float:0.99999)
            if (r0 == r3) goto L56
            android.graphics.Rect r9 = r8.mTextBounds
            int r9 = r9.width()
            float r9 = (float) r9
            float r9 = r9 + r2
            int r9 = (int) r9
        L56:
            int r0 = r8.mPaddingLeft
            int r4 = r8.mPaddingRight
            int r0 = r0 + r4
            int r9 = r9 + r0
            if (r1 == r3) goto L76
            android.text.TextPaint r0 = r8.mPaint
            r3 = 0
            int r0 = r0.getFontMetricsInt(r3)
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L70
            int r0 = java.lang.Math.min(r10, r0)
        L70:
            int r10 = r8.mPaddingTop
            int r1 = r8.mPaddingBottom
            int r10 = r10 + r1
            int r10 = r10 + r0
        L76:
            r8.setMeasuredDimension(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.utils.widget.MotionLabel.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setGravity(int r8) {
        /*
            r7 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r8 & r0
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != 0) goto Lb
            r8 = r8 | r2
        Lb:
            r1 = r8 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L11
            r8 = r8 | 48
        L11:
            int r1 = r7.mGravity
            if (r8 == r1) goto L18
            r7.invalidate()
        L18:
            r7.mGravity = r8
            r1 = r8 & 112(0x70, float:1.57E-43)
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 48
            if (r1 == r6) goto L2f
            r6 = 80
            if (r1 == r6) goto L2c
            r7.mTextPanY = r3
            goto L31
        L2c:
            r7.mTextPanY = r4
            goto L31
        L2f:
            r7.mTextPanY = r5
        L31:
            r8 = r8 & r0
            r0 = 3
            if (r8 == r0) goto L42
            r0 = 5
            if (r8 == r0) goto L40
            if (r8 == r2) goto L42
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r8 == r0) goto L40
            goto L43
        L40:
            r3 = r4
            goto L43
        L42:
            r3 = r5
        L43:
            r7.mTextPanX = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.utils.widget.MotionLabel.setGravity(int):void");
    }

    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.mRound = f2;
            float f3 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f3);
            return;
        }
        float f4 = this.mRound;
        this.mRound = f2;
        if (f2 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        MotionLabel motionLabel = MotionLabel.this;
                        outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.mRound);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f5 = this.mRound;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (f4 != f2) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f2) {
        float f3 = this.mRoundPercent;
        this.mRoundPercent = f2;
        if (f2 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        MotionLabel motionLabel = MotionLabel.this;
                        outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), (Math.min(r3, r4) * MotionLabel.this.mRoundPercent) / 2.0f);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = Math.min(width, height) * this.mRoundPercent;
            this.mRect.set(0.0f, 0.0f, width, height);
            this.mPath.reset();
            float f4 = fMin / 2.0f;
            this.mPath.addRoundRect(this.mRect, f4, f4, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (f3 != f2) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f2) {
        this.mBaseTextSize = f2;
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f2) {
        this.mBackgroundPanX = f2;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundPanY(float f2) {
        this.mBackgroundPanY = f2;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundRotate(float f2) {
        this.mRotate = f2;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundZoom(float f2) {
        this.mZoom = f2;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextFillColor(int i2) {
        this.mTextFillColor = i2;
        invalidate();
    }

    public void setTextOutlineColor(int i2) {
        this.mTextOutlineColor = i2;
        this.mUseOutline = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f2) {
        this.mTextOutlineThickness = f2;
        this.mUseOutline = true;
        if (Float.isNaN(f2)) {
            this.mTextOutlineThickness = 1.0f;
            this.mUseOutline = false;
        }
        invalidate();
    }

    public void setTextPanX(float f2) {
        this.mTextPanX = f2;
        invalidate();
    }

    public void setTextPanY(float f2) {
        this.mTextPanY = f2;
        invalidate();
    }

    public void setTextSize(float f2) {
        this.mTextSize = f2;
        TextPaint textPaint = this.mPaint;
        if (!Float.isNaN(this.mBaseTextSize)) {
            f2 = this.mBaseTextSize;
        }
        textPaint.setTextSize(f2);
        buildShape(Float.isNaN(this.mBaseTextSize) ? 1.0f : this.mTextSize / this.mBaseTextSize);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f2) {
        this.mTextureHeight = f2;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextureWidth(float f2) {
        this.mTextureWidth = f2;
        updateShaderMatrix();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (Objects.equals(this.mPaint.getTypeface(), typeface)) {
            return;
        }
        this.mPaint.setTypeface(typeface);
        if (this.mLayout != null) {
            this.mLayout = null;
            requestLayout();
            invalidate();
        }
    }

    void setupPath() {
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        setTypefaceFromAttrs(this.mFontFamily, this.mTypefaceIndex, this.mStyleIndex);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setFlags(128);
        setTextSize(this.mTextSize);
        this.mPaint.setAntiAlias(true);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.mPaintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.mPaintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }

    @Override // android.view.View
    public void layout(int i2, int i3, int i4, int i5) {
        super.layout(i2, i3, i4, i5);
        boolean zIsNaN = Float.isNaN(this.mBaseTextSize);
        float f2 = zIsNaN ? 1.0f : this.mTextSize / this.mBaseTextSize;
        this.mFloatWidth = i4 - i2;
        this.mFloatHeight = i5 - i3;
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.mPaintTextSize = this.mTempPaint.getTextSize();
            }
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            float fWidth = this.mTempRect.width();
            float fHeight = this.mTempRect.height();
            float f3 = this.mFloatWidth - this.mPaddingRight;
            float f4 = this.mPaddingLeft;
            float f5 = (this.mFloatHeight - this.mPaddingBottom) - this.mPaddingTop;
            float f6 = fWidth * f5;
            float f7 = (int) (fHeight * 1.3f);
            float f8 = f3 - f4;
            float f9 = f7 * f8;
            if (zIsNaN) {
                TextPaint textPaint = this.mPaint;
                if (f6 > f9) {
                    textPaint.setTextSize((this.mPaintTextSize * f8) / fWidth);
                } else {
                    textPaint.setTextSize((this.mPaintTextSize * f5) / f7);
                }
            } else {
                f2 = f6 > f9 ? f8 / fWidth : f5 / f7;
            }
        }
        if (this.mUseOutline || !zIsNaN) {
            adjustTexture(i2, i3, i4, i5);
            buildShape(f2);
        }
    }
}
