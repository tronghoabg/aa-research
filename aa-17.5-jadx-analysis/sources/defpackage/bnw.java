package defpackage;

/* loaded from: classes2.dex */
public final class bnw {
    public float a = 6.0f;
    public float b = 6.0f;
    public float c = 8.0f;
    public float d = 6.0f;
    public final adu e = new adu(new dlj(6.0f), agm.c, null, "Animatable");
    private asd f;
    private asd g;

    private final float c(asd asdVar) {
        return asdVar instanceof asi ? this.b : asdVar instanceof asa ? this.c : asdVar instanceof ary ? this.d : this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [afak, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.asd r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bnu
            if (r0 == 0) goto L13
            r0 = r7
            bnu r0 = (defpackage.bnu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bnu r0 = new bnu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r7)     // Catch: java.lang.Throwable -> L29
            goto L59
        L29:
            r7 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.woy.dF(r7)
            float r7 = r5.c(r6)
            r5.g = r6
            adu r2 = r5.e     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r2.c()     // Catch: java.lang.Throwable -> L29
            dlj r4 = (defpackage.dlj) r4     // Catch: java.lang.Throwable -> L29
            float r4 = r4.a     // Catch: java.lang.Throwable -> L29
            boolean r4 = defpackage.dlj.c(r4, r7)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L59
            asd r4 = r5.f     // Catch: java.lang.Throwable -> L29
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = defpackage.bsv.a(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L59
            return r1
        L59:
            r5.f = r6
            afak r5 = defpackage.afak.a
            return r5
        L5e:
            r5.f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnw.a(asd, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.afck r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bnv
            if (r0 == 0) goto L13
            r0 = r6
            bnv r0 = (defpackage.bnv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bnv r0 = new bnv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.woy.dF(r6)
            asd r6 = r5.g
            float r6 = r5.c(r6)
            adu r2 = r5.e
            java.lang.Object r4 = r2.c()
            dlj r4 = (defpackage.dlj) r4
            float r4 = r4.a
            boolean r4 = defpackage.dlj.c(r4, r6)
            if (r4 != 0) goto L62
            dlj r4 = new dlj     // Catch: java.lang.Throwable -> L27
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L58
            return r1
        L58:
            asd r6 = r5.g
            r5.f = r6
            goto L62
        L5d:
            asd r0 = r5.g
            r5.f = r0
            throw r6
        L62:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnw.b(afck):java.lang.Object");
    }
}
