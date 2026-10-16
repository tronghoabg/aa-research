package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qtj implements defpackage.qte, defpackage.rfe, defpackage.rwx, defpackage.rvm {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SERVICE");
    private defpackage.qtd A;
    private defpackage.rvp B;
    private final android.content.Context C;
    private android.os.HandlerThread D;
    private rjx E;
    private final defpackage.ryk G;
    private final defpackage.ris H;
    private final boolean I;
    private final defpackage.yhx J;
    public final defpackage.rwu b;
    public final defpackage.qto d;
    public final android.content.Context e;
    public volatile int h;
    public defpackage.qsa i;
    public com.google.android.gms.carsetup.CarInfoInternal j;
    public final defpackage.rxs n;
    private volatile boolean p;
    private java.util.concurrent.CountDownLatch q;
    private final defpackage.qtp r;
    private defpackage.qtg s;
    private com.google.android.gms.car.bluetooth.data.CarBluetoothData v;
    private qti w;
    private int x;
    private volatile qrp y;
    private volatile qrr z;
    public final java.util.Map c = new j$.util.concurrent.ConcurrentHashMap();
    final android.os.Handler f = new defpackage.stq(android.os.Looper.getMainLooper());
    public final android.util.SparseBooleanArray g = new android.util.SparseBooleanArray();
    private final java.lang.Object t = new java.lang.Object();
    private boolean u = false;
    public volatile defpackage.zaj k = defpackage.zaj.UNKNOWN_CODE;
    public final java.util.Set l = j$.util.DesugarCollections.synchronizedSet(java.util.EnumSet.noneOf(defpackage.rww.class));
    public volatile boolean m = false;
    private final java.lang.Object F = new java.lang.Object();
    private final java.util.Set K = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
    protected final defpackage.wyz o = new defpackage.wyz(this, null);

    protected qtj(defpackage.qto qtoVar, android.content.Context context, android.content.Context context2, defpackage.qtp qtpVar, defpackage.ryk rykVar, defpackage.ris risVar) {
        this.d = qtoVar;
        this.C = context;
        this.e = context2;
        defpackage.rxt rxtVar = new defpackage.rxt(qtpVar, context2);
        this.n = rxtVar;
        this.r = qtpVar;
        this.G = rykVar;
        this.H = risVar;
        this.I = true;
        defpackage.yhv yhvVar = new defpackage.yhv();
        yhvVar.c(defpackage.rbf.c);
        yhvVar.c(defpackage.rbf.d);
        yhvVar.c(defpackage.rbf.e);
        yhvVar.c(defpackage.rbf.f);
        yhvVar.c(defpackage.rbf.g);
        yhvVar.c(defpackage.rbf.h);
        yhvVar.c(defpackage.rbf.i);
        yhvVar.c(defpackage.rbf.j);
        yhvVar.c(defpackage.rbf.k);
        yhvVar.c(defpackage.rbf.l);
        yhvVar.c(defpackage.rbf.m);
        yhvVar.c(defpackage.rbf.n);
        yhvVar.c(defpackage.rbf.o);
        yhvVar.c(defpackage.rbf.s);
        yhvVar.c(defpackage.rbf.y);
        yhvVar.c(defpackage.rbf.z);
        yhvVar.c(defpackage.rbf.t);
        yhvVar.c(defpackage.rbf.x);
        yhvVar.c(defpackage.rbf.u);
        defpackage.adca adcaVar = defpackage.adca.a;
        adcaVar.fF().b();
        if (adcaVar.fF().a()) {
            yhvVar.c(defpackage.rbf.v);
        }
        defpackage.yhx yhxVarG = yhvVar.g();
        defpackage.zf zfVar = new defpackage.zf(yhxVarG.size());
        defpackage.zf zfVar2 = new defpackage.zf(defpackage.rbf.values().length - yhxVarG.size());
        for (defpackage.rbf rbfVar : defpackage.rbf.values()) {
            if (yhxVarG.contains(rbfVar)) {
                zfVar.add(rbfVar.name());
            } else {
                zfVar2.add(rbfVar.name());
            }
        }
        a.l().ai(7887).M("Initialized module features, in memory, in CarServiceBinderImpl. enabled=%s; disabled=%s", zfVar, zfVar2);
        this.J = defpackage.yhx.n(zfVar);
        this.b = new defpackage.rwy(rxtVar);
    }

    private static final void C(defpackage.zbd zbdVar) {
        if (defpackage.ris.a.contains(zbdVar)) {
            throw new java.lang.UnsupportedOperationException(java.lang.String.format("This method should only be called on the car module living in gearhead: %d", java.lang.Integer.valueOf(zbdVar.a())));
        }
    }

    private final void v(defpackage.zbd zbdVar) {
        if (this.K.add(zbdVar)) {
            this.n.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, zbdVar).l());
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021f A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x022d A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0243 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0259 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0299 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x029a A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x029b A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a0 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b5 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02c5 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02ed A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02f6 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02ff A[Catch: all -> 0x03b8, TRY_LEAVE, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x032f A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x033c A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0350 A[Catch: all -> 0x03b5, TryCatch #3 {, blocks: (B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396), top: B:175:0x0346, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x036f A[Catch: all -> 0x03b5, LOOP:4: B:140:0x034a->B:144:0x036f, LOOP_END, TryCatch #3 {, blocks: (B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396), top: B:175:0x0346, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x038f A[Catch: all -> 0x03b5, TryCatch #3 {, blocks: (B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396), top: B:175:0x0346, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0346 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x014a A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x015b A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0175 A[Catch: all -> 0x02fc, TryCatch #7 {, blocks: (B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:180:0x0171, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0182 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0199 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d8 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e0 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6 A[Catch: all -> 0x03b8, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0205 A[Catch: all -> 0x03b8, LOOP:3: B:97:0x01ff->B:99:0x0205, LOOP_END, TryCatch #4 {, blocks: (B:31:0x00a9, B:33:0x00c3, B:34:0x00c9, B:42:0x0110, B:44:0x0116, B:46:0x011a, B:47:0x011f, B:49:0x0125, B:50:0x012a, B:51:0x012d, B:53:0x0131, B:54:0x0136, B:55:0x0138, B:58:0x013d, B:62:0x0142, B:65:0x0145, B:66:0x0146, B:68:0x014a, B:69:0x0153, B:71:0x015b, B:72:0x0170, B:77:0x017d, B:79:0x0182, B:81:0x0199, B:83:0x019d, B:89:0x01c6, B:85:0x01a3, B:88:0x01b1, B:90:0x01d4, B:92:0x01d8, B:94:0x01e0, B:95:0x01e6, B:96:0x01f7, B:97:0x01ff, B:99:0x0205, B:100:0x020f, B:102:0x021f, B:104:0x022d, B:106:0x0243, B:108:0x0259, B:109:0x0299, B:110:0x029a, B:111:0x029b, B:112:0x029c, B:114:0x02a0, B:116:0x02b5, B:117:0x02c5, B:119:0x02ed, B:120:0x02f2, B:122:0x02f6, B:123:0x02f9, B:127:0x02fe, B:128:0x02ff, B:130:0x0311, B:134:0x032f, B:136:0x033c, B:137:0x0343, B:138:0x0345, B:151:0x0397, B:152:0x03ae, B:157:0x03b7, B:133:0x031a, B:56:0x0139, B:57:0x013c, B:35:0x00ca, B:36:0x00d4, B:38:0x00da, B:39:0x010b, B:40:0x010e, B:139:0x0346, B:140:0x034a, B:142:0x0350, B:144:0x036f, B:145:0x0375, B:146:0x0388, B:147:0x0389, B:149:0x038f, B:150:0x0396, B:73:0x0171, B:75:0x0175, B:76:0x017c), top: B:176:0x00a9, inners: #0, #2, #3, #7, #9, #10 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, qxc] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.bluetooth.BluetoothProfile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, rxs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void y(com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        defpackage.rwt rwtVarA;
        defpackage.qtd qtdVar;
        defpackage.qtg qtgVar;
        java.util.Set<defpackage.rww> set;
        defpackage.rxs rxsVar;
        defpackage.zbe zbeVar;
        defpackage.qrx qrxVar;
        android.media.MediaRouter.RouteInfo routeInfo;
        defpackage.rhe rheVar;
        java.util.Iterator it;
        defpackage.rhn rhnVar;
        defpackage.rib ribVar;
        defpackage.yqk yqkVar;
        android.content.Context context;
        defpackage.rhs rhsVar;
        defpackage.abor aborVarN;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        java.lang.String strG;
        defpackage.yqk yqkVar2 = a;
        yqkVar2.l().ai(7889).u("tearDownCarState");
        synchronized (this.t) {
            if (!u()) {
                yqkVar2.l().ai(7891).u("Skip, car not connected.");
                return;
            }
            synchronized (this.t) {
                defpackage.rwu rwuVar = this.b;
                rwtVarA = rwuVar.a();
                rwuVar.e(defpackage.rwt.d, criticalError);
            }
            java.util.Map map = this.c;
            synchronized (map) {
                try {
                    if (rwtVarA.equals(defpackage.rwt.c)) {
                        yqkVar2.f().ai(7864).w("Notifying car connection listeners of disconnection (%d listeners)", map.size());
                        java.util.Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            try {
                                ((defpackage.aahg) map.get((android.os.IBinder) it2.next())).c.c();
                            } catch (android.os.RemoteException unused) {
                                a.g().ai(7865).u("Remote exception calling onDisconnected, removing from list");
                                it2.remove();
                            }
                        }
                    } else {
                        yqkVar2.f().ai(7863).w("Not ready for clients, so not notifying car connection listeners of disconnection (%d listeners)", this.c.size());
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            java.lang.Object obj = this.t;
            synchronized (obj) {
                this.b.e(defpackage.rwt.e, criticalError);
                obj.notifyAll();
                this.K.clear();
                this.B.f();
                if (this.z != null) {
                    qrr qrrVar = this.z;
                    qsv qsvVar = qrrVar.l;
                    synchronized (qsvVar.a) {
                        ?? r5 = qsvVar.d;
                        for (java.util.Map.Entry entry : r5.entrySet()) {
                            rga rgaVar = (rga) entry.getKey();
                            java.lang.Object obj2 = qsvVar.b;
                            defpackage.zbe zbeVar2 = rgaVar.a;
                            defpackage.zbd zbdVar = rgaVar.b;
                            int iIntValue = ((java.lang.Integer) entry.getValue()).intValue();
                            ?? r9 = ((defpackage.xei) obj2).a;
                            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, zbeVar2, zbdVar);
                            rrvVarH.w(iIntValue);
                            r9.b(rrvVarH.l());
                        }
                        r5.clear();
                    }
                    int i7 = 0;
                    while (true) {
                        qqk[] qqkVarArr = qrrVar.k;
                        int length = qqkVarArr.length;
                        if (i7 >= 3) {
                            break;
                        }
                        qqk qqkVar = qqkVarArr[i7];
                        if (qqkVar != null) {
                            qqkVar.c();
                            qqkVarArr[i7] = null;
                        }
                        rff[] rffVarArr = qrrVar.e;
                        rff rffVar = rffVarArr[i7];
                        if (rffVar != null) {
                            rffVar.k();
                            rffVarArr[i7] = null;
                        }
                        i7++;
                    }
                    if (qrrVar.j != null) {
                        qrrVar.j.e();
                    }
                    android.util.SparseArray sparseArray = qrrVar.c;
                    synchronized (sparseArray) {
                        sparseArray.clear();
                    }
                    this.z = null;
                    qtdVar = this.A;
                    if (qtdVar != null) {
                        qtdVar.j();
                        qtdVar.e.a = null;
                        this.A = null;
                    }
                    if (t()) {
                        defpackage.qsa qsaVar = this.i;
                        defpackage.qsa.a.l().ai(7744).u("onDisconnected");
                        qrxVar = qsaVar.m;
                        synchronized (qrxVar) {
                            routeInfo = qrxVar.d;
                            if (routeInfo != null) {
                                qrxVar.a.selectRoute(1, routeInfo);
                                qrxVar.d = null;
                            }
                        }
                        rheVar = qrxVar.c;
                        if (rheVar != null) {
                            defpackage.rhe.a.l().ai(8044).u("stop");
                            rheVar.d = true;
                            if (rheVar.f != null) {
                                if (rheVar.e || defpackage.acyx.l()) {
                                    try {
                                        defpackage.khb khbVar = rheVar.f;
                                        khbVar.getClass();
                                        khbVar.c(rheVar.c, 100);
                                    } catch (java.lang.SecurityException e) {
                                        defpackage.rhe.a.g().p(e).ai(8045).u("a2dp cannot be re-enabled at the end of the drive");
                                    }
                                }
                                defpackage.rhf rhfVar = rheVar.b;
                                defpackage.khb khbVar2 = rheVar.f;
                                khbVar2.getClass();
                                rhfVar.d(2, khbVar2.a);
                                rheVar.f = null;
                            }
                        }
                        if (qrxVar.b != null) {
                            strG = qrxVar.e.g();
                            if (strG != null) {
                                qrxVar.b.b(strG);
                            } else {
                                defpackage.qsa.a.h().ai(7709).u("Can't enable A2DP for car; car bluetooth address is null");
                            }
                        }
                        qsaVar.i = true;
                        java.util.List list = qsaVar.f;
                        it = list.iterator();
                        while (it.hasNext()) {
                            ((defpackage.qrz) it.next()).a();
                        }
                        list.clear();
                        rhnVar = qsaVar.e;
                        rhnVar.k = true;
                        rhnVar.a();
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            aborVarN = defpackage.zas.a.n();
                            i = rhnVar.g.t;
                            i2 = i - 1;
                            if (i != 0) {
                                throw null;
                            }
                            aborVarN.t();
                            defpackage.zas zasVar = (defpackage.zas) aborVarN.b;
                            zasVar.b = 2 | zasVar.b;
                            zasVar.d = i2;
                            i3 = rhnVar.g.t;
                            i4 = i3 - 1;
                            if (i3 != 0) {
                                throw null;
                            }
                            aborVarN.t();
                            defpackage.zas zasVar2 = (defpackage.zas) aborVarN.b;
                            zasVar2.b |= 1;
                            zasVar2.c = i4;
                            i5 = rhnVar.l.t;
                            i6 = i5 - 1;
                            if (i5 != 0) {
                                throw null;
                            }
                            aborVarN.t();
                            defpackage.zas zasVar3 = (defpackage.zas) aborVarN.b;
                            zasVar3.b |= 4;
                            zasVar3.e = i6;
                            defpackage.zas zasVar4 = (defpackage.zas) aborVarN.q();
                            defpackage.rxs rxsVar2 = rhnVar.e;
                            defpackage.abor aborVarN2 = defpackage.yyg.a.n();
                            aborVarN2.t();
                            defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
                            zasVar4.getClass();
                            yygVar.U = zasVar4;
                            yygVar.c |= 4194304;
                            rxsVar2.a(((defpackage.yyg) aborVarN2.q()).h(), defpackage.yyh.BT_FSM_STATE_CHANGE);
                        }
                        ribVar = qsaVar.d;
                        if (ribVar != null) {
                            yqkVar = defpackage.rib.a;
                            yqkVar.l().ai(8162).u("cleanup");
                            if (ribVar.n != 0) {
                                yqkVar.l().ai(8163).u("cleanup: This object wasn't initialized successfully.");
                            } else {
                                ribVar.n = -1;
                                context = ribVar.c;
                                context.unregisterReceiver(ribVar.g);
                                context.unregisterReceiver(ribVar.h);
                                context.unregisterReceiver(ribVar.i);
                                context.unregisterReceiver(ribVar.j);
                                context.unregisterReceiver(ribVar.k);
                                context.unregisterReceiver(ribVar.l);
                                if (android.os.Build.VERSION.SDK_INT >= 35) {
                                    context.unregisterReceiver(ribVar.m);
                                }
                                rhsVar = ribVar.o;
                                if (rhsVar != null) {
                                    rhsVar.d();
                                }
                            }
                        }
                        this.i = null;
                        this.B.e();
                        this.B = null;
                        this.y = null;
                        this.d.e();
                        if (this.h == 1) {
                            try {
                                this.e.unregisterReceiver(this.w);
                            } catch (java.lang.IllegalArgumentException e2) {
                                a.h().p(e2).ai(7890).u("usbDisconnectReceiver already unregistered");
                            }
                            this.D.quit();
                            this.D = null;
                            qtgVar = this.s;
                            if (qtgVar.c) {
                                qtgVar.c = false;
                                java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                            }
                            set = this.l;
                            synchronized (set) {
                                for (defpackage.rww rwwVar : set) {
                                    a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                    rxsVar = this.n;
                                    zbeVar = defpackage.zbe.CAR_SERVICE;
                                    if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                        throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                    }
                                    rxsVar.d(zbeVar, defpackage.zbd.rE);
                                }
                                if (!set.isEmpty()) {
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                }
                            }
                            defpackage.rxs rxsVar3 = this.n;
                            ((defpackage.rxt) rxsVar3).a.b();
                            ((defpackage.rxt) rxsVar3).b = -1;
                            set.clear();
                            this.x = this.h;
                            this.h = -1;
                        } else {
                            this.D.quit();
                            this.D = null;
                            qtgVar = this.s;
                            if (qtgVar.c) {
                                qtgVar.c = false;
                                java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                            }
                            set = this.l;
                            synchronized (set) {
                                while (r1.hasNext()) {
                                    a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                    rxsVar = this.n;
                                    zbeVar = defpackage.zbe.CAR_SERVICE;
                                    if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                        throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                    }
                                    rxsVar.d(zbeVar, defpackage.zbd.rE);
                                }
                                if (!set.isEmpty()) {
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                }
                                defpackage.rxs rxsVar4 = this.n;
                                ((defpackage.rxt) rxsVar4).a.b();
                                ((defpackage.rxt) rxsVar4).b = -1;
                                set.clear();
                                this.x = this.h;
                                this.h = -1;
                            }
                        }
                    } else {
                        this.B.e();
                        this.B = null;
                        this.y = null;
                        this.d.e();
                        if (this.h == 1) {
                            this.e.unregisterReceiver(this.w);
                            this.D.quit();
                            this.D = null;
                            qtgVar = this.s;
                            if (qtgVar.c) {
                                qtgVar.c = false;
                                java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                            }
                            set = this.l;
                            synchronized (set) {
                                while (r1.hasNext()) {
                                    a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                    rxsVar = this.n;
                                    zbeVar = defpackage.zbe.CAR_SERVICE;
                                    if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                        throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                    }
                                    rxsVar.d(zbeVar, defpackage.zbd.rE);
                                }
                                if (!set.isEmpty()) {
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                }
                                defpackage.rxs rxsVar5 = this.n;
                                ((defpackage.rxt) rxsVar5).a.b();
                                ((defpackage.rxt) rxsVar5).b = -1;
                                set.clear();
                                this.x = this.h;
                                this.h = -1;
                            }
                        } else {
                            this.D.quit();
                            this.D = null;
                            qtgVar = this.s;
                            if (qtgVar.c) {
                                qtgVar.c = false;
                                java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                            }
                            set = this.l;
                            synchronized (set) {
                                while (r1.hasNext()) {
                                    a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                    rxsVar = this.n;
                                    zbeVar = defpackage.zbe.CAR_SERVICE;
                                    if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                        throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                    }
                                    rxsVar.d(zbeVar, defpackage.zbd.rE);
                                }
                                if (!set.isEmpty()) {
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                }
                                defpackage.rxs rxsVar6 = this.n;
                                ((defpackage.rxt) rxsVar6).a.b();
                                ((defpackage.rxt) rxsVar6).b = -1;
                                set.clear();
                                this.x = this.h;
                                this.h = -1;
                            }
                        }
                    }
                } else {
                    qtdVar = this.A;
                    if (qtdVar != null) {
                        qtdVar.j();
                        qtdVar.e.a = null;
                        this.A = null;
                    }
                    if (t()) {
                        defpackage.qsa qsaVar2 = this.i;
                        defpackage.qsa.a.l().ai(7744).u("onDisconnected");
                        qrxVar = qsaVar2.m;
                        synchronized (qrxVar) {
                            routeInfo = qrxVar.d;
                            if (routeInfo != null) {
                                qrxVar.a.selectRoute(1, routeInfo);
                                qrxVar.d = null;
                            }
                            rheVar = qrxVar.c;
                            if (rheVar != null) {
                                defpackage.rhe.a.l().ai(8044).u("stop");
                                rheVar.d = true;
                                if (rheVar.f != null) {
                                    if (rheVar.e) {
                                        defpackage.khb khbVar3 = rheVar.f;
                                        khbVar3.getClass();
                                        khbVar3.c(rheVar.c, 100);
                                        defpackage.rhf rhfVar2 = rheVar.b;
                                        defpackage.khb khbVar4 = rheVar.f;
                                        khbVar4.getClass();
                                        rhfVar2.d(2, khbVar4.a);
                                        rheVar.f = null;
                                    } else {
                                        defpackage.khb khbVar5 = rheVar.f;
                                        khbVar5.getClass();
                                        khbVar5.c(rheVar.c, 100);
                                        defpackage.rhf rhfVar3 = rheVar.b;
                                        defpackage.khb khbVar6 = rheVar.f;
                                        khbVar6.getClass();
                                        rhfVar3.d(2, khbVar6.a);
                                        rheVar.f = null;
                                    }
                                }
                            }
                            if (qrxVar.b != null) {
                                strG = qrxVar.e.g();
                                if (strG != null) {
                                    qrxVar.b.b(strG);
                                } else {
                                    defpackage.qsa.a.h().ai(7709).u("Can't enable A2DP for car; car bluetooth address is null");
                                }
                            }
                            qsaVar2.i = true;
                            java.util.List list2 = qsaVar2.f;
                            it = list2.iterator();
                            while (it.hasNext()) {
                                ((defpackage.qrz) it.next()).a();
                            }
                            list2.clear();
                            rhnVar = qsaVar2.e;
                            rhnVar.k = true;
                            rhnVar.a();
                            if (android.os.Build.VERSION.SDK_INT >= 30) {
                                aborVarN = defpackage.zas.a.n();
                                i = rhnVar.g.t;
                                i2 = i - 1;
                                if (i != 0) {
                                    throw null;
                                }
                                aborVarN.t();
                                defpackage.zas zasVar5 = (defpackage.zas) aborVarN.b;
                                zasVar5.b = 2 | zasVar5.b;
                                zasVar5.d = i2;
                                i3 = rhnVar.g.t;
                                i4 = i3 - 1;
                                if (i3 != 0) {
                                    throw null;
                                }
                                aborVarN.t();
                                defpackage.zas zasVar6 = (defpackage.zas) aborVarN.b;
                                zasVar6.b |= 1;
                                zasVar6.c = i4;
                                i5 = rhnVar.l.t;
                                i6 = i5 - 1;
                                if (i5 != 0) {
                                    throw null;
                                }
                                aborVarN.t();
                                defpackage.zas zasVar7 = (defpackage.zas) aborVarN.b;
                                zasVar7.b |= 4;
                                zasVar7.e = i6;
                                defpackage.zas zasVar8 = (defpackage.zas) aborVarN.q();
                                defpackage.rxs rxsVar7 = rhnVar.e;
                                defpackage.abor aborVarN3 = defpackage.yyg.a.n();
                                aborVarN3.t();
                                defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN3.b;
                                zasVar8.getClass();
                                yygVar2.U = zasVar8;
                                yygVar2.c |= 4194304;
                                rxsVar7.a(((defpackage.yyg) aborVarN3.q()).h(), defpackage.yyh.BT_FSM_STATE_CHANGE);
                            }
                            ribVar = qsaVar2.d;
                            if (ribVar != null) {
                                yqkVar = defpackage.rib.a;
                                yqkVar.l().ai(8162).u("cleanup");
                                if (ribVar.n != 0) {
                                    yqkVar.l().ai(8163).u("cleanup: This object wasn't initialized successfully.");
                                } else {
                                    ribVar.n = -1;
                                    context = ribVar.c;
                                    context.unregisterReceiver(ribVar.g);
                                    context.unregisterReceiver(ribVar.h);
                                    context.unregisterReceiver(ribVar.i);
                                    context.unregisterReceiver(ribVar.j);
                                    context.unregisterReceiver(ribVar.k);
                                    context.unregisterReceiver(ribVar.l);
                                    if (android.os.Build.VERSION.SDK_INT >= 35) {
                                        context.unregisterReceiver(ribVar.m);
                                    }
                                    rhsVar = ribVar.o;
                                    if (rhsVar != null) {
                                        rhsVar.d();
                                    }
                                }
                            }
                            this.i = null;
                            this.B.e();
                            this.B = null;
                            this.y = null;
                            this.d.e();
                            if (this.h == 1) {
                                this.e.unregisterReceiver(this.w);
                                this.D.quit();
                                this.D = null;
                                qtgVar = this.s;
                                if (qtgVar.c) {
                                    qtgVar.c = false;
                                    java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                                }
                                set = this.l;
                                synchronized (set) {
                                    while (r1.hasNext()) {
                                        a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                        rxsVar = this.n;
                                        zbeVar = defpackage.zbe.CAR_SERVICE;
                                        if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                            throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                        }
                                        rxsVar.d(zbeVar, defpackage.zbd.rE);
                                    }
                                    if (!set.isEmpty()) {
                                        android.os.Process.killProcess(android.os.Process.myPid());
                                    }
                                    defpackage.rxs rxsVar8 = this.n;
                                    ((defpackage.rxt) rxsVar8).a.b();
                                    ((defpackage.rxt) rxsVar8).b = -1;
                                    set.clear();
                                    this.x = this.h;
                                    this.h = -1;
                                }
                            } else {
                                this.D.quit();
                                this.D = null;
                                qtgVar = this.s;
                                if (qtgVar.c) {
                                    qtgVar.c = false;
                                    java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                                }
                                set = this.l;
                                synchronized (set) {
                                    while (r1.hasNext()) {
                                        a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                        rxsVar = this.n;
                                        zbeVar = defpackage.zbe.CAR_SERVICE;
                                        if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                            throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                        }
                                        rxsVar.d(zbeVar, defpackage.zbd.rE);
                                    }
                                    if (!set.isEmpty()) {
                                        android.os.Process.killProcess(android.os.Process.myPid());
                                    }
                                    defpackage.rxs rxsVar9 = this.n;
                                    ((defpackage.rxt) rxsVar9).a.b();
                                    ((defpackage.rxt) rxsVar9).b = -1;
                                    set.clear();
                                    this.x = this.h;
                                    this.h = -1;
                                }
                            }
                        }
                    } else {
                        this.B.e();
                        this.B = null;
                        this.y = null;
                        this.d.e();
                        if (this.h == 1) {
                            this.e.unregisterReceiver(this.w);
                            this.D.quit();
                            this.D = null;
                            qtgVar = this.s;
                            if (qtgVar.c) {
                                qtgVar.c = false;
                                java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                            }
                            set = this.l;
                            synchronized (set) {
                                while (r1.hasNext()) {
                                    a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                    rxsVar = this.n;
                                    zbeVar = defpackage.zbe.CAR_SERVICE;
                                    if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                        throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                    }
                                    rxsVar.d(zbeVar, defpackage.zbd.rE);
                                }
                                if (!set.isEmpty()) {
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                }
                                defpackage.rxs rxsVar10 = this.n;
                                ((defpackage.rxt) rxsVar10).a.b();
                                ((defpackage.rxt) rxsVar10).b = -1;
                                set.clear();
                                this.x = this.h;
                                this.h = -1;
                            }
                        } else {
                            this.D.quit();
                            this.D = null;
                            qtgVar = this.s;
                            if (qtgVar.c) {
                                qtgVar.c = false;
                                java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar.b);
                            }
                            set = this.l;
                            synchronized (set) {
                                while (r1.hasNext()) {
                                    a.h().ai(7861).y("Thread %s stuck in disconnect. Will kill process.", rwwVar);
                                    rxsVar = this.n;
                                    zbeVar = defpackage.zbe.CAR_SERVICE;
                                    if (rwwVar == defpackage.rww.AUDIO_CAPTURE_THREAD) {
                                        throw new java.lang.AssertionError("unknown thread type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rwwVar))));
                                    }
                                    rxsVar.d(zbeVar, defpackage.zbd.rE);
                                }
                                if (!set.isEmpty()) {
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                }
                                defpackage.rxs rxsVar11 = this.n;
                                ((defpackage.rxt) rxsVar11).a.b();
                                ((defpackage.rxt) rxsVar11).b = -1;
                                set.clear();
                                this.x = this.h;
                                this.h = -1;
                            }
                        }
                    }
                }
                throw th;
            }
            this.G.e(this);
        }
    }

    @Override // defpackage.qte
    public final defpackage.qwn A() throws java.lang.IllegalStateException {
        v(defpackage.zbd.zS);
        m();
        defpackage.qsa qsaVar = this.i;
        if (qsaVar != null) {
            return qsaVar;
        }
        throw new java.lang.IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qte
    public final qwt B() {
        v(defpackage.zbd.zO);
        return defpackage.rit.b;
    }

    @Override // defpackage.qte
    public final defpackage.qzd J() {
        defpackage.zbd zbdVar = defpackage.zbd.zJ;
        v(zbdVar);
        C(zbdVar);
        m();
        defpackage.qtd qtdVar = this.A;
        if (qtdVar == null || !qtdVar.m()) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
        return qtdVar;
    }

    @Override // defpackage.qte
    public final rjx P() {
        rjx rjxVar;
        defpackage.zbd zbdVar = defpackage.zbd.Ac;
        v(zbdVar);
        C(zbdVar);
        int callingUid = android.os.Binder.getCallingUid();
        defpackage.yhx yhxVar = rjt.a;
        android.content.Context context = this.C;
        if (java.util.Collections.disjoint(java.util.Arrays.asList(context.getPackageManager().getPackagesForUid(callingUid)), rjt.a)) {
            throw new java.lang.SecurityException("Calling package not allowed.");
        }
        synchronized (this.F) {
            if (this.E == null) {
                this.E = new qsl(context, this.b);
            }
            rjxVar = this.E;
        }
        return rjxVar;
    }

    @Override // defpackage.qte
    public final java.lang.String Y(java.lang.String str, java.lang.String str2) {
        defpackage.zbd zbdVar = defpackage.zbd.zX;
        v(zbdVar);
        C(zbdVar);
        return this.r.b(str, str2);
    }

    @Override // defpackage.qte
    public final void aA(byte[] bArr, int i) {
        defpackage.zbd zbdVar = defpackage.zbd.Am;
        v(zbdVar);
        C(zbdVar);
        defpackage.yyh yyhVarB = defpackage.yyh.b(i);
        if (yyhVarB == null) {
            yyhVarB = defpackage.yyh.UNKNOWN_EVENT_TYPE;
            a.h().ai(7862).w("Saw unknown CarEventType: %d.", i);
        }
        this.n.a(bArr, yyhVarB);
    }

    @Override // defpackage.qte
    public final void aC(com.google.android.gms.car.CarFrxEvent carFrxEvent) {
        defpackage.zbd zbdVar = defpackage.zbd.Ad;
        v(zbdVar);
        C(zbdVar);
        defpackage.abor aborVarN = defpackage.yzi.a.n();
        int i = carFrxEvent.a;
        if (i >= 0) {
            aborVarN.t();
            defpackage.yzi yziVar = (defpackage.yzi) aborVarN.b;
            yziVar.b |= 1;
            yziVar.c = i;
        }
        int i2 = carFrxEvent.b;
        if (i2 >= 0) {
            aborVarN.t();
            defpackage.yzi yziVar2 = (defpackage.yzi) aborVarN.b;
            yziVar2.b |= 2;
            yziVar2.d = i2;
        }
        int i3 = carFrxEvent.c;
        if (i3 >= 0) {
            aborVarN.t();
            defpackage.yzi yziVar3 = (defpackage.yzi) aborVarN.b;
            yziVar3.b |= 4;
            yziVar3.e = i3;
        }
        defpackage.rxs rxsVar = this.n;
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.yzi yziVar4 = (defpackage.yzi) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yziVar4.getClass();
        yygVar.h = yziVar4;
        yygVar.b |= 16;
        defpackage.yyh yyhVar = defpackage.yyh.FRX_STATE_CHANGE;
        int i4 = defpackage.ygw.d;
        ((defpackage.rxt) rxsVar).g(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    @Override // defpackage.qte
    public final void aM(defpackage.qxc qxcVar) {
        java.util.concurrent.CountDownLatch countDownLatch;
        defpackage.zbd zbdVar = defpackage.zbd.zH;
        v(zbdVar);
        C(zbdVar);
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7878).y("Registering %s", qxcVar.asBinder());
        java.util.Map map = this.c;
        int callingUid = android.os.Binder.getCallingUid();
        synchronized (map) {
            defpackage.aahg aahgVar = new defpackage.aahg(qxcVar, (android.os.IBinder.DeathRecipient) new qtf(this, qxcVar, callingUid));
            boolean zIsEmpty = map.isEmpty();
            if (map.put(qxcVar.asBinder(), aahgVar) != null) {
                yqkVar.f().ai(7880).u("listener already on list");
                return;
            }
            if (zIsEmpty) {
                countDownLatch = new java.util.concurrent.CountDownLatch(1);
                this.q = countDownLatch;
                defpackage.rbz.j(new defpackage.qnf(this, countDownLatch, 6));
            } else {
                countDownLatch = this.q;
            }
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper() && countDownLatch.getCount() != 0) {
                o();
                countDownLatch.countDown();
            }
            try {
                if (!countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    a.g().ai(7879).u("Failed to wait for initialization...");
                }
            } catch (java.lang.InterruptedException unused) {
            }
            synchronized (this.c) {
                try {
                    if (this.o.j()) {
                        qxcVar.b(this.h);
                    }
                    qxcVar.asBinder().linkToDeath(aahgVar.b, 0);
                } catch (android.os.RemoteException unused2) {
                    q(qxcVar.asBinder());
                }
            }
        }
    }

    @Override // defpackage.qte
    public final void aR(java.lang.String str, boolean z) {
        defpackage.zbd zbdVar = defpackage.zbd.zZ;
        v(zbdVar);
        C(zbdVar);
        this.r.c(str, z);
    }

    @Override // defpackage.qte
    public final void aW(java.lang.String str, java.lang.String str2) {
        defpackage.zbd zbdVar = defpackage.zbd.zY;
        v(zbdVar);
        C(zbdVar);
        this.r.b.edit().putString(str, str2).apply();
    }

    @Override // defpackage.qte
    public final java.util.List ad(java.lang.String str, java.util.List list) {
        defpackage.zbd zbdVar = defpackage.zbd.Ao;
        v(zbdVar);
        C(zbdVar);
        if ("car_module_feature_set".equals(str)) {
            return new java.util.ArrayList(this.J);
        }
        return new java.util.ArrayList(this.r.b.getStringSet(str, list != null ? new java.util.HashSet<>(list) : java.util.Collections.EMPTY_SET));
    }

    @Override // defpackage.qte
    public final void b() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7857).u("completeStartup, car service ready");
        this.r.i();
        synchronized (this.t) {
            if (u()) {
                this.b.d(defpackage.rwt.c);
            } else {
                yqkVar.l().ai(7858).u("car disconnected while service discovery");
            }
        }
    }

    @Override // defpackage.qte
    public final void bg(defpackage.qxc qxcVar) {
        defpackage.zbd zbdVar = defpackage.zbd.zI;
        v(zbdVar);
        C(zbdVar);
        q(qxcVar.asBinder());
    }

    @Override // defpackage.qte
    public final boolean bp(java.lang.String str, boolean z) {
        defpackage.zbd zbdVar = defpackage.zbd.zT;
        v(zbdVar);
        C(zbdVar);
        if ("car_force_logging".equals(str) && this.h == 0) {
            return true;
        }
        return this.r.d(str, z);
    }

    @Override // defpackage.qte
    public final boolean bq(java.lang.String str, boolean z) {
        defpackage.zbd zbdVar = defpackage.zbd.Ax;
        v(zbdVar);
        C(zbdVar);
        if (str.equals(defpackage.rpt.FULLSCREEN_PRESENTATION.f)) {
            return adbx.a.b().a();
        }
        if (str.equals(defpackage.rpt.USE_NORMAL_SETTINGS_ACCESSORS.f) || str.equals(defpackage.rpt.SHOULD_LOG_CAR_CLIENT_TOKEN_CONNECTION_EVENT.f)) {
            return true;
        }
        return z;
    }

    @Override // defpackage.qte
    public final boolean bs() {
        defpackage.zbd zbdVar = defpackage.zbd.zF;
        v(zbdVar);
        C(zbdVar);
        return this.o.j();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[LOOP:2: B:27:0x0088->B:30:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x009a A[EDGE_INSN: B:95:0x009a->B:32:0x009a BREAK  A[LOOP:2: B:27:0x0088->B:30:0x008e], SYNTHETIC] */
    @Override // defpackage.qte
    public final void c() {
        boolean z;
        rff[] rffVarArr;
        int i;
        defpackage.xpa xpaVar;
        if (this.f.getLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("startRequiredServices must be called from the default handler thread.");
        }
        defpackage.rtt rttVar = this.B.d;
        synchronized (rttVar.d) {
            rttVar.e = true;
            for (int i2 = 1; i2 < 255; i2++) {
                com.google.android.gms.car.senderprotocol.Channel channel = rttVar.c[i2];
                if (channel != null) {
                    channel.b();
                }
            }
        }
        synchronized (this.t) {
            z = this.u;
        }
        if (!this.A.m()) {
            if (this.B.a(this.A) != 0) {
                this.A.d = new defpackage.qub(this.e, this.D);
                if (!z) {
                    defpackage.rxs rxsVar = this.n;
                    defpackage.qtp qtpVar = this.r;
                    qrp qrpVar = this.y;
                    rxsVar.d(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yt);
                    defpackage.wyz wyzVar = this.o;
                    android.content.Context context = this.e;
                    this.z = new qrr(this, rxsVar, this, this, qtpVar, wyzVar, qrpVar, new defpackage.erh((java.lang.Object) context), context);
                    this.B.a(this.z);
                    rffVarArr = this.z.e;
                    int length = rffVarArr.length;
                    i = 0;
                    while (true) {
                        if (i < 3) {
                            n(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NO_AUDIO_MIC, "No audio/mic");
                            break;
                        } else {
                            if (rffVarArr[i] == null) {
                                break;
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                n(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NO_SENSORS2, "No sensors");
            }
        } else if (!z) {
            defpackage.rxs rxsVar2 = this.n;
            defpackage.qtp qtpVar2 = this.r;
            qrp qrpVar2 = this.y;
            rxsVar2.d(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yt);
            defpackage.wyz wyzVar2 = this.o;
            android.content.Context context2 = this.e;
            this.z = new qrr(this, rxsVar2, this, this, qtpVar2, wyzVar2, qrpVar2, new defpackage.erh((java.lang.Object) context2), context2);
            this.B.a(this.z);
            rffVarArr = this.z.e;
            int length2 = rffVarArr.length;
            i = 0;
            while (true) {
                if (i < 3) {
                    n(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NO_AUDIO_MIC, "No audio/mic");
                    break;
                } else if (rffVarArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        java.util.Iterator it = this.B.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                xpaVar = null;
                break;
            }
            byte[] bArr = (byte[]) it.next();
            try {
                defpackage.abox aboxVarD = defpackage.abox.D(defpackage.xpa.a, bArr, 0, bArr.length, defpackage.abol.a());
                defpackage.abox.U(aboxVarD);
                xpaVar = (defpackage.xpa) aboxVarD;
                if ((xpaVar.b & 32) != 0) {
                    break;
                }
            } catch (defpackage.abpp e) {
                a.g().p(e).ai(7860).u("Invalid service proto buf");
            }
        }
        if (xpaVar == null) {
            this.n.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qC);
            a.l().ai(7859).u("bluetooth endpoint is missing.");
        }
        defpackage.qsa qsaVar = new defpackage.qsa(this.C, this.n, this, this.H, this.o, this.b, this.v, xpaVar != null);
        this.B.a(qsaVar);
        if (qsaVar.j != null && android.os.Build.VERSION.SDK_INT >= 34) {
            qsaVar.p(qsaVar.j);
        } else if (!qsaVar.l && android.os.Build.VERSION.SDK_INT >= 34) {
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(qsaVar.k);
            java.util.function.Predicate predicateNot = j$.util.function.Predicate.-CC.not(new omr(18));
            predicateNot.getClass();
            if (true == optionalOfNullable.isPresent() && true != a$.ExternalSyntheticApiModelOutline2.m(predicateNot, optionalOfNullable.get())) {
                optionalOfNullable = j$.util.Optional.empty();
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(((com.google.android.gms.car.bluetooth.data.CarBluetoothData) optionalOfNullable.get()).a());
            }
            pvb pvbVar = new pvb(qsaVar, 3);
            if (true == optionalOfNullable.isPresent()) {
                ((defpackage.qsa) pvbVar.a).p(((android.bluetooth.BluetoothDevice) optionalOfNullable.get()).getAddress());
            }
        }
        this.i = qsaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qte
    public final void d(java.io.PrintWriter printWriter) {
        java.lang.String string;
        java.lang.String string2;
        defpackage.rwu rwuVar = this.b;
        printWriter.println("connected in service:" + u() + ", connected in client:" + rwuVar.a().equals(defpackage.rwt.c));
        java.util.Map map = this.c;
        printWriter.println("num car connection listeners:" + map.size());
        try {
            for (java.util.Map.Entry entry : map.entrySet()) {
                printWriter.println("listener " + java.lang.String.valueOf(entry.getKey()) + ":" + defpackage.rbz.c(this.C, ((defpackage.aahg) entry.getValue()).a));
            }
        } catch (java.util.ConcurrentModificationException unused) {
        }
        if (u()) {
            printWriter.println("connection type:" + this.h);
        } else {
            printWriter.println("last connection type:" + this.x);
        }
        if (this.j != null) {
            printWriter.println((true != u() ? "last car info:" : "car info:").concat(java.lang.String.valueOf(java.lang.String.valueOf(this.j))));
        }
        printWriter.println("\nCarServiceSettings");
        for (java.util.Map.Entry<java.lang.String, ?> entry2 : this.r.b.getAll().entrySet()) {
            printWriter.println(entry2.getKey() + ": " + java.lang.String.valueOf(entry2.getValue()));
        }
        this.G.c(printWriter);
        if (u()) {
            qrr qrrVar = this.z;
            if (qrrVar != null) {
                printWriter.println("\nCarAudioService");
                printWriter.println("Audio Sources");
                printWriter.println("force single channel capturing:" + qrrVar.h);
                qqk[] qqkVarArr = qrrVar.k;
                int length = qqkVarArr.length;
                for (int i = 0; i < 3; i++) {
                    qqk qqkVar = qqkVarArr[i];
                    if (qqkVar != null) {
                        qqh qqhVar = qqkVar.e;
                        boolean z = qqhVar != null && qqhVar.d;
                        printWriter.println("stream type: " + qqkVar.d + " has focus:" + z + " config chosen:" + java.lang.String.valueOf(qqkVar.h));
                        printWriter.println("Supported configs");
                        java.util.List list = qqkVar.g;
                        if (list != null) {
                            defpackage.you youVarListIterator = ((defpackage.ygw) list).listIterator(0);
                            while (youVarListIterator.hasNext()) {
                                defpackage.xig xigVar = (defpackage.xig) youVarListIterator.next();
                                if (xigVar != null) {
                                    printWriter.println("num bits:" + xigVar.d + " num chs:" + xigVar.e + " sampling rate:" + xigVar.c);
                                }
                            }
                        } else {
                            printWriter.println("null configs");
                        }
                    } else {
                        printWriter.println("null source service");
                    }
                }
                printWriter.println("Audio Source BHs");
                rff[] rffVarArr = qrrVar.e;
                int length2 = rffVarArr.length;
                for (int i2 = 0; i2 < 3; i2++) {
                    rff rffVar = rffVarArr[i2];
                    if (rffVar != null) {
                        rffVar.ft(printWriter);
                    } else {
                        printWriter.println("null source service BH");
                    }
                }
                printWriter.println("Audio Focus");
                qrp qrpVar = qrrVar.f;
                printWriter.println("car focus state:" + defpackage.tna.C(qrpVar.g) + " focusRequestSentToCar:" + defpackage.tna.B(qrpVar.h));
                rgm rgmVar = qrpVar.d.d;
                synchronized (rgmVar.d) {
                    string2 = rgmVar.c.toString();
                }
                printWriter.println("Audio focus grants: ".concat(java.lang.String.valueOf(string2)));
                printWriter.print("per channel focus states:");
                qqt qqtVar = qrpVar.b;
                printWriter.print("AudioStreamsManagerImpl per channel focus states:");
                int[] iArr = qqtVar.d;
                int length3 = iArr.length;
                for (int i3 = 0; i3 < 3; i3++) {
                    int i4 = iArr[i3];
                    printWriter.print(" ");
                    printWriter.print(java.lang.Integer.toHexString(i4));
                }
                printWriter.println(" ");
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                printWriter.println("num focus response fails:" + qrpVar.o + " last focus response fail time:" + qrpVar.p + " while now is:" + jElapsedRealtime);
            }
            defpackage.qtd qtdVar = this.A;
            if (qtdVar != null) {
                printWriter.println("\nCarSensorService");
                qtdVar.ft(printWriter);
            }
            defpackage.qsa qsaVar = this.i;
            if (t()) {
                printWriter.println("\nBluetoothService");
                printWriter.println("Preferred pairing method: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(qsaVar.c))));
                defpackage.rib ribVar = qsaVar.d;
                if (ribVar == null) {
                    string = "null";
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone MAC addr=");
                    defpackage.rhf rhfVar = ribVar.d;
                    sb.append(rhfVar == null ? "null" : defpackage.rib.a(rhfVar.c()));
                    sb.append(", peer MAC addr=");
                    defpackage.rhg rhgVar = ribVar.f;
                    sb.append(rhgVar == null ? "null" : defpackage.rib.a(rhgVar.b()));
                    sb.append(", init status=");
                    sb.append(ribVar.n);
                    sb.append(", ProfileUtil=");
                    sb.append(ribVar.o);
                    sb.append(", reqd pairing method=");
                    sb.append(ribVar.p);
                    sb.append(", reqd pairing key=");
                    sb.append(ribVar.q);
                    sb.append(", auth data from client=");
                    sb.append(ribVar.r);
                    string = sb.toString();
                }
                printWriter.println("BluetoothUtil info: ".concat(string));
                defpackage.rhn rhnVar = qsaVar.e;
                defpackage.khb khbVar = rhnVar.p;
                int i5 = rhnVar.n;
                int i6 = rhnVar.o;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("-------- BluetoothDumpManager --------\n");
                sb2.append(java.lang.String.format("unpairAttempts= %d, consecutiveUnpairAttempts= %d\n", java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6)));
                sb2.append("\nBluetoothFsmState records:");
                defpackage.yfi<android.util.Pair> yfiVar = (defpackage.yfi) khbVar.a;
                sb2.append(true != yfiVar.isEmpty() ? "\n" : "NULL\n");
                for (android.util.Pair pair : yfiVar) {
                    sb2.append(java.lang.String.format("  %s : %s\n", simpleDateFormat.format(new java.util.Date(((java.lang.Long) pair.first).longValue())), pair.second));
                }
                printWriter.println("BluetoothFsm info: ".concat(sb2.toString()));
                java.util.Iterator it = qsaVar.f.iterator();
                while (it.hasNext()) {
                    printWriter.println("Client: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(((defpackage.qrz) it.next()).a.asBinder()))));
                }
                printWriter.println("Initialization status: " + qsaVar.b);
            }
            defpackage.rvp rvpVar = this.B;
            if (rvpVar != null) {
                printWriter.println("\nProtocolManager");
                defpackage.rtt rttVar = rvpVar.d;
                if (rttVar != null) {
                    printWriter.println("\nChannelManager");
                    defpackage.rlz rlzVar = rttVar.t;
                    if (rlzVar.e) {
                        printWriter.println("\nGalSnoop message buffer:");
                        rlzVar.b(rttVar.u, printWriter);
                    } else {
                        printWriter.println("\nGalSnoop disabled");
                    }
                }
            }
            defpackage.rwu rwuVar2 = this.b;
            printWriter.println("Dumping history of connection state for Car Module:");
            defpackage.rwy rwyVar = (defpackage.rwy) rwuVar2;
            for (com.google.android.gms.car.diagnostics.ConnectionState connectionState : rwyVar.b()) {
                printWriter.println(connectionState.a + ":" + java.lang.String.valueOf(defpackage.rwt.values()[connectionState.b]));
            }
            printWriter.println("Dumping history of connection state for Car Module (human readable timestamps):");
            for (com.google.android.gms.car.diagnostics.ConnectionState connectionState2 : rwyVar.b()) {
                printWriter.println(java.lang.String.valueOf(android.text.format.DateFormat.format("yyyy-MM-dd kk:mm:ss.SSS", connectionState2.a)) + " (" + (android.os.SystemClock.elapsedRealtime() - connectionState2.d) + " elapsed realtime millis):" + java.lang.String.valueOf(defpackage.rwt.values()[connectionState2.b]));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, qxc] */
    @Override // defpackage.qte
    public final void e() {
        java.util.Map map = this.c;
        synchronized (map) {
            a.f().ai(7866).w("Notifying car connection listeners of setup failure (%d listeners)", map.size());
            for (defpackage.aahg aahgVar : map.values()) {
                try {
                    aahgVar.c.a(1);
                } catch (android.os.RemoteException unused) {
                    a.h().ai(7867).w("Unable to notify setup failure on listener(pid=%d)", aahgVar.a);
                }
            }
        }
    }

    @Override // defpackage.qte
    public final void f(com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        a.l().ai(7868).u("onCarDisconnected");
        defpackage.sqs.aw(android.os.Looper.myLooper() == this.f.getLooper(), "Teardown should happen in the default handler thread.");
        y(criticalError);
        if (this.p) {
            return;
        }
        this.d.h();
    }

    @Override // defpackage.qte
    public final void g() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7873).u("CarServiceBinderImpl::onPreflightComplete");
        if (!t()) {
            yqkVar.l().ai(7874).u("Bluetooth service null, skipping notifying");
            return;
        }
        defpackage.qsa qsaVar = this.i;
        defpackage.qsa.a.l().ai(7755).u("Car is authorized (preflight complete)");
        qsaVar.e.c(defpackage.rhj.EVENT_USER_AUTHORIZED);
    }

    @Override // defpackage.qte
    public final int h() {
        defpackage.zbd zbdVar = defpackage.zbd.zG;
        v(zbdVar);
        C(zbdVar);
        return this.o.g();
    }

    @Override // defpackage.qte
    public final void i(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, defpackage.rvp rvpVar, int i, int i2, boolean z, com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData) {
        int i3;
        int i4;
        boolean z2 = this.I;
        if (z2) {
            defpackage.qtq.d();
        }
        if (!z2) {
            this.d.f();
        }
        this.v = carBluetoothData;
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7875).w("prepareConnectionForServiceDiscovery, connectionType:%d", i);
        android.os.Process.setThreadPriority(-8);
        synchronized (this.t) {
            if (u()) {
                defpackage.omv.i(this.e, defpackage.yyn.CAR_SERVICE_PREPARING_FOR_SERVICE_DISCOVERY_WHEN_CONNECTED);
                if (z2) {
                    yqkVar.l().ai(7877).u("Requesting tearDownCarState to clear previous session state");
                    y(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.SESSION_OBSOLETE_DUE_TO_NEW_CONNECTION, defpackage.zak.UNKNOWN_DETAIL));
                }
            }
            if (z2) {
                this.d.f();
            }
            if (!z2 && u()) {
                i4 = i;
            } else {
                if (u()) {
                    throw new java.lang.IllegalStateException("initializeConnectedToCarState must only be called when not already connected/connecting");
                }
                this.b.d(defpackage.rwt.b);
                this.j = carInfoInternal;
                this.B = rvpVar;
                this.h = i;
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("Looper");
                this.D = handlerThread;
                handlerThread.start();
                if (i == 1) {
                    this.w = new qti(this);
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
                    yqkVar.l().ai(7882).u("Register usbDisconnectReceiver");
                    defpackage.duw.e(this.e, this.w, intentFilter, null, 2);
                    i3 = 1;
                } else {
                    i3 = i;
                }
                defpackage.qtg qtgVar = new defpackage.qtg(this);
                this.s = qtgVar;
                if (!qtgVar.c) {
                    qtgVar.c = true;
                    qtgVar.b = java.lang.Thread.getDefaultUncaughtExceptionHandler();
                    java.lang.Thread.setDefaultUncaughtExceptionHandler(qtgVar);
                }
                i4 = i3;
            }
            this.u = z;
            if (!z) {
                this.n.d(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.ys);
            }
            ((defpackage.rxt) this.n).b = i2;
            this.m = false;
            this.k = defpackage.zaj.UNKNOWN_CODE;
            android.util.SparseBooleanArray sparseBooleanArray = this.g;
            synchronized (sparseBooleanArray) {
                sparseBooleanArray.clear();
            }
            this.l.clear();
            if (z) {
                this.y = null;
            } else {
                defpackage.rxs rxsVar = this.n;
                rxsVar.d(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yu);
                this.y = new qrp(this.e, rxsVar, new qfz(this, 2), this.o, this);
            }
            android.content.Context context = this.e;
            defpackage.qub qubVar = new defpackage.qub(context, this.D);
            defpackage.qtd qtdVar = this.A;
            if (qtdVar == null) {
                defpackage.qtd qtdVar2 = new defpackage.qtd(this.o, this.b, context);
                this.A = qtdVar2;
                qtdVar2.d = qubVar;
            } else {
                qtdVar.d = qubVar;
                qubVar.f(qtdVar);
            }
            this.t.notifyAll();
            if (!z) {
                defpackage.rvp rvpVar2 = this.B;
                qrp qrpVar = this.y;
                defpackage.rua ruaVar = rvpVar2.d.g;
                ruaVar.i = qrpVar;
                ruaVar.i.d(ruaVar);
                synchronized (ruaVar.g) {
                    java.util.Queue<android.util.Pair> queue = ruaVar.h;
                    for (android.util.Pair pair : queue) {
                        ruaVar.i.f((defpackage.xik) pair.first, ((java.lang.Boolean) pair.second).booleanValue());
                    }
                    queue.clear();
                }
            }
        }
        if (defpackage.adax.a.fF().ad() && i4 == 2) {
            a.l().ai(7876).u("Not starting USB monitoring for WIFI connection.");
            this.G.e(this);
        } else {
            this.G.d(this, 1000);
        }
    }

    @Override // defpackage.qte
    public final void j() {
        a.l().ai(7888).u("tearDown");
        if (this.I) {
            defpackage.qtq.d();
        }
        y(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.UNKNOWN_CODE, defpackage.zak.UNKNOWN_DETAIL));
        r();
        this.d.h();
    }

    public final qrr k() {
        this.o.i();
        qrr qrrVar = this.z;
        if (qrrVar != null) {
            return qrrVar;
        }
        throw new java.lang.IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.rwv
    public final com.google.android.gms.car.CarInfo l() {
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = this.j;
        if (carInfoInternal != null) {
            return carInfoInternal.a;
        }
        return null;
    }

    public final void m() {
        this.b.c();
    }

    @Override // defpackage.rwx
    public final void n(defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        this.f.post(new defpackage.ye((java.lang.Object) this, zajVar, zakVar, str, 18));
    }

    public final void o() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7869).u("CSB onClientsConnected");
        if (this.p) {
            yqkVar.f().ai(7870).u("Already connected");
        } else {
            this.p = true;
        }
    }

    @Override // defpackage.rvm
    public final void p(defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        android.util.SparseBooleanArray sparseBooleanArray = this.g;
        synchronized (sparseBooleanArray) {
            sparseBooleanArray.put(zajVar.D, true);
        }
        if (zajVar != defpackage.zaj.CONNECTION_ERROR || this.h != 1) {
            n(zajVar, zakVar, str);
            return;
        }
        android.util.SparseBooleanArray sparseBooleanArray2 = this.g;
        synchronized (sparseBooleanArray2) {
            if (sparseBooleanArray2.get(3, false)) {
                return;
            }
            this.f.postDelayed(new defpackage.ye((java.lang.Object) this, zajVar, zakVar, str, 19), 1500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    public final void q(android.os.IBinder iBinder) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7883).y("Removing %s", iBinder);
        java.util.Map map = this.c;
        synchronized (map) {
            defpackage.aahg aahgVar = (defpackage.aahg) map.get(iBinder);
            if (aahgVar == null) {
                yqkVar.f().ai(7884).u("listener not found in list");
                return;
            }
            map.remove(iBinder);
            iBinder.unlinkToDeath(aahgVar.b, 0);
            if (map.isEmpty()) {
                this.q = null;
                defpackage.rbz.j(new defpackage.qjo(this, 20, null));
            }
        }
    }

    public final void r() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7892).u("tearDownClientState");
        defpackage.sqs.aw(android.os.Looper.myLooper() == this.f.getLooper(), "Tear down must happen in default handler thread.");
        if (this.p) {
            this.p = false;
        } else {
            yqkVar.f().ai(7893).u("Skip, no clients bound.");
        }
    }

    @Override // defpackage.qte
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.car.CarInfo s() {
        defpackage.zbd zbdVar = defpackage.zbd.zD;
        v(zbdVar);
        C(zbdVar);
        m();
        return l();
    }

    public final boolean t() {
        defpackage.qsa qsaVar = this.i;
        return (qsaVar == null || qsaVar.b == -6) ? false : true;
    }

    public final boolean u() {
        defpackage.rwt rwtVarA = this.b.a();
        return rwtVarA.equals(defpackage.rwt.c) || rwtVarA.equals(defpackage.rwt.b);
    }

    @Override // defpackage.qte
    public final qvc w(com.google.android.gms.car.CreateAudioPolicyRequest createAudioPolicyRequest, quz quzVar, qvf qvfVar) {
        defpackage.zbd zbdVar = defpackage.zbd.AQ;
        v(zbdVar);
        C(zbdVar);
        defpackage.sqs.aB(createAudioPolicyRequest, "request");
        defpackage.sqs.aB(quzVar, "deathNotifier");
        defpackage.yqk yqkVar = rgw.a;
        rif rifVar = new rif(this.e);
        if (qvfVar != null) {
            rifVar.h(new rgu(qvfVar));
        }
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (com.google.android.gms.car.AudioPolicyMixData audioPolicyMixData : createAudioPolicyRequest.a) {
            ygrVar.i(java.lang.Integer.valueOf(rifVar.g(audioPolicyMixData.a, audioPolicyMixData.b, audioPolicyMixData.c)));
        }
        return new rgw(rifVar.k(), quzVar, ygrVar.g(), this.n);
    }

    @Override // defpackage.qte
    public final qvi x(com.google.android.gms.car.CreateAudioRecordRequest createAudioRecordRequest, quz quzVar) {
        rgz rgzVarH;
        defpackage.zbd zbdVar = defpackage.zbd.AR;
        v(zbdVar);
        C(zbdVar);
        defpackage.sqs.aB(createAudioRecordRequest, "request");
        defpackage.sqs.aB(quzVar, "deathNotifier");
        defpackage.yqk yqkVar = rgy.a;
        if (createAudioRecordRequest.a) {
            defpackage.ysr.bk(!defpackage.sqs.e(), "createViaReflection is only allowed prior to Android Q");
            rgzVarH = sqg.i(createAudioRecordRequest.b, createAudioRecordRequest.c);
        } else {
            rgzVarH = sqg.h(createAudioRecordRequest.d, createAudioRecordRequest.c, createAudioRecordRequest.e, createAudioRecordRequest.f, createAudioRecordRequest.b);
        }
        if (rgzVarH == null) {
            return null;
        }
        return new rgy(rgzVarH, quzVar, this.n);
    }

    @Override // defpackage.qte
    public final defpackage.qvx z() {
        defpackage.zbd zbdVar = defpackage.zbd.zK;
        v(zbdVar);
        C(zbdVar);
        return k();
    }

    @Override // defpackage.qte
    public final defpackage.qte a() {
        return this;
    }
}
