package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class img implements java.lang.Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ img(int i) {
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                com.google.android.gms.car.diagnostics.CriticalError criticalErrorA = com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER);
                defpackage.ile ileVar = com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks.b;
                ileVar.getClass();
                ileVar.a(criticalErrorA);
                return;
            case 1:
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar = defpackage.joq.a;
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jqk.a.g()).ai((char) 2602)).u("Delegate CarService has died, no recovery possible.");
                throw new java.lang.IllegalStateException("Delegate CarService has died, no recovery possible.");
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar2 = jqn.a;
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar3 = defpackage.kzb.a;
                if (defpackage.ler.c().g()) {
                    defpackage.mug.a().y();
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i = defpackage.kzk.a;
                defpackage.lam.a().h(18, null);
                return;
            case 9:
                defpackage.kzs.e();
                return;
            case 10:
                defpackage.lam.e(defpackage.yxo.VOICE_SESSION_MICROPHONE_NOT_OPENED_WITHIN_TIMEOUT, null);
                return;
            case 11:
                defpackage.yqm yqmVar4 = defpackage.mac.a;
                defpackage.ntl.a().b(null);
                return;
            case 12:
                defpackage.mde mdeVar = defpackage.mdi.a;
                android.content.pm.PackageManager packageManager = defpackage.mkp.a.c.getPackageManager();
                defpackage.yot it = ((defpackage.ync) defpackage.kmv.a(defpackage.acqh.e())).keySet().iterator();
                it.getClass();
                while (it.hasNext()) {
                    E next = it.next();
                    next.getClass();
                    try {
                        a$.ExternalSyntheticApiModelOutline2.m(packageManager, (java.lang.String) next, 0);
                        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PARKED_APP, defpackage.zbd.LQ).l());
                        defpackage.omf.u().F((defpackage.rrp) defpackage.omv.p(defpackage.acbk.N).l());
                        return;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                }
                return;
            case 13:
                defpackage.msf msfVar = defpackage.msg.a;
                defpackage.nte.c().f(true);
                return;
            case 14:
                defpackage.yqm yqmVar5 = com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView.a;
                return;
            case 15:
                defpackage.yqm yqmVar6 = noe.a;
                return;
            case 16:
                nrz.j();
                return;
            case 17:
                nrz.j();
                return;
            case 18:
                defpackage.yqm yqmVar7 = nsl.a;
                ((defpackage.yqj) nsl.a.l().ai((char) 5359)).u("onScrimClicked");
                defpackage.nse.b().a().i();
                return;
            case 19:
                defpackage.nuz nuzVarB = defpackage.nuz.b();
                nwc.a.longValue();
                nuzVarB.g("quick_feedback_notification_tag", 759347436L, "com.google.android.projection.gearhead");
                return;
            default:
                defpackage.yqm yqmVar8 = defpackage.nwi.a;
                return;
        }
    }
}
