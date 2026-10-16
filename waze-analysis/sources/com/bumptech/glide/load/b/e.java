package com.bumptech.glide.load.b;

import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3252a;

    e(f fVar, int i2, byte[] bArr) {
        this.f3252a = i2;
        Objects.requireNonNull(fVar);
    }

    @Override // com.bumptech.glide.load.b.c
    public final Class a() {
        return this.f3252a != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // com.bumptech.glide.load.b.c
    public final /* synthetic */ Object b(byte[] bArr) {
        return this.f3252a != 0 ? ByteBuffer.wrap(bArr) : new ByteArrayInputStream(bArr);
    }

    e(f fVar, int i2) {
        this.f3252a = i2;
        Objects.requireNonNull(fVar);
    }
}
