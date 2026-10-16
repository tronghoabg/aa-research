package com.waze.sound.c;

import h.ab;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WritableByteChannel f39634a;

    p(WritableByteChannel writableByteChannel) {
        this.f39634a = writableByteChannel;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) throws IOException {
        this.f39634a.write((ByteBuffer) obj);
        return ab.f48028a;
    }
}
