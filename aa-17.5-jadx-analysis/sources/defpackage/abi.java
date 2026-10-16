package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class abi implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abi(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v31, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v91, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v93, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v98, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v58, types: [asd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        long j;
        aew aewVar;
        aew aewVar2;
        aew aewVar3;
        aew aewVar4;
        float f = 1.0f;
        switch (this.c) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long j2 = iIntValue;
                abk abkVar = (abk) this.b;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf((-dlo.a(abkVar.d((j2 & 4294967295L) | (j2 << 32), abkVar.e()))) - iIntValue))).intValue());
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                abk abkVar2 = (abk) this.b;
                long j3 = iIntValue2;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf(((int) (abkVar2.e() >> 32)) - dlo.a(abkVar2.d((j3 & 4294967295L) | (j3 << 32), abkVar2.e()))))).intValue());
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                abk abkVar3 = (abk) this.b;
                long j4 = iIntValue3;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf(((int) (abkVar3.e() & 4294967295L)) - dlo.b(abkVar3.d((j4 & 4294967295L) | (j4 << 32), abkVar3.e()))))).intValue());
            case 3:
                int iIntValue4 = ((Integer) obj).intValue();
                long j5 = iIntValue4;
                abk abkVar4 = (abk) this.b;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf((-dlo.b(abkVar4.d((j5 & 4294967295L) | (j5 << 32), abkVar4.e()))) - iIntValue4))).intValue());
            case 4:
                int iIntValue5 = ((Integer) obj).intValue();
                abk abkVar5 = (abk) this.b;
                bym bymVar = (bym) abkVar5.f.a(abkVar5.a.g());
                j = bymVar != null ? ((dlq) bymVar.a()).a : 0L;
                long j6 = iIntValue5;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf((-dlo.a(abkVar5.d((j6 & 4294967295L) | (j6 << 32), j))) - iIntValue5))).intValue());
            case 5:
                int iIntValue6 = ((Integer) obj).intValue();
                abk abkVar6 = (abk) this.b;
                bym bymVar2 = (bym) abkVar6.f.a(abkVar6.a.g());
                j = bymVar2 != null ? ((dlq) bymVar2.a()).a : 0L;
                long j7 = iIntValue6;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf((-dlo.a(abkVar6.d((j7 & 4294967295L) | (j7 << 32), j))) + ((int) (j >> 32))))).intValue());
            case 6:
                int iIntValue7 = ((Integer) obj).intValue();
                abk abkVar7 = (abk) this.b;
                bym bymVar3 = (bym) abkVar7.f.a(abkVar7.a.g());
                j = bymVar3 != null ? ((dlq) bymVar3.a()).a : 0L;
                long j8 = iIntValue7;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf((-dlo.b(abkVar7.d((j8 & 4294967295L) | (j8 << 32), j))) - iIntValue7))).intValue());
            case 7:
                int iIntValue8 = ((Integer) obj).intValue();
                abk abkVar8 = (abk) this.b;
                bym bymVar4 = (bym) abkVar8.f.a(abkVar8.a.g());
                j = bymVar4 != null ? ((dlq) bymVar4.a()).a : 0L;
                long j9 = iIntValue8;
                return Integer.valueOf(((Number) this.a.invoke(Integer.valueOf((-dlo.b(abkVar8.d((j9 & 4294967295L) | (j9 << 32), j))) + ((int) (j & 4294967295L))))).intValue());
            case 8:
                agc agcVar = (agc) obj;
                aft aftVar = acl.a;
                acc accVar = acc.a;
                acc accVar2 = acc.b;
                if (agcVar.h(accVar, accVar2)) {
                    acr acrVar = ((acp) this.b).b.a;
                    return (acrVar == null || (aewVar2 = acrVar.b) == null) ? acl.a : aewVar2;
                }
                if (!agcVar.h(accVar2, acc.c)) {
                    return acl.a;
                }
                acr acrVar2 = ((acq) this.a).b.a;
                return (acrVar2 == null || (aewVar = acrVar2.b) == null) ? acl.a : aewVar;
            case 9:
                aft aftVar2 = acl.a;
                int iOrdinal = ((acc) obj).ordinal();
                if (iOrdinal == 0) {
                    acr acrVar3 = ((acp) this.b).b.a;
                    if (acrVar3 != null) {
                        f = acrVar3.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new aezs();
                    }
                    acr acrVar4 = ((acq) this.a).b.a;
                    if (acrVar4 != null) {
                        f = acrVar4.a;
                    }
                }
                return Float.valueOf(f);
            case 10:
                agc agcVar2 = (agc) obj;
                aft aftVar3 = acl.a;
                acc accVar3 = acc.a;
                acc accVar4 = acc.b;
                if (agcVar2.h(accVar3, accVar4)) {
                    acy acyVar = ((acp) this.b).b.d;
                    return (acyVar == null || (aewVar4 = acyVar.c) == null) ? acl.b : aewVar4;
                }
                if (!agcVar2.h(accVar4, acc.c)) {
                    return acl.b;
                }
                acy acyVar2 = ((acq) this.a).b.d;
                return (acyVar2 == null || (aewVar3 = acyVar2.c) == null) ? acl.b : aewVar3;
            case 11:
                aft aftVar4 = acl.a;
                int iOrdinal2 = ((acc) obj).ordinal();
                if (iOrdinal2 == 0) {
                    acy acyVar3 = ((acp) this.b).b.d;
                    if (acyVar3 != null) {
                        f = acyVar3.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new aezs();
                    }
                    acy acyVar4 = ((acq) this.a).b.d;
                    if (acyVar4 != null) {
                        f = acyVar4.a;
                    }
                }
                return Float.valueOf(f);
            case 12:
                ((cun) obj).r((cuo) this.a, 0, 0, ((adr) this.b).a);
                return afak.a;
            case 13:
                Object obj2 = this.a;
                afh afhVar = (afh) obj2;
                byw bywVar = afhVar.a;
                Object obj3 = this.b;
                bywVar.n(obj3);
                afhVar.b(true);
                return new agi(obj2, obj3, 1, null);
            case 14:
                aeb aebVar = (aeb) obj;
                this.a.invoke(aebVar.a(), ((bii) this.b).a.invoke(aebVar.c));
                return afak.a;
            case 15:
                ahnc.d(this.a, null, 4, new agf((agg) this.b, null), 1);
                return new bdp(1);
            case 16:
                Object obj4 = this.b;
                SnapshotStateList snapshotStateList = ((agg) obj4).f;
                Object obj5 = this.a;
                snapshotStateList.add(obj5);
                return new agi(obj4, obj5, 0);
            case 17:
                return new agi(this.a, this.b, 2, null);
            case 18:
                Object obj6 = this.b;
                Object obj7 = this.a;
                ((agg) obj7).x((age) obj6);
                return new agi(obj7, obj6, 3, null);
            case 19:
                this.b.c(this.a);
                return afak.a;
            default:
                cxd cxdVar = (cxd) obj;
                cxdVar.q();
                czz.aI(cxdVar, (cjm) this.b, (cjs) this.a, BitmapDescriptorFactory.HUE_RED, null, 60);
                return afak.a;
        }
    }

    public /* synthetic */ abi(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
