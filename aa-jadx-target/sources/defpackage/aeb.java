package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aeb {
    public final java.lang.String a;
    public final defpackage.aek b;
    public final defpackage.aep c;
    public final defpackage.aep d;
    public defpackage.aep e;
    public defpackage.aep f;
    public final defpackage.bil g;
    private final java.lang.Object h;
    private final defpackage.bwx i;
    private final defpackage.bwx j;
    private final defpackage.aga k;
    private final defpackage.bil l;

    public aeb(java.lang.Object obj, defpackage.bil bilVar, java.lang.Object obj2, java.lang.String str) {
        this.g = bilVar;
        this.h = obj2;
        this.a = str;
        this.b = new defpackage.aek(bilVar, obj, null, Long.MIN_VALUE, Long.MIN_VALUE, false);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
        this.l = new defpackage.bil((char[]) null, (byte[]) null);
        this.k = new defpackage.aga(1.0f, 1500.0f, obj2);
        defpackage.aep aepVarA = a();
        defpackage.aep aepVar = aepVarA instanceof defpackage.ael ? defpackage.aec.e : aepVarA instanceof defpackage.aem ? defpackage.aec.f : aepVarA instanceof defpackage.aen ? defpackage.aec.g : defpackage.aec.h;
        this.c = aepVar;
        defpackage.aep aepVarA2 = a();
        defpackage.aep aepVar2 = aepVarA2 instanceof defpackage.ael ? defpackage.aec.a : aepVarA2 instanceof defpackage.aem ? defpackage.aec.b : aepVarA2 instanceof defpackage.aen ? defpackage.aec.c : defpackage.aec.d;
        this.d = aepVar2;
        this.e = aepVar;
        this.f = aepVar2;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [affc, java.lang.Object] */
    public static /* synthetic */ java.lang.Object k(defpackage.aeb aebVar, java.lang.Object obj, defpackage.aej aejVar, defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        if ((i & 2) != 0) {
            aejVar = aebVar.k;
        }
        defpackage.aej aejVar2 = aejVar;
        java.lang.Object objInvoke = (i & 4) != 0 ? aebVar.g.a.invoke(aebVar.a()) : null;
        defpackage.affc affcVar2 = (i & 8) != 0 ? null : affcVar;
        java.lang.Object objD = aebVar.d();
        defpackage.bil bilVar = aebVar.g;
        return aebVar.l.u(defpackage.afu.a, new defpackage.adz(aebVar, objInvoke, new defpackage.agf(aejVar2, bilVar, objD, obj, (defpackage.aep) bilVar.b.invoke(objInvoke)), aebVar.b.b, affcVar2, null), afdkVar);
    }

    public final defpackage.aep a() {
        return this.b.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [affc, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        if (!defpackage.afga.f(this.e, this.c) || !defpackage.afga.f(this.f, this.d)) {
            defpackage.bil bilVar = this.g;
            defpackage.aep aepVar = (defpackage.aep) bilVar.b.invoke(obj);
            int iB = aepVar.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (aepVar.a(i) < this.e.a(i) || aepVar.a(i) > this.f.a(i)) {
                    aepVar.e(i, defpackage.afqt.d(aepVar.a(i), this.e.a(i), this.f.a(i)));
                    z = true;
                }
            }
            if (z) {
                return bilVar.a.invoke(aepVar);
            }
        }
        return obj;
    }

    public final java.lang.Object c() {
        return this.j.a();
    }

    public final java.lang.Object d() {
        return this.b.a();
    }

    public final java.lang.Object e(java.lang.Object obj, defpackage.afdk afdkVar) {
        java.lang.Object objU = this.l.u(defpackage.afu.a, new defpackage.aea(this, obj, null), afdkVar);
        return objU == defpackage.afdr.a ? objU : defpackage.afbk.a;
    }

    public final java.lang.Object f(defpackage.afdk afdkVar) {
        java.lang.Object objU = this.l.u(defpackage.afu.a, new defpackage.bln(this, (defpackage.afdk) null, 1), afdkVar);
        return objU == defpackage.afdr.a ? objU : defpackage.afbk.a;
    }

    public final void g() {
        defpackage.aek aekVar = this.b;
        aekVar.a.d();
        aekVar.b = Long.MIN_VALUE;
        h(false);
    }

    public final void h(boolean z) {
        this.i.b(java.lang.Boolean.valueOf(z));
    }

    public final void i(java.lang.Object obj) {
        this.j.b(obj);
    }

    public final boolean j() {
        return ((java.lang.Boolean) this.i.a()).booleanValue();
    }
}
