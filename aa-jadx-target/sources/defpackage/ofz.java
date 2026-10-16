package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ofz implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CallActDisambigMgr");
    public ofy b;
    public ajnd c;
    private final android.content.Context d;
    private final defpackage.omf e = new defpackage.ofx(this);

    public ofz(android.content.Context context) {
        this.d = context;
    }

    public static defpackage.ofz a() {
        return (defpackage.ofz) defpackage.mkp.a.i(defpackage.ofz.class);
    }

    private final void e() {
        if (this.b == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5846)).u("Canceling disambiguation when disambiguation is not active.");
            return;
        }
        this.b = null;
        ajnd ajndVar = this.c;
        if (ajndVar != null) {
            ((defpackage.yqj) jup.a.l().ai((char) 2772)).u("Call account disambiguation info removed.");
            jup jupVar = (jup) ajndVar.a;
            if (jupVar.e != null) {
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_FACET, defpackage.zbd.aB).l());
            }
            jupVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0189  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b0  */
    public final void b() {
        com.google.android.apps.auto.components.telecom.call.CarCall carCall;
        defpackage.ygw ygwVar;
        int i;
        defpackage.oei oeiVarA = defpackage.oeh.a();
        android.content.Context context = this.d;
        if (oeiVarA.H(context)) {
            ofy ofyVar = this.b;
            ofy ofyVar2 = null;
            if (ofyVar != null) {
                com.google.android.apps.auto.components.telecom.call.CarCall carCall2 = (com.google.android.apps.auto.components.telecom.call.CarCall) j$.util.Collection.-EL.stream(defpackage.omf.w().k()).filter(new defpackage.mpw(ofyVar, 14)).findFirst().orElse((java.lang.Object) null);
                if (carCall2 == null || (i = carCall2.e) == 10 || i == 7) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5852)).u("Finishing disambiguation (call dropped)");
                    defpackage.oim oimVarU = defpackage.omf.u();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_SIM_SELECTION, defpackage.zbd.ay);
                    rrvVarH.u(ofyVar.a());
                    oimVarU.F(rrvVarH.l());
                    e();
                } else if (i != 8) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5854)).u("Finishing disambiguation (disambiguation no longer needed)");
                    defpackage.oim oimVarU2 = defpackage.omf.u();
                    defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_SIM_SELECTION, ofyVar.c ? defpackage.zbd.ax : defpackage.zbd.az);
                    rrvVarH2.u(ofyVar.a());
                    oimVarU2.F(rrvVarH2.l());
                    e();
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5853)).u("Continuing disambiguation (same call still needs disambiguation)");
                }
            }
            if (this.b != null || (carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) j$.util.Collection.-EL.stream(defpackage.omf.w().k()).filter(new mrx(16)).findFirst().orElse((java.lang.Object) null)) == null) {
                return;
            }
            android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                java.util.ArrayList parcelableArrayList = carCall.f.k.getParcelableArrayList("android.telecom.extra.SUGGESTED_PHONE_ACCOUNTS");
                defpackage.ygw ygwVarO = parcelableArrayList == null ? null : defpackage.ygw.o(parcelableArrayList);
                if (ygwVarO == null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5848)).u("Can't find suggestions for phone call");
                } else {
                    ygwVar = (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVarO).map(new defpackage.mjc(telecomManager, 12)).filter(new mrx(17)).collect(defpackage.yds.a);
                }
                if (ofyVar2 == null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5851)).u("Not launching disambiguation (couldn't create disambiguation info)");
                    return;
                }
                defpackage.oim oimVarU3 = defpackage.omf.u();
                defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
                defpackage.zbe zbeVar = defpackage.zbe.PHONE_SIM_SELECTION;
                oimVarU3.F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.aw).l());
                if (this.b != null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5850)).u("Launching disambiguation while another call is already being disambiguated.");
                    e();
                }
                this.b = ofyVar2;
                ((defpackage.yqj) a.l().ai((char) 5849)).u("Launching telecom to disambiguate outgoing call account");
                android.content.Intent intent = new android.content.Intent("com.google.android.gearhead.telecom.SELECT_PHONE_ACCOUNT");
                intent.setComponent(defpackage.mkt.b);
                defpackage.omf.u().F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.aI).l());
                defpackage.mpk.a().i(intent);
            }
            java.util.ArrayList parcelableArrayList2 = carCall.f.k.getParcelableArrayList("selectPhoneAccountAccounts");
            if (parcelableArrayList2 != null) {
                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(parcelableArrayList2).map(new defpackage.mjc(telecomManager, 13)).filter(new mrx(18));
                int i2 = defpackage.ygw.d;
                ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
            } else {
                int i3 = defpackage.ygw.d;
                ygwVar = defpackage.ymx.a;
            }
            if (ygwVar.isEmpty()) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5847)).u("Could not find phone accounts for given handles.");
            } else {
                defpackage.ojm.a();
                ofyVar2 = new ofy(carCall, ygwVar, android.os.SystemClock.elapsedRealtime());
            }
            if (ofyVar2 == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5851)).u("Not launching disambiguation (couldn't create disambiguation info)");
                return;
            }
            defpackage.oim oimVarU4 = defpackage.omf.u();
            defpackage.yzd yzdVar2 = defpackage.yzd.GEARHEAD;
            defpackage.zbe zbeVar2 = defpackage.zbe.PHONE_SIM_SELECTION;
            oimVarU4.F(defpackage.rrw.h(yzdVar2, zbeVar2, defpackage.zbd.aw).l());
            if (this.b != null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5850)).u("Launching disambiguation while another call is already being disambiguated.");
                e();
            }
            this.b = ofyVar2;
            ((defpackage.yqj) a.l().ai((char) 5849)).u("Launching telecom to disambiguate outgoing call account");
            android.content.Intent intent2 = new android.content.Intent("com.google.android.gearhead.telecom.SELECT_PHONE_ACCOUNT");
            intent2.setComponent(defpackage.mkt.b);
            defpackage.omf.u().F(defpackage.rrw.h(yzdVar2, zbeVar2, defpackage.zbd.aI).l());
            defpackage.mpk.a().i(intent2);
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.omf.w().E(this.e);
        if (this.b != null) {
            e();
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.omf.w().D(this.e);
    }
}
