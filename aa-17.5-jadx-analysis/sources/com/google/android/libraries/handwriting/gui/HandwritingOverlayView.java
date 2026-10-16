package com.google.android.libraries.handwriting.gui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.RelativeLayout;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.ebm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class HandwritingOverlayView extends RelativeLayout {
    private static final int A11Y_HOVER_EVENTS_CONVERSION_TIMEOUT = 4000;
    private static final int A11Y_MAX_ANNOUNCEMENTS = 3;
    private static final float DEFAULT_PEN_TOLERANCE = 3.0f;
    private static final int INVALID_POINTER_ID = -1;
    private static final String TAG = "HWROverlay";
    private int lastButtonState;
    private float lastX;
    private float lastY;
    private int mAccessibilityAnnouncementCounter;
    private final AccessibilityManager mAccessibilityManager;
    private int mActivePointerID;
    private HandwritingOverlayView mAnimationView;
    private Bitmap mBuffer;
    private Canvas mCanvas;
    private final RectF mClipRect;
    private CharSequence mContentDescription;
    private final Context mContext;
    private boolean mConvertHoverEventsToTouchEvents;
    private final Runnable mDisableHoverEventsConversionRunner;
    private HandwritingOverlayListener mListener;
    private final Paint mPaintStroke;
    private final Paint mPaintStrokePreviousRecognition;
    private final Paint mPaintStrokeRecoQueue;
    private final Paint mPaintStrokeRecognized;
    private final PressureNormalizer mPressureNormalizer;
    private int mStrokeColor;
    private int mStrokeColorPreviouslyRecognized;
    private int mStrokeColorRecognized;
    private boolean mStylusOnly;
    private boolean mUsingHistoryEvent;
    private float penTolerance;

    public HandwritingOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.penTolerance = DEFAULT_PEN_TOLERANCE;
        this.mStrokeColor = -1;
        this.mStrokeColorRecognized = -256;
        this.mStrokeColorPreviouslyRecognized = -65536;
        this.mStylusOnly = false;
        this.mPaintStrokeRecognized = new Paint();
        this.mPaintStrokeRecoQueue = new Paint();
        this.mPaintStrokePreviousRecognition = new Paint();
        this.mPaintStroke = new Paint();
        this.mDisableHoverEventsConversionRunner = new Runnable(this) { // from class: com.google.android.libraries.handwriting.gui.HandwritingOverlayView.1
            final /* synthetic */ HandwritingOverlayView this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.mConvertHoverEventsToTouchEvents) {
                    this.this$0.setHoverToTouchEventConversion(false);
                }
            }
        };
        this.mClipRect = new RectF();
        this.mUsingHistoryEvent = true;
        this.mActivePointerID = -1;
        PressureNormalizer pressureNormalizer = new PressureNormalizer();
        this.mPressureNormalizer = pressureNormalizer;
        this.mContext = context;
        this.mAccessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.mContentDescription = new String();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HandwritingOverlayView);
        try {
            this.mStrokeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.HandwritingOverlayView_strokeColor, -65536);
            this.mStrokeColorRecognized = typedArrayObtainStyledAttributes.getColor(2, -16711936);
            this.mStrokeColorPreviouslyRecognized = typedArrayObtainStyledAttributes.getColor(1, -16776961);
            typedArrayObtainStyledAttributes.recycle();
            pressureNormalizer.setDensityFactor(getResources().getDisplayMetrics().density / DEFAULT_PEN_TOLERANCE);
            initializeDrawingStyles();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void createBuffer() {
        int iMax = Math.max(getHeight(), 1);
        int iMax2 = Math.max(getWidth(), 1);
        Bitmap bitmap = this.mBuffer;
        if (bitmap != null && bitmap.getWidth() == iMax2 && this.mBuffer.getHeight() == iMax) {
            return;
        }
        this.mBuffer = Bitmap.createBitmap(iMax2, iMax, Bitmap.Config.ARGB_8888);
        this.mCanvas = new Canvas(this.mBuffer);
    }

    private void drawPenDown(float f, float f2, float f3, Paint paint) {
        if (this.mBuffer == null) {
            createBuffer();
        }
        RectF rectF = this.mClipRect;
        rectF.set(f, f2, f, f2);
        this.mPressureNormalizer.resetSmoothing();
        rectF.inset(-this.mPressureNormalizer.getMaxRadius(), -this.mPressureNormalizer.getMaxRadius());
        this.mCanvas.save();
        this.mCanvas.clipRect(rectF);
        paint.setStyle(Paint.Style.FILL);
        this.mCanvas.drawCircle(f, f2, this.mPressureNormalizer.getRadius(f3), paint);
        this.mCanvas.restore();
        invalidate((int) rectF.left, (int) rectF.top, ((int) rectF.right) + 1, ((int) rectF.bottom) + 1);
    }

    private void drawPenMove(float f, float f2, float f3, float f4, float f5, Paint paint) {
        if (this.mBuffer == null) {
            createBuffer();
        }
        RectF rectF = this.mClipRect;
        Canvas canvas = this.mCanvas;
        rectF.set(Math.min(f, f3), Math.min(f2, f4), Math.max(f, f3), Math.max(f2, f4));
        rectF.inset(-this.mPressureNormalizer.getMaxRadius(), -this.mPressureNormalizer.getMaxRadius());
        paint.setStrokeWidth(this.mPressureNormalizer.getStrokeWidth(f5));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.drawLine(f3, f4, f, f2, paint);
        canvas.restore();
        invalidate((int) rectF.left, (int) rectF.top, ((int) rectF.right) + 1, ((int) rectF.bottom) + 1);
    }

    private void drawPenUp(float f, float f2, float f3, Paint paint) {
        if (this.mBuffer == null) {
            createBuffer();
        }
        RectF rectF = this.mClipRect;
        Canvas canvas = this.mCanvas;
        rectF.set(f, f2, f, f2);
        rectF.inset(-this.mPressureNormalizer.getMaxRadius(), -this.mPressureNormalizer.getMaxRadius());
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f, f2, this.mPressureNormalizer.getRadius(f3), paint);
        invalidate((int) rectF.left, (int) rectF.top, ((int) rectF.right) + 1, ((int) rectF.bottom) + 1);
    }

    private void drawStrokeListImpl(StrokeList strokeList, float f, float f2, float f3, Paint paint, ArrayList<Integer> arrayList) {
        Paint paint2 = new Paint(paint);
        if (strokeList == null || strokeList.isEmpty()) {
            Log.i(TAG, "No strokes.");
            return;
        }
        this.mPressureNormalizer.resetSmoothing();
        ListIterator<Stroke> listIterator = strokeList.listIterator();
        while (listIterator.hasNext()) {
            Stroke next = listIterator.next();
            if (arrayList != null && arrayList.size() == strokeList.size()) {
                paint2.setAlpha(arrayList.get(listIterator.previousIndex()).intValue());
            }
            HandwritingOverlayView handwritingOverlayView = this;
            float f4 = f;
            float f5 = f2;
            float f6 = f3;
            handwritingOverlayView.drawStrokeImpl(next, f4, f5, f6, paint2);
            this = handwritingOverlayView;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
    }

    private HandwritingOverlayView getAnimationView() {
        HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
        return handwritingOverlayView == null ? this : handwritingOverlayView;
    }

    private void initializeDrawingStyle(Paint paint, int i) {
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i);
        paint.setStrokeWidth(this.mPressureNormalizer.defaultStrokeWidth());
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void initializeDrawingStyles() {
        setWillNotDraw(false);
        initializeDrawingStyle(this.mPaintStroke, this.mStrokeColor);
        initializeDrawingStyle(this.mPaintStrokeRecognized, this.mStrokeColorRecognized);
        initializeDrawingStyle(this.mPaintStrokePreviousRecognition, this.mStrokeColorPreviouslyRecognized);
        initializeDrawingStyle(this.mPaintStrokeRecoQueue, this.mStrokeColor);
        this.mPaintStrokeRecoQueue.setStrokeWidth(1.0f);
    }

    private void processTouchDown(float f, float f2, long j, float f3, int i) {
        int i2;
        drawPenDown(f, f2, f3, this.mPaintStroke);
        HandwritingOverlayListener handwritingOverlayListener = this.mListener;
        if (handwritingOverlayListener != null) {
            i2 = i;
            handwritingOverlayListener.onPenDown(f, f2, j, f3, i2);
        } else {
            i2 = i;
        }
        this.lastX = f;
        this.lastY = f2;
        this.lastButtonState = i2;
    }

    @ResultIgnorabilityUnspecified
    private boolean processTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!this.mStylusOnly || motionEvent.getToolType(0) == 2) {
                processTouchDown(motionEvent.getX(), motionEvent.getY(), motionEvent.getEventTime(), motionEvent.getPressure(), motionEvent.getButtonState());
                this.mActivePointerID = motionEvent.getPointerId(0);
            } else {
                this.mActivePointerID = -1;
            }
            return true;
        }
        if (actionMasked == 1) {
            if (this.mActivePointerID == -1) {
                return false;
            }
            processTouchUp(motionEvent.getX(), motionEvent.getY(), motionEvent.getEventTime(), motionEvent.getPressure(), motionEvent.getButtonState());
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.mActivePointerID == -1) {
                    return false;
                }
                processTouchCancel(motionEvent.getX(), motionEvent.getY(), motionEvent.getEventTime(), motionEvent.getPressure(), motionEvent.getButtonState());
                return true;
            }
            if (actionMasked != 6) {
                return false;
            }
            int i = actionMasked >> 8;
            if (motionEvent.getPointerId(i) == this.mActivePointerID) {
                processTouchUp(motionEvent.getX(i), motionEvent.getY(i), motionEvent.getEventTime(), motionEvent.getPressure(), motionEvent.getButtonState());
                this.mActivePointerID = -1;
            }
            return true;
        }
        if (this.mActivePointerID == -1) {
            return false;
        }
        int historySize = motionEvent.getHistorySize();
        int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerID);
        if (iFindPointerIndex == -1) {
            Log.i(TAG, "Invalid pointer index for pointer id: " + this.mActivePointerID);
            return true;
        }
        if (this.mUsingHistoryEvent && historySize > 0) {
            for (int i2 = 0; i2 < historySize; i2++) {
                processTouchMove(motionEvent.getHistoricalX(iFindPointerIndex, i2), motionEvent.getHistoricalY(iFindPointerIndex, i2), motionEvent.getHistoricalEventTime(i2), motionEvent.getHistoricalPressure(i2), motionEvent.getButtonState());
            }
        }
        processTouchMove(motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), motionEvent.getEventTime(), motionEvent.getPressure(), motionEvent.getButtonState());
        return true;
    }

    private void processTouchMove(float f, float f2, long j, float f3, int i) {
        if (this.penTolerance <= BitmapDescriptorFactory.HUE_RED || Math.abs(f - this.lastX) > this.penTolerance || Math.abs(f2 - this.lastY) > this.penTolerance || this.lastButtonState != i) {
            drawPenMove(f, f2, this.lastX, this.lastY, f3, this.mPaintStroke);
            HandwritingOverlayListener handwritingOverlayListener = this.mListener;
            if (handwritingOverlayListener != null) {
                handwritingOverlayListener.onPenMove(f, f2, j, f3, i);
            }
            this.lastX = f;
            this.lastY = f2;
            this.lastButtonState = i;
        }
    }

    private void setAnimationLayer(Context context) {
        int identifier = context.getResources().getIdentifier("animation_layer_view", "id", context.getPackageName());
        this.mAnimationView = identifier != 0 ? (HandwritingOverlayView) findViewById(identifier) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHoverToTouchEventConversion(boolean z) {
        if (this.mContentDescription.length() == 0 && getContentDescription() != null) {
            this.mContentDescription = getContentDescription();
        }
        setContentDescription(!z ? this.mContentDescription : "");
        ebm.q(this, getResources().getString(true != z ? com.google.android.projection.gearhead.R.string.announce_handwriting_disabled : com.google.android.projection.gearhead.R.string.announce_handwriting_enabled));
        this.mConvertHoverEventsToTouchEvents = z;
    }

    public void clear() {
        createBuffer();
        this.mCanvas.save();
        Canvas canvas = this.mCanvas;
        canvas.clipRect(0, 0, canvas.getWidth(), this.mCanvas.getHeight());
        this.mCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.mCanvas.restore();
        HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
        if (handwritingOverlayView != null && handwritingOverlayView != this) {
            handwritingOverlayView.clear();
        }
        invalidate();
    }

    public void clearAnimationLayer() {
        getAnimationView().clear();
    }

    public void clearRegion(float f, float f2, float f3, float f4) {
        Canvas canvas = this.mCanvas;
        if (canvas != null) {
            canvas.save();
            canvas.clipRect(f, f2, f3, f4);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.restore();
            invalidate((int) f, (int) f2, (int) f3, (int) f4);
        }
    }

    public void determineMinAndMaxWidth(int i, int i2, int i3) {
        if (i + i2 >= i3 + i3) {
            setMaxStrokeWidth(i);
            setMinStrokeWidth(i2);
        } else {
            float f = i3;
            setMaxStrokeWidth(f);
            setMinStrokeWidth(f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.mAccessibilityManager.isTouchExplorationEnabled() || motionEvent.getSource() != 4098 || !this.mConvertHoverEventsToTouchEvents || this.mAnimationView == this) {
            return super.dispatchHoverEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            i = 1;
            if (action == 9) {
                removeCallbacks(this.mDisableHoverEventsConversionRunner);
                if (this.mAccessibilityAnnouncementCounter <= 3) {
                    ebm.q(this, getResources().getString(com.google.android.projection.gearhead.R.string.announce_handwriting_recording));
                    this.mAccessibilityAnnouncementCounter++;
                }
                i = 0;
            } else {
                if (action != 10) {
                    return super.dispatchHoverEvent(motionEvent);
                }
                removeCallbacks(this.mDisableHoverEventsConversionRunner);
                postDelayed(this.mDisableHoverEventsConversionRunner, 4000L);
            }
        } else {
            removeCallbacks(this.mDisableHoverEventsConversionRunner);
            i = 2;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(i);
        processTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    @ResultIgnorabilityUnspecified
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.mAccessibilityManager.isTouchExplorationEnabled() || this.mAnimationView == this) {
            processTouchEvent(motionEvent);
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (!this.mConvertHoverEventsToTouchEvents) {
            setHoverToTouchEventConversion(true);
            this.mAccessibilityAnnouncementCounter = 0;
        }
        return true;
    }

    public void drawStrokeImpl(Stroke stroke, float f, float f2, float f3, Paint paint) {
        float f4;
        float f5;
        float f6;
        HandwritingOverlayView handwritingOverlayView;
        Paint paint2;
        Iterator<Stroke.Point> it = stroke.iterator();
        if (it.hasNext()) {
            Stroke.Point next = it.next();
            float f7 = (next.x + f2) * f;
            float f8 = (next.y + f3) * f;
            f4 = next.p * f;
            drawPenDown(f7, f8, f4, paint);
            f5 = f7;
            f6 = f8;
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
        }
        while (it.hasNext()) {
            Stroke.Point next2 = it.next();
            float f9 = (next2.x + f2) * f;
            float f10 = (next2.y + f3) * f;
            float f11 = next2.p * f;
            if (f9 == f5 && f10 == f6) {
                handwritingOverlayView = this;
                paint2 = paint;
            } else {
                handwritingOverlayView = this;
                paint2 = paint;
                handwritingOverlayView.drawPenMove(f9, f10, f5, f6, f11, paint2);
            }
            this = handwritingOverlayView;
            f5 = f9;
            f6 = f10;
            f4 = f11;
            paint = paint2;
        }
        this.drawPenUp(f5, f6, f4, paint);
    }

    public void drawStrokeList(StrokeList strokeList, boolean z) {
        drawStrokeList(strokeList, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, z ? this.mPaintStrokeRecognized : this.mPaintStroke);
    }

    public float getMaxStrokeWidth() {
        return this.mPressureNormalizer.getMaxRadius();
    }

    public float getMinStrokeWidth() {
        return this.mPressureNormalizer.getMinRadius();
    }

    Paint getRecoQueueStrokePaint() {
        return this.mPaintStrokeRecoQueue;
    }

    public Paint getStrokePaint() {
        return this.mPaintStroke;
    }

    public Paint getStrokePreviouslyRecognizedPaint() {
        return this.mPaintStrokePreviousRecognition;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mBuffer = null;
        this.mCanvas = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mBuffer == null) {
            createBuffer();
        }
        canvas.drawBitmap(this.mBuffer, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setAnimationLayer(this.mContext);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.i(TAG, "onSizeChanged: " + i + " " + i2 + " " + i3 + " " + i4);
        createBuffer();
        HandwritingOverlayListener handwritingOverlayListener = this.mListener;
        if (handwritingOverlayListener != null) {
            handwritingOverlayListener.onSizeChanged(i, i2);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (this.mAccessibilityManager.isTouchExplorationEnabled() && this.mAnimationView != this) {
            setHoverToTouchEventConversion(i == 0);
        }
        super.onWindowVisibilityChanged(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void processTouchCancel(float r8, float r9, long r10, float r12, int r13) {
        /*
            r7 = this;
            float r3 = r7.lastX
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L16
            float r4 = r7.lastY
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L16
            android.graphics.Paint r6 = r7.mPaintStroke
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r12
            r0.drawPenMove(r1, r2, r3, r4, r5, r6)
            goto L17
        L16:
            r0 = r7
        L17:
            android.graphics.Paint r7 = r0.mPaintStroke
            r0.drawPenUp(r8, r9, r12, r7)
            com.google.android.libraries.handwriting.gui.HandwritingOverlayListener r7 = r0.mListener
            if (r7 == 0) goto L23
            r7.onPenCancel(r8, r9, r10, r12, r13)
        L23:
            r0.lastX = r8
            r0.lastY = r9
            r0.lastButtonState = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.handwriting.gui.HandwritingOverlayView.processTouchCancel(float, float, long, float, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void processTouchUp(float r8, float r9, long r10, float r12, int r13) {
        /*
            r7 = this;
            float r3 = r7.lastX
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L16
            float r4 = r7.lastY
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L16
            android.graphics.Paint r6 = r7.mPaintStroke
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r12
            r0.drawPenMove(r1, r2, r3, r4, r5, r6)
            goto L17
        L16:
            r0 = r7
        L17:
            android.graphics.Paint r7 = r0.mPaintStroke
            r0.drawPenUp(r8, r9, r12, r7)
            com.google.android.libraries.handwriting.gui.HandwritingOverlayListener r7 = r0.mListener
            if (r7 == 0) goto L23
            r7.onPenUp(r8, r9, r10, r12, r13)
        L23:
            r0.lastX = r8
            r0.lastY = r9
            r0.lastButtonState = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.handwriting.gui.HandwritingOverlayView.processTouchUp(float, float, long, float, int):void");
    }

    public void replaceAnimationStrokes(StrokeList strokeList, float f, float f2, float f3, Paint paint) {
        clearAnimationLayer();
        getAnimationView().drawStrokeList(strokeList, f, f2, f3, paint);
    }

    public void setHandwritingOverlayListener(HandwritingOverlayListener handwritingOverlayListener) {
        this.mListener = handwritingOverlayListener;
    }

    public void setMaxStrokeWidth(float f) {
        this.mPressureNormalizer.setMaxRadius(f);
        HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
        if (handwritingOverlayView == null || handwritingOverlayView == this) {
            return;
        }
        handwritingOverlayView.setMaxStrokeWidth(f);
    }

    public void setMinStrokeWidth(float f) {
        this.mPressureNormalizer.setMinRadius(f);
        HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
        if (handwritingOverlayView == null || handwritingOverlayView == this) {
            return;
        }
        handwritingOverlayView.setMinStrokeWidth(f);
    }

    public void setPenTolerance(float f) {
        this.penTolerance = f;
    }

    public void setPendingStrokeColor(int i) {
        this.mPaintStroke.setColor(i);
    }

    public void setRecoQueueStrokeColor(int i) {
        this.mPaintStrokeRecoQueue.setColor(i);
    }

    public void setRecognizedStrokeColor(int i) {
        this.mPaintStrokeRecognized.setColor(i);
    }

    public void setStrokePreviouslyRecognizedColor(int i) {
        this.mPaintStrokePreviousRecognition.setColor(i);
    }

    public void setStylusOnly(boolean z) {
        this.mStylusOnly = z;
    }

    public void drawStrokeList(StrokeList strokeList, ArrayList<Integer> arrayList) {
        drawStrokeListImpl(strokeList, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.mPaintStroke, arrayList);
    }

    public void drawStrokeList(StrokeList strokeList, float f, float f2, float f3, Paint paint) {
        drawStrokeListImpl(strokeList, f, f2, f3, paint, null);
    }

    public HandwritingOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HandwritingOverlayView(Context context) {
        this(context, null);
    }
}
