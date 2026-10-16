package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class acq implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ acq(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((java.lang.Integer) obj).intValue();
                defpackage.aga agaVar = defpackage.acs.a;
                return 0;
            case 1:
                defpackage.aga agaVar2 = defpackage.acs.a;
                return new defpackage.dly(0L);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.acs.d;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.ael(((java.lang.Float) obj).floatValue());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.ael(((java.lang.Integer) obj).intValue());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Integer.valueOf((int) ((defpackage.ael) obj).a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.ael(((defpackage.dlr) obj).a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.dlr(((defpackage.ael) obj).a);
            case 9:
                long j = ((defpackage.dls) obj).a;
                return new defpackage.aem(java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f, java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f);
            case 10:
                defpackage.aem aemVar = (defpackage.aem) obj;
                return new defpackage.dls((((long) java.lang.Float.floatToRawIntBits(aemVar.b)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(aemVar.a)) << 32));
            case 11:
                long j2 = ((defpackage.cjl) obj).a;
                return new defpackage.aem(java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 12:
                defpackage.aem aemVar2 = (defpackage.aem) obj;
                return new defpackage.cjl((((long) java.lang.Float.floatToRawIntBits(aemVar2.b)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(aemVar2.a)) << 32));
            case 13:
                long j3 = ((defpackage.cji) obj).a;
                return new defpackage.aem(java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)));
            case 14:
                defpackage.aem aemVar3 = (defpackage.aem) obj;
                return new defpackage.cji((((long) java.lang.Float.floatToRawIntBits(aemVar3.b)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(aemVar3.a)) << 32));
            case 15:
                long j4 = ((defpackage.dlw) obj).a;
                return new defpackage.aem((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 16:
                defpackage.aem aemVar4 = (defpackage.aem) obj;
                return new defpackage.dlw((((long) java.lang.Math.round(aemVar4.b)) & 4294967295L) | (((long) java.lang.Math.round(aemVar4.a)) << 32));
            case 17:
                long j5 = ((defpackage.dly) obj).a;
                return new defpackage.aem((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 18:
                defpackage.aem aemVar5 = (defpackage.aem) obj;
                int iRound = java.lang.Math.round(aemVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = java.lang.Math.round(aemVar5.b);
                return new defpackage.dly((((long) iRound) << 32) | ((long) (iRound2 >= 0 ? iRound2 : 0)));
            case 19:
                defpackage.cjj cjjVar = (defpackage.cjj) obj;
                return new defpackage.aeo(cjjVar.b, cjjVar.c, cjjVar.d, cjjVar.e);
            default:
                defpackage.aeo aeoVar = (defpackage.aeo) obj;
                return new defpackage.cjj(aeoVar.a, aeoVar.b, aeoVar.c, aeoVar.d);
        }
    }
}
