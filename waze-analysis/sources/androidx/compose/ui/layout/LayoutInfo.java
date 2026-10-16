package androidx.compose.ui.layout;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LayoutInfo {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.LayoutInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isDeactivated(LayoutInfo layoutInfo) {
            return false;
        }

        public static boolean $default$isVirtual(LayoutInfo layoutInfo) {
            return false;
        }
    }

    LayoutCoordinates getCoordinates();

    Density getDensity();

    int getHeight();

    LayoutDirection getLayoutDirection();

    List<ModifierInfo> getModifierInfo();

    LayoutInfo getParentInfo();

    int getSemanticsId();

    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean isAttached();

    boolean isDeactivated();

    boolean isPlaced();

    boolean isVirtual();
}
