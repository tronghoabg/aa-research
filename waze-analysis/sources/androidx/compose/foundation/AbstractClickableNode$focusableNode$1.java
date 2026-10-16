package androidx.compose.foundation;

import h.ab;
import h.g.a.l;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends u implements l<Boolean, ab> {
    AbstractClickableNode$focusableNode$1(Object obj) {
        super(1, obj, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return ab.f48028a;
    }

    public final void invoke(boolean z) {
        ((AbstractClickableNode) this.receiver).onFocusChange(z);
    }
}
