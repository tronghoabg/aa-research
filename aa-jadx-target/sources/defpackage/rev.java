package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rev implements defpackage.saa {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rev(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qwj] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, qyc] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rqb] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, qvx] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, qvx] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, qvo] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, qvr] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, qvl] */
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
    @Override // defpackage.saa
    public final void a() throws android.os.RemoteException {
        int i = this.b;
        if (i == 0) {
            ?? r3 = this.a;
            ((defpackage.rqa) r3).a.bh(r3);
            return;
        }
        if (i == 1) {
            ((defpackage.shg) ((defpackage.ret) this.a).e).b().o();
            return;
        }
        if (i == 2) {
            ?? r4 = this.a;
            ((defpackage.qvn) r4).a.bd(r4);
            return;
        }
        if (i == 3) {
            ?? r5 = this.a;
            ((defpackage.qvq) r5).a.be(r5);
            return;
        }
        if (i == 4) {
            this.a.bf();
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 5) {
            rfz rfzVar = (rfz) obj;
            rfzVar.c.h(rfzVar.g);
            rfz.e("Registered microphone diagnostics listener with car service.", new java.lang.Object[0]);
            return;
        }
        rfz rfzVar2 = (rfz) obj;
        rfzVar2.c.g(rfzVar2.e);
        rfz.e("Registered audio stream diagnostics listener with car service.", new java.lang.Object[0]);
    }
}
