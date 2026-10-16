package com.google.d.f.b.a;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class a extends com.google.d.f.b.g {

    /* renamed from: a, reason: collision with root package name */
    private final String f7696a;

    protected a(String str) {
        this.f7696a = str;
    }

    @Override // com.google.d.f.b.g
    public String a() {
        return this.f7696a;
    }

    @Override // com.google.d.f.b.g
    public void b(RuntimeException runtimeException, com.google.d.f.b.f fVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
