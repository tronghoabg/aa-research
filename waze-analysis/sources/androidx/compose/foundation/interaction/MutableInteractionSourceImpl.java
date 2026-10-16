package androidx.compose.foundation.interaction;

import h.ab;
import h.c.e;
import kotlinx.coroutines.a.a;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final bm<Interaction> interactions = bu.e(0, 16, a.f51272b, 1);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, e<? super ab> eVar) {
        Object objEmit = getInteractions().emit(interaction, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : ab.f48028a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        return getInteractions().c(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public bm<Interaction> getInteractions() {
        return this.interactions;
    }
}
