package Wd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    public final int f15459f;

    public b() {
        super(2048);
        this.f15459f = 4098;
    }

    @Override // Wd.c
    public final Object a(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // Wd.c
    public final Object b() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f15459f);
        AbstractC3340k.b(byteBufferAllocate);
        return byteBufferAllocate;
    }

    @Override // Wd.c
    public final void h(Object obj) {
        ByteBuffer instance = (ByteBuffer) obj;
        AbstractC3340k.e(instance, "instance");
        if (instance.capacity() != this.f15459f) {
            throw new IllegalStateException("Check failed.");
        }
        if (instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
