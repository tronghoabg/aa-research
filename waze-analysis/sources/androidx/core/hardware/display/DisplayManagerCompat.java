package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DisplayManagerCompat {
    static final String DISPLAY_CATEGORY_ALL = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    public static final String DISPLAY_CATEGORY_BUILT_IN_DISPLAYS = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    static final int DISPLAY_TYPE_INTERNAL = 1;
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    private static Display[] computeBuiltInDisplays(DisplayManager displayManager) {
        Display[] displays = Build.VERSION.SDK_INT >= 33 ? displayManager.getDisplays(DISPLAY_CATEGORY_ALL) : displayManager.getDisplays();
        Display[] displayArr = new Display[numberOfDisplaysByType(1, displays)];
        int i2 = 0;
        for (Display display : displays) {
            if (getTypeCompat(display) == 1) {
                displayArr[i2] = display;
                i2++;
            }
        }
        return displayArr;
    }

    public static DisplayManagerCompat getInstance(Context context) {
        return new DisplayManagerCompat(context);
    }

    static int getTypeCompat(Display display) {
        try {
            return ((Integer) Objects.requireNonNull(Display.class.getMethod("getType", null).invoke(display, null))).intValue();
        } catch (NoSuchMethodException unused) {
            return 0;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static int numberOfDisplaysByType(int i2, Display[] displayArr) {
        int i3 = 0;
        for (Display display : displayArr) {
            if (i2 == getTypeCompat(display)) {
                i3++;
            }
        }
        return i3;
    }

    public Display getDisplay(int i2) {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplay(i2);
    }

    public Display[] getDisplays(String str) {
        return DISPLAY_CATEGORY_BUILT_IN_DISPLAYS.equals(str) ? computeBuiltInDisplays((DisplayManager) this.mContext.getSystemService("display")) : ((DisplayManager) this.mContext.getSystemService("display")).getDisplays(str);
    }

    public Display[] getDisplays() {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }
}
