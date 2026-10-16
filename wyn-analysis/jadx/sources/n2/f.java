package N2;

import E5.o0;
import N1.D;
import Q1.o;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f8355a;

    /* renamed from: b, reason: collision with root package name */
    public long f8356b;

    /* renamed from: c, reason: collision with root package name */
    public int f8357c;

    /* renamed from: d, reason: collision with root package name */
    public int f8358d;

    /* renamed from: e, reason: collision with root package name */
    public int f8359e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8360f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8361g;

    public f(int i5) {
        switch (i5) {
            case 1:
                this.f8360f = new int[255];
                this.f8361g = new Y4.b(255);
                break;
            default:
                this.f8360f = new int[255];
                this.f8361g = new o(255);
                break;
        }
    }

    public boolean a(J5.h hVar, boolean z2) throws o0, EOFException {
        boolean zC;
        boolean zC2;
        this.f8355a = 0;
        this.f8356b = 0L;
        this.f8357c = 0;
        this.f8358d = 0;
        this.f8359e = 0;
        Y4.b bVar = (Y4.b) this.f8361g;
        bVar.x(27);
        try {
            zC = hVar.c(bVar.f16679a, 0, 27, z2);
        } catch (EOFException e7) {
            if (!z2) {
                throw e7;
            }
            zC = false;
        }
        if (zC && bVar.r() == 1332176723) {
            if (bVar.q() == 0) {
                this.f8355a = bVar.q();
                this.f8356b = bVar.g();
                bVar.h();
                bVar.h();
                bVar.h();
                int iQ = bVar.q();
                this.f8357c = iQ;
                this.f8358d = iQ + 27;
                bVar.x(iQ);
                try {
                    zC2 = hVar.c(bVar.f16679a, 0, this.f8357c, z2);
                } catch (EOFException e10) {
                    if (!z2) {
                        throw e10;
                    }
                    zC2 = false;
                }
                if (zC2) {
                    for (int i5 = 0; i5 < this.f8357c; i5++) {
                        int iQ2 = bVar.q();
                        this.f8360f[i5] = iQ2;
                        this.f8359e += iQ2;
                    }
                    return true;
                }
            } else if (!z2) {
                throw o0.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    public boolean b(s2.j jVar, boolean z2) throws D, EOFException {
        boolean zC;
        boolean zC2;
        this.f8355a = 0;
        this.f8356b = 0L;
        this.f8357c = 0;
        this.f8358d = 0;
        this.f8359e = 0;
        o oVar = (o) this.f8361g;
        oVar.D(27);
        try {
            zC = jVar.c(oVar.f9702a, 0, 27, z2);
        } catch (EOFException e7) {
            if (!z2) {
                throw e7;
            }
            zC = false;
        }
        if (zC && oVar.w() == 1332176723) {
            if (oVar.u() == 0) {
                this.f8355a = oVar.u();
                this.f8356b = oVar.k();
                oVar.l();
                oVar.l();
                oVar.l();
                int iU = oVar.u();
                this.f8357c = iU;
                this.f8358d = iU + 27;
                oVar.D(iU);
                try {
                    zC2 = jVar.c(oVar.f9702a, 0, this.f8357c, z2);
                } catch (EOFException e10) {
                    if (!z2) {
                        throw e10;
                    }
                    zC2 = false;
                }
                if (zC2) {
                    for (int i5 = 0; i5 < this.f8357c; i5++) {
                        int iU2 = oVar.u();
                        this.f8360f[i5] = iU2;
                        this.f8359e += iU2;
                    }
                    return true;
                }
            } else if (!z2) {
                throw D.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r13 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r12.f5646d >= r13) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        r0 = java.lang.Math.min(r12.f5649g, 1);
        r12.o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r6 = r12.f5643a;
        r5 = r12;
        r0 = r5.n(r6, 0, java.lang.Math.min(1, r6.length), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r0 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r5.f5646d += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r0 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(J5.h r12, long r13) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r11 = this;
            long r0 = r12.f5646d
            long r2 = r12.g()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            u6.AbstractC4256a.e(r0)
            java.lang.Object r0 = r11.f8361g
            Y4.b r0 = (Y4.b) r0
            r3 = 4
            r0.x(r3)
        L1a:
            r4 = -1
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L29
            long r5 = r12.f5646d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 >= 0) goto L48
        L29:
            byte[] r5 = r0.f16679a
            boolean r5 = r12.c(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L30
            goto L31
        L30:
            r5 = r1
        L31:
            if (r5 == 0) goto L48
            r0.A(r1)
            long r4 = r0.r()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L44
            r12.f5648f = r1
            return r2
        L44:
            r12.j(r2)
            goto L1a
        L48:
            if (r4 == 0) goto L50
            long r5 = r12.f5646d
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 >= 0) goto L7a
        L50:
            int r0 = r12.f5649g
            int r0 = java.lang.Math.min(r0, r2)
            r12.o(r0)
            if (r0 != 0) goto L6b
            byte[] r6 = r12.f5643a
            int r0 = r6.length
            int r8 = java.lang.Math.min(r2, r0)
            r10 = 1
            r7 = 0
            r9 = 0
            r5 = r12
            int r0 = r5.n(r6, r7, r8, r9, r10)
            goto L6c
        L6b:
            r5 = r12
        L6c:
            r12 = -1
            if (r0 == r12) goto L75
            long r6 = r5.f5646d
            long r8 = (long) r0
            long r6 = r6 + r8
            r5.f5646d = r6
        L75:
            r12 = -1
            if (r0 == r12) goto L7a
            r12 = r5
            goto L48
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.f.c(J5.h, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r10.f44898d >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r10.q(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(s2.j r10, long r11) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            long r0 = r10.f44898d
            long r2 = r10.g()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            Q1.k.c(r0)
            java.lang.Object r0 = r9.f8361g
            Q1.o r0 = (Q1.o) r0
            r3 = 4
            r0.D(r3)
        L1a:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L29
            long r5 = r10.f44898d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L48
        L29:
            byte[] r5 = r0.f9702a
            boolean r5 = r10.c(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L30
            goto L31
        L30:
            r5 = r1
        L31:
            if (r5 == 0) goto L48
            r0.G(r1)
            long r4 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L44
            r10.f44900f = r1
            return r2
        L44:
            r10.j(r2)
            goto L1a
        L48:
            if (r4 == 0) goto L50
            long r5 = r10.f44898d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L58
        L50:
            int r0 = r10.q(r2)
            r3 = -1
            if (r0 == r3) goto L58
            goto L48
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.f.d(s2.j, long):boolean");
    }
}
