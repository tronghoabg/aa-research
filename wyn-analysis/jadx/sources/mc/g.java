package mc;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import uc.InterfaceC4268e;

/* loaded from: classes5.dex */
public final class g implements InterfaceC4268e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f40539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40540b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f40541c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i5) {
        this.f40539a = flutterJNI;
        this.f40540b = i5;
    }

    @Override // uc.InterfaceC4268e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f40541c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i5 = this.f40540b;
        FlutterJNI flutterJNI = this.f40539a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i5, byteBuffer, byteBuffer.position());
        }
    }
}
