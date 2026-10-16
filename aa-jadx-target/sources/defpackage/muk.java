package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class muk implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ muk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v23, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v46, types: [bwx, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                int i = defpackage.mun.e;
                defpackage.mkp.a.g();
                return defpackage.oml.v((defpackage.qsh) this.a, com.google.android.gms.car.display.CarDisplayId.a);
            case 1:
                return defpackage.tna.aw((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.tna.aw((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar = mvv.a;
                oqw.b((android.content.Context) this.a);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = mvv.a;
                oqw.b((android.content.Context) this.a);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((mwp) this.a).f.invoke();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((com.google.android.apps.auto.components.system.dashboard.design.DashboardCardView) this.a).a();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar3 = defpackage.myx.a;
                ?? r6 = this.a;
                if (r6 != 0) {
                    r6.invoke();
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar4 = defpackage.myx.a;
                ((defpackage.ltm) this.a).c.invoke();
                return defpackage.afbk.a;
            case 9:
                defpackage.yqm yqmVar5 = defpackage.myx.a;
                ((defpackage.ltm) this.a).c.invoke();
                return defpackage.afbk.a;
            case 10:
                defpackage.yqm yqmVar6 = defpackage.mzk.a;
                return java.lang.Boolean.valueOf(defpackage.afga.cc(new java.lang.Integer[]{6, 3}).contains(java.lang.Integer.valueOf(((com.google.android.apps.auto.components.media.compat.AaPlaybackState) this.a.a()).Q())));
            case 11:
                defpackage.yqm yqmVar7 = defpackage.mzk.a;
                return java.lang.Boolean.valueOf(defpackage.lmp.a.a().c() && java.lang.Math.abs(((defpackage.bby) this.a).c()) > 0.005f);
            case 12:
                return defpackage.mzk.h(this.a);
            case 13:
                return new defpackage.kfo(nab.class, new defpackage.muk(this.a, 14));
            case 14:
                com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment mediaPlayerFragment = (com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment) this.a;
                defpackage.eqp eqpVarA = mediaPlayerFragment.b().a();
                defpackage.eqp eqpVarB = mediaPlayerFragment.b().b();
                defpackage.nal nalVarW = defpackage.mkc.w();
                return new nab(eqpVarA, eqpVarB, nalVarW, defpackage.ltu.e(defpackage.zbe.DASHBOARD, null, null, nalVarW, 6));
            case 15:
                nac nacVar = (nac) this.a;
                return defpackage.tcu.a(nacVar.b, nacVar.a);
            case 16:
                nac nacVar2 = (nac) this.a;
                return defpackage.tcu.y(defpackage.tcu.p(nacVar2.a()), (defpackage.eqp) nacVar2.c.a());
            case 17:
                nah nahVar = (nah) this.a;
                return new nad(nahVar.a().a(), nahVar.a().b());
            case 18:
                return new defpackage.kfo(nad.class, new defpackage.muk(this.a, 17));
            case 19:
                return new defpackage.kfo(nai.class, new defpackage.muk(this.a, 20));
            default:
                naj najVar = (naj) this.a;
                return new nai(najVar.a().a(), najVar.a().b());
        }
    }
}
