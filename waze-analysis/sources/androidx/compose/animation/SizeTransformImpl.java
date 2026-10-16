package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final p<IntSize, IntSize, FiniteAnimationSpec<IntSize>> sizeAnimationSpec;

    public /* synthetic */ SizeTransformImpl(boolean z, p pVar, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) | (i2 & 1)), pVar);
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo1843createAnimationSpecTemP2vQ(long j2, long j3) {
        return this.sizeAnimationSpec.invoke(IntSize.m11331boximpl(j2), IntSize.m11331boximpl(j3));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final p<IntSize, IntSize, FiniteAnimationSpec<IntSize>> getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SizeTransformImpl(boolean z, p<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> pVar) {
        this.clip = z;
        this.sizeAnimationSpec = pVar;
    }
}
