package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableTransform {
    public static final int $stable = 8;
    private p<? super TransformScope, ? super IntSize, ab> block;
    private boolean veilMatchParentSize;

    public /* synthetic */ MutableTransform(boolean z, p pVar, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), (i2 & 2) != 0 ? null : pVar);
    }

    public final void clear$animation() {
        this.block = null;
        this.veilMatchParentSize = false;
    }

    public final p<TransformScope, IntSize, ab> getBlock$animation() {
        return this.block;
    }

    public final boolean getVeilMatchParentSize$animation() {
        return this.veilMatchParentSize;
    }

    public final void invoke(p<? super TransformScope, ? super IntSize, ab> pVar) {
        this.block = pVar;
    }

    public final void setBlock$animation(p<? super TransformScope, ? super IntSize, ab> pVar) {
        this.block = pVar;
    }

    public final void setVeilMatchParentSize$animation(boolean z) {
        this.veilMatchParentSize = z;
    }

    public MutableTransform(boolean z, p<? super TransformScope, ? super IntSize, ab> pVar) {
        this.veilMatchParentSize = z;
        this.block = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableTransform() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
