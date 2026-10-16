package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class inc implements android.os.IBinder.DeathRecipient {
    public final java.lang.Object a;
    private final defpackage.raa b;
    private final /* synthetic */ int c;

    public inc(defpackage.qzs qzsVar, defpackage.raa raaVar, int i) throws android.os.RemoteException {
        this.c = i;
        this.a = qzsVar;
        this.b = raaVar;
        qzsVar.asBinder().linkToDeath(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qzs] */
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
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        if (this.c != 0) {
            ((defpackage.yqj) defpackage.inh.a.l().ai((char) 444)).u("CarVideoFocusListener died");
            this.b.k(this.a);
        } else {
            ((defpackage.yqj) defpackage.inh.a.l().ai((char) 462)).u("Frame Debug callback died");
            this.b.a((qxd) this.a);
        }
    }

    public inc(qxd qxdVar, defpackage.raa raaVar, int i) {
        this.c = i;
        this.a = qxdVar;
        this.b = raaVar;
    }
}
