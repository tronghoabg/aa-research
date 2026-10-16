package com.google.firebase.components;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements com.google.firebase.g.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8950a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f8951b;

    public /* synthetic */ l(Object obj, int i2) {
        this.f8951b = i2;
        this.f8950a = obj;
    }

    @Override // com.google.firebase.g.c
    public final Object a() {
        int i2 = this.f8951b;
        if (i2 == 0) {
            return this.f8950a;
        }
        if (i2 == 1) {
            return f.d((String) this.f8950a);
        }
        int i3 = com.google.firebase.installations.c.f9994a;
        return new com.google.firebase.installations.b.a((com.google.firebase.e) this.f8950a);
    }
}
