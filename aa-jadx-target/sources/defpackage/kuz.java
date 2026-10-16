package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kuz implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kuz(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v43, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v50, types: [afer, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws defpackage.qsu, defpackage.qst {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.jzb.l((android.content.Context) this.a, "Tonal button with icon clicked");
                return defpackage.afbk.a;
            case 1:
                defpackage.jzb.l((android.content.Context) this.a, "Tonal icon button clicked");
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.jzb.l((android.content.Context) this.a, "Tonal button clicked");
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.jzb.j((android.content.Context) this.a, "Simple Inline Notification with Badged Icon");
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.jzb.j((android.content.Context) this.a, "Simple Inline Work Profile Notification");
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.jzb.j((android.content.Context) this.a, "Simple Inline Notification with Message Count");
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.jzb.j((android.content.Context) this.a, "Simple Inline Notification with Message Count over 9");
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.jzb.j((android.content.Context) this.a, "Single Action Notification");
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.jzb.j((android.content.Context) this.a, "Two Action Notification");
                return defpackage.afbk.a;
            case 9:
                defpackage.jzb.j((android.content.Context) this.a, "Message Notification");
                return defpackage.afbk.a;
            case 10:
                defpackage.jzb.j((android.content.Context) this.a, "Incoming Call Notification");
                return defpackage.afbk.a;
            case 11:
                defpackage.jzb.j((android.content.Context) this.a, "Simple Inline Notification");
                return defpackage.afbk.a;
            case 12:
                defpackage.jzb.j((android.content.Context) this.a, "Simple Inline Notification no Subtitle");
                return defpackage.afbk.a;
            case 13:
                defpackage.jzb.i((android.content.Context) this.a, "Two Action Notification");
                return defpackage.afbk.a;
            case 14:
                ?? r5 = this.a;
                kvc kvcVar = kvc.a;
                defpackage.lke lkeVar = (defpackage.lke) r5.a();
                if (lkeVar == null) {
                    return new com.google.android.apps.auto.components.graphics.icon.GhIcon(8);
                }
                for (java.lang.Number number : defpackage.afga.ac(java.lang.Integer.valueOf(lkeVar.f), java.lang.Integer.valueOf(lkeVar.e), java.lang.Integer.valueOf(lkeVar.d))) {
                    if (number.intValue() != 0) {
                        return com.google.android.apps.auto.components.graphics.icon.GhIcon.r(lkeVar.b, number.intValue());
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            case 15:
                this.a.invoke();
                return defpackage.afbk.a;
            case 16:
                defpackage.led ledVar = defpackage.lee.a;
                defpackage.mkp.a.g();
                return defpackage.oml.o((defpackage.qsh) this.a, com.google.android.gms.car.display.CarDisplayId.a).d();
            case 17:
                return new defpackage.cjl(defpackage.lgo.a((android.graphics.drawable.Drawable) this.a));
            case 18:
                return new defpackage.cjl(defpackage.lgo.a((android.graphics.drawable.Drawable) this.a));
            case 19:
                return new defpackage.cjl(defpackage.lgo.a((android.graphics.drawable.Drawable) this.a));
            default:
                defpackage.mkp.a.g();
                rkn rknVarX = defpackage.oml.x(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a);
                ((defpackage.rps) rknVarX.b).g(new defpackage.rdp(rknVarX, ((lhb) this.a).b(), 11));
                return defpackage.afbk.a;
        }
    }
}
