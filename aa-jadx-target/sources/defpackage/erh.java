package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class erh {
    public final java.lang.Object a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public erh(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new java.util.EnumMap(qcr.class);
        for (qcr qcrVar : qcr.values()) {
            this.a.put(qcrVar, new defpackage.rox(null, null, null));
        }
    }

    public static int B(defpackage.eqa eqaVar, java.lang.Object obj, java.lang.Object obj2) {
        return ejk.a((elt) eqaVar.b, 1, obj) + ejk.a((elt) eqaVar.d, 2, obj2);
    }

    public static void C(eje ejeVar, defpackage.eqa eqaVar, java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
        ejk.f(ejeVar, (elt) eqaVar.b, 1, obj);
        ejk.f(ejeVar, (elt) eqaVar.d, 2, obj2);
    }

    public static defpackage.erh J(int i, int i2, int i3, int i4, boolean z) {
        return new defpackage.erh(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static defpackage.erh K(int i, int i2, int i3) {
        return new defpackage.erh(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public static int[] Y(java.lang.String str) {
        try {
            if (str.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Version string is empty");
            }
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = java.lang.Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (java.lang.RuntimeException e) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Unable to parse HTTP flags version string: `", "`"), e);
        }
    }

    public final void A(int i, long j) throws java.io.IOException {
        ((eje) this.a).A(i, j);
    }

    public final void D() {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void E(float f) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void F(long j) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void G(ecb ecbVar) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            if (ecbVar != null) {
                view.animate().setListener(new eca(ecbVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void H(float f) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void I() {
        ((defpackage.ebj) this.a).a();
    }

    public final void L(int i) {
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = ((ajli) obj).b;
        synchronized (obj2) {
            long j = i;
            long[] jArr = (long[]) ((android.util.LongSparseArray) obj2).get(j);
            if (jArr == null) {
                return;
            }
            long j2 = jArr[0] - 1;
            jArr[0] = j2;
            if (j2 <= 0) {
                ((android.util.LongSparseArray) obj2).delete(j);
            } else {
                long j3 = ((ajli) obj).a + 1;
                ((ajli) obj).a = j3;
                jArr[1] = j3;
            }
        }
    }

    public final void M(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        ((defpackage.sbg) this.a).e(defpackage.rrw.h(defpackage.yzd.FRX, zbeVar, zbdVar).l());
    }

    public final rif N() {
        return new rif((android.content.Context) this.a);
    }

    public final int O(long j) {
        return ((android.media.MediaCodec) this.a).dequeueInputBuffer(j);
    }

    public final java.nio.ByteBuffer[] P() {
        return ((android.media.MediaCodec) this.a).getOutputBuffers();
    }

    public final void Q(int i, int i2, long j, int i3) {
        ((android.media.MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    public final byte[] R(android.content.Context context, long j, int i, long j2, int i2, byte[] bArr, qdz qdzVar) {
        try {
            java.lang.Object obj = this.a;
            android.os.Bundle preparedCall = ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) obj).getPreparedCall(j, i, bArr);
            if (j2 != -4319067186032159575L) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bM(j2, "Unknown type identifier "));
            }
            context.getApplicationContext();
            qeq[] qeqVarArr = defpackage.kif.a.c;
            if (i2 >= 3) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i2, "Invalid method identifier"));
            }
            return ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) obj).prepareResponse(j, qeqVarArr[i2].a(preparedCall, qdzVar));
        } catch (java.lang.Error e) {
            android.os.Bundle bundle = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", e);
            byte[] bArrPrepareResponse = ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) this.a).prepareResponse(j, bundle);
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new qep(), 5000L);
            return bArrPrepareResponse;
        } catch (java.lang.RuntimeException e2) {
            android.os.Bundle bundle2 = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e2);
            byte[] bArrPrepareResponse2 = ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) this.a).prepareResponse(j, bundle2);
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new qep(e2), 5000L);
            return bArrPrepareResponse2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.lang.Object S(qcu qcuVar) {
        ((defpackage.rox) this.a.get(qcuVar.b)).getClass();
        return qcuVar.a();
    }

    public final /* synthetic */ void T(qcp qcpVar) {
        sjc sjcVar = ((qcc) S(qcpVar)).a;
    }

    public final /* synthetic */ void U(qco qcoVar) {
    }

    public final /* synthetic */ void V(qct qctVar) {
    }

    public final /* synthetic */ void W(qcs qcsVar) {
        sje sjeVar = ((qcd) S(qcsVar)).a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Map X() {
        return j$.util.DesugarCollections.unmodifiableMap((java.util.Map) this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void Z(ajji ajjiVar) {
        this.a.remove(ajjiVar);
    }

    public final void a(java.lang.Object obj) {
        java.util.ArrayList arrayList = null;
        if (!(obj instanceof java.util.List)) {
            if (!(obj instanceof android.os.Parcel)) {
                ((android.service.media.MediaBrowserService.Result) this.a).sendResult(null);
                return;
            }
            android.os.Parcel parcel = (android.os.Parcel) obj;
            parcel.setDataPosition(0);
            ((android.service.media.MediaBrowserService.Result) this.a).sendResult(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        java.lang.Object obj2 = this.a;
        java.util.List<android.os.Parcel> list = (java.util.List) obj;
        if (list != null) {
            arrayList = new java.util.ArrayList(list.size());
            for (android.os.Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((android.media.browse.MediaBrowser.MediaItem) android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        ((android.service.media.MediaBrowserService.Result) obj2).sendResult(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void aa(ajji ajjiVar) {
        this.a.add(ajjiVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean ab(ajji ajjiVar) {
        return this.a.contains(ajjiVar);
    }

    public final void ac(java.lang.String str, java.lang.String str2) {
        str.getClass();
        ailc.e(str);
        ailc.f(str2, str);
        ailc.i(this, str, str2);
    }

    public final int ad() {
        return ((uas) this.a).e;
    }

    public final defpackage.ygw ae() {
        defpackage.ygw ygwVar = ((uas) this.a).c;
        int i = ((defpackage.ymx) ygwVar).c;
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new defpackage.sr((uau) ygwVar.get(i2)));
        }
        return defpackage.ygw.o(arrayList);
    }

    public final java.lang.Object af() {
        return ((uas) this.a).b;
    }

    public final boolean ag() {
        return ((uas) this.a).d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ztp] */
    public final java.lang.String ah() {
        return this.a.a();
    }

    public final void ai(ajnd ajndVar) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(ajndVar != null ? new nv(ajndVar, 2, (byte[]) null) : null);
        }
    }

    public final int b() {
        return ((uoa) this.a).a;
    }

    public final android.os.Bundle c() {
        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        uoa uoaVar = (uoa) this.a;
        defpackage.fbo.c(bundleU, "nav-entry-state:id", (java.lang.String) uoaVar.d);
        bundleU.putInt("nav-entry-state:destination-id", uoaVar.a);
        java.lang.Object objU = uoaVar.b;
        if (objU == null) {
            objU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        }
        defpackage.fbo.a(bundleU, "nav-entry-state:args", (android.os.Bundle) objU);
        defpackage.fbo.a(bundleU, "nav-entry-state:saved-state", (android.os.Bundle) uoaVar.c);
        return bundleU;
    }

    public final java.lang.String d() {
        return (java.lang.String) ((uoa) this.a).d;
    }

    public final android.os.IBinder e() {
        return ((android.os.Messenger) this.a).getBinder();
    }

    public final void f(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((android.os.Messenger) this.a).send(messageObtain);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void g(faq faqVar) {
        faqVar.getClass();
        int i = faqVar.a;
        ?? r3 = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Object treeMap = r3.get(numValueOf);
        if (treeMap == null) {
            treeMap = new java.util.TreeMap();
            r3.put(numValueOf, treeMap);
        }
        java.util.TreeMap treeMap2 = (java.util.TreeMap) treeMap;
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(faqVar.b);
        if (treeMap2.containsKey(numValueOf2)) {
            android.util.Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + faqVar);
        }
        treeMap2.put(numValueOf2, faqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aizk aizkVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        ezc ezcVar;
        if (afdkVar instanceof ezc) {
            ezcVar = (ezc) afdkVar;
            int i = ezcVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ezcVar.b = i - Integer.MIN_VALUE;
            } else {
                ezcVar = new ezc(this, afdkVar);
            }
        } else {
            ezcVar = new ezc(this, afdkVar);
        }
        java.lang.Object obj = ezcVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ezcVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            java.lang.Object obj2 = this.a;
            ezcVar.b = 1;
            if (((ajba) obj2).hd(aizkVar, ezcVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        throw new defpackage.afap();
    }

    public final java.lang.String i(int i) {
        try {
            java.lang.String resourceName = ((android.content.Context) this.a).getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return java.lang.String.valueOf(i);
        }
    }

    public final defpackage.euw j(defpackage.erh erhVar, defpackage.evf evfVar, defpackage.epx epxVar, evt evtVar) {
        erhVar.getClass();
        epxVar.getClass();
        uoa uoaVar = (uoa) this.a;
        java.lang.Object obj = uoaVar.b;
        if (obj != null) {
            ((android.os.Bundle) obj).setClassLoader(((android.content.Context) erhVar.a).getClassLoader());
        } else {
            obj = null;
        }
        return defpackage.ebm.h(erhVar, evfVar, (android.os.Bundle) obj, epxVar, evtVar, (java.lang.String) uoaVar.d, (android.os.Bundle) uoaVar.c);
    }

    public final void k(int i, boolean z) throws java.io.IOException {
        ((eje) this.a).j(i, z);
    }

    public final void l(int i, eix eixVar) throws java.io.IOException {
        ((eje) this.a).k(i, eixVar);
    }

    public final void m(int i, double d) throws java.io.IOException {
        ((eje) this.a).R(i, d);
    }

    public final void n(int i, int i2) throws java.io.IOException {
        ((eje) this.a).q(i, i2);
    }

    public final void o(int i, int i2) throws java.io.IOException {
        ((eje) this.a).m(i, i2);
    }

    public final void p(int i, long j) throws java.io.IOException {
        ((eje) this.a).o(i, j);
    }

    public final void q(int i, float f) throws java.io.IOException {
        ((eje) this.a).T(i, f);
    }

    public final void r(int i, java.lang.Object obj, ekx ekxVar) throws java.io.IOException {
        eje ejeVar = (eje) this.a;
        ejeVar.x(i, 3);
        ekxVar.j((defpackage.eim) obj, this);
        ejeVar.x(i, 4);
    }

    public final void s(int i, int i2) throws java.io.IOException {
        ((eje) this.a).q(i, i2);
    }

    public final void t(int i, long j) throws java.io.IOException {
        ((eje) this.a).A(i, j);
    }

    public final void u(int i, java.lang.Object obj, ekx ekxVar) throws java.io.IOException {
        defpackage.eim eimVar = (defpackage.eim) obj;
        eje ejeVar = (eje) this.a;
        ejeVar.x(i, 2);
        ejeVar.z(eimVar.c(ekxVar));
        ekxVar.j(eimVar, this);
    }

    public final void v(int i, int i2) throws java.io.IOException {
        ((eje) this.a).m(i, i2);
    }

    public final void w(int i, long j) throws java.io.IOException {
        ((eje) this.a).o(i, j);
    }

    public final void x(int i, int i2) throws java.io.IOException {
        ((eje) this.a).y(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void y(int i, long j) throws java.io.IOException {
        ((eje) this.a).A(i, (j >> 63) ^ (j + j));
    }

    public final void z(int i, int i2) throws java.io.IOException {
        ((eje) this.a).y(i, i2);
    }

    public erh(android.view.View view, byte[] bArr) {
        this.a = android.os.Build.VERSION.SDK_INT >= 30 ? new defpackage.eaz(view) : new defpackage.eax(view);
    }

    public erh(elt eltVar, elt eltVar2, java.lang.Object obj) {
        this.a = new defpackage.eqa(eltVar, eltVar2, obj);
    }

    public erh(java.lang.Object obj) {
        this.a = obj;
    }

    public erh() {
        new java.util.LinkedHashMap();
        this.a = new ajer(defpackage.afcf.a);
    }

    public erh(android.view.View view) {
        this.a = new java.lang.ref.WeakReference(view);
    }

    public erh(byte[] bArr, byte[] bArr2) {
        this.a = ajbb.a(new int[7]);
    }

    public erh(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new android.os.HandlerThread("AudioRecord", -19);
    }

    public erh(boolean z) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(z);
    }

    public erh(byte[] bArr) {
        this.a = new java.util.LinkedHashMap();
    }

    public erh(byte[] bArr, char[] cArr) {
        this.a = new java.util.HashMap();
    }

    public erh(eje ejeVar) {
        java.nio.charset.Charset charset = ejv.a;
        this.a = ejeVar;
        ejeVar.f = this;
    }

    public erh(java.util.Map map) {
        new java.util.LinkedHashMap();
        this.a = new ajer(map);
    }

    public erh(sjh sjhVar) {
        this.a = sjhVar;
        android.os.SystemClock.elapsedRealtime();
    }

    public erh(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public erh(oae oaeVar) {
        this.a = new defpackage.ynu(oaeVar);
    }

    public erh(short[] sArr) {
        this.a = new ajli((byte[]) null);
    }

    public erh(android.content.Context context, char[] cArr) {
        android.os.StrictMode.ThreadPolicy threadPolicyB = zsv.a.b();
        try {
            this.a = context.getSharedPreferences("com.google.maps.api.android.lib6.impl.PREFERENCES_FILE", 0);
        } finally {
            zsv.a.d(threadPolicyB);
        }
    }

    public erh(android.os.Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(getClass().getClassLoader());
        this.a = new uoa(bundle);
    }

    public erh(android.content.Context context) {
        this.a = context;
    }

    public erh(defpackage.euw euwVar) {
        euwVar.getClass();
        this.a = new uoa(euwVar, euwVar.a.c());
    }

    public erh(uas uasVar) {
        zlv.n(uasVar, "phoenixIndoorBuilding");
        uas uasVar2 = uasVar.g;
        this.a = uasVar2 != null ? uasVar2 : uasVar;
    }

    public erh(char[] cArr, byte[] bArr) {
        this.a = new com.google.android.enterprise.connectedapps.internal.BundleCallReceiver();
    }

    public erh(char[] cArr) {
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public erh(char[] cArr, char[] cArr2) {
        this.a = new java.util.LinkedHashMap();
    }

    public erh(byte[] bArr, short[] sArr) {
        this.a = new java.util.ArrayList(20);
    }

    public erh(java.util.concurrent.ThreadFactory threadFactory) {
        this.a = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), threadFactory);
    }

    public erh(int[] iArr) {
        this.a = new java.util.LinkedHashSet();
    }
}
