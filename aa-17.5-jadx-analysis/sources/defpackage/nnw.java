package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class nnw implements afeh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nnw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [bym, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GhIcon ghIcon;
        cjp cjpVar;
        int i = this.c;
        if (i == 0) {
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            int i2 = nny.a;
            ((avx) obj).getClass();
            int i3 = iIntValue & 17;
            if (buxVar.I(i3 != 16, iIntValue & 1)) {
                nnl nnlVar = (nnl) this.a;
                nnk nnkVar = nnlVar.c;
                if ((nnkVar == null || (ghIcon = nnkVar.a) == null) && (ghIcon = nnlVar.b.a) == null) {
                    return afak.a;
                }
                cfy cfyVarG = cjn.g(ca.av(awd.i(cfy.e, ksy.f.i), true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.b, true, 0, 1042431);
                cmw cmwVarF = lgi.f(ghIcon, BitmapDescriptorFactory.HUE_RED, buxVar, 3);
                if (nnlVar.g) {
                    buxVar.v(1666114168);
                    cjpVar = new cjp(ksp.j(krr.C, buxVar), 5);
                    buxVar.o();
                } else {
                    buxVar.v(1666205990);
                    buxVar.o();
                    cjpVar = null;
                }
                ca.bb(cmwVarF, null, cfyVarG, null, null, BitmapDescriptorFactory.HUE_RED, cjpVar, buxVar, 56, 56);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        int i4 = 2;
        if (i == 1) {
            nbl nblVar = (nbl) obj;
            bux buxVar2 = (bux) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            yph yphVar = myi.a;
            nblVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true != buxVar2.C(nblVar) ? 2 : 4;
            }
            if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                ComponentName componentNameA = myi.a(this.b);
                if (componentNameA == null) {
                    buxVar2.v(-692789966);
                    buxVar2.o();
                } else {
                    ?? r0 = this.a;
                    buxVar2.v(-692789965);
                    nblVar.a(((mon) r0.invoke(buxVar2.f(daa.b), componentNameA)).c(), null, false, 0, buxVar2, (iIntValue2 << 12) & 57344, 14);
                    buxVar2.o();
                }
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        if (i == 2) {
            ats atsVar = (ats) obj;
            bux buxVar3 = (bux) obj2;
            int iIntValue3 = ((Integer) obj3).intValue();
            atsVar.getClass();
            if ((iIntValue3 & 6) == 0) {
                iIntValue3 |= true != buxVar3.C(atsVar) ? 2 : 4;
            }
            if (buxVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                Object obj4 = this.a;
                String string = ((Context) this.b).getText(R.string.acknowledgment_button_text).toString();
                boolean zE = buxVar3.E(obj4);
                Object objG = buxVar3.g();
                if (zE || objG == buw.a) {
                    objG = new npz(obj4, i4);
                    buxVar3.x(objG);
                }
                khc.k(null, string, (afdr) objG, ats.a(cfy.e, cfl.l), null, false, null, null, null, null, buxVar3, 6, 0, 8176);
            } else {
                buxVar3.s();
            }
            return afak.a;
        }
        int i5 = 9;
        if (i != 3) {
            if (i != 4) {
                bux buxVar4 = (bux) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ats) obj).getClass();
                if (buxVar4.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    Object obj5 = this.a;
                    Object obj6 = this.b;
                    cfy cfyVarR = awd.r(cfy.e);
                    asx asxVarG = atd.g(gjk.f.k);
                    boolean zE2 = buxVar4.E(obj6) | buxVar4.C(obj5);
                    Object objG2 = buxVar4.g();
                    if (zE2 || objG2 == buw.a) {
                        objG2 = new nje(obj6, obj5, 11);
                        buxVar4.x(objG2);
                    }
                    awx.c(cfyVarR, null, null, asxVarG, null, null, false, null, (afec) objG2, buxVar4, 6, 494);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            }
            bux buxVar5 = (bux) obj2;
            int iIntValue5 = ((Integer) obj3).intValue();
            ((abu) obj).getClass();
            if (buxVar5.I((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                Object obj7 = this.a;
                if (obj7 != null) {
                    buxVar5.v(-634916855);
                    ((Integer) obj7).intValue();
                    ca.bb(dao.b(R.drawable.gs_spark_vd_theme_24, buxVar5, 0), null, awd.i(cfy.e, 16.0f), null, null, BitmapDescriptorFactory.HUE_RED, new cjp(kfn.i(buxVar5).m(), 5), buxVar5, 440, 56);
                    buxVar5.o();
                } else {
                    Object obj8 = this.b;
                    buxVar5.v(-634640583);
                    byd bydVar = (byd) obj8;
                    brp.b(bydVar.e() > 9 ? "9+" : String.valueOf(bydVar.e()), null, kfn.i(buxVar5).m(), 0L, null, 0L, new dkt(3), 0L, 0, false, 0, 0, czz.av(buxVar5).f, buxVar5, 0, 0, 130042);
                    buxVar5.o();
                }
            } else {
                buxVar5.s();
            }
            return afak.a;
        }
        bux buxVar6 = (bux) obj2;
        int iIntValue6 = ((Integer) obj3).intValue();
        ((abu) obj).getClass();
        if (buxVar6.I((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
            Object obj9 = this.a;
            ComponentName componentNameB = ((nqq) obj9).b();
            Object objG3 = buxVar6.g();
            Object obj10 = buw.a;
            if (objG3 == obj10) {
                objG3 = gha.d;
                buxVar6.x(objG3);
            }
            cfy cfyVarA = crh.a(this.b, componentNameB, (PointerInputEventHandler) objG3);
            boolean zE3 = buxVar6.E(obj9);
            Object objG4 = buxVar6.g();
            if (zE3 || objG4 == obj10) {
                objG4 = new npz(obj9, 7);
                buxVar6.x(objG4);
            }
            cfy cfyVarW = afp.w(cfyVarA, null, null, true, null, (afdr) objG4);
            boolean zE4 = buxVar6.E(obj9);
            Object objG5 = buxVar6.g();
            if (zE4 || objG5 == obj10) {
                objG5 = new npz(obj9, 8);
                buxVar6.x(objG5);
            }
            afdr afdrVar = (afdr) objG5;
            boolean zE5 = buxVar6.E(obj9);
            Object objG6 = buxVar6.g();
            if (zE5 || objG6 == obj10) {
                objG6 = new npz(obj9, i5);
                buxVar6.x(objG6);
            }
            lxw.G(cfyVarW, afdrVar, (afdr) objG6, buxVar6, 0);
        } else {
            buxVar6.s();
        }
        return afak.a;
    }

    public /* synthetic */ nnw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
