package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.a.a.j f3497a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f3498b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f3499c;

    g(Object obj, com.bumptech.glide.load.a.a.j jVar, int i2) {
        this.f3499c = i2;
        this.f3498b = obj;
        this.f3497a = jVar;
    }

    @Override // com.bumptech.glide.load.l
    public final int a(d dVar) throws IOException {
        int i2 = this.f3499c;
        Object obj = this.f3498b;
        if (i2 != 0) {
            try {
                return dVar.d((ByteBuffer) obj, this.f3497a);
            } finally {
                com.bumptech.glide.g.c.c((ByteBuffer) this.f3498b);
            }
        }
        try {
            return dVar.c((InputStream) obj, this.f3497a);
        } finally {
            ((InputStream) this.f3498b).reset();
        }
    }
}
