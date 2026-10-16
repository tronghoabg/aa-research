package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ba implements defpackage.dzn {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ba(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dzn
    public final void a(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.bc) this.a).e.ag();
                break;
            case 1:
                ((defpackage.bc) this.a).e.ag();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.content.res.Configuration configuration = (android.content.res.Configuration) obj;
                defpackage.bt btVar = (defpackage.bt) this.a;
                if (btVar.ad()) {
                    btVar.t(configuration, false);
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                defpackage.bt btVar2 = (defpackage.bt) this.a;
                if (btVar2.ad() && num.intValue() == 80) {
                    btVar2.w(false);
                    break;
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                dus dusVar = (dus) obj;
                defpackage.bt btVar3 = (defpackage.bt) this.a;
                if (btVar3.ad()) {
                    btVar3.x(dusVar.a, false);
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                dus dusVar2 = (dus) obj;
                defpackage.bt btVar4 = (defpackage.bt) this.a;
                if (btVar4.ad()) {
                    btVar4.C(dusVar2.a, false);
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                super/*android.widget.Button*/.setTypeface((android.graphics.Typeface) obj);
                break;
            default:
                super/*android.widget.TextView*/.setTypeface((android.graphics.Typeface) obj);
                break;
        }
    }
}
