package L4;

/* renamed from: L4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710b implements B4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final B4.f f6891b = B4.f.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c, reason: collision with root package name */
    public static final B4.f f6892c = new B4.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, B4.f.f1584e);

    /* renamed from: a, reason: collision with root package name */
    public final F4.f f6893a;

    public C0710b(F4.f fVar) {
        this.f6893a = fVar;
    }

    @Override // B4.j
    public final int e(B4.g gVar) {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    @Override // B4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r9, java.io.File r10, B4.g r11) throws java.lang.Throwable {
        /*
            r8 = this;
            E4.B r9 = (E4.B) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            B4.f r1 = L4.C0710b.f6892c
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = Y4.i.f16694b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            B4.f r5 = L4.C0710b.f6891b
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            F4.f r10 = r8.f6893a
            C4.c r6 = new C4.c     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r6.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r6.close()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L52
            goto L52
        L4f:
            r9 = move-exception
            goto Lc1
        L52:
            r10 = 1
            goto L72
        L54:
            r9 = move-exception
            goto Lbb
        L56:
            r10 = move-exception
            goto L60
        L58:
            r6 = r7
            goto Lbb
        L5a:
            r6 = r7
            goto L60
        L5c:
            r9 = move-exception
            goto L58
        L5e:
            r10 = move-exception
            goto L5a
        L60:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L6c
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L54
        L6c:
            if (r6 == 0) goto L71
            r6.close()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L71
        L71:
            r10 = 0
        L72:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lba
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = Y4.m.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = Y4.i.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lba:
            return r10
        Lbb:
            if (r6 == 0) goto Lc2
            r6.close()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> Lc2
            goto Lc2
        Lc1:
            throw r9
        Lc2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.C0710b.g(java.lang.Object, java.io.File, B4.g):boolean");
    }
}
