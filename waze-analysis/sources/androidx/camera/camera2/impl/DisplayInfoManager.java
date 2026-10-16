package androidx.camera.camera2.impl;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.compat.workaround.MaxPreviewSize;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import com.waze.strings.DisplayStrings;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DisplayInfoManager {
    private static volatile DisplayInfoManager instance;
    private final DisplayManager.DisplayListener displayListener;
    private final DisplayManager displayManager;
    private final DisplaySizeCorrector displaySizeCorrector;
    private volatile Display[] displays;
    private final Object lock;
    private final MaxPreviewSize maxPreviewSize;
    private volatile Size previewSize;
    public static final Companion Companion = new Companion(null);
    private static final Size MAX_PREVIEW_SIZE = new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT);
    private static final Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = new Size(DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT, 240);
    private static final Size FALLBACK_DISPLAY_SIZE = new Size(640, 480);

    /* JADX WARN: Multi-variable type inference failed */
    private DisplayInfoManager(Context context) {
        this.maxPreviewSize = new MaxPreviewSize(null, 1, 0 == true ? 1 : 0);
        this.displaySizeCorrector = new DisplaySizeCorrector();
        this.lock = new Object();
        DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: androidx.camera.camera2.impl.DisplayInfoManager$displayListener$1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i2) {
                DisplayInfoManager displayInfoManager = this.this$0;
                synchronized (displayInfoManager.lock) {
                    displayInfoManager.displays = null;
                    displayInfoManager.previewSize = null;
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i2) {
                DisplayInfoManager displayInfoManager = this.this$0;
                synchronized (displayInfoManager.lock) {
                    displayInfoManager.displays = null;
                    displayInfoManager.previewSize = null;
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i2) {
                DisplayInfoManager displayInfoManager = this.this$0;
                synchronized (displayInfoManager.lock) {
                    displayInfoManager.displays = null;
                    displayInfoManager.previewSize = null;
                }
            }
        };
        this.displayListener = displayListener;
        Object systemService = context.getSystemService("display");
        x.d(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        DisplayManager displayManager = (DisplayManager) systemService;
        displayManager.registerDisplayListener(displayListener, new Handler(Looper.getMainLooper()));
        this.displayManager = displayManager;
    }

    private final Size calculatePreviewSize() {
        Size correctedDisplaySize = getCorrectedDisplaySize();
        Size size = MAX_PREVIEW_SIZE;
        if (SizeUtil.isSmallerByArea(size, correctedDisplaySize)) {
            correctedDisplaySize = size;
        }
        return this.maxPreviewSize.getMaxPreviewResolution(correctedDisplaySize);
    }

    private final Size getCorrectedDisplaySize() {
        Point point = new Point();
        getMaxSizeDisplay(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (SizeUtil.isSmallerByArea(size, ABNORMAL_DISPLAY_SIZE_THRESHOLD) && (size = this.displaySizeCorrector.getDisplaySize()) == null) {
            size = FALLBACK_DISPLAY_SIZE;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private final Display[] getDisplays() {
        synchronized (this.lock) {
            Display[] displayArr = this.displays;
            if (displayArr != null) {
                return displayArr;
            }
            Display[] displays = this.displayManager.getDisplays();
            this.displays = displays;
            x.c(displays);
            return displays;
        }
    }

    public final Display getMaxSizeDisplay(boolean z) {
        Display[] displays = getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i2 = -1;
        int i3 = -1;
        Display display2 = null;
        for (Display display3 : displays) {
            Point point = new Point();
            display3.getRealSize(point);
            if (point.x * point.y > i2) {
                i2 = point.x * point.y;
                display2 = display3;
            }
            if (display3.getState() != 1 && point.x * point.y > i3) {
                i3 = point.x * point.y;
                display = display3;
            }
        }
        if (!z || display == null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        String string = Arrays.toString(displays);
        x.e(string, "toString(...)");
        throw new IllegalStateException("No displays found from " + string + "!");
    }

    public final Size getPreviewSize() {
        synchronized (this.lock) {
            if (this.previewSize != null) {
                Size size = this.previewSize;
                x.d(size, "null cannot be cast to non-null type android.util.Size");
                return size;
            }
            this.previewSize = calculatePreviewSize();
            Size size2 = this.previewSize;
            x.c(size2);
            return size2;
        }
    }

    public final void refreshPreviewSize() {
        synchronized (this.lock) {
            this.previewSize = calculatePreviewSize();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final DisplayInfoManager getInstance(Context context) {
            DisplayInfoManager displayInfoManager;
            x.f(context, "context");
            DisplayInfoManager displayInfoManager2 = DisplayInfoManager.instance;
            if (displayInfoManager2 != null) {
                return displayInfoManager2;
            }
            synchronized (this) {
                displayInfoManager = DisplayInfoManager.instance;
                if (displayInfoManager == null) {
                    Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
                    x.e(persistentApplicationContext, "getPersistentApplicationContext(...)");
                    displayInfoManager = new DisplayInfoManager(persistentApplicationContext, null);
                    DisplayInfoManager.instance = displayInfoManager;
                }
            }
            return displayInfoManager;
        }

        public final void releaseInstance() {
            DisplayInfoManager displayInfoManager = DisplayInfoManager.instance;
            if (displayInfoManager != null) {
                synchronized (DisplayInfoManager.Companion) {
                    displayInfoManager.displayManager.unregisterDisplayListener(displayInfoManager.displayListener);
                    DisplayInfoManager.instance = null;
                }
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ DisplayInfoManager(Context context, o oVar) {
        this(context);
    }
}
