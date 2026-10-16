package com.google.android.material.h;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends ResourcesCompat.FontCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f6546a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f6547b;

    c(d dVar, e eVar) {
        this.f6546a = eVar;
        Objects.requireNonNull(dVar);
        this.f6547b = dVar;
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrievalFailed */
    public final void m11721xb24343b7(int i2) {
        this.f6547b.f6559l = true;
        this.f6546a.b();
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrieved */
    public final void m11722x46c88379(Typeface typeface) {
        d dVar = this.f6547b;
        dVar.n = Typeface.create(typeface, dVar.f6550c);
        dVar.f6559l = true;
        this.f6546a.c(dVar.n);
    }
}
