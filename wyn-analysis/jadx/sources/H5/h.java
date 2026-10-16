package H5;

import E5.P;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public final c f4916c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f4917d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4918e;

    /* renamed from: f, reason: collision with root package name */
    public long f4919f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f4920g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4921h;

    static {
        P.a("goog.exo.decoder");
    }

    public h(int i5) {
        super(0);
        this.f4916c = new c(0);
        this.f4921h = i5;
    }

    public void o() {
        this.f4893b = 0;
        ByteBuffer byteBuffer = this.f4917d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f4920g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f4918e = false;
    }

    public final ByteBuffer q(int i5) {
        int i10 = this.f4921h;
        if (i10 == 1) {
            return ByteBuffer.allocate(i5);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i5);
        }
        ByteBuffer byteBuffer = this.f4917d;
        throw new g(N0.a.e("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i5, ")"));
    }

    public final void r(int i5) {
        ByteBuffer byteBuffer = this.f4917d;
        if (byteBuffer == null) {
            this.f4917d = q(i5);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i5 + iPosition;
        if (iCapacity >= i10) {
            this.f4917d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferQ = q(i10);
        byteBufferQ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferQ.put(byteBuffer);
        }
        this.f4917d = byteBufferQ;
    }

    public final void s() {
        ByteBuffer byteBuffer = this.f4917d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f4920g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
