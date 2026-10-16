package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kqk implements defpackage.eqt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012e  */
    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        defpackage.eqp eqpVarF;
        boolean z = false;
        z = false;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((kql) this.a).b((j$.util.Optional) obj);
                break;
            case 1:
                j$.util.Optional optional = (j$.util.Optional) obj;
                jgh jghVar = new jgh(this.a, 9);
                if (true == optional.isPresent()) {
                    java.lang.Object obj2 = optional.get();
                    java.lang.Object obj3 = jghVar.a;
                    ((defpackage.kqj) obj3).a.a(new kpw(new kqh(obj3, (defpackage.ygw) obj2, 0)));
                    break;
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.eqp) this.a).m((java.util.Map) obj);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj4 = this.a;
                defpackage.kxa kxaVar = (defpackage.kxa) obj4;
                defpackage.eqp eqpVar = kxaVar.j;
                if (eqpVar != null) {
                    ((defpackage.eqr) obj4).s(eqpVar);
                }
                if (zBooleanValue) {
                    eqpVarF = kxaVar.a();
                } else {
                    defpackage.kwu.b().d.e();
                    eqpVarF = defpackage.ebo.f(kxaVar.b(), new defpackage.kwz(defpackage.qdp.a, z ? 1 : 0));
                }
                kxaVar.j = eqpVarF;
                ((defpackage.eqr) obj4).r(kxaVar.j, new defpackage.kqk(obj4, 2));
                if (!zBooleanValue) {
                    defpackage.eqp eqpVar2 = (defpackage.eqp) obj4;
                    java.util.Map map = (java.util.Map) eqpVar2.e();
                    if (map != null) {
                        defpackage.yha yhaVar = new defpackage.yha(4);
                        for (defpackage.qed qedVar : map.keySet()) {
                            if (qedVar.a()) {
                                yhaVar.f(qedVar, map.get(qedVar));
                            }
                        }
                        eqpVar2.m(yhaVar.d(true));
                        break;
                    }
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((kxx) this.a).a((defpackage.ygy) obj);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.bluetooth.BluetoothProfile bluetoothProfile = (android.bluetooth.BluetoothProfile) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                if (bluetoothProfile instanceof android.bluetooth.BluetoothHeadset) {
                    ((kxx) this.a).d = (android.bluetooth.BluetoothHeadset) bluetoothProfile;
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((kxx) this.a).e = (defpackage.yhx) obj;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.kzb) this.a).x = ((java.lang.Boolean) obj).booleanValue();
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (bool != null) {
                    defpackage.kzc kzcVar = (defpackage.kzc) this.a;
                    if (!kzcVar.b && bool.booleanValue()) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.kzc.a.f()).ai((char) 3644)).u("Navigation became active. Dismissing Assistant.");
                        defpackage.kpu.c().j(defpackage.yxp.CANCELLED_USER_MAP_INTERACTION);
                    }
                    kzcVar.b = bool.booleanValue();
                }
                break;
            case 9:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                if (bool2 != null && bool2.booleanValue()) {
                    z = true;
                }
                ((defpackage.kzh) this.a).b = z;
                break;
            case 10:
                ((kzr) this.a).a.setBackgroundColor(((defpackage.ksh) obj).a.b().d.a(7));
                break;
            case 11:
                otf otfVar = (otf) obj;
                defpackage.yqm yqmVar = laf.a;
                defpackage.eqp eqpVar3 = (defpackage.eqp) this.a;
                otf otfVar2 = (otf) eqpVar3.e();
                if (otfVar2 != null) {
                    if ((otfVar.b & 1) != 0) {
                        int iAx = defpackage.a.ax(otfVar2.c);
                        if (iAx == 0) {
                            iAx = 1;
                        }
                        int iAx2 = defpackage.a.ax(otfVar.c);
                        if (iAx == (iAx2 != 0 ? iAx2 : 1)) {
                            if (otfVar2.e.size() == otfVar.e.size()) {
                            }
                        }
                    } else if (otfVar2.e.size() == otfVar.e.size()) {
                    }
                }
                eqpVar3.m(otfVar);
                break;
            case 12:
                ((defpackage.lmt) this.a).c = (android.content.ComponentName) obj;
                break;
            case 13:
                ((defpackage.lmt) this.a).d = ((java.lang.Boolean) obj).booleanValue();
                break;
            case 14:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.lmt lmtVar = ((defpackage.lms) this.a).a;
                lmtVar.b = zBooleanValue2;
                android.content.Intent intent = (android.content.Intent) lmtVar.f.get(lmtVar.a);
                if (!lmtVar.g && intent != null) {
                    java.util.Iterator it = lmtVar.e.iterator();
                    while (it.hasNext()) {
                        ((ljy) it.next()).b(intent, lmtVar.b, lmtVar.a);
                    }
                    lmtVar.g = true;
                    break;
                }
                break;
            case 15:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                defpackage.lnb lnbVar = (defpackage.lnb) this.a;
                lnbVar.g = aaPlaybackState;
                if (lnbVar.j) {
                    java.util.Iterator it2 = lnbVar.c.iterator();
                    while (it2.hasNext()) {
                        ((lkb) it2.next()).h(aaPlaybackState);
                    }
                }
                break;
            case 16:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                defpackage.lnb lnbVar2 = (defpackage.lnb) this.a;
                lnbVar2.f = lmkVar;
                if (lnbVar2.j) {
                    java.util.Iterator it3 = lnbVar2.c.iterator();
                    while (it3.hasNext()) {
                        ((lkb) it3.next()).g(lmkVar);
                    }
                }
                break;
            case 17:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                defpackage.lnb lnbVar3 = (defpackage.lnb) this.a;
                lnbVar3.h = zBooleanValue3;
                if (lnbVar3.j) {
                    java.util.Iterator it4 = lnbVar3.c.iterator();
                    while (it4.hasNext()) {
                        ((lkb) it4.next()).i(bool3.booleanValue());
                    }
                }
                break;
            case 18:
                ((defpackage.yqj) defpackage.lni.a.l().ai(4030)).y("onMediaAppChanged called current=%s", (android.content.ComponentName) obj);
                defpackage.lni lniVar = (defpackage.lni) this.a;
                lniVar.g.removeCallbacksAndMessages(null);
                lniVar.i = null;
                break;
            case 19:
                defpackage.dzp dzpVar = (defpackage.dzp) obj;
                ((defpackage.lni) this.a).l((com.google.android.apps.auto.components.media.compat.AaPlaybackState) dzpVar.a, (java.lang.String) dzpVar.b);
                break;
            default:
                ((defpackage.lni) this.a).g((defpackage.lmk) obj);
                break;
        }
    }
}
