package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class slw implements defpackage.sma {
    public final android.content.Context b;
    public final java.lang.String c;
    public final defpackage.sqw d;
    public final defpackage.slq e;
    public final defpackage.smo f;
    public final android.os.Looper g;
    public final int h;
    public final defpackage.slz i;
    protected final defpackage.snf j;
    public final defpackage.rkq k;

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public slw(android.content.Context context, android.app.Activity activity, defpackage.rkq rkqVar, defpackage.slq slqVar, defpackage.slv slvVar) {
        snx snxVarF;
        if (context == null) {
            throw new java.lang.NullPointerException("Null context is not permitted.");
        }
        if (slvVar == null) {
            throw new java.lang.NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new java.lang.NullPointerException("The provided context did not have an application context.");
        }
        this.b = applicationContext;
        java.lang.String strM = (android.os.Build.VERSION.SDK_INT < 30 || android.os.Build.VERSION.SDK_INT < 30) ? null : bgp$.ExternalSyntheticApiModelOutline0.m(context);
        this.c = strM;
        this.d = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.sqw(a$.ExternalSyntheticApiModelOutline0.m(context)) : null;
        this.k = rkqVar;
        this.e = slqVar;
        this.g = slvVar.b;
        defpackage.smo smoVar = new defpackage.smo(rkqVar, slqVar, strM);
        this.f = smoVar;
        this.i = new defpackage.sng(this);
        defpackage.snf snfVarC = defpackage.snf.c(applicationContext);
        this.j = snfVarC;
        this.h = snfVarC.i.getAndIncrement();
        if (activity != null && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            java.util.WeakHashMap weakHashMap = snx.a;
            defpackage.bt btVarA = ((defpackage.bc) activity).a();
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) snx.a.get(activity);
            if (weakReference == null || (snxVarF = (snx) weakReference.get()) == null) {
                try {
                    snxVarF = btVarA.f("SLifecycleFragmentImpl");
                    if (snxVarF == null || snxVarF.isRemoving()) {
                        snxVarF = new snx();
                        defpackage.w wVar = new defpackage.w(btVarA);
                        wVar.e(0, snxVarF, "SLifecycleFragmentImpl", 1);
                        wVar.i(true, true);
                    }
                    snx.a.put(activity, new java.lang.ref.WeakReference(snxVarF));
                } catch (java.lang.ClassCastException e) {
                    throw new java.lang.IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            }
            smz smzVar = (smz) ((snk) smz.class.cast(snxVarF.b.a.get("ConnectionlessLifecycleHelper")));
            smzVar = smzVar == null ? new smz(snxVarF, snfVarC) : smzVar;
            smzVar.e.add(smoVar);
            snfVarC.f(smzVar);
        }
        android.os.Handler handler = snfVarC.q;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    @Override // defpackage.sma
    public final defpackage.smo r() {
        return this.f;
    }

    public final sno s(java.lang.Object obj, java.lang.String str) {
        return sqg.d(obj, this.g, str);
    }

    public final defpackage.sol t() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountA;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountA2;
        defpackage.sol solVar = new defpackage.sol();
        defpackage.slq slqVar = this.e;
        boolean z = slqVar instanceof defpackage.slo;
        android.accounts.Account accountA = null;
        if (z && (googleSignInAccountA2 = ((defpackage.slo) slqVar).a()) != null) {
            java.lang.String str = googleSignInAccountA2.c;
            if (str != null) {
                accountA = new android.accounts.Account(str, "com.google");
            }
        } else if (slqVar instanceof defpackage.sln) {
            accountA = ((defpackage.sln) slqVar).a();
        }
        solVar.a = accountA;
        java.util.Set setA = (!z || (googleSignInAccountA = ((defpackage.slo) slqVar).a()) == null) ? java.util.Collections.EMPTY_SET : googleSignInAccountA.a();
        if (solVar.b == null) {
            solVar.b = new defpackage.zf(0);
        }
        solVar.b.addAll(setA);
        android.content.Context context = this.b;
        solVar.d = context.getClass().getName();
        solVar.c = context.getPackageName();
        return solVar;
    }

    public final defpackage.swx u(int i, defpackage.snz snzVar) {
        defpackage.lhe lheVar = new defpackage.lhe((char[]) null);
        int i2 = snzVar.c;
        defpackage.snf snfVar = this.j;
        snfVar.i(lheVar, i2, this);
        defpackage.sml smlVar = new defpackage.sml(i, snzVar, lheVar);
        android.os.Handler handler = snfVar.q;
        handler.sendMessage(handler.obtainMessage(4, new defpackage.sns(smlVar, snfVar.j.get(), this)));
        return (defpackage.swx) lheVar.a;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.swx v(snm snmVar, int i) {
        defpackage.lhe lheVar = new defpackage.lhe((char[]) null);
        defpackage.snf snfVar = this.j;
        snfVar.i(lheVar, i, this);
        smm smmVar = new smm(snmVar, lheVar);
        android.os.Handler handler = snfVar.q;
        handler.sendMessage(handler.obtainMessage(13, new defpackage.sns((defpackage.smn) smmVar, snfVar.j.get(), this)));
        return (defpackage.swx) lheVar.a;
    }

    public final void w(int i, defpackage.smr smrVar) {
        boolean z = true;
        if (!smrVar.d && !((java.lang.Boolean) com.google.android.gms.common.api.internal.BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        smrVar.d = z;
        defpackage.snf snfVar = this.j;
        defpackage.sns snsVar = new defpackage.sns(new defpackage.smj(i, smrVar), snfVar.j.get(), this);
        android.os.Handler handler = snfVar.q;
        handler.sendMessage(handler.obtainMessage(4, snsVar));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Runnable] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.swx x(rkn rknVar) {
        snt sntVar = (snt) rknVar.b;
        defpackage.sqs.aB(sntVar.a(), "Listener has already been released.");
        defpackage.lhe lheVar = new defpackage.lhe((char[]) null);
        int i = sntVar.d;
        defpackage.snf snfVar = this.j;
        snfVar.i(lheVar, i, this);
        smk smkVar = new smk(new rkn(sntVar, (defpackage.xei) rknVar.c, (java.lang.Runnable) rknVar.a, (byte[]) null), lheVar);
        android.os.Handler handler = snfVar.q;
        handler.sendMessage(handler.obtainMessage(8, new defpackage.sns((defpackage.smn) smkVar, snfVar.j.get(), this)));
        return (defpackage.swx) lheVar.a;
    }
}
