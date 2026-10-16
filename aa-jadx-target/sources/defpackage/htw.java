package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class htw {
    public final java.lang.Object a;

    public htw(char[] cArr, char[] cArr2) {
        defpackage.ygw ygwVarA = defpackage.tht.a(new lkg(1), defpackage.acsv.d());
        ygwVarA.getClass();
        this.a = ygwVarA;
    }

    public static defpackage.htw B(javax.microedition.khronos.egl.EGLContext eGLContext) {
        return eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT ? uwk.c : new defpackage.htw(eGLContext);
    }

    private static final java.lang.Boolean C(int i) {
        if (i != 0) {
            return (i == 3 || i == 4) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return null;
    }

    private static final boolean D(int i) {
        return i == 2 || i == 4;
    }

    public static /* synthetic */ java.lang.Object o(java.lang.Object obj) {
        defpackage.yqm yqmVar = defpackage.kzb.a;
        defpackage.abor aborVarN = defpackage.kxg.a.n();
        aborVarN.t();
        defpackage.kxg kxgVar = (defpackage.kxg) aborVarN.b;
        kxgVar.b |= 1;
        kxgVar.c = true;
        return (defpackage.kxg) aborVarN.q();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vbi */
    public static boolean w(android.app.ActivityManager activityManager) throws vbi {
        if (activityManager == null) {
            throw new vbi("ActivityManager is not available.");
        }
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            vbn.d();
            java.lang.String strR = vvb.R();
            if (strR == null) {
                strR = "<?>";
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(strR)) {
                    return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
                }
            }
        }
        throw new vbi("Process not found in running list");
    }

    public final uyx A() {
        return (uyx) ((defpackage.xyn) this.a).d(uyx.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void a(hus husVar, hww hwwVar) {
        ?? r1 = this.a;
        if (hwwVar.equals(r1.get(husVar))) {
            r1.remove(husVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [huj, java.lang.Object] */
    public final synchronized huj b(java.lang.Class cls) {
        for (defpackage.kqe kqeVar : this.a) {
            if (((java.lang.Class) kqeVar.b).isAssignableFrom(cls)) {
                return kqeVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(java.lang.Class cls, huj hujVar) {
        this.a.add(new defpackage.kqe(cls, hujVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [idf, java.lang.Object] */
    public final synchronized idf d(java.lang.Class cls, java.lang.Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return idg.a;
        }
        for (defpackage.ndd nddVar : this.a) {
            if (nddVar.w(cls, cls2)) {
                return nddVar.c;
            }
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bK(cls2, cls, "No transcoder registered to transcode from ", " to "));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized java.util.List e(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (defpackage.ndd nddVar : this.a) {
            if (nddVar.w(cls, cls2)) {
                java.lang.Object obj = nddVar.a;
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void f(java.lang.Class cls, java.lang.Class cls2, idf idfVar) {
        this.a.add(new defpackage.ndd(cls, cls2, (java.lang.Object) idfVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized htn g(java.nio.ByteBuffer byteBuffer) {
        htn htnVar;
        htnVar = (htn) this.a.poll();
        if (htnVar == null) {
            htnVar = new htn();
        }
        htnVar.b = null;
        java.util.Arrays.fill(htnVar.a, (byte) 0);
        htnVar.c = new htm();
        htnVar.d = 0;
        htnVar.b = byteBuffer.asReadOnlyBuffer();
        htnVar.b.position(0);
        htnVar.b.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return htnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void h(htn htnVar) {
        htnVar.b = null;
        htnVar.c = null;
        this.a.offer(htnVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void i() {
        this.a.clear();
    }

    public final llg j(boolean z) {
        return D(((android.os.Bundle) this.a).getInt(true != z ? "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT" : "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT")) ? llg.b : llg.a;
    }

    public final llg k() {
        return D(((android.os.Bundle) this.a).getInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT")) ? llg.b : llg.a;
    }

    public final java.lang.Boolean l() {
        return C(((android.os.Bundle) this.a).getInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT"));
    }

    public final java.lang.Boolean m(boolean z) {
        return C(((android.os.Bundle) this.a).getInt(true != z ? "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT" : "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT"));
    }

    public final boolean n(boolean z) {
        return ((android.os.Bundle) this.a).containsKey(true != z ? "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT" : "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT");
    }

    public final android.os.UserHandle p() {
        return (android.os.UserHandle) j$.util.Collection.-EL.stream(((android.os.UserManager) this.a).getUserProfiles()).filter(new defpackage.koo(this, 9)).findFirst().orElse((java.lang.Object) null);
    }

    public final java.lang.String q() {
        rse rseVar = (rse) this.a;
        return (rseVar.b & 1) != 0 ? rseVar.c : "com.google.android.gms.car.CONNECTIVITY_EVENT";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public final boolean r(android.content.Intent intent) {
        boolean z;
        boolean zEquals = q().equals(intent.getAction());
        rse rseVar = (rse) this.a;
        boolean z2 = zEquals & ((rseVar.b & 2) == 0 || intent.getIntExtra("stage_state", -1) == rseVar.d);
        if ((rseVar.b & 4) != 0) {
            int intExtra = intent.getIntExtra("event_type", -1);
            defpackage.yyn yynVarB = defpackage.yyn.b(rseVar.e);
            if (yynVarB == null) {
                yynVarB = defpackage.yyn.UNKNOWN;
            }
            z = intExtra == yynVarB.pE;
        }
        return z2 & z;
    }

    public final boolean s() {
        return !((defpackage.ygw) this.a).isEmpty();
    }

    public final java.lang.String t() {
        try {
            java.lang.Object obj = this.a;
            return defpackage.a.bA(((com.google.android.gms.pseudonymous.PseudonymousIdToken) defpackage.sqs.aU(new svx((android.content.Context) obj).a(), true != wjc.m((android.content.Context) obj) ? 1000L : 3000L, java.util.concurrent.TimeUnit.MILLISECONDS)).a, "NID=");
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            android.util.Log.e("SurveyPseudonymousIdProviderZwieback", "Task was interrupted while fetching Zwieback ID.", e);
            return "";
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e("SurveyPseudonymousIdProviderZwieback", "Task failed while fetching Zwieback ID.", e2);
            return "";
        } catch (java.util.concurrent.TimeoutException e3) {
            android.util.Log.e("SurveyPseudonymousIdProviderZwieback", "Task timed out while fetching Zwieback ID.", e3);
            return "";
        }
    }

    public final abtl u(android.location.Location location) {
        defpackage.abor aborVarN = abtl.a.n();
        aborVarN.t();
        abtl abtlVar = aborVarN.b;
        abtlVar.c = 1;
        abtlVar.b |= 1;
        aborVarN.t();
        abtl abtlVar2 = aborVarN.b;
        abtlVar2.d = 12;
        abtlVar2.b |= 2;
        aborVarN.t();
        abtl abtlVar3 = aborVarN.b;
        abtlVar3.h = 8;
        abtlVar3.b |= 32768;
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(location.getTime());
        int i = zft.a;
        long jZ = durationOfMillis.getSeconds() < -9223372036854L ? defpackage.a.z(defpackage.zfh.h(durationOfMillis.getSeconds() + 1), (durationOfMillis.getNano() / 1000) - 1000000) : defpackage.a.z(defpackage.zfh.h(durationOfMillis.getSeconds()), durationOfMillis.getNano() / 1000);
        aborVarN.t();
        abtl abtlVar4 = aborVarN.b;
        abtlVar4.b |= 4;
        abtlVar4.e = jZ;
        int i2 = ((android.content.Context) this.a).checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 ? 3 : 2;
        aborVarN.t();
        abtl abtlVar5 = aborVarN.b;
        abtlVar5.i = i2 - 1;
        abtlVar5.b |= 2097152;
        defpackage.abor aborVarN2 = abtj.a.n();
        int iJ = vjx.j(location.getLatitude());
        aborVarN2.t();
        abtj abtjVar = aborVarN2.b;
        abtjVar.b = 1 | abtjVar.b;
        abtjVar.c = iJ;
        int iJ2 = vjx.j(location.getLongitude());
        aborVarN2.t();
        abtj abtjVar2 = aborVarN2.b;
        abtjVar2.b |= 2;
        abtjVar2.d = iJ2;
        aborVarN.t();
        abtl abtlVar6 = aborVarN.b;
        abtj abtjVarQ = aborVarN2.q();
        abtjVarQ.getClass();
        abtlVar6.f = abtjVarQ;
        abtlVar6.b |= 16;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy() * 1000.0f;
            aborVarN.t();
            abtl abtlVar7 = aborVarN.b;
            abtlVar7.b |= 128;
            abtlVar7.g = accuracy;
        }
        abtk.a.n();
        return aborVarN.q();
    }

    public final boolean v() throws vbi {
        return w((android.app.ActivityManager) ((android.content.Context) this.a).getSystemService("activity"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final vav x(java.lang.Object obj, defpackage.xzi xziVar) {
        return (vav) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent((java.util.concurrent.ConcurrentMap) this.a, obj, new defpackage.mjc(xziVar, 20));
    }

    public final synchronized void y(java.lang.Object obj, java.util.concurrent.Executor executor) {
        vbd vbdVar = (vbd) ((java.util.HashMap) this.a).put(obj, new vbd(obj, executor));
        if (vbdVar != null && vbdVar.c != executor) {
            throw new java.lang.IllegalArgumentException("Listener already registered with different executor.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void z(java.util.function.Consumer consumer) {
        defpackage.yhe yheVarJ;
        synchronized (this) {
            yheVarJ = defpackage.yhe.j(this.a);
        }
        defpackage.yot it = yheVarJ.entrySet().iterator();
        while (it.hasNext()) {
            vbd vbdVar = (vbd) ((java.util.Map.Entry) it.next()).getValue();
            if (!vbdVar.a) {
                vbdVar.c.execute(new uzz(vbdVar, consumer));
            }
        }
    }

    public htw(java.lang.Object obj) {
        this.a = obj;
    }

    public htw(short[] sArr) {
        this.a = new defpackage.kuy(13);
    }

    public htw() {
        this.a = new aium();
    }

    public htw(android.content.Context context, byte[] bArr, byte[] bArr2) {
        this.a = new vna(context);
    }

    public htw(char[] cArr, short[] sArr) {
        this.a = defpackage.ysr.aQ(new defpackage.typ(11));
    }

    public htw(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.HashMap();
        new java.util.HashMap();
    }

    public htw(byte[] bArr, byte[] bArr2, short[] sArr) {
        this.a = new java.util.HashMap();
    }

    public htw(byte[] bArr, int[] iArr) {
        this.a = new java.util.ArrayDeque();
    }

    public htw(byte[] bArr) {
        this.a = new java.util.ArrayDeque();
    }

    public htw(int[] iArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public htw(defpackage.xzi xziVar) {
        this.a = new vaw(xziVar);
    }

    public htw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new java.util.HashMap();
    }

    public htw(char[] cArr, byte[] bArr) {
        char[] cArr2 = defpackage.igg.a;
        this.a = new java.util.ArrayDeque(0);
    }

    public htw(byte[] bArr, char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public htw(char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public htw(android.content.Context context) {
        this.a = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
    }

    public htw(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = defpackage.afga.cA(new defpackage.kbl(14));
    }

    public htw(android.content.Context context, char[] cArr, byte[] bArr) {
        this.a = context;
    }

    public htw(android.os.Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    public /* synthetic */ htw(byte[] bArr, byte[] bArr2, char[] cArr) {
        this(new android.os.Bundle());
    }
}
