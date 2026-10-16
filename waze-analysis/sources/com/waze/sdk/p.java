package com.waze.sdk;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f35398a;

    p(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.f35398a = aeVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ae aeVar = this.f35398a;
        aeVar.f35224j.removeOnLayoutChangeListener(this);
        aeVar.D.notifyDataSetChanged();
    }
}
