package com.google.firebase.perf.d;

import androidx.camera.video.AudioStats;
import androidx.tracing.Trace;
import com.google.firebase.perf.e.i;
import com.google.firebase.perf.e.m;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10341a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final long f10342b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10343c;

    /* renamed from: e, reason: collision with root package name */
    private i f10345e;

    /* renamed from: h, reason: collision with root package name */
    private final i f10348h;

    /* renamed from: i, reason: collision with root package name */
    private final i f10349i;

    /* renamed from: j, reason: collision with root package name */
    private final long f10350j;

    /* renamed from: k, reason: collision with root package name */
    private final long f10351k;

    /* renamed from: f, reason: collision with root package name */
    private long f10346f = 500;

    /* renamed from: g, reason: collision with root package name */
    private double f10347g = 500.0d;

    /* renamed from: d, reason: collision with root package name */
    private m f10344d = new m();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10342b = 1000000L;
    }

    c(i iVar, com.google.firebase.perf.config.a aVar, String str, boolean z) {
        this.f10345e = iVar;
        long jG = str == Trace.TAG ? aVar.g() : aVar.g();
        long jN = str == Trace.TAG ? aVar.n() : aVar.f();
        i iVar2 = new i(jN, jG, TimeUnit.SECONDS);
        this.f10348h = iVar2;
        this.f10350j = jN;
        if (z) {
            f10341a.c("Foreground %s logging rate:%f, burst capacity:%d", str, iVar2, Long.valueOf(jN));
        }
        long jG2 = str == Trace.TAG ? aVar.g() : aVar.g();
        long jM = str == Trace.TAG ? aVar.m() : aVar.e();
        i iVar3 = new i(jM, jG2, TimeUnit.SECONDS);
        this.f10349i = iVar3;
        this.f10351k = jM;
        if (z) {
            f10341a.c("Background %s logging rate:%f, capacity:%d", str, iVar3, Long.valueOf(jM));
        }
        this.f10343c = z;
    }

    final synchronized void a(boolean z) {
        this.f10345e = z ? this.f10348h : this.f10349i;
        this.f10346f = z ? this.f10350j : this.f10351k;
    }

    final synchronized boolean b() {
        m mVar = new m();
        double dC = (this.f10344d.c(mVar) * this.f10345e.a()) / f10342b;
        if (dC > AudioStats.AUDIO_AMPLITUDE_NONE) {
            this.f10347g = Math.min(this.f10347g + dC, this.f10346f);
            this.f10344d = mVar;
        }
        double d2 = this.f10347g;
        if (d2 >= 1.0d) {
            this.f10347g = d2 - 1.0d;
            return true;
        }
        if (this.f10343c) {
            f10341a.i("Exceeded log rate limit, dropping the log.");
        }
        return false;
    }
}
