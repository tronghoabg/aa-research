package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gur {
    public static final void a(gus gusVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1870871310);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gusVar) : buxVarC.E(gusVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gui.b(asl.I(gui.d(cfyVar, true, buxVarC, 0), gjk.d.k, gjk.c.k), atd.e, null, bxc.i(-774797572, true, new guq(gusVar, i4), buxVarC), buxVarC, 3120, 4);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(gusVar, cfyVar, i, 3, null);
        }
    }

    public static final void b(cfy cfyVar, hcl hclVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(284861088);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.C(cfyVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hclVar) : buxVarC.E(hclVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            hbx.b(hclVar, atn.a.a(awd.u(cfy.e, null, 3), cfl.e), null, null, buxVarC, ((i2 >> 3) & 14) | 8, 12);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(cfyVar, hclVar, z, i, 0);
        }
    }

    public static final void c(hju hjuVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-854535418);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfv cfvVar = cfy.e;
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (hjuVar == null) {
                buxVarC.v(-619666725);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-619666724);
                xb.a(null, BitmapDescriptorFactory.HUE_RED, 0L, buxVarC, 0, 7);
                gvq.g(hjuVar, cfyVar, buxVarC, i2 & 112, 0);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(hjuVar, cfyVar, i, 9, null);
        }
    }

    public static final void d(cil cilVar, gvr gvrVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1235293290);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cilVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gvrVar) : buxVarC.E(gvrVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 14;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 4 || objS == buw.a) {
                objS = new giy(cilVar, (afck) null, 2, (byte[]) null);
                bvvVar.ad(objS);
            }
            bvq.g(gvrVar, (afeg) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(cilVar, gvrVar, i, 10);
        }
    }

    public static final void e(gvr gvrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1647778746);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gvrVar) : buxVarC.E(gvrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            cil cilVar = (cil) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new cil();
                bvvVar.ad(objS2);
            }
            cil cilVar2 = (cil) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new cil();
                bvvVar.ad(objS3);
            }
            cil cilVar3 = (cil) objS3;
            cil cilVar4 = true != gvrVar.a() ? cilVar2 : cilVar3;
            czz.am(gfl.a.b(gfl.a(gvrVar.a != null, buxVarC)), bxc.i(1722548346, true, new gvp(gvrVar, cilVar, cilVar2, cilVar3, 0), buxVarC), buxVarC, 56);
            d(cilVar4, gvrVar, buxVarC, ((i2 << 3) & 112) | 64);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(gvrVar, cfyVar, i, 11, null);
        }
    }

    public static final hio f(Object obj) {
        Map map = hio.a;
        Object hioVar = map.get(obj);
        if (hioVar == null) {
            hioVar = new hio();
            map.put(obj, hioVar);
        }
        return (hio) hioVar;
    }

    public static final boolean g() {
        Map map = hio.a;
        String str = Build.FINGERPRINT;
        str.getClass();
        if (afyh.u(str, "robolectric", false)) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 29 ? ActivityManager.isRunningInUserTestHarness() : ActivityManager.isRunningInTestHarness();
    }

    public static final hik h(geu geuVar, PaneTemplate paneTemplate, boolean z) {
        paneTemplate.getClass();
        Pane pane = paneTemplate.getPane();
        CarIcon image = pane.getImage();
        hih hihVar = new hih(geuVar);
        hihVar.c = new ArrayList(pane.getRows());
        hihVar.e = image != null ? 192 : 128;
        hihVar.m = pane.getImage();
        hihVar.i = pane.isLoading();
        hihVar.f = ghz.b;
        hihVar.j = z;
        hii hiiVar = new hii(hihVar);
        List<Action> actions = paneTemplate.getPane().getActions();
        ghu.a.getClass();
        return new hik(paneTemplate, hiiVar, actions, null, paneTemplate.getHeader());
    }

    public static /* synthetic */ hik i(geu geuVar, gmp gmpVar, boolean z, Action action, Action action2, ghz ghzVar, int i) {
        hih hihVarD;
        if ((i & 32) != 0) {
            ghzVar = ghz.d;
        }
        gmpVar.getClass();
        ghzVar.getClass();
        if (gmpVar.a) {
            hihVarD = guo.e(geuVar, afbe.a);
            hihVarD.i = true;
        } else {
            ItemList itemList = gmpVar.b;
            hihVarD = itemList != null ? guo.d(geuVar, itemList) : guo.e(geuVar, gmpVar.b());
        }
        if ((i & 8) != 0) {
            action = null;
        }
        hihVarD.j = z;
        if (action != null) {
            hihVarD.e = 28;
            hihVarD.l = action.getTitle();
            uq onClickDelegate = action.getOnClickDelegate();
            if (onClickDelegate != null) {
                hihVarD.g = new hhw(geuVar, onClickDelegate, 6);
            }
        }
        if ((i & 16) != 0) {
            action2 = null;
        }
        hihVarD.f = ghzVar;
        hihVarD.a();
        hihVarD.q = action2;
        hii hiiVar = new hii(hihVarD);
        List listA = gmpVar.a();
        ghu.a.getClass();
        return new hik(gmpVar, hiiVar, null, listA, gmpVar.c);
    }
}
