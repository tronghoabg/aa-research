package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kzu implements defpackage.dzn {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kzu(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dzn
    public final void a(java.lang.Object obj) {
        int i = 2;
        int i2 = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.kzi.d((defpackage.saf) this.a, (osy) obj);
                break;
            case 1:
                super/*android.widget.EditText*/.setTypeface((android.graphics.Typeface) obj);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.saf) this.a).g("'%s'", (java.lang.String) obj);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ote oteVar = (ote) obj;
                ((defpackage.saf) this.a).i(java.lang.String.format(java.util.Locale.US, "DestinationDistance {time_to_arrival_seconds=%d, ETA=%s}", java.lang.Long.valueOf(oteVar.c), oteVar.d));
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.saf safVar = (defpackage.saf) this.a;
                safVar.f("LabeledAction", new defpackage.kza(safVar, obj, 9));
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.saf safVar2 = (defpackage.saf) this.a;
                safVar2.f("AssistantSuggestion", new defpackage.kza(safVar2, obj, 7));
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.kzi.h((defpackage.saf) this.a, (ota) obj);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                defpackage.yqm yqmVar = lad.a;
                ((defpackage.saf) this.a).g("%s -> %d", entry.getKey(), entry.getValue());
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.oun ounVar = (defpackage.oun) obj;
                defpackage.yqm yqmVar2 = defpackage.lak.a;
                defpackage.ygw ygwVarY = defpackage.ygw.y(defpackage.yfh.a(defpackage.ysr.am(ounVar.b, new defpackage.ikt(14)), defpackage.ysr.am(ounVar.c, new defpackage.ikt(15))));
                java.lang.Object obj2 = this.a;
                defpackage.saf safVar3 = (defpackage.saf) obj2;
                safVar3.i("AudioDiagnostics ");
                safVar3.k(ygwVarY, new defpackage.kzu(obj2, 13));
                break;
            case 9:
                ((defpackage.lxy) obj).k((android.service.notification.StatusBarNotification) this.a);
                break;
            case 10:
                ((defpackage.lxy) obj).b((android.service.notification.StatusBarNotification) this.a);
                break;
            case 11:
                ((defpackage.lxy) obj).k((android.service.notification.StatusBarNotification) this.a);
                break;
            case 12:
                ((defpackage.lxy) obj).b((android.service.notification.StatusBarNotification) this.a);
                break;
            case 13:
                ((rfm) obj).a.a((defpackage.saf) this.a);
                break;
            case 14:
                defpackage.abor aborVar = (defpackage.abor) obj;
                tsy tsyVar = (tsy) this.a;
                tpg tpgVar = tsyVar.a;
                if (tpgVar != null) {
                    tpm tpmVarK = tpm.k(tpgVar);
                    if (tpmVarK != null) {
                        abbk abbkVarW = defpackage.tan.w(tpmVarK);
                        aborVar.t();
                        abbj abbjVar = aborVar.b;
                        abbj abbjVar2 = abbj.a;
                        abbkVarW.getClass();
                        abbjVar.c = abbkVarW;
                        abbjVar.b |= 1;
                    }
                }
                java.lang.Float f = tsyVar.d;
                if (f != null) {
                    i2 = 3;
                } else {
                    f = null;
                }
                java.lang.Float f2 = tsyVar.c;
                if (f2 != null) {
                    f = f2;
                } else {
                    i = i2;
                }
                if (f != null) {
                    double dFloatValue = f.floatValue();
                    aborVar.t();
                    abbj abbjVar3 = aborVar.b;
                    abbj abbjVar4 = abbj.a;
                    abbjVar3.b |= 4;
                    abbjVar3.e = (int) (dFloatValue * 10.0d);
                    aborVar.t();
                    abbj abbjVar5 = aborVar.b;
                    abbjVar5.f = i - 1;
                    abbjVar5.b |= 8;
                }
                break;
            default:
                defpackage.abor aborVar2 = (defpackage.abor) obj;
                tsy tsyVar2 = (tsy) this.a;
                java.lang.Float f3 = tsyVar2.b;
                if (f3 != null) {
                    float fFloatValue = f3.floatValue();
                    aborVar2.t();
                    abjm abjmVar = aborVar2.b;
                    abjm abjmVar2 = abjm.a;
                    abjmVar.b = 1 | abjmVar.b;
                    abjmVar.c = fFloatValue;
                }
                java.lang.Integer num = tsyVar2.e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    aborVar2.t();
                    abjm abjmVar3 = aborVar2.b;
                    abjm abjmVar4 = abjm.a;
                    abjmVar3.b = 2 | abjmVar3.b;
                    abjmVar3.d = iIntValue;
                }
                java.lang.Integer num2 = tsyVar2.f;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    aborVar2.t();
                    abjm abjmVar5 = aborVar2.b;
                    abjm abjmVar6 = abjm.a;
                    abjmVar5.b |= 4;
                    abjmVar5.e = iIntValue2;
                }
                break;
        }
    }
}
