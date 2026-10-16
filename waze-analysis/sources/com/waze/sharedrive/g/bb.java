package com.waze.sharedrive.g;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f38689a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConstraintSetForInlineDsl f38690b;

    public bb(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        this.f38689a = mutableState;
        this.f38690b = constraintSetForInlineDsl;
    }

    @Override // h.g.a.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.f38689a.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        this.f38690b.setKnownDirty(true);
        return h.ab.f48028a;
    }
}
