package com.google.e.a.j;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa implements com.google.e.a.g.c {

    /* renamed from: a, reason: collision with root package name */
    final com.google.e.a.g.c f8661a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.e.a.g.c f8662b;

    /* synthetic */ aa(com.google.e.a.g.c cVar, com.google.e.a.g.c cVar2) {
        this.f8661a = cVar;
        this.f8662b = cVar2;
    }

    @Override // com.google.e.a.g.c
    public final byte[] a(byte[] bArr, int i2) {
        return bArr.length <= 64 ? this.f8661a.a(bArr, i2) : this.f8662b.a(bArr, i2);
    }
}
