package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adwo extends defpackage.adrs {
    final defpackage.adwn a;
    final defpackage.adns b;
    final /* synthetic */ defpackage.adww c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adwo(defpackage.adww adwwVar, defpackage.adwn adwnVar, defpackage.adns adnsVar) {
        super(null);
        this.c = adwwVar;
        this.a = adwnVar;
        adnsVar.getClass();
        this.b = adnsVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.adrs
    public final defpackage.ador A(defpackage.adnq adnqVar) {
        defpackage.adxh adxhVar;
        java.lang.Object obj;
        defpackage.adww adwwVar = this.c;
        defpackage.adox adoxVar = adwwVar.m;
        adoxVar.c();
        if (adwwVar.q != this.b) {
            return defpackage.ador.b;
        }
        defpackage.adot adotVar = adnqVar.a;
        if (!adotVar.d()) {
            g(adotVar.a());
            return adotVar.a();
        }
        java.lang.Object objC = adotVar.c();
        defpackage.adjy adjyVar = adwwVar.F;
        defpackage.adjs adjsVar = adnqVar.b;
        adjyVar.b(1, "Resolved address: {0}, config={1}", objC, adjsVar);
        if (adwwVar.S != 2) {
            adjyVar.b(2, "Address resolved: {0}", objC);
            adwwVar.S = 2;
        }
        defpackage.adno adnoVar = adnqVar.c;
        defpackage.adll adllVar = (defpackage.adll) adjsVar.a(defpackage.adll.a);
        defpackage.adxh adxhVar2 = (adnoVar == null || (obj = adnoVar.b) == null) ? null : (defpackage.adxh) obj;
        defpackage.ador adorVar = adnoVar != null ? adnoVar.a : null;
        if (adwwVar.L) {
            if (adxhVar2 == null) {
                adxhVar2 = adwwVar.J;
                if (adxhVar2 != null) {
                    adwwVar.H.b(adxhVar2.a());
                    adjyVar.a(2, "Received no service config, using default service config");
                } else if (adorVar == null) {
                    defpackage.adwt adwtVar = adwwVar.H;
                    adxhVar2 = defpackage.adww.d;
                    adwtVar.b(null);
                } else {
                    if (!adwwVar.K) {
                        adjyVar.a(2, "Fallback to error due to invalid first service config without default config");
                        defpackage.ador adorVar2 = adnoVar.a;
                        defpackage.ysr.aY(!adorVar2.g(), "the error status must not be OK");
                        adoxVar.execute(new defpackage.adwr(this, adorVar2, 1));
                        return adorVar2;
                    }
                    adxhVar2 = adwwVar.I;
                }
            } else if (adllVar != null) {
                adwwVar.H.b(adllVar);
                if (adxhVar2.a() != null) {
                    adjyVar.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                }
            } else {
                adwwVar.H.b(adxhVar2.a());
            }
            if (!adxhVar2.equals(adwwVar.I)) {
                adjyVar.b(2, "Service config changed{0}", adxhVar2 == defpackage.adww.d ? " to empty" : "");
                adwwVar.I = adxhVar2;
                adwwVar.Q.a = adxhVar2.a;
            }
            try {
                adwwVar.K = true;
            } catch (java.lang.RuntimeException e) {
                defpackage.adlo adloVar = this.c.g;
                defpackage.adww.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", "[" + java.lang.String.valueOf(adloVar) + "] Unexpected exception from parsing service config", (java.lang.Throwable) e);
            }
            adxhVar = adxhVar2;
        } else {
            if (adxhVar2 != null) {
                adjyVar.a(2, "Service config from name resolver discarded by channel settings");
            }
            adxhVar = adwwVar.J;
            if (adxhVar == null) {
                adxhVar = defpackage.adww.d;
            }
            if (adllVar != null) {
                adjyVar.a(2, "Config selector from name resolver discarded by channel settings");
            }
            adwwVar.H.b(adxhVar.a());
        }
        defpackage.adjs adjsVar2 = adnqVar.b;
        defpackage.adwn adwnVar = this.a;
        if (adwnVar != this.c.s) {
            return defpackage.ador.b;
        }
        defpackage.adrn adrnVar = new defpackage.adrn(adjsVar2);
        defpackage.adjr adjrVar = defpackage.adll.a;
        java.lang.Object obj2 = adrnVar.a;
        if (obj2 == null) {
            ((java.util.IdentityHashMap) adrnVar.b).remove(adjrVar);
        } else if (((defpackage.adjs) obj2).b.containsKey(adjrVar)) {
            adrnVar.b(0).remove(adjrVar);
        }
        java.util.Map map = adxhVar.c;
        if (map != null) {
            adrnVar.c(defpackage.admj.a, map);
            adrnVar.a();
        }
        return adwnVar.a.a(new defpackage.admf(adotVar.c(), adrnVar.a(), adxhVar.b));
    }

    public final void g(defpackage.ador adorVar) {
        java.util.logging.Logger logger = defpackage.adww.a;
        java.util.logging.Level level = java.util.logging.Level.WARNING;
        defpackage.adww adwwVar = this.c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new java.lang.Object[]{adwwVar.g, adorVar});
        defpackage.adwt adwtVar = adwwVar.H;
        if (adwtVar.a.get() == defpackage.adww.e) {
            defpackage.adww adwwVar2 = adwtVar.c;
            defpackage.adxh adxhVar = adwwVar2.J;
            if (adxhVar != null) {
                adwtVar.b(adxhVar.a());
                adwwVar2.I = adxhVar;
                adwwVar2.F.a(4, "Initial Name Resolution error, using default service config");
            } else {
                adwtVar.b(null);
            }
        }
        if (adwwVar.S != 3) {
            adwwVar.F.b(3, "Failed to resolve name: {0}", adorVar);
            adwwVar.S = 3;
        }
        defpackage.adwn adwnVar = this.a;
        if (adwnVar != adwwVar.s) {
            return;
        }
        adwnVar.a.b(adorVar);
    }
}
