package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlexBoxScope;
import androidx.compose.ui.Modifier;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlexBoxScopeInstance implements FlexBoxScope {
    public static final int $stable = 0;
    public static final FlexBoxScopeInstance INSTANCE = new FlexBoxScopeInstance();

    private FlexBoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.FlexBoxScope
    public Modifier flex(Modifier modifier, FlexConfig flexConfig) {
        return modifier.then(new FlexBoxChildElement(flexConfig));
    }

    @Override // androidx.compose.foundation.layout.FlexBoxScope
    public /* synthetic */ Modifier flex(Modifier modifier, l lVar) {
        return FlexBoxScope.CC.$default$flex(this, modifier, lVar);
    }
}
