package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface FlexBoxScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.FlexBoxScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Modifier $default$flex(FlexBoxScope flexBoxScope, Modifier modifier, l lVar) {
            return flexBoxScope.flex(modifier, new FlexBoxKt$sam$androidx_compose_foundation_layout_FlexConfig$0(lVar));
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Modifier flex(FlexBoxScope flexBoxScope, Modifier modifier, l<? super FlexConfigScope, ab> lVar) {
            return CC.$default$flex(flexBoxScope, modifier, lVar);
        }
    }

    Modifier flex(Modifier modifier, FlexConfig flexConfig);

    Modifier flex(Modifier modifier, l<? super FlexConfigScope, ab> lVar);
}
