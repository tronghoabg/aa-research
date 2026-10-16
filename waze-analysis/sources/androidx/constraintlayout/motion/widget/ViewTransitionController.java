package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ViewTransitionController {
    ArrayList<ViewTransition.Animate> mAnimations;
    private final MotionLayout mMotionLayout;
    private HashSet<View> mRelatedViews;
    private ArrayList<ViewTransition> mViewTransitions = new ArrayList<>();
    private String mTAG = "ViewTransitionController";
    ArrayList<ViewTransition.Animate> mRemoveList = new ArrayList<>();

    public ViewTransitionController(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    private void listenForSharedVariable(final ViewTransition viewTransition, final boolean z) {
        final int sharedValueID = viewTransition.getSharedValueID();
        final int sharedValue = viewTransition.getSharedValue();
        ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new SharedValues.SharedValuesListener() { // from class: androidx.constraintlayout.motion.widget.ViewTransitionController.1
            @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
            public void onNewValue(int i2, int i3, int i4) {
                ViewTransition viewTransition2 = viewTransition;
                int sharedValueCurrent = viewTransition2.getSharedValueCurrent();
                viewTransition2.setSharedValueCurrent(i3);
                if (sharedValueID != i2 || sharedValueCurrent == i3) {
                    return;
                }
                boolean z2 = z;
                int i5 = sharedValue;
                if (z2) {
                    if (i5 == i3) {
                        int childCount = ViewTransitionController.this.mMotionLayout.getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt = ViewTransitionController.this.mMotionLayout.getChildAt(i6);
                            if (viewTransition.matchesView(childAt)) {
                                int currentState = ViewTransitionController.this.mMotionLayout.getCurrentState();
                                ConstraintSet constraintSet = ViewTransitionController.this.mMotionLayout.getConstraintSet(currentState);
                                ViewTransition viewTransition3 = viewTransition;
                                ViewTransitionController viewTransitionController = ViewTransitionController.this;
                                viewTransition3.applyTransition(viewTransitionController, viewTransitionController.mMotionLayout, currentState, constraintSet, childAt);
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i5 != i3) {
                    int childCount2 = ViewTransitionController.this.mMotionLayout.getChildCount();
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        View childAt2 = ViewTransitionController.this.mMotionLayout.getChildAt(i7);
                        if (viewTransition.matchesView(childAt2)) {
                            int currentState2 = ViewTransitionController.this.mMotionLayout.getCurrentState();
                            ConstraintSet constraintSet2 = ViewTransitionController.this.mMotionLayout.getConstraintSet(currentState2);
                            ViewTransition viewTransition4 = viewTransition;
                            ViewTransitionController viewTransitionController2 = ViewTransitionController.this;
                            viewTransition4.applyTransition(viewTransitionController2, viewTransitionController2.mMotionLayout, currentState2, constraintSet2, childAt2);
                        }
                    }
                }
            }
        });
    }

    public void add(ViewTransition viewTransition) {
        this.mViewTransitions.add(viewTransition);
        this.mRelatedViews = null;
        if (viewTransition.getStateTransition() == 4) {
            listenForSharedVariable(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 5) {
            listenForSharedVariable(viewTransition, false);
        }
    }

    void addAnimation(ViewTransition.Animate animate) {
        ArrayList<ViewTransition.Animate> arrayList = this.mAnimations;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mAnimations = arrayList;
        }
        arrayList.add(animate);
    }

    void animate() {
        ArrayList<ViewTransition.Animate> arrayList = this.mAnimations;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).mutate();
        }
        this.mAnimations.removeAll(this.mRemoveList);
        this.mRemoveList.clear();
        if (this.mAnimations.isEmpty()) {
            this.mAnimations = null;
        }
    }

    boolean applyViewTransition(int i2, MotionController motionController) {
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ViewTransition viewTransition = arrayList.get(i3);
            i3++;
            if (viewTransition.getId() == i2) {
                viewTransition.mKeyFrames.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    void enableViewTransition(int i2, boolean z) {
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ViewTransition viewTransition = arrayList.get(i3);
            i3++;
            if (viewTransition.getId() == i2) {
                viewTransition.setEnabled(z);
                return;
            }
        }
    }

    void invalidate() {
        this.mMotionLayout.invalidate();
    }

    boolean isViewTransitionEnabled(int i2) {
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ViewTransition viewTransition = arrayList.get(i3);
            i3++;
            if (viewTransition.getId() == i2) {
                return viewTransition.isEnabled();
            }
        }
        return false;
    }

    void remove(int i2) {
        ViewTransition viewTransition;
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                viewTransition = null;
                break;
            }
            viewTransition = arrayList.get(i3);
            i3++;
            if (viewTransition.getId() == i2) {
                break;
            }
        }
        if (viewTransition != null) {
            this.mRelatedViews = null;
            this.mViewTransitions.remove(viewTransition);
        }
    }

    void removeAnimation(ViewTransition.Animate animate) {
        this.mRemoveList.add(animate);
    }

    void touchEvent(MotionEvent motionEvent) {
        int i2;
        ViewTransitionController viewTransitionController = this;
        int currentState = viewTransitionController.mMotionLayout.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (viewTransitionController.mRelatedViews == null) {
            viewTransitionController.mRelatedViews = new HashSet<>();
            ArrayList<ViewTransition> arrayList = viewTransitionController.mViewTransitions;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                ViewTransition viewTransition = arrayList.get(i3);
                int childCount = viewTransitionController.mMotionLayout.getChildCount();
                int i4 = 0;
                while (true) {
                    i2 = i3 + 1;
                    if (i4 < childCount) {
                        View childAt = viewTransitionController.mMotionLayout.getChildAt(i4);
                        if (viewTransition.matchesView(childAt)) {
                            childAt.getId();
                            viewTransitionController.mRelatedViews.add(childAt);
                        }
                        i4++;
                    }
                }
                i3 = i2;
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<ViewTransition.Animate> arrayList2 = viewTransitionController.mAnimations;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList<ViewTransition.Animate> arrayList3 = viewTransitionController.mAnimations;
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.get(i5).reactTo(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            ConstraintSet constraintSet = viewTransitionController.mMotionLayout.getConstraintSet(currentState);
            ArrayList<ViewTransition> arrayList4 = viewTransitionController.mViewTransitions;
            int size3 = arrayList4.size();
            int i6 = 0;
            while (i6 < size3) {
                ViewTransition viewTransition2 = arrayList4.get(i6);
                if (viewTransition2.supports(action)) {
                    Iterator<View> it = viewTransitionController.mRelatedViews.iterator();
                    while (it.hasNext()) {
                        View next = it.next();
                        if (viewTransition2.matchesView(next)) {
                            next.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                viewTransition2.applyTransition(viewTransitionController, viewTransitionController.mMotionLayout, currentState, constraintSet, next);
                            }
                        }
                        viewTransitionController = this;
                    }
                }
                i6++;
                viewTransitionController = this;
            }
        }
    }

    void viewTransition(int i2, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ViewTransition> arrayList2 = this.mViewTransitions;
        int size = arrayList2.size();
        ViewTransition viewTransition = null;
        for (int i3 = 0; i3 < size; i3++) {
            ViewTransition viewTransition2 = arrayList2.get(i3);
            if (viewTransition2.getId() == i2) {
                for (View view : viewArr) {
                    if (viewTransition2.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    viewTransition(viewTransition2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                viewTransition = viewTransition2;
            }
        }
        if (viewTransition == null) {
            Log.e(this.mTAG, " Could not find ViewTransition");
        }
    }

    private void viewTransition(ViewTransition viewTransition, View... viewArr) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (viewTransition.mViewTransitionMode == 2) {
            viewTransition.applyTransition(this, this.mMotionLayout, currentState, null, viewArr);
            return;
        }
        if (currentState == -1) {
            Log.w(this.mTAG, "No support for ViewTransition within transition yet. Currently: ".concat(String.valueOf(this.mMotionLayout.toString())));
            return;
        }
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
        if (constraintSet == null) {
            return;
        }
        viewTransition.applyTransition(this, this.mMotionLayout, currentState, constraintSet, viewArr);
    }
}
