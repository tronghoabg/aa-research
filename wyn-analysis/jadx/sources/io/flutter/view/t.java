package io.flutter.view;

import A7.S;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes5.dex */
public final class t implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f37314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f37315b;

    public t(S s10, long j8) {
        this.f37315b = s10;
        this.f37314a = j8;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        long jNanoTime = System.nanoTime() - j8;
        long j10 = jNanoTime < 0 ? 0L : jNanoTime;
        S s10 = this.f37315b;
        ((FlutterJNI) s10.f691c).onVsync(j10, s10.f690b, this.f37314a);
        s10.f692d = this;
    }
}
