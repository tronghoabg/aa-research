package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bxf implements defpackage.bwq {
    private final defpackage.bwq a;
    private final defpackage.bwm c = new defpackage.bwm();

    public bxf(defpackage.bwq bwqVar) {
        this.a = bwqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [bwq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [affc] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
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
    @Override // defpackage.bwq
    public final java.lang.Object a(defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.bxe bxeVar;
        java.lang.Object objK;
        if (afdkVar instanceof defpackage.bxe) {
            bxeVar = (defpackage.bxe) afdkVar;
            int i = bxeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bxeVar.d = i - Integer.MIN_VALUE;
            } else {
                bxeVar = new defpackage.bxe(this, afdkVar);
            }
        } else {
            bxeVar = new defpackage.bxe(this, afdkVar);
        }
        java.lang.Object obj = bxeVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = bxeVar.d;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            defpackage.bwm bwmVar = this.c;
            bxeVar.a = affcVar;
            bxeVar.d = 1;
            if (bwmVar.a()) {
                objK = defpackage.afbk.a;
            } else {
                defpackage.aiug aiugVar = new defpackage.aiug(defpackage.afga.s(bxeVar), 1);
                aiugVar.z();
                synchronized (bwmVar.a) {
                    bwmVar.b.add(aiugVar);
                }
                aiugVar.d(new defpackage.bet(bwmVar, aiugVar, 2, null));
                objK = aiugVar.k();
                if (objK != defpackage.afdr.a) {
                    objK = defpackage.afbk.a;
                }
            }
            if (objK != afdrVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
            return obj;
        }
        affcVar = bxeVar.a;
        defpackage.afga.cz(obj);
        ?? r7 = this.a;
        bxeVar.a = null;
        bxeVar.d = 2;
        java.lang.Object objA = r7.a(affcVar, bxeVar);
        return objA == afdrVar ? afdrVar : objA;
    }

    public final void b() {
        defpackage.bwm bwmVar = this.c;
        synchronized (bwmVar.a) {
            bwmVar.d = false;
        }
    }

    public final void c() {
        defpackage.bwm bwmVar = this.c;
        synchronized (bwmVar.a) {
            if (!bwmVar.a()) {
                java.util.List list = bwmVar.b;
                bwmVar.b = bwmVar.c;
                bwmVar.c = list;
                bwmVar.d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.afdk) list.get(i)).w(defpackage.afbk.a);
                }
                list.clear();
            }
        }
    }

    @Override // defpackage.afdo
    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return affgVar.invoke(r, this);
    }

    @Override // defpackage.afdm, defpackage.afdo
    public final <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        return (E) defpackage.afga.t(this, afdnVar);
    }

    @Override // defpackage.afdm
    public final /* synthetic */ defpackage.afdn getKey() {
        return defpackage.bwq.b;
    }

    @Override // defpackage.afdo
    public final defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        return defpackage.afga.u(this, afdnVar);
    }

    @Override // defpackage.afdo
    public final defpackage.afdo plus(defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return defpackage.afga.w(this, afdoVar);
    }
}
