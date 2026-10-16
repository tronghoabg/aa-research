package g2;

import android.os.Handler;
import android.os.HandlerThread;
import j$.util.Objects;
import java.io.Closeable;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f35695a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f35696b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f35697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f35698d;

    public y(z zVar, OutputStream outputStream) {
        this.f35698d = zVar;
        this.f35695a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f35696b = handlerThread;
        handlerThread.start();
        this.f35697c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        Handler handler = this.f35697c;
        HandlerThread handlerThread = this.f35696b;
        Objects.requireNonNull(handlerThread);
        handler.post(new com.applovin.adview.a(handlerThread, 26));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
