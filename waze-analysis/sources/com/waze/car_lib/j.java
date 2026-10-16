package com.waze.car_lib;

import androidx.car.app.media.CarAudioRecord;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j implements com.waze.h.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final CarAudioRecord f20164a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.h.c.a f20165b;

    public j(CarAudioRecord carAudioRecord, com.waze.h.c.a aVar) {
        h.g.b.x.f(carAudioRecord, "carAudioRecorder");
        h.g.b.x.f(aVar, "audioConfig");
        this.f20164a = carAudioRecord;
        this.f20165b = aVar;
    }

    @Override // com.waze.h.b.e
    public final int a() {
        return 512;
    }

    @Override // com.waze.h.b.e
    public final com.waze.h.c.a b() {
        return this.f20165b;
    }

    @Override // com.waze.h.b.e
    public final void c() {
        this.f20164a.startRecording();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.waze.h.b.e
    public final void d() {
        this.f20164a.stopRecording();
    }

    @Override // com.waze.h.b.e
    public final com.waze.i.a e(byte[] bArr, int i2) {
        Object objA;
        h.g.b.x.f(bArr, "audioData");
        try {
            j jVar = this;
            objA = Integer.valueOf(this.f20164a.read(bArr, 0, i2));
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC == null) {
            int iIntValue = ((Number) objA).intValue();
            return iIntValue >= 0 ? new com.waze.h.b.d(iIntValue) : iIntValue == -1 ? com.waze.h.b.b.f24319a : new com.waze.h.b.c(Integer.valueOf(iIntValue));
        }
        com.waze.shared_infra.i.h.l("CarAudioRecorder", "exception while reading bytes", thC);
        return new com.waze.h.b.c((byte[]) null);
    }
}
