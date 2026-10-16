package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private final AndroidComposeView composeView;
    private final SnapshotStateList<RectRulers> displayCutoutRulers;
    private final MutableObjectList<MutableState<Rect>> displayCutouts;
    private final MutableIntState generation;
    private final ScatterMap<Object, WindowWindowInsetsAnimationValues> insetsValues;
    private boolean prepared;
    private int runningAnimationMask;
    private WindowInsetsCompat savedInsets;

    public InsetsListener(AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        MutableScatterMap mutableScatterMap = new MutableScatterMap(9);
        mutableScatterMap.set(WindowInsetsRulers.Companion.getCaptionBar(), new WindowWindowInsetsAnimationValues("caption bar"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getDisplayCutout(), new WindowWindowInsetsAnimationValues("display cutout"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getIme(), new WindowWindowInsetsAnimationValues("ime"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getMandatorySystemGestures(), new WindowWindowInsetsAnimationValues("mandatory system gestures"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getNavigationBars(), new WindowWindowInsetsAnimationValues("navigation bars"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getStatusBars(), new WindowWindowInsetsAnimationValues("status bars"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getSystemGestures(), new WindowWindowInsetsAnimationValues("system gestures"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getTappableElement(), new WindowWindowInsetsAnimationValues("tappable element"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.getWaterfall(), new WindowWindowInsetsAnimationValues("waterfall"));
        this.insetsValues = mutableScatterMap;
        this.generation = SnapshotIntStateKt.mutableIntStateOf(0);
        this.displayCutouts = new MutableObjectList<>(4);
        this.displayCutoutRulers = SnapshotStateKt.mutableStateListOf();
    }

    private final void stopAnimationForRuler(WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues) {
        windowWindowInsetsAnimationValues.setAnimating(false);
        windowWindowInsetsAnimationValues.m9900setSourceValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
        windowWindowInsetsAnimationValues.m9901setTargetValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
    }

    private final void updateInsetAnimationInfo(WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        windowWindowInsetsAnimationValues.setFraction(windowInsetsAnimationCompat.getInterpolatedFraction());
        windowWindowInsetsAnimationValues.setAlpha(windowInsetsAnimationCompat.getAlpha());
        windowWindowInsetsAnimationValues.setDurationMillis(windowInsetsAnimationCompat.getDurationMillis());
    }

    private final void updateInsets(WindowInsetsCompat windowInsetsCompat) {
        char c2;
        char c3;
        char c4;
        boolean z;
        boolean z2;
        boolean z3;
        long zeroValueInsets;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i2;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        int i3;
        int i4;
        IntObjectMap intObjectMap = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
        int[] iArr3 = intObjectMap.keys;
        Object[] objArr3 = intObjectMap.values;
        long[] jArr3 = intObjectMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            z2 = false;
            z3 = false;
            while (true) {
                long j2 = jArr3[i5];
                c2 = 16;
                c3 = ' ';
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = i5 - length;
                    int i7 = 0;
                    c4 = '0';
                    while (true) {
                        i2 = 8 - ((~i6) >>> 31);
                        if (i7 >= i2) {
                            break;
                        }
                        if ((j2 & 255) < 128) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr3[i8];
                            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) objArr3[i8];
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j3 = r9.left << 48;
                            long j4 = r9.top << 32;
                            long j5 = r9.right << 16;
                            long j6 = windowInsetsCompat.getInsets(i9).bottom;
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                            if (windowWindowInsetsAnimationValues == null) {
                                x.g();
                            }
                            long j7 = j3 | j4 | j5 | j6;
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                            i3 = i6;
                            i4 = i7;
                            if (!ValueInsets.m9885equalsimpl0(j7, windowWindowInsetsAnimationValues2.m9894getCurrenthdzbrEE())) {
                                windowWindowInsetsAnimationValues2.m9898setCurrentYnlvx88(j7);
                                if (ValueInsets.m9885equalsimpl0(j7, ValueInsets_androidKt.getZeroValueInsets())) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                    z3 = true;
                                }
                            }
                            if (i9 != 8) {
                                Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(i9);
                                objArr2 = objArr3;
                                long j8 = insetsIgnoringVisibility.right << 16;
                                long j9 = (insetsIgnoringVisibility.left << 48) | (insetsIgnoringVisibility.top << 32) | j8 | insetsIgnoringVisibility.bottom;
                                if (!ValueInsets.m9885equalsimpl0(windowWindowInsetsAnimationValues2.m9895getMaximumhdzbrEE(), j9)) {
                                    windowWindowInsetsAnimationValues2.m9899setMaximumYnlvx88(j9);
                                    if (ValueInsets.m9885equalsimpl0(j9, ValueInsets_androidKt.getZeroValueInsets())) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            windowWindowInsetsAnimationValues2.setVisible(windowInsetsCompat.isVisible(i9));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i3 = i6;
                            i4 = i7;
                        }
                        j2 >>= 8;
                        i7 = i4 + 1;
                        i6 = i3;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    z = true;
                    if (i2 == 8) {
                        break;
                        break;
                    }
                    break;
                }
                jArr = jArr3;
                iArr = iArr3;
                objArr = objArr3;
                c4 = '0';
                z = true;
                if (i5 == length) {
                    break;
                }
                i5++;
                jArr3 = jArr;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        } else {
            c2 = 16;
            c3 = ' ';
            c4 = '0';
            z = true;
            z2 = false;
            z3 = false;
        }
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        if (displayCutout == null) {
            zeroValueInsets = ValueInsets_androidKt.getZeroValueInsets();
        } else {
            Insets waterfallInsets = displayCutout.getWaterfallInsets();
            zeroValueInsets = (waterfallInsets.left << c4) | (waterfallInsets.top << c3) | (waterfallInsets.right << c2) | waterfallInsets.bottom;
        }
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues3 = this.insetsValues.get(WindowInsetsRulers.Companion.getWaterfall());
        if (windowWindowInsetsAnimationValues3 == null) {
            x.g();
        }
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues4 = windowWindowInsetsAnimationValues3;
        windowWindowInsetsAnimationValues4.setVisible(!ValueInsets.m9885equalsimpl0(zeroValueInsets, ValueInsets_androidKt.getZeroValueInsets()));
        if (!ValueInsets.m9885equalsimpl0(windowWindowInsetsAnimationValues4.m9894getCurrenthdzbrEE(), zeroValueInsets)) {
            windowWindowInsetsAnimationValues4.m9898setCurrentYnlvx88(zeroValueInsets);
            windowWindowInsetsAnimationValues4.m9899setMaximumYnlvx88(zeroValueInsets);
            if (ValueInsets.m9885equalsimpl0(zeroValueInsets, ValueInsets_androidKt.getZeroValueInsets())) {
                z2 = z;
            } else {
                z2 = z;
                z3 = z2;
            }
        }
        if (displayCutout != null) {
            List<Rect> boundingRects = displayCutout.getBoundingRects();
            if (boundingRects.size() < this.displayCutouts.getSize()) {
                this.displayCutouts.removeRange(boundingRects.size(), this.displayCutouts.getSize());
                this.displayCutoutRulers.removeRange(boundingRects.size(), this.displayCutoutRulers.size());
                z2 = z;
            } else {
                int size = boundingRects.size() - this.displayCutouts.getSize();
                int i10 = 0;
                while (i10 < size) {
                    MutableObjectList<MutableState<Rect>> mutableObjectList = this.displayCutouts;
                    mutableObjectList.add(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundingRects.get(mutableObjectList.getSize()), null, 2, null));
                    this.displayCutoutRulers.add(RectRulersKt.RectRulers("display cutout rect " + this.displayCutouts.getSize()));
                    i10++;
                    z2 = z;
                }
            }
            List<Rect> list = boundingRects;
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Rect rect = boundingRects.get(i11);
                MutableState<Rect> mutableState = this.displayCutouts.get(i11);
                if (!x.n(mutableState.getValue(), rect)) {
                    mutableState.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        } else if (this.displayCutouts.getSize() > 0) {
            this.displayCutouts.clear();
            this.displayCutoutRulers.clear();
            z2 = z;
        }
        if ((z3 || this.generation.getIntValue() != 0) && z2) {
            MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            Snapshot.Companion.sendApplyNotifications();
        }
    }

    public final AndroidComposeView getComposeView() {
        return this.composeView;
    }

    public final SnapshotStateList<RectRulers> getDisplayCutoutRulers() {
        return this.displayCutoutRulers;
    }

    public final MutableObjectList<MutableState<Rect>> getDisplayCutouts() {
        return this.displayCutouts;
    }

    public final MutableIntState getGeneration() {
        return this.generation;
    }

    public final ScatterMap<Object, WindowWindowInsetsAnimationValues> getInsetsValues() {
        return this.insetsValues;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.prepared) {
            this.savedInsets = windowInsetsCompat;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return windowInsetsCompat;
            }
        } else if (this.runningAnimationMask == 0) {
            updateInsets(windowInsetsCompat);
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = false;
        int typeMask = windowInsetsAnimationCompat.getTypeMask();
        this.runningAnimationMask = (~typeMask) & this.runningAnimationMask;
        this.savedInsets = null;
        WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.get(typeMask);
        if (windowInsetsRulers != null) {
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
            if (windowWindowInsetsAnimationValues == null) {
                x.g();
            }
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
            windowWindowInsetsAnimationValues2.setFraction(0.0f);
            windowWindowInsetsAnimationValues2.setAlpha(1.0f);
            windowWindowInsetsAnimationValues2.setDurationMillis(0L);
            windowWindowInsetsAnimationValues2.setFraction(0.0f);
            stopAnimationForRuler(windowWindowInsetsAnimationValues2);
            MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            Snapshot.Companion.sendApplyNotifications();
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = true;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = list.get(i2);
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.get(windowInsetsAnimationCompat.getTypeMask());
            if (windowInsetsRulers != null) {
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                if (windowWindowInsetsAnimationValues == null) {
                    x.g();
                }
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                if (windowWindowInsetsAnimationValues2.isAnimating()) {
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues2, windowInsetsAnimationCompat);
                }
            }
        }
        updateInsets(windowInsetsCompat);
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        this.prepared = false;
        this.savedInsets = null;
        if (windowInsetsAnimationCompat.getDurationMillis() > 0 && windowInsetsCompat != null) {
            int typeMask = windowInsetsAnimationCompat.getTypeMask();
            this.runningAnimationMask |= typeMask;
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.get(typeMask);
            if (windowInsetsRulers != null) {
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                if (windowWindowInsetsAnimationValues == null) {
                    x.g();
                }
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                Insets insets = windowInsetsCompat.getInsets(typeMask);
                long j2 = insets.left;
                long j3 = insets.top;
                long j4 = insets.right;
                long j5 = insets.bottom;
                long jM9894getCurrenthdzbrEE = windowWindowInsetsAnimationValues2.m9894getCurrenthdzbrEE();
                long j6 = j5 | (j2 << 48) | (j3 << 32) | (j4 << 16);
                if (!ValueInsets.m9885equalsimpl0(j6, jM9894getCurrenthdzbrEE)) {
                    windowWindowInsetsAnimationValues2.m9900setSourceValueInsetsYnlvx88(jM9894getCurrenthdzbrEE);
                    windowWindowInsetsAnimationValues2.m9901setTargetValueInsetsYnlvx88(j6);
                    windowWindowInsetsAnimationValues2.setAnimating(true);
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues2, windowInsetsAnimationCompat);
                    MutableIntState mutableIntState = this.generation;
                    mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                    Snapshot.Companion.sendApplyNotifications();
                }
            }
        }
        return boundsCompat;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        ViewCompat.setOnApplyWindowInsetsListener(view, this);
        ViewCompat.setWindowInsetsAnimationCallback(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        ViewCompat.setOnApplyWindowInsetsListener(view, null);
        ViewCompat.setWindowInsetsAnimationCallback(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                updateInsets(windowInsetsCompat);
                this.savedInsets = null;
            }
        }
    }
}
