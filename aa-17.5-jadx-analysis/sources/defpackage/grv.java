package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.SectionHeader;

/* loaded from: classes2.dex */
public final class grv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v17, types: [cfy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.grw r29, defpackage.cfy r30, defpackage.bux r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grv.a(grw, cfy, bux, int, int):void");
    }

    public static dfw b(int i, bux buxVar) {
        if (i - 1 != 0) {
            buxVar.v(-1397545432);
            dfw dfwVar = czz.av(buxVar).l;
            ((bvv) buxVar).Y(false);
            return dfwVar;
        }
        buxVar.v(651412548);
        dfw dfwVar2 = czz.av(buxVar).k;
        ((bvv) buxVar).Y(false);
        return dfwVar2;
    }

    public static final afeg c(ItemList itemList, geu geuVar) {
        uw onItemVisibilityChangedDelegate = itemList.getOnItemVisibilityChangedDelegate();
        byte[] bArr = null;
        if (onItemVisibilityChangedDelegate != null) {
            return new guk(geuVar, onItemVisibilityChangedDelegate, 10, bArr);
        }
        return null;
    }

    public static final hat d(SectionHeader sectionHeader, geu geuVar) {
        geu geuVar2;
        fzy fzyVarD;
        fzy fzyVarD2;
        CarText title = sectionHeader.getTitle();
        title.getClass();
        CarText subtitle = sectionHeader.getSubtitle();
        CarIcon startIcon = sectionHeader.getStartIcon();
        if (startIcon != null) {
            hao haoVar = new hao(7);
            hao haoVar2 = new hao(8);
            ghw ghwVar = ghw.a;
            ghv ghvVar = ghv.a;
            ghvVar.getClass();
            geuVar2 = geuVar;
            fzyVarD = fxp.d(startIcon, geuVar2, haoVar, haoVar2, ghwVar, ghvVar);
        } else {
            geuVar2 = geuVar;
            fzyVarD = null;
        }
        int startIconType = sectionHeader.getStartIconType();
        CarIcon endIcon = sectionHeader.getEndIcon();
        if (endIcon != null) {
            hao haoVar3 = new hao(9);
            hao haoVar4 = new hao(10);
            ghw ghwVar2 = ghw.a;
            ghv ghvVar2 = ghv.a;
            ghvVar2.getClass();
            fzyVarD2 = fxp.d(endIcon, geuVar2, haoVar3, haoVar4, ghwVar2, ghvVar2);
        } else {
            fzyVarD2 = null;
        }
        uq onClickDelegate = sectionHeader.getOnClickDelegate();
        return new hat(title, subtitle, fzyVarD, startIconType, fzyVarD2, onClickDelegate != null ? new fwc(geuVar2, onClickDelegate, 16) : null);
    }
}
