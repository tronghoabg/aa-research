package com.waze.settings.i.a;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements ActivityResultCallback {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f37408a;

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        if (this.f37408a != 0) {
            x.f((ActivityResult) obj, "it");
        } else {
            x.f((Boolean) obj, "it");
        }
    }
}
