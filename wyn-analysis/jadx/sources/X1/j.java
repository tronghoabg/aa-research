package X1;

import N1.C0765n;
import Q1.x;
import S3.s;
import java.io.IOException;
import k2.d0;

/* loaded from: classes.dex */
public final class j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0765n f16002a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f16004c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16005d;

    /* renamed from: e, reason: collision with root package name */
    public Y1.g f16006e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16007f;

    /* renamed from: g, reason: collision with root package name */
    public int f16008g;

    /* renamed from: b, reason: collision with root package name */
    public final s f16003b = new s((byte) 0, 3);

    /* renamed from: h, reason: collision with root package name */
    public long f16009h = -9223372036854775807L;

    public j(Y1.g gVar, C0765n c0765n, boolean z2) {
        this.f16002a = c0765n;
        this.f16006e = gVar;
        this.f16004c = gVar.f16339b;
        b(gVar, z2);
    }

    public final void b(Y1.g gVar, boolean z2) {
        int i5 = this.f16008g;
        long j8 = -9223372036854775807L;
        long j10 = i5 == 0 ? -9223372036854775807L : this.f16004c[i5 - 1];
        this.f16005d = z2;
        this.f16006e = gVar;
        long[] jArr = gVar.f16339b;
        this.f16004c = jArr;
        long j11 = this.f16009h;
        if (j11 == -9223372036854775807L) {
            if (j10 != -9223372036854775807L) {
                this.f16008g = x.a(jArr, j10, false);
            }
        } else {
            int iA = x.a(jArr, j11, true);
            this.f16008g = iA;
            if (this.f16005d && iA == this.f16004c.length) {
                j8 = j11;
            }
            this.f16009h = j8;
        }
    }

    @Override // k2.d0
    public final int g(long j8) {
        int iMax = Math.max(this.f16008g, x.a(this.f16004c, j8, true));
        int i5 = iMax - this.f16008g;
        this.f16008g = iMax;
        return i5;
    }

    @Override // k2.d0
    public final boolean isReady() {
        return true;
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) throws IOException {
        int i10 = this.f16008g;
        boolean z2 = i10 == this.f16004c.length;
        if (z2 && !this.f16005d) {
            dVar.f4893b = 4;
            return -4;
        }
        if ((i5 & 2) != 0 || !this.f16007f) {
            cVar.f10937c = this.f16002a;
            this.f16007f = true;
            return -5;
        }
        if (z2) {
            return -3;
        }
        if ((i5 & 1) == 0) {
            this.f16008g = i10 + 1;
        }
        if ((i5 & 4) == 0) {
            byte[] bArrO = this.f16003b.o(this.f16006e.f16338a[i10]);
            dVar.r(bArrO.length);
            dVar.f11358e.put(bArrO);
        }
        dVar.f11360g = this.f16004c[i10];
        dVar.f4893b = 1;
        return -4;
    }

    @Override // k2.d0
    public final void a() {
    }
}
