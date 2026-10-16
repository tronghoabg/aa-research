package androidx.compose.foundation.layout;

import h.c;
import h.g.a.l;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class FlexBoxKt$sam$androidx_compose_foundation_layout_FlexConfig$0 implements FlexConfig, r {
    private final /* synthetic */ l function;

    FlexBoxKt$sam$androidx_compose_foundation_layout_FlexConfig$0(l lVar) {
        this.function = lVar;
    }

    @Override // androidx.compose.foundation.layout.FlexConfig
    public final /* synthetic */ void configure(FlexConfigScope flexConfigScope) {
        this.function.invoke(flexConfigScope);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FlexConfig) && (obj instanceof r)) {
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
