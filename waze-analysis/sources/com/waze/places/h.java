package com.waze.places;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements EventRemovedCompletion {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f33116a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33117b;

    public /* synthetic */ h(CompletableDeferred completableDeferred, int i2) {
        this.f33117b = i2;
        this.f33116a = completableDeferred;
    }

    @Override // com.waze.places.EventRemovedCompletion
    public final void complete(boolean z) {
        if (this.f33117b != 0) {
            this.f33116a.a(Boolean.valueOf(z));
        } else {
            this.f33116a.a(Boolean.valueOf(z));
        }
    }
}
