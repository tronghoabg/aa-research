package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import h.g.a.r;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TabIndicatorScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.TabIndicatorScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier tabIndicatorOffset$default(TabIndicatorScope tabIndicatorScope, Modifier modifier, int i2, boolean z, int i3, Object obj) {
            if (obj == null) {
                return tabIndicatorScope.tabIndicatorOffset(modifier, i2, z & ((i3 & 2) == 0));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tabIndicatorOffset");
        }
    }

    Modifier tabIndicatorLayout(Modifier modifier, r<? super MeasureScope, ? super Measurable, ? super Constraints, ? super List<TabPosition>, ? extends MeasureResult> rVar);

    Modifier tabIndicatorOffset(Modifier modifier, int i2, boolean z);
}
