package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqn {
    public final defpackage.ctc a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final defpackage.aan g = new defpackage.aan(16);
    public final defpackage.cqt f = new defpackage.cqt();
    public final defpackage.zv h = new defpackage.zv(10);

    public cqn(defpackage.ctc ctcVar) {
        this.a = ctcVar;
    }

    public final void a() {
        if (this.d) {
            this.d = true;
        } else {
            this.f.d.g();
        }
    }

    public final void b() {
        if (this.b) {
            this.c = true;
            return;
        }
        defpackage.bzc bzcVar = this.f.d;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cqs) objArr[i2]).a();
        }
        a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(defpackage.cge cgeVar) {
        if (this.b) {
            this.e = true;
            this.g.p(cgeVar);
            return;
        }
        defpackage.cqt cqtVar = this.f;
        defpackage.aan aanVar = cqtVar.e;
        aanVar.k();
        aanVar.p(cqtVar);
        while (aanVar.g()) {
            defpackage.cqt cqtVar2 = (defpackage.cqt) aanVar.h(aanVar.b - 1);
            int i = 0;
            while (true) {
                defpackage.bzc bzcVar = cqtVar2.d;
                if (i < bzcVar.b) {
                    defpackage.cqs cqsVar = (defpackage.cqs) bzcVar.a[i];
                    if (defpackage.afga.f(cqsVar.a, cgeVar)) {
                        bzcVar.m(cqsVar);
                        cqsVar.a();
                    } else {
                        aanVar.p(cqsVar);
                        i++;
                    }
                }
            }
        }
    }
}
