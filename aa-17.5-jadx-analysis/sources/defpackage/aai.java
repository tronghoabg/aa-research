package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class aai implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aai(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        char c;
        long j;
        int i = 0;
        long j2 = 4294967295L;
        char c2 = ' ';
        switch (this.b) {
            case 0:
                return obj == this.a ? "(this)" : String.valueOf(obj);
            case 1:
                return obj == this.a ? "(this)" : String.valueOf(obj);
            case 2:
                return obj == this.a ? "(this)" : String.valueOf(obj);
            case 3:
                return Boolean.valueOf(affa.f(obj, this.a));
            case 4:
                cun cunVar = (cun) obj;
                abf abfVar = (abf) this.a;
                cuo[] cuoVarArr = abfVar.b;
                cuoVarArr.getClass();
                int i2 = abfVar.d;
                int i3 = abfVar.f;
                while (i < cuoVarArr.length) {
                    cuo cuoVar = cuoVarArr[i];
                    if (cuoVar != null) {
                        c = c2;
                        long jA = abfVar.a.b.a((cuoVar.b & 4294967295L) | (cuoVar.a << c), (i2 << c) | (i3 & 4294967295L), dlr.a);
                        cunVar.r(cuoVar, dlo.a(jA), dlo.b(jA), BitmapDescriptorFactory.HUE_RED);
                    } else {
                        c = c2;
                    }
                    i++;
                    c2 = c;
                }
                return afak.a;
            case 5:
                cun cunVar2 = (cun) obj;
                abf abfVar2 = (abf) this.a;
                cuo[] cuoVarArr2 = abfVar2.c;
                cuoVarArr2.getClass();
                int i4 = abfVar2.e;
                int i5 = abfVar2.g;
                while (i < cuoVarArr2.length) {
                    cuo cuoVar2 = cuoVarArr2[i];
                    if (cuoVar2 != null) {
                        j = j2;
                        long jA2 = abfVar2.a.b.a((cuoVar2.a << 32) | (cuoVar2.b & j), (i4 << 32) | (i5 & j), dlr.a);
                        cunVar2.r(cuoVar2, (int) (jA2 >> 32), (int) (jA2 & j), BitmapDescriptorFactory.HUE_RED);
                    } else {
                        j = j2;
                    }
                    i++;
                    j2 = j;
                }
                return afak.a;
            case 6:
                abm abmVar = (abm) this.a;
                cuo cuoVar3 = abmVar.d;
                cuoVar3.getClass();
                ((cun) obj).s(cuoVar3, abmVar.c.b.a((cuoVar3.a << 32) | (4294967295L & cuoVar3.b), abmVar.f, dlr.a), BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 7:
                abm abmVar2 = (abm) this.a;
                cuo cuoVar4 = abmVar2.e;
                cuoVar4.getClass();
                ((cun) obj).s(cuoVar4, abmVar2.c.b.a((cuoVar4.a << 32) | (4294967295L & cuoVar4.b), abmVar2.g, dlr.a), BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 8:
                return a.c(this.a, (cun) obj);
            case 9:
                ((cun) obj).r((cuo) this.a, 0, 0, BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 10:
                return Boolean.valueOf(!affa.f(obj, this.a));
            case 11:
                ((cks) obj).o(((Number) this.a.a()).floatValue());
                return afak.a;
            case 12:
                long j3 = ((dlq) obj).a & 4294967295L;
                aft aftVar = acl.a;
                return new dlo(((Number) this.a.invoke(Integer.valueOf((int) j3))).intValue() & 4294967295L);
            case 13:
                long j4 = ((dlq) obj).a >> 32;
                aft aftVar2 = acl.a;
                return new dlo(((Number) this.a.invoke(Integer.valueOf((int) j4))).intValue() << 32);
            case 14:
                long j5 = ((dlq) obj).a >> 32;
                aft aftVar3 = acl.a;
                return new dlo(((Number) this.a.invoke(Integer.valueOf((int) j5))).intValue() << 32);
            case 15:
                long j6 = ((dlq) obj).a & 4294967295L;
                aft aftVar4 = acl.a;
                return new dlo(((Number) this.a.invoke(Integer.valueOf((int) j6))).intValue() & 4294967295L);
            case 16:
                long j7 = ((dlq) obj).a;
                aft aftVar5 = acl.a;
                return new dlq((((int) (j7 & 4294967295L)) & 4294967295L) | (((Number) this.a.invoke(Integer.valueOf((int) (j7 >> 32)))).intValue() << 32));
            case 17:
                long j8 = ((dlq) obj).a;
                aft aftVar6 = acl.a;
                return new dlq((((int) (j8 & 4294967295L)) & 4294967295L) | (((Number) this.a.invoke(Integer.valueOf((int) (j8 >> 32)))).intValue() << 32));
            case 18:
                long j9 = ((dlq) obj).a >> 32;
                aft aftVar7 = acl.a;
                return new dlq((((Number) this.a.invoke(Integer.valueOf((int) (r1 & 4294967295L)))).intValue() & 4294967295L) | (((int) j9) << 32));
            case 19:
                long j10 = ((dlq) obj).a >> 32;
                aft aftVar8 = acl.a;
                return new dlq((((Number) this.a.invoke(Integer.valueOf((int) (r1 & 4294967295L)))).intValue() & 4294967295L) | (((int) j10) << 32));
            default:
                agc agcVar = (agc) obj;
                acc accVar = acc.a;
                acc accVar2 = acc.b;
                boolean zH = agcVar.h(accVar, accVar2);
                Object obj2 = this.a;
                Object obj3 = null;
                if (zH) {
                    abw abwVar = ((aco) obj2).e.b.c;
                    if (abwVar != null) {
                        obj3 = abwVar.c;
                    }
                } else if (agcVar.h(accVar2, acc.c)) {
                    abw abwVar2 = ((aco) obj2).f.b.c;
                    if (abwVar2 != null) {
                        obj3 = abwVar2.c;
                    }
                } else {
                    obj3 = acl.e;
                }
                return obj3 == null ? acl.e : obj3;
        }
    }
}
