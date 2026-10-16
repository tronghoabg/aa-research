package w6;

import A7.AbstractC0279p0;
import E5.AbstractC0449f;
import E5.T;
import S3.s;
import java.nio.ByteBuffer;
import org.apache.tika.pipes.PipesConfigBase;
import u6.v;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4368b extends AbstractC0449f {

    /* renamed from: m, reason: collision with root package name */
    public final H5.h f47305m;

    /* renamed from: n, reason: collision with root package name */
    public final Y4.b f47306n;

    /* renamed from: o, reason: collision with root package name */
    public long f47307o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC4367a f47308p;

    /* renamed from: q, reason: collision with root package name */
    public long f47309q;

    public C4368b() {
        super(6);
        this.f47305m = new H5.h(1);
        this.f47306n = new Y4.b();
    }

    @Override // E5.AbstractC0449f, E5.x0
    public final void c(int i5, Object obj) {
        if (i5 == 8) {
            this.f47308p = (InterfaceC4367a) obj;
        }
    }

    @Override // E5.AbstractC0449f
    public final String f() {
        return "CameraMotionRenderer";
    }

    @Override // E5.AbstractC0449f
    public final boolean i() {
        return h();
    }

    @Override // E5.AbstractC0449f
    public final boolean j() {
        return true;
    }

    @Override // E5.AbstractC0449f
    public final void k() {
        InterfaceC4367a interfaceC4367a = this.f47308p;
        if (interfaceC4367a != null) {
            interfaceC4367a.b();
        }
    }

    @Override // E5.AbstractC0449f
    public final void m(long j8, boolean z2) {
        this.f47309q = Long.MIN_VALUE;
        InterfaceC4367a interfaceC4367a = this.f47308p;
        if (interfaceC4367a != null) {
            interfaceC4367a.b();
        }
    }

    @Override // E5.AbstractC0449f
    public final void q(T[] tArr, long j8, long j10) {
        this.f47307o = j10;
    }

    @Override // E5.AbstractC0449f
    public final void s(long j8, long j10) {
        float[] fArr;
        while (!h() && this.f47309q < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + j8) {
            H5.h hVar = this.f47305m;
            hVar.o();
            s sVar = this.f3346b;
            sVar.e();
            if (r(sVar, hVar, 0) != -4 || hVar.h(4)) {
                return;
            }
            this.f47309q = hVar.f4919f;
            if (this.f47308p != null && !hVar.h(Integer.MIN_VALUE)) {
                hVar.s();
                ByteBuffer byteBuffer = hVar.f4917d;
                int i5 = v.f46721a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    Y4.b bVar = this.f47306n;
                    bVar.y(iLimit, bArrArray);
                    bVar.A(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(bVar.f());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f47308p.a(this.f47309q - this.f47307o, fArr);
                }
            }
        }
    }

    @Override // E5.AbstractC0449f
    public final int w(T t10) {
        return "application/x-camera-motion".equals(t10.f3238l) ? AbstractC0279p0.e(4, 0, 0) : AbstractC0279p0.e(0, 0, 0);
    }
}
