package defpackage;

import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class hdo {
    public static void a(hdp hdpVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-387883834);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hdpVar) : buxVarC.E(hdpVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            long jC = gux.c(buxVarC).C();
            ctp ctpVarB = atk.b(cfl.e, false);
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
            String str = hdpVar.a;
            cfy cfyVarT = awd.t(afp.E(awd.d(cfy.e, gux.g(buxVarC).c.c), jC, bcr.a), null, 3);
            hir hirVar = gux.e(buxVarC).c;
            cfy cfyVarI = asl.I(cfyVarT, 8.0f, BitmapDescriptorFactory.HUE_RED);
            long jI = gux.c(buxVarC).I();
            dfw dfwVar = czz.av(buxVarC).m;
            if (str == null) {
                str = "";
            }
            buxVar2 = buxVarC;
            brp.b(str, cfyVarI, jI, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfwVar, buxVar2, 0, 0, 131064);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hdpVar, cfyVar, i, 12);
        }
    }

    public static void b(cfy cfyVar, gcq gcqVar, gcq gcqVar2, afeg afegVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        int i3;
        boolean z;
        bvv bvvVar;
        afegVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1184076892);
        if (i4 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gcqVar) : buxVarC.E(gcqVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(gcqVar2) : buxVarC.E(gcqVar2)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            hir hirVar = gux.e(buxVarC).c;
            hir hirVar2 = gux.e(buxVarC).c;
            cfy cfyVarI = asl.I(cfyVar, 32.0f, 4.0f);
            hir hirVar3 = gux.e(buxVarC).c;
            ctp ctpVarA = atp.a(atd.i(12.0f, cfl.n), cfl.k, buxVarC, 48);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
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
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (gcqVar != null) {
                buxVarC.v(1414316378);
                i3 = i2;
                bvvVar = bvvVar2;
                z = false;
                fzc.g(gcqVar, null, 1, 0, 0L, czz.av(buxVarC).g, 0L, null, 2, 0, null, null, null, false, false, buxVarC, ((i2 >> 3) & 14) | 100663688, 0, 65242);
                buxVar2 = buxVarC;
                bvvVar.Y(false);
            } else {
                i3 = i2;
                buxVar2 = buxVarC;
                z = false;
                bvvVar = bvvVar2;
                buxVar2.v(1414478012);
                bvvVar.Y(false);
            }
            afegVar.invoke(buxVar2, Integer.valueOf((i3 >> 9) & 14));
            if (gcqVar2 != null) {
                buxVar2.v(1414538834);
                bux buxVar3 = buxVar2;
                fzc.g(gcqVar2, null, 2, 0, 0L, czz.av(buxVar2).l, 0L, null, 2, 3, null, null, null, false, false, buxVar3, ((i3 >> 6) & 14) | 100663688, 0, 64730);
                buxVar2 = buxVar3;
                bvvVar.Y(z);
            } else {
                buxVar2.v(1414738908);
                bvvVar.Y(z);
            }
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(cfyVar, gcqVar, gcqVar2, afegVar, i, 6, null);
        }
    }

    public static void e(Context context, hrt hrtVar, hsn hsnVar, List list, idu iduVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            idw idwVar = (idw) it.next();
            try {
                idwVar.registerComponents(context, hrtVar, hsnVar);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(idwVar.getClass().getName())), e);
            }
        }
        if (iduVar != null) {
            iduVar.registerComponents(context, hrtVar, hsnVar);
        }
    }

    public final hsq c(afec afecVar, afec afecVar2) {
        afecVar.getClass();
        afecVar2.getClass();
        if (this instanceof htj) {
            throw null;
        }
        if (!(this instanceof htk)) {
            return (hsq) afecVar2.invoke(null);
        }
        return (hsq) afecVar.invoke(Integer.valueOf(R.drawable.media_suggestion_album_art_placeholder));
    }

    public final afeg d() {
        if (this instanceof hti) {
            return ((hti) this).a;
        }
        return null;
    }
}
