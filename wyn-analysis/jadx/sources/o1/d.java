package O1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f8806a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    b a(b bVar);

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    void e();

    void flush();

    boolean isActive();

    void reset();
}
