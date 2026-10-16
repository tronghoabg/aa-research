package androidx.compose.animation;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1 extends y implements l<ab, Boolean> {
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1(boolean z) {
        super(1);
        this.$visible = z;
    }

    @Override // h.g.a.l
    public final Boolean invoke(ab abVar) {
        return Boolean.valueOf(this.$visible);
    }
}
