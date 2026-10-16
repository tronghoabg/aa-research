package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class wbn {
    private static final java.lang.Object a = new java.lang.Object();
    public static volatile boolean b = false;
    private static volatile defpackage.wbm e;
    private static final defpackage.wbw f;
    private static final java.util.concurrent.atomic.AtomicInteger g;
    final defpackage.wbl c;
    final java.lang.String d;
    private java.lang.Object h;
    private volatile int i = -1;
    private volatile java.lang.Object j;
    private final boolean k;
    private volatile boolean l;

    static {
        new java.util.concurrent.atomic.AtomicReference();
        f = new defpackage.wbw();
        g = new java.util.concurrent.atomic.AtomicInteger();
    }

    public wbn(defpackage.wbl wblVar, java.lang.String str, java.lang.Object obj, boolean z) {
        if (wblVar.a == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.c = wblVar;
        this.d = str;
        this.h = obj;
        this.k = z;
        this.l = false;
    }

    public static void e() {
        g.incrementAndGet();
    }

    public static void f(android.content.Context context) {
        if (e != null || context == null) {
            return;
        }
        java.lang.Object obj = a;
        synchronized (obj) {
            if (e == null) {
                synchronized (obj) {
                    defpackage.wbm wbmVar = e;
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (wbmVar == null || wbmVar.a != context) {
                        if (wbmVar != null) {
                            java.util.Iterator it = defpackage.waq.a.values().iterator();
                            while (it.hasNext()) {
                                defpackage.waq waqVar = (defpackage.waq) it.next();
                                synchronized (waqVar) {
                                    if (waqVar.f) {
                                        waqVar.f = false;
                                    } else {
                                        android.database.ContentObserver contentObserver = waqVar.e;
                                        if (contentObserver != null) {
                                            waqVar.c.unregisterContentObserver(contentObserver);
                                            waqVar.e = null;
                                        }
                                    }
                                }
                                it.remove();
                            }
                            wbp.a();
                            defpackage.wav.a();
                        }
                        e = new defpackage.wbm(context, defpackage.ysr.aQ(new defpackage.ryo(context, 16)));
                        g.incrementAndGet();
                    }
                }
            }
        }
    }

    private final java.lang.String g(java.lang.String str) {
        boolean zIsEmpty = str.isEmpty();
        java.lang.String str2 = this.d;
        return zIsEmpty ? str2 : str.concat(java.lang.String.valueOf(str2));
    }

    public abstract java.lang.Object a(java.lang.Object obj);

    /* JADX WARN: Code duplicated, block: B:102:0x0184 A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x018e A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0193  */
    /* JADX WARN: Code duplicated, block: B:108:0x0196 A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x019c A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a5 A[Catch: all -> 0x0234, TryCatch #7 {, blocks: (B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4), top: B:186:0x01a1, outer: #13, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b9 A[Catch: all -> 0x0234, TryCatch #7 {, blocks: (B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4), top: B:186:0x01a1, outer: #13, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01bf A[Catch: all -> 0x0234, TryCatch #7 {, blocks: (B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4), top: B:186:0x01a1, outer: #13, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ca A[Catch: all -> 0x0234, TryCatch #7 {, blocks: (B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4), top: B:186:0x01a1, outer: #13, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01ef A[Catch: all -> 0x0234, TryCatch #7 {, blocks: (B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4), top: B:186:0x01a1, outer: #13, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01fd A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0205 A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0209 A[Catch: all -> 0x025d, TRY_LEAVE, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x022c  */
    /* JADX WARN: Code duplicated, block: B:151:0x022f A[Catch: all -> 0x025d, TRY_LEAVE, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0239 A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x023e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0247 A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x024c A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[PHI: r2
  0x0046: PHI (r2v1 xyn) = (r2v0 xyn), (r2v0 xyn), (r2v4 xyn) binds: [B:11:0x0021, B:13:0x0025, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[Catch: all -> 0x0255, TRY_LEAVE, TryCatch #8 {, blocks: (B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1), top: B:188:0x0094, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0141 A[Catch: all -> 0x025d, TRY_ENTER, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0149 A[Catch: all -> 0x025d, TryCatch #13 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:74:0x0141, B:76:0x0149, B:77:0x014b, B:100:0x0181, B:102:0x0184, B:103:0x0186, B:105:0x018e, B:108:0x0196, B:110:0x019c, B:111:0x01a0, B:131:0x01f5, B:136:0x0205, B:138:0x0209, B:141:0x0210, B:151:0x022f, B:148:0x0221, B:134:0x01fd, B:155:0x0236, B:157:0x0239, B:159:0x023f, B:162:0x0247, B:163:0x024c, B:164:0x0250, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:61:0x0114, B:62:0x0121, B:64:0x0125, B:72:0x013e, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:168:0x0257, B:169:0x0258, B:170:0x025a, B:171:0x025b, B:112:0x01a1, B:114:0x01a5, B:116:0x01b9, B:118:0x01c4, B:117:0x01bf, B:119:0x01c6, B:121:0x01ca, B:123:0x01ce, B:125:0x01d2, B:128:0x01e8, B:129:0x01ef, B:130:0x01f4, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c), top: B:193:0x0018, inners: #7, #8, #14 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0150 A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #14 {, blocks: (B:78:0x014c, B:80:0x0150, B:82:0x015f, B:93:0x0174, B:94:0x0178, B:95:0x017b, B:96:0x017c, B:81:0x0154, B:91:0x016a), top: B:194:0x014c, outer: #13, inners: #2 }] */
    public final java.lang.Object b() {
        java.lang.String strE;
        boolean z;
        boolean zBooleanValue;
        final defpackage.waq waqVar;
        java.lang.Object objA;
        android.content.Context context;
        defpackage.wav wavVar;
        final defpackage.wav wavVar2;
        defpackage.wbl wblVar;
        final java.lang.String strG;
        android.content.Context context2;
        java.lang.String str;
        defpackage.wav wavVar3;
        java.util.Map map;
        java.lang.String str2;
        java.util.Map map2;
        java.util.Map map3;
        defpackage.xzi xziVar;
        if (!this.k) {
            java.lang.String str3 = this.d;
            defpackage.wbw wbwVar = f;
            str3.getClass();
            boolean z2 = wbwVar.a;
        }
        int i = g.get();
        if (this.i < i) {
            synchronized (this) {
                if (this.i < i) {
                    defpackage.wbm wbmVar = e;
                    defpackage.xyn xynVar = defpackage.xxe.a;
                    java.lang.Object objA2 = null;
                    if (wbmVar == null || (xziVar = wbmVar.b) == null) {
                        strE = null;
                    } else {
                        xynVar = (defpackage.xyn) xziVar.fF();
                        if (xynVar.f()) {
                            defpackage.roy royVar = (defpackage.roy) xynVar.b();
                            defpackage.wbl wblVar2 = this.c;
                            strE = royVar.e(wblVar2.a, wblVar2.c, this.d);
                        } else {
                            strE = null;
                        }
                    }
                    int i2 = 0;
                    defpackage.ysr.bk(wbmVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    android.net.Uri uri = this.c.a;
                    if (uri == null) {
                        android.content.Context context3 = wbmVar.a;
                        throw null;
                    }
                    android.content.Context context4 = wbmVar.a;
                    java.lang.Object obj = defpackage.wax.b;
                    java.lang.String authority = uri.getAuthority();
                    if ("com.google.android.gms.phenotype".equals(authority)) {
                        if (defpackage.wax.a.f()) {
                            zBooleanValue = ((java.lang.Boolean) defpackage.wax.a.b()).booleanValue();
                        } else {
                            synchronized (defpackage.wax.b) {
                                if (defpackage.wax.a.f()) {
                                    zBooleanValue = ((java.lang.Boolean) defpackage.wax.a.b()).booleanValue();
                                } else {
                                    if (!"com.google.android.gms".equals(context4.getPackageName())) {
                                        android.content.pm.ProviderInfo providerInfoResolveContentProvider = context4.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", android.os.Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                                        if (providerInfoResolveContentProvider == null || !"com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                                            z = false;
                                        } else {
                                            try {
                                                if ((context4.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                                            }
                                        }
                                    } else if ((context4.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    defpackage.wax.a = new defpackage.xys(java.lang.Boolean.valueOf(z));
                                    zBooleanValue = ((java.lang.Boolean) defpackage.wax.a.b()).booleanValue();
                                }
                            }
                        }
                        if (zBooleanValue) {
                            android.content.ContentResolver contentResolver = wbmVar.a.getContentResolver();
                            android.net.Uri uri2 = this.c.a;
                            java.util.concurrent.ConcurrentMap concurrentMap = defpackage.waq.a;
                            if (uri2 != null) {
                                waqVar = (defpackage.waq) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(defpackage.waq.a, uri2, new defpackage.wao(contentResolver, uri2, i2));
                                try {
                                    if (waqVar.f) {
                                        synchronized (waqVar) {
                                            if (waqVar.f) {
                                                defpackage.wap wapVar = new defpackage.wap(waqVar);
                                                waqVar.c.registerContentObserver(waqVar.d, false, wapVar);
                                                waqVar.e = wapVar;
                                                waqVar.f = false;
                                            }
                                        }
                                    }
                                } catch (java.lang.SecurityException unused2) {
                                    waqVar = null;
                                }
                            }
                        }
                        if (waqVar != null) {
                            java.lang.String strD = d();
                            map = waqVar.h;
                            if (map == null) {
                                synchronized (waqVar.g) {
                                    map2 = waqVar.h;
                                    if (map2 == null) {
                                        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                                        try {
                                            try {
                                                map3 = (java.util.Map) defpackage.sqs.bM(new defpackage.was() { // from class: wan
                                                    @Override // defpackage.was
                                                    public final java.lang.Object a() {
                                                        defpackage.waq waqVar2 = waqVar;
                                                        android.content.ContentResolver contentResolver2 = waqVar2.c;
                                                        android.net.Uri uri3 = waqVar2.d;
                                                        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri3);
                                                        try {
                                                            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                                android.util.Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                                return java.util.Collections.EMPTY_MAP;
                                                            }
                                                            try {
                                                                android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri3, defpackage.waq.b, null, null, null);
                                                                try {
                                                                    if (cursorQuery == null) {
                                                                        android.util.Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                                        java.util.Map map4 = java.util.Collections.EMPTY_MAP;
                                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                        return map4;
                                                                    }
                                                                    int count = cursorQuery.getCount();
                                                                    if (count == 0) {
                                                                        java.util.Map map5 = java.util.Collections.EMPTY_MAP;
                                                                        cursorQuery.close();
                                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                        return map5;
                                                                    }
                                                                    java.util.Map zdVar = count <= 256 ? new defpackage.zd(count) : new java.util.HashMap(count, 1.0f);
                                                                    while (cursorQuery.moveToNext()) {
                                                                        zdVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                                    }
                                                                    if (cursorQuery.isAfterLast()) {
                                                                        cursorQuery.close();
                                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                        return zdVar;
                                                                    }
                                                                    android.util.Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                                    java.util.Map map6 = java.util.Collections.EMPTY_MAP;
                                                                    cursorQuery.close();
                                                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                    return map6;
                                                                } catch (java.lang.Throwable th) {
                                                                    if (cursorQuery == null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        cursorQuery.close();
                                                                        throw th;
                                                                    } catch (java.lang.Throwable th2) {
                                                                        th.addSuppressed(th2);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (android.os.RemoteException e2) {
                                                                android.util.Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e2);
                                                                java.util.Map map7 = java.util.Collections.EMPTY_MAP;
                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                return map7;
                                                            }
                                                        } catch (java.lang.Throwable th3) {
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                            throw th3;
                                                        }
                                                    }
                                                });
                                            } catch (java.lang.Throwable th) {
                                                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                throw th;
                                            }
                                        } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException e2) {
                                            android.util.Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e2);
                                            map3 = java.util.Collections.EMPTY_MAP;
                                        }
                                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                        waqVar.h = map3;
                                        map2 = map3;
                                    }
                                }
                                map = map2;
                            }
                            if (map == null) {
                                map = java.util.Collections.EMPTY_MAP;
                            }
                            str2 = (java.lang.String) map.get(strD);
                            if (str2 != null) {
                                objA = a(str2);
                            } else {
                                objA = null;
                            }
                            if (objA == null) {
                                if (!this.c.d) {
                                    context = wbmVar.a;
                                    synchronized (defpackage.wav.class) {
                                        if (defpackage.wav.a == null) {
                                            if (defpackage.dmh.F(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                                wavVar3 = new defpackage.wav(context);
                                            } else {
                                                wavVar3 = new defpackage.wav();
                                            }
                                            defpackage.wav.a = wavVar3;
                                        }
                                        wavVar = defpackage.wav.a;
                                        if (wavVar != null || wavVar.c == null || wavVar.d) {
                                            wavVar2 = defpackage.wav.a;
                                            wavVar2.getClass();
                                        } else {
                                            try {
                                                context.getContentResolver().registerContentObserver(defpackage.sye.a, true, defpackage.wav.a.c);
                                                defpackage.wav wavVar4 = defpackage.wav.a;
                                                wavVar4.getClass();
                                                wavVar4.d = true;
                                            } catch (java.lang.SecurityException e3) {
                                                android.util.Log.e("GservicesLoader", "Unable to register Gservices content observer", e3);
                                            }
                                            wavVar2 = defpackage.wav.a;
                                            wavVar2.getClass();
                                        }
                                    }
                                    wblVar = this.c;
                                    if (wblVar.d) {
                                        strG = null;
                                    } else {
                                        strG = g(wblVar.b);
                                    }
                                    if (strG != null) {
                                        context2 = wavVar2.b;
                                        if (context2 == null && defpackage.tnx.e(context2)) {
                                            try {
                                                str = (java.lang.String) defpackage.sqs.bM(new defpackage.was() { // from class: wat
                                                    @Override // defpackage.was
                                                    public final java.lang.Object a() {
                                                        android.content.Context context5 = wavVar2.b;
                                                        context5.getClass();
                                                        return defpackage.syd.a.b(context5.getContentResolver(), strG);
                                                    }
                                                });
                                            } catch (java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException e4) {
                                                android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(strG), e4);
                                                str = null;
                                            }
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            objA2 = a(str);
                                        }
                                    }
                                }
                                if (objA2 == null) {
                                    objA = c();
                                } else {
                                    objA = objA2;
                                }
                            }
                            if (xynVar.f()) {
                                if (strE == null) {
                                    objA = c();
                                } else {
                                    objA = a(strE);
                                }
                            }
                            this.j = objA;
                            this.i = i;
                        } else {
                            objA = null;
                            if (objA == null) {
                                if (!this.c.d) {
                                    context = wbmVar.a;
                                    synchronized (defpackage.wav.class) {
                                        if (defpackage.wav.a == null) {
                                            if (defpackage.dmh.F(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                                wavVar3 = new defpackage.wav(context);
                                            } else {
                                                wavVar3 = new defpackage.wav();
                                            }
                                            defpackage.wav.a = wavVar3;
                                        }
                                        wavVar = defpackage.wav.a;
                                        if (wavVar != null) {
                                            wavVar2 = defpackage.wav.a;
                                            wavVar2.getClass();
                                            wblVar = this.c;
                                            if (wblVar.d) {
                                                strG = null;
                                            } else {
                                                strG = g(wblVar.b);
                                            }
                                            if (strG != null) {
                                                context2 = wavVar2.b;
                                                if (context2 == null) {
                                                    str = null;
                                                } else {
                                                    str = null;
                                                }
                                                if (str != null) {
                                                    objA2 = a(str);
                                                }
                                            }
                                        } else {
                                            wavVar2 = defpackage.wav.a;
                                            wavVar2.getClass();
                                            wblVar = this.c;
                                            if (wblVar.d) {
                                                strG = null;
                                            } else {
                                                strG = g(wblVar.b);
                                            }
                                            if (strG != null) {
                                                context2 = wavVar2.b;
                                                if (context2 == null) {
                                                    str = null;
                                                } else {
                                                    str = null;
                                                }
                                                if (str != null) {
                                                    objA2 = a(str);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (objA2 == null) {
                                    objA = c();
                                } else {
                                    objA = objA2;
                                }
                            }
                            if (xynVar.f()) {
                                if (strE == null) {
                                    objA = c();
                                } else {
                                    objA = a(strE);
                                }
                            }
                            this.j = objA;
                            this.i = i;
                        }
                    } else {
                        android.util.Log.e("PhenotypeClientHelper", java.lang.String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
                    }
                    waqVar = null;
                    if (waqVar != null) {
                        java.lang.String strD2 = d();
                        map = waqVar.h;
                        if (map == null) {
                            synchronized (waqVar.g) {
                                map2 = waqVar.h;
                                if (map2 == null) {
                                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = android.os.StrictMode.allowThreadDiskReads();
                                    map3 = (java.util.Map) defpackage.sqs.bM(new defpackage.was() { // from class: wan
                                        @Override // defpackage.was
                                        public final java.lang.Object a() {
                                            defpackage.waq waqVar2 = waqVar;
                                            android.content.ContentResolver contentResolver2 = waqVar2.c;
                                            android.net.Uri uri3 = waqVar2.d;
                                            android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri3);
                                            try {
                                                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                    android.util.Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                    return java.util.Collections.EMPTY_MAP;
                                                }
                                                try {
                                                    android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri3, defpackage.waq.b, null, null, null);
                                                    try {
                                                        if (cursorQuery == null) {
                                                            android.util.Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                            java.util.Map map4 = java.util.Collections.EMPTY_MAP;
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                            return map4;
                                                        }
                                                        int count = cursorQuery.getCount();
                                                        if (count == 0) {
                                                            java.util.Map map5 = java.util.Collections.EMPTY_MAP;
                                                            cursorQuery.close();
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                            return map5;
                                                        }
                                                        java.util.Map zdVar = count <= 256 ? new defpackage.zd(count) : new java.util.HashMap(count, 1.0f);
                                                        while (cursorQuery.moveToNext()) {
                                                            zdVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                        }
                                                        if (cursorQuery.isAfterLast()) {
                                                            cursorQuery.close();
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                            return zdVar;
                                                        }
                                                        android.util.Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                        java.util.Map map6 = java.util.Collections.EMPTY_MAP;
                                                        cursorQuery.close();
                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                        return map6;
                                                    } catch (java.lang.Throwable th2) {
                                                        if (cursorQuery == null) {
                                                            throw th2;
                                                        }
                                                        try {
                                                            cursorQuery.close();
                                                            throw th2;
                                                        } catch (java.lang.Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (android.os.RemoteException e5) {
                                                    android.util.Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e5);
                                                    java.util.Map map7 = java.util.Collections.EMPTY_MAP;
                                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                                    return map7;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                throw th4;
                                            }
                                        }
                                    });
                                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    waqVar.h = map3;
                                    map2 = map3;
                                }
                                map = map2;
                            }
                        }
                        if (map == null) {
                            map = java.util.Collections.EMPTY_MAP;
                        }
                        str2 = (java.lang.String) map.get(strD2);
                        if (str2 != null) {
                            objA = a(str2);
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (!this.c.d) {
                                context = wbmVar.a;
                                synchronized (defpackage.wav.class) {
                                    if (defpackage.wav.a == null) {
                                        if (defpackage.dmh.F(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                            wavVar3 = new defpackage.wav(context);
                                        } else {
                                            wavVar3 = new defpackage.wav();
                                        }
                                        defpackage.wav.a = wavVar3;
                                    }
                                    wavVar = defpackage.wav.a;
                                    if (wavVar != null) {
                                        wavVar2 = defpackage.wav.a;
                                        wavVar2.getClass();
                                        wblVar = this.c;
                                        if (wblVar.d) {
                                            strG = null;
                                        } else {
                                            strG = g(wblVar.b);
                                        }
                                        if (strG != null) {
                                            context2 = wavVar2.b;
                                            if (context2 == null) {
                                                str = null;
                                            } else {
                                                str = null;
                                            }
                                            if (str != null) {
                                                objA2 = a(str);
                                            }
                                        }
                                    } else {
                                        wavVar2 = defpackage.wav.a;
                                        wavVar2.getClass();
                                        wblVar = this.c;
                                        if (wblVar.d) {
                                            strG = null;
                                        } else {
                                            strG = g(wblVar.b);
                                        }
                                        if (strG != null) {
                                            context2 = wavVar2.b;
                                            if (context2 == null) {
                                                str = null;
                                            } else {
                                                str = null;
                                            }
                                            if (str != null) {
                                                objA2 = a(str);
                                            }
                                        }
                                    }
                                }
                            }
                            if (objA2 == null) {
                                objA = c();
                            } else {
                                objA = objA2;
                            }
                        }
                        if (xynVar.f()) {
                            if (strE == null) {
                                objA = c();
                            } else {
                                objA = a(strE);
                            }
                        }
                        this.j = objA;
                        this.i = i;
                    } else {
                        objA = null;
                        if (objA == null) {
                            if (!this.c.d) {
                                context = wbmVar.a;
                                synchronized (defpackage.wav.class) {
                                    if (defpackage.wav.a == null) {
                                        if (defpackage.dmh.F(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                            wavVar3 = new defpackage.wav(context);
                                        } else {
                                            wavVar3 = new defpackage.wav();
                                        }
                                        defpackage.wav.a = wavVar3;
                                    }
                                    wavVar = defpackage.wav.a;
                                    if (wavVar != null) {
                                        wavVar2 = defpackage.wav.a;
                                        wavVar2.getClass();
                                        wblVar = this.c;
                                        if (wblVar.d) {
                                            strG = null;
                                        } else {
                                            strG = g(wblVar.b);
                                        }
                                        if (strG != null) {
                                            context2 = wavVar2.b;
                                            if (context2 == null) {
                                                str = null;
                                            } else {
                                                str = null;
                                            }
                                            if (str != null) {
                                                objA2 = a(str);
                                            }
                                        }
                                    } else {
                                        wavVar2 = defpackage.wav.a;
                                        wavVar2.getClass();
                                        wblVar = this.c;
                                        if (wblVar.d) {
                                            strG = null;
                                        } else {
                                            strG = g(wblVar.b);
                                        }
                                        if (strG != null) {
                                            context2 = wavVar2.b;
                                            if (context2 == null) {
                                                str = null;
                                            } else {
                                                str = null;
                                            }
                                            if (str != null) {
                                                objA2 = a(str);
                                            }
                                        }
                                    }
                                }
                            }
                            if (objA2 == null) {
                                objA = c();
                            } else {
                                objA = objA2;
                            }
                        }
                        if (xynVar.f()) {
                            if (strE == null) {
                                objA = c();
                            } else {
                                objA = a(strE);
                            }
                        }
                        this.j = objA;
                        this.i = i;
                    }
                }
            }
        }
        return this.j;
    }

    public final java.lang.Object c() {
        if (this.l) {
            synchronized (this) {
                if (this.l) {
                    java.lang.Object objA = a(this.h);
                    objA.getClass();
                    this.h = objA;
                    this.l = false;
                }
            }
        }
        return this.h;
    }

    public final java.lang.String d() {
        return g(this.c.c);
    }

    public wbn(defpackage.wbl wblVar, java.lang.String str, java.lang.String str2) {
        if (wblVar.a == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.c = wblVar;
        this.d = str;
        this.h = str2;
        this.k = true;
        this.l = true;
    }
}
