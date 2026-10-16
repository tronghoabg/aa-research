package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class NestedScrollingChildHelper {
    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParentNonTouch;
    private ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final View mView;

    public NestedScrollingChildHelper(View view) {
        this.mView = view;
    }

    private boolean dispatchNestedScrollInternal(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent nestedScrollingParentForType;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i6)) == null) {
            return false;
        }
        if (i2 != 0) {
            i7 = i2;
            i8 = i3;
            i9 = i4;
        } else if (i3 != 0) {
            i8 = i3;
            i9 = i4;
            i7 = 0;
        } else if (i4 != 0) {
            i9 = i4;
            i7 = 0;
            i8 = 0;
        } else {
            if (i5 == 0) {
                if (iArr4 != null) {
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                }
                return false;
            }
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (iArr4 != null) {
            this.mView.getLocationInWindow(iArr4);
            i10 = iArr4[0];
            i11 = iArr4[1];
        } else {
            iArr4 = null;
            i10 = 0;
            i11 = 0;
        }
        if (iArr2 == null) {
            int[] tempNestedScrollConsumed = getTempNestedScrollConsumed();
            tempNestedScrollConsumed[0] = 0;
            tempNestedScrollConsumed[1] = 0;
            iArr3 = tempNestedScrollConsumed;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.onNestedScroll(nestedScrollingParentForType, this.mView, i7, i8, i9, i5, i6, iArr3);
        if (iArr4 != null) {
            this.mView.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i10;
            iArr4[1] = iArr4[1] - i11;
        }
        return true;
    }

    private ViewParent getNestedScrollingParentForType(int i2) {
        if (i2 == 0) {
            return this.mNestedScrollingParentTouch;
        }
        if (i2 != 1) {
            return null;
        }
        return this.mNestedScrollingParentNonTouch;
    }

    private int[] getTempNestedScrollConsumed() {
        int[] iArr = this.mTempNestedScrollConsumed;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[2];
        this.mTempNestedScrollConsumed = iArr2;
        return iArr2;
    }

    private void setNestedScrollingParentForType(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.mNestedScrollingParentTouch = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.mNestedScrollingParentNonTouch = viewParent;
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedFling(nestedScrollingParentForType, this.mView, f2, f3, z);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedPreFling(nestedScrollingParentForType, this.mView, f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent nestedScrollingParentForType;
        int i5;
        int i6;
        int i7;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i4)) == null) {
            return false;
        }
        if (i2 != 0) {
            i5 = i2;
        } else {
            if (i3 == 0) {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                return false;
            }
            i5 = 0;
        }
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            iArr2 = null;
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            iArr = getTempNestedScrollConsumed();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        ViewParentCompat.onNestedPreScroll(nestedScrollingParentForType, this.mView, i5, i3, iArr3, i4);
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return dispatchNestedScrollInternal(i2, i3, i4, i5, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getNestedScrollingParentForType(i2) != null;
    }

    public boolean isNestedScrollingEnabled() {
        return this.mIsNestedScrollingEnabled;
    }

    public void onDetachedFromWindow() {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void onStopNestedScroll(View view) {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (this.mIsNestedScrollingEnabled) {
            ViewCompat.stopNestedScroll(this.mView);
        }
        this.mIsNestedScrollingEnabled = z;
    }

    public boolean startNestedScroll(int i2, int i3) {
        if (hasNestedScrollingParent(i3)) {
            return true;
        }
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        View view = this.mView;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (ViewParentCompat.onStartNestedScroll(parent, view, this.mView, i2, i3)) {
                setNestedScrollingParentForType(i3, parent);
                ViewParentCompat.onNestedScrollAccepted(parent, view, this.mView, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void stopNestedScroll(int i2) {
        ViewParent nestedScrollingParentForType = getNestedScrollingParentForType(i2);
        if (nestedScrollingParentForType != null) {
            ViewParentCompat.onStopNestedScroll(nestedScrollingParentForType, this.mView, i2);
            setNestedScrollingParentForType(i2, null);
        }
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return dispatchNestedScrollInternal(i2, i3, i4, i5, iArr, i6, null);
    }

    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        dispatchNestedScrollInternal(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean startNestedScroll(int i2) {
        return startNestedScroll(i2, 0);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i2, i3, iArr, iArr2, 0);
    }
}
