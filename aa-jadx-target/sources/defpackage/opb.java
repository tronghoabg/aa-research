package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class opb implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ opb(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v53, types: [affh, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.oqk.a.a().f.startAppWidgetConfigureActivityForResult((android.app.Activity) this.a, ((java.lang.Integer) obj).intValue(), 0, 103, null);
                return defpackage.afbk.a;
            case 1:
                defpackage.gkc gkcVar = (defpackage.gkc) obj;
                oni oniVar = oni.a;
                gkcVar.getClass();
                int[] iArr = {android.R.attr.state_focused, android.R.attr.state_window_focused};
                ong ongVar = (ong) this.a;
                int i = ongVar.b;
                gkcVar.y(i, iArr);
                gkcVar.y(i, android.R.attr.state_activated);
                gkcVar.w(ongVar.a);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ctc ctcVar = (defpackage.ctc) obj;
                ctcVar.getClass();
                ((defpackage.byj) this.a).h((int) (ctcVar.h() & 4294967295L));
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.a.b(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.byh) this.a).h(((java.lang.Float) obj).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.byj) this.a).h(((java.lang.Integer) obj).intValue());
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = (android.appwidget.AppWidgetProviderInfo) obj;
                appWidgetProviderInfo.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("widget_info", appWidgetProviderInfo);
                com.google.android.apps.auto.components.widgets.EarthPickerActivity earthPickerActivity = (com.google.android.apps.auto.components.widgets.EarthPickerActivity) this.a;
                earthPickerActivity.setResult(-1, intent);
                earthPickerActivity.finish();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                this.a.b(str);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.util.Set set = (java.util.Set) obj;
                set.getClass();
                this.a.b(set);
                return defpackage.afbk.a;
            case 9:
                pab pabVar = pac.a;
                pck pckVar = (pck) j$.util.DesugarCollections.unmodifiableMap(((pcl) obj).b).get(this.a);
                return j$.util.Optional.ofNullable(pckVar != null ? defpackage.otn.I(pckVar) : null);
            case 10:
                pcl pclVar = (pcl) obj;
                pab pabVar2 = pac.a;
                pclVar.getClass();
                defpackage.abor aborVarK = pclVar.K();
                aborVarK.getClass();
                j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(aborVarK.b.c)).getClass();
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) this.a;
                java.lang.String address = bluetoothDevice.getAddress();
                address.getClass();
                aborVarK.t();
                aborVarK.b.c().remove(address);
                j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(aborVarK.b.b)).getClass();
                java.lang.String address2 = bluetoothDevice.getAddress();
                address2.getClass();
                aborVarK.t();
                aborVarK.b.b().remove(address2);
                abrn abrnVarF = defpackage.otn.F(aborVarK);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : abrnVarF.a()) {
                    if (!defpackage.afga.f((java.lang.String) entry.getValue(), bluetoothDevice.getAddress())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                defpackage.otn.F(aborVarK);
                aborVarK.t();
                aborVarK.b.d().clear();
                defpackage.otn.F(aborVarK);
                aborVarK.t();
                aborVarK.b.d().putAll(linkedHashMap);
                return defpackage.otn.E(aborVarK);
            case 11:
                pcl pclVar2 = (pcl) obj;
                pab pabVar3 = pac.a;
                pclVar2.getClass();
                pcm pcmVar = (pcm) j$.util.DesugarCollections.unmodifiableMap(pclVar2.c).get(this.a);
                return pcmVar == null ? j$.util.Optional.empty() : j$.util.Optional.of(pcmVar);
            case 12:
                pcl pclVar3 = (pcl) obj;
                pab pabVar4 = pac.a;
                pclVar3.getClass();
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(pclVar3.b);
                java.lang.Object obj2 = this.a;
                pck pckVar2 = (pck) mapUnmodifiableMap.get(obj2);
                pav pavVarI = pckVar2 != null ? defpackage.otn.I(pckVar2) : null;
                pcm pcmVar2 = (pcm) j$.util.DesugarCollections.unmodifiableMap(pclVar3.c).get(obj2);
                if (pavVarI == null || pcmVar2 == null) {
                    return j$.util.Optional.empty();
                }
                java.lang.String str2 = pcmVar2.c;
                str2.getClass();
                return j$.util.Optional.of(new pba(pavVarI, str2, pcmVar2.d));
            case 13:
                java.lang.Object obj3 = this.a;
                defpackage.tch tchVar = (defpackage.tch) obj3;
                if (tchVar.a) {
                    tchVar.a = false;
                } else {
                    ((defpackage.eqp) obj3).m(obj);
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return this.a.invoke(obj, obj, obj);
            case 15:
                java.lang.Object obj4 = this.a;
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                return java.lang.Boolean.valueOf(!defpackage.afga.f(obj, obj4));
            case 16:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.afdo afdoVar3 = defpackage.tcu.a;
                bool.getClass();
                ((defpackage.tck) this.a).b(bool.booleanValue());
                return defpackage.afbk.a;
            case 17:
                defpackage.afdo afdoVar4 = defpackage.tcu.a;
                ((defpackage.eqp) this.a).m(obj);
                return defpackage.afbk.a;
            case 18:
                defpackage.gkc gkcVar2 = (defpackage.gkc) obj;
                if (gkcVar2 == null) {
                    return defpackage.tcu.d;
                }
                return defpackage.duu.b(defpackage.tcu.a, 0L, new defpackage.tcq(gkcVar2, (j$.time.Duration) this.a, null));
            case 19:
                defpackage.tdb tdbVar = new defpackage.tdb(obj);
                defpackage.tcj tcjVar = (defpackage.tcj) this.a;
                tcjVar.a = tdbVar;
                tcjVar.h = new defpackage.tdb(obj);
                tcjVar.a();
                return defpackage.afbk.a;
            default:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                java.lang.Object obj5 = this.a;
                ((defpackage.eqp) obj5).m(((defpackage.tcl) obj5).a.invoke(list));
                return defpackage.afbk.a;
        }
    }
}
