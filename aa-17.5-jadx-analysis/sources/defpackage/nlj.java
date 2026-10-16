package defpackage;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class nlj implements afeh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nlj(int i, bym bymVar, grh grhVar, int i2) {
        this.d = i2;
        this.b = i;
        this.a = bymVar;
        this.c = grhVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [bym, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        if (i == 0) {
            boolean z = false;
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((abu) obj).getClass();
            int i2 = iIntValue & 17;
            int i3 = iIntValue & 1;
            if (i2 != 16) {
                z = true;
            }
            if (buxVar.I(z, i3)) {
                Object obj4 = this.a;
                Object objG = buxVar.g();
                if (objG == buw.a) {
                    obj4.getClass();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(obj4, bxp.c);
                    buxVar.x(parcelableSnapshotMutableState);
                    objG = parcelableSnapshotMutableState;
                }
                bwq bwqVar = (bwq) objG;
                if (obj4 != null) {
                    bwqVar.b(obj4);
                }
                this.c.invoke(bwqVar.a(), buxVar, Integer.valueOf(this.b & 8));
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i != 1) {
            ato atoVar = (ato) obj;
            bux buxVar2 = (bux) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            yph yphVar = opg.a;
            atoVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true != buxVar2.C(atoVar) ? 2 : 4;
            }
            if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                Object obj5 = this.a;
                final AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) obj5;
                opg.a.l().X("%s x %s widget: %s %s, minWidth=%s, minHeight=%s, maxWidth=%s, maxHeight=%s, minResizeWidth=%s, minResizeHeight=%s, resizeMode=%s, widgetCategory=%s", new dlj(atoVar.d()), new dlj(atoVar.c()), obj5, appWidgetProviderInfo.provider, Integer.valueOf(appWidgetProviderInfo.minWidth), Integer.valueOf(appWidgetProviderInfo.minHeight), Integer.valueOf(appWidgetProviderInfo.maxResizeWidth), Integer.valueOf(appWidgetProviderInfo.maxResizeHeight), Integer.valueOf(appWidgetProviderInfo.minResizeWidth), Integer.valueOf(appWidgetProviderInfo.minResizeHeight), Integer.valueOf(appWidgetProviderInfo.resizeMode), Integer.valueOf(appWidgetProviderInfo.widgetCategory));
                final float fC = appWidgetProviderInfo.maxResizeWidth > 0 ? afpt.c(atoVar.d(), appWidgetProviderInfo.maxResizeWidth) + BitmapDescriptorFactory.HUE_RED : atoVar.d();
                final float fC2 = appWidgetProviderInfo.maxResizeHeight > 0 ? afpt.c(atoVar.c(), appWidgetProviderInfo.maxResizeHeight) + BitmapDescriptorFactory.HUE_RED : atoVar.c();
                final int i4 = this.b;
                Object obj6 = this.c;
                cfy cfyVarA = awd.d(awd.m(cfy.e, fC), fC2).a(new aix(cjn.i(0), ckq.a));
                boolean zE = buxVar2.E(obj6) | buxVar2.A(i4) | buxVar2.E(obj5) | buxVar2.z(fC) | buxVar2.z(fC2);
                Object objG2 = buxVar2.g();
                if (zE || objG2 == buw.a) {
                    final opr oprVar = (opr) obj6;
                    final float f = fC2;
                    final float f2 = fC;
                    objG2 = new afec() { // from class: ope
                        @Override // defpackage.afec
                        public final Object invoke(Object obj7) {
                            Context context = (Context) obj7;
                            yph yphVar2 = opg.a;
                            context.getClass();
                            AppWidgetHostView appWidgetHostViewCreateView = oprVar.f.createView(context, i4, appWidgetProviderInfo);
                            appWidgetHostViewCreateView.getClass();
                            oog oogVar = (oog) appWidgetHostViewCreateView;
                            oogVar.a(f2, f);
                            opl oplVar = new opl(context);
                            oplVar.a = oogVar;
                            oplVar.addView(oogVar, new FrameLayout.LayoutParams(-1, -1));
                            return oplVar;
                        }
                    };
                    buxVar2.x(objG2);
                }
                afec afecVar = (afec) objG2;
                boolean zE2 = buxVar2.E(obj5) | buxVar2.z(fC) | buxVar2.z(fC2);
                Object objG3 = buxVar2.g();
                if (zE2 || objG3 == buw.a) {
                    objG3 = new afec() { // from class: opf
                        @Override // defpackage.afec
                        public final Object invoke(Object obj7) {
                            opl oplVar = (opl) obj7;
                            yph yphVar2 = opg.a;
                            oplVar.getClass();
                            oog oogVar = oplVar.a;
                            if (oogVar != null) {
                                oogVar.a(fC, fC2);
                            }
                            return afak.a;
                        }
                    };
                    buxVar2.x(objG3);
                }
                dmj.b(afecVar, cfyVarA, (afec) objG3, buxVar2, 0, 0);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        ato atoVar2 = (ato) obj;
        bux buxVar3 = (bux) obj2;
        int iIntValue3 = ((Integer) obj3).intValue();
        atoVar2.getClass();
        if ((iIntValue3 & 6) == 0) {
            iIntValue3 |= true != buxVar3.C(atoVar2) ? 2 : 4;
        }
        if (buxVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
            float fD = atoVar2.d();
            cfv cfvVar = cfy.e;
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar3, 0);
            int iG = a.g(buxVar3.b());
            ccx ccxVarN = buxVar3.N();
            cfy cfyVarJ = bzi.j(buxVar3, cfvVar);
            afdr afdrVar = cwb.a;
            buxVar3.M();
            buxVar3.w();
            if (buxVar3.G()) {
                buxVar3.j(afdrVar);
            } else {
                buxVar3.y();
            }
            ?? r12 = this.a;
            int i5 = this.b;
            afeg afegVar = cwb.e;
            byq.c(buxVar3, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVar3, ccxVarN, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVar3, numValueOf, afegVar3);
            afec afecVar2 = cwb.g;
            byq.b(buxVar3, afecVar2);
            afeg afegVar4 = cwb.c;
            byq.c(buxVar3, cfyVarJ, afegVar4);
            czz.am(ggf.a.b(new cjv(cjn.i(0))), bxc.i(-2105417770, true, new bqv(i5, (bym) r12, 11), buxVar3), buxVar3, 56);
            cfy cfyVarR = awd.r(awd.t(cfvVar, null, 3));
            float f3 = gjk.c.k;
            cfy cfyVarI = asl.I(cfyVarR, f3, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA2 = avv.a(atd.g, cfl.n, buxVar3, 54);
            int iG2 = a.g(buxVar3.b());
            ccx ccxVarN2 = buxVar3.N();
            cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarI);
            buxVar3.M();
            buxVar3.w();
            if (buxVar3.G()) {
                buxVar3.j(afdrVar);
            } else {
                buxVar3.y();
            }
            Object obj7 = this.c;
            byq.c(buxVar3, ctpVarA2, afegVar);
            byq.c(buxVar3, ccxVarN2, afegVar2);
            byq.c(buxVar3, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVar3, afecVar2);
            byq.c(buxVar3, cfyVarJ2, afegVar4);
            grh grhVar = (grh) obj7;
            gks.m(grhVar.a, ca.bf(ggh.a(awd.b(asl.I(avy.a.b(cfvVar, 1.0f, true), BitmapDescriptorFactory.HUE_RED, f3), 1.0f), gux.f(buxVar3).a.c, gux.c(buxVar3).C(), 0L, null, null, null, false, false, buxVar3, 0, 252), grhVar.e != null, null), buxVar3, 0);
            asl.A(awd.m(cfvVar, gjk.e.k), buxVar3);
            gks.n(grhVar.c, fD, null, buxVar3, 0);
            buxVar3.n();
            buxVar3.n();
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ nlj(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.a = obj;
        this.c = obj2;
        this.b = i;
    }
}
