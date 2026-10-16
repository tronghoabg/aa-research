package com.waze.main_screen.g;

import android.view.View;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f26424a;

    o(q qVar) {
        Objects.requireNonNull(qVar);
        this.f26424a = qVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        q qVar = this.f26424a;
        qVar.removeOnLayoutChangeListener(this);
        qVar.n = qVar.f26427b.getHeight();
        qVar.o = ((qVar.f26431f - qVar.findViewById(R.id.centerSpacing).getMeasuredHeight()) / 2) - qVar.n;
    }
}
