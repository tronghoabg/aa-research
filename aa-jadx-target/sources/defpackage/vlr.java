package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vlr implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final /* synthetic */ int c;

    public vlr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, int i) {
        this.c = i;
        this.a = aclwVar;
        this.b = aclwVar2;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) ((defpackage.xzi) ((defpackage.vyk) this.b).a().d(new defpackage.ryo((android.content.Context) ((defpackage.aclu) this.a).b, 2))).fF();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) ((defpackage.aclu) this.b).b).booleanValue();
                defpackage.ldv ldvVar = (defpackage.ldv) ((defpackage.aclu) this.a).b;
                defpackage.vtj vtjVarD = defpackage.vtk.d();
                vtjVarD.d = 3;
                vtjVarD.b = new defpackage.tfw(ldvVar);
                if (zBooleanValue) {
                    vtjVarD.b(Integer.MAX_VALUE);
                }
                return vtjVarD.a();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (!defpackage.wfp.h(java.lang.Thread.currentThread())) {
                    defpackage.vss vssVar = (defpackage.vss) this.a.a();
                    if (!defpackage.vss.b()) {
                        defpackage.ypu ypuVarH = vmf.a.h();
                        java.lang.Object obj = vssVar.a;
                        ((defpackage.ype) ((defpackage.ype) ypuVarH).ai((char) 9771)).y("Primes init triggered from background in package: %s", obj);
                        if (!vssVar.a()) {
                            throw new java.lang.IllegalStateException(java.lang.String.format("Primes init triggered from background in package: %s", obj));
                        }
                    }
                }
                return new defpackage.vlw(((defpackage.vlz) this.b).a());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.Context context = (android.content.Context) ((defpackage.aclu) this.a).b;
                defpackage.vvu vvuVarA = (defpackage.vvu) ((defpackage.afak) ((defpackage.tga) this.b).b().d(new defpackage.qfr(9))).a();
                if (vvuVarA.c()) {
                    try {
                        boolean zA = defpackage.syd.a.a(context.getContentResolver(), new defpackage.xyj(":").e("primes", context.getPackageName(), "force_gc_before_record_memory"), vvuVarA.c);
                        defpackage.vvt vvtVar = new defpackage.vvt(vvuVarA);
                        vvtVar.b(zA);
                        vvuVarA = vvtVar.a();
                    } catch (java.lang.SecurityException e) {
                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9775)).u("Fail to read Gservices: ");
                    }
                    break;
                }
                vvuVarA.getClass();
                return vvuVarA;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.vmg vmgVar = (defpackage.vmg) this.b.a();
                int i = vmgVar.b;
                int i2 = vmgVar.a;
                defpackage.ntl ntlVarA = ((defpackage.tnd) this.a).a();
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(i, new defpackage.vme(i2), new defpackage.vmd());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                defpackage.zhw zhwVarD = ntlVarA.d(defpackage.ysr.cg(scheduledThreadPoolExecutor));
                zhwVarD.getClass();
                return zhwVarD;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.vpv((defpackage.tmy) this.a.a(), this.b);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.vsl((android.content.Context) ((defpackage.aclu) this.a).b, (defpackage.vri) this.b.a());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.rkq(((defpackage.vqx) this.b).a(), (android.content.Context) ((defpackage.aclu) this.a).b);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object ynuVar = ((defpackage.xyn) ((defpackage.aclu) this.b).b).f() ? new defpackage.ynu((defpackage.vsw) this.a.a()) : defpackage.ynd.a;
                ynuVar.getClass();
                return ynuVar;
            case 9:
                java.lang.Object ynuVar2 = !((defpackage.xyn) ((defpackage.aclu) this.b).b).f() ? defpackage.ynd.a : new defpackage.ynu((defpackage.vsw) this.a.a());
                ynuVar2.getClass();
                return ynuVar2;
            case 10:
                java.util.Set setV = defpackage.a.V((defpackage.xyn) this.b.a(), this.a);
                setV.getClass();
                return setV;
            case 11:
                java.util.Set setV2 = defpackage.a.V((defpackage.xyn) ((defpackage.aclu) this.b).b, this.a);
                setV2.getClass();
                return setV2;
            case 12:
                java.lang.Object ynuVar3 = ((defpackage.xyn) ((defpackage.aclu) this.b).b).f() ? new defpackage.ynu((defpackage.vsw) this.a.a()) : defpackage.ynd.a;
                ynuVar3.getClass();
                return ynuVar3;
            case 13:
                return new defpackage.vwq(this.a, this.b);
            case 14:
                java.util.Set setV3 = defpackage.a.V((defpackage.xyn) this.b.a(), this.a);
                setV3.getClass();
                return setV3;
            case 15:
                return new defpackage.vxf((defpackage.vra) this.a.a(), defpackage.acls.b(this.b));
            case 16:
                java.util.Set setV4 = defpackage.a.V((defpackage.xyn) this.b.a(), this.a);
                setV4.getClass();
                return setV4;
            case 17:
                vvb vvbVar = ((defpackage.xyn) ((defpackage.aclu) this.b).b).f() ? (vvb) this.a.a() : new vvb((byte[]) null);
                vvbVar.getClass();
                return vvbVar;
            case 18:
                java.util.Set setV5 = defpackage.a.V((defpackage.xyn) ((defpackage.aclu) this.b).b, this.a);
                setV5.getClass();
                return setV5;
            case 19:
                return new defpackage.vyo((java.util.Random) ((defpackage.xyn) ((defpackage.aclu) this.b).b).d((java.util.Random) this.a.a()));
            default:
                return new defpackage.zhk((defpackage.tmy) this.a.a(), (defpackage.xyn) ((defpackage.aclu) this.b).b);
        }
    }

    public vlr(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = aclwVar;
        this.a = aclwVar2;
    }
}
