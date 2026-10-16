package com.bumptech.glide.load.c.b;

import com.bumptech.glide.load.data.g;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f3385a;

    public b(ByteBuffer byteBuffer) {
        this.f3385a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.g
    public final /* bridge */ /* synthetic */ Object a() {
        ByteBuffer byteBuffer = this.f3385a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.g
    public final void b() {
    }
}
