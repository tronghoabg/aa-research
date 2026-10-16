package com.waze.z.a;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bc implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f45811a;

    bc(MutableState mutableState) {
        this.f45811a = mutableState;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Interaction interaction = (Interaction) obj;
        if (interaction instanceof FocusInteraction.Focus) {
            this.f45811a.setValue(Boolean.valueOf(true));
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.f45811a.setValue(Boolean.valueOf(false));
        }
        return h.ab.f48028a;
    }
}
