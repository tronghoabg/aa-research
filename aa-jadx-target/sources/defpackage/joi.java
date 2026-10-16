package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class joi implements defpackage.xzi {
    private final /* synthetic */ int a;

    public /* synthetic */ joi(int i) {
        this.a = i;
    }

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.jod.a;
                return new defpackage.zif(new joh());
            case 1:
                int i = defpackage.jho.O;
                return java.lang.Boolean.valueOf(defpackage.acve.f());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar2 = defpackage.jod.a;
                return defpackage.ysr.cp(java.lang.Boolean.TRUE);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Boolean.valueOf(defpackage.acox.i());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.kqx("watchdog");
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                kwk kwkVar = kwk.a;
                android.content.Context context = defpackage.mkp.a.c;
                android.content.Context context2 = defpackage.mkp.a.c;
                android.content.ComponentName componentNameA = defpackage.lhc.a().a(defpackage.mqg.NAVIGATION);
                componentNameA.getClass();
                return context.getString(2132083905, new mot(context2, componentNameA).c());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                kwk kwkVar2 = kwk.a;
                return defpackage.mkp.a.c.getString(2132084933);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new android.os.Bundle();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 9:
                return java.lang.Boolean.valueOf(acyl.h());
            case 10:
                return java.lang.Boolean.valueOf(acyl.i());
            case 11:
                return java.lang.Boolean.TRUE;
            case 12:
                return new lbp(defpackage.ync.a, new java.util.Date());
            case 13:
                return java.lang.Long.valueOf(defpackage.adai.e());
            case 14:
                defpackage.yqm yqmVar3 = ozp.a;
                return android.os.Build.VERSION.SDK_INT >= 35 ? defpackage.yhx.n(defpackage.adax.T().b) : defpackage.ynd.a;
            case 15:
                return java.util.concurrent.Executors.newCachedThreadPool();
            case 16:
                return 0;
            case 17:
                return new pmj();
            case 18:
                return new pql();
            case 19:
                return defpackage.xxe.a;
            default:
                return java.lang.Double.valueOf(adbh.a.b().a());
        }
    }
}
