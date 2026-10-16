package G5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class P implements InterfaceC0532m {

    /* renamed from: b, reason: collision with root package name */
    public int f4364b;

    /* renamed from: c, reason: collision with root package name */
    public float f4365c;

    /* renamed from: d, reason: collision with root package name */
    public float f4366d;

    /* renamed from: e, reason: collision with root package name */
    public C0530k f4367e;

    /* renamed from: f, reason: collision with root package name */
    public C0530k f4368f;

    /* renamed from: g, reason: collision with root package name */
    public C0530k f4369g;

    /* renamed from: h, reason: collision with root package name */
    public C0530k f4370h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4371i;

    /* renamed from: j, reason: collision with root package name */
    public O f4372j;
    public ByteBuffer k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f4373l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f4374m;

    /* renamed from: n, reason: collision with root package name */
    public long f4375n;

    /* renamed from: o, reason: collision with root package name */
    public long f4376o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4377p;

    @Override // G5.InterfaceC0532m
    public final boolean b() {
        if (!this.f4377p) {
            return false;
        }
        O o7 = this.f4372j;
        return o7 == null || (o7.f4354m * o7.f4344b) * 2 == 0;
    }

    @Override // G5.InterfaceC0532m
    public final ByteBuffer c() {
        O o7 = this.f4372j;
        if (o7 != null) {
            int i5 = o7.f4354m;
            int i10 = o7.f4344b;
            int i11 = i5 * i10 * 2;
            if (i11 > 0) {
                if (this.k.capacity() < i11) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f4373l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f4373l.clear();
                }
                ShortBuffer shortBuffer = this.f4373l;
                int iMin = Math.min(shortBuffer.remaining() / i10, o7.f4354m);
                int i12 = iMin * i10;
                shortBuffer.put(o7.f4353l, 0, i12);
                int i13 = o7.f4354m - iMin;
                o7.f4354m = i13;
                short[] sArr = o7.f4353l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f4376o += i11;
                this.k.limit(i11);
                this.f4374m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.f4374m;
        this.f4374m = InterfaceC0532m.f4426a;
        return byteBuffer;
    }

    @Override // G5.InterfaceC0532m
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            O o7 = this.f4372j;
            o7.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f4375n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i5 = o7.f4344b;
            int i10 = iRemaining2 / i5;
            short[] sArrC = o7.c(o7.f4352j, o7.k, i10);
            o7.f4352j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, o7.k * i5, ((i10 * i5) * 2) / 2);
            o7.k += i10;
            o7.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // G5.InterfaceC0532m
    public final void e() {
        O o7 = this.f4372j;
        if (o7 != null) {
            int i5 = o7.k;
            float f10 = o7.f4345c;
            float f11 = o7.f4346d;
            int i10 = o7.f4354m + ((int) ((((i5 / (f10 / f11)) + o7.f4356o) / (o7.f4347e * f11)) + 0.5f));
            short[] sArr = o7.f4352j;
            int i11 = o7.f4350h * 2;
            o7.f4352j = o7.c(sArr, i5, i11 + i5);
            int i12 = 0;
            while (true) {
                int i13 = o7.f4344b;
                if (i12 >= i11 * i13) {
                    break;
                }
                o7.f4352j[(i13 * i5) + i12] = 0;
                i12++;
            }
            o7.k = i11 + o7.k;
            o7.f();
            if (o7.f4354m > i10) {
                o7.f4354m = i10;
            }
            o7.k = 0;
            o7.f4359r = 0;
            o7.f4356o = 0;
        }
        this.f4377p = true;
    }

    @Override // G5.InterfaceC0532m
    public final C0530k f(C0530k c0530k) throws C0531l {
        if (c0530k.f4424c != 2) {
            throw new C0531l(c0530k);
        }
        int i5 = this.f4364b;
        if (i5 == -1) {
            i5 = c0530k.f4422a;
        }
        this.f4367e = c0530k;
        C0530k c0530k2 = new C0530k(i5, c0530k.f4423b, 2);
        this.f4368f = c0530k2;
        this.f4371i = true;
        return c0530k2;
    }

    @Override // G5.InterfaceC0532m
    public final void flush() {
        if (isActive()) {
            C0530k c0530k = this.f4367e;
            this.f4369g = c0530k;
            C0530k c0530k2 = this.f4368f;
            this.f4370h = c0530k2;
            if (this.f4371i) {
                int i5 = c0530k.f4422a;
                this.f4372j = new O(this.f4365c, this.f4366d, i5, c0530k.f4423b, c0530k2.f4422a);
            } else {
                O o7 = this.f4372j;
                if (o7 != null) {
                    o7.k = 0;
                    o7.f4354m = 0;
                    o7.f4356o = 0;
                    o7.f4357p = 0;
                    o7.f4358q = 0;
                    o7.f4359r = 0;
                    o7.f4360s = 0;
                    o7.f4361t = 0;
                    o7.f4362u = 0;
                    o7.f4363v = 0;
                }
            }
        }
        this.f4374m = InterfaceC0532m.f4426a;
        this.f4375n = 0L;
        this.f4376o = 0L;
        this.f4377p = false;
    }

    @Override // G5.InterfaceC0532m
    public final boolean isActive() {
        if (this.f4368f.f4422a != -1) {
            return Math.abs(this.f4365c - 1.0f) >= 1.0E-4f || Math.abs(this.f4366d - 1.0f) >= 1.0E-4f || this.f4368f.f4422a != this.f4367e.f4422a;
        }
        return false;
    }

    @Override // G5.InterfaceC0532m
    public final void reset() {
        this.f4365c = 1.0f;
        this.f4366d = 1.0f;
        C0530k c0530k = C0530k.f4421e;
        this.f4367e = c0530k;
        this.f4368f = c0530k;
        this.f4369g = c0530k;
        this.f4370h = c0530k;
        ByteBuffer byteBuffer = InterfaceC0532m.f4426a;
        this.k = byteBuffer;
        this.f4373l = byteBuffer.asShortBuffer();
        this.f4374m = byteBuffer;
        this.f4364b = -1;
        this.f4371i = false;
        this.f4372j = null;
        this.f4375n = 0L;
        this.f4376o = 0L;
        this.f4377p = false;
    }
}
