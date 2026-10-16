package Pf;

import A7.AbstractC0279p0;
import Va.M6;
import cb.AbstractC1593a;
import ff.m;
import java.io.EOFException;
import java.io.Flushable;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a implements i, AutoCloseable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    public g f9454a;

    /* renamed from: b, reason: collision with root package name */
    public g f9455b;

    /* renamed from: c, reason: collision with root package name */
    public long f9456c;

    public final int a(int i5, int i10, byte[] bArr) {
        j.a(bArr.length, i5, i10);
        g gVar = this.f9454a;
        if (gVar == null) {
            return -1;
        }
        int iMin = Math.min(i10 - i5, gVar.a());
        int i11 = (i5 + iMin) - i5;
        int i12 = gVar.f9470b;
        m.f0(i5, i12, i12 + i11, gVar.f9469a, bArr);
        gVar.f9470b += i11;
        this.f9456c -= iMin;
        if (gVar.a() == 0) {
            d();
        }
        return iMin;
    }

    public final void b(a sink, long j8) throws EOFException {
        AbstractC3340k.e(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC1593a.h(j8, "byteCount (", ") < 0").toString());
        }
        long j10 = this.f9456c;
        if (j10 >= j8) {
            sink.y(this, j8);
        } else {
            sink.y(this, j10);
            throw new EOFException(M6.s(M6.u(j8, "Buffer exhausted before writing ", " bytes. Only "), this.f9456c, " bytes were written."));
        }
    }

    public final void d() {
        g gVar = this.f9454a;
        AbstractC3340k.b(gVar);
        g gVar2 = gVar.f9474f;
        this.f9454a = gVar2;
        if (gVar2 == null) {
            this.f9455b = null;
        } else {
            gVar2.f9475g = null;
        }
        gVar.f9474f = null;
        h.a(gVar);
    }

    @Override // Pf.i
    public final boolean exhausted() {
        return this.f9456c == 0;
    }

    public final long h(d source) {
        AbstractC3340k.e(source, "source");
        long j8 = 0;
        while (true) {
            long j10 = source.j(this, 8192L);
            if (j10 == -1) {
                return j8;
            }
            j8 += j10;
        }
    }

    public final long i(a sink) {
        AbstractC3340k.e(sink, "sink");
        long j8 = this.f9456c;
        if (j8 > 0) {
            sink.y(this, j8);
        }
        return j8;
    }

    @Override // Pf.d
    public final long j(a sink, long j8) {
        AbstractC3340k.e(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC1593a.h(j8, "byteCount (", ") < 0").toString());
        }
        long j10 = this.f9456c;
        if (j10 == 0) {
            return -1L;
        }
        if (j8 > j10) {
            j8 = j10;
        }
        sink.y(this, j8);
        return j8;
    }

    public final /* synthetic */ g o() {
        g gVar = this.f9455b;
        if (gVar == null) {
            g gVarB = h.b();
            this.f9454a = gVarB;
            this.f9455b = gVarB;
            return gVarB;
        }
        if (gVar.f9471c + 1 <= 8192 && gVar.f9473e) {
            return gVar;
        }
        g gVarB2 = h.b();
        gVar.d(gVarB2);
        this.f9455b = gVarB2;
        return gVarB2;
    }

    @Override // Pf.i
    public final byte readByte() throws EOFException {
        g gVar = this.f9454a;
        if (gVar == null) {
            throw new EOFException(M6.s(new StringBuilder("Buffer doesn't contain required number of bytes (size: "), this.f9456c, ", required: 1)"));
        }
        int iA = gVar.a();
        if (iA == 0) {
            d();
            return readByte();
        }
        int i5 = gVar.f9470b;
        gVar.f9470b = i5 + 1;
        byte b5 = gVar.f9469a[i5];
        this.f9456c--;
        if (iA == 1) {
            d();
        }
        return b5;
    }

    @Override // Pf.i
    public final boolean request(long j8) {
        if (j8 >= 0) {
            return this.f9456c >= j8;
        }
        throw new IllegalArgumentException(AbstractC1593a.h(j8, "byteCount: ", " < 0").toString());
    }

    @Override // Pf.i
    public final void require(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        if (this.f9456c >= j8) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f9456c + ", required: " + j8 + ')');
    }

    public final void skip(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC1593a.h(j8, "byteCount (", ") < 0").toString());
        }
        long j10 = j8;
        while (j10 > 0) {
            g gVar = this.f9454a;
            if (gVar == null) {
                throw new EOFException(AbstractC1593a.h(j8, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j10, gVar.f9471c - gVar.f9470b);
            long j11 = iMin;
            this.f9456c -= j11;
            j10 -= j11;
            int i5 = gVar.f9470b + iMin;
            gVar.f9470b = i5;
            if (i5 == gVar.f9471c) {
                d();
            }
        }
    }

    public final String toString() {
        long j8 = this.f9456c;
        if (j8 == 0) {
            return "Buffer(size=0)";
        }
        long j10 = 64;
        int iMin = (int) Math.min(j10, j8);
        StringBuilder sb2 = new StringBuilder((iMin * 2) + (this.f9456c > j10 ? 1 : 0));
        int i5 = 0;
        for (g gVar = this.f9454a; gVar != null; gVar = gVar.f9474f) {
            int i10 = 0;
            while (i5 < iMin && i10 < gVar.a()) {
                int i11 = i10 + 1;
                byte b5 = gVar.b(i10);
                i5++;
                char[] cArr = j.f9483a;
                sb2.append(cArr[(b5 >> 4) & 15]);
                sb2.append(cArr[b5 & 15]);
                i10 = i11;
            }
        }
        if (this.f9456c > j10) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + this.f9456c + " hex=" + ((Object) sb2) + ')';
    }

    public final void w(int i5, byte[] source) {
        AbstractC3340k.e(source, "source");
        int i10 = 0;
        j.a(source.length, 0, i5);
        while (i10 < i5) {
            g gVarO = o();
            byte[] bArr = gVarO.f9469a;
            int iMin = Math.min(i5 - i10, bArr.length - gVarO.f9471c) + i10;
            m.f0(gVarO.f9471c, i10, iMin, source, bArr);
            gVarO.f9471c = (iMin - i10) + gVarO.f9471c;
            i10 = iMin;
        }
        this.f9456c += i5;
    }

    public final void y(a source, long j8) {
        g gVarB;
        AbstractC3340k.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        j.b(source.f9456c, j8);
        while (j8 > 0) {
            AbstractC3340k.b(source.f9454a);
            int i5 = 0;
            if (j8 < r0.a()) {
                g gVar = this.f9455b;
                if (gVar != null && gVar.f9473e) {
                    long j10 = gVar.f9471c + j8;
                    j jVar = gVar.f9472d;
                    if (j10 - ((jVar == null || ((f) jVar).f9468b <= 0) ? gVar.f9470b : 0) <= 8192) {
                        g gVar2 = source.f9454a;
                        AbstractC3340k.b(gVar2);
                        gVar2.f(gVar, (int) j8);
                        source.f9456c -= j8;
                        this.f9456c += j8;
                        return;
                    }
                }
                g gVar3 = source.f9454a;
                AbstractC3340k.b(gVar3);
                int i10 = (int) j8;
                if (i10 <= 0 || i10 > gVar3.f9471c - gVar3.f9470b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i10 >= 1024) {
                    gVarB = gVar3.e();
                } else {
                    gVarB = h.b();
                    int i11 = gVar3.f9470b;
                    m.f0(0, i11, i11 + i10, gVar3.f9469a, gVarB.f9469a);
                }
                gVarB.f9471c = gVarB.f9470b + i10;
                gVar3.f9470b += i10;
                g gVar4 = gVar3.f9475g;
                if (gVar4 != null) {
                    gVar4.d(gVarB);
                } else {
                    gVarB.f9474f = gVar3;
                    gVar3.f9475g = gVarB;
                }
                source.f9454a = gVarB;
            }
            g gVar5 = source.f9454a;
            AbstractC3340k.b(gVar5);
            long jA = gVar5.a();
            g gVarC = gVar5.c();
            source.f9454a = gVarC;
            if (gVarC == null) {
                source.f9455b = null;
            }
            if (this.f9454a == null) {
                this.f9454a = gVar5;
                this.f9455b = gVar5;
            } else {
                g gVar6 = this.f9455b;
                AbstractC3340k.b(gVar6);
                gVar6.d(gVar5);
                g gVar7 = gVar5.f9475g;
                if (gVar7 == null) {
                    throw new IllegalStateException("cannot compact");
                }
                if (gVar7.f9473e) {
                    int i12 = gVar5.f9471c - gVar5.f9470b;
                    AbstractC3340k.b(gVar7);
                    int i13 = 8192 - gVar7.f9471c;
                    g gVar8 = gVar5.f9475g;
                    AbstractC3340k.b(gVar8);
                    j jVar2 = gVar8.f9472d;
                    if (jVar2 == null || ((f) jVar2).f9468b <= 0) {
                        g gVar9 = gVar5.f9475g;
                        AbstractC3340k.b(gVar9);
                        i5 = gVar9.f9470b;
                    }
                    if (i12 <= i13 + i5) {
                        g gVar10 = gVar5.f9475g;
                        AbstractC3340k.b(gVar10);
                        gVar5.f(gVar10, i12);
                        if (gVar5.c() != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        h.a(gVar5);
                        gVar5 = gVar10;
                    }
                }
                this.f9455b = gVar5;
                if (gVar5.f9475g == null) {
                    this.f9454a = gVar5;
                }
            }
            source.f9456c -= jA;
            this.f9456c += jA;
            j8 -= jA;
        }
    }

    public final void z(byte b5) {
        g gVarO = o();
        int i5 = gVarO.f9471c;
        gVarO.f9471c = i5 + 1;
        gVarO.f9469a[i5] = b5;
        this.f9456c++;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // Pf.i
    public final a getBuffer() {
        return this;
    }
}
