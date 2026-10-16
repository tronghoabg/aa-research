package com.waze.ifs.ui;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f24561a;

    i(w wVar) {
        Objects.requireNonNull(wVar);
        this.f24561a = wVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            w wVar = this.f24561a;
            wVar.u++;
            ((s) wVar.getActivity()).m();
        }
    }
}
