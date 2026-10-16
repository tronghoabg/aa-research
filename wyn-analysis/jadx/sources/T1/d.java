package T1;

import N1.AbstractC0774x;
import N1.C0765n;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d extends H5.a {

    /* renamed from: c, reason: collision with root package name */
    public C0765n f11356c;

    /* renamed from: d, reason: collision with root package name */
    public final H5.c f11357d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f11358e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11359f;

    /* renamed from: g, reason: collision with root package name */
    public long f11360g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f11361h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11362i;

    static {
        AbstractC0774x.a("media3.decoder");
    }

    public d(int i5) {
        super(3);
        this.f11357d = new H5.c(1);
        this.f11362i = i5;
    }

    public void o() {
        this.f4893b = 0;
        ByteBuffer byteBuffer = this.f11358e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f11361h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f11359f = false;
    }

    public final ByteBuffer q(int i5) {
        int i10 = this.f11362i;
        if (i10 == 1) {
            return ByteBuffer.allocate(i5);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i5);
        }
        ByteBuffer byteBuffer = this.f11358e;
        throw new c(N0.a.e("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i5, ")"));
    }

    public final void r(int i5) {
        ByteBuffer byteBuffer = this.f11358e;
        if (byteBuffer == null) {
            this.f11358e = q(i5);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i5 + iPosition;
        if (iCapacity >= i10) {
            this.f11358e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferQ = q(i10);
        byteBufferQ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferQ.put(byteBuffer);
        }
        this.f11358e = byteBufferQ;
    }

    public final void s() {
        ByteBuffer byteBuffer = this.f11358e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f11361h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
