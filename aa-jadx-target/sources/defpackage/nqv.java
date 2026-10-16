package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nqv implements defpackage.affc {
    private final /* synthetic */ int a;

    public nqv(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.nqw.b.l().y("Immersives use fullscreen = %b", (defpackage.nqt) obj);
                return obj;
            case 1:
                defpackage.nqw.b.l().y("Main content covering maps = %b", (defpackage.nqt) obj);
                return obj;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                return num;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                num2.intValue();
                return num2;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Integer.valueOf(-((java.lang.Integer) obj).intValue());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Integer.valueOf(-((java.lang.Integer) obj).intValue());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return (defpackage.mqj) ((java.util.Map) obj).get(com.google.android.gms.car.display.CarRegionId.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.nvt nvtVar = (defpackage.nvt) obj;
                nvtVar.getClass();
                return java.lang.Boolean.valueOf(nvtVar.b == 4);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.nvt nvtVar2 = (defpackage.nvt) obj;
                nvtVar2.getClass();
                return nvtVar2.a;
            case 9:
                defpackage.nvt nvtVar3 = (defpackage.nvt) obj;
                nvtVar3.getClass();
                return java.lang.Boolean.valueOf(nvtVar3.b == 2);
            case 10:
                defpackage.nvt nvtVar4 = (defpackage.nvt) obj;
                nvtVar4.getClass();
                return nvtVar4.a;
            case 11:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                defpackage.yqm yqmVar = defpackage.nvv.a;
                mqjVar.getClass();
                return java.lang.Boolean.valueOf(mqjVar.b == defpackage.mqg.NAVIGATION);
            case 12:
                nwu nwuVar = (nwu) obj;
                float f = nwl.a;
                nwuVar.getClass();
                return java.lang.Boolean.valueOf(nwuVar == nwu.b);
            case 13:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                float f2 = nwl.a;
                return java.lang.Integer.valueOf(-iIntValue);
            case 14:
                defpackage.cla claVar = (defpackage.cla) obj;
                defpackage.yqm yqmVar2 = nyc.a;
                claVar.getClass();
                claVar.t(1);
                return defpackage.afbk.a;
            case 15:
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream((defpackage.ygw) obj).map(new defpackage.ngh(6));
                int i = defpackage.nuz.b;
                j$.util.stream.Stream streamSorted = map.sorted(new aiq(18));
                int i2 = defpackage.ygw.d;
                return (defpackage.ygw) streamSorted.collect(defpackage.yds.a);
            case 16:
                defpackage.qts qtsVar = (defpackage.qts) obj;
                defpackage.nyz nyzVar = defpackage.nza.a;
                qtsVar.getClass();
                qtsVar.l = true;
                qtsVar.m = 192;
                return defpackage.afbk.a;
            case 17:
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
                defpackage.yqm yqmVar3 = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                viewGroup.getClass();
                android.transition.TransitionManager.beginDelayedTransition(viewGroup);
                return defpackage.afbk.a;
            case 18:
                defpackage.nyi nyiVar = (defpackage.nyi) obj;
                defpackage.yqm yqmVar4 = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                nyiVar.getClass();
                return java.lang.Integer.valueOf(nyiVar.b);
            case 19:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (((kjr) obj2).b().contains(2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                ((java.lang.Boolean) obj).booleanValue();
                return defpackage.afbk.a;
        }
    }
}
