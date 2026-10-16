package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfv extends defpackage.yrw {
    public static boolean a;
    public static java.util.concurrent.Executor b;
    public static final j$.util.concurrent.ConcurrentHashMap c;
    public static final java.util.Map d;
    public static final java.util.Map e;
    private static final defpackage.yhe f;
    private static final defpackage.yhe g;
    private static final defpackage.ygw h;
    private final java.lang.String i;
    private final defpackage.tfu j;
    private final boolean k;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f("GH.Assistant", defpackage.tfu.b);
        yhaVar.f("GH.CallManager", defpackage.tfu.d);
        yhaVar.f("CAR.AUDIO", defpackage.tfu.c);
        yhaVar.f("CAR.GAL.AUDIO", defpackage.tfu.c);
        yhaVar.f("CAR.GAL.MIC", defpackage.tfu.c);
        yhaVar.f("CAR.GAL.SYNC", defpackage.tfu.c);
        yhaVar.f("GH.SharedNotifications", defpackage.tfu.e);
        f = yhaVar.d(true);
        c = new j$.util.concurrent.ConcurrentHashMap();
        d = new j$.util.concurrent.ConcurrentHashMap(defpackage.yhe.o(defpackage.tfu.a, new defpackage.yoj(new defpackage.yfd(0)), defpackage.tfu.b, new defpackage.yoj(new defpackage.yfd(50)), defpackage.tfu.c, new defpackage.yoj(new defpackage.yfd(0)), defpackage.tfu.d, new defpackage.yoj(new defpackage.yfd(0)), defpackage.tfu.e, new defpackage.yoj(new defpackage.yfd(0))));
        defpackage.yhe yheVarO = defpackage.yhe.o(defpackage.tfu.a, new defpackage.vqk(0), defpackage.tfu.b, new defpackage.vqk(50), defpackage.tfu.c, new defpackage.vqk(0), defpackage.tfu.d, new defpackage.vqk(0), defpackage.tfu.e, new defpackage.vqk(0));
        g = yheVarO;
        e = new j$.util.concurrent.ConcurrentHashMap(yheVarO);
        h = defpackage.ygw.v("GH", "CAR", "CarApp.H", "ADU", "XRAY", "PCTS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tfv(java.lang.String str) {
        super(str);
        boolean z = false;
        java.lang.String strSubstring = str.substring(0, java.lang.Math.min(str.length(), 23));
        this.i = strSubstring;
        defpackage.tfu tfuVar = defpackage.tfu.a;
        java.lang.String strBC = defpackage.ysr.bC(strSubstring);
        defpackage.yot it = f.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (strBC.startsWith(defpackage.ysr.bC((java.lang.String) entry.getKey()))) {
                tfuVar = (defpackage.tfu) entry.getValue();
                break;
            }
        }
        this.j = tfuVar;
        defpackage.ygw ygwVar = h;
        int i = ((defpackage.ymx) ygwVar).c;
        int i2 = 0;
        while (i2 < i) {
            java.lang.String str2 = (java.lang.String) ygwVar.get(i2);
            i2++;
            if (this.i.startsWith(str2)) {
                z = true;
                break;
            }
        }
        this.k = z;
    }

    public static void c(java.io.PrintWriter printWriter) {
        for (defpackage.tfu tfuVar : defpackage.tfu.values()) {
            d(printWriter, tfuVar);
        }
    }

    public static void d(java.io.PrintWriter printWriter, defpackage.tfu tfuVar) {
        java.util.Queue queue = (java.util.Queue) d.get(tfuVar);
        queue.getClass();
        synchronized (queue) {
            printWriter.println(java.lang.String.format(java.util.Locale.ROOT, "[%s] Dumping the last %d logs.", tfuVar.name(), java.lang.Integer.valueOf(queue.size())));
            java.util.Iterator it = queue.iterator();
            while (it.hasNext()) {
                printWriter.println(((defpackage.tfq) it.next()).b());
            }
        }
    }

    public static void e(defpackage.tfu tfuVar, int i) {
        java.util.Map map = d;
        java.util.Queue queue = (java.util.Queue) map.get(tfuVar);
        queue.getClass();
        defpackage.yfd yfdVar = new defpackage.yfd(i);
        synchronized (queue) {
            yfdVar.addAll(queue);
            map.put(tfuVar, new defpackage.yoj(yfdVar));
        }
        java.util.Map map2 = e;
        defpackage.vqk vqkVar = (defpackage.vqk) map2.get(tfuVar);
        vqkVar.getClass();
        defpackage.vqk vqkVar2 = new defpackage.vqk(i);
        for (defpackage.vqh vqhVar : vqkVar.b(vqkVar.b, Integer.MAX_VALUE)) {
            vqkVar2.a(vqhVar);
        }
        map2.put(tfuVar, vqkVar2);
    }

    private static int h(defpackage.tfu tfuVar) {
        java.lang.Integer num = (java.lang.Integer) c.get(tfuVar);
        if (num == null) {
            return 7;
        }
        return num.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    private final void i(defpackage.tfu tfuVar, defpackage.yqt yqtVar) {
        java.lang.String name;
        defpackage.vqg vqgVar;
        defpackage.vqh vqhVar;
        java.lang.Long l;
        java.util.concurrent.Executor executor;
        int iF = defpackage.ysr.f(yqtVar.g());
        java.lang.String str = this.i;
        if (defpackage.sqs.aI(str, iF, h(tfuVar))) {
            java.util.Queue queue = (java.util.Queue) d.get(tfuVar);
            queue.getClass();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            defpackage.yrv yrvVarD = yqtVar.d();
            if (yrvVarD != null) {
                name = yrvVarD.b;
            } else {
                java.lang.Object objE = yqtVar.e();
                name = objE instanceof java.lang.String ? (java.lang.String) objE : objE != null ? objE.getClass().getName() : "null";
            }
            defpackage.tfq tfqVar = new defpackage.tfq(jCurrentTimeMillis, iF, str, name, yqtVar.d() != null ? yqtVar.i() : null);
            queue.offer(tfqVar);
            if (a && tfqVar.c != null && (executor = b) != null) {
                executor.execute(new defpackage.rzu(tfqVar, 13));
            }
            defpackage.vqk vqkVar = (defpackage.vqk) e.get(tfuVar);
            vqkVar.getClass();
            defpackage.tfs tfsVar = new defpackage.tfs(yqtVar);
            java.lang.Boolean bool = (java.lang.Boolean) tfsVar.c().d(defpackage.vqf.a);
            if (bool == null || !bool.booleanValue()) {
                vqgVar = null;
            } else {
                defpackage.yrv yrvVarD2 = tfsVar.d();
                java.lang.String string = yrvVarD2 == null ? tfsVar.e().toString() : yrvVarD2.b;
                java.lang.String strE = tfsVar.an().e();
                if (strE == null || (l = (java.lang.Long) tfsVar.c().d(defpackage.vqf.b)) == null) {
                    vqgVar = null;
                } else {
                    vqgVar = new defpackage.vqg(tfsVar.g(), string, strE, l.longValue());
                }
            }
            if (tfsVar.d() == null) {
                vqhVar = new defpackage.vqh(tfsVar.an().b(), tfsVar.an().d(), tfsVar.an().a(), tfsVar.am(), vqgVar);
            } else {
                java.lang.Object[] objArrI = tfsVar.i();
                int i = 0;
                for (java.lang.Object obj : objArrI) {
                    if (defpackage.vqh.a(obj)) {
                        i++;
                    }
                }
                if (i == 0) {
                    vqhVar = new defpackage.vqh(tfsVar.an().b(), tfsVar.an().d(), tfsVar.an().a(), tfsVar.am(), vqgVar);
                } else {
                    int[] iArr = new int[i];
                    java.lang.String[] strArr = new java.lang.String[i];
                    int i2 = 0;
                    for (int i3 = 0; i3 < objArrI.length; i3++) {
                        java.lang.Object obj2 = objArrI[i3];
                        if (defpackage.vqh.a(obj2)) {
                            iArr[i2] = i3;
                            strArr[i2] = obj2 == null ? "null" : ((defpackage.vqq) obj2).b();
                            i2++;
                        }
                    }
                    vqhVar = new defpackage.vqh(tfsVar.an().b(), tfsVar.an().d(), tfsVar.an().a(), tfsVar.am(), iArr, strArr, vqgVar);
                }
            }
            synchronized (vqkVar) {
                vqkVar.a(vqhVar);
            }
        }
    }

    @Override // defpackage.yqu
    public final void a(defpackage.yqt yqtVar) {
        defpackage.tfu tfuVar = this.j;
        i(tfuVar, yqtVar);
        defpackage.tfu tfuVar2 = defpackage.tfu.a;
        if (tfuVar != tfuVar2) {
            i(tfuVar2, yqtVar);
        }
    }

    @Override // defpackage.yqu
    public final boolean b(java.util.logging.Level level) {
        if (!this.k) {
            return false;
        }
        int iF = defpackage.ysr.f(level);
        java.lang.String str = this.i;
        defpackage.tfu tfuVar = this.j;
        if (defpackage.sqs.aI(str, iF, h(tfuVar))) {
            return true;
        }
        defpackage.tfu tfuVar2 = defpackage.tfu.a;
        return tfuVar != tfuVar2 && defpackage.sqs.aI(str, iF, h(tfuVar2));
    }
}
