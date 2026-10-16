package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.MotionDurationScale;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DisableAnimationMotionDurationScale implements MotionDurationScale {
    public static final DisableAnimationMotionDurationScale INSTANCE = new DisableAnimationMotionDurationScale();

    private DisableAnimationMotionDurationScale() {
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, iVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, h.c.h
    public /* synthetic */ i getKey() {
        return MotionDurationScale.Key;
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 0.0f;
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return MotionDurationScale.DefaultImpls.plus(this, jVar);
    }
}
