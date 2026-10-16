package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ctf implements ctq {
    final /* synthetic */ ctl a;
    final /* synthetic */ int b;
    final /* synthetic */ ctq c;
    private final /* synthetic */ ctq d;

    public ctf(ctq ctqVar, ctl ctlVar, int i, ctq ctqVar2) {
        this.a = ctlVar;
        this.b = i;
        this.c = ctqVar2;
        this.d = ctqVar;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.d.f();
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.d.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // defpackage.ctq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r16 = this;
            r0 = r16
            ctl r1 = r0.a
            int r2 = r0.b
            r1.e = r2
            ctq r0 = r0.c
            r0.h()
            aan r0 = r1.o
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L75
            r5 = 0
        L17:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L70
            int r8 = r5 - r3
            r9 = 0
        L2a:
            int r10 = ~r8
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            if (r9 >= r10) goto L6e
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r6
            r14 = 128(0x80, double:6.3E-322)
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 >= 0) goto L6a
            int r10 = r5 << 3
            int r10 = r10 + r9
            java.lang.Object[] r12 = r0.b
            r12 = r12[r10]
            java.lang.Object[] r13 = r0.c
            r13 = r13[r10]
            cvb r13 = (defpackage.cvb) r13
            byw r14 = r1.h
            int r15 = r14.a(r12)
            if (r15 < 0) goto L55
            int r4 = r1.e
            if (r15 < r4) goto L6a
        L55:
            if (r15 < 0) goto L5c
            java.lang.Object r4 = defpackage.cuy.b
            r14.d(r15, r4)
        L5c:
            aan r4 = r1.n
            boolean r4 = defpackage.aan.f(r4, r12)
            if (r4 == 0) goto L67
            r13.b()
        L67:
            r0.j(r10)
        L6a:
            long r6 = r6 >> r11
            int r9 = r9 + 1
            goto L2a
        L6e:
            if (r10 != r11) goto L75
        L70:
            if (r5 == r3) goto L75
            int r5 = r5 + 1
            goto L17
        L75:
            int r0 = r1.d
            r1.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctf.h():void");
    }

    @Override // defpackage.ctq
    public final void i() {
        this.d.i();
    }

    @Override // defpackage.ctq
    public final void j() {
        this.d.j();
    }
}
