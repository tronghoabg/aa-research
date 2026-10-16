package com.waze.view.a;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f44942a;

    a(f fVar) {
        Objects.requireNonNull(fVar);
        this.f44942a = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.e(this.f44942a);
    }
}
