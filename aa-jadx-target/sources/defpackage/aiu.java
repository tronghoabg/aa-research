package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aiu extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ aiwg c;
    final /* synthetic */ long d;
    final /* synthetic */ defpackage.ask e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiu(aiwg aiwgVar, long j, defpackage.ask askVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = aiwgVar;
        this.d = j;
        this.e = askVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.aiu(this.c, this.d, this.e, afdkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r6.b(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [asi] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [ask] */
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
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r5.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.afga.cz(r6)
            goto L4f
        L10:
            java.lang.Object r1 = r5.a
            defpackage.afga.cz(r6)
            goto L40
        L16:
            defpackage.afga.cz(r6)
            goto L28
        L1a:
            defpackage.afga.cz(r6)
            aiwg r6 = r5.c
            r5.b = r3
            java.lang.Object r6 = r6.n(r5)
            if (r6 != r0) goto L28
            goto L52
        L28:
            long r3 = r5.d
            asn r6 = new asn
            r6.<init>(r3)
            aso r1 = new aso
            r1.<init>(r6)
            ask r3 = r5.e
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = r3.b(r6, r5)
            if (r6 == r0) goto L52
        L40:
            ask r6 = r5.e
            r2 = 0
            r5.a = r2
            r2 = 3
            r5.b = r2
            java.lang.Object r5 = r6.b(r1, r5)
            if (r5 != r0) goto L4f
            goto L52
        L4f:
            afbk r5 = defpackage.afbk.a
            return r5
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiu.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aiu) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
