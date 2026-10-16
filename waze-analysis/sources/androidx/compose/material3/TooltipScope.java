package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.window.PopupPositionProvider;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TooltipScope {
    /* synthetic */ Modifier drawCaret(Modifier modifier, p pVar);

    LayoutCoordinates obtainAnchorBounds(MeasureScope measureScope);

    PopupPositionProvider obtainPositionProvider();
}
