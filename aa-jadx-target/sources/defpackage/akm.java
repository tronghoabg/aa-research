package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class akm implements defpackage.affh {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akm(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [affn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [akl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [avv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [affj, java.lang.Object] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i;
        int i2 = 2;
        boolean z = true;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.bve bveVar = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                defpackage.bvm bvmVar = defpackage.akn.a;
                bveVar.v(-353972293);
                boolean zC = bveVar.C(this.a.b(bveVar));
                java.lang.Object objG = bveVar.g();
                if (zC || objG == defpackage.bvd.a) {
                    objG = new defpackage.ako();
                    bveVar.x(objG);
                }
                defpackage.ako akoVar = (defpackage.ako) objG;
                bveVar.o();
                return akoVar;
            case 1:
                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                bveVar2.v(955869654);
                bveVar2.o();
                return this.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.a.invoke(new defpackage.cji(((defpackage.crd) obj2).c));
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bve bveVar3 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                bveVar3.v(-102778667);
                java.lang.Object objG2 = bveVar3.g();
                java.lang.Object obj4 = defpackage.bvd.a;
                if (objG2 == obj4) {
                    java.lang.Object bxzVar = new defpackage.bxz(bveVar3.h(), defpackage.afdp.a);
                    bveVar3.x(bxzVar);
                    objG2 = bxzVar;
                }
                aiuw aiuwVar = (aiuw) objG2;
                java.lang.Object objG3 = bveVar3.g();
                if (objG3 == obj4) {
                    java.lang.Object parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                    bveVar3.x(parcelableSnapshotMutableState);
                    objG3 = parcelableSnapshotMutableState;
                }
                defpackage.bwx bwxVar = (defpackage.bwx) objG3;
                defpackage.bys bysVarC = defpackage.bzd.c(this.a, bveVar3);
                boolean zC2 = bveVar3.C(null);
                java.lang.Object objG4 = bveVar3.g();
                if (zC2 || objG4 == obj4) {
                    objG4 = new defpackage.bbs(bwxVar, 17);
                    bveVar3.x(objG4);
                }
                defpackage.bvx.c(null, (defpackage.affc) objG4, bveVar3);
                boolean zE = bveVar3.E(aiuwVar) | bveVar3.C(null) | bveVar3.C(bysVarC);
                java.lang.Object objG5 = bveVar3.g();
                if (zE || objG5 == obj4) {
                    objG5 = new defpackage.bfc(aiuwVar, bwxVar, bysVarC);
                    bveVar3.x(objG5);
                }
                defpackage.cqu cquVar = defpackage.crq.a;
                defpackage.crp crpVar = new defpackage.crp(null, null, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objG5);
                bveVar3.o();
                return crpVar;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                java.lang.Object obj5 = this.a;
                if (!zBooleanValue) {
                    iIntValue = ((defpackage.bih) obj5).e.b(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = ((defpackage.bih) obj5).e.b(iIntValue2);
                }
                defpackage.bih bihVar = (defpackage.bih) obj5;
                if (!bihVar.d || (iIntValue == defpackage.dgc.e(bihVar.b.b) && iIntValue2 == defpackage.dgc.a(bihVar.b.b))) {
                    z = false;
                } else if (java.lang.Math.min(iIntValue, iIntValue2) < 0 || java.lang.Math.max(iIntValue, iIntValue2) > bihVar.b.a.a()) {
                    bihVar.f.k();
                    z = false;
                } else {
                    if (zBooleanValue || iIntValue == iIntValue2) {
                        bihVar.f.k();
                    } else {
                        bihVar.f.j(true);
                    }
                    bihVar.c.m.invoke(new defpackage.dkd(bihVar.b.a, defpackage.dax.g(iIntValue, iIntValue2), (defpackage.dgc) null));
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cgf cgfVar = (defpackage.cgf) obj;
                defpackage.bve bveVar4 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                bveVar4.v(1980580247);
                defpackage.dlo dloVar = (defpackage.dlo) bveVar4.f(defpackage.dbl.d);
                java.lang.Object objG6 = bveVar4.g();
                java.lang.Object obj6 = defpackage.bvd.a;
                if (objG6 == obj6) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dly(0L), defpackage.bxv.c);
                    bveVar4.x(parcelableSnapshotMutableState2);
                    objG6 = parcelableSnapshotMutableState2;
                }
                java.lang.Object obj7 = this.a;
                defpackage.bwx bwxVar2 = (defpackage.bwx) objG6;
                boolean zE2 = bveVar4.E(obj7);
                java.lang.Object objG7 = bveVar4.g();
                if (zE2 || objG7 == obj6) {
                    objG7 = new defpackage.ajz(obj7, bwxVar2, 19, objArr == true ? 1 : 0);
                    bveVar4.x(objG7);
                }
                defpackage.afer aferVar = (defpackage.afer) objG7;
                boolean zC3 = bveVar4.C(dloVar);
                java.lang.Object objG8 = bveVar4.g();
                if (zC3 || objG8 == obj6) {
                    objG8 = new defpackage.beh(dloVar, bwxVar2, 7);
                    bveVar4.x(objG8);
                }
                defpackage.aem aemVar = defpackage.blg.a;
                defpackage.cgf cgfVarA = cgfVar.a(new defpackage.cgb(new defpackage.aly(aferVar, (defpackage.affc) objG8, i2, objArr2 == true ? 1 : 0)));
                bveVar4.o();
                return cgfVarA;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cub cubVar = (defpackage.cub) obj;
                defpackage.ctx ctxVar = (defpackage.ctx) obj2;
                cubVar.getClass();
                ctxVar.getClass();
                ?? r10 = this.a;
                final float F = defpackage.asq.F(r10, cubVar.p());
                float fE = defpackage.asq.E(r10, cubVar.p()) + F;
                long j = ((defpackage.dlm) obj3).a;
                int iDN = cubVar.dN(fE + 0.0f);
                defpackage.avx avxVar = (defpackage.avx) r10;
                final float f = avxVar.a;
                int iDN2 = cubVar.dN(avxVar.b + f + 0.0f);
                final defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.h(j, iDN, iDN2));
                return cubVar.dS(cuxVarV.a - iDN, cuxVarV.b - iDN2, defpackage.afcf.a, new defpackage.affc() { // from class: gjb
                    @Override // defpackage.affc
                    public final java.lang.Object invoke(java.lang.Object obj8) {
                        defpackage.cuw cuwVar = (defpackage.cuw) obj8;
                        cuwVar.getClass();
                        cuwVar.x(cuxVarV, -defpackage.dln.q(cuwVar, F), -defpackage.dln.q(cuwVar, f));
                        return defpackage.afbk.a;
                    }
                });
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                long jLongValue = ((java.lang.Long) obj).longValue();
                boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((java.lang.Boolean) obj3).booleanValue();
                defpackage.lgy lgyVar = new defpackage.lgy(this.a, 16);
                if (defpackage.actz.r() && (jLongValue & 519) == 0) {
                    return null;
                }
                if (!zBooleanValue3) {
                    i = defpackage.lee.a.a().b() ? 2131231754 : 2131231750;
                } else if (zBooleanValue2) {
                    i = defpackage.lee.a.a().b() ? 2131231741 : 2131231738;
                } else {
                    i = defpackage.lee.a.a().b() ? 2131231811 : 2131231809;
                }
                java.lang.String packageName = defpackage.mkp.a.c.getPackageName();
                packageName.getClass();
                packageName.getClass();
                return new defpackage.ltm(com.google.android.apps.auto.components.graphics.icon.GhIcon.r(packageName, i), true, lgyVar);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                java.lang.Integer num = (java.lang.Integer) obj3;
                java.lang.Object obj8 = this.a;
                if (num == null || num.intValue() != 2) {
                    if (zBooleanValue4) {
                        defpackage.yqm yqmVar = defpackage.kit.a;
                        if (((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).r()) {
                            try {
                                com.google.android.gms.car.display.CarDisplay carDisplayD = ((defpackage.nkp) obj8).k().d();
                                if ((carDisplayD != null ? carDisplayD.i : null) == null || iIntValue3 != 102) {
                                    z = false;
                                }
                            } catch (defpackage.qst e) {
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.nkp.a.h()).p(e)).u("Failed to get blended UI config: car not connected");
                            }
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    break;
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                defpackage.dzp dzpVar = (defpackage.dzp) obj;
                defpackage.dzp dzpVar2 = (defpackage.dzp) obj2;
                defpackage.afdo afdoVar = defpackage.tcu.a;
                dzpVar.getClass();
                dzpVar2.getClass();
                defpackage.dzp dzpVar3 = (defpackage.dzp) dzpVar.a;
                defpackage.dzp dzpVar4 = (defpackage.dzp) dzpVar.b;
                defpackage.dzp dzpVar5 = (defpackage.dzp) dzpVar2.a;
                defpackage.dzp dzpVar6 = (defpackage.dzp) dzpVar2.b;
                return this.a.invoke(dzpVar3.a, dzpVar3.b, dzpVar4.a, dzpVar4.b, dzpVar5.a, dzpVar5.b, dzpVar6.a, dzpVar6.b, obj3);
            case 10:
                defpackage.dzp dzpVar7 = (defpackage.dzp) obj;
                defpackage.dzp dzpVar8 = (defpackage.dzp) obj2;
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                dzpVar7.getClass();
                dzpVar8.getClass();
                return this.a.invoke(dzpVar7.a, dzpVar7.b, dzpVar8.a, dzpVar8.b, obj3);
            default:
                ((ajfc) this.a).h();
                return defpackage.afbk.a;
        }
    }
}
