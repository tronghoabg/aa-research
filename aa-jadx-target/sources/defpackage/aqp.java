package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aqp {
    public defpackage.aqk a;
    public defpackage.aor b;
    public defpackage.apn c;
    public boolean d;
    public final defpackage.afer e;
    public boolean f;
    public defpackage.aiz j;
    public defpackage.tu k;
    private final defpackage.aqj m;
    public int g = 1;
    public defpackage.apw h = defpackage.aqd.a;
    public final defpackage.izq l = new defpackage.izq(this);
    public final defpackage.affc i = new defpackage.act(this, 17);

    public aqp(defpackage.aqk aqkVar, defpackage.aiz aizVar, defpackage.aor aorVar, defpackage.apn apnVar, boolean z, defpackage.tu tuVar, defpackage.aqj aqjVar, defpackage.afer aferVar) {
        this.a = aqkVar;
        this.j = aizVar;
        this.b = aorVar;
        this.c = apnVar;
        this.d = z;
        this.k = tuVar;
        this.m = aqjVar;
        this.e = aferVar;
    }

    public final float a(float f) {
        return this.d ? -f : f;
    }

    public final float b(long j) {
        return java.lang.Float.intBitsToFloat(this.c == defpackage.apn.b ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    public final long c(defpackage.apw apwVar, long j, int i) {
        long jB = this.k.b(j, i);
        long jR = defpackage.acmj.r(j, jB);
        long jD = d(f(apwVar.a(b(d(e(jR))))));
        defpackage.aqj aqjVar = this.m;
        if (aqjVar.A) {
            android.view.ViewTreeObserver viewTreeObserver = ((defpackage.czz) defpackage.cjv.t(aqjVar)).getViewTreeObserver();
            try {
                if (defpackage.czz.e == null) {
                    java.lang.reflect.Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    defpackage.czz.e = declaredMethod;
                }
                java.lang.reflect.Method method = defpackage.czz.e;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return defpackage.a.ah(defpackage.a.ah(jB, jD), this.k.a(jD, defpackage.acmj.r(jR, jD), i));
    }

    public final long d(long j) {
        return this.d ? defpackage.cji.c(j, -1.0f) : j;
    }

    public final long e(long j) {
        return defpackage.cji.e(j, 0.0f, this.c == defpackage.apn.b ? 1 : 2);
    }

    public final long f(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.c == defpackage.apn.b ? ((long) java.lang.Float.floatToRawIntBits(f)) << 32 : ((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(long j, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aql aqlVar;
        defpackage.aqp aqpVar;
        java.lang.Throwable th;
        afgu afguVar;
        if (afdkVar instanceof defpackage.aql) {
            aqlVar = (defpackage.aql) afdkVar;
            int i = aqlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqlVar.c = i - Integer.MIN_VALUE;
            } else {
                aqlVar = new defpackage.aql(this, afdkVar);
            }
        } else {
            aqlVar = new defpackage.aql(this, afdkVar);
        }
        java.lang.Object obj = aqlVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aqlVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afguVar = aqlVar.d;
            try {
                defpackage.afga.cz(obj);
                aqpVar = this;
                aqpVar.f = false;
                return new defpackage.dmd(afguVar.a);
            } catch (java.lang.Throwable th2) {
                th = th2;
                aqpVar = this;
                aqpVar.f = false;
                throw th;
            }
        }
        defpackage.afga.cz(obj);
        afgu afguVar2 = new afgu();
        afguVar2.a = j;
        this.f = true;
        try {
            defpackage.akv akvVar = defpackage.akv.a;
            aqpVar = this;
            try {
                defpackage.aqn aqnVar = new defpackage.aqn(aqpVar, afguVar2, j, null);
                aqlVar.d = afguVar2;
                aqlVar.c = 1;
                if (aqpVar.i(akvVar, aqnVar, aqlVar) == afdrVar) {
                    return afdrVar;
                }
                afguVar = afguVar2;
                aqpVar.f = false;
                return new defpackage.dmd(afguVar.a);
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                aqpVar.f = false;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            aqpVar = this;
        }
    }

    public final java.lang.Object h(long j, boolean z, defpackage.afdk afdkVar) {
        if (!z || !(this.b instanceof defpackage.anm)) {
            long jE = defpackage.dmd.e(j, 0.0f, 0.0f, this.c == defpackage.apn.b ? 1 : 2);
            defpackage.aqo aqoVar = new defpackage.aqo(this, null);
            defpackage.aiz aizVar = this.j;
            if (aizVar == null || !j()) {
                java.lang.Object objInvoke = aqoVar.invoke(new defpackage.dmd(jE), afdkVar);
                if (objInvoke == defpackage.afdr.a) {
                    return objInvoke;
                }
            } else {
                java.lang.Object objF = aizVar.f(jE, aqoVar, afdkVar);
                if (objF == defpackage.afdr.a) {
                    return objF;
                }
            }
        }
        return defpackage.afbk.a;
    }

    public final java.lang.Object i(defpackage.akv akvVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        java.lang.Object objE = this.a.e(akvVar, new defpackage.amx(this, affgVar, (defpackage.afdk) null, 4), afdkVar);
        return objE == defpackage.afdr.a ? objE : defpackage.afbk.a;
    }

    public final boolean j() {
        if (this.a.h() || this.a.g()) {
            return true;
        }
        defpackage.aiz aizVar = this.j;
        return aizVar != null && aizVar.j();
    }

    public final boolean k() {
        return this.c == defpackage.apn.a;
    }
}
