package defpackage;

/* loaded from: classes.dex */
public final class lzf {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.ParkedNativeAppCheck");

    public static final boolean a(qrn qrnVar) {
        qrnVar.getClass();
        return b(qrnVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(defpackage.qrn r7, boolean r8) {
        /*
            r7.getClass()
            wci r0 = new wci
            yzz r2 = defpackage.yzz.PARKED_APP
            yzy r3 = defpackage.yzy.LJ
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r1 = "cradle_features"
            java.lang.String r4 = "Could not check car module feature"
            r0.<init>(r1, r2, r3, r4, r5)
            lkd r1 = new lkd
            r2 = 14
            r1.<init>(r7, r2)
            java.lang.Object r0 = defpackage.khc.t(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            yph r1 = defpackage.lzf.b
            yop r2 = r1.l()
            java.lang.String r3 = "hasNativeAppsModule: %b checkCarCompatibility: %b"
            r2.Q(r3, r0, r8)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r2 < r3) goto Lcc
            if (r0 == 0) goto Lcc
            r2 = 1
            if (r8 == 0) goto Lcb
            kio r8 = defpackage.kio.b()
            boolean r8 = r8.r()
            if (r8 != 0) goto L4f
            yop r7 = r1.l()
            java.lang.String r8 = "Car not connected"
            r7.u(r8)
            goto Lcb
        L4f:
            mki r8 = defpackage.mki.a     // Catch: defpackage.qrz -> Lb8
            r8.f()     // Catch: defpackage.qrz -> Lb8
            com.google.android.gms.car.CarInfo r7 = defpackage.oni.d(r7)     // Catch: defpackage.qrz -> Lb8
            if (r7 != 0) goto L65
            yop r7 = r1.l()
            java.lang.String r8 = "CarInfo is null"
            r7.u(r8)
            goto Lcb
        L65:
            abrh r8 = defpackage.acpf.f()
            yph r0 = defpackage.kjf.a
            int r0 = r8.c
            int r0 = defpackage.a.as(r0)
            if (r0 != 0) goto L74
            r0 = r2
        L74:
            int r0 = r0 + (-1)
            if (r0 == r2) goto La1
            r3 = 4
            if (r0 == r3) goto L9f
            r3 = 5
            if (r0 == r3) goto L98
            r3 = 6
            if (r0 == r3) goto L8f
            yph r7 = defpackage.kjf.a
            yop r7 = r7.g()
            java.lang.String r8 = "Undefined filter mode %d"
            r3 = 3186(0xc72, float:4.465E-42)
            defpackage.a.bO(r7, r8, r0, r3)
            goto La1
        L8f:
            aboh r8 = r8.d
            boolean r7 = defpackage.kjf.i(r7, r8)
            if (r7 != 0) goto La1
            goto L9f
        L98:
            aboh r8 = r8.d
            boolean r7 = defpackage.kjf.i(r7, r8)
            goto La2
        L9f:
            r7 = r2
            goto La2
        La1:
            r7 = r6
        La2:
            nrd r8 = defpackage.nrd.a()
            boolean r8 = r8.e()
            yop r0 = r1.l()
            java.lang.String r1 = "Car allowed: %b Has touch: %b"
            r0.Q(r1, r7, r8)
            if (r7 == 0) goto Lb7
            if (r8 != 0) goto Lcb
        Lb7:
            return r6
        Lb8:
            r0 = move-exception
            r7 = r0
            yph r8 = defpackage.lzf.b
            yop r8 = r8.l()
            yop r7 = r8.p(r7)
            ype r7 = (defpackage.ype) r7
            java.lang.String r8 = "CarNotConnectedException"
            r7.u(r8)
        Lcb:
            return r2
        Lcc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzf.b(qrn, boolean):boolean");
    }

    public static final boolean c() {
        kio kioVarB = kio.b();
        if (!kioVarB.q()) {
            ((ype) b.h()).u("Client not connected");
            return false;
        }
        qrn qrnVarE = kioVarB.e();
        qrnVarE.getClass();
        return b(qrnVarE, true);
    }
}
