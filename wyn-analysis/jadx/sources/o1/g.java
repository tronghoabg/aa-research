package O1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public int f8836b;

    /* renamed from: c, reason: collision with root package name */
    public float f8837c;

    /* renamed from: d, reason: collision with root package name */
    public float f8838d;

    /* renamed from: e, reason: collision with root package name */
    public b f8839e;

    /* renamed from: f, reason: collision with root package name */
    public b f8840f;

    /* renamed from: g, reason: collision with root package name */
    public b f8841g;

    /* renamed from: h, reason: collision with root package name */
    public b f8842h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8843i;

    /* renamed from: j, reason: collision with root package name */
    public f f8844j;
    public ByteBuffer k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f8845l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f8846m;

    /* renamed from: n, reason: collision with root package name */
    public long f8847n;

    /* renamed from: o, reason: collision with root package name */
    public long f8848o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8849p;

    @Override // O1.d
    public final b a(b bVar) throws c {
        if (bVar.f8804c != 2) {
            throw new c(bVar);
        }
        int i5 = this.f8836b;
        if (i5 == -1) {
            i5 = bVar.f8802a;
        }
        this.f8839e = bVar;
        b bVar2 = new b(i5, bVar.f8803b, 2);
        this.f8840f = bVar2;
        this.f8843i = true;
        return bVar2;
    }

    @Override // O1.d
    public final boolean b() {
        if (!this.f8849p) {
            return false;
        }
        f fVar = this.f8844j;
        return fVar == null || (fVar.f8825m * fVar.f8815b) * 2 == 0;
    }

    @Override // O1.d
    public final ByteBuffer c() {
        f fVar = this.f8844j;
        if (fVar != null) {
            int i5 = fVar.f8825m;
            int i10 = fVar.f8815b;
            int i11 = i5 * i10 * 2;
            if (i11 > 0) {
                if (this.k.capacity() < i11) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f8845l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f8845l.clear();
                }
                ShortBuffer shortBuffer = this.f8845l;
                int iMin = Math.min(shortBuffer.remaining() / i10, fVar.f8825m);
                int i12 = iMin * i10;
                shortBuffer.put(fVar.f8824l, 0, i12);
                int i13 = fVar.f8825m - iMin;
                fVar.f8825m = i13;
                short[] sArr = fVar.f8824l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f8848o += i11;
                this.k.limit(i11);
                this.f8846m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.f8846m;
        this.f8846m = d.f8806a;
        return byteBuffer;
    }

    @Override // O1.d
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f fVar = this.f8844j;
            fVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f8847n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i5 = fVar.f8815b;
            int i10 = iRemaining2 / i5;
            short[] sArrC = fVar.c(fVar.f8823j, fVar.k, i10);
            fVar.f8823j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, fVar.k * i5, ((i10 * i5) * 2) / 2);
            fVar.k += i10;
            fVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // O1.d
    public final void e() {
        f fVar = this.f8844j;
        if (fVar != null) {
            int i5 = fVar.k;
            float f10 = fVar.f8816c;
            float f11 = fVar.f8817d;
            double d3 = f10 / f11;
            int i10 = fVar.f8825m + ((int) (((((((i5 - r6) / d3) + fVar.f8830r) + fVar.f8835w) + fVar.f8827o) / (fVar.f8818e * f11)) + 0.5d));
            fVar.f8835w = 0.0d;
            short[] sArr = fVar.f8823j;
            int i11 = fVar.f8821h * 2;
            fVar.f8823j = fVar.c(sArr, i5, i11 + i5);
            int i12 = 0;
            while (true) {
                int i13 = fVar.f8815b;
                if (i12 >= i11 * i13) {
                    break;
                }
                fVar.f8823j[(i13 * i5) + i12] = 0;
                i12++;
            }
            fVar.k = i11 + fVar.k;
            fVar.f();
            if (fVar.f8825m > i10) {
                fVar.f8825m = i10;
            }
            fVar.k = 0;
            fVar.f8830r = 0;
            fVar.f8827o = 0;
        }
        this.f8849p = true;
    }

    @Override // O1.d
    public final void flush() {
        if (isActive()) {
            b bVar = this.f8839e;
            this.f8841g = bVar;
            b bVar2 = this.f8840f;
            this.f8842h = bVar2;
            if (this.f8843i) {
                int i5 = bVar.f8802a;
                this.f8844j = new f(this.f8837c, this.f8838d, i5, bVar.f8803b, bVar2.f8802a);
            } else {
                f fVar = this.f8844j;
                if (fVar != null) {
                    fVar.k = 0;
                    fVar.f8825m = 0;
                    fVar.f8827o = 0;
                    fVar.f8828p = 0;
                    fVar.f8829q = 0;
                    fVar.f8830r = 0;
                    fVar.f8831s = 0;
                    fVar.f8832t = 0;
                    fVar.f8833u = 0;
                    fVar.f8834v = 0;
                    fVar.f8835w = 0.0d;
                }
            }
        }
        this.f8846m = d.f8806a;
        this.f8847n = 0L;
        this.f8848o = 0L;
        this.f8849p = false;
    }

    @Override // O1.d
    public final boolean isActive() {
        if (this.f8840f.f8802a != -1) {
            return Math.abs(this.f8837c - 1.0f) >= 1.0E-4f || Math.abs(this.f8838d - 1.0f) >= 1.0E-4f || this.f8840f.f8802a != this.f8839e.f8802a;
        }
        return false;
    }

    @Override // O1.d
    public final void reset() {
        this.f8837c = 1.0f;
        this.f8838d = 1.0f;
        b bVar = b.f8801e;
        this.f8839e = bVar;
        this.f8840f = bVar;
        this.f8841g = bVar;
        this.f8842h = bVar;
        ByteBuffer byteBuffer = d.f8806a;
        this.k = byteBuffer;
        this.f8845l = byteBuffer.asShortBuffer();
        this.f8846m = byteBuffer;
        this.f8836b = -1;
        this.f8843i = false;
        this.f8844j = null;
        this.f8847n = 0L;
        this.f8848o = 0L;
        this.f8849p = false;
    }
}
