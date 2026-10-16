package defpackage;

/* loaded from: classes.dex */
public final class aeo implements adz {
    private final Object a;
    private final aei b;
    private final aei c;
    private final aei d;
    private final Object e;
    private final long f;
    private final agu g;
    private final bii h;

    /* JADX WARN: Type inference failed for: r0v0, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [afec, java.lang.Object] */
    public aeo(kwp kwpVar, bii biiVar, Object obj, aei aeiVar) {
        agu aguVarW = kwpVar.w();
        this.g = aguVarW;
        this.h = biiVar;
        this.a = obj;
        aei aeiVar2 = (aei) biiVar.b.invoke(obj);
        this.b = aeiVar2;
        this.c = ca.A(aeiVar);
        this.e = biiVar.a.invoke(aguVarW.a(aeiVar2, aeiVar));
        if (aguVarW.c == null) {
            aguVarW.c = aeiVar2.c();
        }
        aei aeiVar3 = aguVarW.c;
        if (aeiVar3 == null) {
            affa.d("velocityVector");
            aeiVar3 = null;
        }
        int iB = aeiVar3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            aey aeyVar = aguVarW.a;
            aeiVar2.a(i);
            jMax = Math.max(jMax, aeyVar.d(aeiVar.a(i)));
        }
        this.f = jMax;
        aei aeiVarA = ca.A(this.g.b(jMax, this.b, aeiVar));
        this.d = aeiVarA;
        int iB2 = aeiVarA.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            aei aeiVar4 = this.d;
            float fA = aeiVar4.a(i2);
            float f = this.g.d;
            aeiVar4.e(i2, afpt.d(fA, -f, f));
        }
    }

    @Override // defpackage.adz
    public final long a() {
        return this.f;
    }

    @Override // defpackage.adz
    public final aei b(long j) {
        return !ca.H(this, j) ? this.g.b(j, this.b, this.c) : this.d;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [afec, java.lang.Object] */
    @Override // defpackage.adz
    public final Object c(long j) {
        if (ca.H(this, j)) {
            return this.e;
        }
        bii biiVar = this.h;
        agu aguVar = this.g;
        aei aeiVar = this.b;
        aei aeiVar2 = this.c;
        if (aguVar.b == null) {
            aguVar.b = aeiVar.c();
        }
        aei aeiVar3 = aguVar.b;
        aei aeiVar4 = null;
        if (aeiVar3 == null) {
            affa.d("valueVector");
            aeiVar3 = null;
        }
        int iB = aeiVar3.b();
        for (int i = 0; i < iB; i++) {
            aei aeiVar5 = aguVar.b;
            if (aeiVar5 == null) {
                affa.d("valueVector");
                aeiVar5 = null;
            }
            aeiVar5.e(i, aguVar.a.c(j, aeiVar.a(i), aeiVar2.a(i)));
        }
        aei aeiVar6 = aguVar.b;
        if (aeiVar6 == null) {
            affa.d("valueVector");
        } else {
            aeiVar4 = aeiVar6;
        }
        return biiVar.a.invoke(aeiVar4);
    }

    @Override // defpackage.adz
    public final /* synthetic */ boolean d(long j) {
        return ca.H(this, j);
    }

    @Override // defpackage.adz
    public final boolean e() {
        return false;
    }

    @Override // defpackage.adz
    public final bii g() {
        return this.h;
    }

    @Override // defpackage.adz
    public final void f() {
    }
}
