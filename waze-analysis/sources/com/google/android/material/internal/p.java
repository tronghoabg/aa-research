package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f6620a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f6621b;

    p(r rVar, s sVar) {
        this.f6620a = rVar;
        this.f6621b = sVar;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.f6620a.a(view, windowInsetsCompat, new s(this.f6621b));
        return windowInsetsCompat;
    }
}
