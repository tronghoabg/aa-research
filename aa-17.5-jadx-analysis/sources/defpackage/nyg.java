package defpackage;

import com.google.android.projection.gearhead.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nyg extends kmh {
    private static final Map b(bym bymVar) {
        return (Map) bymVar.a();
    }

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(598953050);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = mpd.b();
                bvvVar.ad(objS);
            }
            objS.getClass();
            bym bymVarF = bxc.f(((mpd) objS).h, afbf.a, buxVarC);
            boolean zC = buxVarC.C(b(bymVarF));
            Object objS2 = bvvVar.S();
            if (zC || objS2 == obj) {
                Collection collectionValues = b(bymVarF).values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z = false;
                    objS2 = Boolean.valueOf(z);
                    bvvVar.ad(objS2);
                } else {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (affa.f(((mqc) it.next()).a().getPackageName(), "com.google.android.projection.gearhead.pctsverifier")) {
                            break;
                        }
                    }
                    z = false;
                    objS2 = Boolean.valueOf(z);
                    bvvVar.ad(objS2);
                }
            }
            boolean zBooleanValue = ((Boolean) objS2).booleanValue();
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                dlj dljVar = new dlj(requireContext().getResources().getInteger(R.integer.coolwalk_rounded_corner_radius));
                bvvVar.ad(dljVar);
                objS3 = dljVar;
            }
            float f = ((dlj) objS3).a;
            cfy cfyVarC = awd.c(cfy.e, 1.0f);
            if (zBooleanValue) {
                buxVarC.v(2116705546);
            } else {
                buxVarC.v(2116746249);
                cfyVarC = afp.D(cfyVarC, 1.0f, cjv.h(kfn.i(buxVarC).z(), 1.0f), bcr.b(f));
            }
            bvvVar.Y(false);
            atk.c(cfyVarC, buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(this, i, 3);
        }
    }
}
