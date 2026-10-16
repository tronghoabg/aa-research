package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bm f4812a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.f[] f4813b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4814c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4815d;

    bn(bm bmVar, com.google.android.gms.common.f[] fVarArr, boolean z, int i2) {
        Objects.requireNonNull(bmVar);
        this.f4812a = bmVar;
        this.f4813b = fVarArr;
        boolean z2 = false;
        if (fVarArr != null && z) {
            z2 = true;
        }
        this.f4814c = z2;
        this.f4815d = i2;
    }

    public static bm b() {
        return new bm();
    }

    public final int a() {
        return this.f4815d;
    }

    public final boolean c() {
        return this.f4814c;
    }

    public final com.google.android.gms.common.f[] d() {
        return this.f4813b;
    }
}
