package androidx.compose.foundation.interaction;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MutableInteractionSource extends InteractionSource {
    Object emit(Interaction interaction, e<? super ab> eVar);

    boolean tryEmit(Interaction interaction);
}
