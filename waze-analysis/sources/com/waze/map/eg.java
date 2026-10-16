package com.waze.map;

import android.os.SystemClock;
import com.waze.NativeManager;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class eg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f28829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NativeCanvasRenderer f28830b;

    /* renamed from: c, reason: collision with root package name */
    private long f28831c;

    eg(NativeCanvasRenderer nativeCanvasRenderer) {
        Objects.requireNonNull(nativeCanvasRenderer);
        this.f28830b = nativeCanvasRenderer;
        this.f28829a = new AtomicBoolean(false);
        this.f28831c = -1L;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCanvasRenderer nativeCanvasRenderer = this.f28830b;
        if (nativeCanvasRenderer.q == null || !nativeCanvasRenderer.r || this.f28829a.get()) {
            return;
        }
        if (this.f28831c == -1) {
            this.f28831c = SystemClock.uptimeMillis();
        }
        if (!nativeCanvasRenderer.f27904a.get() && nativeCanvasRenderer.DrawNTV(nativeCanvasRenderer.q)) {
            List list = nativeCanvasRenderer.f27905b;
            synchronized (list) {
                if (!list.isEmpty()) {
                    List list2 = nativeCanvasRenderer.f27906c;
                    synchronized (list2) {
                        list2.addAll(list);
                    }
                    nativeCanvasRenderer.f27905b.clear();
                }
            }
            this.f28830b.n.requestRender();
        }
        NativeCanvasRenderer nativeCanvasRenderer2 = this.f28830b;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j2 = this.f28831c + (jUptimeMillis - nativeCanvasRenderer2.f27907f < 5000 ? 17L : 33L);
        this.f28831c = j2;
        long j3 = 2 + jUptimeMillis;
        if (j2 < j3) {
            this.f28831c = j3;
        }
        NativeManager.getInstance().PostRunnable(this, this.f28831c - jUptimeMillis);
    }
}
