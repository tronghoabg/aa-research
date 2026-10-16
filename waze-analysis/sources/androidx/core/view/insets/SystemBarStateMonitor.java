package androidx.core.view.insets;

import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class SystemBarStateMonitor {
    private final ArrayList<Callback> mCallbacks = new ArrayList<>();
    private int mColorHint;
    private final View mDetector;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;

    /* compiled from: WazeSource */
    interface Callback {
        void onAnimationEnd();

        void onAnimationProgress(int i2, Insets insets, RectF rectF);

        void onAnimationStart();

        void onColorHintChanged(int i2);

        void onInsetsChanged(Insets insets, Insets insets2);
    }

    SystemBarStateMonitor(final ViewGroup viewGroup) {
        Insets insets = Insets.NONE;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        Drawable background = viewGroup.getBackground();
        int i2 = 0;
        this.mColorHint = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        View view = new View(viewGroup.getContext()) { // from class: androidx.core.view.insets.SystemBarStateMonitor.1
            @Override // android.view.View
            protected void onConfigurationChanged(Configuration configuration) {
                Drawable background2 = viewGroup.getBackground();
                int color = background2 instanceof ColorDrawable ? ((ColorDrawable) background2).getColor() : 0;
                if (SystemBarStateMonitor.this.mColorHint == color) {
                    return;
                }
                SystemBarStateMonitor.this.mColorHint = color;
                int size = SystemBarStateMonitor.this.mCallbacks.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    } else {
                        ((Callback) SystemBarStateMonitor.this.mCallbacks.get(size)).onColorHintChanged(color);
                    }
                }
            }
        };
        this.mDetector = view;
        view.setVisibility(8);
        view.setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.m11826lambda$new$0$androidxcoreviewinsetsSystemBarStateMonitor(view2, windowInsetsCompat);
            }
        });
        ViewCompat.setWindowInsetsAnimationCallback(view, new WindowInsetsAnimationCompat.Callback(i2) { // from class: androidx.core.view.insets.SystemBarStateMonitor.2
            private final HashMap<WindowInsetsAnimationCompat, Integer> mAnimationSidesMap = new HashMap<>();

            private boolean animatesSystemBars(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                return (windowInsetsAnimationCompat.getTypeMask() & DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL) != 0;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                if (!animatesSystemBars(windowInsetsAnimationCompat)) {
                    return;
                }
                this.mAnimationSidesMap.remove(windowInsetsAnimationCompat);
                int size = SystemBarStateMonitor.this.mCallbacks.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    } else {
                        ((Callback) SystemBarStateMonitor.this.mCallbacks.get(size)).onAnimationEnd();
                    }
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                if (!animatesSystemBars(windowInsetsAnimationCompat)) {
                    return;
                }
                int size = SystemBarStateMonitor.this.mCallbacks.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    } else {
                        ((Callback) SystemBarStateMonitor.this.mCallbacks.get(size)).onAnimationStart();
                    }
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i3 = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = list.get(size);
                    Integer num = this.mAnimationSidesMap.get(windowInsetsAnimationCompat);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float alpha = windowInsetsAnimationCompat.getAlpha();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = alpha;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = alpha;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = alpha;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = alpha;
                        }
                        i3 |= iIntValue;
                    }
                }
                Insets insets2 = SystemBarStateMonitor.this.getInsets(windowInsetsCompat);
                int size2 = SystemBarStateMonitor.this.mCallbacks.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        return windowInsetsCompat;
                    }
                    ((Callback) SystemBarStateMonitor.this.mCallbacks.get(size2)).onAnimationProgress(i3, insets2, rectF);
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                if (!animatesSystemBars(windowInsetsAnimationCompat)) {
                    return boundsCompat;
                }
                Insets upperBound = boundsCompat.getUpperBound();
                Insets lowerBound = boundsCompat.getLowerBound();
                int i3 = upperBound.left != lowerBound.left ? 1 : 0;
                if (upperBound.top != lowerBound.top) {
                    i3 |= 2;
                }
                if (upperBound.right != lowerBound.right) {
                    i3 |= 4;
                }
                if (upperBound.bottom != lowerBound.bottom) {
                    i3 |= 8;
                }
                this.mAnimationSidesMap.put(windowInsetsAnimationCompat, Integer.valueOf(i3));
                return boundsCompat;
            }
        });
        addViewWhenReady(viewGroup, view, 0);
    }

    private static void addViewWhenReady(final ViewGroup viewGroup, final View view, final int i2) {
        View childAt;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                childAt = null;
                break;
            } else {
                childAt = viewGroup.getChildAt(childCount);
                if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                    break;
                }
            }
        }
        if (childAt == null) {
            viewGroup.addView(view, i2);
        } else {
            childAt.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.insets.SystemBarStateMonitor.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    viewGroup.addView(view, i2);
                    view2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    viewGroup.addView(view, i2);
                    view2.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Insets getInsets(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL), windowInsetsCompat.getInsets(64));
    }

    private Insets getInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsetsIgnoringVisibility(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL), windowInsetsCompat.getInsetsIgnoringVisibility(64));
    }

    void addCallback(Callback callback) {
        if (this.mCallbacks.contains(callback)) {
            return;
        }
        this.mCallbacks.add(callback);
        callback.onInsetsChanged(this.mInsets, this.mInsetsIgnoringVisibility);
        callback.onColorHintChanged(this.mColorHint);
    }

    void detachFromWindow() {
        this.mDetector.post(new Runnable() { // from class: androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m11825xf3edbe07();
            }
        });
    }

    boolean hasCallback() {
        return !this.mCallbacks.isEmpty();
    }

    /* renamed from: lambda$detachFromWindow$1$androidx-core-view-insets-SystemBarStateMonitor, reason: not valid java name */
    /* synthetic */ void m11825xf3edbe07() {
        ViewParent parent = this.mDetector.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.mDetector);
        }
    }

    /* renamed from: lambda$new$0$androidx-core-view-insets-SystemBarStateMonitor, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m11826lambda$new$0$androidxcoreviewinsetsSystemBarStateMonitor(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = getInsets(windowInsetsCompat);
        Insets insetsIgnoringVisibility = getInsetsIgnoringVisibility(windowInsetsCompat);
        if (!insets.equals(this.mInsets) || !insetsIgnoringVisibility.equals(this.mInsetsIgnoringVisibility)) {
            this.mInsets = insets;
            this.mInsetsIgnoringVisibility = insetsIgnoringVisibility;
            int size = this.mCallbacks.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.mCallbacks.get(size).onInsetsChanged(insets, insetsIgnoringVisibility);
            }
        }
        return windowInsetsCompat;
    }

    void removeCallback(Callback callback) {
        this.mCallbacks.remove(callback);
    }
}
