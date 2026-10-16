package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ec implements dp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.d.b.t f7555a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f7556b;

    public /* synthetic */ ec(com.google.d.b.t tVar, int i2) {
        this.f7556b = i2;
        this.f7555a = tVar;
    }

    @Override // com.google.d.d.dp
    public final Object a(Object obj, Object obj2) {
        int i2 = this.f7556b;
        com.google.d.b.t tVar = this.f7555a;
        return i2 != 0 ? tVar.apply(obj2) : tVar.apply(obj2);
    }
}
