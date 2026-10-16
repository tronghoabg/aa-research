package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ChipStyle;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.Place;
import java.util.List;

/* loaded from: classes2.dex */
public final class gnz {
    public static final void a(cfy cfyVar, List list, Place place, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1024311679);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(place) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            geu geuVar = (geu) buxVarC.f(gew.a);
            bym bymVarC = byx.c(list, buxVarC);
            boolean zE = buxVarC.E(geuVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new goa(geuVar, i4);
                bvvVar.ad(objS);
            }
            afec afecVar = (afec) objS;
            boolean zC = buxVarC.C(bymVarC) | buxVarC.E(place);
            Object objS2 = bvvVar.S();
            if (zC || objS2 == buw.a) {
                objS2 = new gdg(place, bymVarC, 15, null);
                bvvVar.ad(objS2);
            }
            dmj.b(afecVar, cfyVar, (afec) objS2, buxVarC, (i2 << 3) & 112, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(cfyVar, list, place, i, 16);
        }
    }

    public static final void b(gpb gpbVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1064470293);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gpbVar) : buxVarC.E(gpbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
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
            cfv cfvVar = cfy.e;
            a(awd.c(cfvVar, 1.0f), gpbVar.b, gpbVar.c, buxVarC, 6);
            gvq.g(gpbVar.a, awd.c(cfvVar, 1.0f), buxVarC, 48, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gpbVar, cfyVar, i, 1);
        }
    }

    public static final hak c(GridItem gridItem, geu geuVar) {
        CarProgressBar progressBar;
        uq onClickDelegate = gridItem.getOnClickDelegate();
        gby gbyVarD = null;
        fwc fwcVar = onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 13) : null;
        CarText title = gridItem.getTitle();
        CarText text = gridItem.getText();
        CarIcon image = gridItem.getImage();
        fzw fzwVarE = image != null ? fxi.e(image, geuVar, gridItem.getBadge(), new hao(1)) : null;
        boolean z = gridItem.getImageType() == 1;
        boolean zIsLoading = gridItem.isLoading();
        if (gcx.g(geuVar) && (progressBar = gridItem.getProgressBar()) != null) {
            gbyVarD = fyh.d(progressBar);
        }
        return new hak(title, text, fzwVarE, z, fwcVar, zIsLoading, gbyVarD, gridItem.isIndexable());
    }

    public static final haj d(ChipStyle chipStyle) {
        return new haj(chipStyle.getBackgroundColor(), chipStyle.getContentColor(), chipStyle.getOutlineColor(), chipStyle.getShape());
    }
}
