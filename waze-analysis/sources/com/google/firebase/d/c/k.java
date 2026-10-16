package com.google.firebase.d.c;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k implements com.google.firebase.d.i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9863a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9864b = false;

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.d.e f9865c;

    /* renamed from: d, reason: collision with root package name */
    private final h f9866d;

    k(h hVar) {
        this.f9866d = hVar;
    }

    private final void b() {
        if (this.f9863a) {
            throw new com.google.firebase.d.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9863a = true;
    }

    final void a(com.google.firebase.d.e eVar, boolean z) {
        this.f9863a = false;
        this.f9865c = eVar;
        this.f9864b = z;
    }

    @Override // com.google.firebase.d.i
    public final void f(String str) throws IOException {
        b();
        this.f9866d.l(this.f9865c, str, this.f9864b);
    }

    @Override // com.google.firebase.d.i
    public final void g(boolean z) throws IOException {
        b();
        this.f9866d.h(this.f9865c, z ? 1 : 0, this.f9864b);
    }
}
