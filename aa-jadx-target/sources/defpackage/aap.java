package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aap implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aap(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        char c;
        long j;
        int i = 0;
        long j2 = 4294967295L;
        char c2 = ' ';
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return obj == this.a ? "(this)" : java.lang.String.valueOf(obj);
            case 1:
                return obj == this.a ? "(this)" : java.lang.String.valueOf(obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return obj == this.a ? "(this)" : java.lang.String.valueOf(obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Boolean.valueOf(defpackage.afga.f(obj, this.a));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                defpackage.abm abmVar = (defpackage.abm) this.a;
                defpackage.cux[] cuxVarArr = abmVar.b;
                cuxVarArr.getClass();
                int i2 = abmVar.d;
                int i3 = abmVar.f;
                while (i < cuxVarArr.length) {
                    defpackage.cux cuxVar = cuxVarArr[i];
                    if (cuxVar != null) {
                        c = c2;
                        long jA = abmVar.a.b.a((((long) cuxVar.b) & 4294967295L) | (((long) cuxVar.a) << c), (((long) i2) << c) | (((long) i3) & 4294967295L), defpackage.dlz.a);
                        cuwVar.r(cuxVar, defpackage.dlw.a(jA), defpackage.dlw.b(jA), 0.0f);
                    } else {
                        c = c2;
                    }
                    i++;
                    c2 = c;
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cuw cuwVar2 = (defpackage.cuw) obj;
                defpackage.abm abmVar2 = (defpackage.abm) this.a;
                defpackage.cux[] cuxVarArr2 = abmVar2.c;
                cuxVarArr2.getClass();
                int i4 = abmVar2.e;
                int i5 = abmVar2.g;
                while (i < cuxVarArr2.length) {
                    defpackage.cux cuxVar2 = cuxVarArr2[i];
                    if (cuxVar2 != null) {
                        j = j2;
                        long jA2 = abmVar2.a.b.a((((long) cuxVar2.a) << 32) | (((long) cuxVar2.b) & j), (((long) i4) << 32) | (((long) i5) & j), defpackage.dlz.a);
                        cuwVar2.r(cuxVar2, (int) (jA2 >> 32), (int) (jA2 & j), 0.0f);
                    } else {
                        j = j2;
                    }
                    i++;
                    j2 = j;
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.abt abtVar = (defpackage.abt) this.a;
                defpackage.cux cuxVar3 = abtVar.d;
                cuxVar3.getClass();
                ((defpackage.cuw) obj).s(cuxVar3, abtVar.c.b.a((((long) cuxVar3.a) << 32) | (4294967295L & ((long) cuxVar3.b)), abtVar.f, defpackage.dlz.a), 0.0f);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.abt abtVar2 = (defpackage.abt) this.a;
                defpackage.cux cuxVar4 = abtVar2.e;
                cuxVar4.getClass();
                ((defpackage.cuw) obj).s(cuxVar4, abtVar2.c.b.a((((long) cuxVar4.a) << 32) | (4294967295L & ((long) cuxVar4.b)), abtVar2.g, defpackage.dlz.a), 0.0f);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.a.c(this.a, (defpackage.cuw) obj);
            case 9:
                ((defpackage.cuw) obj).r((defpackage.cux) this.a, 0, 0, 0.0f);
                return defpackage.afbk.a;
            case 10:
                return java.lang.Boolean.valueOf(!defpackage.afga.f(obj, this.a));
            case 11:
                ((defpackage.cla) obj).o(((java.lang.Number) this.a.a()).floatValue());
                return defpackage.afbk.a;
            case 12:
                long j3 = ((defpackage.dly) obj).a & 4294967295L;
                defpackage.aga agaVar = defpackage.acs.a;
                return new defpackage.dlw(((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) j3))).intValue()) & 4294967295L);
            case 13:
                long j4 = ((defpackage.dly) obj).a >> 32;
                defpackage.aga agaVar2 = defpackage.acs.a;
                return new defpackage.dlw(((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) j4))).intValue()) << 32);
            case 14:
                long j5 = ((defpackage.dly) obj).a >> 32;
                defpackage.aga agaVar3 = defpackage.acs.a;
                return new defpackage.dlw(((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) j5))).intValue()) << 32);
            case 15:
                long j6 = ((defpackage.dly) obj).a & 4294967295L;
                defpackage.aga agaVar4 = defpackage.acs.a;
                return new defpackage.dlw(((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) j6))).intValue()) & 4294967295L);
            case 16:
                long j7 = ((defpackage.dly) obj).a;
                defpackage.aga agaVar5 = defpackage.acs.a;
                return new defpackage.dly((((long) ((int) (j7 & 4294967295L))) & 4294967295L) | (((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) (j7 >> 32)))).intValue()) << 32));
            case 17:
                long j8 = ((defpackage.dly) obj).a;
                defpackage.aga agaVar6 = defpackage.acs.a;
                return new defpackage.dly((((long) ((int) (j8 & 4294967295L))) & 4294967295L) | (((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) (j8 >> 32)))).intValue()) << 32));
            case 18:
                long j9 = ((defpackage.dly) obj).a;
                long j10 = j9 >> 32;
                defpackage.aga agaVar7 = defpackage.acs.a;
                return new defpackage.dly((((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) (j9 & 4294967295L)))).intValue()) & 4294967295L) | (((long) ((int) j10)) << 32));
            case 19:
                long j11 = ((defpackage.dly) obj).a;
                long j12 = j11 >> 32;
                defpackage.aga agaVar8 = defpackage.acs.a;
                return new defpackage.dly((((long) ((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((int) (j11 & 4294967295L)))).intValue()) & 4294967295L) | (((long) ((int) j12)) << 32));
            default:
                defpackage.agj agjVar = (defpackage.agj) obj;
                defpackage.acj acjVar = defpackage.acj.a;
                defpackage.acj acjVar2 = defpackage.acj.b;
                boolean zH = agjVar.h(acjVar, acjVar2);
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = null;
                if (zH) {
                    defpackage.acd acdVar = ((defpackage.acv) obj2).e.b.c;
                    if (acdVar != null) {
                        obj3 = acdVar.c;
                    }
                } else if (agjVar.h(acjVar2, defpackage.acj.c)) {
                    defpackage.acd acdVar2 = ((defpackage.acv) obj2).f.b.c;
                    if (acdVar2 != null) {
                        obj3 = acdVar2.c;
                    }
                } else {
                    obj3 = defpackage.acs.e;
                }
                return obj3 == null ? defpackage.acs.e : obj3;
        }
    }
}
