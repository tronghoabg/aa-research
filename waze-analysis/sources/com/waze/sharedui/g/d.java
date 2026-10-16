package com.waze.sharedui.g;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f38941a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f38942b;

    d(e eVar, b bVar, int i2) {
        this.f38941a = bVar;
        this.f38942b = i2;
        Objects.requireNonNull(eVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f38941a.a(this.f38942b);
    }
}
