package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class WrappedOverscrollEffect implements OverscrollEffect {
    private final boolean attachNode;
    private final boolean eventHandlingEnabled;
    private final OverscrollEffect innerOverscrollEffect;
    private final DelegatableNode node;

    public WrappedOverscrollEffect(boolean z, boolean z2, OverscrollEffect overscrollEffect) {
        this.attachNode = z;
        this.eventHandlingEnabled = z2;
        this.innerOverscrollEffect = overscrollEffect;
        this.node = z ? overscrollEffect.getNode() : new Modifier.Node() { // from class: androidx.compose.foundation.WrappedOverscrollEffect$node$1
        };
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo1949applyToFlingBMRW4eQ(long j2, p<? super Velocity, ? super e<? super Velocity>, ? extends Object> pVar, e<? super ab> eVar) {
        if (this.eventHandlingEnabled) {
            Object objMo1949applyToFlingBMRW4eQ = this.innerOverscrollEffect.mo1949applyToFlingBMRW4eQ(j2, pVar, eVar);
            if (objMo1949applyToFlingBMRW4eQ == a.f48038a) {
                return objMo1949applyToFlingBMRW4eQ;
            }
        } else {
            Object objInvoke = pVar.invoke(Velocity.m11397boximpl(j2), eVar);
            if (objInvoke == a.f48038a) {
                return objInvoke;
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo1950applyToScrollRhakbz0(long j2, int i2, l<? super Offset, Offset> lVar) {
        return this.eventHandlingEnabled ? this.innerOverscrollEffect.mo1950applyToScrollRhakbz0(j2, i2, lVar) : lVar.invoke(Offset.m7969boximpl(j2)).m7990unboximpl();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) obj;
        return this.attachNode == wrappedOverscrollEffect.attachNode && this.eventHandlingEnabled == wrappedOverscrollEffect.eventHandlingEnabled && x.n(this.innerOverscrollEffect, wrappedOverscrollEffect.innerOverscrollEffect);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public /* synthetic */ Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public int hashCode() {
        return (((WrappedOverscrollEffect$$ExternalSyntheticBackport0.m(this.attachNode) * 31) + WrappedOverscrollEffect$$ExternalSyntheticBackport0.m(this.eventHandlingEnabled)) * 31) + this.innerOverscrollEffect.hashCode();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return this.innerOverscrollEffect.isInProgress();
    }
}
