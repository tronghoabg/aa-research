package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.a.a.j f3502a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f3503b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f3504c;

    i(Object obj, com.bumptech.glide.load.a.a.j jVar, int i2) {
        this.f3504c = i2;
        this.f3503b = obj;
        this.f3502a = jVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(d dVar) throws IOException {
        int i2 = this.f3504c;
        Object obj = this.f3503b;
        if (i2 != 0) {
            try {
                return dVar.f((ByteBuffer) obj, this.f3502a);
            } finally {
                com.bumptech.glide.g.c.c((ByteBuffer) this.f3503b);
            }
        }
        try {
            return dVar.e((InputStream) obj, this.f3502a);
        } finally {
            ((InputStream) this.f3503b).reset();
        }
    }
}
