package n2;

import k8.InterfaceC3202k;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3581d implements InterfaceC3202k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40814b;

    public /* synthetic */ C3581d(Object obj, int i5) {
        this.f40813a = i5;
        this.f40814b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x0017, B:11:0x001d, B:37:0x005e, B:39:0x0062, B:41:0x0066, B:46:0x006d, B:48:0x0071, B:50:0x0075, B:52:0x0079, B:54:0x0083, B:56:0x008f, B:59:0x009a), top: B:63:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = -1
            r3 = 1
            java.lang.Object r4 = r8.f40814b
            n2.o r4 = (n2.o) r4
            N1.n r9 = (N1.C0765n) r9
            java.lang.Object r5 = r4.f40886c
            monitor-enter(r5)
            n2.i r6 = r4.f40890g     // Catch: java.lang.Throwable -> L6b
            boolean r6 = r6.f40852v     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L99
            boolean r6 = r4.f40889f     // Catch: java.lang.Throwable -> L6b
            if (r6 != 0) goto L99
            int r6 = r9.f8210C     // Catch: java.lang.Throwable -> L6b
            if (r6 == r2) goto L99
            if (r6 <= r1) goto L99
            java.lang.String r6 = r9.f8232n     // Catch: java.lang.Throwable -> L6b
            if (r6 != 0) goto L23
        L21:
            r1 = r0
            goto L5a
        L23:
            int r7 = r6.hashCode()
            switch(r7) {
                case -2123537834: goto L4b;
                case 187078296: goto L40;
                case 187078297: goto L37;
                case 1504578661: goto L2c;
                default: goto L2a;
            }
        L2a:
            r1 = r2
            goto L55
        L2c:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L35
            goto L2a
        L35:
            r1 = 3
            goto L55
        L37:
            java.lang.String r7 = "audio/ac4"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L55
            goto L2a
        L40:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L49
            goto L2a
        L49:
            r1 = r3
            goto L55
        L4b:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L54
            goto L2a
        L54:
            r1 = r0
        L55:
            switch(r1) {
                case 0: goto L59;
                case 1: goto L59;
                case 2: goto L59;
                case 3: goto L59;
                default: goto L58;
            }
        L58:
            goto L21
        L59:
            r1 = r3
        L5a:
            r2 = 32
            if (r1 == 0) goto L6d
            int r1 = Q1.x.f9724a     // Catch: java.lang.Throwable -> L6b
            if (r1 < r2) goto L99
            A7.b0 r1 = r4.f40891h     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L99
            boolean r1 = r1.f812b     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L99
            goto L6d
        L6b:
            r9 = move-exception
            goto L9c
        L6d:
            int r1 = Q1.x.f9724a     // Catch: java.lang.Throwable -> L6b
            if (r1 < r2) goto L9a
            A7.b0 r1 = r4.f40891h     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9a
            boolean r2 = r1.f812b     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L9a
            java.lang.Object r1 = r1.f813c     // Catch: java.lang.Throwable -> L6b
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = G5.AbstractC0525f.k(r1)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9a
            A7.b0 r1 = r4.f40891h     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.f813c     // Catch: java.lang.Throwable -> L6b
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = G5.AbstractC0525f.q(r1)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9a
            A7.b0 r1 = r4.f40891h     // Catch: java.lang.Throwable -> L6b
            N1.c r2 = r4.f40892i     // Catch: java.lang.Throwable -> L6b
            boolean r9 = r1.k(r2, r9)     // Catch: java.lang.Throwable -> L6b
            if (r9 == 0) goto L9a
        L99:
            r0 = r3
        L9a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            return r0
        L9c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C3581d.a(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0070 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:6:0x0011, B:8:0x0017, B:10:0x001b, B:12:0x001f, B:38:0x0061, B:40:0x0065, B:42:0x0069, B:47:0x0070, B:49:0x0074, B:51:0x0078, B:53:0x007c, B:55:0x0086, B:57:0x0092, B:60:0x009d), top: B:66:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    @Override // k8.InterfaceC3202k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            int r3 = r8.f40813a
            switch(r3) {
                case 0: goto La1;
                default: goto L8;
            }
        L8:
            java.lang.Object r3 = r8.f40814b
            r6.l r3 = (r6.l) r3
            E5.T r9 = (E5.T) r9
            java.lang.Object r4 = r3.f44455c
            monitor-enter(r4)
            r6.f r5 = r3.f44459g     // Catch: java.lang.Throwable -> L6e
            boolean r5 = r5.f44424J     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L9c
            boolean r5 = r3.f44458f     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L9c
            int r5 = r9.f3251y     // Catch: java.lang.Throwable -> L6e
            if (r5 <= r1) goto L9c
            java.lang.String r5 = r9.f3238l     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L25
        L23:
            r1 = r0
            goto L5d
        L25:
            r6 = -1
            int r7 = r5.hashCode()
            switch(r7) {
                case -2123537834: goto L4e;
                case 187078296: goto L43;
                case 187078297: goto L3a;
                case 1504578661: goto L2f;
                default: goto L2d;
            }
        L2d:
            r1 = r6
            goto L58
        L2f:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L38
            goto L2d
        L38:
            r1 = 3
            goto L58
        L3a:
            java.lang.String r7 = "audio/ac4"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L58
            goto L2d
        L43:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4c
            goto L2d
        L4c:
            r1 = r2
            goto L58
        L4e:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L57
            goto L2d
        L57:
            r1 = r0
        L58:
            switch(r1) {
                case 0: goto L5c;
                case 1: goto L5c;
                case 2: goto L5c;
                case 3: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L23
        L5c:
            r1 = r2
        L5d:
            r5 = 32
            if (r1 == 0) goto L70
            int r1 = u6.v.f46721a     // Catch: java.lang.Throwable -> L6e
            if (r1 < r5) goto L9c
            A7.b0 r1 = r3.f44460h     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L9c
            boolean r1 = r1.f812b     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L9c
            goto L70
        L6e:
            r9 = move-exception
            goto L9f
        L70:
            int r1 = u6.v.f46721a     // Catch: java.lang.Throwable -> L6e
            if (r1 < r5) goto L9d
            A7.b0 r1 = r3.f44460h     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L9d
            boolean r5 = r1.f812b     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L9d
            java.lang.Object r1 = r1.f813c     // Catch: java.lang.Throwable -> L6e
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L6e
            boolean r1 = G5.AbstractC0525f.k(r1)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L9d
            A7.b0 r1 = r3.f44460h     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.f813c     // Catch: java.lang.Throwable -> L6e
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L6e
            boolean r1 = G5.AbstractC0525f.q(r1)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L9d
            A7.b0 r1 = r3.f44460h     // Catch: java.lang.Throwable -> L6e
            G5.h r3 = r3.f44461i     // Catch: java.lang.Throwable -> L6e
            boolean r9 = r1.j(r9, r3)     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L9d
        L9c:
            r0 = r2
        L9d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6e
            return r0
        L9f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6e
            throw r9
        La1:
            boolean r9 = r8.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C3581d.apply(java.lang.Object):boolean");
    }
}
