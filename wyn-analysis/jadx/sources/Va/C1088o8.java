package Va;

/* renamed from: Va.o8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1088o8 implements InterfaceC1101p8 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14456c = {'6', 143, 177, 186, 188, 180, 177, 177, 184, 150, 151, 193, 184, 142, 150, 182, 184, 159, 158, 192, 183, 179, 180, 142, 143, 177, 185, 184, 177, 183, 193, 171};

    /* renamed from: d, reason: collision with root package name */
    public static int f14457d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14458e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14459a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C1114q8 f14460b;

    public /* synthetic */ C1088o8(int i5) {
        this.f14459a = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if ((r0 instanceof Va.J8) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if ((r0 instanceof Va.J8) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r2 = r17.f14460b;
        r6 = new java.lang.StringBuilder();
        r8 = new int[]{0, 32, 77, 0};
        r7 = "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001".getBytes("ISO-8859-1");
        r9 = Va.Ab.f13223z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        r10 = r8[0];
        r11 = r8[1];
        r12 = r8[2];
        r13 = r8[3];
        r15 = new char[r11];
        java.lang.System.arraycopy(Va.C1088o8.f14456c, r10, r15, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r10 = new char[r11];
        Va.Ab.f13222y = 0;
        r18 = 2;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r4 = Va.Ab.f13222y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r4 >= r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r7[r4] != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        r10[r4] = (char) (((r15[r4] << 1) + 1) - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        r10[r4] = (char) ((r15[r4] << 1) - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        r14 = r10[r4];
        Va.Ab.f13222y = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r15 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r13 <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        r4 = new char[r11];
        java.lang.System.arraycopy(r15, 0, r4, 0, r11);
        r7 = r11 - r13;
        java.lang.System.arraycopy(r4, 0, r15, r7, r13);
        java.lang.System.arraycopy(r4, r13, r15, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        r4 = new char[r11];
        Va.Ab.f13222y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
    
        r5 = Va.Ab.f13222y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r5 >= r11) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        r4[r5] = r15[(r11 - r5) - 1];
        Va.Ab.f13222y = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        if (r12 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        Va.Ab.f13222y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        r3 = Va.Ab.f13222y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        if (r3 >= r11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        r4[r3] = (char) (r4[r3] - r8[r18]);
        Va.Ab.f13222y = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
    
        r3 = new java.lang.String(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        r6.append(r3.intern());
        r6.append(r0);
        r0 = r6.toString();
        Va.C1114q8.f14533i = (Va.C1114q8.f14532h + 25) % 128;
        r2.q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        throw r0;
     */
    @Override // Va.InterfaceC1101p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r18) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1088o8.a(java.util.List):java.lang.Object");
    }
}
