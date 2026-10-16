package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gmz {
    public final java.lang.Object a;

    public gmz(java.util.concurrent.Executor executor) {
        this.a = new psn(new defpackage.zie(executor), true, false);
    }

    public static defpackage.gmz y(abbp abbpVar) {
        return new defpackage.gmz(defpackage.ygw.o(abbpVar.b));
    }

    public static defpackage.gmz z(float f, float f2, float[] fArr, float f3) {
        int length = fArr.length - 1;
        ucw[] ucwVarArr = new ucw[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            float f4 = fArr[i2] - fArr[i];
            ucwVarArr[i] = new ucw(f, f2, f4, f3);
            f += f4;
            i = i2;
        }
        return new defpackage.gmz(ucwVarArr, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean a(java.lang.Class cls) {
        return this.a.containsKey(cls);
    }

    public final kih b() {
        android.content.Context context = ((defpackage.qdn) this.a).e().c;
        return c((android.os.Build.VERSION.SDK_INT < 33 ? defpackage.qdr.a(context) : ag$.ExternalSyntheticApiModelOutline0.m((android.os.UserManager) context.getSystemService(android.os.UserManager.class))) ? defpackage.qdp.b : defpackage.qdp.a);
    }

    public final kih c(defpackage.qed qedVar) {
        if (!qedVar.a()) {
            return new defpackage.kig(this.a, 0);
        }
        defpackage.kif kifVar = defpackage.kif.a;
        return new defpackage.kig(defpackage.kif.a(), 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final jvz d(int i, int i2) {
        return (jvz) this.a.remove(new android.util.Pair(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Collection e() {
        return this.a.values();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [huz, java.lang.Object] */
    public final synchronized huz f(java.lang.Class cls) {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            defpackage.kqe kqeVar = (defpackage.kqe) r0.get(i);
            if (((java.lang.Class) kqeVar.b).isAssignableFrom(cls)) {
                return kqeVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void g(java.lang.Class cls, huz huzVar) {
        this.a.add(new defpackage.kqe(cls, (huj) huzVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized java.util.List h() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void i(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }

    public final defpackage.gmz j() {
        ((defpackage.qdn) this.a).e();
        defpackage.qed[] qedVarArr = {defpackage.qdp.a, defpackage.qdp.b};
        java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < 2; i++) {
            defpackage.qed qedVar = qedVarArr[i];
            map.put(qedVar, c(qedVar));
        }
        return new defpackage.gmz(map, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final int k() {
        return this.a.eglGetError();
    }

    public final tsn l() {
        tuj tujVarO = ((utu) this.a).o();
        tpg tpgVar = tujVarO.g;
        tsm tsmVarA = tsn.a();
        tsmVarA.a = tpgVar;
        tsmVarA.f(tujVarO.m);
        tsmVarA.h(tujVarO.l);
        tsmVarA.c(tujVarO.n);
        tuk tukVar = tujVarO.o;
        tsmVarA.b = tso.a(tukVar.b, tukVar.c);
        tsmVarA.d(tujVarO.i);
        tsmVarA.e(tujVarO.k);
        tsmVarA.g(tujVarO.j);
        return tsmVarA.a();
    }

    public final void m(java.lang.Runnable runnable) {
        ((psn) this.a).execute(runnable);
    }

    public final void n() {
        java.util.ArrayList<usd> arrayList;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            arrayList = new java.util.ArrayList(((java.util.ArrayList) obj).size());
            int i = 0;
            while (i < ((java.util.ArrayList) obj).size()) {
                usd usdVar = (usd) ((java.lang.ref.WeakReference) ((java.util.ArrayList) obj).get(i)).get();
                if (usdVar != null) {
                    arrayList.add(usdVar);
                } else {
                    ((java.util.ArrayList) obj).remove(i);
                    i--;
                }
                i++;
            }
        }
        for (usd usdVar2 : arrayList) {
            uhu uhuVar = (uhu) usdVar2.b;
            uhuVar.m();
            ugo ugoVar = (ugo) usdVar2.a;
            if (!ugoVar.x) {
                uhuVar.s();
            }
            ugoVar.H();
        }
    }

    public final float o(float f) {
        float[] fArr = (float[]) this.a;
        int length = fArr.length;
        if (length == 0) {
            return 1.0f;
        }
        if (f >= 1.0f) {
            return fArr[length - 1];
        }
        if (f <= 0.0f) {
            return fArr[0];
        }
        float f2 = f * (length - 1);
        double d = f2;
        int iFloor = (int) java.lang.Math.floor(d);
        int iCeil = (int) java.lang.Math.ceil(d);
        if (iFloor == iCeil) {
            return fArr[iFloor];
        }
        float f3 = fArr[iFloor];
        float f4 = f2 - iFloor;
        float f5 = iCeil - iFloor;
        return ((1.0f - (f4 / f5)) * f3) + ((1.0f - ((iCeil - f2) / f5)) * fArr[iCeil]);
    }

    public final void p() {
        ((android.widget.Scroller) this.a).abortAnimation();
    }

    public final int q() {
        return ((ucw[]) this.a).length;
    }

    public final ucw r(int i) {
        return ((ucw[]) this.a)[i];
    }

    public final void s(tqd tqdVar) {
        int i = 0;
        while (true) {
            ucw[] ucwVarArr = (ucw[]) this.a;
            if (i >= ucwVarArr.length) {
                return;
            }
            tqd tqdVar2 = ucwVarArr[i].g;
            tqd.g(tqdVar2, tqdVar, tqdVar2);
            i++;
        }
    }

    public final void t(tvm tvmVar, float[] fArr, float f, float f2, uhi uhiVar) {
        defpackage.gmz gmzVar = this;
        float f3 = 0.5f;
        int i = 0;
        if (tvmVar.b == 2) {
            tqd tqdVar = (tqd) uhiVar.g;
            tvmVar.j(0, tqdVar);
            tqd tqdVar2 = (tqd) uhiVar.f;
            tvmVar.j(1, tqdVar2);
            tqd tqdVar3 = (tqd) uhiVar.h;
            tqd.p(tqdVar2, tqdVar, tqdVar3);
            int length = fArr.length - 1;
            float fB = tvmVar.b();
            float f4 = fB - ((fArr[length] * f) * f2);
            while (i < length) {
                int i2 = i + 1;
                float f5 = ((f4 * f3) + (((f2 * f) * (fArr[i] + fArr[i2])) / 2.0f)) / fB;
                ucw[] ucwVarArr = (ucw[]) gmzVar.a;
                tqd.d(tqdVar, tqdVar2, f5, ucwVarArr[i].g);
                float f6 = tqdVar3.b;
                float f7 = tqdVar3.c;
                float f8 = f3;
                float fHypot = (float) java.lang.Math.hypot(f6, f7);
                ucw ucwVar = ucwVarArr[i];
                ucwVar.e = f6 / fHypot;
                ucwVar.f = f7 / fHypot;
                i = i2;
                f3 = f8;
            }
            return;
        }
        java.lang.Object obj = uhiVar.g;
        java.lang.Object obj2 = uhiVar.f;
        java.lang.Object obj3 = uhiVar.h;
        java.lang.Object obj4 = uhiVar.a;
        java.lang.Object obj5 = uhiVar.b;
        java.lang.Object obj6 = uhiVar.d;
        java.lang.Object obj7 = uhiVar.e;
        java.lang.Object obj8 = uhiVar.c;
        int length2 = fArr.length - 1;
        float fB2 = tvmVar.b();
        float f9 = fArr[length2] * f * f2;
        float f10 = 1.0f / fB2;
        float f11 = (fB2 - f9) * 0.5f;
        tqd tqdVar4 = (tqd) obj;
        tvmVar.k(((fArr[0] * f * f2) + f11) * f10, tqdVar4);
        tqd tqdVar5 = (tqd) obj2;
        tvmVar.k(((0.33333334f * f9) + f11) * f10, tqdVar5);
        tqd tqdVar6 = (tqd) obj3;
        tvmVar.k(((0.6666667f * f9) + f11) * f10, tqdVar6);
        tqd tqdVar7 = (tqd) obj4;
        tvmVar.k((f11 + f9) * f10, tqdVar7);
        tqd tqdVar8 = (tqd) obj5;
        tqdVar8.o(tqdVar4);
        double d = tqdVar4.b;
        double d2 = tqdVar5.b;
        double d3 = tqdVar6.b;
        double d4 = tqdVar7.b;
        double d5 = (-tqdVar4.c) * 5.0d;
        tqd tqdVar9 = (tqd) obj6;
        tqdVar9.n((float) ((((((-d) * 5.0d) / 6.0d) + (d2 * 3.0d)) - ((d3 * 3.0d) / 2.0d)) + (d4 / 3.0d)), (float) ((((d5 / 6.0d) + (((double) tqdVar5.c) * 3.0d)) - ((((double) tqdVar6.c) * 3.0d) / 2.0d)) + (((double) tqdVar7.c) / 3.0d)));
        double d6 = tqdVar4.b;
        double d7 = tqdVar5.b;
        double d8 = tqdVar6.b;
        double d9 = tqdVar7.b;
        double d10 = tqdVar4.c;
        double d11 = tqdVar5.c;
        double d12 = (d11 * 3.0d) / 2.0d;
        double d13 = d10 / 3.0d;
        tqd tqdVar10 = (tqd) obj7;
        double d14 = ((d6 / 3.0d) - ((d7 * 3.0d) / 2.0d)) + (d8 * 3.0d);
        tqdVar10.n((float) (d14 - ((d9 * 5.0d) / 6.0d)), (float) (((d13 - d12) + (tqdVar6.c * 3.0d)) - ((((double) tqdVar7.c) * 5.0d) / 6.0d)));
        tqd tqdVar11 = (tqd) obj8;
        tqdVar11.o(tqdVar7);
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 1;
            ucw[] ucwVarArr2 = (ucw[]) gmzVar.a;
            tqd tqdVar12 = ucwVarArr2[i3].g;
            double d15 = tqdVar8.b;
            double d16 = tqdVar9.b;
            double d17 = tqdVar10.b;
            double d18 = tqdVar11.b;
            double d19 = (((fArr[i3] + fArr[i4]) * f) * f2) / (f9 + f9);
            tqdVar12.n((float) tov.a(d19, d15, d16, d17, d18), (float) tov.a(d19, tqdVar8.c, tqdVar9.c, tqdVar10.c, tqdVar11.c));
            float f12 = tqdVar12.b;
            float f13 = tqdVar12.c;
            float fHypot2 = (float) java.lang.Math.hypot(f12, f13);
            ucw ucwVar2 = ucwVarArr2[i3];
            ucwVar2.e = f12 / fHypot2;
            ucwVar2.f = f13 / fHypot2;
            ucwVar2.g.n((float) tov.b(d19, tqdVar8.b, tqdVar9.b, tqdVar10.b, tqdVar11.b), (float) tov.b(d19, tqdVar8.c, tqdVar9.c, tqdVar10.c, tqdVar11.c));
            gmzVar = this;
            i3 = i4;
        }
    }

    public final void u(usd usdVar) {
        java.lang.Object obj = this.a;
        synchronized (obj) {
            ((java.util.ArrayList) obj).add(new java.lang.ref.WeakReference(usdVar));
        }
    }

    public final void v(defpackage.rkc rkcVar) {
        ((java.util.ArrayList) this.a).add(rkcVar);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public final boolean w(defpackage.rkc rkcVar, ufv ufvVar) {
        ?? r6 = this.a;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            defpackage.rkc rkcVar2 = (defpackage.rkc) r6.get(i);
            if (((ufs) rkcVar2.b).g((ufs) rkcVar.b) && !ufvVar.a(rkcVar2, rkcVar).c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final boolean x(defpackage.htw htwVar, defpackage.htw htwVar2, defpackage.htw htwVar3, defpackage.htw htwVar4) {
        defpackage.htw htwVar5 = uwk.a;
        javax.microedition.khronos.egl.EGLContext eGLContext = (javax.microedition.khronos.egl.EGLContext) htwVar4.a;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = (javax.microedition.khronos.egl.EGLSurface) htwVar3.a;
        return this.a.eglMakeCurrent((javax.microedition.khronos.egl.EGLDisplay) htwVar.a, (javax.microedition.khronos.egl.EGLSurface) htwVar2.a, eGLSurface, eGLContext);
    }

    public gmz(java.lang.Object obj) {
        this.a = obj;
    }

    public gmz(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public gmz(byte[] bArr, char[] cArr) {
        this.a = new tpm();
    }

    public gmz(fvz fvzVar) {
        fvzVar.getClass();
        this.a = fvzVar;
    }

    public gmz(byte[] bArr) {
        this.a = new hzo();
    }

    public gmz(char[] cArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public gmz(short[] sArr) {
        this.a = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
    }

    public gmz() {
        this.a = new java.util.HashMap();
    }

    public gmz(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new java.util.ArrayList();
    }

    public gmz(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = new aewt(16);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public gmz(defpackage.gmz gmzVar) {
        this.a = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap((java.util.Map) gmzVar.a));
    }

    public gmz(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.ArrayList();
    }

    public gmz(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new java.util.ArrayList();
    }

    public gmz(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public gmz(android.content.Context context, byte[] bArr) {
        this.a = new android.widget.Scroller(context);
    }

    public gmz(defpackage.ygw ygwVar) {
        this.a = defpackage.ysr.cT(ygwVar);
    }

    public gmz(short[] sArr, byte[] bArr) {
        this.a = new java.util.ArrayList();
    }

    public gmz(android.content.Context context) {
        this.a = new nbh(context);
    }

    public gmz(utu utuVar, android.content.Context context) {
        this.a = utuVar;
        context.getResources().getDisplayMetrics();
    }

    public gmz(char[] cArr, byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicLong();
    }
}
