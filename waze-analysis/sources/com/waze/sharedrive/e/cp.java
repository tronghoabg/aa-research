package com.waze.sharedrive.e;

import android.view.View;
import android.view.ViewGroup;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cp implements AsyncLayoutInflater.OnInflateFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f38505a;

    cp(kotlinx.coroutines.k kVar) {
        this.f38505a = kVar;
    }

    @Override // androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener
    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
        kotlinx.coroutines.k kVar = this.f38505a;
        if (kVar.g()) {
            kVar.resumeWith(view);
        }
    }
}
