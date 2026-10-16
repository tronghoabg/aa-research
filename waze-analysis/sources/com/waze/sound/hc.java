package com.waze.sound;

import androidx.media3.exoplayer.audio.TeeAudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hc implements TeeAudioProcessor.AudioBufferSink {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hl f40128a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.h.c.b f40129b;

    hc(hl hlVar) {
        this.f40128a = hlVar;
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public final void flush(int i2, int i3, int i4) {
        this.f40129b = i4 == 2 ? com.waze.h.c.b.f24340a : null;
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public final void handleBuffer(ByteBuffer byteBuffer) {
        h.g.b.x.f(byteBuffer, "buffer");
        com.waze.h.c.b bVar = this.f40129b;
        if (bVar == null) {
            return;
        }
        this.f40128a.u(new com.waze.h.a.g(com.waze.sharedrive.a.s.k(byteBuffer, bVar)), false);
    }
}
