package defpackage;

import android.view.translation.ViewTranslationCallback;

/* loaded from: classes.dex */
final class dar implements ViewTranslationCallback {
    public static final dar a = new dar();

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onClearTranslation(android.view.View r15) {
        /*
            r14 = this;
            r15.getClass()
            czq r15 = (defpackage.czq) r15
            cgq r14 = r15.r
            r15 = 1
            r14.f = r15
            zh r14 = r14.h()
            java.lang.Object[] r0 = r14.c
            long[] r14 = r14.a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L72
            r2 = 0
            r3 = r2
        L19:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L6d
            int r6 = r3 - r1
            r7 = r2
        L2c:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L6b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L67
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r0[r8]
            hig r8 = (defpackage.hig) r8
            java.lang.Object r8 = r8.b
            ddu r8 = (defpackage.ddu) r8
            ddr r8 = r8.b
            deb r10 = defpackage.ddx.F
            java.lang.Object r10 = r8.g(r10)
            if (r10 == 0) goto L67
            deb r10 = defpackage.ddq.n
            java.lang.Object r8 = r8.g(r10)
            ddf r8 = (defpackage.ddf) r8
            if (r8 == 0) goto L67
            aezn r8 = r8.b
            afdr r8 = (defpackage.afdr) r8
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L67:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L2c
        L6b:
            if (r8 != r9) goto L72
        L6d:
            if (r3 == r1) goto L72
            int r3 = r3 + 1
            goto L19
        L72:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dar.onClearTranslation(android.view.View):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHideTranslation(android.view.View r15) {
        /*
            r14 = this;
            r15.getClass()
            czq r15 = (defpackage.czq) r15
            cgq r14 = r15.r
            r15 = 1
            r14.f = r15
            zh r14 = r14.h()
            java.lang.Object[] r0 = r14.c
            long[] r14 = r14.a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L7e
            r2 = 0
            r3 = r2
        L19:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L79
            int r6 = r3 - r1
            r7 = r2
        L2c:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L77
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L73
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r0[r8]
            hig r8 = (defpackage.hig) r8
            java.lang.Object r8 = r8.b
            ddu r8 = (defpackage.ddu) r8
            ddr r8 = r8.b
            deb r10 = defpackage.ddx.F
            java.lang.Object r10 = r8.g(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r15)
            boolean r10 = defpackage.affa.f(r10, r11)
            if (r10 == 0) goto L73
            deb r10 = defpackage.ddq.m
            java.lang.Object r8 = r8.g(r10)
            ddf r8 = (defpackage.ddf) r8
            if (r8 == 0) goto L73
            aezn r8 = r8.b
            afec r8 = (defpackage.afec) r8
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r8 = r8.invoke(r10)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L73:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L2c
        L77:
            if (r8 != r9) goto L7e
        L79:
            if (r3 == r1) goto L7e
            int r3 = r3 + 1
            goto L19
        L7e:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dar.onHideTranslation(android.view.View):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onShowTranslation(android.view.View r15) {
        /*
            r14 = this;
            r15.getClass()
            czq r15 = (defpackage.czq) r15
            cgq r14 = r15.r
            r15 = 2
            r14.f = r15
            zh r14 = r14.h()
            java.lang.Object[] r15 = r14.c
            long[] r14 = r14.a
            int r0 = r14.length
            int r0 = r0 + (-2)
            r1 = 1
            if (r0 < 0) goto L7f
            r2 = 0
            r3 = r2
        L1a:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L7a
            int r6 = r3 - r0
            r7 = r2
        L2d:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L78
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L74
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r15[r8]
            hig r8 = (defpackage.hig) r8
            java.lang.Object r8 = r8.b
            ddu r8 = (defpackage.ddu) r8
            ddr r8 = r8.b
            deb r10 = defpackage.ddx.F
            java.lang.Object r10 = r8.g(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            boolean r10 = defpackage.affa.f(r10, r11)
            if (r10 == 0) goto L74
            deb r10 = defpackage.ddq.m
            java.lang.Object r8 = r8.g(r10)
            ddf r8 = (defpackage.ddf) r8
            if (r8 == 0) goto L74
            aezn r8 = r8.b
            afec r8 = (defpackage.afec) r8
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r8 = r8.invoke(r10)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L74:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L2d
        L78:
            if (r8 != r9) goto L7f
        L7a:
            if (r3 == r0) goto L7f
            int r3 = r3 + 1
            goto L1a
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dar.onShowTranslation(android.view.View):boolean");
    }
}
