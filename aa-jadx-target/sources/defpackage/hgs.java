package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class hgs implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hgs(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [ifd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v75, types: [java.lang.Object, uv] */
    /* JADX WARN: Type inference failed for: r13v77, types: [affc, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        gwm gwmVar;
        int i = 4;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                hgr hgrVar = (hgr) this.b;
                ((hgi) this.a).c.invoke(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (hgrVar.c >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (hgrVar.c & 4294967295L))), java.lang.Float.valueOf(hgrVar.b));
                return defpackage.afbk.a;
            case 1:
                hgr hgrVar2 = (hgr) this.b;
                ((hgi) this.a).a.invoke(java.lang.Float.valueOf(-java.lang.Float.intBitsToFloat((int) (hgrVar2.d >> 32))), java.lang.Float.valueOf(-java.lang.Float.intBitsToFloat((int) (hgrVar2.d & 4294967295L))));
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                hgr hgrVar3 = (hgr) this.b;
                ((hgi) this.a).d.invoke(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (hgrVar3.c >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (hgrVar3.c & 4294967295L))));
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                hgr hgrVar4 = (hgr) this.b;
                ((hgi) this.a).c.invoke(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (hgrVar4.c >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (hgrVar4.c & 4294967295L))), java.lang.Float.valueOf(2.0f));
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                hgr hgrVar5 = (hgr) this.b;
                ((hgi) this.a).b.invoke(java.lang.Float.valueOf(defpackage.dmd.a(hgrVar5.e)), java.lang.Float.valueOf(defpackage.dmd.b(hgrVar5.e)));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                hhc hhcVar = (hhc) this.b;
                if (hhcVar.c && (gwmVar = ((hhb) this.a).c) != null) {
                    gwmVar.g();
                }
                hhcVar.d.invoke();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.media.AudioManager audioManager = (android.media.AudioManager) ((defpackage.afgv) this.a).a;
                android.media.AudioFocusRequest audioFocusRequestM = ep$.ExternalSyntheticApiModelOutline1.m(((defpackage.afgv) this.b).a);
                defpackage.ypx ypxVar = defpackage.yqn.a;
                if (ep$.ExternalSyntheticApiModelOutline1.m$1(audioManager, audioFocusRequestM) == 0) {
                    ((defpackage.ype) hnd.a.h().o(ypxVar, "CarApp.H.Tem").ai(105)).u("Couldn't obtain audio focus for WebView template");
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.media.AudioManager audioManager2 = (android.media.AudioManager) ((defpackage.afgv) this.a).a;
                android.media.AudioFocusRequest audioFocusRequestM2 = ep$.ExternalSyntheticApiModelOutline1.m(((defpackage.afgv) this.b).a);
                defpackage.ypx ypxVar2 = defpackage.yqn.a;
                ep$.ExternalSyntheticApiModelOutline1.m(audioManager2, audioFocusRequestM2);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((htb) this.a).i((ifd) this.b);
                return defpackage.afbk.a;
            case 9:
                defpackage.yqm yqmVar = ipj.a;
                android.content.Context context = (android.content.Context) this.a;
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.CAPTURE_SECURE_VIDEO_OUTPUT");
                ipj.a.l().y("Using %s display", iCheckSelfPermission == 0 ? "secure" : "normal");
                return new defpackage.ipo(1, 1, 160, (iCheckSelfPermission != 0 ? 0 : 4) | 1, defpackage.fzv.n(context).f(defpackage.ebm.n()), false, ((java.lang.String) this.b).concat(":BlackHole"), true, null);
            case 10:
                ((defpackage.ipo) this.a).k(((defpackage.ipr) this.b).a);
                return defpackage.afbk.a;
            case 11:
                gce gceVar = (gce) this.b;
                int i2 = gceVar.e;
                defpackage.byj byjVar = (defpackage.byj) this.a;
                if (byjVar.e() > i2) {
                    byjVar.h(byjVar.e() - 1);
                    byjVar.e();
                }
                defpackage.affc affcVar = gceVar.c;
                if (affcVar != null) {
                    affcVar.invoke(java.lang.Integer.valueOf(byjVar.e()));
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.byj byjVar2 = (defpackage.byj) this.a;
                byjVar2.h(byjVar2.e() + 1);
                byjVar2.e();
                defpackage.affc affcVar2 = ((gce) this.b).c;
                if (affcVar2 != null) {
                    affcVar2.invoke(java.lang.Integer.valueOf(byjVar2.e()));
                }
                return defpackage.afbk.a;
            case 13:
                java.lang.Object obj = this.a;
                if (obj != null) {
                    ((defpackage.cit) obj).a(7);
                }
                ((gdk) this.b).d.invoke();
                return defpackage.afbk.a;
            case 14:
                ajba ajbaVar = ((juy) this.b).c;
                if (((java.lang.CharSequence) ajbaVar.b()).length() != 0) {
                    java.lang.Object obj2 = this.a;
                    java.lang.String str = (java.lang.String) ajbaVar.b();
                    str.getClass();
                    ajbaVar.d(afzh.z(str, defpackage.afqt.e(str.length() - 1, 0)));
                    ((gdl) obj2).g.invoke(ajbaVar.b());
                }
                return defpackage.afbk.a;
            case 15:
                ((juy) this.b).c.d("");
                ((gdl) this.a).g.invoke("");
                return defpackage.afbk.a;
            case 16:
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = (com.google.android.apps.auto.components.graphics.icon.GhIcon) this.b;
                return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.n((android.content.res.Resources) this.a, ghIcon.s(), ghIcon.a())));
            case 17:
                ((gfa) this.b).t().h((uv) this.a);
                return defpackage.afbk.a;
            case 18:
                this.b.invoke(this.a);
                return defpackage.afbk.a;
            case 19:
                defpackage.rjf rjfVar = ((defpackage.kjx) this.a).d;
                com.google.android.gms.car.control.CarPropertyState carPropertyState = rjfVar != null ? (com.google.android.gms.car.control.CarPropertyState) rjfVar.a.b(new defpackage.rdt(rjfVar, juq.c(((kkf) this.b).a), i)) : null;
                if (carPropertyState instanceof com.google.android.gms.car.control.CarPropertyState) {
                    return carPropertyState;
                }
                return null;
            default:
                defpackage.rjf rjfVar2 = ((defpackage.kjx) this.a).d;
                if (rjfVar2 == null) {
                    return null;
                }
                rjfVar2.c.F(new defpackage.rdn(this.b, 8));
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ hgs(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
