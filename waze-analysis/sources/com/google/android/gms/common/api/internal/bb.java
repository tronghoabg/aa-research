package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd f4779a;

    /* renamed from: b, reason: collision with root package name */
    private final au f4780b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.f[] f4781c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4782d;

    bb(bd bdVar, au auVar, com.google.android.gms.common.f[] fVarArr, boolean z) {
        Objects.requireNonNull(bdVar);
        this.f4779a = bdVar;
        this.f4780b = auVar;
        this.f4781c = fVarArr;
        this.f4782d = z;
    }

    public final as a() {
        return this.f4780b.a();
    }

    public final void b() {
        this.f4780b.c();
    }

    public final boolean c() {
        return this.f4782d;
    }

    public final com.google.android.gms.common.f[] d() {
        return this.f4781c;
    }

    protected final void e(com.google.android.gms.common.api.b bVar, com.google.android.gms.o.w wVar) {
        this.f4779a.f4784a.a(bVar, wVar);
    }
}
