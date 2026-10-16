package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public class HandwritingOverlayView extends android.widget.RelativeLayout {
    private static final int A11Y_HOVER_EVENTS_CONVERSION_TIMEOUT = 4000;
    private static final int A11Y_MAX_ANNOUNCEMENTS = 3;
    private static final float DEFAULT_PEN_TOLERANCE = 3.0f;
    private static final int INVALID_POINTER_ID = -1;
    private static final java.lang.String TAG = "HWROverlay";
    private int lastButtonState;
    private float lastX;
    private float lastY;
    private int mAccessibilityAnnouncementCounter;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager;
    private int mActivePointerID;
    private com.google.android.libraries.handwriting.gui.HandwritingOverlayView mAnimationView;
    private android.graphics.Bitmap mBuffer;
    private android.graphics.Canvas mCanvas;
    private final android.graphics.RectF mClipRect;
    private java.lang.CharSequence mContentDescription;
    private final android.content.Context mContext;
    private boolean mConvertHoverEventsToTouchEvents;
    private final java.lang.Runnable mDisableHoverEventsConversionRunner;
    private com.google.android.libraries.handwriting.gui.HandwritingOverlayListener mListener;
    private final android.graphics.Paint mPaintStroke;
    private final android.graphics.Paint mPaintStrokePreviousRecognition;
    private final android.graphics.Paint mPaintStrokeRecoQueue;
    private final android.graphics.Paint mPaintStrokeRecognized;
    private final com.google.android.libraries.handwriting.gui.PressureNormalizer mPressureNormalizer;
    private int mStrokeColor;
    private int mStrokeColorPreviouslyRecognized;
    private int mStrokeColorRecognized;
    private boolean mStylusOnly;
    private boolean mUsingHistoryEvent;
    private float penTolerance;

    public HandwritingOverlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.penTolerance = DEFAULT_PEN_TOLERANCE;
        this.mStrokeColor = -1;
        this.mStrokeColorRecognized = -256;
        this.mStrokeColorPreviouslyRecognized = -65536;
        this.mStylusOnly = false;
        this.mPaintStrokeRecognized = new android.graphics.Paint();
        this.mPaintStrokeRecoQueue = new android.graphics.Paint();
        this.mPaintStrokePreviousRecognition = new android.graphics.Paint();
        this.mPaintStroke = new android.graphics.Paint();
        this.mDisableHoverEventsConversionRunner = new java.lang.Runnable(this) { // from class: com.google.android.libraries.handwriting.gui.HandwritingOverlayView.1
            final /* synthetic */ com.google.android.libraries.handwriting.gui.HandwritingOverlayView this$0;

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
        this.mClipRect = new android.graphics.RectF();
        this.mUsingHistoryEvent = true;
        this.mActivePointerID = -1;
        com.google.android.libraries.handwriting.gui.PressureNormalizer pressureNormalizer = new com.google.android.libraries.handwriting.gui.PressureNormalizer();
        this.mPressureNormalizer = pressureNormalizer;
        this.mContext = context;
        this.mAccessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.mContentDescription = new java.lang.String();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.libraries.handwriting.gui.R.styleable.HandwritingOverlayView);
        try {
            this.mStrokeColor = typedArrayObtainStyledAttributes.getColor(com.google.android.libraries.handwriting.gui.R.styleable.HandwritingOverlayView_strokeColor, -65536);
            this.mStrokeColorRecognized = typedArrayObtainStyledAttributes.getColor(2, -16711936);
            this.mStrokeColorPreviouslyRecognized = typedArrayObtainStyledAttributes.getColor(1, -16776961);
            typedArrayObtainStyledAttributes.recycle();
            pressureNormalizer.setDensityFactor(getResources().getDisplayMetrics().density / DEFAULT_PEN_TOLERANCE);
            initializeDrawingStyles();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void createBuffer() {
        int iMax = java.lang.Math.max(getHeight(), 1);
        int iMax2 = java.lang.Math.max(getWidth(), 1);
        android.graphics.Bitmap bitmap = this.mBuffer;
        if (bitmap != null && bitmap.getWidth() == iMax2 && this.mBuffer.getHeight() == iMax) {
            return;
        }
        this.mBuffer = android.graphics.Bitmap.createBitmap(iMax2, iMax, android.graphics.Bitmap.Config.ARGB_8888);
        this.mCanvas = new android.graphics.Canvas(this.mBuffer);
    }

    private void drawPenDown(float f, float f2, float f3, android.graphics.Paint paint) {
        if (this.mBuffer == null) {
            createBuffer();
        }
        android.graphics.RectF rectF = this.mClipRect;
        rectF.set(f, f2, f, f2);
        this.mPressureNormalizer.resetSmoothing();
        rectF.inset(-this.mPressureNormalizer.getMaxRadius(), -this.mPressureNormalizer.getMaxRadius());
        this.mCanvas.save();
        this.mCanvas.clipRect(rectF);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mCanvas.drawCircle(f, f2, this.mPressureNormalizer.getRadius(f3), paint);
        this.mCanvas.restore();
        invalidate((int) rectF.left, (int) rectF.top, ((int) rectF.right) + 1, ((int) rectF.bottom) + 1);
    }

    private void drawPenMove(float f, float f2, float f3, float f4, float f5, android.graphics.Paint paint) {
        if (this.mBuffer == null) {
            createBuffer();
        }
        android.graphics.RectF rectF = this.mClipRect;
        android.graphics.Canvas canvas = this.mCanvas;
        rectF.set(java.lang.Math.min(f, f3), java.lang.Math.min(f2, f4), java.lang.Math.max(f, f3), java.lang.Math.max(f2, f4));
        rectF.inset(-this.mPressureNormalizer.getMaxRadius(), -this.mPressureNormalizer.getMaxRadius());
        paint.setStrokeWidth(this.mPressureNormalizer.getStrokeWidth(f5));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.drawLine(f3, f4, f, f2, paint);
        canvas.restore();
        invalidate((int) rectF.left, (int) rectF.top, ((int) rectF.right) + 1, ((int) rectF.bottom) + 1);
    }

    private void drawPenUp(float f, float f2, float f3, android.graphics.Paint paint) {
        if (this.mBuffer == null) {
            createBuffer();
        }
        android.graphics.RectF rectF = this.mClipRect;
        android.graphics.Canvas canvas = this.mCanvas;
        rectF.set(f, f2, f, f2);
        rectF.inset(-this.mPressureNormalizer.getMaxRadius(), -this.mPressureNormalizer.getMaxRadius());
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawCircle(f, f2, this.mPressureNormalizer.getRadius(f3), paint);
        invalidate((int) rectF.left, (int) rectF.top, ((int) rectF.right) + 1, ((int) rectF.bottom) + 1);
    }

    private void drawStrokeListImpl(com.google.android.libraries.handwriting.base.StrokeList strokeList, float f, float f2, float f3, android.graphics.Paint paint, java.util.ArrayList<java.lang.Integer> arrayList) {
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        if (strokeList == null || strokeList.isEmpty()) {
            android.util.Log.i(TAG, "No strokes.");
            return;
        }
        this.mPressureNormalizer.resetSmoothing();
        java.util.ListIterator<com.google.android.libraries.handwriting.base.Stroke> listIterator = strokeList.listIterator();
        while (listIterator.hasNext()) {
            com.google.android.libraries.handwriting.base.Stroke next = listIterator.next();
            if (arrayList != null && arrayList.size() == strokeList.size()) {
                paint2.setAlpha(arrayList.get(listIterator.previousIndex()).intValue());
            }
            com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView = this;
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

    private com.google.android.libraries.handwriting.gui.HandwritingOverlayView getAnimationView() {
        com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
        return handwritingOverlayView == null ? this : handwritingOverlayView;
    }

    private void initializeDrawingStyle(android.graphics.Paint paint, int i) {
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setColor(i);
        paint.setStrokeWidth(this.mPressureNormalizer.defaultStrokeWidth());
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
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
        com.google.android.libraries.handwriting.gui.HandwritingOverlayListener handwritingOverlayListener = this.mListener;
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

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private boolean processTouchEvent(android.view.MotionEvent motionEvent) {
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
            android.util.Log.i(TAG, "Invalid pointer index for pointer id: " + this.mActivePointerID);
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
        if (this.penTolerance <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || java.lang.Math.abs(f - this.lastX) > this.penTolerance || java.lang.Math.abs(f2 - this.lastY) > this.penTolerance || this.lastButtonState != i) {
            drawPenMove(f, f2, this.lastX, this.lastY, f3, this.mPaintStroke);
            com.google.android.libraries.handwriting.gui.HandwritingOverlayListener handwritingOverlayListener = this.mListener;
            if (handwritingOverlayListener != null) {
                handwritingOverlayListener.onPenMove(f, f2, j, f3, i);
            }
            this.lastX = f;
            this.lastY = f2;
            this.lastButtonState = i;
        }
    }

    private void setAnimationLayer(android.content.Context context) {
        int identifier = context.getResources().getIdentifier("animation_layer_view", "id", context.getPackageName());
        this.mAnimationView = identifier != 0 ? (com.google.android.libraries.handwriting.gui.HandwritingOverlayView) findViewById(identifier) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHoverToTouchEventConversion(boolean z) {
        if (this.mContentDescription.length() == 0 && getContentDescription() != null) {
            this.mContentDescription = getContentDescription();
        }
        setContentDescription(!z ? this.mContentDescription : "");
        defpackage.ebt.p(this, getResources().getString(true != z ? com.google.android.projection.gearhead.R.string.announce_handwriting_disabled : com.google.android.projection.gearhead.R.string.announce_handwriting_enabled));
        this.mConvertHoverEventsToTouchEvents = z;
    }

    public void clear() {
        createBuffer();
        this.mCanvas.save();
        android.graphics.Canvas canvas = this.mCanvas;
        canvas.clipRect(0, 0, canvas.getWidth(), this.mCanvas.getHeight());
        this.mCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        this.mCanvas.restore();
        com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
        if (handwritingOverlayView != null && handwritingOverlayView != this) {
            handwritingOverlayView.clear();
        }
        invalidate();
    }

    public void clearAnimationLayer() {
        getAnimationView().clear();
    }

    public void clearRegion(float f, float f2, float f3, float f4) {
        android.graphics.Canvas canvas = this.mCanvas;
        if (canvas != null) {
            canvas.save();
            canvas.clipRect(f, f2, f3, f4);
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
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
    protected boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
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
                    defpackage.ebt.p(this, getResources().getString(com.google.android.projection.gearhead.R.string.announce_handwriting_recording));
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
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(i);
        processTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
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

    public void drawStrokeImpl(com.google.android.libraries.handwriting.base.Stroke stroke, float f, float f2, float f3, android.graphics.Paint paint) {
        float f4;
        float f5;
        float f6;
        com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView;
        android.graphics.Paint paint2;
        java.util.Iterator<com.google.android.libraries.handwriting.base.Stroke.Point> it = stroke.iterator();
        if (it.hasNext()) {
            com.google.android.libraries.handwriting.base.Stroke.Point next = it.next();
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
            com.google.android.libraries.handwriting.base.Stroke.Point next2 = it.next();
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

    public void drawStrokeList(com.google.android.libraries.handwriting.base.StrokeList strokeList, boolean z) {
        drawStrokeList(strokeList, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, z ? this.mPaintStrokeRecognized : this.mPaintStroke);
    }

    public float getMaxStrokeWidth() {
        return this.mPressureNormalizer.getMaxRadius();
    }

    public float getMinStrokeWidth() {
        return this.mPressureNormalizer.getMinRadius();
    }

    android.graphics.Paint getRecoQueueStrokePaint() {
        return this.mPaintStrokeRecoQueue;
    }

    public android.graphics.Paint getStrokePaint() {
        return this.mPaintStroke;
    }

    public android.graphics.Paint getStrokePreviouslyRecognizedPaint() {
        return this.mPaintStrokePreviousRecognition;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mBuffer = null;
        this.mCanvas = null;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.mBuffer == null) {
            createBuffer();
        }
        canvas.drawBitmap(this.mBuffer, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (android.graphics.Paint) null);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setAnimationLayer(this.mContext);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        android.util.Log.i(TAG, "onSizeChanged: " + i + " " + i2 + " " + i3 + " " + i4);
        createBuffer();
        com.google.android.libraries.handwriting.gui.HandwritingOverlayListener handwritingOverlayListener = this.mListener;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public void processTouchCancel(float f, float f2, long j, float f3, int i) {
        com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView;
        float f4 = this.lastX;
        if (f != f4) {
            float f5 = this.lastY;
            if (f2 != f5) {
                handwritingOverlayView = this;
                handwritingOverlayView.drawPenMove(f, f2, f4, f5, f3, this.mPaintStroke);
            } else {
                handwritingOverlayView = this;
            }
        } else {
            handwritingOverlayView = this;
        }
        handwritingOverlayView.drawPenUp(f, f2, f3, handwritingOverlayView.mPaintStroke);
        com.google.android.libraries.handwriting.gui.HandwritingOverlayListener handwritingOverlayListener = handwritingOverlayView.mListener;
        if (handwritingOverlayListener != null) {
            handwritingOverlayListener.onPenCancel(f, f2, j, f3, i);
        }
        handwritingOverlayView.lastX = f;
        handwritingOverlayView.lastY = f2;
        handwritingOverlayView.lastButtonState = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public void processTouchUp(float f, float f2, long j, float f3, int i) {
        com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView;
        float f4 = this.lastX;
        if (f != f4) {
            float f5 = this.lastY;
            if (f2 != f5) {
                handwritingOverlayView = this;
                handwritingOverlayView.drawPenMove(f, f2, f4, f5, f3, this.mPaintStroke);
            } else {
                handwritingOverlayView = this;
            }
        } else {
            handwritingOverlayView = this;
        }
        handwritingOverlayView.drawPenUp(f, f2, f3, handwritingOverlayView.mPaintStroke);
        com.google.android.libraries.handwriting.gui.HandwritingOverlayListener handwritingOverlayListener = handwritingOverlayView.mListener;
        if (handwritingOverlayListener != null) {
            handwritingOverlayListener.onPenUp(f, f2, j, f3, i);
        }
        handwritingOverlayView.lastX = f;
        handwritingOverlayView.lastY = f2;
        handwritingOverlayView.lastButtonState = i;
    }

    public void replaceAnimationStrokes(com.google.android.libraries.handwriting.base.StrokeList strokeList, float f, float f2, float f3, android.graphics.Paint paint) {
        clearAnimationLayer();
        getAnimationView().drawStrokeList(strokeList, f, f2, f3, paint);
    }

    public void setHandwritingOverlayListener(com.google.android.libraries.handwriting.gui.HandwritingOverlayListener handwritingOverlayListener) {
        this.mListener = handwritingOverlayListener;
    }

    public void setMaxStrokeWidth(float f) {
        this.mPressureNormalizer.setMaxRadius(f);
        com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
        if (handwritingOverlayView == null || handwritingOverlayView == this) {
            return;
        }
        handwritingOverlayView.setMaxStrokeWidth(f);
    }

    public void setMinStrokeWidth(float f) {
        this.mPressureNormalizer.setMinRadius(f);
        com.google.android.libraries.handwriting.gui.HandwritingOverlayView handwritingOverlayView = this.mAnimationView;
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

    public void drawStrokeList(com.google.android.libraries.handwriting.base.StrokeList strokeList, java.util.ArrayList<java.lang.Integer> arrayList) {
        drawStrokeListImpl(strokeList, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.mPaintStroke, arrayList);
    }

    public void drawStrokeList(com.google.android.libraries.handwriting.base.StrokeList strokeList, float f, float f2, float f3, android.graphics.Paint paint) {
        drawStrokeListImpl(strokeList, f, f2, f3, paint, null);
    }

    public HandwritingOverlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HandwritingOverlayView(android.content.Context context) {
        this(context, null);
    }
}
