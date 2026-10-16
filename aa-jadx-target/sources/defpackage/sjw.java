package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sjw extends defpackage.slw implements defpackage.siq {
    public static final defpackage.ski a = new defpackage.ski();

    public sjw(android.content.Context context) {
        defpackage.rkq rkqVar = defpackage.sip.m;
        defpackage.slp slpVar = defpackage.slq.c;
        defpackage.slu sluVar = new defpackage.slu();
        sluVar.b = new defpackage.sqs();
        super(context, null, rkqVar, slpVar, sluVar.a());
    }

    public static boolean b(defpackage.zhs zhsVar) {
        if (zhsVar.isDone() && !zhsVar.isCancelled()) {
            try {
                defpackage.a.K(zhsVar);
                return true;
            } catch (java.lang.RuntimeException | java.util.concurrent.ExecutionException unused) {
            }
        }
        return false;
    }

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
    public static final defpackage.swx d(defpackage.sim simVar, defpackage.xyd xydVar) {
        defpackage.zhs zhsVar;
        int i;
        int i2 = 1;
        if (simVar.l) {
            android.util.Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            zhsVar = defpackage.zho.a;
        } else {
            simVar.l = true;
            defpackage.sil silVar = simVar.a;
            zxw zxwVar = silVar.l;
            sit sitVar = null;
            sit sitVar2 = zxwVar != null ? zxwVar.b : null;
            if (sitVar2 == null || (i = sitVar2.a) == 4) {
                sitVar = sitVar2;
            } else {
                android.util.Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + java.lang.Integer.toString(i - 1) + " is not one of the values expected for a logger-level provider: 3 or 4");
            }
            if (sitVar == null || sitVar.a != 4) {
                sit sitVar3 = simVar.j;
                if (sitVar3 != null && sitVar3.a == 2) {
                    simVar.a(sitVar3);
                } else if (sitVar != null) {
                    simVar.a(sitVar);
                } else if (sitVar3 != null) {
                    simVar.a(sitVar3);
                }
            } else {
                simVar.a(sitVar);
            }
            if (silVar.c()) {
                zhsVar = defpackage.zho.a;
            } else {
                defpackage.zhs zhsVar2 = defpackage.zho.a;
                defpackage.wdh wdhVar = new defpackage.wdh(simVar, zhsVar2, i2);
                defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                int i3 = defpackage.zgh.c;
                defpackage.zgf zgfVar = new defpackage.zgf(zhsVar2, wdhVar);
                zhsVar2.c(zgfVar, defpackage.ysr.ch(zgtVar, zgfVar));
                defpackage.zgg zggVar = new defpackage.zgg(zgfVar, new defpackage.kpl(simVar, 5));
                zgfVar.c(zggVar, defpackage.ysr.ch(zgtVar, zggVar));
                zhsVar = zggVar;
            }
        }
        return b(zhsVar) ? (defpackage.swx) xydVar.a(simVar) : vjx.m(zhsVar).b(defpackage.zgt.INSTANCE, new sjs(xydVar, simVar, 1));
    }

    public final defpackage.swx a(defpackage.sim simVar, defpackage.sjo sjoVar) {
        defpackage.skb.b().d(1007, this.b);
        defpackage.sjv sjvVar = new defpackage.sjv(this, simVar, this.i, sjoVar);
        super.w(2, sjvVar);
        return defpackage.spl.b(sjvVar);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void c(com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            defpackage.sqs.aS(com.google.android.gms.common.api.Status.a);
            return;
        }
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qqu(batchedLogErrorParcelable, 9);
        snyVar.b = new com.google.android.gms.common.Feature[]{defpackage.sjk.a};
        snyVar.b();
        super.u(2, snyVar.a());
    }
}
