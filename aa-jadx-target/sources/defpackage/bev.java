package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bev implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ bev(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int iOffsetByCodePoints;
        defpackage.dft dftVar;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.bjw bjwVar = (defpackage.bjw) obj;
                int iA = bjwVar.a();
                if (iA == -1) {
                    return null;
                }
                long j = bjwVar.b;
                long j2 = defpackage.dgc.a;
                return new defpackage.dje(0, iA - ((int) (j & 4294967295L)));
            case 1:
                defpackage.bjw bjwVar2 = (defpackage.bjw) obj;
                java.lang.String str = bjwVar2.c.b;
                long j3 = bjwVar2.b;
                long j4 = defpackage.dgc.a;
                int i = (int) (j3 & 4294967295L);
                if (i <= 0) {
                    iOffsetByCodePoints = -1;
                } else {
                    defpackage.emx emxVar = defpackage.emx.b;
                    iOffsetByCodePoints = java.lang.Character.offsetByCodePoints(str, i, -1);
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new defpackage.dje(((int) (bjwVar2.b & 4294967295L)) - iOffsetByCodePoints, 0);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bjw bjwVar3 = (defpackage.bjw) obj;
                java.lang.Integer numE = bjwVar3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j5 = bjwVar3.b;
                long j6 = defpackage.dgc.a;
                return new defpackage.dje(((int) (j5 & 4294967295L)) - iIntValue, 0);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bjw bjwVar4 = (defpackage.bjw) obj;
                java.lang.Integer numD = bjwVar4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j7 = bjwVar4.b;
                long j8 = defpackage.dgc.a;
                return new defpackage.dje(0, iIntValue2 - ((int) (j7 & 4294967295L)));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bjw bjwVar5 = (defpackage.bjw) obj;
                java.lang.Integer numC = bjwVar5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j9 = bjwVar5.b;
                long j10 = defpackage.dgc.a;
                return new defpackage.dje(((int) (j9 & 4294967295L)) - iIntValue3, 0);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bjw bjwVar6 = (defpackage.bjw) obj;
                java.lang.Integer numB = bjwVar6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j11 = bjwVar6.b;
                long j12 = defpackage.dgc.a;
                return new defpackage.dje(0, iIntValue4 - ((int) (j11 & 4294967295L)));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(1);
                obj2.getClass();
                defpackage.apn apnVar = ((java.lang.Boolean) obj2).booleanValue() ? defpackage.apn.a : defpackage.apn.b;
                java.lang.Object obj3 = list.get(0);
                obj3.getClass();
                return new defpackage.bff(apnVar, ((java.lang.Float) obj3).floatValue());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.dej dejVar = defpackage.def.C;
                defpackage.afbk afbkVar = defpackage.afbk.a;
                ((defpackage.dek) obj).a(dejVar, afbkVar);
                return afbkVar;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.dfa dfaVar = (defpackage.dfa) obj;
                java.lang.Object obj4 = dfaVar.a;
                if (obj4 instanceof defpackage.dfg) {
                    obj4.getClass();
                    defpackage.dfg dfgVar = (defpackage.dfg) obj4;
                    if (!defpackage.asq.O(dfgVar.a())) {
                        defpackage.dfa[] dfaVarArr = new defpackage.dfa[2];
                        dfaVarArr[0] = dfaVar;
                        obj4.getClass();
                        defpackage.dgb dgbVarA = dfgVar.a();
                        if (dgbVarA == null || (dftVar = dgbVarA.a) == null) {
                            dftVar = new defpackage.dft(0L, 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65535);
                        }
                        dfaVarArr[1] = new defpackage.dfa(dftVar, dfaVar.b, dfaVar.c, "");
                        return new java.util.ArrayList(new defpackage.afby(dfaVarArr, true));
                    }
                }
                return new java.util.ArrayList(new defpackage.afby(new defpackage.dfa[]{dfaVar}, true));
            case 9:
                android.content.Context context = (android.content.Context) obj;
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(defpackage.bft.a(), 0);
                java.util.ArrayList arrayList = new java.util.ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i2 = 0; i2 < size; i2++) {
                    android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
                    android.content.pm.ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        android.content.pm.ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && (activityInfo.permission == null || context.checkSelfPermission(activityInfo.permission) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 10:
                ((java.lang.Long) obj).longValue();
                return defpackage.afbk.a;
            case 11:
                return defpackage.afbk.a;
            case 12:
                return defpackage.afbk.a;
            case 13:
                long j13 = ((defpackage.cji) obj).a;
                long j14 = 9223372034707292159L & j13;
                defpackage.aem aemVar = defpackage.blg.a;
                return j14 != 9205357640488583168L ? new defpackage.aem(java.lang.Float.intBitsToFloat((int) (j13 >> 32)), java.lang.Float.intBitsToFloat((int) (j13 & 4294967295L))) : defpackage.blg.a;
            case 14:
                defpackage.aem aemVar2 = (defpackage.aem) obj;
                defpackage.aem aemVar3 = defpackage.blg.a;
                return new defpackage.cji((((long) java.lang.Float.floatToRawIntBits(aemVar2.a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(aemVar2.b)) & 4294967295L));
            case 15:
                return defpackage.afbk.a;
            case 16:
                ((defpackage.dek) obj).a(defpackage.def.A, new defpackage.ddw(0));
                return defpackage.afbk.a;
            case 17:
                defpackage.bvm bvmVar = defpackage.bpk.a;
                return new defpackage.bpi(defpackage.cjv.c(), null);
            case 18:
                defpackage.bvm bvmVar2 = defpackage.brv.a;
                return defpackage.afbk.a;
            case 19:
                return defpackage.afbk.a;
            default:
                ((defpackage.czh) obj).getClass();
                throw null;
        }
    }
}
