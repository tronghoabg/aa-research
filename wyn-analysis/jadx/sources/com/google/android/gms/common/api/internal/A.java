package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public final d7.d[] f26437a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26439c;

    public A(d7.d[] dVarArr, boolean z2, int i5) {
        this.f26437a = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z2) {
            z10 = true;
        }
        this.f26438b = z10;
        this.f26439c = i5;
    }

    public static N7.e a() {
        N7.e eVar = new N7.e(1);
        eVar.f8588b = true;
        eVar.f8589c = 0;
        return eVar;
    }

    public abstract void b(com.google.android.gms.common.api.b bVar, TaskCompletionSource taskCompletionSource);
}
