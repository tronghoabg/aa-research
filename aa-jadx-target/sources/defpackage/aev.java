package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aev implements defpackage.aeg {
    private final java.lang.Object a;
    private final defpackage.aep b;
    private final defpackage.aep c;
    private final defpackage.aep d;
    private final java.lang.Object e;
    private final long f;
    private final defpackage.ahb g;
    private final defpackage.bil h;

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Type inference failed for: r0v0, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [affc, java.lang.Object] */
    public aev(defpackage.kwv kwvVar, defpackage.bil bilVar, java.lang.Object obj, defpackage.aep aepVar) throws afbj {
        defpackage.ahb ahbVarT = kwvVar.T();
        this.g = ahbVarT;
        this.h = bilVar;
        this.a = obj;
        defpackage.aep aepVar2 = (defpackage.aep) bilVar.b.invoke(obj);
        this.b = aepVar2;
        this.c = defpackage.ca.A(aepVar);
        this.e = bilVar.a.invoke(ahbVarT.a(aepVar2, aepVar));
        if (ahbVarT.c == null) {
            ahbVarT.c = aepVar2.c();
        }
        defpackage.aep aepVar3 = ahbVarT.c;
        if (aepVar3 == null) {
            defpackage.afga.d("velocityVector");
            aepVar3 = null;
        }
        int iB = aepVar3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            defpackage.aff affVar = ahbVarT.a;
            aepVar2.a(i);
            jMax = java.lang.Math.max(jMax, affVar.d(aepVar.a(i)));
        }
        this.f = jMax;
        defpackage.aep aepVarA = defpackage.ca.A(this.g.b(jMax, this.b, aepVar));
        this.d = aepVarA;
        int iB2 = aepVarA.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            defpackage.aep aepVar4 = this.d;
            float fA = aepVar4.a(i2);
            float f = this.g.d;
            aepVar4.e(i2, defpackage.afqt.d(fA, -f, f));
        }
    }

    @Override // defpackage.aeg
    public final long a() {
        return this.f;
    }

    @Override // defpackage.aeg
    public final defpackage.aep b(long j) {
        return !defpackage.ca.H(this, j) ? this.g.b(j, this.b, this.c) : this.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Type inference failed for: r11v4, types: [affc, java.lang.Object] */
    @Override // defpackage.aeg
    public final java.lang.Object c(long j) throws afbj {
        if (defpackage.ca.H(this, j)) {
            return this.e;
        }
        defpackage.bil bilVar = this.h;
        defpackage.ahb ahbVar = this.g;
        defpackage.aep aepVar = this.b;
        defpackage.aep aepVar2 = this.c;
        if (ahbVar.b == null) {
            ahbVar.b = aepVar.c();
        }
        defpackage.aep aepVar3 = ahbVar.b;
        defpackage.aep aepVar4 = null;
        if (aepVar3 == null) {
            defpackage.afga.d("valueVector");
            aepVar3 = null;
        }
        int iB = aepVar3.b();
        for (int i = 0; i < iB; i++) {
            defpackage.aep aepVar5 = ahbVar.b;
            if (aepVar5 == null) {
                defpackage.afga.d("valueVector");
                aepVar5 = null;
            }
            aepVar5.e(i, ahbVar.a.c(j, aepVar.a(i), aepVar2.a(i)));
        }
        defpackage.aep aepVar6 = ahbVar.b;
        if (aepVar6 == null) {
            defpackage.afga.d("valueVector");
        } else {
            aepVar4 = aepVar6;
        }
        return bilVar.a.invoke(aepVar4);
    }

    @Override // defpackage.aeg
    public final /* synthetic */ boolean d(long j) {
        return defpackage.ca.H(this, j);
    }

    @Override // defpackage.aeg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aeg
    public final defpackage.bil g() {
        return this.h;
    }

    @Override // defpackage.aeg
    public final void f() {
    }
}
