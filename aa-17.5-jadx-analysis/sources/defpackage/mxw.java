package defpackage;

import android.content.Context;
import android.support.v4.app.Fragment;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class mxw implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mxw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kkf] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, wa] */
    /* JADX WARN: Type inference failed for: r2v18, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        cfy cfyVarD;
        long jZ;
        GhIcon ghIcon;
        cct cctVarI = null;
        Object[] objArr = 0;
        int i = 2;
        int i2 = 3;
        switch (this.c) {
            case 0:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = iIntValue & 3;
                int i4 = iIntValue & 1;
                yph yphVar = myi.a;
                if (buxVar.I(i3 != 2, i4)) {
                    ?? r2 = this.b;
                    ?? r0 = this.a;
                    if (myi.g(r0).toMillis() > 0) {
                        strH = myi.h(myi.f(r2), myi.g(r0)) + " / " + myi.h(myi.g(r0), myi.g(r0));
                    } else {
                        strH = myi.h(myi.f(r2), null);
                    }
                    brp.b(strH, null, kfn.i(buxVar).R(), 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVar).l, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 16777151), buxVar, 0, 0, 131066);
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 1:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i5 = iIntValue2 & 3;
                int i6 = iIntValue2 & 1;
                yph yphVar2 = myi.a;
                if (buxVar2.I(i5 != 2, i6)) {
                    myi.S(myi.b(this.a), myi.d(this.b), null, buxVar2, 0);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 2:
                bux buxVar3 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    Object obj3 = this.a;
                    Object obj4 = this.b;
                    bvf bvfVar = bnm.a;
                    czz.am(bvfVar.b(new cjv(cjv.h(((cjv) buxVar3.f(bvfVar)).a, obj4 != null ? 1.0f : 0.38f))), bxc.i(-387536449, true, new njg(obj3, 5), buxVar3), buxVar3, 56);
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 3:
                bux buxVar4 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (this.b == null) {
                        cfyVarD = cfy.e;
                    } else {
                        cfv cfvVar = cfy.e;
                        ksy ksyVar = nly.a;
                        cfyVarD = awd.d(cfvVar, 37.0f);
                    }
                    lvl.V(this.a, cfyVarD, buxVar4, 0);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 4:
                bux buxVar5 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    bvf bvfVar2 = bnm.a;
                    czz.am(bvfVar2.b(new cjv(cjv.h(((cjv) buxVar5.f(bvfVar2)).a, true == (obj6 instanceof kkc) ? 1.0f : 0.38f))), bxc.i(915918670, true, new mxw(obj6, obj5, i2), buxVar5), buxVar5, 56);
                    lvl.R((nko) obj5, buxVar5, 0);
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 5:
                return lws.s(this.a, this.b, (bux) obj, ((Integer) obj2).intValue());
            case 6:
                return lws.s(this.a, this.b, (bux) obj, ((Integer) obj2).intValue());
            case 7:
                bux buxVar6 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    Context context = ((Fragment) this.b).getContext();
                    if (context == null) {
                        buxVar6.v(624735232);
                    } else {
                        Object obj7 = this.a;
                        buxVar6.v(624735233);
                        ((owj) obj7).b(context, buxVar6, 0);
                    }
                    buxVar6.o();
                } else {
                    buxVar6.s();
                }
                return afak.a;
            case 8:
                bux buxVar7 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    Object obj8 = this.b;
                    boolean zE = buxVar7.E(obj8);
                    Object objG = buxVar7.g();
                    if (zE || objG == buw.a) {
                        objG = new npz(obj8, i2);
                        buxVar7.x(objG);
                    }
                    Object obj9 = this.a;
                    fww.A((afdr) objG, null, nql.a, bxc.i(-1883623618, true, new njt(obj9, i2), buxVar7), bxc.i(-2001260387, true, new njt(obj9, 4), buxVar7), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, bxc.i(1823159833, true, new nnw(obj9, obj8, i, objArr == true ? 1 : 0), buxVar7), buxVar7, 100691328);
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 9:
                bux buxVar8 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    Object obj10 = this.b;
                    nwr nwrVar = (nwr) obj10;
                    CarIcon carIcon = nwrVar.l;
                    int i7 = 7;
                    if (carIcon != null) {
                        buxVar8.v(63251172);
                        cctVarI = bxc.i(-1486130249, true, new njt(carIcon, 6), buxVar8);
                        buxVar8.o();
                    } else if (nwrVar.k != null) {
                        buxVar8.v(63632999);
                        cctVarI = bxc.i(-1573836626, true, new njt(obj10, i7), buxVar8);
                        buxVar8.o();
                    } else {
                        buxVar8.v(63970372);
                        buxVar8.o();
                    }
                    GhIcon ghIcon2 = nwrVar.j;
                    ckv ckvVar = (nwrVar.i == nuo.h && carIcon == null && ((ghIcon = nwrVar.k) == null || ghIcon.b != 7) && ghIcon != null) ? ckq.a : bcr.a;
                    if (this.a != null) {
                        buxVar8.v(64796243);
                        buxVar8.o();
                        jZ = cjn.i(0);
                    } else {
                        buxVar8.v(64877308);
                        jZ = kfn.i(buxVar8).z();
                        buxVar8.o();
                    }
                    mcd.i(cctVarI, ghIcon2, null, ckvVar, BitmapDescriptorFactory.HUE_RED, 0L, 0L, jZ, false, 0L, false, buxVar8, 0, 0, 1908);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 10:
                mlq.t((axr) this.a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), this.b);
                return afak.a;
            case 11:
                List list = (List) obj;
                list.getClass();
                return thn.c(list, (thl) obj2, this.b, (Action) this.a);
            default:
                afcm afcmVar = (afcm) obj2;
                ((afak) obj).getClass();
                afcmVar.getClass();
                afft afftVar = (afft) this.a;
                int i8 = afftVar.a;
                afftVar.a = i8 + 1;
                ((afco[]) this.b)[i8] = afcmVar;
                return afak.a;
        }
    }

    public /* synthetic */ mxw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
