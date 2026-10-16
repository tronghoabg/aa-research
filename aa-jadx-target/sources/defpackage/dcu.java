package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dcu extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ android.content.ContentResolver c;
    final /* synthetic */ android.net.Uri d;
    final /* synthetic */ defpackage.dcv e;
    final /* synthetic */ aiyk f;
    final /* synthetic */ android.content.Context g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcu(android.content.ContentResolver contentResolver, android.net.Uri uri, defpackage.dcv dcvVar, aiyk aiykVar, android.content.Context context, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = contentResolver;
        this.d = uri;
        this.e = dcvVar;
        this.f = aiykVar;
        this.g = context;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.dcu dcuVar = new defpackage.dcu(this.c, this.d, this.e, this.f, this.g, afdkVar);
        dcuVar.h = obj;
        return dcuVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[Catch: all -> 0x007e, PHI: r1 r3
  0x0034: PHI (r1v4 aizk) = (r1v2 aizk), (r1v3 aizk), (r1v8 aizk) binds: [B:13:0x002d, B:19:0x0071, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r3v3 java.lang.Object) = (r3v1 java.lang.Object), (r3v2 java.lang.Object), (r3v4 java.lang.Object) binds: [B:13:0x002d, B:19:0x0071, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x007e, blocks: (B:7:0x000f, B:14:0x0034, B:16:0x0043, B:18:0x004b, B:10:0x0017, B:13:0x002d), top: B:28:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[Catch: all -> 0x007e, PHI: r1 r3 r7
  0x0043: PHI (r1v3 aizk) = (r1v4 aizk), (r1v6 aizk) binds: [B:15:0x0041, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r3v2 java.lang.Object) = (r3v3 java.lang.Object), (r3v4 java.lang.Object) binds: [B:15:0x0041, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r7v6 java.lang.Object) = (r7v19 java.lang.Object), (r7v0 java.lang.Object) binds: [B:15:0x0041, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x007e, blocks: (B:7:0x000f, B:14:0x0034, B:16:0x0043, B:18:0x004b, B:10:0x0017, B:13:0x002d), top: B:28:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:7:0x000f, B:14:0x0034, B:16:0x0043, B:18:0x004b, B:10:0x0017, B:13:0x002d), top: B:28:0x0005 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0071 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r7) {
        /*
            r6 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1b
            java.lang.Object r3 = r6.a
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.h
            aizk r1 = (aizk) r1
            defpackage.afga.cz(r7)     // Catch: java.lang.Throwable -> L7e
            goto L34
        L13:
            java.lang.Object r1 = r6.h
            aizk r1 = (aizk) r1
            defpackage.afga.cz(r7)     // Catch: java.lang.Throwable -> L7e
            goto L43
        L1b:
            defpackage.afga.cz(r7)
            java.lang.Object r7 = r6.h
            r1 = r7
            aizk r1 = (aizk) r1
            android.content.ContentResolver r7 = r6.c
            android.net.Uri r3 = r6.d
            r4 = 0
            dcv r5 = r6.e
            r7.registerContentObserver(r3, r4, r5)
            aiyk r7 = r6.f     // Catch: java.lang.Throwable -> L7e
            aixy r7 = r7.A()     // Catch: java.lang.Throwable -> L7e
            r3 = r7
        L34:
            r6.h = r1     // Catch: java.lang.Throwable -> L7e
            r6.a = r3     // Catch: java.lang.Throwable -> L7e
            r6.b = r2     // Catch: java.lang.Throwable -> L7e
            r7 = r3
            aixy r7 = (aixy) r7     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L7e
            if (r7 == r0) goto L80
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L7e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r7 == 0) goto L74
            r7 = r3
            aixy r7 = (aixy) r7     // Catch: java.lang.Throwable -> L7e
            r7.b()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r7 = r6.g     // Catch: java.lang.Throwable -> L7e
            aau r4 = defpackage.dcw.a     // Catch: java.lang.Throwable -> L7e
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r7 = android.provider.Settings.Global.getFloat(r7, r4, r5)     // Catch: java.lang.Throwable -> L7e
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L7e
            r6.h = r1     // Catch: java.lang.Throwable -> L7e
            r6.a = r3     // Catch: java.lang.Throwable -> L7e
            r7 = 2
            r6.b = r7     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r7 = r1.a(r4, r6)     // Catch: java.lang.Throwable -> L7e
            if (r7 != r0) goto L34
            goto L80
        L74:
            android.content.ContentResolver r7 = r6.c
            dcv r6 = r6.e
            r7.unregisterContentObserver(r6)
            afbk r6 = defpackage.afbk.a
            return r6
        L7e:
            r7 = move-exception
            goto L81
        L80:
            return r0
        L81:
            android.content.ContentResolver r0 = r6.c
            dcv r6 = r6.e
            r0.unregisterContentObserver(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcu.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.dcu) b((aizk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
