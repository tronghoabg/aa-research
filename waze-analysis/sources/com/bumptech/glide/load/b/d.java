package com.bumptech.glide.load.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3250a;

    /* renamed from: b, reason: collision with root package name */
    private final c f3251b;

    d(byte[] bArr, c cVar) {
        this.f3250a = bArr;
        this.f3251b = cVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f3251b.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, com.bumptech.glide.load.data.d dVar) {
        dVar.b(this.f3251b.b(this.f3250a));
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
