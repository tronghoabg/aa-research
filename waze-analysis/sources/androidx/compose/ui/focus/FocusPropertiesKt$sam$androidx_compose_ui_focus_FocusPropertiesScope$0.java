package androidx.compose.ui.focus;

import h.c;
import h.g.a.l;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, r {
    private final /* synthetic */ l function;

    FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(l lVar) {
        this.function = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FocusPropertiesScope) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final c<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
