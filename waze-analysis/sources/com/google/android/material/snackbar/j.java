package com.google.android.material.snackbar;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements com.google.android.material.behavior.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f6755a;

    j(o oVar) {
        Objects.requireNonNull(oVar);
        this.f6755a = oVar;
    }

    @Override // com.google.android.material.behavior.m
    public final void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f6755a.o(0);
    }

    @Override // com.google.android.material.behavior.m
    public final void b(int i2) {
        if (i2 == 0) {
            u.a().g(this.f6755a.f6778c);
        } else if (i2 == 1 || i2 == 2) {
            u.a().f(this.f6755a.f6778c);
        }
    }
}
