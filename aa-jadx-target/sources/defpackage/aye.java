package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aye implements defpackage.aqk {
    public static final /* synthetic */ int g = 0;
    public final defpackage.bwx a;
    public float b;
    public final defpackage.azi c;
    public final defpackage.bwx d;
    public final defpackage.bwx e;
    public final defpackage.ngb f;
    private final defpackage.aqk h;
    private final defpackage.ayl i;

    static {
        defpackage.bxi.k(new defpackage.abw(4), new defpackage.awl(8));
    }

    public aye(int i, int i2) {
        this.f = new defpackage.ngb(i, i2);
        defpackage.aya ayaVar = defpackage.ayg.a;
        defpackage.bxv bxvVar = defpackage.bxv.b;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(ayaVar, bxvVar);
        new defpackage.asl();
        this.h = new defpackage.ano(new defpackage.aun(this, 13));
        this.i = new defpackage.ayl();
        this.c = new defpackage.azi();
        defpackage.afga.cB(1, new defpackage.acm(14));
        new defpackage.azv();
        defpackage.afbk afbkVar = defpackage.afbk.a;
        new androidx.compose.runtime.ParcelableSnapshotMutableState(afbkVar, bxvVar);
        new androidx.compose.runtime.ParcelableSnapshotMutableState(afbkVar, bxvVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar2 = defpackage.bxv.c;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar2);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar2);
        new defpackage.cok((char[]) null);
    }

    @Override // defpackage.aqk
    public final float a(float f) {
        return this.h.a(f);
    }

    public final int b() {
        return this.f.A();
    }

    public final int c() {
        return this.f.B();
    }

    public final defpackage.aya d() {
        return (defpackage.aya) this.a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5.e(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [aqk] */
    /* JADX WARN: Type inference failed for: r7v1, types: [affg] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
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
    @Override // defpackage.aqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.akv r6, defpackage.affg r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ayd
            if (r0 == 0) goto L13
            r0 = r8
            ayd r0 = (defpackage.ayd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayd r0 = new ayd
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.afga.cz(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r7 = r0.a
            akv r6 = r0.e
            defpackage.afga.cz(r8)
            goto L56
        L3a:
            defpackage.afga.cz(r8)
            bwx r8 = r5.a
            java.lang.Object r8 = r8.a()
            aya r2 = defpackage.ayg.a
            if (r8 != r2) goto L56
            ayl r8 = r5.i
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L56
            goto L65
        L56:
            aqk r5 = r5.h
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r5 = r5.e(r6, r7, r0)
            if (r5 != r1) goto L66
        L65:
            return r1
        L66:
            afbk r5 = defpackage.afbk.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aye.e(akv, affg, afdk):java.lang.Object");
    }

    public final java.lang.Object f(int i, defpackage.afdk afdkVar) {
        java.lang.Object objE = e(defpackage.akv.a, new defpackage.ayc(this, i, (defpackage.afdk) null, 0), afdkVar);
        return objE == defpackage.afdr.a ? objE : defpackage.afbk.a;
    }

    @Override // defpackage.aqk
    public final boolean g() {
        return ((java.lang.Boolean) this.e.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean h() {
        return ((java.lang.Boolean) this.d.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean i() {
        return this.h.i();
    }

    public final void j() {
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
        } finally {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
        }
    }
}
