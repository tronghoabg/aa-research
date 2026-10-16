package defpackage;

/* loaded from: classes2.dex */
public final class ajcb {
    public static final ajcz a = new ajcz("UNDEFINED");
    public static final ajcz b = new ajcz("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x00a1, DONT_GENERATE, TryCatch #0 {all -> 0x00a1, blocks: (B:19:0x0045, B:21:0x0053, B:23:0x0059, B:34:0x008a, B:24:0x0066, B:26:0x0076, B:31:0x0081, B:33:0x0087, B:40:0x0097, B:43:0x00a0, B:42:0x009d, B:29:0x007c), top: B:56:0x0045, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.afck r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof defpackage.ajca
            if (r0 == 0) goto Lb5
            ajca r6 = (defpackage.ajca) r6
            java.lang.Object r0 = defpackage.ahng.b(r7)
            aitu r1 = r6.a
            afco r2 = r6.hH()
            boolean r1 = r1.eQ(r2)     // Catch: java.lang.Throwable -> Lae
            r2 = 1
            if (r1 == 0) goto L2c
            r6.c = r0
            r6.e = r2
            aitu r7 = r6.a
            afco r0 = r6.hH()
            r7.a(r0, r6)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r6 = move-exception
            aiui r1 = new aiui
            r1.<init>(r6, r7, r0)
            throw r1
        L2c:
            boolean r1 = defpackage.aitz.a
            java.lang.ThreadLocal r1 = defpackage.aiwj.a
            aius r1 = defpackage.aiwj.a()
            boolean r3 = r1.p()
            if (r3 == 0) goto L42
            r6.c = r0
            r6.e = r2
            r1.n(r6)
            return
        L42:
            r1.o(r2)
            afco r0 = r6.hH()     // Catch: java.lang.Throwable -> La1
            bwi r3 = defpackage.aivh.d     // Catch: java.lang.Throwable -> La1
            afcm r0 = r0.get(r3)     // Catch: java.lang.Throwable -> La1
            aivh r0 = (defpackage.aivh) r0     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L66
            boolean r3 = r0.t()     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L66
            java.util.concurrent.CancellationException r7 = r0.o()     // Catch: java.lang.Throwable -> La1
            aezv r0 = new aezv     // Catch: java.lang.Throwable -> La1
            r0.<init>(r7)     // Catch: java.lang.Throwable -> La1
            r6.w(r0)     // Catch: java.lang.Throwable -> La1
            goto L8a
        L66:
            afck r0 = r6.b     // Catch: java.lang.Throwable -> La1
            java.lang.Object r3 = r6.d     // Catch: java.lang.Throwable -> La1
            afco r4 = r0.hH()     // Catch: java.lang.Throwable -> La1
            java.lang.Object r3 = defpackage.ajdb.b(r4, r3)     // Catch: java.lang.Throwable -> La1
            ajcz r5 = defpackage.ajdb.a     // Catch: java.lang.Throwable -> La1
            if (r3 == r5) goto L7b
            aiwp r5 = defpackage.aits.c(r0, r4, r3)     // Catch: java.lang.Throwable -> La1
            goto L7c
        L7b:
            r5 = 0
        L7c:
            r0.w(r7)     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L87
            boolean r7 = r5.S()     // Catch: java.lang.Throwable -> La1
            if (r7 == 0) goto L8a
        L87:
            defpackage.ajdb.c(r4, r3)     // Catch: java.lang.Throwable -> La1
        L8a:
            boolean r7 = r1.r()     // Catch: java.lang.Throwable -> La1
            if (r7 != 0) goto L8a
            r1.m(r2)
            return
        L94:
            r7 = move-exception
            if (r5 == 0) goto L9d
            boolean r0 = r5.S()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto La0
        L9d:
            defpackage.ajdb.c(r4, r3)     // Catch: java.lang.Throwable -> La1
        La0:
            throw r7     // Catch: java.lang.Throwable -> La1
        La1:
            r7 = move-exception
            r6.H(r7)     // Catch: java.lang.Throwable -> La9
            r1.m(r2)
            return
        La9:
            r6 = move-exception
            r1.m(r2)
            throw r6
        Lae:
            r6 = move-exception
            aiui r7 = new aiui
            r7.<init>(r6, r1, r2)
            throw r7
        Lb5:
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcb.a(afck, java.lang.Object):void");
    }

    public static final void b(aitu aituVar, afco afcoVar, Runnable runnable) throws aiui {
        try {
            aituVar.a(afcoVar, runnable);
        } catch (Throwable th) {
            throw new aiui(th, aituVar, afcoVar);
        }
    }

    public static final boolean c(aitu aituVar, afco afcoVar) throws aiui {
        try {
            return aituVar.eQ(afcoVar);
        } catch (Throwable th) {
            throw new aiui(th, aituVar, afcoVar);
        }
    }
}
