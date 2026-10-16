package com.waze.sound;

import android.media.AudioRecord;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cg implements com.waze.h.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final AudioRecord f39657a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39658b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.h.c.a f39659c;

    public cg(AudioRecord audioRecord, int i2, com.waze.h.c.a aVar) {
        h.g.b.x.f(audioRecord, "audioRecorder");
        h.g.b.x.f(aVar, "audioConfig");
        this.f39657a = audioRecord;
        this.f39658b = i2;
        this.f39659c = aVar;
    }

    @Override // com.waze.h.b.e
    public final int a() {
        return this.f39658b;
    }

    @Override // com.waze.h.b.e
    public final com.waze.h.c.a b() {
        return this.f39659c;
    }

    @Override // com.waze.h.b.e
    public final void c() throws IllegalStateException {
        this.f39657a.startRecording();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39657a.release();
    }

    @Override // com.waze.h.b.e
    public final void d() throws IllegalStateException {
        this.f39657a.stop();
    }

    @Override // com.waze.h.b.e
    public final com.waze.i.a e(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "audioData");
        int i3 = this.f39657a.read(bArr, 0, i2);
        return i3 >= 0 ? new com.waze.h.b.d(i3) : new com.waze.h.b.c(Integer.valueOf(i3));
    }
}
