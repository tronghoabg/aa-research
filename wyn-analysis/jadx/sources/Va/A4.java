package Va;

/* loaded from: classes4.dex */
public abstract class A4 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f13178R = {47670};

    /* renamed from: S, reason: collision with root package name */
    public static int f13179S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f13180T = 1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r6 = new char[r4];
        Va.Ab.f13217t = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r1 = Va.Ab.f13217t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1 >= r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r6[r1] = (char) ((Va.A4.f13178R[r3 + r1] ^ (r1 * 5185436352130278611L)) ^ r2);
        Va.Ab.f13217t = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r1 = new java.lang.String(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        return r0.split(r1.intern())[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r0 = Va.A4.f13179S + 59;
        Va.A4.f13180T = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if ((r0 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r2 = (char) ((android.os.Process.myTid() >> 22) + 47721);
        r3 = android.graphics.Color.red(0);
        r4 = '1' - android.text.AndroidCharacter.getMirror('0');
        r5 = Va.Ab.f13218u;
     */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t0() {
        /*
            r13 = this;
            int r0 = Va.A4.f13180T
            int r0 = r0 + 13
            int r1 = r0 % 128
            Va.A4.f13179S = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.String r0 = r13.u0()
            r2 = 79
            int r2 = r2 / r1
            if (r0 == 0) goto L6f
            goto L1d
        L17:
            java.lang.String r0 = r13.u0()
            if (r0 == 0) goto L6f
        L1d:
            int r2 = android.os.Process.myTid()
            int r2 = r2 >> 22
            r3 = 47721(0xba69, float:6.6871E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            int r3 = android.graphics.Color.red(r1)
            r4 = 48
            char r4 = android.text.AndroidCharacter.getMirror(r4)
            int r4 = 49 - r4
            java.lang.Object r5 = Va.Ab.f13218u
            monitor-enter(r5)
            char[] r6 = new char[r4]     // Catch: java.lang.Throwable -> L59
            Va.Ab.f13217t = r1     // Catch: java.lang.Throwable -> L59
        L3b:
            int r1 = Va.Ab.f13217t     // Catch: java.lang.Throwable -> L59
            if (r1 >= r4) goto L5b
            char[] r7 = Va.A4.f13178R     // Catch: java.lang.Throwable -> L59
            int r8 = r3 + r1
            char r7 = r7[r8]     // Catch: java.lang.Throwable -> L59
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L59
            long r9 = (long) r1     // Catch: java.lang.Throwable -> L59
            r11 = 5185436352130278611(0x47f65ee37e1f64d3, double:4.7577129458263765E38)
            long r9 = r9 * r11
            long r7 = r7 ^ r9
            long r9 = (long) r2     // Catch: java.lang.Throwable -> L59
            long r7 = r7 ^ r9
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L59
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L59
            r6[r1] = r7     // Catch: java.lang.Throwable -> L59
            int r1 = r1 + 1
            Va.Ab.f13217t = r1     // Catch: java.lang.Throwable -> L59
            goto L3b
        L59:
            r0 = move-exception
            goto L6d
        L5b:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L59
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r1.intern()
            java.lang.String[] r0 = r0.split(r1)
            r1 = 1
            r0 = r0[r1]
            return r0
        L6d:
            monitor-exit(r5)
            throw r0
        L6f:
            int r0 = Va.A4.f13179S
            int r0 = r0 + 59
            int r1 = r0 % 128
            Va.A4.f13180T = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L7d
            return r1
        L7d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.A4.t0():java.lang.String");
    }
}
