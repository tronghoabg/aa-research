package com.b.b.c.a;

import com.google.l.g;
import com.google.l.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a implements com.b.b.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f2621a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.d f2622b;

    a(com.google.l.d dVar, i iVar) {
        this.f2622b = dVar;
        this.f2621a = iVar.e();
    }

    @Override // com.b.b.c.a
    public final int a(int i2) {
        try {
            return this.f2621a.b(i2).a();
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    @Override // com.b.b.c.a
    public final com.b.b.c.c b(int i2) {
        try {
            return new b(this.f2622b, this.f2621a.b(i2));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // com.b.b.c.a
    public final String c(int i2) {
        try {
            return this.f2621a.b(i2).c();
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
