package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f3493a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3494b;

    e(Object obj, int i2) {
        this.f3494b = i2;
        this.f3493a = obj;
    }

    @Override // com.bumptech.glide.load.m
    public final ImageHeaderParser$ImageType a(d dVar) throws IOException {
        int i2 = this.f3494b;
        Object obj = this.f3493a;
        if (i2 != 0) {
            try {
                return dVar.a((InputStream) obj);
            } finally {
                ((InputStream) this.f3493a).reset();
            }
        }
        try {
            return dVar.b((ByteBuffer) obj);
        } finally {
            com.bumptech.glide.g.c.c((ByteBuffer) this.f3493a);
        }
    }
}
