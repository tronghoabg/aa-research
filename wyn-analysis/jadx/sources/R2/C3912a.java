package r2;

import N1.C0765n;
import Q1.o;
import Q1.x;
import R8.v;
import S3.c;
import T1.d;
import U1.AbstractC0834d;
import U1.C0848s;
import java.nio.ByteBuffer;
import org.apache.tika.pipes.PipesConfigBase;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3912a extends AbstractC0834d {

    /* renamed from: r, reason: collision with root package name */
    public final d f44319r;

    /* renamed from: s, reason: collision with root package name */
    public final o f44320s;

    /* renamed from: t, reason: collision with root package name */
    public C0848s f44321t;

    /* renamed from: u, reason: collision with root package name */
    public long f44322u;

    public C3912a() {
        super(6);
        this.f44319r = new d(1);
        this.f44320s = new o();
    }

    @Override // U1.AbstractC0834d
    public final void D() {
        C0848s c0848s = this.f44321t;
        if (c0848s != null) {
            c0848s.e();
        }
    }

    @Override // U1.AbstractC0834d
    public final void F(long j8, boolean z2) {
        this.f44322u = Long.MIN_VALUE;
        C0848s c0848s = this.f44321t;
        if (c0848s != null) {
            c0848s.e();
        }
    }

    @Override // U1.AbstractC0834d, U1.S
    public final void c(int i5, Object obj) {
        if (i5 == 8) {
            this.f44321t = (C0848s) obj;
        }
    }

    @Override // U1.X
    public final int d(C0765n c0765n) {
        return "application/x-camera-motion".equals(c0765n.f8232n) ? v.a(4, 0, 0, 0) : v.a(0, 0, 0, 0);
    }

    @Override // U1.W, U1.X
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // U1.W
    public final boolean isReady() {
        return true;
    }

    @Override // U1.W
    public final void v(long j8, long j10) {
        float[] fArr;
        while (!i() && this.f44322u < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + j8) {
            d dVar = this.f44319r;
            dVar.o();
            c cVar = this.f12032c;
            cVar.i();
            if (L(cVar, dVar, 0) != -4 || dVar.h(4)) {
                return;
            }
            long j11 = dVar.f11360g;
            this.f44322u = j11;
            boolean z2 = j11 < this.f12040l;
            if (this.f44321t != null && !z2) {
                dVar.s();
                ByteBuffer byteBuffer = dVar.f11358e;
                int i5 = x.f9724a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    o oVar = this.f44320s;
                    oVar.E(iLimit, bArrArray);
                    oVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(oVar.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f44321t.d();
                }
            }
        }
    }
}
