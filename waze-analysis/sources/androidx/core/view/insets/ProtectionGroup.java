package androidx.core.view.insets;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class ProtectionGroup implements SystemBarStateMonitor.Callback {
    private int mAnimationCount;
    private boolean mDisposed;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;
    private final SystemBarStateMonitor mMonitor;
    private final ArrayList<Protection> mProtections = new ArrayList<>();

    ProtectionGroup(SystemBarStateMonitor systemBarStateMonitor, List<Protection> list) {
        Insets insets = Insets.NONE;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        addProtections(list, false);
        addProtections(list, true);
        systemBarStateMonitor.addCallback(this);
        this.mMonitor = systemBarStateMonitor;
    }

    private void addProtections(List<Protection> list, boolean z) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Protection protection = list.get(i2);
            if (protection.occupiesCorners() == z) {
                Object controller = protection.getController();
                if (controller != null) {
                    throw new IllegalStateException(protection + " (" + i3 + DomExceptionUtils.SEPARATOR + size + ") is already controlled by " + controller + " but is still added to " + this);
                }
                protection.setController(this);
                this.mProtections.add(protection);
            }
            i2 = i3;
        }
    }

    private void updateInsets() {
        ArrayList<Protection> arrayList = this.mProtections;
        Insets insetsMax = Insets.NONE;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                insetsMax = Insets.max(insetsMax, this.mProtections.get(size).dispatchInsets(this.mInsets, this.mInsetsIgnoringVisibility, insetsMax));
            }
        }
    }

    void dispose() {
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        this.mMonitor.removeCallback(this);
        int size = this.mProtections.size();
        while (true) {
            size--;
            ArrayList<Protection> arrayList = this.mProtections;
            if (size < 0) {
                arrayList.clear();
                return;
            }
            arrayList.get(size).setController(null);
        }
    }

    Protection getProtection(int i2) {
        return this.mProtections.get(i2);
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationEnd() {
        int i2 = this.mAnimationCount;
        int i3 = i2 - 1;
        this.mAnimationCount = i3;
        if (i2 <= 0 || i3 != 0) {
            return;
        }
        updateInsets();
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationProgress(int i2, Insets insets, RectF rectF) {
        ArrayList<Protection> arrayList = this.mProtections;
        Insets insets2 = this.mInsetsIgnoringVisibility;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Protection protection = this.mProtections.get(size);
            int side = protection.getSide();
            if ((side & i2) != 0) {
                protection.setSystemVisible(true);
                if (side == 1) {
                    int i3 = insets2.left;
                    if (i3 > 0) {
                        protection.setSystemInsetAmount(insets.left / i3);
                    }
                    protection.setSystemAlpha(rectF.left);
                } else if (side == 2) {
                    int i4 = insets2.top;
                    if (i4 > 0) {
                        protection.setSystemInsetAmount(insets.top / i4);
                    }
                    protection.setSystemAlpha(rectF.top);
                } else if (side == 4) {
                    int i5 = insets2.right;
                    if (i5 > 0) {
                        protection.setSystemInsetAmount(insets.right / i5);
                    }
                    protection.setSystemAlpha(rectF.right);
                } else if (side == 8) {
                    int i6 = insets2.bottom;
                    if (i6 > 0) {
                        protection.setSystemInsetAmount(insets.bottom / i6);
                    }
                    protection.setSystemAlpha(rectF.bottom);
                }
            }
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationStart() {
        this.mAnimationCount++;
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onColorHintChanged(int i2) {
        int size = this.mProtections.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.mProtections.get(size).dispatchColorHint(i2);
            }
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onInsetsChanged(Insets insets, Insets insets2) {
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets2;
        updateInsets();
    }

    int size() {
        return this.mProtections.size();
    }
}
