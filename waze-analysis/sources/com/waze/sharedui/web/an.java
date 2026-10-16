package com.waze.sharedui.web;

import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an implements ad {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f39324a;

    an(MutableState mutableState) {
        this.f39324a = mutableState;
    }

    @Override // com.waze.sharedui.web.ad
    public final void a() {
    }

    @Override // com.waze.sharedui.web.ad
    public final void b(boolean z) {
        this.f39324a.setValue(Boolean.valueOf(false));
    }

    @Override // com.waze.sharedui.web.ad
    public final void c() {
        this.f39324a.setValue(Boolean.valueOf(true));
    }
}
