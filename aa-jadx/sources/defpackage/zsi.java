package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsi {
    private static volatile defpackage.zsi d;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public zsi(android.content.Context context) {
        this.a = defpackage.ysr.aQ(new defpackage.xew(context, 2));
        this.b = defpackage.ysr.aQ(new defpackage.xew(this, 3));
        this.c = defpackage.ysr.aQ(new defpackage.xew(this, 4));
    }

    public static defpackage.zsi a(android.content.Context context) {
        if (d == null) {
            synchronized (defpackage.zsi.class) {
                if (d == null) {
                    d = new defpackage.zsi(context);
                }
            }
        }
        return d;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008e */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, zqf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void d(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.Object r0 = r10.a     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.contains(r11)     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto Lbd
            java.lang.Object r0 = r10.b     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            r1 = 0
            r2 = 1
            zpy r0 = (defpackage.zpy) r0     // Catch: java.io.IOException -> L18 java.io.FileNotFoundException -> L29 java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            android.content.res.AssetManager r0 = r0.b     // Catch: java.io.IOException -> L18 java.io.FileNotFoundException -> L29 java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            r3 = 3
            java.io.InputStream r0 = r0.open(r11, r3)     // Catch: java.io.IOException -> L18 java.io.FileNotFoundException -> L29 java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
        L16:
            r1 = r0
            goto L40
        L18:
            r0 = move-exception
            zpz r3 = new zpz     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.lang.String r4 = "Error while opening %s: "
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            r2[r1] = r11     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.lang.String r1 = java.lang.String.format(r4, r2)     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            r3.<init>(r1, r0)     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            throw r3     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
        L29:
            java.util.logging.Logger r0 = defpackage.zpy.a     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.lang.String r4 = "com.google.i18n.phonenumbers.metadata.init.AndroidAssetMetadataLoader"
            java.lang.String r5 = "loadMetadata"
            java.lang.String r6 = "File %s not found"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            r7[r1] = r11     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.lang.String r1 = java.lang.String.format(r6, r7)     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            r0.logp(r3, r4, r5, r1)     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            r0 = 0
            goto L16
        L40:
            if (r1 != 0) goto L45
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            goto L71
        L45:
            abol r0 = defpackage.abol.a()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            zpl r3 = defpackage.zpl.a     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            abox r0 = defpackage.abox.z(r3, r1, r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            zpl r0 = (defpackage.zpl) r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            abpj r3 = r0.b     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r0 = r0 ^ r2
            java.lang.String r2 = "Empty metadata"
            defpackage.ysr.aY(r0, r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
            r1.close()     // Catch: java.io.IOException -> L61 java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            goto L70
        L61:
            r0 = move-exception
            r9 = r0
            java.util.logging.Logger r4 = defpackage.zqa.a     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.lang.String r6 = "com.google.i18n.phonenumbers.metadata.init.MetadataParser"
            java.lang.String r7 = "parse"
            java.lang.String r8 = "Error closing input stream (ignored)"
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
        L70:
            r0 = r3
        L71:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lbf
        L75:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lbf
            zpk r1 = (defpackage.zpk) r1     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> Lbf
            r2.a(r1)     // Catch: java.lang.Throwable -> Lbf
            goto L75
        L87:
            java.lang.Object r0 = r10.a     // Catch: java.lang.Throwable -> Lbf
            r0.add(r11)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r10)
            return
        L8e:
            r0 = move-exception
            r2 = r0
            goto L9a
        L91:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "Unable to parse metadata file"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L8e
            throw r2     // Catch: java.lang.Throwable -> L8e
        L9a:
            r1.close()     // Catch: java.io.IOException -> L9e java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            goto Lad
        L9e:
            r0 = move-exception
            r8 = r0
            java.util.logging.Logger r3 = defpackage.zqa.a     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
            java.lang.String r5 = "com.google.i18n.phonenumbers.metadata.init.MetadataParser"
            java.lang.String r6 = "parse"
            java.lang.String r7 = "Error closing input stream (ignored)"
            r3.logp(r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
        Lad:
            throw r2     // Catch: java.lang.IllegalStateException -> Lae java.lang.IllegalArgumentException -> Lb0 java.lang.Throwable -> Lbf
        Lae:
            r0 = move-exception
            goto Lb1
        Lb0:
            r0 = move-exception
        Lb1:
            java.lang.String r1 = "Failed to read file "
            java.lang.String r11 = r1.concat(r11)     // Catch: java.lang.Throwable -> Lbf
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbf
            r1.<init>(r11, r0)     // Catch: java.lang.Throwable -> Lbf
            throw r1     // Catch: java.lang.Throwable -> Lbf
        Lbd:
            monitor-exit(r10)
            return
        Lbf:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lbf
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsi.d(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xzi] */
    public final j$.util.Optional b() {
        return j$.util.Optional.ofNullable((java.lang.Integer) this.b.fF());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zqf] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.zqf c(java.lang.String str) {
        if (!this.a.contains(str)) {
            d(str);
        }
        return this.c;
    }

    public zsi(defpackage.zpd zpdVar, defpackage.zqf zqfVar) {
        this.b = zpdVar;
        this.c = zqfVar;
        this.a = defpackage.ysr.t();
    }

    public zsi(byte[] bArr, defpackage.abgr abgrVar) {
        this.c = abgrVar;
        this.b = bArr;
        this.a = new java.lang.String[abgrVar.b];
    }

    public zsi(defpackage.gka gkaVar, defpackage.aach aachVar, defpackage.zyk zykVar) {
        this.b = gkaVar;
        this.c = aachVar;
        this.a = zykVar;
    }
}
