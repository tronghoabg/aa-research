package com.google.android.libraries.handwriting.gui;

import android.util.Log;
import com.google.android.libraries.handwriting.base.BoundingBox;
import com.google.android.libraries.handwriting.base.LogV;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class GestureRecognizer {
    private static final float ACCIDENTAL_REGION_FRACTION = 0.1f;
    private static final int BACKSPACE_MIN_WIDTH = 50;
    private static final float HORIZONTAL_GEST_MAX_HEIGHT_TO_WIDTH_RATIO = 0.3f;
    private static final float MAX_TIME_FLING = 250.0f;
    private static final float MIN_TIME_ACCIDENTAL = 250.0f;
    private static final float MIN_TIME_NEW_WORD = 250.0f;
    private static final int SPACE_MIN_WIDTH = 200;
    private static final String TAG = "HWRGestureReco";
    private int writingGuideHeight;
    private int writingGuideWidth;
    private boolean backspaceGestureEnabled = false;
    private boolean spaceGestureEnabled = false;
    private boolean newWordGestureEnabled = false;
    private boolean flingFromTheLeftGestureEnabled = false;
    private boolean flingFromTheTopGestureEnabled = false;
    final BoundingBox undoButtonTapArea = new BoundingBox();
    final BoundingBox backspaceButtonTapArea = new BoundingBox();

    public enum Gesture {
        NOT_A_GESTURE,
        GEST_BACKSPACE,
        GEST_SPACE,
        GEST_NEW_WORD,
        GEST_IGNORE,
        GEST_FLING_FROM_LEFT,
        GEST_FLING_FROM_TOP
    }

    private boolean isAccidental(Stroke stroke, StrokeList strokeList) {
        if (strokeList.isEmpty()) {
            return false;
        }
        if (strokeList.m253getLast().isEmpty()) {
            return false;
        }
        if (stroke.getFirst().t - r6.getLast().t < 250.0f) {
            return false;
        }
        BoundingBox boundingBox = new BoundingBox(stroke);
        return boundingBox.top() >= ((float) this.writingGuideHeight) * 0.9f || boundingBox.bottom() <= ((float) this.writingGuideHeight) * ACCIDENTAL_REGION_FRACTION;
    }

    private boolean isBackspaceGesture(Stroke stroke, StrokeList strokeList) {
        if (!strokeList.isEmpty() || !isHorizontalLine(stroke, true)) {
            return false;
        }
        BoundingBox boundingBox = new BoundingBox(stroke);
        float width = boundingBox.getWidth();
        if (boundingBox.getHeight() <= HORIZONTAL_GEST_MAX_HEIGHT_TO_WIDTH_RATIO * width && width >= 50.0f) {
            if (strokeList.isEmpty()) {
                return true;
            }
            BoundingBox boundingBox2 = new BoundingBox(strokeList);
            if (boundingBox.right() >= boundingBox2.right() && boundingBox.left() <= boundingBox2.left()) {
                return true;
            }
        }
        return false;
    }

    private boolean isFlingFromLeft(Stroke stroke) {
        if (stroke.getFirst().x > stroke.getLast().x) {
            LogV.i(2, TAG, "// Stroke is not from left to right.");
            return false;
        }
        long j = stroke.getLast().t - stroke.getFirst().t;
        if (j > 250.0f) {
            LogV.i(2, TAG, a.bN(j, "// Stroke took longer than 250.0ms: "));
            return false;
        }
        BoundingBox boundingBox = new BoundingBox(stroke);
        if (boundingBox.left() > this.writingGuideWidth * 0.05d) {
            LogV.i(2, TAG, "// Stroke doesn't start in the leftmost 5%: " + boundingBox.left() + " " + (this.writingGuideWidth * 0.05d));
            return false;
        }
        if (boundingBox.getHeight() > boundingBox.getWidth() * 3.0f) {
            LogV.i(2, TAG, "// Stroke is not at least 3x as wide as high: " + boundingBox.getHeight() + " " + (boundingBox.getWidth() * 3.0f));
            return false;
        }
        Stroke.Point first = stroke.getFirst();
        Iterator<Stroke.Point> it = stroke.iterator();
        while (it.hasNext()) {
            Stroke.Point next = it.next();
            if (next.x < first.x) {
                LogV.i(2, TAG, "// Stroke is not monotonous going from left to right");
                return false;
            }
            first = next;
        }
        LogV.i(2, TAG, "YES! THIS IS A FLING FROM THE LEFT!");
        return true;
    }

    private boolean isFlingFromTop(Stroke stroke) {
        if (stroke.getFirst().y > stroke.getLast().y) {
            LogV.i(2, TAG, "// Stroke is not from top to bottom.");
            return false;
        }
        long j = stroke.getLast().t - stroke.getFirst().t;
        if (j > 250.0f) {
            LogV.i(2, TAG, a.bN(j, "// Stroke took longer than 250.0ms: "));
            return false;
        }
        BoundingBox boundingBox = new BoundingBox(stroke);
        if (boundingBox.top() > this.writingGuideHeight * 0.05d) {
            LogV.i(2, TAG, "// Stroke doesn't start in the topmost 5%: " + boundingBox.top() + " " + (this.writingGuideHeight * 0.05d));
            return false;
        }
        if (boundingBox.getWidth() > boundingBox.getHeight() * 3.0f) {
            LogV.i(2, TAG, "// Stroke is not at least 3x as high as wide: " + boundingBox.getWidth() + " " + (boundingBox.getHeight() * 3.0f));
            return false;
        }
        Stroke.Point first = stroke.getFirst();
        Iterator<Stroke.Point> it = stroke.iterator();
        while (it.hasNext()) {
            Stroke.Point next = it.next();
            if (next.y < first.y) {
                LogV.i(2, TAG, "// Stroke is not monotonous going from top to bottom");
                return false;
            }
            first = next;
        }
        LogV.i(2, TAG, "YES! THIS IS A FLING FROM TOP!");
        return true;
    }

    private boolean isHorizontalLine(Stroke stroke, boolean z) {
        Iterator<Stroke.Point> it = stroke.iterator();
        float f = z ? Float.MAX_VALUE : BitmapDescriptorFactory.HUE_RED;
        while (it.hasNext()) {
            float f2 = it.next().x;
            if (z) {
                if (f < f2) {
                    return false;
                }
            } else if (f > f2) {
                return false;
            }
            f = f2;
        }
        return true;
    }

    private boolean isNewWordGesture(Stroke stroke, StrokeList strokeList) {
        if (strokeList.isEmpty()) {
            Log.v(TAG, "context empty");
            return false;
        }
        float f = stroke.getFirst().t - strokeList.m253getLast().getLast().t;
        if (f < 250.0f) {
            Log.v(TAG, a.bG(f, "delta too short: "));
            return false;
        }
        if (stroke.size() <= 2) {
            Log.v(TAG, "stroke too short");
            return false;
        }
        BoundingBox boundingBox = new BoundingBox(stroke);
        BoundingBox boundingBox2 = new BoundingBox(strokeList);
        if (boundingBox.left() >= boundingBox2.right()) {
            Log.v(TAG, "completely to right");
            return false;
        }
        if (boundingBox.right() <= boundingBox2.left() && boundingBox.getWidth() > boundingBox.getHeight() * 0.4d) {
            Log.v(TAG, "completely to left and not thin");
            return true;
        }
        if (boundingBox.right() > boundingBox2.right() && boundingBox.left() > boundingBox2.left()) {
            Log.v(TAG, "continuation");
            return false;
        }
        if (strokeList.size() == 1 && boundingBox2.getWidth() < boundingBox2.getHeight() * 0.4d) {
            Log.v(TAG, "single vertical context");
            return false;
        }
        if (boundingBox.getHeight() > boundingBox2.getHeight() * 0.6d && boundingBox.getWidth() > boundingBox.getHeight() * 0.5d) {
            Log.v(TAG, "high and not too thin");
            return true;
        }
        if (!boundingBox.intersects(boundingBox2)) {
            Log.v(TAG, "no intersection");
            return false;
        }
        if (isWigglyLine(stroke)) {
            Log.v(TAG, "wiggly");
            return true;
        }
        if (boundingBox.intersection(boundingBox2).getArea() > boundingBox.union(boundingBox2).getArea() * 0.3d) {
            Log.v(TAG, "good area overlap");
            return true;
        }
        Log.v(TAG, "none of the above");
        return false;
    }

    private boolean isSpaceGesture(Stroke stroke) {
        if (!isHorizontalLine(stroke, false)) {
            return false;
        }
        BoundingBox boundingBox = new BoundingBox(stroke);
        float width = boundingBox.getWidth();
        return boundingBox.getHeight() <= HORIZONTAL_GEST_MAX_HEIGHT_TO_WIDTH_RATIO * width && width >= ((float) Math.min(SPACE_MIN_WIDTH, this.writingGuideWidth / 2));
    }

    private boolean isWigglyLine(Stroke stroke) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i = 1; i < stroke.size() - 1; i++) {
            int i2 = i - 1;
            if (stroke.get(i2).x < stroke.get(i).x && stroke.get(i + 1).x < stroke.get(i).x) {
                z2 = true;
            }
            if (stroke.get(i2).x > stroke.get(i).x && stroke.get(i + 1).x > stroke.get(i).x) {
                z = true;
            }
            if (stroke.get(i2).y < stroke.get(i).y && stroke.get(i + 1).y < stroke.get(i).y) {
                z4 = true;
            }
            if (stroke.get(i2).y > stroke.get(i).y && stroke.get(i + 1).y > stroke.get(i).y) {
                z3 = true;
            }
            if ((z2 && z) || (z4 && z3)) {
                return true;
            }
        }
        return false;
    }

    public Gesture recognizeLastStrokeGesture(StrokeList strokeList) {
        if (strokeList.isEmpty()) {
            return Gesture.NOT_A_GESTURE;
        }
        Stroke stroke = strokeList.get(strokeList.size() - 1);
        strokeList.remove(strokeList.size() - 1);
        if (this.flingFromTheLeftGestureEnabled && isFlingFromLeft(stroke)) {
            return Gesture.GEST_FLING_FROM_LEFT;
        }
        if (this.flingFromTheTopGestureEnabled && isFlingFromTop(stroke)) {
            return Gesture.GEST_FLING_FROM_TOP;
        }
        if (isAccidental(stroke, strokeList)) {
            strokeList.add(stroke);
            return Gesture.GEST_IGNORE;
        }
        if (this.backspaceGestureEnabled && isBackspaceGesture(stroke, strokeList)) {
            return Gesture.GEST_BACKSPACE;
        }
        if (this.spaceGestureEnabled && isSpaceGesture(stroke)) {
            return Gesture.GEST_SPACE;
        }
        if (this.newWordGestureEnabled && isNewWordGesture(stroke, strokeList)) {
            strokeList.add(stroke);
            return Gesture.GEST_NEW_WORD;
        }
        strokeList.add(stroke);
        return Gesture.NOT_A_GESTURE;
    }

    public void setBackspaceButtonTapArea(float f, float f2, float f3, float f4) {
        this.backspaceButtonTapArea.setTop(f);
        this.backspaceButtonTapArea.setLeft(f2);
        this.backspaceButtonTapArea.setBottom(f3);
        this.backspaceButtonTapArea.setRight(f4);
    }

    public void setBackspaceGestureEnabled(boolean z) {
        this.backspaceGestureEnabled = z;
    }

    public void setFlingFromTheLeftGestureEnabled(boolean z) {
        this.flingFromTheLeftGestureEnabled = z;
    }

    public void setFlingFromTheTopGestureEnabled(boolean z) {
        this.flingFromTheTopGestureEnabled = z;
    }

    public void setNewWordGestureEnabled(boolean z) {
        this.newWordGestureEnabled = z;
    }

    public void setSpaceGestureEnabled(boolean z) {
        this.spaceGestureEnabled = z;
    }

    public void setUndoButtonTapArea(float f, float f2, float f3, float f4) {
        this.undoButtonTapArea.setTop(f);
        this.undoButtonTapArea.setLeft(f2);
        this.undoButtonTapArea.setBottom(f3);
        this.undoButtonTapArea.setRight(f4);
    }

    public void setWritingAreaSize(int i, int i2) {
        this.writingGuideWidth = i;
        this.writingGuideHeight = i2;
    }
}
