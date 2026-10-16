package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class hdb {
    public static final void a(hdc hdcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        gcb gcbVar;
        afeg afegVar;
        afeg afegVar2;
        afeg afegVar3;
        afec afecVar;
        afeg afegVar4;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(192171260);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hdcVar) : buxVarC.E(hdcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarI = asl.I(cfyVar, gux.e(buxVarC).a.d, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar5 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar5);
            afeg afegVar6 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar6);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar7 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar7);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar8 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar8);
            gcb gcbVar2 = hdcVar.b;
            if (gcbVar2 == null) {
                buxVarC.v(-1157265055);
                bvvVar.Y(false);
                gcbVar = gcbVar2;
                afegVar4 = afegVar6;
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                afegVar = afegVar5;
                afegVar3 = afegVar8;
            } else {
                buxVarC.v(-1157265054);
                cfv cfvVar = cfy.e;
                cfy cfyVarD = awd.d(awd.r(cfvVar), gux.g(buxVarC).c.c);
                ctp ctpVarB = atk.b(cfl.e, false);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarD);
                buxVarC.w();
                gcbVar = gcbVar2;
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, afegVar5);
                byq.c(buxVarC, ccxVarAh2, afegVar6);
                byq.c(buxVarC, Integer.valueOf(iG2), afegVar7);
                byq.b(buxVarC, afecVar2);
                byq.c(buxVarC, cfyVarJ2, afegVar8);
                cfy cfyVarR = awd.r(cfvVar);
                afegVar = afegVar5;
                afegVar2 = afegVar7;
                afegVar3 = afegVar8;
                afecVar = afecVar2;
                afegVar4 = afegVar6;
                gca.a(gcbVar, cfyVarR, 0, buxVarC, 48, 4);
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
            List list = hdcVar.a;
            if (list.isEmpty()) {
                z = true;
                buxVarC.v(-1156319492);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1156958743);
                float f = gjk.d.k;
                float f2 = gcbVar != null ? f : BitmapDescriptorFactory.HUE_RED;
                asx asxVarG = atd.g(f);
                cfv cfvVar2 = cfy.e;
                cfy cfyVarJ3 = asl.J(cfvVar2, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                ctp ctpVarA2 = avv.a(asxVarG, cfl.m, buxVarC, 0);
                int iG3 = a.g(bvvVar.u);
                ccx ccxVarAh3 = bvvVar.ah();
                cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarJ3);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA2, afegVar);
                byq.c(buxVarC, ccxVarAh3, afegVar4);
                byq.c(buxVarC, Integer.valueOf(iG3), afegVar2);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ4, afegVar3);
                avy avyVar = avy.a;
                buxVarC.v(-22427748);
                Iterator it = list.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    int i5 = i4 + 1;
                    gvq.g((hju) it.next(), i4 == 2 ? awd.m(cfvVar2, 112.0f) : avyVar.b(cfvVar2, 1.0f, true), buxVarC, 0, 0);
                    i4 = i5;
                }
                z = true;
                bvvVar.Y(false);
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
            bvvVar.Y(z);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hdcVar, cfyVar, i, 7);
        }
    }

    public static final void b(final gcq gcqVar, final long j, final gcq gcqVar2, final long j2, final cfy cfyVar, bux buxVar, final int i) {
        int i2;
        bux buxVar2;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(337285752);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gcqVar) : buxVarC.E(gcqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(gcqVar2) : buxVarC.E(gcqVar2)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.B(j2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            hir hirVar = gux.e(buxVarC).c;
            cfy cfyVarJ = asl.J(cfyVar, 4.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            hir hirVar2 = gux.e(buxVarC).c;
            ctp ctpVarA = atp.a(atd.g(4.0f), cfl.j, buxVarC, 0);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            int i4 = i2;
            fzc.g(gcqVar, null, 1, 0, j, czz.av(buxVarC).h, 0L, null, 0, 0, null, null, null, false, false, buxVarC, (i2 & 14) | 392 | ((i2 << 9) & 57344), 196608, 32714);
            buxVar2 = buxVarC;
            if (gcqVar2 != null) {
                buxVar2.v(351420789);
                fzc.g(gcqVar2, null, 1, 0, j2, czz.av(buxVar2).l, 0L, null, 0, 0, null, null, null, false, false, buxVar2, ((i4 >> 6) & 14) | 392 | ((i4 << 3) & 57344), 196608, 32714);
                buxVar2 = buxVar2;
                bvvVar = bvvVar2;
                bvvVar.Y(false);
            } else {
                bvvVar = bvvVar2;
                buxVar2.v(351610292);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: hda
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    gcq gcqVar3 = gcqVar;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    hdb.b(gcqVar3, j, gcqVar2, j2, cfyVar, buxVar3, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? "COMPLETE" : "ACTIVE" : "INACTIVE";
    }

    public static CarIcon d(Context context, CharSequence charSequence) {
        Resources resources = context.getResources();
        String string = charSequence == null ? "" : charSequence.toString();
        gnb gnbVar = new gnb(resources);
        gnbVar.b(string, string);
        gnbVar.c();
        return new CarIcon(new tj(IconCompat.k(gnbVar.a(resources.getDimensionPixelSize(R.dimen.conversation_item_default_avatar_size)))));
    }

    public static void e(geu geuVar) {
        int iC = geuVar.i().c();
        if (iC < 7) {
            throw new UnsupportedOperationException(String.format(Locale.US, "API version 7+ is required to use ConversationItem (current API level: %d)", Integer.valueOf(iC)));
        }
        if (!geuVar.d().c().contains("androidx.car.app.category.MESSAGING")) {
            throw new UnsupportedOperationException(String.format(Locale.US, "Must declare category `androidx.car.app.category.MESSAGING` in the service intentfilter to use ConversationItem (package:%s)", ((gmh) geuVar.d()).a));
        }
    }
}
