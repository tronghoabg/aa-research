package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ilu implements defpackage.xzi {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilu(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v59, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r14v61, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r14v65, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, jfa, jfd, jfe] */
    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        int i = 6;
        boolean z = false;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new android.os.Handler(((defpackage.imi) this.a).o.getLooper());
            case 1:
                return new defpackage.rad((defpackage.imi) this.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                com.google.android.gms.car.CarInfo carInfoT = ((defpackage.imi) this.a).t();
                if (carInfoT != null && carInfoT.e >= 6) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ?? r3 = this.a;
                defpackage.izq izqVar = new defpackage.izq(r3, null);
                defpackage.imi imiVar = (defpackage.imi) r3;
                defpackage.jcw jcwVarB = imiVar.u.b();
                jcwVarB.getClass();
                defpackage.jgq jgqVar = imiVar.X;
                defpackage.imn imnVar = imiVar.ac;
                defpackage.isf isfVar = imiVar.ab;
                android.os.Handler handler = imiVar.o;
                defpackage.ivj ivjVar = imiVar.K;
                return new defpackage.ivk(izqVar, imiVar.O, r3, r3, imiVar.l, r3, imiVar.k, ivjVar, handler, jcwVarB, isfVar, imnVar, jgqVar);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.imi.o(((defpackage.imi) this.a).X()).y;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.imi) this.a).n();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.imi) this.a).W);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ioh iohVar = (defpackage.ioh) this.a;
                return defpackage.acvt.h() ? iohVar.z : new defpackage.rqm(iohVar.d, false, false);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar = defpackage.iyh.a;
                android.content.pm.PackageManager packageManager = ((android.content.Context) this.a).getPackageManager();
                defpackage.absx absxVarB = defpackage.acnc.b();
                defpackage.xzd xzdVar = iyq.a;
                return defpackage.tht.c(new defpackage.gjt(packageManager, 8), absxVarB);
            case 9:
                return java.lang.Boolean.valueOf(((defpackage.slj) ((defpackage.iyh) this.a).c.a()).b("com.android.vending"));
            case 10:
                return ((defpackage.jeb) this.a).a.d();
            case 11:
                return ((defpackage.jeb) this.a).a.c();
            case 12:
                int i2 = defpackage.jgv.c;
                defpackage.jhi jhiVar = ((defpackage.inh) this.a).w;
                jhiVar.getClass();
                return java.lang.Integer.valueOf(jhiVar.a.d);
            case 13:
                final com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) this.a;
                return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory() { // from class: jgx
                    @Override // java.util.concurrent.ThreadFactory
                    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                        return new java.lang.Thread(new defpackage.ire(runnable, 14), "GH-Vsync-" + carDisplayId.b);
                    }
                });
            case 14:
                return this.a.fF();
            case 15:
                defpackage.yqm yqmVar2 = defpackage.jod.a;
                return ((defpackage.jnx) this.a.fF()).c;
            case 16:
                defpackage.yqm yqmVar3 = defpackage.jod.a;
                defpackage.jnx jnxVar = (defpackage.jnx) this.a.fF();
                defpackage.zhm zhmVarV = defpackage.zhm.v(jnxVar.c);
                defpackage.iku ikuVar = new defpackage.iku(jnxVar, 5);
                defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                return zhmVarV.w(ikuVar, zgtVar).u(java.lang.Exception.class, new defpackage.iku(jnxVar, i), zgtVar);
            case 17:
                defpackage.yqm yqmVar4 = defpackage.joq.a;
                return android.provider.Settings.Secure.getString(((android.content.Context) this.a).getApplicationContext().getContentResolver(), "android_id");
            case 18:
                defpackage.yqm yqmVar5 = defpackage.jpc.a;
                java.lang.Object obj = this.a;
                obj.getClass();
                return defpackage.jml.a.a((android.content.Context) obj);
            case 19:
                iyw iywVar = new iyw();
                defpackage.jpz jpzVar = ((defpackage.jqb) this.a).e;
                jpzVar.getClass();
                defpackage.jpc jpcVar = (defpackage.jpc) jpzVar;
                jpcVar.d.post(new jlb(jpcVar, iywVar, 10));
                return iywVar;
            default:
                return defpackage.iyh.q(((defpackage.jqk) this.a).h);
        }
    }
}
