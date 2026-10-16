package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.HandlerCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.slidingpanelayout.R;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import h.a.c;
import h.a.i;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final int SPLIT_DIVIDER_ACCESSIBILITY_RESIZE_LEFT = 0;
    public static final int SPLIT_DIVIDER_ACCESSIBILITY_RESIZE_RIGHT = 1;
    public static final int SPLIT_DIVIDER_POSITION_AUTO = -1;
    private boolean _isSlideable;
    private final Runnable a11yDividerPositionUpdateRunnable;
    private final AccessibilityManager accessibilityManager;
    private AccessibilityProvider accessibilityProvider;
    private TouchHandler activeTouchHandler;
    private boolean awaitingFirstLayout;
    private final MotionEvent cancelEvent;
    private final Rect computedDividerExclusionRect;
    private float currentParallaxOffset;
    private float currentSlideOffset;
    private final Rect dividerGestureExclusionRect;
    private int dividerVisualOffsetHorizontal;
    private int dividerVisualOffsetVertical;
    private final DraggableDividerHandler draggableDividerHandler;
    private final FoldBoundsCalculator foldBoundsCalculator;
    private FoldingFeature foldingFeature;
    private final List<Rect> gestureExclusionRectsList;
    private Method getAccessibilityViewIdMethod;
    private boolean isAccessibilityEnabledForTesting;
    private boolean isChildClippingToResizeDividerEnabled;
    private boolean isDividerHovered;
    private boolean isOverlappingEnabled;
    private boolean isUserResizingEnabled;
    private int lockMode;
    private View.OnClickListener onUserResizingDividerClickListener;
    private final OverlappingPaneHandler overlappingPaneHandler;
    private int paneSpacing;
    private int parallaxDistance;
    private boolean pendingA11yDividerPositionUpdates;
    private boolean preservedOpenState;
    private Drawable shadowDrawableLeft;
    private Drawable shadowDrawableRight;
    private int slideRange;
    private View slideableView;
    private int splitDividerPosition;
    private final Rect tmpRect;
    private final Rect tmpRect2;
    private final int touchTargetMin;
    private UserResizeBehavior userResizeBehavior;
    private Drawable userResizingDividerDrawable;
    private br whileAttachedToVisibleWindowJob;
    private final WindowInfoTracker windowInfoTracker;
    public static final Companion Companion = new Companion(null);
    public static final UserResizeBehavior USER_RESIZE_RELAYOUT_WHEN_COMPLETE = new UserResizeBehavior() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout$Companion$USER_RESIZE_RELAYOUT_WHEN_COMPLETE$1
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public /* synthetic */ void onAccessibilityResize(SlidingPaneLayout slidingPaneLayout, int i2) {
            SlidingPaneLayout.UserResizeBehavior.CC.$default$onAccessibilityResize(this, slidingPaneLayout, i2);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeCancelled(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeComplete(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
            slidingPaneLayout.setSplitDividerPosition(i2);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeProgress(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeStarted(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
        }
    };
    public static final UserResizeBehavior USER_RESIZE_RELAYOUT_WHEN_MOVED = new UserResizeBehavior() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout$Companion$USER_RESIZE_RELAYOUT_WHEN_MOVED$1
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public /* synthetic */ void onAccessibilityResize(SlidingPaneLayout slidingPaneLayout, int i2) {
            SlidingPaneLayout.UserResizeBehavior.CC.$default$onAccessibilityResize(this, slidingPaneLayout, i2);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeCancelled(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeComplete(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeProgress(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
            slidingPaneLayout.setSplitDividerPosition(i2);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.UserResizeBehavior
        public void onUserResizeStarted(SlidingPaneLayout slidingPaneLayout, int i2) {
            x.f(slidingPaneLayout, "slidingPaneLayout");
        }
    };

    /* compiled from: WazeSource */
    public abstract class AbsDraggableDividerHandler implements TouchHandler {
        private boolean isDragging;
        private final int touchSlop;
        private float xDown = Float.NaN;
        private int dragPositionX = -1;

        public AbsDraggableDividerHandler(int i2) {
            this.touchSlop = i2;
        }

        private final boolean commonActionDown(MotionEvent motionEvent) {
            if (!dividerBoundsContains(h.h.a.b(motionEvent.getX()), h.h.a.b(motionEvent.getY()))) {
                return false;
            }
            this.xDown = motionEvent.getX();
            if (this.touchSlop != 0) {
                return true;
            }
            this.isDragging = true;
            this.dragPositionX = clampDraggingDividerPosition(h.h.a.b(motionEvent.getX()));
            onUserResizeStarted();
            return true;
        }

        private final boolean commonActionMove(MotionEvent motionEvent) {
            boolean z = false;
            if (Float.isNaN(this.xDown)) {
                return false;
            }
            if (!this.isDragging) {
                if (Math.abs(motionEvent.getX() - this.xDown) >= this.touchSlop) {
                    this.isDragging = true;
                    z = true;
                }
            }
            if (this.isDragging) {
                this.dragPositionX = clampDraggingDividerPosition(h.h.a.b(motionEvent.getX()));
                if (z) {
                    onUserResizeStarted();
                }
                onUserResizeProgress();
            }
            return true;
        }

        public int clampDraggingDividerPosition(int i2) {
            return i2;
        }

        public abstract boolean dividerBoundsContains(int i2, int i3);

        public final int getDragPositionX() {
            return this.dragPositionX;
        }

        public final boolean isDragging() {
            return this.isDragging;
        }

        public void onDividerClicked() {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchHandler
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            x.f(motionEvent, "ev");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                return commonActionDown(motionEvent) && this.isDragging;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    return commonActionMove(motionEvent) && this.isDragging;
                }
                if (actionMasked != 3) {
                    return false;
                }
            }
            if (this.isDragging) {
                return false;
            }
            this.xDown = Float.NaN;
            return false;
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchHandler
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            x.f(motionEvent, "ev");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                return commonActionDown(motionEvent);
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    return commonActionMove(motionEvent);
                }
                if (actionMasked != 3) {
                    return false;
                }
            }
            if (Float.isNaN(this.xDown)) {
                return false;
            }
            this.xDown = Float.NaN;
            if (this.isDragging) {
                this.isDragging = false;
                onUserResizeComplete(actionMasked == 3);
                this.dragPositionX = -1;
                return true;
            }
            if (actionMasked != 1 || !dividerBoundsContains(h.h.a.b(motionEvent.getX()), h.h.a.b(motionEvent.getY()))) {
                return true;
            }
            onDividerClicked();
            return true;
        }

        public void onUserResizeComplete(boolean z) {
        }

        public void onUserResizeProgress() {
        }

        public void onUserResizeStarted() {
        }
    }

    /* compiled from: WazeSource */
    public final class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect tmpRect = new Rect();

        public AccessibilityDelegate() {
        }

        private final void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.tmpRect;
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
            x.f(view, "host");
            AccessibilityProvider accessibilityProvider = SlidingPaneLayout.this.accessibilityProvider;
            if (accessibilityProvider != null) {
                return accessibilityProvider;
            }
            AccessibilityProvider accessibilityProvider2 = SlidingPaneLayout.this.new AccessibilityProvider();
            SlidingPaneLayout.this.accessibilityProvider = accessibilityProvider2;
            return accessibilityProvider2;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            x.f(view, "host");
            x.f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            x.f(view, "host");
            x.f(accessibilityNodeInfoCompat, "info");
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatObtain);
            accessibilityNodeInfoCompat.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            x.f(viewGroup, "host");
            x.f(view, "child");
            x.f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
            if (SlidingPaneLayout.this.isDimmed(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* compiled from: WazeSource */
    public final class AccessibilityProvider extends AccessibilityNodeProviderCompat {
        private boolean dividerHasA11yFocus;

        public AccessibilityProvider() {
        }

        private final AccessibilityNodeInfoCompat createNodeForDivider() {
            AccessibilityNodeInfoCompat.obtain().setSource(SlidingPaneLayout.this, 0);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
            accessibilityNodeInfoCompatObtain.setEnabled(true);
            accessibilityNodeInfoCompatObtain.setImportantForAccessibility(true);
            accessibilityNodeInfoCompatObtain.setClassName("android.widget.Button");
            accessibilityNodeInfoCompatObtain.setPackageName(SlidingPaneLayout.this.getContext().getPackageName());
            accessibilityNodeInfoCompatObtain.setFocusable(true);
            accessibilityNodeInfoCompatObtain.setSource(SlidingPaneLayout.this, 0);
            accessibilityNodeInfoCompatObtain.setParent(SlidingPaneLayout.this);
            accessibilityNodeInfoCompatObtain.setContentDescription(SlidingPaneLayout.this.getDividerContentDescription());
            if (!SlidingPaneLayout.this.getDividerAtLeftEdge()) {
                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT);
                if (SlidingPaneLayout.this.isLayoutRtl()) {
                    accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                } else {
                    accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                }
            }
            if (!SlidingPaneLayout.this.getDividerAtRightEdge()) {
                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT);
                if (SlidingPaneLayout.this.isLayoutRtl()) {
                    accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                } else {
                    accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                }
            }
            if (SlidingPaneLayout.this.onUserResizingDividerClickListener != null) {
                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            Rect rect = slidingPaneLayout.tmpRect;
            slidingPaneLayout.computeDividerTargetRect$slidingpanelayout(rect, slidingPaneLayout.getVisualDividerPosition());
            Point point = new Point(rect.centerX(), rect.centerY());
            SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
            if (slidingPaneLayout2.getParent().getChildVisibleRect(slidingPaneLayout2, rect, point)) {
                if (rect.width() < SlidingPaneLayout.this.touchTargetMin) {
                    int i2 = point.x - (SlidingPaneLayout.this.touchTargetMin / 2);
                    int i3 = SlidingPaneLayout.this.touchTargetMin + i2;
                    rect.left = i2;
                    rect.right = i3;
                }
                if (rect.height() < SlidingPaneLayout.this.touchTargetMin) {
                    int i4 = point.y - (SlidingPaneLayout.this.touchTargetMin / 2);
                    int i5 = SlidingPaneLayout.this.touchTargetMin + i4;
                    rect.top = i4;
                    rect.bottom = i5;
                }
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                SlidingPaneLayout.this.getLocationInWindow(iArr);
                SlidingPaneLayout.this.getLocationOnScreen(iArr2);
                rect.offset((-iArr[0]) + iArr2[0], (-iArr[1]) + iArr2[1]);
                accessibilityNodeInfoCompatObtain.setVisibleToUser(true);
                accessibilityNodeInfoCompatObtain.setBoundsInScreen(rect);
            }
            accessibilityNodeInfoCompatObtain.setAccessibilityFocused(this.dividerHasA11yFocus);
            if (this.dividerHasA11yFocus) {
                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
                return accessibilityNodeInfoCompatObtain;
            }
            accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
            return accessibilityNodeInfoCompatObtain;
        }

        private final AccessibilityNodeInfoCompat createNodeForHost() {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(SlidingPaneLayout.this);
            SlidingPaneLayout.this.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompatObtain.unwrap());
            if (SlidingPaneLayout.this.isUserResizable()) {
                accessibilityNodeInfoCompatObtain.addChild(SlidingPaneLayout.this, 0);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                View childAt = slidingPaneLayout.getChildAt(i2);
                if (!slidingPaneLayout.isDimmed(childAt) && childAt.getVisibility() == 0) {
                    childAt.setImportantForAccessibility(1);
                    accessibilityNodeInfoCompatObtain.addChild(childAt);
                }
            }
            return accessibilityNodeInfoCompatObtain;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i2) {
            if (i2 == -1) {
                return createNodeForHost();
            }
            if (i2 == 0) {
                return createNodeForDivider();
            }
            return null;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int i2) {
            if (i2 == 64 && this.dividerHasA11yFocus) {
                return createAccessibilityNodeInfo(0);
            }
            return null;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i2, int i3, Bundle bundle) {
            if (i2 == -1) {
                return SlidingPaneLayout.this.performAccessibilityAction(i3, bundle);
            }
            if (i2 == 0) {
                if (i3 == 16) {
                    SlidingPaneLayout.this.draggableDividerHandler.onDividerClicked();
                    SlidingPaneLayout.sendAccessibilityEventForDivider$default(SlidingPaneLayout.this, 1, null, 0, 6, null);
                } else {
                    if (i3 == 64) {
                        SlidingPaneLayout.this.invalidate();
                        SlidingPaneLayout.sendAccessibilityEventForDivider$default(SlidingPaneLayout.this, 32768, null, 0, 6, null);
                        this.dividerHasA11yFocus = true;
                        return true;
                    }
                    if (i3 == 128) {
                        SlidingPaneLayout.this.invalidate();
                        SlidingPaneLayout.sendAccessibilityEventForDivider$default(SlidingPaneLayout.this, 65536, null, 0, 6, null);
                        this.dividerHasA11yFocus = false;
                        return true;
                    }
                    if (i3 == 4096 || i3 == 8192) {
                        if (this.dividerHasA11yFocus) {
                            int i4 = ((SlidingPaneLayout.this.isLayoutRtl() ? 1 : 0) ^ (i3 == 8192 ? 1 : 0)) ^ 1;
                            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                            slidingPaneLayout.userResizeBehavior.onAccessibilityResize(slidingPaneLayout, i4);
                            return true;
                        }
                    } else if ((i3 == 16908345 || i3 == 16908347) && this.dividerHasA11yFocus) {
                        SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                        slidingPaneLayout2.userResizeBehavior.onAccessibilityResize(slidingPaneLayout2, i3 != 16908345 ? 1 : 0);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: WazeSource */
    final class DraggableDividerHandler extends AbsDraggableDividerHandler {
        private final Rect tmpTargetRect;

        public DraggableDividerHandler() {
            super(ViewConfiguration.get(SlidingPaneLayout.this.getContext()).getScaledTouchSlop());
            this.tmpTargetRect = new Rect();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbsDraggableDividerHandler
        public int clampDraggingDividerPosition(int i2) {
            View childAt;
            View childAt2;
            boolean zIsLayoutRtl = SlidingPaneLayout.this.isLayoutRtl();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (zIsLayoutRtl) {
                childAt = slidingPaneLayout.getChildAt(1);
                x.e(childAt, "getChildAt(...)");
                childAt2 = SlidingPaneLayout.this.getChildAt(0);
                x.e(childAt2, "getChildAt(...)");
            } else {
                childAt = slidingPaneLayout.getChildAt(0);
                x.e(childAt, "getChildAt(...)");
                childAt2 = SlidingPaneLayout.this.getChildAt(1);
                x.e(childAt2, "getChildAt(...)");
            }
            SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
            int width = slidingPaneLayout2.getWidth() - slidingPaneLayout2.getPaddingRight();
            SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            if (!slidingPaneLayout3.checkLayoutParams(layoutParams)) {
                Log.w("SlidingPaneLayout", a.a(layoutParams, childAt2));
                layoutParams = slidingPaneLayout3.generateLayoutParams(layoutParams);
            }
            x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int i3 = n.i(i2, (width - (layoutParams2.leftMargin + layoutParams2.rightMargin)) - SlidingPaneLayout.this.getMinimumChildWidth(childAt2));
            SlidingPaneLayout slidingPaneLayout4 = SlidingPaneLayout.this;
            int paddingLeft = slidingPaneLayout4.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            if (!slidingPaneLayout4.checkLayoutParams(layoutParams3)) {
                Log.w("SlidingPaneLayout", a.a(layoutParams3, childAt));
                layoutParams3 = slidingPaneLayout4.generateLayoutParams(layoutParams3);
            }
            x.d(layoutParams3, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
            LayoutParams layoutParams4 = (LayoutParams) layoutParams3;
            return n.h(i3, paddingLeft + layoutParams4.leftMargin + layoutParams4.rightMargin + SlidingPaneLayout.this.getMinimumChildWidth(childAt));
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbsDraggableDividerHandler
        public boolean dividerBoundsContains(int i2, int i3) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            Rect rect = this.tmpTargetRect;
            slidingPaneLayout.computeDividerTargetRect$slidingpanelayout(rect, slidingPaneLayout.getVisualDividerPosition());
            return rect.contains(i2, i3);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbsDraggableDividerHandler
        public void onDividerClicked() {
            View.OnClickListener onClickListener = SlidingPaneLayout.this.onUserResizingDividerClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(SlidingPaneLayout.this);
            }
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbsDraggableDividerHandler
        public void onUserResizeComplete(boolean z) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (z) {
                slidingPaneLayout.userResizeBehavior.onUserResizeCancelled(slidingPaneLayout, getDragPositionX());
            } else {
                slidingPaneLayout.userResizeBehavior.onUserResizeComplete(slidingPaneLayout, getDragPositionX());
            }
            SlidingPaneLayout.this.drawableStateChanged();
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbsDraggableDividerHandler
        public void onUserResizeProgress() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.userResizeBehavior.onUserResizeProgress(slidingPaneLayout, getDragPositionX());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.AbsDraggableDividerHandler
        public void onUserResizeStarted() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.userResizeBehavior.onUserResizeStarted(slidingPaneLayout, getDragPositionX());
            SlidingPaneLayout.this.drawableStateChanged();
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LockMode {
    }

    /* compiled from: WazeSource */
    public interface PanelSlideListener {
        void onPanelClosed(View view);

        void onPanelOpened(View view);

        void onPanelSlide(View view, float f2);
    }

    /* compiled from: WazeSource */
    public class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(View view) {
            x.f(view, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(View view) {
            x.f(view, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(View view, float f2) {
            x.f(view, "panel");
        }
    }

    /* compiled from: WazeSource */
    public interface SlideableStateListener {
        void onSlideableStateChanged(boolean z);
    }

    /* compiled from: WazeSource */
    final class TouchBlocker extends ViewGroup {
        final /* synthetic */ SlidingPaneLayout this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TouchBlocker(SlidingPaneLayout slidingPaneLayout, View view) {
            super(view.getContext());
            x.f(view, "view");
            this.this$0 = slidingPaneLayout;
            addView(view);
        }

        @Override // android.view.ViewGroup
        protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return this.this$0.checkLayoutParams(layoutParams);
        }

        @Override // android.view.ViewGroup
        protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
            return this.this$0.generateDefaultLayoutParams();
        }

        @Override // android.view.ViewGroup
        protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return this.this$0.generateLayoutParams(layoutParams);
        }

        @Override // android.view.View
        public ViewGroup.LayoutParams getLayoutParams() {
            ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
            x.e(layoutParams, "getLayoutParams(...)");
            return layoutParams;
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
            return this.this$0.isSlideable();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            getChildAt(0).layout(0, 0, i4 - i2, i5 - i3);
        }

        @Override // android.view.View
        protected void onMeasure(int i2, int i3) {
            View childAt = getChildAt(0);
            childAt.measure(i2, i3);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
            return this.this$0.isSlideable();
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            x.f(layoutParams, "lp");
            getChildAt(0).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: WazeSource */
    public interface TouchHandler {
        boolean onInterceptTouchEvent(MotionEvent motionEvent);

        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* compiled from: WazeSource */
    public interface UserResizeBehavior {

        /* compiled from: WazeSource */
        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$UserResizeBehavior$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAccessibilityResize(UserResizeBehavior userResizeBehavior, SlidingPaneLayout slidingPaneLayout, int i2) {
                x.f(slidingPaneLayout, "slidingPaneLayout");
                if (i2 == 0) {
                    slidingPaneLayout.setSplitDividerPosition(slidingPaneLayout.getSplitDividerPosition() != slidingPaneLayout.getWidth() ? 0 : -1);
                } else if (i2 == 1) {
                    slidingPaneLayout.setSplitDividerPosition(slidingPaneLayout.getSplitDividerPosition() != 0 ? slidingPaneLayout.getWidth() : -1);
                }
            }
        }

        void onAccessibilityResize(SlidingPaneLayout slidingPaneLayout, int i2);

        void onUserResizeCancelled(SlidingPaneLayout slidingPaneLayout, int i2);

        void onUserResizeComplete(SlidingPaneLayout slidingPaneLayout, int i2);

        void onUserResizeProgress(SlidingPaneLayout slidingPaneLayout, int i2);

        void onUserResizeStarted(SlidingPaneLayout slidingPaneLayout, int i2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$onWindowVisibilityChanged$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ br $toJoin;
        int label;
        final /* synthetic */ SlidingPaneLayout this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(br brVar, SlidingPaneLayout slidingPaneLayout, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$toJoin = brVar;
            this.this$0 = slidingPaneLayout;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$toJoin, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r4.this$0.whileAttachedToVisibleWindow(r4) != r0) goto L17;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r5)
                goto L3c
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L18:
                e.b.c.b(r5)
                goto L2f
            L1c:
                e.b.c.b(r5)
                kotlinx.coroutines.br r5 = r4.$toJoin
                if (r5 == 0) goto L2f
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r3
                java.lang.Object r5 = r5.m(r1)
                if (r5 != r0) goto L2f
                goto L3f
            L2f:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r4.this$0
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r2
                java.lang.Object r4 = androidx.slidingpanelayout.widget.SlidingPaneLayout.access$whileAttachedToVisibleWindow(r5, r1)
                if (r4 == r0) goto L3f
            L3c:
                h.ab r4 = h.ab.f48028a
                return r4
            L3f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        this.currentSlideOffset = 1.0f;
        this.touchTargetMin = h.h.a.b(context.getResources().getDisplayMetrics().density * 48.0f);
        this.overlappingPaneHandler = new OverlappingPaneHandler();
        this.draggableDividerHandler = new DraggableDividerHandler();
        this.cancelEvent = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        this.awaitingFirstLayout = true;
        this.tmpRect = new Rect();
        this.tmpRect2 = new Rect();
        this.foldBoundsCalculator = new FoldBoundsCalculator();
        this.isOverlappingEnabled = true;
        this.windowInfoTracker = WindowInfoTracker.Companion.getOrCreate(context);
        this.computedDividerExclusionRect = new Rect();
        Rect rect = new Rect();
        this.dividerGestureExclusionRect = rect;
        this.gestureExclusionRectsList = i.d(rect);
        this.a11yDividerPositionUpdateRunnable = new Runnable() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SlidingPaneLayout.a11yDividerPositionUpdateRunnable$lambda$0(this.f$0);
            }
        };
        this.splitDividerPosition = -1;
        this.isChildClippingToResizeDividerEnabled = true;
        UserResizeBehavior userResizeBehavior = USER_RESIZE_RELAYOUT_WHEN_COMPLETE;
        this.userResizeBehavior = userResizeBehavior;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        setImportantForAccessibility(1);
        int[] iArr = R.styleable.SlidingPaneLayout;
        x.e(iArr, "SlidingPaneLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 2131953369);
        setOverlappingEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        setUserResizingEnabled(typedArrayObtainStyledAttributes.getBoolean(2, false));
        this.userResizingDividerDrawable = typedArrayObtainStyledAttributes.getDrawable(5);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(6);
        if (colorStateList != null) {
            setUserResizingDividerTint(colorStateList);
        }
        setChildClippingToResizeDividerEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SlidingPaneLayout_isChildClippingToResizeDividerEnabled, true));
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(i3 + " is not a valid userResizeBehavior value");
            }
            userResizeBehavior = USER_RESIZE_RELAYOUT_WHEN_MOVED;
        }
        this.userResizeBehavior = userResizeBehavior;
        setPaneSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        typedArrayObtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("accessibility");
        x.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
    }

    static final void a11yDividerPositionUpdateRunnable$lambda$0(SlidingPaneLayout slidingPaneLayout) {
        SlidingPaneLayout slidingPaneLayout2;
        if (slidingPaneLayout.getDividerAtLeftEdge() || slidingPaneLayout.getDividerAtRightEdge()) {
            slidingPaneLayout2 = slidingPaneLayout;
            sendAccessibilityEventForDivider$default(slidingPaneLayout2, 16384, slidingPaneLayout.getDividerContentDescription(), 0, 4, null);
        } else {
            slidingPaneLayout2 = slidingPaneLayout;
        }
        sendAccessibilityEventForDivider$default(slidingPaneLayout2, 2048, null, 1, 2, null);
        slidingPaneLayout2.pendingA11yDividerPositionUpdates = false;
    }

    private final int computeScrollOffset(View view, float f2) {
        boolean zIsLayoutRtl = isLayoutRtl();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!checkLayoutParams(layoutParams)) {
            Log.w("SlidingPaneLayout", a.a(layoutParams, view));
            layoutParams = generateLayoutParams(layoutParams);
        }
        x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (!zIsLayoutRtl) {
            return (int) (getPaddingLeft() + layoutParams2.leftMargin + (f2 * this.slideRange));
        }
        int paddingRight = getPaddingRight() + layoutParams2.rightMargin;
        int width = view.getWidth();
        return (int) (getWidth() - ((paddingRight + (f2 * this.slideRange)) + width));
    }

    private final int[] createUserResizingDividerDrawableState(int[] iArr) {
        if (c.ah(iArr, android.R.attr.state_hovered) || this.isDividerHovered) {
            if (!this.isDividerHovered) {
                return remove(iArr, android.R.attr.state_hovered);
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
            x.e(iArrCopyOf, "copyOf(...)");
            iArrCopyOf[c.y(iArrCopyOf)] = 16843623;
            return iArrCopyOf;
        }
        if (!c.ah(iArr, android.R.attr.state_pressed) && !isDividerDragging()) {
            return iArr;
        }
        if (!isDividerDragging()) {
            return remove(iArr, android.R.attr.state_pressed);
        }
        int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length + 1);
        x.e(iArrCopyOf2, "copyOf(...)");
        iArrCopyOf2[c.y(iArrCopyOf2)] = 16842919;
        return iArrCopyOf2;
    }

    private final void dispatchOnPanelSlide(View view) {
        this.overlappingPaneHandler.dispatchOnPanelSlide(view, this.currentSlideOffset);
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i2, View view) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getDividerAtLeftEdge() {
        return getVisualDividerPositionWithoutOffset() <= getPaddingLeft() + (n.h(n.i(this.paneSpacing, (getWidth() - getPaddingLeft()) - getPaddingRight()), 0) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getDividerAtRightEdge() {
        return getVisualDividerPositionWithoutOffset() >= (getWidth() - getPaddingRight()) - ((n.h(n.i(this.paneSpacing, (getWidth() - getPaddingLeft()) - getPaddingRight()), 0) + 1) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDividerContentDescription() {
        if (getDividerAtLeftEdge()) {
            return getContext().getString(com.waze.R.string.draggable_divider_handler_state_left_edge) + ", " + getContext().getString(com.waze.R.string.draggable_divider_handler);
        }
        if (!getDividerAtRightEdge()) {
            String string = getContext().getString(com.waze.R.string.draggable_divider_handler);
            x.c(string);
            return string;
        }
        return getContext().getString(com.waze.R.string.draggable_divider_handler_state_right_edge) + ", " + getContext().getString(com.waze.R.string.draggable_divider_handler);
    }

    public static /* synthetic */ void getLockMode$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMinimumChildWidth(View view) {
        return view instanceof TouchBlocker ? ((TouchBlocker) view).getChildAt(0).getMinimumWidth() : view.getMinimumWidth();
    }

    private final LayoutParams getSpLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!checkLayoutParams(layoutParams)) {
            Log.w("SlidingPaneLayout", a.a(layoutParams, view));
            layoutParams = generateLayoutParams(layoutParams);
        }
        x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
        return (LayoutParams) layoutParams;
    }

    private final Insets getSystemGestureInsets() {
        WindowInsetsCompat rootWindowInsets;
        if (!SlidingPaneLayoutKt.edgeSizeUsingSystemGestureInsets || (rootWindowInsets = ViewCompat.getRootWindowInsets(this)) == null) {
            return null;
        }
        return rootWindowInsets.getSystemGestureInsets();
    }

    private final int getVisualDividerPositionWithoutOffset() {
        View childAt;
        View childAt2;
        if (!isUserResizable()) {
            return -1;
        }
        if (isDividerDragging()) {
            return this.draggableDividerHandler.getDragPositionX();
        }
        if (this.splitDividerPosition >= 0) {
            int iH = n.h(n.i(this.paneSpacing, (getWidth() - getPaddingLeft()) - getPaddingRight()), 0);
            return n.h(n.i(this.splitDividerPosition, (getWidth() - getPaddingRight()) - ((iH + 1) / 2)), getPaddingLeft() + (iH / 2));
        }
        if (isLayoutRtl()) {
            childAt = getChildAt(1);
            x.e(childAt, "getChildAt(...)");
            childAt2 = getChildAt(0);
            x.e(childAt2, "getChildAt(...)");
        } else {
            childAt = getChildAt(0);
            x.e(childAt, "getChildAt(...)");
            childAt2 = getChildAt(1);
            x.e(childAt2, "getChildAt(...)");
        }
        int right = childAt.getRight();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (!checkLayoutParams(layoutParams)) {
            Log.w("SlidingPaneLayout", a.a(layoutParams, childAt));
            layoutParams = generateLayoutParams(layoutParams);
        }
        x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
        int left = right + ((LayoutParams) layoutParams).rightMargin + childAt2.getLeft();
        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
        if (!checkLayoutParams(layoutParams2)) {
            Log.w("SlidingPaneLayout", a.a(layoutParams2, childAt2));
            layoutParams2 = generateLayoutParams(layoutParams2);
        }
        x.d(layoutParams2, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
        return (left - ((LayoutParams) layoutParams2).leftMargin) / 2;
    }

    public static /* synthetic */ void isAccessibilityEnabledForTesting$slidingpanelayout$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!checkLayoutParams(layoutParams)) {
            Log.w("SlidingPaneLayout", a.a(layoutParams, view));
            layoutParams = generateLayoutParams(layoutParams);
        }
        x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
        return isSlideable() && ((LayoutParams) layoutParams).dimWhenOffset && this.currentSlideOffset > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPanelDragged(int i2) {
        View view = this.slideableView;
        if (view == null) {
            this.currentSlideOffset = 0.0f;
            return;
        }
        boolean zIsLayoutRtl = isLayoutRtl();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!checkLayoutParams(layoutParams)) {
            Log.w("SlidingPaneLayout", a.a(layoutParams, view));
            layoutParams = generateLayoutParams(layoutParams);
        }
        x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int width = view.getWidth();
        if (zIsLayoutRtl) {
            i2 = (getWidth() - i2) - width;
        }
        this.currentSlideOffset = (i2 - ((zIsLayoutRtl ? getPaddingRight() : getPaddingLeft()) + (zIsLayoutRtl ? layoutParams2.rightMargin : layoutParams2.leftMargin))) / this.slideRange;
        if (getParallaxDistance() != 0) {
            parallaxOtherViews(this.currentSlideOffset);
        }
        dispatchOnPanelSlide(view);
    }

    private final void parallaxOtherViews(float f2) {
        boolean zIsLayoutRtl = isLayoutRtl();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.slideableView) {
                float f3 = 1.0f - this.currentParallaxOffset;
                float parallaxDistance = getParallaxDistance();
                this.currentParallaxOffset = f2;
                int parallaxDistance2 = ((int) (f3 * parallaxDistance)) - ((int) ((1.0f - f2) * getParallaxDistance()));
                if (zIsLayoutRtl) {
                    parallaxDistance2 = -parallaxDistance2;
                }
                childAt.offsetLeftAndRight(parallaxDistance2);
            }
        }
    }

    private final boolean remeasureForFoldingFeature(FoldingFeature foldingFeature) {
        Rect rect;
        Rect rect2;
        FoldBoundsCalculator foldBoundsCalculator = this.foldBoundsCalculator;
        Rect rect3 = this.tmpRect;
        Rect rect4 = this.tmpRect2;
        boolean zSplitViewPositions = foldBoundsCalculator.splitViewPositions(foldingFeature, this, rect3, rect4);
        if (zSplitViewPositions) {
            SlidingPaneLayout slidingPaneLayout = this;
            int childCount = slidingPaneLayout.getChildCount();
            int i2 = 0;
            while (true) {
                int i3 = 8;
                if (i2 < childCount) {
                    View childAt = slidingPaneLayout.getChildAt(i2);
                    x.o(childAt);
                    if (childAt.getVisibility() != 8) {
                        if (i2 == 0) {
                            rect2 = rect3;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("too many children to split");
                            }
                            rect2 = rect4;
                        }
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (!checkLayoutParams(layoutParams)) {
                            Log.w("SlidingPaneLayout", a.a(layoutParams, childAt));
                            layoutParams = generateLayoutParams(layoutParams);
                        }
                        x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
                        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                        if (layoutParams2.width != -1 && layoutParams2.weight <= 0.0f) {
                            return false;
                        }
                        if (n.h(getMinimumChildWidth(childAt), layoutParams2.width) + layoutParams2.leftMargin + layoutParams2.rightMargin > rect2.width()) {
                            return false;
                        }
                    }
                    i2++;
                } else {
                    int childCount2 = slidingPaneLayout.getChildCount();
                    int i4 = 0;
                    while (i4 < childCount2) {
                        View childAt2 = slidingPaneLayout.getChildAt(i4);
                        x.o(childAt2);
                        if (childAt2.getVisibility() != i3) {
                            if (i4 == 0) {
                                rect = rect3;
                            } else {
                                if (i4 != 1) {
                                    throw new IllegalStateException("too many children to split");
                                }
                                rect = rect4;
                            }
                            ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                            if (!checkLayoutParams(layoutParams3)) {
                                Log.w("SlidingPaneLayout", a.a(layoutParams3, childAt2));
                                layoutParams3 = generateLayoutParams(layoutParams3);
                            }
                            x.d(layoutParams3, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
                            LayoutParams layoutParams4 = (LayoutParams) layoutParams3;
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(n.h(rect.width() - (layoutParams4.leftMargin + layoutParams4.rightMargin), 0), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824));
                        }
                        i4++;
                        i3 = 8;
                    }
                }
            }
        }
        return zSplitViewPositions;
    }

    private final int[] remove(int[] iArr, int i2) {
        int length = iArr.length - 1;
        int[] iArr2 = new int[length];
        int i3 = 0;
        boolean z = false;
        while (i3 < length) {
            int i4 = i3 + 1;
            z |= !(iArr[i3] != i2);
            iArr2[i3] = iArr[true != z ? i3 : i4];
            i3 = i4;
        }
        return iArr2;
    }

    private final TouchHandler selectActiveTouchHandler() {
        setActiveTouchHandler(isSlideable() ? this.overlappingPaneHandler : isUserResizable() ? this.draggableDividerHandler : null);
        return this.activeTouchHandler;
    }

    private final void sendAccessibilityEventForDivider(int i2, String str, int i3) {
        ViewParent parent;
        if ((this.accessibilityManager.isEnabled() || this.isAccessibilityEnabledForTesting) && (parent = getParent()) != null) {
            SlidingPaneLayout slidingPaneLayout = this;
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(i2);
            accessibilityEventObtain.setContentChangeTypes(i3);
            accessibilityEventObtain.setEnabled(true);
            accessibilityEventObtain.setClassName("android.widget.Button");
            accessibilityEventObtain.setContentDescription(str);
            AccessibilityRecordCompat.setSource(accessibilityEventObtain, slidingPaneLayout, 0);
            accessibilityEventObtain.setPackageName(getContext().getPackageName());
            parent.requestSendAccessibilityEvent(slidingPaneLayout, accessibilityEventObtain);
        }
    }

    static /* synthetic */ void sendAccessibilityEventForDivider$default(SlidingPaneLayout slidingPaneLayout, int i2, String str, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAccessibilityEventForDivider");
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        slidingPaneLayout.sendAccessibilityEventForDivider(i2, str, i3);
    }

    private final void sendDividerPositionUpdateA11yEvents() {
        if (this.pendingA11yDividerPositionUpdates) {
            return;
        }
        this.pendingA11yDividerPositionUpdates = true;
        postDelayed(this.a11yDividerPositionUpdateRunnable, 200L);
    }

    private final void setActiveTouchHandler(TouchHandler touchHandler) {
        if (x.n(this.activeTouchHandler, touchHandler)) {
            return;
        }
        TouchHandler touchHandler2 = this.activeTouchHandler;
        if (touchHandler2 != null) {
            MotionEvent motionEvent = this.cancelEvent;
            x.e(motionEvent, "cancelEvent");
            touchHandler2.onTouchEvent(motionEvent);
        }
        this.activeTouchHandler = touchHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAllChildrenVisible() {
        SlidingPaneLayout slidingPaneLayout = this;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = slidingPaneLayout.getChildAt(i2);
            x.o(childAt);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFoldingFeature(FoldingFeature foldingFeature) {
        if (x.n(foldingFeature, this.foldingFeature)) {
            return;
        }
        this.foldingFeature = foldingFeature;
        requestLayout();
    }

    private final boolean smoothSlideTo(float f2, int i2, Interpolator interpolator) {
        View view;
        if (!isSlideable() || (view = this.slideableView) == null) {
            return false;
        }
        if (!this.overlappingPaneHandler.smoothSlideViewTo(view, computeScrollOffset(view, f2), view.getTop(), i2, interpolator)) {
            return false;
        }
        setAllChildrenVisible();
        postInvalidateOnAnimation();
        return true;
    }

    private final void updateDividerDrawableBounds(int i2) {
        Drawable drawable;
        if (getWidth() <= 0 || getHeight() <= 0 || (drawable = this.userResizingDividerDrawable) == null) {
            return;
        }
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int intrinsicWidth = i2 - (drawable.getIntrinsicWidth() / 2);
        int intrinsicHeight = (height - (drawable.getIntrinsicHeight() / 2)) + this.dividerVisualOffsetVertical;
        drawable.setBounds(intrinsicWidth, intrinsicHeight, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + intrinsicHeight);
    }

    private final void updateGestureExclusion(int i2) {
        Rect rect = this.computedDividerExclusionRect;
        if (i2 < 0) {
            rect.setEmpty();
        } else {
            computeDividerTargetRect$slidingpanelayout(rect, i2);
        }
        if (x.n(this.computedDividerExclusionRect, this.dividerGestureExclusionRect)) {
            return;
        }
        if (this.computedDividerExclusionRect.isEmpty()) {
            ViewCompat.setSystemGestureExclusionRects(this, i.h());
        } else {
            this.dividerGestureExclusionRect.set(this.computedDividerExclusionRect);
            ViewCompat.setSystemGestureExclusionRects(this, this.gestureExclusionRectsList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateObscuredViewsVisibility(View view) {
        int left;
        int right;
        int top;
        int bottom;
        boolean z;
        View view2 = view;
        boolean zIsLayoutRtl = isLayoutRtl();
        int width = zIsLayoutRtl ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtl ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        SlidingPaneLayout slidingPaneLayout = this;
        int childCount = slidingPaneLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = slidingPaneLayout.getChildAt(i2);
            x.o(childAt);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                z = zIsLayoutRtl;
                childAt.setVisibility((n.h(true != zIsLayoutRtl ? width : paddingLeft, childAt.getLeft()) < left || n.h(paddingTop, childAt.getTop()) < top || n.i(true != zIsLayoutRtl ? paddingLeft : width, childAt.getRight()) > right || n.i(height, childAt.getBottom()) > bottom) ? 0 : 4);
            } else {
                z = zIsLayoutRtl;
            }
            i2++;
            view2 = view;
            zIsLayoutRtl = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object whileAttachedToVisibleWindow(e<? super ab> eVar) {
        Context context = getContext();
        x.e(context, "getContext(...)");
        final k<WindowLayoutInfo> kVarWindowLayoutInfo = this.windowInfoTracker.windowLayoutInfo(context);
        Object objCollect = ai.y(new k<FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements l {
                final /* synthetic */ l $this_unsafeFlow;

                /* compiled from: WazeSource */
                /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends h.c.b.a.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(l lVar) {
                    this.$this_unsafeFlow = lVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, h.c.e r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1$2$1 r0 = (androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1$2$1 r0 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r7)
                        goto L69
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        e.b.c.b(r7)
                        kotlinx.coroutines.b.l r5 = r5.$this_unsafeFlow
                        r7 = r0
                        h.c.e r7 = (h.c.e) r7
                        androidx.window.layout.WindowLayoutInfo r6 = (androidx.window.layout.WindowLayoutInfo) r6
                        java.util.List r6 = r6.getDisplayFeatures()
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.Iterator r6 = r6.iterator()
                    L43:
                        boolean r7 = r6.hasNext()
                        r2 = 0
                        if (r7 == 0) goto L56
                        java.lang.Object r7 = r6.next()
                        r4 = r7
                        androidx.window.layout.DisplayFeature r4 = (androidx.window.layout.DisplayFeature) r4
                        boolean r4 = r4 instanceof androidx.window.layout.FoldingFeature
                        if (r4 == 0) goto L43
                        goto L57
                    L56:
                        r7 = r2
                    L57:
                        boolean r6 = r7 instanceof androidx.window.layout.FoldingFeature
                        if (r6 == 0) goto L5e
                        r2 = r7
                        androidx.window.layout.FoldingFeature r2 = (androidx.window.layout.FoldingFeature) r2
                    L5e:
                        if (r2 == 0) goto L69
                        r0.label = r3
                        java.lang.Object r5 = r5.emit(r2, r0)
                        if (r5 != r1) goto L69
                        return r1
                    L69:
                        h.ab r5 = h.ab.f48028a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout$whileAttachedToVisibleWindow$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(l<? super FoldingFeature> lVar, e eVar2) {
                Object objCollect2 = kVarWindowLayoutInfo.collect(new AnonymousClass2(lVar), eVar2);
                return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
            }
        }).collect(new l() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.whileAttachedToVisibleWindow.3
            public final Object emit(FoldingFeature foldingFeature, e<? super ab> eVar2) {
                SlidingPaneLayout.this.setFoldingFeature(foldingFeature);
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((FoldingFeature) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    public void addPanelSlideListener(PanelSlideListener panelSlideListener) {
        x.f(panelSlideListener, "listener");
        this.overlappingPaneHandler.addPanelSlideListener(panelSlideListener);
    }

    public void addSlideableStateListener(SlideableStateListener slideableStateListener) {
        x.f(slideableStateListener, "listener");
        this.overlappingPaneHandler.addSlideableStateListener(slideableStateListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        x.f(view, "child");
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(this, view), i2, layoutParams);
        } else {
            super.addView(view, i2, layoutParams);
        }
    }

    protected boolean canScroll(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        x.f(view, "v");
        if (view instanceof ViewGroup) {
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    x.c(childAt);
                    if (canScroll(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z) {
            return false;
        }
        if (!isLayoutRtl()) {
            i2 = -i2;
        }
        return view.canScrollHorizontally(i2);
    }

    public boolean canSlide() {
        return isSlideable();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closePane();
    }

    public final boolean closePane(int i2, Interpolator interpolator) {
        x.f(interpolator, "interpolator");
        if (!isSlideable()) {
            this.preservedOpenState = false;
        }
        if (!this.awaitingFirstLayout && !smoothSlideTo(1.0f, i2, interpolator)) {
            return false;
        }
        this.preservedOpenState = false;
        return true;
    }

    public final Rect computeDividerTargetRect$slidingpanelayout(Rect rect, int i2) {
        x.f(rect, "outRect");
        Drawable drawable = this.userResizingDividerDrawable;
        if (drawable == null) {
            rect.setEmpty();
            return rect;
        }
        int i3 = this.touchTargetMin;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int iMax = Math.max(intrinsicWidth, i3);
        int iMax2 = Math.max(intrinsicHeight, i3);
        int i4 = i2 - (iMax / 2);
        int height = (((((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop()) - (iMax2 / 2)) + this.dividerVisualOffsetVertical;
        rect.set(i4, height, iMax + i4, iMax2 + height);
        return rect;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.overlappingPaneHandler.onComputeScroll();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !isUserResizable()) {
            return super.dispatchHoverEvent(motionEvent);
        }
        boolean z = this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            boolean zDividerBoundsContains = this.draggableDividerHandler.dividerBoundsContains((int) motionEvent.getX(), (int) motionEvent.getY());
            if (this.isDividerHovered ^ zDividerBoundsContains) {
                this.isDividerHovered = zDividerBoundsContains;
                drawableStateChanged();
                if (z) {
                    sendAccessibilityEventForDivider$default(this, true != zDividerBoundsContains ? 256 : 128, null, 0, 6, null);
                }
                return true;
            }
        } else if (action == 10 && this.isDividerHovered) {
            this.isDividerHovered = false;
            drawableStateChanged();
            if (z) {
                sendAccessibilityEventForDivider$default(this, 256, null, 0, 6, null);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int right;
        x.f(canvas, "c");
        super.draw(canvas);
        Drawable drawable = isLayoutRtl() ? this.shadowDrawableRight : this.shadowDrawableLeft;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isLayoutRtl()) {
                right = childAt.getRight();
                i2 = intrinsicWidth + right;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i2 = left;
                right = i3;
            }
            drawable.setBounds(right, top, i2, bottom);
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.userResizingDividerDrawable;
        if (drawable2 != null) {
            Drawable drawable3 = true == isUserResizable() ? drawable2 : null;
            if (drawable3 != null) {
                updateDividerDrawableBounds(getVisualDividerPosition());
                drawable3.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        x.f(canvas, "canvas");
        x.f(view, "child");
        if (isSlideable()) {
            Insets systemGestureInsets = getSystemGestureInsets();
            boolean zIsLayoutRtl = isLayoutRtl() ^ isOpen();
            OverlappingPaneHandler overlappingPaneHandler = this.overlappingPaneHandler;
            if (zIsLayoutRtl) {
                overlappingPaneHandler.setEdgeTrackingEnabled(1, systemGestureInsets != null ? systemGestureInsets.left : 0);
            } else {
                overlappingPaneHandler.setEdgeTrackingEnabled(2, systemGestureInsets != null ? systemGestureInsets.right : 0);
            }
        } else {
            this.overlappingPaneHandler.disableEdgeTracking();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!checkLayoutParams(layoutParams)) {
            Log.w("SlidingPaneLayout", a.a(layoutParams, view));
            layoutParams = generateLayoutParams(layoutParams);
        }
        x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iSave = canvas.save();
        if (isSlideable() && !layoutParams2.slideable && this.slideableView != null) {
            canvas.getClipBounds(this.tmpRect);
            boolean zIsLayoutRtl2 = isLayoutRtl();
            Rect rect = this.tmpRect;
            if (zIsLayoutRtl2) {
                int i2 = rect.left;
                View view2 = this.slideableView;
                x.c(view2);
                rect.left = Math.max(i2, view2.getRight());
            } else {
                int i3 = rect.right;
                View view3 = this.slideableView;
                x.c(view3);
                rect.right = Math.min(i3, view3.getLeft());
            }
            canvas.clipRect(this.tmpRect);
        }
        if (!isSlideable() && this.isChildClippingToResizeDividerEnabled) {
            int visualDividerPositionWithoutOffset = getVisualDividerPositionWithoutOffset();
            int iH = n.h(n.i(this.paneSpacing, (getWidth() - getPaddingLeft()) - getPaddingRight()), 0);
            if (visualDividerPositionWithoutOffset >= 0) {
                Rect rect2 = this.tmpRect;
                if ((view == getChildAt(0)) ^ isLayoutRtl()) {
                    rect2.left = getPaddingLeft();
                    rect2.right = visualDividerPositionWithoutOffset - (iH / 2);
                } else {
                    rect2.left = visualDividerPositionWithoutOffset + ((iH + 1) / 2);
                    rect2.right = getWidth() - getPaddingRight();
                }
                rect2.top = getPaddingTop();
                rect2.bottom = getHeight() - getPaddingBottom();
                canvas.clipRect(this.tmpRect);
            }
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.userResizingDividerDrawable;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.userResizingDividerDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        x.e(drawableState, "getDrawableState(...)");
        if (drawable.setState(createUserResizingDividerDrawableState(drawableState))) {
            invalidateDrawable(drawable);
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        try {
            SlidingPaneLayout slidingPaneLayout = this;
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams == null ? generateDefaultLayoutParams() : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return 0;
    }

    public final int getDividerVisualOffsetHorizontal() {
        return this.dividerVisualOffsetHorizontal;
    }

    public final int getDividerVisualOffsetVertical() {
        return this.dividerVisualOffsetVertical;
    }

    public final int getLockMode() {
        return this.lockMode;
    }

    public final int getPaneSpacing() {
        return this.paneSpacing;
    }

    public int getParallaxDistance() {
        return this.parallaxDistance;
    }

    public int getSliderFadeColor() {
        return 0;
    }

    public final int getSplitDividerPosition() {
        return this.splitDividerPosition;
    }

    public final int getVisualDividerPosition() {
        int visualDividerPositionWithoutOffset = getVisualDividerPositionWithoutOffset();
        return visualDividerPositionWithoutOffset < 0 ? visualDividerPositionWithoutOffset : visualDividerPositionWithoutOffset + this.dividerVisualOffsetHorizontal;
    }

    public final boolean isAccessibilityEnabledForTesting$slidingpanelayout() {
        return this.isAccessibilityEnabledForTesting;
    }

    public final boolean isChildClippingToResizeDividerEnabled() {
        return this.isChildClippingToResizeDividerEnabled;
    }

    public final boolean isDividerDragging() {
        return this.draggableDividerHandler.isDragging();
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !isSlideable() || this.currentSlideOffset == 0.0f;
    }

    public final boolean isOverlappingEnabled() {
        return this.isOverlappingEnabled;
    }

    public boolean isSlideable() {
        return this._isSlideable;
    }

    public final boolean isUserResizable() {
        return (isSlideable() || !this.isUserResizingEnabled || this.userResizingDividerDrawable == null) ? false : true;
    }

    public final boolean isUserResizingEnabled() {
        return this.isUserResizingEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.userResizingDividerDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.awaitingFirstLayout = true;
        br brVar = this.whileAttachedToVisibleWindowJob;
        if (brVar != null) {
            brVar.s(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        br brVar = this.whileAttachedToVisibleWindowJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.awaitingFirstLayout = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x.f(motionEvent, "ev");
        TouchHandler touchHandlerSelectActiveTouchHandler = selectActiveTouchHandler();
        if (touchHandlerSelectActiveTouchHandler != null) {
            return touchHandlerSelectActiveTouchHandler.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0279 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5 A[PHI: r19
  0x00c5: PHI (r19v2 float) = (r19v1 float), (r19v3 float) binds: [B:22:0x00b7, B:24:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (motionEvent != null && isUserResizable() && motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE)) {
            return this.draggableDividerHandler.dividerBoundsContains((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) ? PointerIcon.getSystemIcon(getContext(), 1014) : super.onResolvePointerIcon(motionEvent, i2);
        }
        return super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen()) {
            openPane();
        } else {
            closePane();
        }
        this.preservedOpenState = savedState.isOpen();
        this.lockMode = savedState.getLockMode();
        setSplitDividerPosition(savedState.getSplitDividerPosition());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setOpen(isSlideable() ? isOpen() : this.preservedOpenState);
        savedState.setLockMode(this.lockMode);
        savedState.setSplitDividerPosition(this.splitDividerPosition);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.awaitingFirstLayout = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x.f(motionEvent, "ev");
        TouchHandler touchHandlerSelectActiveTouchHandler = selectActiveTouchHandler();
        if (touchHandlerSelectActiveTouchHandler != null) {
            return touchHandlerSelectActiveTouchHandler.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        br brVar = this.whileAttachedToVisibleWindowJob;
        br brVarZ = null;
        if (brVar != null) {
            brVar.s(null);
        } else {
            brVar = null;
        }
        if (i2 == 0) {
            Handler handlerCreateAsync = HandlerCompat.createAsync(getHandler().getLooper());
            x.e(handlerCreateAsync, "createAsync(...)");
            brVarZ = aj.z(aj.e(kotlinx.coroutines.android.e.a(handlerCreateAsync, null)), null, ag.f51345d, new AnonymousClass1(brVar, this, null), 1);
        }
        this.whileAttachedToVisibleWindowJob = brVarZ;
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openPane();
    }

    public final boolean openPane(int i2, Interpolator interpolator) {
        x.f(interpolator, "interpolator");
        if (!isSlideable()) {
            this.preservedOpenState = true;
        }
        if (!this.awaitingFirstLayout && !smoothSlideTo(0.0f, i2, interpolator)) {
            return false;
        }
        this.preservedOpenState = true;
        return true;
    }

    public void removePanelSlideListener(PanelSlideListener panelSlideListener) {
        x.f(panelSlideListener, "listener");
        this.overlappingPaneHandler.removePanelSlideListener(panelSlideListener);
    }

    public void removeSlideableStateListener(SlideableStateListener slideableStateListener) {
        x.f(slideableStateListener, "listener");
        this.overlappingPaneHandler.removeSlideableStateListener(slideableStateListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        x.f(view, "view");
        if (!(view.getParent() instanceof TouchBlocker)) {
            super.removeView(view);
            return;
        }
        Object parent = view.getParent();
        x.d(parent, "null cannot be cast to non-null type android.view.View");
        super.removeView((View) parent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || isSlideable()) {
            return;
        }
        this.preservedOpenState = view == this.slideableView;
    }

    public final void setAccessibilityEnabledForTesting$slidingpanelayout(boolean z) {
        this.isAccessibilityEnabledForTesting = z;
    }

    public final void setChildClippingToResizeDividerEnabled(boolean z) {
        if (z != this.isChildClippingToResizeDividerEnabled) {
            this.isChildClippingToResizeDividerEnabled = z;
            invalidate();
        }
    }

    public void setCoveredFadeColor(int i2) {
    }

    public final void setDividerVisualOffsetHorizontal(int i2) {
        if (i2 != this.dividerVisualOffsetHorizontal) {
            this.dividerVisualOffsetHorizontal = i2;
            invalidate();
        }
    }

    public final void setDividerVisualOffsetVertical(int i2) {
        if (i2 != this.dividerVisualOffsetVertical) {
            this.dividerVisualOffsetVertical = i2;
            invalidate();
        }
    }

    public final void setLockMode(int i2) {
        this.lockMode = i2;
    }

    public final void setOnUserResizingDividerClickListener(View.OnClickListener onClickListener) {
        this.onUserResizingDividerClickListener = onClickListener;
    }

    public final void setOverlappingEnabled(boolean z) {
        if (z != this.isOverlappingEnabled) {
            this.isOverlappingEnabled = z;
            requestLayout();
        }
    }

    public final void setPaneSpacing(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("paneSpacing can't be negative, but the given value is: " + i2);
        }
        if (i2 != this.paneSpacing) {
            this.paneSpacing = i2;
            requestLayout();
        }
    }

    public void setPanelSlideListener(PanelSlideListener panelSlideListener) {
        this.overlappingPaneHandler.setPanelSlideListener(panelSlideListener);
    }

    public void setParallaxDistance(int i2) {
        this.parallaxDistance = i2;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.shadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.shadowDrawableRight = drawable;
    }

    public void setShadowResource(int i2) {
        setShadowResourceLeft(i2);
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setSliderFadeColor(int i2) {
    }

    public final void setSplitDividerPosition(int i2) {
        if (this.splitDividerPosition != i2) {
            this.splitDividerPosition = i2;
            if (isSlideable()) {
                return;
            }
            requestLayout();
        }
    }

    public final void setUserResizeBehavior(UserResizeBehavior userResizeBehavior) {
        x.f(userResizeBehavior, "userResizeBehavior");
        this.userResizeBehavior = userResizeBehavior;
    }

    public final void setUserResizingDividerDrawable(Drawable drawable) {
        Drawable drawable2 = this.userResizingDividerDrawable;
        if (drawable != drawable2) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(drawable2);
            }
            this.userResizingDividerDrawable = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    int[] drawableState = getDrawableState();
                    x.e(drawableState, "getDrawableState(...)");
                    drawable.setState(createUserResizingDividerDrawableState(drawableState));
                }
                drawable.setVisible(getVisibility() == 0, false);
            }
            requestLayout();
        }
    }

    public final void setUserResizingDividerTint(ColorStateList colorStateList) {
        Drawable drawable = this.userResizingDividerDrawable;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public final void setUserResizingEnabled(boolean z) {
        if (z != this.isUserResizingEnabled) {
            this.isUserResizingEnabled = z;
            requestLayout();
        }
    }

    public void smoothSlideClosed() {
        closePane();
    }

    public void smoothSlideOpen() {
        openPane();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        x.f(drawable, "who");
        return super.verifyDrawable(drawable) || drawable == this.userResizingDividerDrawable;
    }

    /* compiled from: WazeSource */
    public final class SavedState extends AbsSavedState {
        private boolean isOpen;
        private int lockMode;
        private int splitDividerPosition;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                x.f(parcel, "parcel");
                x.f(classLoader, "loader");
                return new SlidingPaneLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SlidingPaneLayout.SavedState[] newArray(int i2) {
                return new SlidingPaneLayout.SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel) {
                x.f(parcel, "parcel");
                return new SlidingPaneLayout.SavedState(parcel, null);
            }
        };

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            x.f(parcel, "parcel");
            this.splitDividerPosition = -1;
            this.isOpen = parcel.readInt() != 0;
            this.lockMode = parcel.readInt();
            this.splitDividerPosition = parcel.readInt();
        }

        public static /* synthetic */ void getLockMode$annotations() {
        }

        public final int getLockMode() {
            return this.lockMode;
        }

        public final int getSplitDividerPosition() {
            return this.splitDividerPosition;
        }

        public final boolean isOpen() {
            return this.isOpen;
        }

        public final void setLockMode(int i2) {
            this.lockMode = i2;
        }

        public final void setOpen(boolean z) {
            this.isOpen = z;
        }

        public final void setSplitDividerPosition(int i2) {
            this.splitDividerPosition = i2;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            x.f(parcel, "out");
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.lockMode);
            parcel.writeInt(this.splitDividerPosition);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
            x.c(parcelable);
            this.splitDividerPosition = -1;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface AccessibilityResizeDirection {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class OverlappingPaneHandler extends ViewDragHelper.Callback implements TouchHandler {
        private final ViewDragHelper dragHelper;
        private float initialMotionX;
        private float initialMotionY;
        private boolean isUnableToDrag;
        private PanelSlideListener singlePanelSlideListener;
        private final List<SlideableStateListener> slideableStateListeners = new CopyOnWriteArrayList();
        private final List<PanelSlideListener> panelSlideListeners = new CopyOnWriteArrayList();

        public OverlappingPaneHandler() {
            ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(SlidingPaneLayout.this, 0.5f, this);
            viewDragHelperCreate.setMinVelocity(SlidingPaneLayout.this.getContext().getResources().getDisplayMetrics().density * 400.0f);
            x.e(viewDragHelperCreate, "apply(...)");
            this.dragHelper = viewDragHelperCreate;
        }

        public final void abort() {
            this.dragHelper.abort();
        }

        public final void addPanelSlideListener(PanelSlideListener panelSlideListener) {
            x.f(panelSlideListener, "listener");
            this.panelSlideListeners.add(panelSlideListener);
        }

        public final void addSlideableStateListener(SlideableStateListener slideableStateListener) {
            x.f(slideableStateListener, "listener");
            this.slideableStateListeners.add(slideableStateListener);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i2, int i3) {
            x.f(view, "child");
            View view2 = SlidingPaneLayout.this.slideableView;
            if (view2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!slidingPaneLayout.checkLayoutParams(layoutParams)) {
                Log.w("SlidingPaneLayout", a.a(layoutParams, view2));
                layoutParams = slidingPaneLayout.generateLayoutParams(layoutParams);
            }
            x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            boolean zIsLayoutRtl = SlidingPaneLayout.this.isLayoutRtl();
            SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
            if (!zIsLayoutRtl) {
                int paddingLeft = slidingPaneLayout2.getPaddingLeft() + layoutParams2.leftMargin;
                return n.h(n.i(i2, SlidingPaneLayout.this.slideRange + paddingLeft), paddingLeft);
            }
            int width = slidingPaneLayout2.getWidth() - ((slidingPaneLayout2.getPaddingRight() + layoutParams2.rightMargin) + view2.getWidth());
            return n.h(n.i(i2, width), width - SlidingPaneLayout.this.slideRange);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i2, int i3) {
            x.f(view, "child");
            return view.getTop();
        }

        public final void disableEdgeTracking() {
            this.dragHelper.setEdgeTrackingEnabled(0);
        }

        public final void dispatchOnPanelClosed(View view) {
            if (view != null) {
                Iterator<PanelSlideListener> it = this.panelSlideListeners.iterator();
                while (it.hasNext()) {
                    it.next().onPanelClosed(view);
                }
                SlidingPaneLayout.this.sendAccessibilityEvent(32);
            }
        }

        public final void dispatchOnPanelOpened(View view) {
            if (view != null) {
                Iterator<PanelSlideListener> it = this.panelSlideListeners.iterator();
                while (it.hasNext()) {
                    it.next().onPanelOpened(view);
                }
                SlidingPaneLayout.this.sendAccessibilityEvent(32);
            }
        }

        public final void dispatchOnPanelSlide(View view, float f2) {
            x.f(view, "panel");
            Iterator<PanelSlideListener> it = this.panelSlideListeners.iterator();
            while (it.hasNext()) {
                it.next().onPanelSlide(view, f2);
            }
        }

        public final void dispatchSlideableState(boolean z) {
            Iterator<SlideableStateListener> it = this.slideableStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onSlideableStateChanged(z);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            x.f(view, "child");
            return SlidingPaneLayout.this.slideRange;
        }

        public final boolean isDraggable() {
            if (this.isUnableToDrag || SlidingPaneLayout.this.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        public final boolean isIdle() {
            return this.dragHelper.getViewDragState() == 0;
        }

        public final void onComputeScroll() {
            if (this.dragHelper.continueSettling(true)) {
                if (SlidingPaneLayout.this.isSlideable()) {
                    SlidingPaneLayout.this.postInvalidateOnAnimation();
                } else {
                    this.dragHelper.abort();
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i2, int i3) {
            if (isDraggable()) {
                ViewDragHelper viewDragHelper = this.dragHelper;
                View view = SlidingPaneLayout.this.slideableView;
                x.c(view);
                viewDragHelper.captureChildView(view, i3);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i2, int i3) {
            if (isDraggable()) {
                ViewDragHelper viewDragHelper = this.dragHelper;
                View view = SlidingPaneLayout.this.slideableView;
                x.c(view);
                viewDragHelper.captureChildView(view, i3);
            }
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchHandler
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            View childAt;
            x.f(motionEvent, "ev");
            int actionMasked = motionEvent.getActionMasked();
            if (!SlidingPaneLayout.this.isSlideable() && actionMasked == 0) {
                if (SlidingPaneLayout.this.getChildCount() > 1 && (childAt = SlidingPaneLayout.this.getChildAt(1)) != null) {
                    SlidingPaneLayout.this.preservedOpenState = this.dragHelper.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
                }
                actionMasked = 0;
            }
            if (SlidingPaneLayout.this.isSlideable()) {
                if (this.isUnableToDrag) {
                    if (actionMasked == 0) {
                        actionMasked = 0;
                    }
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    this.dragHelper.cancel();
                    return false;
                }
                if (actionMasked == 0) {
                    this.isUnableToDrag = false;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.initialMotionX = x;
                    this.initialMotionY = y;
                    if (this.dragHelper.isViewUnder(SlidingPaneLayout.this.slideableView, (int) x, (int) y)) {
                        SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                        if (slidingPaneLayout.isDimmed(slidingPaneLayout.slideableView)) {
                            z = true;
                        }
                    }
                    return !this.dragHelper.shouldInterceptTouchEvent(motionEvent) || z;
                }
                if (actionMasked == 2) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float fAbs = Math.abs(x2 - this.initialMotionX);
                    float f2 = y2 - this.initialMotionY;
                    ViewDragHelper viewDragHelper = this.dragHelper;
                    float fAbs2 = Math.abs(f2);
                    if (fAbs > viewDragHelper.getTouchSlop() && fAbs2 > fAbs) {
                        this.dragHelper.cancel();
                        this.isUnableToDrag = true;
                        return false;
                    }
                }
                z = false;
                if (this.dragHelper.shouldInterceptTouchEvent(motionEvent)) {
                }
            }
            this.dragHelper.cancel();
            return SlidingPaneLayout.super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchHandler
        public boolean onTouchEvent(MotionEvent motionEvent) {
            x.f(motionEvent, "ev");
            if (!SlidingPaneLayout.this.isSlideable()) {
                return SlidingPaneLayout.super.onTouchEvent(motionEvent);
            }
            this.dragHelper.processTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.initialMotionX = x;
                this.initialMotionY = y;
            } else if (actionMasked == 1) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.isDimmed(slidingPaneLayout.slideableView)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f2 = x2 - this.initialMotionX;
                    float f3 = y2 - this.initialMotionY;
                    int touchSlop = this.dragHelper.getTouchSlop();
                    if ((f2 * f2) + (f3 * f3) < touchSlop * touchSlop) {
                        if (this.dragHelper.isViewUnder(SlidingPaneLayout.this.slideableView, (int) x2, (int) y2)) {
                            SlidingPaneLayout.this.closePane(0);
                        }
                    }
                }
            }
            return true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i2) {
            x.f(view, "capturedChild");
            SlidingPaneLayout.this.setAllChildrenVisible();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i2) {
            boolean z;
            if (this.dragHelper.getViewDragState() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                float f2 = slidingPaneLayout.currentSlideOffset;
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                if (f2 == 1.0f) {
                    slidingPaneLayout2.updateObscuredViewsVisibility(slidingPaneLayout2.slideableView);
                    dispatchOnPanelClosed(SlidingPaneLayout.this.slideableView);
                    z = false;
                } else {
                    dispatchOnPanelOpened(slidingPaneLayout2.slideableView);
                    z = true;
                }
                slidingPaneLayout.preservedOpenState = z;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
            x.f(view, "changedView");
            SlidingPaneLayout.this.onPanelDragged(i2);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f2, float f3) {
            int paddingLeft;
            x.f(view, "releasedChild");
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!slidingPaneLayout.checkLayoutParams(layoutParams)) {
                Log.w("SlidingPaneLayout", a.a(layoutParams, view));
                layoutParams = slidingPaneLayout.generateLayoutParams(layoutParams);
            }
            x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            boolean zIsLayoutRtl = SlidingPaneLayout.this.isLayoutRtl();
            SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
            if (zIsLayoutRtl) {
                int paddingRight = slidingPaneLayout2.getPaddingRight() + layoutParams2.rightMargin;
                if (f2 < 0.0f || (f2 == 0.0f && SlidingPaneLayout.this.currentSlideOffset > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.slideRange;
                }
                View view2 = SlidingPaneLayout.this.slideableView;
                x.c(view2);
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - view2.getWidth();
            } else {
                paddingLeft = layoutParams2.leftMargin + slidingPaneLayout2.getPaddingLeft();
                if (f2 > 0.0f || (f2 == 0.0f && SlidingPaneLayout.this.currentSlideOffset > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.slideRange;
                }
            }
            this.dragHelper.settleCapturedViewAt(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public final void removePanelSlideListener(PanelSlideListener panelSlideListener) {
            x.f(panelSlideListener, "listener");
            this.panelSlideListeners.remove(panelSlideListener);
        }

        public final void removeSlideableStateListener(SlideableStateListener slideableStateListener) {
            x.f(slideableStateListener, "listener");
            this.slideableStateListeners.remove(slideableStateListener);
        }

        public final void setEdgeTrackingEnabled(int i2, int i3) {
            this.dragHelper.setEdgeTrackingEnabled(i2);
            this.dragHelper.setEdgeSize(n.h(i3, this.dragHelper.getDefaultEdgeSize()));
        }

        public final void setPanelSlideListener(PanelSlideListener panelSlideListener) {
            PanelSlideListener panelSlideListener2 = this.singlePanelSlideListener;
            if (panelSlideListener2 != null) {
                removePanelSlideListener(panelSlideListener2);
            }
            if (panelSlideListener != null) {
                addPanelSlideListener(panelSlideListener);
            }
            this.singlePanelSlideListener = panelSlideListener;
        }

        public final boolean smoothSlideViewTo(View view, int i2, int i3, int i4, Interpolator interpolator) {
            x.f(view, "view");
            x.f(interpolator, "interpolator");
            return this.dragHelper.smoothSlideViewTo(view, i2, i3, i4, interpolator);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i2) {
            x.f(view, "child");
            if (!isDraggable()) {
                return false;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!slidingPaneLayout.checkLayoutParams(layoutParams)) {
                Log.w("SlidingPaneLayout", a.a(layoutParams, view));
                layoutParams = slidingPaneLayout.generateLayoutParams(layoutParams);
            }
            x.d(layoutParams, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams");
            return ((LayoutParams) layoutParams).slideable;
        }

        public final boolean smoothSlideViewTo(View view, int i2, int i3) {
            x.f(view, "view");
            return this.dragHelper.smoothSlideViewTo(view, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        x.e(context, "getContext(...)");
        return new LayoutParams(context, attributeSet);
    }

    private final boolean openPane(int i2) {
        if (!isSlideable()) {
            this.preservedOpenState = true;
        }
        if (!this.awaitingFirstLayout && !smoothSlideTo(0.0f, i2)) {
            return false;
        }
        this.preservedOpenState = true;
        return true;
    }

    /* compiled from: WazeSource */
    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        public boolean dimWhenOffset;
        public boolean slideable;
        public float weight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            x.f(context, "context");
            int[] iArr = R.styleable.SlidingPaneLayout_Layout;
            x.e(iArr, "SlidingPaneLayout_Layout");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            this.weight = typedArrayObtainStyledAttributes.getFloat(R.styleable.SlidingPaneLayout_Layout_android_layout_weight, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public final int getHorizontalMargin$slidingpanelayout() {
            return this.leftMargin + this.rightMargin;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            x.f(layoutParams, "source");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            x.f(marginLayoutParams, "source");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            x.f(layoutParams, "source");
            this.weight = layoutParams.weight;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean closePane(int i2) {
        if (!isSlideable()) {
            this.preservedOpenState = false;
        }
        if (!this.awaitingFirstLayout && !smoothSlideTo(1.0f, i2)) {
            return false;
        }
        this.preservedOpenState = false;
        return true;
    }

    public boolean openPane() {
        return openPane(0);
    }

    public boolean closePane() {
        return closePane(0);
    }

    private final boolean smoothSlideTo(float f2, int i2) {
        View view;
        if (!isSlideable() || (view = this.slideableView) == null) {
            return false;
        }
        if (!this.overlappingPaneHandler.smoothSlideViewTo(view, computeScrollOffset(view, f2), view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        postInvalidateOnAnimation();
        return true;
    }

    public final void setUserResizingDividerDrawable(int i2) {
        setUserResizingDividerDrawable(ContextCompat.getDrawable(getContext(), i2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingPaneLayout(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
