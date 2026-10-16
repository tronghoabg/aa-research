package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class TouchResponse {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    static final int FLAG_SUPPORT_SCROLL_UP = 4;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final String TAG = "TouchResponse";
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private int mAutoCompleteMode;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    boolean mIsRotateMode;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    float mRotateCenterX;
    float mRotateCenterY;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int[] mTempLoc;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    TouchResponse(MotionLayout motionLayout, OnSwipe onSwipe) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = motionLayout;
        this.mTouchAnchorId = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.mTouchAnchorSide = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = TOUCH_SIDES[touchAnchorSide];
            this.mTouchAnchorX = fArr[0];
            this.mTouchAnchorY = fArr[1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.mTouchSide = dragDirection;
        float[][] fArr2 = TOUCH_DIRECTION;
        if (dragDirection < fArr2.length) {
            float[] fArr3 = fArr2[dragDirection];
            this.mTouchDirectionX = fArr3[0];
            this.mTouchDirectionY = fArr3[1];
        } else {
            this.mTouchDirectionY = Float.NaN;
            this.mTouchDirectionX = Float.NaN;
            this.mIsRotateMode = true;
        }
        this.mMaxVelocity = onSwipe.getMaxVelocity();
        this.mMaxAcceleration = onSwipe.getMaxAcceleration();
        this.mMoveWhenScrollAtTop = onSwipe.getMoveWhenScrollAtTop();
        this.mDragScale = onSwipe.getDragScale();
        this.mDragThreshold = onSwipe.getDragThreshold();
        this.mTouchRegionId = onSwipe.getTouchRegionId();
        this.mOnTouchUp = onSwipe.getOnTouchUp();
        this.mFlags = onSwipe.getNestedScrollFlags();
        this.mLimitBoundsTo = onSwipe.getLimitBoundsTo();
        this.mRotationCenterId = onSwipe.getRotationCenterId();
        this.mSpringBoundary = onSwipe.getSpringBoundary();
        this.mSpringDamping = onSwipe.getSpringDamping();
        this.mSpringMass = onSwipe.getSpringMass();
        this.mSpringStiffness = onSwipe.getSpringStiffness();
        this.mSpringStopThreshold = onSwipe.getSpringStopThreshold();
        this.mAutoCompleteMode = onSwipe.getAutoCompleteMode();
    }

    private void fill(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int[] iArr = R.styleable.ActionBar;
            if (index == 16) {
                this.mTouchAnchorId = typedArray.getResourceId(16, this.mTouchAnchorId);
            } else if (index == 17) {
                int i3 = typedArray.getInt(17, this.mTouchAnchorSide);
                this.mTouchAnchorSide = i3;
                float[] fArr = TOUCH_SIDES[i3];
                this.mTouchAnchorX = fArr[0];
                this.mTouchAnchorY = fArr[1];
            } else if (index == 1) {
                int i4 = typedArray.getInt(1, this.mTouchSide);
                this.mTouchSide = i4;
                float[][] fArr2 = TOUCH_DIRECTION;
                if (i4 < fArr2.length) {
                    float[] fArr3 = fArr2[i4];
                    this.mTouchDirectionX = fArr3[0];
                    this.mTouchDirectionY = fArr3[1];
                } else {
                    this.mTouchDirectionY = Float.NaN;
                    this.mTouchDirectionX = Float.NaN;
                    this.mIsRotateMode = true;
                }
            } else if (index == 6) {
                this.mMaxVelocity = typedArray.getFloat(6, this.mMaxVelocity);
            } else if (index == 5) {
                this.mMaxAcceleration = typedArray.getFloat(5, this.mMaxAcceleration);
            } else if (index == 7) {
                this.mMoveWhenScrollAtTop = typedArray.getBoolean(7, this.mMoveWhenScrollAtTop);
            } else if (index == 2) {
                this.mDragScale = typedArray.getFloat(2, this.mDragScale);
            } else if (index == 3) {
                this.mDragThreshold = typedArray.getFloat(3, this.mDragThreshold);
            } else if (index == 18) {
                this.mTouchRegionId = typedArray.getResourceId(18, this.mTouchRegionId);
            } else if (index == 9) {
                this.mOnTouchUp = typedArray.getInt(9, this.mOnTouchUp);
            } else if (index == 8) {
                this.mFlags = typedArray.getInteger(8, 0);
            } else if (index == 4) {
                this.mLimitBoundsTo = typedArray.getResourceId(4, 0);
            } else if (index == 10) {
                this.mRotationCenterId = typedArray.getResourceId(10, this.mRotationCenterId);
            } else if (index == 12) {
                this.mSpringDamping = typedArray.getFloat(12, this.mSpringDamping);
            } else if (index == 13) {
                this.mSpringMass = typedArray.getFloat(13, this.mSpringMass);
            } else if (index == 14) {
                this.mSpringStiffness = typedArray.getFloat(14, this.mSpringStiffness);
            } else if (index == 15) {
                this.mSpringStopThreshold = typedArray.getFloat(15, this.mSpringStopThreshold);
            } else if (index == 11) {
                this.mSpringBoundary = typedArray.getInt(11, this.mSpringBoundary);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.mAutoCompleteMode = typedArray.getInt(index, this.mAutoCompleteMode);
            }
        }
    }

    private void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        fill(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    float dot(float f2, float f3) {
        return (f2 * this.mTouchDirectionX) + (f3 * this.mTouchDirectionY);
    }

    public int getAnchorId() {
        return this.mTouchAnchorId;
    }

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    public int getFlags() {
        return this.mFlags;
    }

    RectF getLimitBoundsTo(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i2 = this.mLimitBoundsTo;
        if (i2 == -1 || (viewFindViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int getLimitBoundsToId() {
        return this.mLimitBoundsTo;
    }

    float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    float getProgressDirection(float f2, float f3) throws Resources.NotFoundException {
        MotionLayout motionLayout = this.mMotionLayout;
        motionLayout.getAnchorDpDt(this.mTouchAnchorId, motionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f4 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f5 = EPSILON;
        if (f4 != 0.0f) {
            float f6 = fArr[0];
            if (f6 == 0.0f) {
                fArr[0] = 1.0E-7f;
            } else {
                f5 = f6;
            }
            return (f2 * f4) / f5;
        }
        float f7 = fArr[1];
        if (f7 == 0.0f) {
            fArr[1] = 1.0E-7f;
        } else {
            f5 = f7;
        }
        return (f3 * this.mTouchDirectionY) / f5;
    }

    public int getSpringBoundary() {
        return this.mSpringBoundary;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    RectF getTouchRegion(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i2 = this.mTouchRegionId;
        if (i2 == -1 || (viewFindViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    boolean isDragStarted() {
        return this.mDragStarted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    void processTouchEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i2, MotionScene motionScene) throws Resources.NotFoundException {
        char c2;
        int i3;
        ?? r23;
        float f2;
        ?? r24;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(motionEvent, motionTracker, i2, motionScene);
            return;
        }
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            this.mDragStarted = false;
            return;
        }
        if (action == 1) {
            this.mDragStarted = false;
            motionTracker.computeCurrentVelocity(1000);
            float xVelocity = motionTracker.getXVelocity();
            float yVelocity = motionTracker.getYVelocity();
            float progress = this.mMotionLayout.getProgress();
            int i4 = this.mTouchAnchorId;
            MotionLayout motionLayout = this.mMotionLayout;
            if (i4 != -1) {
                motionLayout.getAnchorDpDt(i4, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                c2 = 0;
            } else {
                float fMin = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                float[] fArr = this.mAnchorDpDt;
                fArr[1] = this.mTouchDirectionY * fMin;
                c2 = 0;
                fArr[0] = fMin * this.mTouchDirectionX;
            }
            float[] fArr2 = this.mAnchorDpDt;
            float fAbs = this.mTouchDirectionX != 0.0f ? xVelocity / fArr2[c2] : yVelocity / fArr2[1];
            float f3 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f3 == 0.0f || f3 == 1.0f || (i3 = this.mOnTouchUp) == 3) {
                if (f3 <= 0.0f || f3 >= 1.0f) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float f4 = ((double) f3) < 0.5d ? 0.0f : 1.0f;
            if (i3 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f4 = 1.0f;
            }
            if (this.mOnTouchUp == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f4 = 0.0f;
            }
            this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, f4, fAbs);
            if (progress <= 0.0f || progress >= 1.0f) {
                this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.mLastTouchY;
        float rawX = motionEvent.getRawX() - this.mLastTouchX;
        if (Math.abs((this.mTouchDirectionX * rawX) + (this.mTouchDirectionY * rawY)) > this.mDragThreshold || this.mDragStarted) {
            float progress2 = this.mMotionLayout.getProgress();
            if (!this.mDragStarted) {
                this.mDragStarted = true;
                this.mMotionLayout.setProgress(progress2);
            }
            int i5 = this.mTouchAnchorId;
            MotionLayout motionLayout2 = this.mMotionLayout;
            if (i5 != -1) {
                r23 = 1;
                r24 = 0;
                f2 = progress2;
                motionLayout2.getAnchorDpDt(i5, f2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                r23 = 1;
                f2 = progress2;
                r24 = 0;
                float fMin2 = Math.min(motionLayout2.getWidth(), motionLayout2.getHeight());
                float[] fArr3 = this.mAnchorDpDt;
                fArr3[1] = this.mTouchDirectionY * fMin2;
                fArr3[0] = fMin2 * this.mTouchDirectionX;
            }
            float f5 = this.mTouchDirectionX;
            float[] fArr4 = this.mAnchorDpDt;
            if (Math.abs(((f5 * fArr4[r24]) + (this.mTouchDirectionY * fArr4[r23])) * this.mDragScale) < 0.01d) {
                float[] fArr5 = this.mAnchorDpDt;
                fArr5[r24] = 0.01f;
                fArr5[r23] = 0.01f;
            }
            float f6 = this.mTouchDirectionX;
            float[] fArr6 = this.mAnchorDpDt;
            float fMax = Math.max(Math.min(f2 + (f6 != 0.0f ? rawX / fArr6[r24] : rawY / fArr6[r23]), 1.0f), 0.0f);
            if (this.mOnTouchUp == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.mOnTouchUp == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.mMotionLayout.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.mMotionLayout.endTrigger(progress3 == 0.0f ? r23 : r24);
                }
                this.mMotionLayout.setProgress(fMax);
                motionTracker.computeCurrentVelocity(1000);
                float xVelocity2 = motionTracker.getXVelocity();
                float yVelocity2 = motionTracker.getYVelocity();
                float f7 = this.mTouchDirectionX;
                float[] fArr7 = this.mAnchorDpDt;
                this.mMotionLayout.mLastVelocity = f7 != 0.0f ? xVelocity2 / fArr7[r24] : yVelocity2 / fArr7[r23];
            } else {
                this.mMotionLayout.mLastVelocity = 0.0f;
            }
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
        }
    }

    void processTouchRotateEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i2, MotionScene motionScene) throws Resources.NotFoundException {
        int i3;
        float f2;
        float f3;
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            this.mDragStarted = false;
            return;
        }
        if (action == 1) {
            this.mDragStarted = false;
            motionTracker.computeCurrentVelocity(16);
            float xVelocity = motionTracker.getXVelocity();
            float yVelocity = motionTracker.getYVelocity();
            float progress = this.mMotionLayout.getProgress();
            float width = r5.getWidth() / 2.0f;
            float height = this.mMotionLayout.getHeight() / 2.0f;
            int i4 = this.mRotationCenterId;
            if (i4 != -1) {
                MotionLayout motionLayout = this.mMotionLayout;
                View viewFindViewById = motionLayout.findViewById(i4);
                motionLayout.getLocationOnScreen(this.mTempLoc);
                float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.mTempLoc[1];
                width = this.mTempLoc[0] + left;
            } else {
                int i5 = this.mTouchAnchorId;
                if (i5 != -1) {
                    MotionLayout motionLayout2 = this.mMotionLayout;
                    View viewFindViewById2 = motionLayout2.findViewById(motionLayout2.getMotionController(i5).getAnimateRelativeTo());
                    this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                    height = ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f) + this.mTempLoc[1];
                    width = this.mTempLoc[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                }
            }
            float rawX = motionEvent.getRawX() - width;
            double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX));
            int i6 = this.mTouchAnchorId;
            if (i6 != -1) {
                this.mMotionLayout.getAnchorDpDt(i6, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                this.mAnchorDpDt[1] = (float) Math.toDegrees(r5[1]);
            } else {
                this.mAnchorDpDt[1] = 360.0f;
            }
            float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r2, xVelocity + rawX)) - degrees)) * 62.5f;
            float f4 = !Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * this.mDragScale) / this.mAnchorDpDt[1]) + progress : progress;
            if (f4 == 0.0f || f4 == 1.0f || (i3 = this.mOnTouchUp) == 3) {
                if (f4 <= 0.0f || f4 >= 1.0f) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float fAbs = (degrees2 * this.mDragScale) / this.mAnchorDpDt[1];
            float f5 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
            if (i3 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f5 = 1.0f;
            }
            if (this.mOnTouchUp == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f2 = 0.0f;
            } else {
                f2 = f5;
            }
            this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, f2, fAbs * 3.0f);
            if (progress <= 0.0f || progress >= 1.0f) {
                this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        motionEvent.getRawY();
        motionEvent.getRawX();
        float width2 = this.mMotionLayout.getWidth() / 2.0f;
        float height2 = this.mMotionLayout.getHeight() / 2.0f;
        int i7 = this.mRotationCenterId;
        if (i7 != -1) {
            MotionLayout motionLayout3 = this.mMotionLayout;
            View viewFindViewById3 = motionLayout3.findViewById(i7);
            motionLayout3.getLocationOnScreen(this.mTempLoc);
            float left2 = (viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f;
            height2 = ((viewFindViewById3.getTop() + viewFindViewById3.getBottom()) / 2.0f) + this.mTempLoc[1];
            width2 = this.mTempLoc[0] + left2;
        } else {
            int i8 = this.mTouchAnchorId;
            if (i8 != -1) {
                MotionLayout motionLayout4 = this.mMotionLayout;
                if (motionLayout4.findViewById(motionLayout4.getMotionController(i8).getAnimateRelativeTo()) == null) {
                    Log.e(TAG, "could not find view to animate to");
                } else {
                    this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                    width2 = this.mTempLoc[0] + ((r12.getLeft() + r12.getRight()) / 2.0f);
                    height2 = this.mTempLoc[1] + ((r12.getTop() + r12.getBottom()) / 2.0f);
                }
            }
        }
        float rawX2 = motionEvent.getRawX() - width2;
        float rawY = motionEvent.getRawY() - height2;
        float fAtan2 = (float) (((Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2) - Math.atan2(this.mLastTouchY - height2, this.mLastTouchX - width2)) * 180.0d) / 3.141592653589793d);
        if (fAtan2 > 330.0f) {
            fAtan2 -= 360.0f;
        } else if (fAtan2 < -330.0f) {
            fAtan2 += 360.0f;
        }
        if (Math.abs(fAtan2) > 0.01d || this.mDragStarted) {
            float progress2 = this.mMotionLayout.getProgress();
            if (!this.mDragStarted) {
                this.mDragStarted = true;
                this.mMotionLayout.setProgress(progress2);
            }
            int i9 = this.mTouchAnchorId;
            if (i9 != -1) {
                f3 = progress2;
                this.mMotionLayout.getAnchorDpDt(i9, f3, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                this.mAnchorDpDt[1] = (float) Math.toDegrees(r3[1]);
            } else {
                f3 = progress2;
                this.mAnchorDpDt[1] = 360.0f;
            }
            float fMax = Math.max(Math.min(f3 + ((fAtan2 * this.mDragScale) / this.mAnchorDpDt[1]), 1.0f), 0.0f);
            float progress3 = this.mMotionLayout.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.mMotionLayout.endTrigger(progress3 == 0.0f);
                }
                this.mMotionLayout.setProgress(fMax);
                motionTracker.computeCurrentVelocity(1000);
                float xVelocity2 = motionTracker.getXVelocity();
                double yVelocity2 = motionTracker.getYVelocity();
                double d2 = xVelocity2;
                this.mMotionLayout.mLastVelocity = (float) Math.toDegrees((float) ((Math.hypot(yVelocity2, d2) * Math.sin(Math.atan2(yVelocity2, d2) - r4)) / Math.hypot(rawX2, rawY)));
            } else {
                this.mMotionLayout.mLastVelocity = 0.0f;
            }
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
        }
    }

    void scrollMove(float f2, float f3) throws Resources.NotFoundException {
        float progress = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(progress);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f4 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (Math.abs((f4 * fArr[0]) + (this.mTouchDirectionY * fArr[1])) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.mTouchDirectionX;
        float fMax = Math.max(Math.min(progress + (f5 != 0.0f ? (f2 * f5) / this.mAnchorDpDt[0] : (f3 * this.mTouchDirectionY) / this.mAnchorDpDt[1]), 1.0f), 0.0f);
        if (fMax != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(fMax);
        }
    }

    void scrollUp(float f2, float f3) throws Resources.NotFoundException {
        int i2;
        this.mDragStarted = false;
        MotionLayout motionLayout = this.mMotionLayout;
        float progress = motionLayout.getProgress();
        motionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float[] fArr = this.mAnchorDpDt;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = this.mTouchDirectionX;
        float f7 = f6 != 0.0f ? (f2 * f6) / f4 : (f3 * this.mTouchDirectionY) / f5;
        if (!Float.isNaN(f7)) {
            progress += f7 / 3.0f;
        }
        if (progress == 0.0f || progress == 1.0f || (i2 = this.mOnTouchUp) == 3) {
            return;
        }
        this.mMotionLayout.touchAnimateTo(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f7);
    }

    public void setAnchorId(int i2) {
        this.mTouchAnchorId = i2;
    }

    void setAutoCompleteMode(int i2) {
        this.mAutoCompleteMode = i2;
    }

    void setDown(float f2, float f3) {
        this.mLastTouchX = f2;
        this.mLastTouchY = f3;
    }

    public void setMaxAcceleration(float f2) {
        this.mMaxAcceleration = f2;
    }

    public void setMaxVelocity(float f2) {
        this.mMaxVelocity = f2;
    }

    public void setRTL(boolean z) {
        float[][] fArr;
        float[][] fArr2;
        if (z) {
            fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[2];
            fArr[5] = fArr[3];
            fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[1];
            fArr2[6] = fArr2[2];
        }
        float[] fArr3 = fArr2[this.mTouchAnchorSide];
        this.mTouchAnchorX = fArr3[0];
        this.mTouchAnchorY = fArr3[1];
        int i2 = this.mTouchSide;
        if (i2 >= fArr.length) {
            return;
        }
        float[] fArr4 = fArr[i2];
        this.mTouchDirectionX = fArr4[0];
        this.mTouchDirectionY = fArr4[1];
    }

    public void setTouchAnchorLocation(float f2, float f3) {
        this.mTouchAnchorX = f2;
        this.mTouchAnchorY = f3;
    }

    public void setTouchUpMode(int i2) {
        this.mOnTouchUp = i2;
    }

    void setUpTouchEvent(float f2, float f3) {
        this.mLastTouchX = f2;
        this.mLastTouchY = f3;
        this.mDragStarted = false;
    }

    void setupTouch() {
        View viewFindViewById;
        int i2 = this.mTouchAnchorId;
        if (i2 != -1) {
            viewFindViewById = this.mMotionLayout.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e(TAG, "cannot find TouchAnchorId @id/".concat(String.valueOf(Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId))));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(NestedScrollView nestedScrollView2, int i3, int i4, int i5, int i6) {
                }
            });
        }
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return Key.ROTATION;
        }
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }

    TouchResponse(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = motionLayout;
        fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
    }
}
