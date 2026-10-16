package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mtz implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ mtz(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = false;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.qts qtsVar = (defpackage.qts) obj;
                defpackage.yqm yqmVar = defpackage.muc.b;
                qtsVar.getClass();
                qtsVar.l = true;
                int i = defpackage.ygw.d;
                defpackage.ygw ygwVar = defpackage.ymx.a;
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.VIEW");
                intentFilter.addDataScheme("geo");
                android.content.IntentFilter intentFilter2 = new android.content.IntentFilter("android.intent.action.DIAL");
                intentFilter2.addDataScheme("tel");
                android.content.IntentFilter intentFilter3 = new android.content.IntentFilter("android.intent.action.CALL");
                intentFilter3.addDataScheme("tel");
                qtsVar.v = new com.google.android.gms.car.BlackHoleParams(defpackage.afga.ac(intentFilter, intentFilter2, intentFilter3), 500, ygwVar);
                qtsVar.w = 1.5f;
                return defpackage.afbk.a;
            case 1:
                mtw mtwVar = mty.a;
                return new tj();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!defpackage.oek.a.contains(((com.google.android.apps.auto.components.telecom.PhoneCall) it.next()).b)) {
                            z = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.List list2 = (java.util.List) obj;
                list2.getClass();
                return java.lang.Boolean.valueOf(!list2.isEmpty());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Boolean.valueOf(!defpackage.afga.e((java.lang.Float) obj, 0.0f));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                return bool.booleanValue() ? defpackage.tcu.d : defpackage.tcu.a(defpackage.tcu.o(defpackage.kja.a()), (defpackage.eqp) defpackage.ncx.a.a().a().c);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.List list3 = (java.util.List) obj;
                list3.getClass();
                int i2 = defpackage.nuz.b;
                return defpackage.afga.aW(list3, new aiq(18));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.List list4 = (java.util.List) obj;
                list4.getClass();
                return defpackage.afga.aW(list4, new aiq(13));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.muj mujVar = (defpackage.muj) obj;
                int i3 = defpackage.muq.d;
                mujVar.getClass();
                return mujVar.c();
            case 9:
                defpackage.muj mujVar2 = (defpackage.muj) obj;
                int i4 = defpackage.muq.d;
                mujVar2.getClass();
                return mujVar2.b();
            case 10:
                ((defpackage.cuw) obj).getClass();
                return defpackage.afbk.a;
            case 11:
                doq doqVar = (doq) obj;
                doqVar.getClass();
                dor dorVar = doqVar.c;
                doqVar.i.k(dorVar.d, 0.0f);
                doqVar.g.j(dorVar.e, 0.0f);
                return defpackage.afbk.a;
            case 12:
                nbt nbtVar = (nbt) obj;
                defpackage.yqm yqmVar2 = defpackage.mzk.a;
                nbtVar.getClass();
                return new oqp(nbtVar, 1);
            case 13:
                defpackage.mzk.a.l().y("Live Media Items: %s", (java.util.List) obj);
                return obj;
            case 14:
                lok lokVar = (lok) obj;
                defpackage.yqm yqmVar3 = defpackage.mzu.a;
                lokVar.getClass();
                return lokVar.f;
            case 15:
                defpackage.yqm yqmVar4 = defpackage.mzu.a;
                return defpackage.tna.aC((los) obj);
            case 16:
                lok lokVar2 = (lok) obj;
                defpackage.yqm yqmVar5 = defpackage.mzu.a;
                lokVar2.getClass();
                return lokVar2.j;
            case 17:
                lok lokVar3 = (lok) obj;
                defpackage.yqm yqmVar6 = defpackage.mzu.a;
                lokVar3.getClass();
                return lokVar3.e;
            case 18:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                defpackage.yqm yqmVar7 = defpackage.mzu.a;
                aaPlaybackState.getClass();
                return java.lang.Integer.valueOf(aaPlaybackState.Q());
            case 19:
                defpackage.yqm yqmVar8 = defpackage.mzu.a;
                return defpackage.lqf.d().b((android.content.ComponentName) obj);
            default:
                defpackage.yqm yqmVar9 = defpackage.mzu.a;
                return java.lang.Boolean.valueOf(!((defpackage.ygw) obj).isEmpty());
        }
    }
}
