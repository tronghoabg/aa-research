package com.google.android.material.snackbar;

import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f6786a;

    /* renamed from: b, reason: collision with root package name */
    int f6787b;

    /* renamed from: c, reason: collision with root package name */
    boolean f6788c;

    t(int i2, h hVar) {
        this.f6786a = new WeakReference(hVar);
        this.f6787b = i2;
    }

    final boolean a(h hVar) {
        return hVar != null && this.f6786a.get() == hVar;
    }
}
