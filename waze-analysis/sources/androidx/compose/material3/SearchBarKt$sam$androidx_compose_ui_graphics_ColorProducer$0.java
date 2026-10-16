package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import h.c;
import h.g.a.a;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0 implements ColorProducer, r {
    private final /* synthetic */ a function;

    SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(a aVar) {
        this.function = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ColorProducer) && (obj instanceof r)) {
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

    @Override // androidx.compose.ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU */
    public final /* synthetic */ long mo4059invoke0d7_KjU() {
        return ((Color) this.function.invoke()).m8238unboximpl();
    }
}
