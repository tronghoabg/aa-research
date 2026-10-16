package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
final class mnm extends afde implements afeg {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnm(Context context, String str, String str2, int i, afck afckVar) {
        super(2, afckVar);
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new mnm(this.a, this.b, this.c, this.d, afckVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            defpackage.woy.dF(r8)
            mnn r8 = defpackage.mnn.a
            android.content.Context r8 = r7.a
            java.lang.String r0 = r7.b
            java.io.File r8 = defpackage.mnn.c(r8, r0)
            if (r8 == 0) goto Le9
            r1 = 0
            yph r2 = defpackage.mnn.b     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            yop r2 = r2.l()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r3 = "Writing status report under directory %s"
            r2.y(r3, r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            j$.time.Instant r0 = j$.time.Instant.now()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r0.getClass()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            j$.time.ZoneId r2 = j$.time.ZoneId.systemDefault()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            j$.time.ZonedDateTime r0 = r0.atZone(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            j$.time.LocalDateTime r0 = r0.toLocalDateTime()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r0.getClass()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r3 = 0
            r4 = r3
        L3b:
            if (r4 >= r2) goto L4f
            char r5 = r0.charAt(r4)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r6 = 46
            if (r5 == r6) goto L48
            int r4 = r4 + 1
            goto L3b
        L48:
            java.lang.String r0 = r0.substring(r3, r4)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r0.getClass()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
        L4f:
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r3.append(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r0 = "-"
            r3.append(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r3.append(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r2 = ".tmp"
            java.io.File r8 = java.io.File.createTempFile(r0, r2, r8)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r8.getClass()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r8 = r7.c     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            r0.write(r8)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            r0.close()
            goto L9f
        L7e:
            r7 = move-exception
            r1 = r0
            goto Le3
        L81:
            r8 = move-exception
            r1 = r0
            goto L87
        L84:
            r7 = move-exception
            goto Le3
        L86:
            r8 = move-exception
        L87:
            yph r0 = defpackage.mnn.b     // Catch: java.lang.Throwable -> L84
            yop r0 = r0.h()     // Catch: java.lang.Throwable -> L84
            ype r0 = (defpackage.ype) r0     // Catch: java.lang.Throwable -> L84
            yop r8 = r0.p(r8)     // Catch: java.lang.Throwable -> L84
            ype r8 = (defpackage.ype) r8     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "Failed to write status report to temp file"
            r8.u(r0)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L9f
            r1.close()
        L9f:
            android.content.Context r8 = r7.a
            java.lang.String r0 = r7.b
            int r7 = r7.d
            java.io.File[] r8 = defpackage.mnn.d(r8, r0)
            if (r8 != 0) goto Lac
            goto Le9
        Lac:
            int r0 = r8.length
            int r0 = r0 - r7
            if (r0 <= 0) goto Le9
            ail r7 = new ail
            r1 = 12
            r7.<init>(r1)
            java.util.List r7 = defpackage.woy.db(r8, r7)
            java.util.List r7 = defpackage.woy.cd(r7, r0)
            java.util.Iterator r7 = r7.iterator()
        Lc3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Le9
            java.lang.Object r8 = r7.next()
            java.io.File r8 = (java.io.File) r8
            boolean r0 = r8.delete()
            if (r0 != 0) goto Lc3
            yph r0 = defpackage.mnn.b
            yop r0 = r0.h()
            ype r0 = (defpackage.ype) r0
            java.lang.String r1 = "Failed to delete temp file %s"
            r0.y(r1, r8)
            goto Lc3
        Le3:
            if (r1 == 0) goto Le8
            r1.close()
        Le8:
            throw r7
        Le9:
            afak r7 = defpackage.afak.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnm.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((mnm) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
