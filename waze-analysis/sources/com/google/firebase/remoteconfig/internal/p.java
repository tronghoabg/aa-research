package com.google.firebase.remoteconfig.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements com.google.android.gms.o.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.o.t f10718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.o.t f10719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10720c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f10721d;

    public /* synthetic */ p(Object obj, com.google.android.gms.o.t tVar, com.google.android.gms.o.t tVar2, int i2) {
        this.f10721d = i2;
        this.f10720c = obj;
        this.f10718a = tVar;
        this.f10719b = tVar2;
    }

    @Override // com.google.android.gms.o.a
    public final Object a(com.google.android.gms.o.t tVar) {
        int i2 = this.f10721d;
        com.google.android.gms.o.t tVar2 = this.f10719b;
        if (i2 != 0) {
            return com.google.firebase.remoteconfig.b.i((com.google.firebase.remoteconfig.b) this.f10720c, this.f10718a, tVar2);
        }
        return s.i((s) this.f10720c, this.f10718a, tVar2);
    }
}
