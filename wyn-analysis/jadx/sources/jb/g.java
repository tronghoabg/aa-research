package jb;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f38719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38720b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f38721c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f38722d;

    /* renamed from: e, reason: collision with root package name */
    public com.applovin.impl.sdk.nativeAd.e f38723e;

    /* renamed from: f, reason: collision with root package name */
    public f f38724f;

    public g(String str, int i5) {
        this.f38719a = str;
        this.f38720b = i5;
    }

    public final synchronized void a() {
        HandlerThread handlerThread = this.f38721c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f38721c = null;
            this.f38722d = null;
        }
    }

    public final synchronized void b(com.applovin.impl.sdk.nativeAd.e eVar) {
        HandlerThread handlerThread = new HandlerThread(this.f38719a, this.f38720b);
        this.f38721c = handlerThread;
        handlerThread.start();
        this.f38722d = new Handler(this.f38721c.getLooper());
        this.f38723e = eVar;
    }
}
