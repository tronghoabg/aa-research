package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$4$1 extends y implements l {
    final /* synthetic */ Transition $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$4$1(Transition transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    @Override // h.g.a.l
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!x.n(obj, this.$this_Crossfade.getTargetState()));
    }
}
