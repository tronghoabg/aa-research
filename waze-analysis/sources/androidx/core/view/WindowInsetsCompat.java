package androidx.core.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayShape;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat CONSUMED;
    private static final String TAG = "WindowInsetsCompat";
    private final Impl mImpl;

    /* compiled from: WazeSource */
    class Impl {
        static final WindowInsetsCompat CONSUMED = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
        final WindowInsetsCompat mHost;

        Impl(WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        void copyRootViewBounds(View view) {
        }

        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return isRound() == impl.isRound() && isConsumed() == impl.isConsumed() && ObjectsCompat.equals(getSystemWindowInsets(), impl.getSystemWindowInsets()) && ObjectsCompat.equals(getStableInsets(), impl.getStableInsets()) && ObjectsCompat.equals(getDisplayCutout(), impl.getDisplayCutout());
        }

        List<Rect> getBoundingRects(int i2) {
            return Collections.EMPTY_LIST;
        }

        List<Rect> getBoundingRectsIgnoringVisibility(int i2) {
            return Collections.EMPTY_LIST;
        }

        DisplayCutoutCompat getDisplayCutout() {
            return null;
        }

        DisplayShapeCompat getDisplayShape() {
            return DisplayShapeCompat.EMPTY;
        }

        Insets getInsets(int i2) {
            return Insets.NONE;
        }

        Insets getInsetsIgnoringVisibility(int i2) {
            if ((i2 & 8) == 0) {
                return Insets.NONE;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        Insets getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        Rect getPrivacyIndicatorBounds() {
            return null;
        }

        RoundedCornerCompat getRoundedCorner(int i2) {
            return null;
        }

        Insets getStableInsets() {
            return Insets.NONE;
        }

        Insets getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        Insets getSystemWindowInsets() {
            return Insets.NONE;
        }

        Insets getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        public int hashCode() {
            return ObjectsCompat.hash(Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }

        void initDisplayShape(View view) {
        }

        void initTypeBoundingRectsMaps() {
        }

        WindowInsetsCompat inset(int i2, int i3, int i4, int i5) {
            return CONSUMED;
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i2) {
            return true;
        }

        public void setDisplayShape(DisplayShapeCompat displayShapeCompat) {
        }

        public void setOverriddenInsets(Insets[] insetsArr) {
        }

        void setRootViewData(Insets insets) {
        }

        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(Insets insets) {
        }

        void setSystemUiVisibility(int i2) {
        }

        void setTypeBoundingRectsMap(Rect[][] rectArr) {
        }

        void setTypeMaxBoundingRectsMap(Rect[][] rectArr) {
        }
    }

    /* compiled from: WazeSource */
    public final class Side {
        public static final int BOTTOM = 8;
        public static final int LEFT = 1;
        public static final int RIGHT = 4;
        public static final int TOP = 2;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsSide {
        }

        private Side() {
        }

        public static int all() {
            return 15;
        }
    }

    /* compiled from: WazeSource */
    public final class Type {
        static final int CAPTION_BAR = 4;
        static final int DISPLAY_CUTOUT = 128;
        static final int FIRST = 1;
        static final int IME = 8;
        static final int LAST = 512;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int SIZE = 10;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int SYSTEM_OVERLAYS = 512;
        static final int TAPPABLE_ELEMENT = 64;
        static final int WINDOW_DECOR = 256;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        private Type() {
        }

        static int all() {
            return -1;
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int ime() {
            return 8;
        }

        static int indexOf(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            if (i2 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int systemOverlays() {
            return 512;
        }

        public static int tappableElement() {
            return 64;
        }
    }

    /* compiled from: WazeSource */
    final class TypeImpl30 {
        private TypeImpl30() {
        }

        static int toPlatformType(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 512; i4 += i4) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    /* compiled from: WazeSource */
    final class TypeImpl34 {
        private TypeImpl34() {
        }

        static int toPlatformType(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 512; i4 += i4) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i4 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            CONSUMED = Impl34.CONSUMED;
        } else if (Build.VERSION.SDK_INT >= 30) {
            CONSUMED = Impl30.CONSUMED;
        } else {
            CONSUMED = Impl.CONSUMED;
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat == null) {
            this.mImpl = new Impl(this);
            return;
        }
        Impl impl = windowInsetsCompat.mImpl;
        if (Build.VERSION.SDK_INT >= 35 && (impl instanceof Impl35)) {
            this.mImpl = new Impl35(this, (Impl35) impl);
        } else if (Build.VERSION.SDK_INT >= 34 && (impl instanceof Impl34)) {
            this.mImpl = new Impl34(this, (Impl34) impl);
        } else if (Build.VERSION.SDK_INT >= 31 && (impl instanceof Impl31)) {
            this.mImpl = new Impl31(this, (Impl31) impl);
        } else if (Build.VERSION.SDK_INT >= 30 && (impl instanceof Impl30)) {
            this.mImpl = new Impl30(this, (Impl30) impl);
        } else if (impl instanceof Impl29) {
            this.mImpl = new Impl29(this, (Impl29) impl);
        } else if (impl instanceof Impl28) {
            this.mImpl = new Impl28(this, (Impl28) impl);
        } else if (impl instanceof Impl21) {
            this.mImpl = new Impl21(this, (Impl21) impl);
        } else if (impl instanceof Impl20) {
            this.mImpl = new Impl20(this, (Impl20) impl);
        } else {
            this.mImpl = new Impl(this);
        }
        impl.copyWindowDataInto(this);
    }

    static Insets insetInsets(Insets insets, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, insets.left - i2);
        int iMax2 = Math.max(0, insets.top - i3);
        int iMax3 = Math.max(0, insets.right - i4);
        int iMax4 = Math.max(0, insets.bottom - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? insets : Insets.of(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets, View view) {
        Preconditions.checkNotNull(windowInsets);
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.setRootWindowInsets(ViewCompat.getRootWindowInsets(view));
            windowInsetsCompat.init(view.getRootView());
            windowInsetsCompat.setSystemUiVisibility(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.mImpl.consumeDisplayCutout();
    }

    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        return this.mImpl.consumeStableInsets();
    }

    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.mImpl.consumeSystemWindowInsets();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return ObjectsCompat.equals(this.mImpl, ((WindowInsetsCompat) obj).mImpl);
        }
        return false;
    }

    public List<Rect> getBoundingRects(int i2) {
        return this.mImpl.getBoundingRects(i2);
    }

    public List<Rect> getBoundingRectsIgnoringVisibility(int i2) {
        return this.mImpl.getBoundingRectsIgnoringVisibility(i2);
    }

    public DisplayCutoutCompat getDisplayCutout() {
        return this.mImpl.getDisplayCutout();
    }

    public DisplayShapeCompat getDisplayShape() {
        return this.mImpl.getDisplayShape();
    }

    public Insets getInsets(int i2) {
        return this.mImpl.getInsets(i2);
    }

    public Insets getInsetsIgnoringVisibility(int i2) {
        return this.mImpl.getInsetsIgnoringVisibility(i2);
    }

    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        return this.mImpl.getMandatorySystemGestureInsets();
    }

    public Rect getPrivacyIndicatorBounds() {
        return this.mImpl.getPrivacyIndicatorBounds();
    }

    public RoundedCornerCompat getRoundedCorner(int i2) {
        return this.mImpl.getRoundedCorner(i2);
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.mImpl.getStableInsets().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.mImpl.getStableInsets().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.mImpl.getStableInsets().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.mImpl.getStableInsets().top;
    }

    @Deprecated
    public Insets getStableInsets() {
        return this.mImpl.getStableInsets();
    }

    @Deprecated
    public Insets getSystemGestureInsets() {
        return this.mImpl.getSystemGestureInsets();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.mImpl.getSystemWindowInsets().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.mImpl.getSystemWindowInsets().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.mImpl.getSystemWindowInsets().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.mImpl.getSystemWindowInsets().top;
    }

    @Deprecated
    public Insets getSystemWindowInsets() {
        return this.mImpl.getSystemWindowInsets();
    }

    @Deprecated
    public Insets getTappableElementInsets() {
        return this.mImpl.getTappableElementInsets();
    }

    public boolean hasInsets() {
        return (getInsets(-1).equals(Insets.NONE) && getInsetsIgnoringVisibility(-9).equals(Insets.NONE) && getDisplayCutout() == null) ? false : true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.mImpl.getStableInsets().equals(Insets.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.mImpl.getSystemWindowInsets().equals(Insets.NONE);
    }

    public int hashCode() {
        Impl impl = this.mImpl;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    void init(View view) {
        this.mImpl.copyRootViewBounds(view);
        this.mImpl.initDisplayShape(view);
        this.mImpl.initTypeBoundingRectsMaps();
    }

    public WindowInsetsCompat inset(Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean isConsumed() {
        return this.mImpl.isConsumed();
    }

    public boolean isRound() {
        return this.mImpl.isRound();
    }

    public boolean isVisible(int i2) {
        return this.mImpl.isVisible(i2);
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int i2, int i3, int i4, int i5) {
        Builder builder = new Builder(this);
        builder.setSystemWindowInsets(Insets.of(i2, i3, i4, i5));
        return builder.build();
    }

    void setDisplayShape(DisplayShapeCompat displayShapeCompat) {
        this.mImpl.setDisplayShape(displayShapeCompat);
    }

    void setOverriddenInsets(Insets[] insetsArr) {
        this.mImpl.setOverriddenInsets(insetsArr);
    }

    void setRootViewData(Insets insets) {
        this.mImpl.setRootViewData(insets);
    }

    void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        this.mImpl.setRootWindowInsets(windowInsetsCompat);
    }

    void setStableInsets(Insets insets) {
        this.mImpl.setStableInsets(insets);
    }

    void setSystemUiVisibility(int i2) {
        this.mImpl.setSystemUiVisibility(i2);
    }

    void setTypeBoundingRectsMap(Rect[][] rectArr) {
        this.mImpl.setTypeBoundingRectsMap(rectArr);
    }

    void setTypeMaxBoundingRectsMap(Rect[][] rectArr) {
        this.mImpl.setTypeMaxBoundingRectsMap(rectArr);
    }

    public WindowInsets toWindowInsets() {
        Impl impl = this.mImpl;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    /* compiled from: WazeSource */
    class BuilderImpl30 extends BuilderImpl29 {
        BuilderImpl30() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int i2, Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl30.toPlatformType(i2), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int i2, Insets insets) throws IllegalArgumentException {
            this.mPlatBuilder.setInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i2), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int i2, boolean z) {
            this.mPlatBuilder.setVisible(TypeImpl30.toPlatformType(i2), z);
        }

        BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* compiled from: WazeSource */
    class BuilderImpl31 extends BuilderImpl30 {
        BuilderImpl31() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setPrivacyIndicatorBounds(Rect rect) {
            this.mPlatBuilder.setPrivacyIndicatorBounds(rect != null ? new Rect(rect) : null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setRoundedCorner(int i2, RoundedCornerCompat roundedCornerCompat) {
            this.mPlatBuilder.setRoundedCorner(RoundedCornerCompat.toPlatformPosition(i2), RoundedCornerCompat.toPlatformRoundedCorner(roundedCornerCompat));
        }

        BuilderImpl31(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* compiled from: WazeSource */
    class BuilderImpl34 extends BuilderImpl31 {
        BuilderImpl34() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setDisplayShape(DisplayShapeCompat displayShapeCompat) {
            DisplayShape platformDisplayShape = DisplayShapeCompat.toPlatformDisplayShape(displayShapeCompat);
            if (platformDisplayShape != null) {
                this.mPlatBuilder.setDisplayShape(platformDisplayShape);
            } else {
                this.mDisplayShapeCompat = displayShapeCompat;
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int i2, Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl34.toPlatformType(i2), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int i2, Insets insets) throws IllegalArgumentException {
            this.mPlatBuilder.setInsetsIgnoringVisibility(TypeImpl34.toPlatformType(i2), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int i2, boolean z) {
            this.mPlatBuilder.setVisible(TypeImpl34.toPlatformType(i2), z);
        }

        BuilderImpl34(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* compiled from: WazeSource */
    class BuilderImpl36 extends BuilderImpl35 {
        BuilderImpl36() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl35, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setBoundingRects(int i2, List<Rect> list) {
            this.mPlatBuilder.setBoundingRects(TypeImpl34.toPlatformType(i2), list);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl35, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setBoundingRectsIgnoringVisibility(int i2, List<Rect> list) {
            this.mPlatBuilder.setBoundingRectsIgnoringVisibility(TypeImpl34.toPlatformType(i2), list);
        }

        BuilderImpl36(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* compiled from: WazeSource */
    class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeDisplayCutout() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, impl28.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        DisplayCutoutCompat getDisplayCutout() {
            return DisplayCutoutCompat.wrap(this.mPlatformInsets.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }

        Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    /* compiled from: WazeSource */
    class Impl30 extends Impl29 {
        static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);

        Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i2) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsets(TypeImpl30.toPlatformType(i2)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i2) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i2)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i2) {
            return this.mPlatformInsets.isVisible(TypeImpl30.toPlatformType(i2));
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }
    }

    /* compiled from: WazeSource */
    class Impl31 extends Impl30 {
        Impl31(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Rect getPrivacyIndicatorBounds() {
            Rect privacyIndicatorBounds = this.mPlatformInsets.getPrivacyIndicatorBounds();
            if (privacyIndicatorBounds != null) {
                return new Rect(privacyIndicatorBounds);
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        RoundedCornerCompat getRoundedCorner(int i2) {
            return RoundedCornerCompat.toRoundedCornerCompat(this.mPlatformInsets.getRoundedCorner(i2));
        }

        Impl31(WindowInsetsCompat windowInsetsCompat, Impl31 impl31) {
            super(windowInsetsCompat, impl31);
        }
    }

    /* compiled from: WazeSource */
    class Impl34 extends Impl31 {
        static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);

        Impl34(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        DisplayShapeCompat getDisplayShape() {
            DisplayShapeCompat displayShapeCompat = this.mDisplayShapeCompat;
            return displayShapeCompat != null ? displayShapeCompat : DisplayShapeCompat.toDisplayShapeCompat(this.mPlatformInsets.getDisplayShape());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i2) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsets(TypeImpl34.toPlatformType(i2)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i2) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl34.toPlatformType(i2)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        void initDisplayShape(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i2) {
            return this.mPlatformInsets.isVisible(TypeImpl34.toPlatformType(i2));
        }

        Impl34(WindowInsetsCompat windowInsetsCompat, Impl34 impl34) {
            super(windowInsetsCompat, impl34);
        }
    }

    /* compiled from: WazeSource */
    class Impl35 extends Impl34 {
        Impl35(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        List<Rect> getBoundingRects(int i2) {
            return this.mPlatformInsets.getBoundingRects(TypeImpl34.toPlatformType(i2));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        List<Rect> getBoundingRectsIgnoringVisibility(int i2) {
            return this.mPlatformInsets.getBoundingRectsIgnoringVisibility(TypeImpl34.toPlatformType(i2));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        void initTypeBoundingRectsMaps() {
        }

        Impl35(WindowInsetsCompat windowInsetsCompat, Impl35 impl35) {
            super(windowInsetsCompat, impl35);
        }
    }

    /* compiled from: WazeSource */
    class BuilderImpl20 extends BuilderImpl {
        private static Constructor<WindowInsets> sConstructor = null;
        private static boolean sConstructorFetched = false;
        private static Field sConsumedField = null;
        private static boolean sConsumedFieldFetched = false;
        private WindowInsets mPlatformInsets;
        private Insets mStableInsets;

        BuilderImpl20() {
            this.mPlatformInsets = createWindowInsetsInstance();
        }

        private static WindowInsets createWindowInsetsInstance() {
            if (!sConsumedFieldFetched) {
                try {
                    sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                sConsumedFieldFetched = true;
            }
            Field field = sConsumedField;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i(WindowInsetsCompat.TAG, "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!sConstructorFetched) {
                try {
                    sConstructor = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                sConstructorFetched = true;
            }
            Constructor<WindowInsets> constructor = sConstructor;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i(WindowInsetsCompat.TAG, "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            windowInsetsCompat.setStableInsets(this.mStableInsets);
            windowInsetsCompat.setDisplayShape(this.mDisplayShapeCompat);
            windowInsetsCompat.setTypeBoundingRectsMap(this.mTypeBoundingRectsMap);
            windowInsetsCompat.setTypeMaxBoundingRectsMap(this.mTypeMaxBoundingRectsMap);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(Insets insets) {
            this.mStableInsets = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(Insets insets) {
            WindowInsets windowInsets = this.mPlatformInsets;
            if (windowInsets != null) {
                this.mPlatformInsets = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        BuilderImpl20(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.mPlatformInsets = windowInsetsCompat.toWindowInsets();
        }
    }

    /* compiled from: WazeSource */
    class Impl21 extends Impl20 {
        private Insets mStableInsets;

        Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final Insets getStableInsets() {
            Insets insets = this.mStableInsets;
            if (insets != null) {
                return insets;
            }
            WindowInsets windowInsets = this.mPlatformInsets;
            Insets insetsOf = Insets.of(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.mStableInsets = insetsOf;
            return insetsOf;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(Insets insets) {
            this.mStableInsets = insets;
        }

        Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }
    }

    /* compiled from: WazeSource */
    class Impl29 extends Impl28 {
        private Insets mMandatorySystemGestureInsets;
        private Insets mSystemGestureInsets;
        private Insets mTappableElementInsets;

        Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets getMandatorySystemGestureInsets() {
            Insets insets = this.mMandatorySystemGestureInsets;
            if (insets != null) {
                return insets;
            }
            Insets compatInsets = Insets.toCompatInsets(this.mPlatformInsets.getMandatorySystemGestureInsets());
            this.mMandatorySystemGestureInsets = compatInsets;
            return compatInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets getSystemGestureInsets() {
            Insets insets = this.mSystemGestureInsets;
            if (insets != null) {
                return insets;
            }
            Insets compatInsets = Insets.toCompatInsets(this.mPlatformInsets.getSystemGestureInsets());
            this.mSystemGestureInsets = compatInsets;
            return compatInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets getTappableElementInsets() {
            Insets insets = this.mTappableElementInsets;
            if (insets != null) {
                return insets;
            }
            Insets compatInsets = Insets.toCompatInsets(this.mPlatformInsets.getTappableElementInsets());
            this.mTappableElementInsets = compatInsets;
            return compatInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i2, int i3, int i4, int i5) {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.inset(i2, i3, i4, i5));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(Insets insets) {
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }
    }

    public WindowInsetsCompat inset(int i2, int i3, int i4, int i5) {
        return this.mImpl.inset(i2, i3, i4, i5);
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(Rect rect) {
        Builder builder = new Builder(this);
        builder.setSystemWindowInsets(Insets.of(rect));
        return builder.build();
    }

    /* compiled from: WazeSource */
    class BuilderImpl {
        DisplayShapeCompat mDisplayShapeCompat;
        private final WindowInsetsCompat mInsets;
        Insets[] mInsetsTypeMask;
        Rect[][] mTypeBoundingRectsMap;
        Rect[][] mTypeMaxBoundingRectsMap;

        BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.mTypeBoundingRectsMap = new Rect[10][];
            this.mTypeMaxBoundingRectsMap = new Rect[10][];
            this.mInsets = windowInsetsCompat;
            initTypeBoundingRects(windowInsetsCompat);
        }

        protected final void applyInsetTypes() {
            Insets[] insetsArr = this.mInsetsTypeMask;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.indexOf(1)];
                Insets insets2 = this.mInsetsTypeMask[Type.indexOf(2)];
                if (insets2 == null) {
                    insets2 = this.mInsets.getInsets(2);
                }
                if (insets == null) {
                    insets = this.mInsets.getInsets(1);
                }
                setSystemWindowInsets(Insets.max(insets, insets2));
                Insets insets3 = this.mInsetsTypeMask[Type.indexOf(16)];
                if (insets3 != null) {
                    setSystemGestureInsets(insets3);
                }
                Insets insets4 = this.mInsetsTypeMask[Type.indexOf(32)];
                if (insets4 != null) {
                    setMandatorySystemGestureInsets(insets4);
                }
                Insets insets5 = this.mInsetsTypeMask[Type.indexOf(64)];
                if (insets5 != null) {
                    setTappableElementInsets(insets5);
                }
            }
        }

        WindowInsetsCompat build() {
            applyInsetTypes();
            return this.mInsets;
        }

        void initTypeBoundingRects(WindowInsetsCompat windowInsetsCompat) {
            for (int i2 = 1; i2 <= 512; i2 += i2) {
                List<Rect> boundingRects = windowInsetsCompat.getBoundingRects(i2);
                int iIndexOf = Type.indexOf(i2);
                this.mTypeBoundingRectsMap[iIndexOf] = (Rect[]) boundingRects.toArray(new Rect[boundingRects.size()]);
                if (i2 != 8) {
                    List<Rect> boundingRectsIgnoringVisibility = windowInsetsCompat.getBoundingRectsIgnoringVisibility(i2);
                    this.mTypeMaxBoundingRectsMap[iIndexOf] = (Rect[]) boundingRectsIgnoringVisibility.toArray(new Rect[boundingRectsIgnoringVisibility.size()]);
                }
            }
        }

        void setBoundingRects(int i2, List<Rect> list) {
            for (int i3 = 1; i3 <= 512; i3 += i3) {
                if ((i2 & i3) != 0) {
                    this.mTypeBoundingRectsMap[Type.indexOf(i3)] = (Rect[]) list.toArray(new Rect[list.size()]);
                }
            }
        }

        void setBoundingRectsIgnoringVisibility(int i2, List<Rect> list) {
            if ((i2 & 8) != 0) {
                throw new IllegalArgumentException("Maximum bounding rects not available for IME");
            }
            for (int i3 = 1; i3 <= 512; i3 += i3) {
                if ((i2 & i3) != 0) {
                    this.mTypeMaxBoundingRectsMap[Type.indexOf(i3)] = (Rect[]) list.toArray(new Rect[list.size()]);
                }
            }
        }

        void setDisplayCutout(DisplayCutoutCompat displayCutoutCompat) {
        }

        void setDisplayShape(DisplayShapeCompat displayShapeCompat) {
            this.mDisplayShapeCompat = displayShapeCompat;
        }

        void setInsets(int i2, Insets insets) {
            if (this.mInsetsTypeMask == null) {
                this.mInsetsTypeMask = new Insets[10];
            }
            for (int i3 = 1; i3 <= 512; i3 += i3) {
                if ((i2 & i3) != 0) {
                    this.mInsetsTypeMask[Type.indexOf(i3)] = insets;
                }
            }
        }

        void setInsetsIgnoringVisibility(int i2, Insets insets) {
            if (i2 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void setMandatorySystemGestureInsets(Insets insets) {
        }

        void setPrivacyIndicatorBounds(Rect rect) {
        }

        void setRoundedCorner(int i2, RoundedCornerCompat roundedCornerCompat) {
        }

        void setStableInsets(Insets insets) {
        }

        void setSystemGestureInsets(Insets insets) {
        }

        void setSystemWindowInsets(Insets insets) {
        }

        void setTappableElementInsets(Insets insets) {
        }

        void setVisible(int i2, boolean z) {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }
    }

    /* compiled from: WazeSource */
    class Impl20 extends Impl {
        private static final int SYSTEM_BAR_VISIBILITY_MASK = 6;
        private static Class<?> sAttachInfoClass = null;
        private static Field sAttachInfoField = null;
        private static Method sGetViewRootImplMethod = null;
        private static Field sVisibleInsetsField = null;
        private static boolean sVisibleRectReflectionFetched = false;
        DisplayShapeCompat mDisplayShapeCompat;
        private Insets[] mOverriddenInsets;
        final WindowInsets mPlatformInsets;
        int mRootViewHeight;
        Insets mRootViewVisibleInsets;
        int mRootViewWidth;
        private WindowInsetsCompat mRootWindowInsets;
        int mSystemUiVisibility;
        private Insets mSystemWindowInsets;
        private Rect[][] mTypeBoundingRectsMap;
        private Rect[][] mTypeMaxBoundingRectsMap;

        Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mTypeBoundingRectsMap = new Rect[10][];
            this.mTypeMaxBoundingRectsMap = new Rect[10][];
            this.mPlatformInsets = windowInsets;
        }

        private DisplayShapeCompat createDisplayShape(View view) {
            Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.mHost.isRound()) {
                return DisplayShapeCompat.create(point.x, point.y, true, 0, 0, 0, 0);
            }
            RoundedCornerCompat roundedCorner = DisplayCompat.getRoundedCorner(display, 0);
            RoundedCornerCompat roundedCorner2 = DisplayCompat.getRoundedCorner(display, 1);
            RoundedCornerCompat roundedCorner3 = DisplayCompat.getRoundedCorner(display, 2);
            RoundedCornerCompat roundedCorner4 = DisplayCompat.getRoundedCorner(display, 3);
            return DisplayShapeCompat.create(point.x, point.y, false, roundedCorner != null ? roundedCorner.getRadius() : 0, roundedCorner2 != null ? roundedCorner2.getRadius() : 0, roundedCorner3 != null ? roundedCorner3.getRadius() : 0, roundedCorner4 != null ? roundedCorner4.getRadius() : 0);
        }

        private static List<Rect> getBoundingRects(Rect[][] rectArr, int i2) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i3 = 1; i3 <= 512; i3 += i3) {
                if ((i2 & i3) != 0 && (rectArr2 = rectArr[Type.indexOf(i3)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        int length = rectArr3.length;
                        int length2 = rectArr2.length;
                        Rect[] rectArr4 = new Rect[length + length2];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, length);
                        System.arraycopy(rectArr2, 0, rectArr4, length, length2);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] getBoundingRectsFromInsets(Insets insets) {
            ArrayList arrayList = new ArrayList();
            int i2 = insets.left;
            if (i2 != 0) {
                arrayList.add(new Rect(0, 0, i2, this.mRootViewHeight));
            }
            int i3 = insets.top;
            if (i3 != 0) {
                arrayList.add(new Rect(0, 0, this.mRootViewWidth, i3));
            }
            int i4 = insets.right;
            if (i4 != 0) {
                int i5 = this.mRootViewWidth;
                arrayList.add(new Rect(i5 - i4, 0, i5, this.mRootViewHeight));
            }
            int i6 = insets.bottom;
            if (i6 != 0) {
                int i7 = this.mRootViewHeight;
                arrayList.add(new Rect(0, i7 - i6, this.mRootViewWidth, i7));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        private Insets getInsets(int i2, boolean z) {
            Insets insetsMax = Insets.NONE;
            for (int i3 = 1; i3 <= 512; i3 += i3) {
                if ((i2 & i3) != 0) {
                    insetsMax = Insets.max(insetsMax, getInsetsForType(i3, z));
                }
            }
            return insetsMax;
        }

        private Insets getRootStableInsets() {
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            return windowInsetsCompat != null ? windowInsetsCompat.getStableInsets() : Insets.NONE;
        }

        private Insets getVisibleInsets(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!sVisibleRectReflectionFetched) {
                loadReflectionField();
            }
            Method method = sGetViewRootImplMethod;
            if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w(WindowInsetsCompat.TAG, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(objInvoke));
                    if (rect != null) {
                        return Insets.of(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
                }
            }
            return null;
        }

        private static void loadReflectionField() throws ClassNotFoundException {
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
            }
            sVisibleRectReflectionFetched = true;
        }

        static boolean systemBarVisibilityEquals(int i2, int i3) {
            return (i2 & 6) == (i3 & 6);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            this.mRootViewWidth = view.getWidth();
            this.mRootViewHeight = view.getHeight();
            Insets visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = Insets.NONE;
            }
            setRootViewData(visibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.setRootWindowInsets(this.mRootWindowInsets);
            windowInsetsCompat.setRootViewData(this.mRootViewVisibleInsets);
            windowInsetsCompat.setSystemUiVisibility(this.mSystemUiVisibility);
            windowInsetsCompat.setDisplayShape(this.mDisplayShapeCompat);
            windowInsetsCompat.setTypeBoundingRectsMap(this.mTypeBoundingRectsMap);
            windowInsetsCompat.setTypeMaxBoundingRectsMap(this.mTypeMaxBoundingRectsMap);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            Impl20 impl20 = (Impl20) obj;
            return Objects.equals(this.mRootViewVisibleInsets, impl20.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, impl20.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        List<Rect> getBoundingRectsIgnoringVisibility(int i2) {
            return getBoundingRects(this.mTypeMaxBoundingRectsMap, i2);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        DisplayShapeCompat getDisplayShape() {
            DisplayShapeCompat displayShapeCompat = this.mDisplayShapeCompat;
            return displayShapeCompat != null ? displayShapeCompat : DisplayShapeCompat.EMPTY;
        }

        protected Insets getInsetsForType(int i2, boolean z) {
            Insets stableInsets;
            Insets insets;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 8) {
                        Insets[] insetsArr = this.mOverriddenInsets;
                        stableInsets = insetsArr != null ? insetsArr[Type.indexOf(8)] : null;
                        if (stableInsets != null) {
                            return stableInsets;
                        }
                        Insets systemWindowInsets = getSystemWindowInsets();
                        Insets rootStableInsets = getRootStableInsets();
                        int i3 = systemWindowInsets.bottom;
                        if (i3 > rootStableInsets.bottom || ((insets = this.mRootViewVisibleInsets) != null && !insets.equals(Insets.NONE) && (i3 = this.mRootViewVisibleInsets.bottom) > rootStableInsets.bottom)) {
                            return Insets.of(0, 0, 0, i3);
                        }
                    } else {
                        if (i2 == 16) {
                            return getSystemGestureInsets();
                        }
                        if (i2 == 32) {
                            return getMandatorySystemGestureInsets();
                        }
                        if (i2 == 64) {
                            return getTappableElementInsets();
                        }
                        if (i2 == 128) {
                            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                            DisplayCutoutCompat displayCutout = windowInsetsCompat != null ? windowInsetsCompat.getDisplayCutout() : getDisplayCutout();
                            if (displayCutout != null) {
                                return Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                            }
                        }
                    }
                } else {
                    if (z) {
                        Insets rootStableInsets2 = getRootStableInsets();
                        Insets stableInsets2 = getStableInsets();
                        return Insets.of(Math.max(rootStableInsets2.left, stableInsets2.left), 0, Math.max(rootStableInsets2.right, stableInsets2.right), Math.max(rootStableInsets2.bottom, stableInsets2.bottom));
                    }
                    if ((this.mSystemUiVisibility & 2) == 0) {
                        Insets systemWindowInsets2 = getSystemWindowInsets();
                        WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                        stableInsets = windowInsetsCompat2 != null ? windowInsetsCompat2.getStableInsets() : null;
                        int iMin = systemWindowInsets2.bottom;
                        if (stableInsets != null) {
                            iMin = Math.min(iMin, stableInsets.bottom);
                        }
                        return Insets.of(systemWindowInsets2.left, 0, systemWindowInsets2.right, iMin);
                    }
                }
            } else {
                if (z) {
                    return Insets.of(0, Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
                }
                if ((this.mSystemUiVisibility & 4) == 0) {
                    return Insets.of(0, getSystemWindowInsets().top, 0, 0);
                }
            }
            return Insets.NONE;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i2) {
            return getInsets(i2, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final Insets getSystemWindowInsets() {
            Insets insets = this.mSystemWindowInsets;
            if (insets != null) {
                return insets;
            }
            WindowInsets windowInsets = this.mPlatformInsets;
            Insets insetsOf = Insets.of(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.mSystemWindowInsets = insetsOf;
            return insetsOf;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void initDisplayShape(View view) {
            this.mDisplayShapeCompat = createDisplayShape(view);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void initTypeBoundingRectsMaps() {
            for (int i2 = 1; i2 <= 512; i2 += i2) {
                int iIndexOf = Type.indexOf(i2);
                this.mTypeBoundingRectsMap[iIndexOf] = getBoundingRectsFromInsets(getInsets(i2));
                if (i2 != 8) {
                    this.mTypeMaxBoundingRectsMap[iIndexOf] = getBoundingRectsFromInsets(getInsetsIgnoringVisibility(i2));
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i2, int i3, int i4, int i5) {
            Builder builder = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
            builder.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), i2, i3, i4, i5));
            builder.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), i2, i3, i4, i5));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        protected boolean isTypeVisible(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i2, false).equals(Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int i2) {
            for (int i3 = 1; i3 <= 512; i3 += i3) {
                if ((i2 & i3) != 0 && !isTypeVisible(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setDisplayShape(DisplayShapeCompat displayShapeCompat) {
            this.mDisplayShapeCompat = displayShapeCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(Insets[] insetsArr) {
            this.mOverriddenInsets = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(Insets insets) {
            this.mRootViewVisibleInsets = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setSystemUiVisibility(int i2) {
            this.mSystemUiVisibility = i2;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setTypeBoundingRectsMap(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.mTypeBoundingRectsMap = (Rect[][]) rectArr.clone();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setTypeMaxBoundingRectsMap(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.mTypeMaxBoundingRectsMap = (Rect[][]) rectArr.clone();
        }

        Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i2) {
            return getInsets(i2, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        List<Rect> getBoundingRects(int i2) {
            return getBoundingRects(this.mTypeBoundingRectsMap, i2);
        }
    }

    /* compiled from: WazeSource */
    class BuilderImpl35 extends BuilderImpl34 {
        private boolean mSetInsetsCalled;
        private boolean mSetInsetsIgnoringVisibilityCalled;

        BuilderImpl35(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.mSetInsetsCalled = false;
            this.mSetInsetsIgnoringVisibilityCalled = false;
            if (windowInsetsCompat.isConsumed()) {
                return;
            }
            this.mSetInsetsCalled = true;
            this.mSetInsetsIgnoringVisibilityCalled = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void initTypeBoundingRects(WindowInsetsCompat windowInsetsCompat) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setBoundingRects(int i2, List<Rect> list) {
            WindowInsets.Builder builder = this.mPlatBuilder;
            int platformType = TypeImpl34.toPlatformType(i2);
            builder.setBoundingRects(platformType, list);
            if (this.mSetInsetsCalled) {
                return;
            }
            this.mSetInsetsCalled = true;
            this.mPlatBuilder.setInsets(platformType, android.graphics.Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setBoundingRectsIgnoringVisibility(int i2, List<Rect> list) throws IllegalArgumentException {
            WindowInsets.Builder builder = this.mPlatBuilder;
            int platformType = TypeImpl34.toPlatformType(i2);
            builder.setBoundingRectsIgnoringVisibility(platformType, list);
            if (this.mSetInsetsIgnoringVisibilityCalled) {
                return;
            }
            this.mSetInsetsIgnoringVisibilityCalled = true;
            this.mPlatBuilder.setInsetsIgnoringVisibility(platformType, android.graphics.Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl34, androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int i2, Insets insets) {
            super.setInsets(i2, insets);
            this.mSetInsetsCalled = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl34, androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int i2, Insets insets) throws IllegalArgumentException {
            super.setInsetsIgnoringVisibility(i2, insets);
            this.mSetInsetsIgnoringVisibilityCalled = true;
        }

        BuilderImpl35() {
            this.mSetInsetsCalled = false;
            this.mSetInsetsIgnoringVisibilityCalled = false;
        }
    }

    /* compiled from: WazeSource */
    class BuilderImpl29 extends BuilderImpl {
        final WindowInsets.Builder mPlatBuilder;

        BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            this.mPlatBuilder = windowInsets != null ? new WindowInsets.Builder(windowInsets) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatBuilder.build());
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            windowInsetsCompat.setDisplayShape(this.mDisplayShapeCompat);
            windowInsetsCompat.setTypeBoundingRectsMap(this.mTypeBoundingRectsMap);
            windowInsetsCompat.setTypeMaxBoundingRectsMap(this.mTypeMaxBoundingRectsMap);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setDisplayCutout(DisplayCutoutCompat displayCutoutCompat) {
            this.mPlatBuilder.setDisplayCutout(displayCutoutCompat != null ? displayCutoutCompat.unwrap() : null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setMandatorySystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(Insets insets) {
            this.mPlatBuilder.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(Insets insets) {
            this.mPlatBuilder.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setTappableElementInsets(Insets insets) {
            this.mPlatBuilder.setTappableElementInsets(insets.toPlatformInsets());
        }

        BuilderImpl29() {
            this.mPlatBuilder = new WindowInsets.Builder();
        }
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final BuilderImpl mImpl;

        public Builder() {
            if (Build.VERSION.SDK_INT >= 36) {
                this.mImpl = new BuilderImpl36();
                return;
            }
            if (Build.VERSION.SDK_INT >= 35) {
                this.mImpl = new BuilderImpl35();
                return;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                this.mImpl = new BuilderImpl34();
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                this.mImpl = new BuilderImpl31();
            } else if (Build.VERSION.SDK_INT >= 30) {
                this.mImpl = new BuilderImpl30();
            } else {
                this.mImpl = new BuilderImpl29();
            }
        }

        public WindowInsetsCompat build() {
            return this.mImpl.build();
        }

        public Builder setBoundingRects(int i2, List<Rect> list) {
            this.mImpl.setBoundingRects(i2, list);
            return this;
        }

        public Builder setBoundingRectsIgnoringVisibility(int i2, List<Rect> list) {
            this.mImpl.setBoundingRectsIgnoringVisibility(i2, list);
            return this;
        }

        public Builder setDisplayCutout(DisplayCutoutCompat displayCutoutCompat) {
            this.mImpl.setDisplayCutout(displayCutoutCompat);
            return this;
        }

        public Builder setDisplayShape(DisplayShapeCompat displayShapeCompat) {
            this.mImpl.setDisplayShape(displayShapeCompat);
            return this;
        }

        public Builder setInsets(int i2, Insets insets) {
            this.mImpl.setInsets(i2, insets);
            return this;
        }

        public Builder setInsetsIgnoringVisibility(int i2, Insets insets) {
            this.mImpl.setInsetsIgnoringVisibility(i2, insets);
            return this;
        }

        @Deprecated
        public Builder setMandatorySystemGestureInsets(Insets insets) {
            this.mImpl.setMandatorySystemGestureInsets(insets);
            return this;
        }

        public Builder setPrivacyIndicatorBounds(Rect rect) {
            this.mImpl.setPrivacyIndicatorBounds(rect);
            return this;
        }

        public Builder setRoundedCorner(int i2, RoundedCornerCompat roundedCornerCompat) {
            this.mImpl.setRoundedCorner(i2, roundedCornerCompat);
            return this;
        }

        @Deprecated
        public Builder setStableInsets(Insets insets) {
            this.mImpl.setStableInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setSystemGestureInsets(Insets insets) {
            this.mImpl.setSystemGestureInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setSystemWindowInsets(Insets insets) {
            this.mImpl.setSystemWindowInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setTappableElementInsets(Insets insets) {
            this.mImpl.setTappableElementInsets(insets);
            return this;
        }

        public Builder setVisible(int i2, boolean z) {
            this.mImpl.setVisible(i2, z);
            return this;
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            if (Build.VERSION.SDK_INT >= 36) {
                this.mImpl = new BuilderImpl36(windowInsetsCompat);
                return;
            }
            if (Build.VERSION.SDK_INT >= 35) {
                this.mImpl = new BuilderImpl35(windowInsetsCompat);
                return;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                this.mImpl = new BuilderImpl34(windowInsetsCompat);
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                this.mImpl = new BuilderImpl31(windowInsetsCompat);
            } else if (Build.VERSION.SDK_INT >= 30) {
                this.mImpl = new BuilderImpl30(windowInsetsCompat);
            } else {
                this.mImpl = new BuilderImpl29(windowInsetsCompat);
            }
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.mImpl = new Impl35(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            this.mImpl = new Impl34(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.mImpl = new Impl31(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(this, windowInsets);
        } else {
            this.mImpl = new Impl29(this, windowInsets);
        }
    }
}
