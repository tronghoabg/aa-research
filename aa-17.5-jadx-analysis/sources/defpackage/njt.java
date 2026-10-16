package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final /* synthetic */ class njt implements afeh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ njt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [afek, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bux buxVar;
        int i = 3;
        switch (this.b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                Integer num = (Integer) obj3;
                int iIntValue2 = num.intValue();
                yph yphVar = njw.a;
                boolean zF = affa.f((Boolean) obj2, true);
                yop yopVarL = njw.a.l();
                Boolean boolValueOf = Boolean.valueOf(zF);
                boolean z = iIntValue != 0;
                yopVarL.R("etcSensorEnabled=%s, resizeEnabled=%s, statusBarRows=%s", boolValueOf, Boolean.valueOf(z), num);
                Object obj4 = this.a;
                if (!zF || !z || iIntValue2 >= 2) {
                    if (!zF || !z) {
                        if (z && iIntValue2 < 2) {
                            break;
                        } else if (!z) {
                            if (zF && iIntValue2 < 2) {
                                break;
                            } else if (!zF) {
                                if (iIntValue2 >= 2) {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 1:
                nmj nmjVar = (nmj) obj;
                mqc mqcVar = (mqc) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if ((nmjVar != null ? nmjVar.b : null) != null) {
                    if (!zBooleanValue) {
                        if (!affa.f(nmjVar.b, mqcVar != null ? mqcVar.a() : null)) {
                        }
                    }
                    break;
                }
                break;
            case 2:
                bux buxVar2 = (bux) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ats) obj).getClass();
                if (buxVar2.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    cfv cfvVar = cfy.e;
                    ksy ksyVar = nly.a;
                    cfy cfyVarD = awd.d(cfvVar, 37.0f);
                    ctp ctpVarB = atk.b(cfl.h, false);
                    int iG = a.g(buxVar2.b());
                    ccx ccxVarN = buxVar2.N();
                    cfy cfyVarJ = bzi.j(buxVar2, cfyVarD);
                    afdr afdrVar = cwb.a;
                    buxVar2.M();
                    buxVar2.w();
                    if (buxVar2.G()) {
                        buxVar2.j(afdrVar);
                    } else {
                        buxVar2.y();
                    }
                    Object obj5 = this.a;
                    byq.c(buxVar2, ctpVarB, cwb.e);
                    byq.c(buxVar2, ccxVarN, cwb.d);
                    byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar2, cwb.g);
                    byq.c(buxVar2, cfyVarJ, cwb.c);
                    long j = ((cjv) buxVar2.f(bnm.a)).a;
                    long j2 = nlx.a;
                    brp.b((String) obj5, null, j, nlx.a, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar2, 0, 0, 262122);
                    buxVar2.n();
                } else {
                    buxVar2.s();
                }
                break;
            case 3:
                ats atsVar = (ats) obj;
                bux buxVar3 = (bux) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                atsVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true != buxVar3.C(atsVar) ? 2 : 4;
                }
                if (buxVar3.I((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    brp.b(((Context) this.a).getText(R.string.toolbar_education_title).toString(), ats.a(cfy.e, cfl.k), kfn.i(buxVar3).R(), 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar3).e, buxVar3, 0, 0, 131064);
                } else {
                    buxVar3.s();
                }
                break;
            case 4:
                bux buxVar4 = (bux) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ats) obj).getClass();
                if (buxVar4.I((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    brp.b(((Context) this.a).getText(true != acpf.m() ? R.string.toolbar_education_text : R.string.toolbar_education_app_controlled_text).toString(), null, kfn.i(buxVar4).S(), 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar4).l, buxVar4, 0, 0, 131066);
                } else {
                    buxVar4.s();
                }
                break;
            case 5:
                bux buxVar5 = (bux) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((abu) obj).getClass();
                if (buxVar5.I((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    atk.c(afp.E(awd.c(this.a, 1.0f), nqq.a, bcr.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, vq.g(buxVar5), vq.g(buxVar5))), buxVar5, 0);
                } else {
                    buxVar5.s();
                }
                break;
            case 6:
                cfy cfyVar = (cfy) obj;
                bux buxVar6 = (bux) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                cfyVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= true != buxVar6.C(cfyVar) ? 2 : 4;
                }
                if (buxVar6.I((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    ca.bb(lnm.E((CarIcon) this.a, buxVar6), null, cfyVar, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar6, ((iIntValue7 << 6) & 896) | 56, 120);
                } else {
                    buxVar6.s();
                }
                break;
            case 7:
                int i2 = 4;
                cfy cfyVar2 = (cfy) obj;
                bux buxVar7 = (bux) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                cfyVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    if (true != buxVar7.C(cfyVar2)) {
                        i2 = 2;
                    }
                    iIntValue8 |= i2;
                }
                if (buxVar7.I((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    GhIcon ghIcon = ((nwr) this.a).k;
                    ghIcon.getClass();
                    ca.bb(lgi.f(ghIcon, BitmapDescriptorFactory.HUE_RED, buxVar7, 3), null, cfyVar2, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar7, ((iIntValue8 << 6) & 896) | 56, 120);
                } else {
                    buxVar7.s();
                }
                break;
            case 8:
                mcd mcdVar = (mcd) obj;
                int i3 = 4;
                bux buxVar8 = (bux) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                mcdVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    if (true != ((iIntValue9 & 8) == 0 ? buxVar8.C(mcdVar) : buxVar8.E(mcdVar))) {
                        i3 = 2;
                    }
                    iIntValue9 |= i3;
                }
                if (buxVar8.I((iIntValue9 & 19) != 18, iIntValue9 & 1)) {
                    mcdVar.c((String) this.a, null, null, 0L, buxVar8, (iIntValue9 << 12) & 57344, 14);
                } else {
                    buxVar8.s();
                }
                break;
            case 9:
                afeg afegVar = (afeg) obj;
                bux buxVar9 = (bux) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                afegVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= true != buxVar9.E(afegVar) ? 2 : 4;
                }
                if (buxVar9.I((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    if (this.a.length() == 0) {
                        buxVar9.v(1573429788);
                        brp.b(vq.e(R.string.search, buxVar9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVar9).j, czz.at(buxVar9).s, 0L, null, null, dao.k(dao.j(R.font.google_sans_display)), null, 0L, null, 0, 0, 0L, null, null, 16777182), buxVar9, 0, 0, 131070);
                        buxVar = buxVar9;
                        buxVar.o();
                    } else {
                        buxVar = buxVar9;
                        buxVar.v(1573770943);
                        buxVar.o();
                    }
                    afegVar.invoke(buxVar, Integer.valueOf(iIntValue10 & 14));
                } else {
                    buxVar9.s();
                }
                break;
            case 10:
                ato atoVar = (ato) obj;
                bux buxVar10 = (bux) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                atoVar.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= true == buxVar10.C(atoVar) ? 4 : 2;
                }
                if (buxVar10.I((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    float fD = atoVar.d() * 3.0f;
                    cfy cfyVarO = awd.o(cfy.e, cfl.a, true);
                    float f = fD + BitmapDescriptorFactory.HUE_RED;
                    cfy cfyVarI = awd.i(cfyVarO, f);
                    Object objG = buxVar10.g();
                    Object obj6 = buw.a;
                    if (objG == obj6) {
                        objG = new oin(11);
                        buxVar10.x(objG);
                    }
                    Object obj7 = this.a;
                    cfy cfyVarF = cjn.f(cfyVarI, (afec) objG);
                    boolean zE = buxVar10.E(obj7) | buxVar10.z(f);
                    Object objG2 = buxVar10.g();
                    if (zE || objG2 == obj6) {
                        objG2 = new msy(obj7, f, i);
                        buxVar10.x(objG2);
                    }
                    afec afecVar = (afec) objG2;
                    boolean zE2 = buxVar10.E(obj7) | buxVar10.z(f);
                    Object objG3 = buxVar10.g();
                    if (zE2 || objG3 == obj6) {
                        objG3 = new msy(obj7, f, i);
                        buxVar10.x(objG3);
                    }
                    dmj.b(afecVar, cfyVarF, (afec) objG3, buxVar10, 0, 0);
                } else {
                    buxVar10.s();
                }
                break;
            case 11:
                ato atoVar2 = (ato) obj;
                bux buxVar11 = (bux) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                atoVar2.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true == buxVar11.C(atoVar2) ? 4 : 2;
                }
                if (buxVar11.I((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    Object obj8 = this.a;
                    AppWidgetProviderInfo appWidgetProviderInfo = ((oph) obj8).b;
                    float fD2 = atoVar2.d();
                    float fA = ((dlg) buxVar11.f(dbc.d)).a();
                    float f2 = fD2 / 4.0f;
                    aezu aezuVar = new aezu(new dlj(((Math.min(4, Math.max(appWidgetProviderInfo.targetCellWidth, Math.max((int) Math.ceil((appWidgetProviderInfo.minWidth / fA) / f2), 1))) / 4.0f) * fD2) + BitmapDescriptorFactory.HUE_RED), new dlj((fD2 * (Math.min(4, Math.max(appWidgetProviderInfo.targetCellHeight, Math.max((int) Math.ceil((appWidgetProviderInfo.minHeight / fA) / f2), 1))) / 4.0f)) + BitmapDescriptorFactory.HUE_RED));
                    final float f3 = ((dlj) aezuVar.a).a;
                    final float f4 = ((dlj) aezuVar.b).a;
                    cfy cfyVarK = awd.k(cfy.e, f3, f4);
                    boolean zE3 = buxVar11.E(obj8) | buxVar11.z(f3) | buxVar11.z(f4);
                    Object objG4 = buxVar11.g();
                    if (zE3 || objG4 == buw.a) {
                        final mva mvaVar = (mva) obj8;
                        final int i4 = true ? 1 : 0;
                        objG4 = new afec() { // from class: opx
                            @Override // defpackage.afec
                            public final Object invoke(Object obj9) {
                                if (i4 == 0) {
                                    oog oogVar = (oog) obj9;
                                    oogVar.getClass();
                                    mva mvaVar2 = mvaVar;
                                    oogVar.a(f3, f4);
                                    oogVar.updateAppWidget(((oph) mvaVar2).a);
                                    return afak.a;
                                }
                                Context context = (Context) obj9;
                                context.getClass();
                                oog oogVar2 = new oog(context);
                                mva mvaVar3 = mvaVar;
                                oogVar2.a(f3, f4);
                                oogVar2.updateAppWidget(((oph) mvaVar3).a);
                                return oogVar2;
                            }
                        };
                        buxVar11.x(objG4);
                    }
                    afec afecVar2 = (afec) objG4;
                    boolean zE4 = buxVar11.E(obj8) | buxVar11.z(f3) | buxVar11.z(f4);
                    Object objG5 = buxVar11.g();
                    if (zE4 || objG5 == buw.a) {
                        final mva mvaVar2 = (mva) obj8;
                        final int i5 = false ? 1 : 0;
                        objG5 = new afec() { // from class: opx
                            @Override // defpackage.afec
                            public final Object invoke(Object obj9) {
                                if (i5 == 0) {
                                    oog oogVar = (oog) obj9;
                                    oogVar.getClass();
                                    mva mvaVar22 = mvaVar2;
                                    oogVar.a(f3, f4);
                                    oogVar.updateAppWidget(((oph) mvaVar22).a);
                                    return afak.a;
                                }
                                Context context = (Context) obj9;
                                context.getClass();
                                oog oogVar2 = new oog(context);
                                mva mvaVar3 = mvaVar2;
                                oogVar2.a(f3, f4);
                                oogVar2.updateAppWidget(((oph) mvaVar3).a);
                                return oogVar2;
                            }
                        };
                        buxVar11.x(objG5);
                    }
                    dmj.b(afecVar2, cfyVarK, (afec) objG5, buxVar11, 0, 0);
                } else {
                    buxVar11.s();
                }
                break;
            case 12:
                dzi dziVar = (dzi) obj;
                dzi dziVar2 = (dzi) obj2;
                dzi dziVar3 = (dzi) obj3;
                afco afcoVar = tby.a;
                dziVar.getClass();
                dziVar2.getClass();
                dziVar3.getClass();
                break;
            case 13:
                this.a.invoke((Throwable) obj);
                break;
            default:
                boolean z2 = aitz.a;
                ajdz ajdzVar = (ajdz) this.a;
                ajdzVar.a.c(null);
                ajdzVar.d();
                break;
        }
        return afak.a;
    }
}
