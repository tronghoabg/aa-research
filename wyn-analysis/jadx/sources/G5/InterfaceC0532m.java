package G5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: G5.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0532m {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f4426a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    void e();

    C0530k f(C0530k c0530k);

    void flush();

    boolean isActive();

    void reset();
}
