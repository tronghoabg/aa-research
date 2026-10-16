package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SourceContext {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.tooling.data.SourceContext$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isInline(SourceContext sourceContext) {
            return false;
        }
    }

    IntRect getBounds();

    int getDepth();

    SourceLocation getLocation();

    String getName();

    List<ParameterInformation> getParameters();

    boolean isInline();
}
