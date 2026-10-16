package defpackage;

/* loaded from: classes2.dex */
public final class dyr implements dyn {
    public static final /* synthetic */ afia[] a = {new affh(dyr.class, "isSupported", "isSupported()Z", 0)};
    public static final String b = "dyr";
    public final aitx c;
    public final afeg d;
    public final afeg e;
    public final afgm f = new afgj();
    private dyf g;

    public dyr(aitx aitxVar, afeg afegVar, afeg afegVar2) {
        this.c = aitxVar;
        this.d = afegVar;
        this.e = afegVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dyn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dyq
            if (r0 == 0) goto L13
            r0 = r6
            dyq r0 = (defpackage.dyq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dyq r0 = new dyq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r5 = r0.a
            defpackage.woy.dF(r6)
            goto L5c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.woy.dF(r6)
            dyf r6 = r4.g
            if (r6 != 0) goto L45
            java.lang.String r4 = defpackage.dyr.b
            java.lang.String r5 = "requestLocalCallSilenceState: remoteActions are null"
            android.util.Log.i(r4, r5)
            dwo r4 = new dwo
            r4.<init>(r3)
            return r4
        L45:
            dwu r6 = new dwu
            r6.<init>()
            dyf r4 = r4.g
            if (r4 == 0) goto L51
            r4.a(r5, r6)
        L51:
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            dsq r6 = (defpackage.dsq) r6
            java.lang.String r4 = defpackage.dyr.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestLocalCallSilenceState: isSilenced= "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = ", result="
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            android.util.Log.i(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyr.a(boolean, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(androidx.core.telecom.extensions.Capability r9, defpackage.dyv r10, defpackage.afck r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.dyp
            if (r0 == 0) goto L13
            r0 = r11
            dyp r0 = (defpackage.dyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dyp r0 = new dyp
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dyr r8 = r0.d
            defpackage.woy.dF(r11)
            goto L7d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.woy.dF(r11)
            if (r9 == 0) goto L84
            if (r10 != 0) goto L39
            goto L84
        L39:
            r8.c(r3)
            java.lang.String r11 = defpackage.dyr.b
            java.lang.String r2 = "onExchangeComplete: isSupported=[true]"
            android.util.Log.i(r11, r2)
            r0.d = r8
            r0.c = r3
            aitg r11 = new aitg
            afck r2 = defpackage.affa.s(r0)
            r11.<init>(r2, r3)
            r11.z()
            dyh r2 = new dyh
            dmz r3 = new dmz
            r4 = 5
            r3.<init>(r8, r4)
            dmz r5 = new dmz
            r6 = 6
            r5.<init>(r8, r6)
            dah r6 = new dah
            r7 = 0
            r6.<init>(r8, r11, r4, r7)
            r2.<init>(r3, r5, r6)
            int r3 = r9.b
            int[] r9 = r9.c
            r10.b(r3, r9, r2)
            java.lang.Object r11 = r11.k()
            if (r11 != r1) goto L7a
            r0.getClass()
        L7a:
            if (r11 != r1) goto L7d
            return r1
        L7d:
            dyf r11 = (defpackage.dyf) r11
            r8.g = r11
            afak r8 = defpackage.afak.a
            return r8
        L84:
            java.lang.String r9 = defpackage.dyr.b
            java.lang.String r10 = "onNegotiated: remote is not capable"
            android.util.Log.i(r9, r10)
            r9 = 0
            r8.c(r9)
            afak r8 = defpackage.afak.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyr.b(androidx.core.telecom.extensions.Capability, dyv, afck):java.lang.Object");
    }

    public final void c(boolean z) {
        this.f.setValue(this, a[0], Boolean.valueOf(z));
    }
}
