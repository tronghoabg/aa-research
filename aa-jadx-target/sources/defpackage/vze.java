package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vze {
    public volatile defpackage.vzh a = defpackage.vzg.a;
    public volatile boolean b = true;
    public volatile defpackage.vyz c = new defpackage.vzb();

    public vze(final android.content.Context context, final java.util.concurrent.Executor executor, final defpackage.vzg vzgVar, final defpackage.aclm aclmVar, boolean z, defpackage.xyn xynVar, defpackage.afak afakVar, final defpackage.zhk zhkVar) {
        final defpackage.afak afakVar2 = (!z || xynVar.f()) ? null : afakVar;
        executor.execute(new java.lang.Runnable() { // from class: vzd
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.vze vzeVar = this.a;
                defpackage.aclm aclmVar2 = aclmVar;
                defpackage.zhk zhkVar2 = zhkVar;
                android.content.Context context2 = context;
                if (defpackage.tnx.e(context2)) {
                    vzeVar.a(aclmVar2, zhkVar2);
                } else {
                    java.util.concurrent.Callable callable = java.util.concurrent.Executors.callable(new defpackage.sbn(vzeVar, aclmVar2, zhkVar2, executor, 11), null);
                    defpackage.tnx.b(context2, new defpackage.vtx(callable, 1), defpackage.zgt.INSTANCE);
                }
                if (vzeVar.b) {
                    defpackage.afak afakVar3 = afakVar2;
                    defpackage.vzg vzgVar2 = vzgVar;
                    if (afakVar3 == null) {
                        defpackage.abor aborVarN = ajgy.a.n();
                        aborVarN.t();
                        ajgy ajgyVar = aborVarN.b;
                        ajgyVar.e = 2;
                        ajgyVar.b = 2 | ajgyVar.b;
                        vzeVar.a = vzgVar2.a((ajgy) aborVarN.q());
                        return;
                    }
                    try {
                        vzeVar.a = vzgVar2.a((ajgy) afakVar3.a());
                    } catch (java.lang.Throwable th) {
                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(th)).ai((char) 9912)).u("Couldn't get sampling strategy");
                        defpackage.abor aborVarN2 = ajgy.a.n();
                        aborVarN2.t();
                        ajgy ajgyVar2 = aborVarN2.b;
                        ajgyVar2.c = 2;
                        ajgyVar2.d = 1;
                        aborVarN2.t();
                        ajgy ajgyVar3 = aborVarN2.b;
                        ajgyVar3.e = 3;
                        ajgyVar3.b = 2 | ajgyVar3.b;
                        vzeVar.a = vzgVar2.a((ajgy) aborVarN2.q());
                    }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tmy] */
    public final void a(defpackage.aclm aclmVar, defpackage.zhk zhkVar) {
        try {
            defpackage.vrp vrpVar = (defpackage.vrp) aclmVar.a();
            this.b = vrpVar.c();
            final int iA = vrpVar.a();
            this.c = zhkVar.a ? new defpackage.vzb() : new defpackage.vzc(new defpackage.afak() { // from class: vza
                @Override // defpackage.afak, defpackage.afaj
                public final java.lang.Object a() {
                    return java.lang.Integer.valueOf(iA);
                }
            }, zhkVar.b);
        } catch (java.lang.Throwable th) {
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(th)).ai((char) 9911)).u("Couldn't get config");
            this.b = false;
        }
    }
}
