package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lqi implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ lqi(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = 2;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return ((lok) obj).e;
            case 1:
                defpackage.yqm yqmVar = defpackage.lqz.a;
                return defpackage.tna.aJ((los) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Boolean.valueOf(((lqx) obj).a());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = ((lqx) obj).a.b;
                defpackage.yqm yqmVar2 = defpackage.lqz.a;
                boolean z = false;
                if (aaPlaybackState != null && aaPlaybackState.Q() == 2) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return (lny) defpackage.lot.b((loq) obj, lny.class);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return (lny) defpackage.lot.b((loq) obj, lny.class);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((lny) obj).c();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.tna.aJ((los) obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((lok) obj).f;
            case 9:
                return ((lph) obj).a;
            case 10:
                lph lphVar = (lph) obj;
                if (lphVar.b) {
                    return lphVar.a;
                }
                return null;
            case 11:
                defpackage.yqm yqmVar3 = defpackage.lrw.a;
                return (lqa) defpackage.ysr.au((defpackage.ygw) obj);
            case 12:
                defpackage.yqm yqmVar4 = defpackage.lrw.a;
                return defpackage.tna.aJ((los) obj);
            case 13:
                defpackage.yqm yqmVar5 = defpackage.lrw.a;
                return defpackage.tcu.v(defpackage.lpg.j().f((android.content.ComponentName) obj), new defpackage.lqi(12));
            case 14:
                lok lokVar = (lok) obj;
                defpackage.yqm yqmVar6 = defpackage.lrw.a;
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return defpackage.tcu.e(new defpackage.eqs(lokVar), lokVar.e, lokVar.f, new defpackage.kvb(11));
            case 15:
                j$.time.Duration duration = defpackage.lrz.a;
                return defpackage.lpg.j().f((android.content.ComponentName) obj);
            case 16:
                j$.time.Duration duration2 = defpackage.lrz.a;
                return defpackage.tna.aJ((los) obj);
            case 17:
                lok lokVar2 = (lok) obj;
                defpackage.eqp eqpVar = lokVar2.e;
                j$.time.Duration duration3 = defpackage.lrz.a;
                return defpackage.tcu.w(eqpVar, new defpackage.lra(lokVar2, i));
            case 18:
                defpackage.yqm yqmVar7 = defpackage.lsj.a;
                return (lny) defpackage.lot.b((loq) obj, lny.class);
            case 19:
                return ((lny) obj).c();
            default:
                return defpackage.lsj.b((android.content.ComponentName) obj);
        }
    }
}
