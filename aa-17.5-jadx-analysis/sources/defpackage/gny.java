package defpackage;

import androidx.car.app.model.Background;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarText;
import androidx.car.app.model.CondensedItem;
import androidx.car.app.model.CondensedItemStyle;
import androidx.car.app.model.Shape;

/* loaded from: classes2.dex */
public final class gny {
    public static final float a(hjo hjoVar) {
        return hjoVar.a == hjn.c ? 520.0f : 480.0f;
    }

    public static final void b(hju hjuVar, cfy cfyVar, bux buxVar, int i, int i2) {
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(580595672);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                cfyVar = cfy.e;
            }
            bcm bcmVar = gux.f(buxVarC).a.d;
            hjo hjoVar = (hjo) buxVarC.f(hjp.a);
            vy.a(awd.u(awd.n(awd.e(cfyVar, Float.NaN, ((dlj) ady.a(hjoVar.b == hjm.c ? 800.0f : 600.0f, null, "mapCardMaxHeight", null, buxVarC, 384, 10).a()).a), Float.NaN, ((dlj) ady.a(a(hjoVar), null, "mapCardMaxWidth", null, buxVarC, 384, 10).a()).a), cfl.a, 2), bcmVar, vs.c(gux.c(buxVarC).P(), 0L, buxVarC, 14), fxa.h(), afp.B(2.0f, gux.c(buxVarC).B()), bxc.i(882186022, true, new bol(hjuVar, 10), buxVarC), buxVarC, 196608, 0);
            buxVarC = buxVarC;
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(hjuVar, cfyVar2, i, i2, 4);
        }
    }

    public static final void c(hga hgaVar, hge hgeVar, hgc hgcVar, hju hjuVar, cfy cfyVar, hju hjuVar2, hju hjuVar3, hju hjuVar4, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1248045043);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.A(hgcVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? buxVarC.C(hjuVar2) : buxVarC.E(hjuVar2)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? buxVarC.C(hjuVar3) : buxVarC.E(hjuVar3)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != ((16777216 & i) == 0 ? buxVarC.C(hjuVar4) : buxVarC.E(hjuVar4)) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            ca.at(awd.c(cfyVar, 1.0f), null, bxc.i(685863133, true, new kks(hgeVar, hgaVar, hgcVar, hjuVar, hjuVar2, hjuVar3, hjuVar4, 1), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gnx(hgaVar, hgeVar, hgcVar, hjuVar, cfyVar, hjuVar2, hjuVar3, hjuVar4, i, 0);
        }
    }

    public static final void d(gpa gpaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-854342789);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gpaVar) : buxVarC.E(gpaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 18;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            czz.am(ggf.a.b(new cjv(gux.c(buxVarC).P())), bxc.i(-1125726149, true, new bmc(gpaVar, cfyVar, i4, null), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(gpaVar, cfyVar, i, 20, null);
        }
    }

    public static final void e(hga hgaVar, hge hgeVar, hju hjuVar, cfy cfyVar, gbg gbgVar, afdr afdrVar, gva gvaVar, hju hjuVar2, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        cct cctVarI;
        boolean z;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1529089239);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hgaVar) : buxVarC.E(hgaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hgeVar) : buxVarC.E(hgeVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 1024 : 2048;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? buxVarC.C(gvaVar) : buxVarC.E(gvaVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != ((16777216 & i) == 0 ? buxVarC.C(hjuVar2) : buxVarC.E(hjuVar2)) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            int i4 = i2 << 6;
            int i5 = i2 & 112;
            int i6 = (i2 >> 9) & 14;
            int i7 = i4 & 896;
            if (hjuVar instanceof hky) {
                buxVarC.v(674906287);
                hdt.k(cfyVar2, hgeVar, hgaVar, bxc.i(-989288293, true, new bly(hjuVar, 15), buxVarC), buxVarC, i6 | 3072 | i5 | i7);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(675216845);
                cct cctVarI2 = null;
                if (gvaVar == null) {
                    buxVarC.v(675366450);
                    ((bvv) buxVarC).Y(false);
                    cctVarI = null;
                } else {
                    buxVarC.v(675366451);
                    cctVarI = bxc.i(-1889892688, true, new bly(gvaVar, 16), buxVarC);
                    ((bvv) buxVarC).Y(false);
                }
                int i8 = 17;
                if (cctVarI == null) {
                    buxVarC.v(675419926);
                    buxVarC.v(675419926);
                    cctVarI = bxc.i(900440143, true, new bmc(gbgVar, afdrVar, i8), buxVarC);
                    bvvVar = (bvv) buxVarC;
                    z = false;
                    bvvVar.Y(false);
                } else {
                    z = false;
                    buxVarC.v(575975115);
                    bvvVar = (bvv) buxVarC;
                }
                bvvVar.Y(z);
                if (hjuVar2 == null) {
                    buxVarC.v(675532796);
                    ((bvv) buxVarC).Y(z);
                } else {
                    buxVarC.v(675532797);
                    cctVarI2 = bxc.i(-534896819, true, new bly(hjuVar2, i8), buxVarC);
                    ((bvv) buxVarC).Y(z);
                }
                hdt.e(cfyVar, hgeVar, hgaVar, cctVarI, cctVarI2, buxVarC, i6 | i5 | i7, 0);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(z);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gnx(hgaVar, hgeVar, hjuVar, cfyVar, gbgVar, afdrVar, gvaVar, hjuVar2, i, 2);
        }
    }

    public static final void f(cfy cfyVar, gbg gbgVar, afdr afdrVar, bux buxVar, int i) {
        bux buxVar2;
        cfy cfyVar2;
        bux buxVarC = buxVar.c(-2064603313);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfv cfvVar = cfy.e;
            fwy fwyVar = new fwy(null, gbgVar, afdrVar, true, new hjw(gux.c(buxVarC).P(), gux.c(buxVarC).P()), false, null);
            cfy cfyVarR = awd.r(cfvVar);
            ctp ctpVarA = avv.a(atd.a, cfl.m, buxVarC, 6);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVar2 = buxVarC;
            fww.c(fwyVar, null, fwx.f, null, null, null, null, false, null, null, buxVar2, fwy.a | 384, 1018);
            bvvVar.Y(true);
            cfyVar2 = cfvVar;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(cfyVar2, gbgVar, afdrVar, i, 15, (char[]) null);
        }
    }

    public static final haf g(CondensedItem condensedItem, geu geuVar) {
        geu geuVar2;
        gag gagVarA;
        gag gagVarA2;
        Background background;
        CarText title = condensedItem.getTitle();
        CarText text = condensedItem.getText();
        CarIcon leadingImage = condensedItem.getLeadingImage();
        if (leadingImage != null) {
            ghw ghwVar = ghw.a;
            ghv ghvVar = ghv.a;
            ghvVar.getClass();
            geuVar2 = geuVar;
            gagVarA = gai.a(leadingImage, geuVar2, ghwVar, ghvVar, null, 8);
        } else {
            geuVar2 = geuVar;
            gagVarA = null;
        }
        int i = i(condensedItem.getLeadingImageType());
        CarIcon trailingImage = condensedItem.getTrailingImage();
        if (trailingImage != null) {
            ghw ghwVar2 = ghw.a;
            ghv ghvVar2 = ghv.a;
            ghvVar2.getClass();
            gagVarA2 = gai.a(trailingImage, geuVar2, ghwVar2, ghvVar2, null, 8);
        } else {
            gagVarA2 = null;
        }
        int i2 = i(condensedItem.getTrailingImageType());
        CondensedItemStyle style = condensedItem.getStyle();
        Shape shape = style != null ? style.getShape() : null;
        CondensedItemStyle style2 = condensedItem.getStyle();
        fyj fyjVarB = (style2 == null || (background = style2.getBackground()) == null) ? null : fyh.b(background, geuVar2);
        CarProgressBar progressBar = condensedItem.getProgressBar();
        gby gbyVarD = progressBar != null ? fyh.d(progressBar) : null;
        uq onClickDelegate = condensedItem.getOnClickDelegate();
        return new haf(title, text, gagVarA, i, gagVarA2, i2, shape, fyjVarB, gbyVarD, onClickDelegate != null ? new fwc(geuVar2, onClickDelegate, 11) : null, condensedItem.isIndexable());
    }

    public static /* synthetic */ String h(int i) {
        return i != 1 ? i != 2 ? "LARGE" : "SMALL" : "ICON";
    }

    private static final int i(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new IllegalArgumentException(a.bp(i, "Unknown CondensedItem image type: "));
            }
        }
        return i2;
    }
}
