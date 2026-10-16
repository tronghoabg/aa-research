package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class abj implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ abj(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.ca.W();
            case 1:
                return null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case 11:
                return obj;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.ca.W();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                return num;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                num2.intValue();
                return num2;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return bool;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 9:
                java.lang.Boolean bool4 = (java.lang.Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 10:
                return new defpackage.bil(defpackage.aza.b, new defpackage.adv((defpackage.clp) obj, 1), (byte[]) null);
            case 12:
                defpackage.aga agaVar = defpackage.acs.a;
                return new defpackage.dly(0L);
            case 13:
                defpackage.aga agaVar2 = defpackage.acs.a;
                return new defpackage.dlw(0L);
            case 14:
                defpackage.dly dlyVar = (defpackage.dly) obj;
                defpackage.aga agaVar3 = defpackage.acs.a;
                return dlyVar;
            case 15:
                long j = ((defpackage.cli) obj).a;
                long j2 = j >> 32;
                defpackage.aga agaVar4 = defpackage.acs.a;
                return new defpackage.aem(java.lang.Float.intBitsToFloat((int) j2), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
            case 16:
                defpackage.aem aemVar = (defpackage.aem) obj;
                defpackage.aga agaVar5 = defpackage.acs.a;
                return new defpackage.cli(defpackage.tna.aK(aemVar.a, aemVar.b));
            case 17:
                ((java.lang.Integer) obj).intValue();
                defpackage.aga agaVar6 = defpackage.acs.a;
                return 0;
            case 18:
                ((java.lang.Integer) obj).intValue();
                defpackage.aga agaVar7 = defpackage.acs.a;
                return 0;
            case 19:
                defpackage.aga agaVar8 = defpackage.acs.a;
                return new defpackage.aga(1.0f, 1500.0f, null);
            default:
                ((java.lang.Integer) obj).intValue();
                defpackage.aga agaVar9 = defpackage.acs.a;
                return 0;
        }
    }
}
