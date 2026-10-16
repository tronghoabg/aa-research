package com.bumptech.glide.load.c.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements com.bumptech.glide.load.v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.bumptech.glide.load.r f3342a = com.bumptech.glide.load.r.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.r f3343b = com.bumptech.glide.load.r.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3344c;

    public c(com.bumptech.glide.load.a.a.j jVar) {
        this.f3344c = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.bumptech.glide.load.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object r9, java.io.File r10, com.bumptech.glide.load.s r11) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            com.bumptech.glide.load.a.aw r9 = (com.bumptech.glide.load.a.aw) r9
            java.lang.Object r9 = r9.c()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            com.bumptech.glide.load.r r2 = com.bumptech.glide.load.c.a.c.f3343b
            java.lang.Object r2 = r11.b(r2)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 != 0) goto L21
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1f
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L21
        L1f:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L21:
            r9.getWidth()
            r9.getHeight()
            int r3 = com.bumptech.glide.g.k.f2906a
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            com.bumptech.glide.load.r r5 = com.bumptech.glide.load.c.a.c.f3342a
            java.lang.Object r5 = r11.b(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            com.bumptech.glide.load.a.a.j r8 = r8.f3344c     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            if (r8 == 0) goto L4a
            com.bumptech.glide.load.data.c r10 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            r10.<init>(r7, r8)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            r6 = r10
            goto L4b
        L4a:
            r6 = r7
        L4b:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r6.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r8 = 1
            r6.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Lc8
            goto L71
        L56:
            r8 = move-exception
            goto Lc2
        L58:
            r8 = move-exception
            goto L5f
        L5a:
            r8 = move-exception
            r6 = r7
            goto Lc2
        L5d:
            r8 = move-exception
            r6 = r7
        L5f:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> L56
            if (r10 == 0) goto L6b
            java.lang.String r10 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r10, r8)     // Catch: java.lang.Throwable -> L56
        L6b:
            r8 = 0
            if (r6 == 0) goto L71
            r6.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Lc8
        L71:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)
            if (r10 == 0) goto Lc1
            java.lang.String r10 = java.lang.String.valueOf(r2)
            int r2 = com.bumptech.glide.g.r.a(r9)
            double r3 = com.bumptech.glide.g.k.a(r3)
            com.bumptech.glide.load.r r5 = com.bumptech.glide.load.c.a.c.f3343b
            java.lang.Object r11 = r11.b(r5)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            boolean r9 = r9.hasAlpha()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r10)
            java.lang.String r10 = " of size "
            r5.append(r10)
            r5.append(r2)
            java.lang.String r10 = " in "
            r5.append(r10)
            r5.append(r3)
            java.lang.String r10 = ", options format: "
            r5.append(r10)
            r5.append(r11)
            java.lang.String r10 = ", hasAlpha: "
            r5.append(r10)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lc1:
            return r8
        Lc2:
            if (r6 == 0) goto Lca
            r6.close()     // Catch: java.lang.Throwable -> Lc8 java.io.IOException -> Lca
            goto Lca
        Lc8:
            r8 = move-exception
            throw r8
        Lca:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.c.a.c.a(java.lang.Object, java.io.File, com.bumptech.glide.load.s):boolean");
    }

    @Override // com.bumptech.glide.load.v
    public final int b() {
        return 2;
    }
}
