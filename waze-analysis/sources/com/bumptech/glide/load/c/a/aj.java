package com.bumptech.glide.load.c.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final d f3304a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3305b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3306c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3307d;

    public aj(boolean z, com.bumptech.glide.load.a.a.j jVar, boolean z2) {
        this.f3305b = z;
        this.f3307d = jVar;
        this.f3306c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r0.c(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    @Override // com.bumptech.glide.load.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.a.aw a(java.lang.Object r12, int r13, int r14, com.bumptech.glide.load.s r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r11.f3306c
            java.io.InputStream r12 = (java.io.InputStream) r12
            if (r0 == 0) goto L8d
            com.bumptech.glide.load.a.a.j r0 = r11.f3307d
            if (r0 == 0) goto L8d
            boolean r1 = r11.f3305b
            int r2 = com.bumptech.glide.g.c.f2893a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = r3
        L15:
            r5 = 0
            java.lang.Class<byte[]> r6 = byte[].class
            r7 = 16384(0x4000, float:2.2959E-41)
            java.lang.Object r6 = r0.a(r7, r6)     // Catch: java.lang.Throwable -> L71
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L71
            r8 = r3
        L21:
            if (r8 >= r7) goto L33
            int r9 = 16384 - r8
            int r9 = r12.read(r6, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r10 = -1
            if (r9 != r10) goto L2d
            goto L33
        L2d:
            int r8 = r8 + r9
            goto L21
        L2f:
            r11 = move-exception
            r12 = r3
            r5 = r6
            goto L73
        L33:
            if (r8 != 0) goto L39
            r0.c(r6)     // Catch: java.lang.Throwable -> L2f
            goto L3f
        L39:
            r2.add(r6)     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r8
            if (r8 >= r7) goto L15
        L3f:
            if (r1 == 0) goto L46
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r4)     // Catch: java.lang.Throwable -> L71
            goto L4a
        L46:
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch: java.lang.Throwable -> L71
        L4a:
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L71
        L4e:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L66
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L71
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L71
            int r8 = java.lang.Math.min(r4, r7)     // Catch: java.lang.Throwable -> L71
            r12.put(r6, r3, r8)     // Catch: java.lang.Throwable -> L71
            int r4 = r4 - r8
            r0.c(r6)     // Catch: java.lang.Throwable -> L71
            goto L4e
        L66:
            r2.clear()     // Catch: java.lang.Throwable -> L71
            java.nio.ByteBuffer r12 = com.bumptech.glide.g.c.c(r12)     // Catch: java.lang.Throwable -> L6e
            goto L93
        L6e:
            r11 = move-exception
            r12 = 1
            goto L73
        L71:
            r11 = move-exception
            r12 = r3
        L73:
            if (r12 != 0) goto L8c
            if (r5 == 0) goto L7a
            r0.c(r5)
        L7a:
            int r12 = r2.size()
        L7e:
            if (r3 >= r12) goto L8c
            java.lang.Object r13 = r2.get(r3)
            byte[] r13 = (byte[]) r13
            r0.c(r13)
            int r3 = r3 + 1
            goto L7e
        L8c:
            throw r11
        L8d:
            boolean r0 = r11.f3305b
            java.nio.ByteBuffer r12 = com.bumptech.glide.g.c.b(r12, r0)
        L93:
            com.bumptech.glide.load.c.a.d r11 = r11.f3304a
            android.graphics.ImageDecoder$Source r12 = com.waze.sound.fl$$ExternalSyntheticApiModelOutline0.m(r12)
            com.bumptech.glide.load.a.aw r11 = r11.c(r12, r13, r14, r15)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.c.a.aj.a(java.lang.Object, int, int, com.bumptech.glide.load.s):com.bumptech.glide.load.a.aw");
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        return true;
    }
}
